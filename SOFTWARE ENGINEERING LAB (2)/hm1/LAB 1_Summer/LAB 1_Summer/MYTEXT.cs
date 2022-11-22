using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace LAB_1_Summer
{
    class MYTEXT
    {
        public override string ToString()
        {
            return "Number Of Letters = " + Letters + Environment.NewLine +
                "Number Of Uppers = " + Upper + Environment.NewLine +
                "Number Of Lines = " + Lines + Environment.NewLine +
                "Number Of Dates = " + NUMOfDates;
        }
        string txt;

        public string Txt
        {
            get { return txt; }
            set { txt = value; }
        }
        public MYTEXT(string s)
        {
            txt = s;
        }
        public int Letters
        {
            get
            {
                int count = 0;
                for (int i = 0; i < txt.Length; i++)
                {
                    if (char.IsLetter(txt[i]))
                        count++;
                }
                return count;
            }
        }
        public int Upper
        {
            get
            {
                int count = 0;
                for (int i = 0; i < txt.Length; i++)
                {
                    if (char.IsUpper(txt[i]))
                        count++;
                }
                return count;
            }
        }
        public int Lines
        {
            get
            {
                string[] LINES = txt.Split(new char[] { '\n', '\r' },StringSplitOptions.RemoveEmptyEntries);
                return LINES.Length;

            }
        }
        public int NUMOfDates
        {
            get
            {
                int A;
                double B;
                DateTime C;
                int Counter3=0;
                int counter = 0;
                int counter2 = 0;
                string[] Parts = txt.Split(new char[] { ' ', '\t', '\n', '\r' }, StringSplitOptions.RemoveEmptyEntries);
                foreach (string Item in Parts)
                {
                    if (int.TryParse(Item, out A))
                    {
                        counter++;

                    }
                    else
                        if (double.TryParse(Item, out B))
                        {
                            counter2++;

                        }
                        else if (DateTime.TryParse(Item, out C))
                        {
                            Counter3++;
                        }
                }
                return Counter3;

            }
        }
        public string[] Words
        {
            get
            {
                
                string[] Parts = txt.Split(new char[] { ' ', '\t', '\n', '\r' }, StringSplitOptions.RemoveEmptyEntries);
                string[] wrd = new string[Parts.Length];
                int i = 0;
                foreach (string Item in Parts)
                {
                    if (Item.Length > 1 && char.IsLetter(Item[0]))
                    {
                        wrd[i] = Item;
                        i++;

                    }
                }
                Array.Resize(ref wrd, i);
                return wrd;
            }
        }

    }
}
