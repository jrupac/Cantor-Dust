import java.awt.Color;

public class Cantor
{
    public Cantor(double N_in)
    {  
        StdDraw.setXscale(-1, N_in + 1);
        StdDraw.setYscale(-1, N_in + 1);

        StdDraw.clear(StdDraw.BLACK);
        
        StdDraw.setPenColor(Color.WHITE);
        StdDraw.square(N_in/2, N_in/2, N_in/2);

        StdDraw.setPenColor(Color.WHITE);
        StdDraw.square(N_in/2, N_in/2, N_in/2 - 1.0);
        
        int itr = 1;
        
        draw(N_in, itr, Color.WHITE);
        
        while (true)
        {
            if (StdDraw.hasNextKeyTyped())
            {
                char c = StdDraw.nextKeyTyped();
                
                if (c == 'a')
                    draw(N_in, itr++, Color.WHITE);
            }
        }                          
    }

    private void draw(double N_in, int itr, Color color)
    {
        double N_int;
        
        StdDraw.setPenColor(color);

        N_int = N_in / Math.pow(3, itr);
        
        for (double j = 0.0; j < N_in; j += 3 * N_int)
        {
            double[] x_coords = {N_int + j, 2 * N_int + j, 2 * N_int + j, N_int + j};
            double[] y_coords = {0.0, 0.0, N_in, N_in};
   
            StdDraw.filledPolygon(x_coords, y_coords);
            StdDraw.filledPolygon(y_coords, x_coords);
        }
    }  
    
/*
 *    private void draw(double N_in, int itr)
 *    {
 *        double N_int = 0;
 *        
 *        StdDraw.clear(StdDraw.BLACK);
 *        
 *        StdDraw.setPenColor(Color.WHITE);
 *        StdDraw.square(N_in/2, N_in/2, N_in/2);
 *
 *        StdDraw.setPenColor(Color.BLACK);
 *        StdDraw.square(N_in/2, N_in/2, N_in/2 - 1.0);
 *        
 *        for (int i = 0; i < itr; i++)
 *        {
 *            N_int = (N_in / Math.pow(3, i) / 3);
 *            
 *            for (double j = 0.0; j < N_in; j += 3*N_int)
 *            {
 *
 *                double[] x_coords = {N_int + j, 2*N_int + j, 2*N_int + j, N_int + j};
 *                double[] y_coords = {0.0, 0.0, N_in, N_in};
 *                
 *                StdDraw.setPenColor(Color.WHITE);
 *                
 *                StdDraw.filledPolygon(x_coords, y_coords);
 *                StdDraw.filledPolygon(y_coords, x_coords);
 *            }
 *        }
 *    }     
 */
    
    public static void main(String args[])
    {   
        Cantor app = new Cantor(Math.pow(3.0, 6.0));
    }
}
