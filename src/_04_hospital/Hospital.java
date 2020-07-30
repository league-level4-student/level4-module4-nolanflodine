package _04_hospital;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

import javax.swing.text.StyledEditorKit.ForegroundAction;

public class Hospital {
static ArrayList<Doctor> doctor = new ArrayList<Doctor>();
static ArrayList<Patient> p = new ArrayList<Patient>();
Stack<Patient> s = new Stack<Patient>();
	public List<Doctor> getDoctors() {
		// TODO Auto-generated method stub
		return doctor;
	}

	public static void addDoctor(Doctor doc) {
		// TODO Auto-generated method stub
		doctor.add(doc);
	}

	public static void setPatient(ArrayList<Patient> p2) {
		p = p2;
	}
	public List<Patient> getPatients() {
		// TODO Auto-generated method stub
		return p;
	}

	public void assignPatientsToDoctors() {
		// TODO Auto-generated method stub
		for (int i = 0; i < p.size(); i++) {
			s.push(p.get(i));
		}
		System.out.println(p.size());
		for (int i = 0; i < doctor.size(); i++) {
			while(doctor.get(i).getPatients().size()<3&&s.size()>0) {
				try {
					doctor.get(i).assignPatient(s.pop());
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		}
		}
	}

	public static void addPatient(Patient patient) {
		// TODO Auto-generated method stub
		p.add(patient);
	}

}
