abstract class Aviation85
{
 abstract public void project1();
  }

class Airindia extends Aviation85
{
 @Override
 public void project1()
 {
  System.out.println("airindia is not doing good");
   }
}

class Spicejet extends Aviation85
{
 @Override
 public void project1()
 {
 System.out.println("there's always a security threat in spicejet nowadays");
   }
 }
class Indigo extends Aviation85
{
 @Override
 public void project1()
 {
  System.out.println("indigo is way better than spicejet and airindia in domestic airtravel");
  }
}
class Analysis71
{
 public static void main(String[] args)
 {
  System.out.println("OVERALL ANALYSIS OF DOMESTIC AIRLINES");
  Airindia r=new Airindia();
  r.project1();

  Spicejet k=new Spicejet();
  k.project1();

  Indigo j=new Indigo();
  j.project1();
   }
 }