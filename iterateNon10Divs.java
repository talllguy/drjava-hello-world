public class iterateNon10Divs
{
  public static void main( String [] args )
  {
    for( int i = 1; i <= 100; i++ )
    {
      if( i % 10 == 0 )
        continue;
      System.out.println( i );
    }
  }
}