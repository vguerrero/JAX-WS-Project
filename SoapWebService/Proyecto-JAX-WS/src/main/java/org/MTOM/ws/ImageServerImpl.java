package org.MTOM.ws;
 
import java.awt.Image;
import java.io.File;
import java.io.IOException;
 
import javax.imageio.ImageIO;
import javax.jws.WebService;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.soap.MTOM;
import java.awt.image.BufferedImage;
 
//Service Implementation Bean
@MTOM
@WebService(endpointInterface = "org.MTOM.ws.ImageServer")
public class ImageServerImpl implements ImageServer{
 
	@Override
	public Image downloadImage(String name) {
 
		try {
 
			File image = new File("e:\\images\\" + name);
			return ImageIO.read(image);
 
		} catch (IOException e) {
			System.out.print("Se estallo downloadImage");
			e.printStackTrace();
			return null; 
 
		}
	}
 
	@Override
	public String uploadImage(Image data)   {
		try{
			if(data!=null){
				//store somewhere
				BufferedImage b = (BufferedImage) data;
				ImageIO.write(b, "png",new File("e:\\images\\out\\rss.png"));
				System.out.print("Upload Successful");
				return "Upload Successful";
			}
			else {
				return "uploadImage! Image data is null"; 
			}
		}
		catch(Exception ex){
			return "Error en uploadImage : " + ex.getMessage();
		}
 	}
 
}