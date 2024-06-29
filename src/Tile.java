/*
    ->This class file contains a variable named as "tileCoordinate" which will take the position of the tile in coordinates.
    ->Also, we have two methods namely isTileOccupied() & getPiece() whose work is to show empty/occupied and return piece object if necessary.
    ->FYI, a chess board has 64 squares in alternate colors(preferably black and white).
 */

public abstract class Tile {
    int tileCoordinate;
    Tile(int tileCoordinate){
        this.tileCoordinate=tileCoordinate;
    }
    public abstract boolean isTileOccupied();
    public abstract Piece getPiece();
    public static final class EmptyTile extends Tile {
        EmptyTile(int tileCoordinate){
            super(tileCoordinate);
        }
        @Override
        public boolean isTileOccupied(){
            return false;
        }
        @Override
        public Piece getPiece(){
            return null;
        }
    }
    public static final class OccupiedTile extends Tile {
        Piece pieceOnTile;
        OccupiedTile(int tileCoordinate,Piece pieceOnTile){
            super(tileCoordinate);
            this.pieceOnTile=pieceOnTile;
        }
        @Override
        public boolean isTileOccupied(){
            return true;
        }
        @Override
        public Piece getPiece(){
            return pieceOnTile;
        }
    }
}