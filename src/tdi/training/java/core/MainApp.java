package src.tdi.training.java.core;
import java.util.Map;
import java.util.HashMap;
import java.util.List;
import java.time.LocalDate;
import java.util.ArrayList;
import src.tdi.training.java.core.model.Kelas;
import src.tdi.training.java.core.model.Mahasiswa;


public class MainApp{
    public static void main(String[] args){
        /*
        //soal nomor 1 dan 2
        Map<String, String> mahasiswa = new HashMap<>();
        mahasiswa.put("001", "Muhamad Yusuf");
        mahasiswa.put("002", "Dimas maryanto");
        mahasiswa.put("006", "Hari Saptio Adi");
        mahasiswa.put("007", "Putri Harahap");
        mahasiswa.put("008", "Dewi Nyoman Santosa");
        mahasiswa.put("009", "Hariaty");
        mahasiswa.put("010", "Karina Virgi");
        System.out.println("Nama saya "+mahasiswa.get("010")+" NIPnya : 010");
        //soal nomor 3
        List<Integer> numbers = new ArrayList<>();
        numbers.add(0,1);
        numbers.add(1,3);
        numbers.add(2,5);
        numbers.add(3,10);
        numbers.add(4,1);
        numbers.add(5,20);
        numbers.add(6,10);
        numbers.add(7,1);
        numbers.add(8,20);
        numbers.add(9,9);
        numbers.add(10,1);
        System.out.println("Index ke - 0 adalah "+numbers.get(0)+", index ke - 1 adalah "+numbers.get(1)+", dan index ke - 3 adalah "+numbers.get(3));
        //soal nomor 4
        for(Integer value : numbers){
            if(value%2!=0){
                System.out.print(value+" ");
            }
        }
        System.out.println();
        */
        //soal nomor 6
        Kelas IF = new Kelas("IF", 2014, "Informatika");
        Kelas SI = new Kelas("AB", 2013, "AAAAABBBBB");

        List<Mahasiswa> listMahasiswa = new ArrayList<>();
        listMahasiswa.add(new Mahasiswa("Dimas Maryanto", "10511148", LocalDate.of(1992, 3, 11), 2014, IF));
        listMahasiswa.add(new Mahasiswa("Muhammad Yusuf", "10511150", LocalDate.of(1994, 1, 10), 2014, SI));
        listMahasiswa.add(new Mahasiswa("Adib", "10511170", LocalDate.of(1995, 2, 12), 2014, IF));
        listMahasiswa.add(new Mahasiswa("Hari Sapto Adi", "10511160", LocalDate.of(1991, 3, 15), 2014, SI));
        listMahasiswa.add(new Mahasiswa("Hariarty", "10511110", LocalDate.of(1992, 4, 16), 2014, IF));

        for(Mahasiswa value : listMahasiswa){
            System.out.println(value.toString());
        }
    }
}