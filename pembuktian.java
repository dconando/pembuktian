

public interface pemain {
String club ="pbdjarum";
String posisi = "Pemain utama";
abstract void printClub();
abstract void printposisi() ; // pembuktian no 1
}

public static void main (String[] args){
pemain pm = new pemain()
pm.baju();
pm.alat();
pm.aturan(); //pembuktian no 2
} 


public interface aa extends bb, cc { //pembuktian no 4
 aa saya = new aa();  //pembuktian no 3 
}

public interface ab implements bb{ // pembuktian no 5
}

