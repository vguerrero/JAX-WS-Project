using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Windows.Forms;

namespace JAX_WS_CLiente_Net
{
    public partial class Form1 : Form
    {
        public Form1()
        {
            InitializeComponent();
        }

        private void button1_Click(object sender, EventArgs e)
        {
            try
            {
                ServiceReference1.HelloWorldClient clienteNet = new ServiceReference1.HelloWorldClient();
                string result = clienteNet.getHelloWorldAsString(this.textBox1.Text);
                MessageBox.Show("EL servicio JAX-WS devuelve: " + result.ToString());
            }
            catch (Exception ex)
            {
                MessageBox.Show("Error al conectarse " + ex.Message);
            }
        }
    }
}
