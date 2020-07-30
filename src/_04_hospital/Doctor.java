package _04_hospital;

import static org.junit.Assume.assumeNoException;
import static org.junit.jupiter.api.Assertions.fail;

import java.util.ArrayList;
import java.util.List;

public class Doctor {
ArrayList<Patient> docP = new ArrayList<Patient>();
	public Object performsSurgery() {
		// TODO Auto-generated method stub
		return false;
	}

	public Object makesHouseCalls() {
		// TODO Auto-generated method stub
		return false;
	}

	public void assignPatient(Patient patient) throws Exception {
		// TODO Auto-generated method stub
		if(docP.size()<3){
		docP.add(patient);
		}
		else {
			throw new DoctorFullException();
		}
	}

	public List<Patient> getPatients() {
		// TODO Auto-generated method stub
		return docP;
	}

	public void doMedicine() {
		// TODO Auto-generated method stub
		for (int i = 0; i < docP.size(); i++) {
			docP.get(i).setChecked(true);
		}
	}

}
