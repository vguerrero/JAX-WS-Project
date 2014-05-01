package org.MTOM.ws.cliente;
 
import java.awt.Image;
import java.io.File;
import java.net.URL;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.xml.namespace.QName;
import javax.xml.ws.BindingProvider;
import javax.xml.ws.Service;
import javax.xml.ws.soap.MTOMFeature;
import javax.xml.ws.soap.SOAPBinding;
import java.util.Scanner;
 
import org.MTOM.ws.ImageServer;
 
public class ImageClient{
 
	public static void main(String[] args) throws Exception {
	try{
			URL url = new URL("http://localhost:9999/ws/image?wsdl");
			QName qname = new QName("http://ws.MTOM.org/", "ImageServerImplService");
	 
			Service service = Service.create(url, qname);
			ImageServer imageServer = service.getPort(ImageServer.class);
			
			Scanner teclado = new Scanner(System.in);
			System.out.println("para descargar presione d para subir u");
			String opcion = teclado.nextLine();
			System.out.println("usted selecciono la opcion: "+ opcion );
			if(opcion.equals("d")){
			//para probar descargar
				/************  test download  ***************/
				Image image = imageServer.downloadImage("rss.png");
		 
				//display it in frame
				JFrame frame = new JFrame();
				frame.setSize(300, 300);
				JLabel label = new JLabel(new ImageIcon(image));
				frame.add(label);
				frame.setVisible(true);
		 
				System.out.println("imageServer.downloadImage() : Download Successful!");
			}
			//para probar upload
			else if (opcion.equals("u")){
				 /************  test upload ****************/
				Image imgUpload = ImageIO.read(new File("e:\\images\\vansubir\\rss.png"));//directorio de donde se va a subir el archivo
		 
				//enable MTOM in client
				BindingProvider bp = (BindingProvider) imageServer;
				SOAPBinding binding = (SOAPBinding) bp.getBinding();
				binding.setMTOMEnabled(true);
		 
				String status = imageServer.uploadImage(imgUpload);
				System.out.println("imageServer.uploadImage() : " + status);
			}
	 }
	 catch(Exception ex){
	  System.out.println("Se estallo ImageClient: " + ex.getMessage());
	 }
    }
 
}