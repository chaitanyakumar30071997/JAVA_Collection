package com.salariesgreater;

public class Emp {

	

		Integer id;
		String name;
		String dep;
		Long sal;
		
		
		
		public Integer getId() {
			return id;
		}



		public void setId(Integer id) {
			this.id = id;
		}



		public String getName() {
			return name;
		}



		public void setName(String name) {
			this.name = name;
		}



		public String getDep() {
			return dep;
		}



		public void setDep(String dep) {
			this.dep = dep;
		}



		public Long getSal() {
			return sal;
		}



		public void setSal(Long sal) {
			this.sal = sal;
		}



		@Override
		public String toString() {
			return "Emp [id=" + id + ", name=" + name + ", dep=" + dep + ", sal=" + sal + "]";
		}

		

		public Emp(Integer id, String name, String dep, Long sal) {
			super();
			this.id = id;
			this.name = name;
			this.dep = dep;
			this.sal = sal;
		}
		
		
		

}
		
		

	


