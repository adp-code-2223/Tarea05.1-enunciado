package modelo;
// Generated 21:11:36, 10 de xan. de 2023 by Hibernate Tools 5.6.14.Final

import java.util.HashSet;
import java.util.Set;

/**
 * Dept generated by hbm2java
 */
public class Departamento implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Integer deptno;
	private String dname;
	private String loc;


	public Departamento() {
	}

	public Departamento(String dname, String loc) {
		this.dname = dname;
		this.loc = loc;
		
	}

	public Integer getDeptno() {
		return this.deptno;
	}

	public void setDeptno(Integer deptno) {
		this.deptno = deptno;
	}

	public String getDname() {
		return this.dname;
	}

	public void setDname(String dname) {
		this.dname = dname;
	}

	public String getLoc() {
		return this.loc;
	}

	public void setLoc(String loc) {
		this.loc = loc;
	}



	@Override
	public String toString() {
		return "Departamento [deptno=" + ( (deptno!=null)? deptno : " ") + ", dname=" + dname + ", loc=" + loc + "]";
	}
	
	

}
