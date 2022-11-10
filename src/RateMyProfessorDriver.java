import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
//write each to binary file
//change ratings of 2-3
//load written objects from binary file and add any that have changed(this could include concept of appending)
//assume no new objects have been added to the binary file/ not hacked
//each object must have a ubiq ID no duplicates

public class RateMyProfessorDriver {

	public static void main(String[] args) {
		
		RateMyProfessor a = new RateMyProfessor("Alex",2012,"Biology",9.9);
		RateMyProfessor b = new RateMyProfessor("Bob",2013,"Chem",9.9);
		RateMyProfessor c = new RateMyProfessor("Colleen",2014,"Calculus",9.9);
		RateMyProfessor d = new RateMyProfessor("Diane",2015,"Biology",9.9);
		RateMyProfessor e = new RateMyProfessor("Eeore",2022,"Chem",9.9);
		RateMyProfessor f = new RateMyProfessor("Fiona",2002,"Math",9.9);
		RateMyProfessor g = new RateMyProfessor("Gill",2019,"Calculus",9.9);
		RateMyProfessor h = new RateMyProfessor("Hilaire",2012,"Biology",9.9);
		RateMyProfessor i = new RateMyProfessor("Ian",2013,"Chem",9.9);
		RateMyProfessor j = new RateMyProfessor("Julia",2013,"Chem",9.9);

		
	
		try {
			writeObject(a,"binary.dat");
			writeObject(b,"binary.dat");
			writeObject(c,"binary.dat");
			writeObject(d,"binary.dat");
			writeObject(e,"binary.dat");
			writeObject(f,"binary.dat");
			writeObject(g,"binary.dat");
			writeObject(h,"binary.dat");
			writeObject(i,"binary.dat");
			writeObject(j,"binary.dat");


		} catch (FileNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		a.setName("Jenn");
		b.setName("Dan");
		c.setName("Juniper");
		
		try {
			writeObject(a,"binary.dat");
			writeObject(b,"binary.dat");
			writeObject(c,"binary.dat");
		} catch (FileNotFoundException e2) {
			// TODO Auto-generated catch block
			e2.printStackTrace();
		} catch (IOException e2) {
			// TODO Auto-generated catch block
			e2.printStackTrace();
		}
		
		
		
		
//	try {
//		FileOutputStream outputStream 
//					  = new FileOutputStream("binary.dat", true);
//	} catch (FileNotFoundException e2) {
//		// TODO Auto-generated catch block
//		e2.printStackTrace();
//	}
		
		try {
			readObject("binary.dat");
		} catch (FileNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (ClassNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
	}

		// TODO Auto-generated method stub

		public static void writeObject(RateMyProfessor prof, String filename) throws FileNotFoundException, IOException {
			
			
			ObjectOutputStream objOut = new ObjectOutputStream(new FileOutputStream(filename,true));

	objOut.writeObject(prof);
	objOut.close();

			
		}
		
		public static RateMyProfessor readObject(String filename) throws FileNotFoundException, IOException, ClassNotFoundException {
			
			ObjectInputStream objIn = new ObjectInputStream(new FileInputStream(filename));

			return (RateMyProfessor)objIn.readObject();
			
	}
}
