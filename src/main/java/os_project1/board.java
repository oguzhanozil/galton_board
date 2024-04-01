package os_project1;

public class board extends nail {
    private nail [][] board;
    private int [] slots;
    private int numBins;
   
    board(int numBins)
    {
        super();
        this.numBins = numBins;
        this.board = new nail[numBins][numBins]; 
        this.slots = new int[numBins];
    
        for (int i=0;i<numBins;i++)
        {
            for (int j=0;j<=i;j++)
            {
                this.board[i][j]=new nail();
            }                 
        }
    }
    public int displayCounts()
    {
        int sum=0;
        int requestedThreadColumn = -1;
        for (int i = 0; i < slots.length; i++) {
            System.out.println("Slot " + i + ": " + slots[i]);
            sum += slots[i];
           
        }
       
        return sum;
        
         
    }
    public synchronized void dropThread(int row) {
        int currentRow = 0;
        int currentColumn = 0;
        int requestedThreadCount =0;
        while (currentRow < this.board.length-1)
        {
            currentRow++;
            if (this.board[currentRow][currentColumn].randomizeState()) {  //sağa gidiyorsa 1 arttır    
                currentColumn++;  
            }
            if (currentRow == row) {
                requestedThreadCount++; // İstenen çekirdek düşerse, istenen çekirdek sayısını arttır
            }
        }
        int slotNumber =currentColumn;
        slots[slotNumber]++;
      
    }
    
    
}
