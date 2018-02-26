//********************************************************************
//  Coin.java       Author: Lewis/Loftus
//
//  Represents a coin with two sides that can be flipped.
//********************************************************************
package Chap7.PP8;
public class Coin implements Lockable
{
   private int key = 0;
   private boolean locked = false;
   private final int HEADS = 0;
   private final int TAILS = 1;

   private int face;

   //-----------------------------------------------------------------
   //  Sets up the coin by flipping it initially.
   //-----------------------------------------------------------------
   public Coin()
   {    if (locked) {
           throw new UnsupportedOperationException("Not supported yet.");
       }
      flip();
   }

   //-----------------------------------------------------------------
   //  Flips the coin by randomly choosing a face value.
   //-----------------------------------------------------------------
   public void flip() throws UnsupportedOperationException
   {
       if (locked) {
           throw new UnsupportedOperationException("Not supported yet.");
       }
      face = (int) (Math.random() * 2);
   }

   //-----------------------------------------------------------------
   //  Returns true if the current face of the coin is heads.
   //-----------------------------------------------------------------
   public boolean isHeads()
   {    if (locked) {
           throw new UnsupportedOperationException("Not supported yet.");
       }
      return (face == HEADS);
   }

   //-----------------------------------------------------------------
   //  Returns the current face of the coin as a string.
   //-----------------------------------------------------------------
   public String toString()
   {    if (locked) {
           throw new UnsupportedOperationException("Locked");
       }
      String faceName;

      if (face == HEADS)
         faceName = "Heads";
      else
         faceName = "Tails";

      return faceName;
   }

    @Override
    public void setKey(int key) {
        this.key = key;
    }

    @Override
    public void lock(int key) {
        if(key == this.key) {
            this.locked = true;
        }
    }

    @Override
    public void unlock(int key) {
        if (key == this.key) {
            this.locked = false;
        }
    }

    public boolean locked() {
        return locked;
   }
}


