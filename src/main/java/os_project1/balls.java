package os_project1;

import java.util.Random;

public class balls extends Thread{
    private board board;
    public balls(board board) {
        this.board = board;
    }

    @Override
    public void run()
    {
   board.dropThread(7);
       
    }
    
}
