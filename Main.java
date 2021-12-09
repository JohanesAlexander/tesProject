/*


import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[]args){
        Scanner scanInt = new Scanner(System.in);
        Scanner scanStr = new Scanner(System.in);

        ArrayList<CPerson> alPerson = new ArrayList<>();

        int menu = -1;

        while (menu != 0){
            System.out.println("1. Ins Person");
            System.out.println("2. Upd Person");
            System.out.println("3. List Person");
            System.out.println("4. List Person by jenjang");
            System.out.println("5. List Person by kota ouput dan input");
            System.out.println("6. Delete all data by city");
            System.out.println("7. Delete all data by name");

            menu = scanInt.nextInt();

            if (menu == 1){

                System.out.println("nama: ");
                String iNama = scanStr.nextLine();

                System.out.println("kota: ");
                String iKota = scanStr.nextLine();

                System.out.println("umur: ");
                int iUmur = scanInt.nextInt();

                System.out.println("jenjang: ");
                String iJenjang = scanStr.nextLine();

                CPerson objectOrang = new CPerson(iNama,iKota,iUmur,iJenjang);

                alPerson.add(objectOrang);
                System.out.println("insert sukses");
            }

            else if(menu ==2){
                System.out.println("nama yg mw diupdate");
                String updNM = scanStr.nextLine();
            }

            else if(menu ==3){
                int c =0;
                for (int i = 0; i < alPerson.size() ; i++) {
                    alPerson.get(i).printInfo();
                    c++;
                }
                if(c>0){
                    System.out.println(c);
                }
                else if(alPerson.isEmpty()){
                    System.out.println("no person found");
                }
            }



            else if (menu == 4){
                System.out.println("masukkan patokan jenjang: ");
                String patokanJenjang = scanStr.nextLine();


                int countJenjang =0;

                for (int i = 0; i < alPerson.size(); i++) {
                    if(alPerson.get(i).getJenjang().equalsIgnoreCase(patokanJenjang)){
                        alPerson.get(i).printInfo();
                        countJenjang++;
                    }
                }//end for
                System.out.println(countJenjang+" user found");
            }//end elif menu 4

            else if (menu ==5){
                System.out.println("masukkan patokan kota: ");
                String patokanKota = scanStr.nextLine();

                int countKota = 0;

                for (int i = 0; i < alPerson.size(); i++) {
                    if(alPerson.get(i).getKota().equalsIgnoreCase(patokanKota)){
                        alPerson.get(i).printInfo();
                        countKota++;
                    }
                }
                System.out.println(countKota + " user found");
                System.out.println("");
            }

            else if(menu ==6){
                System.out.println("kota mana yg datanya mau dihapus?: ");
                String inKT = scanStr.nextLine();

                int kotaDelCount=0;

                for (int i = alPerson.size()-1; i >= 0 ; i--) {
                    if(alPerson.get(i).getKota().equalsIgnoreCase(inKT)){
                        alPerson.remove(i);
                        kotaDelCount++;
                    }
                }
                System.out.println(kotaDelCount + "data telah dihapus");
            }

            else if(menu ==7){
                System.out.println("orang mana yg mau dihapus? :");
                String inNM = scanStr.nextLine();

                int nmDelCount = 0;

                for (int i = alPerson.size()-1; i >= 0 ; i--) {
                    if (alPerson.get(i).getNama().equalsIgnoreCase(inNM)){
                        alPerson.remove(i);
                        nmDelCount++;
                    }

                }
                System.out.println(nmDelCount + " data telah dihapus");
            }


        }//end while

    }
}
*/
import java.util.Scanner;

public class Main {
    public static void main(String[]args){
        Scanner scanInt = new Scanner(System.in);
        Scanner scanStr = new Scanner(System.in);

        CPerson arPerson[] = new CPerson[20];


        int menu = -1;
        int arr_i=0;

        while (menu != 0){
            System.out.println("1. Ins Person");
            System.out.println("2. Upd Person");
            System.out.println("3. List Person");
            System.out.println("4. List Person by jenjang");
            System.out.println("5. List Person by kota ouput dan input");
            System.out.println("6. Delete all data by city");
            System.out.println("7. Delete all data by name");

            menu = scanInt.nextInt();

            if (menu == 1){

                System.out.println("nama: ");
                String iNama = scanStr.nextLine();

                System.out.println("kota: ");
                String iKota = scanStr.nextLine();

                System.out.println("umur: ");
                int iUmur = scanInt.nextInt();

                System.out.println("jenjang: ");
                String iJenjang = scanStr.nextLine();

                arPerson[arr_i] = new CPerson(iNama,iKota,iUmur,iJenjang);
                arr_i++;

                System.out.println("insert sukses");

            }

            else if(menu ==6){
                System.out.println("kota mana yg datanya mau dihapus?: ");
                String inKT = scanStr.nextLine();

                int kotaDelCount=0;

                for (int i = arPerson.length; i >= 0 ; i--) {
                    if(arPerson[i].getKota().equalsIgnoreCase(inKT)){
                        arPerson.
                        kotaDelCount++;
                    }
                }
                System.out.println(kotaDelCount + "data telah dihapus");
            }

            else if(menu ==7){
                System.out.println("orang mana yg mau dihapus? :");
                String inNM = scanStr.nextLine();

                int nmDelCount = 0;

                for (int i = alPerson.size()-1; i >= 0 ; i--) {
                    if (alPerson.get(i).getNama().equalsIgnoreCase(inNM)){
                        alPerson.remove(i);
                        nmDelCount++;
                    }

                }
                System.out.println(nmDelCount + " data telah dihapus");
            }




    }
}