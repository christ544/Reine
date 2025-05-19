public class Queen extends Piece{

    boolean isValidMove(Position newPosition){
        if(Math.abs(newPosition.column - this.column) == Math.abs(newPosition.row - this.row)
                || newPosition.column == this.column || newPosition.row == this.row)
        {
            return true;
        }
        else{
            return false;
        }
    }
}
