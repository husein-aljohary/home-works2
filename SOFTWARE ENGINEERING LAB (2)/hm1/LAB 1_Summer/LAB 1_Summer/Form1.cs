using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace LAB_1_Summer
{
    public partial class Form1 : Form
    {
        MYTEXT obj;
        public Form1()
        {
            InitializeComponent();
            obj = new MYTEXT(textBox1.Text);
        }

        private void Form1_Load(object sender, EventArgs e)
        {

        }

        private void Analyzebutton_Click(object sender, EventArgs e)
        {
            textBox2.Text = obj.ToString();
        }

        private void button1_Click(object sender, EventArgs e)
        {
            foreach (string S in obj.Words)
            {
                listBox1.Items.Add(S);
            }
        }

        
    }
}
