package book;

public class date {
		int dd,mm,yy;

		public date() {}

		public date(int dd, int mm, int yy) {
			this.dd = dd;
			this.mm = mm;
			this.yy = yy;
		}


		
		
		public int getDd() {
			
			return dd;
		}

		public void setDd(int dd) {
			this.dd = dd;
		}

		public int getMm() {
			return mm;
		}

		public void setMm(int mm) {
			this.mm = mm;
		}

		public int getYy() {
			return yy;
		}

		public void setYy(int yy) {
			this.yy = yy;
		}





		public String toString() {
			return "date [dd=" + dd + ", mm=" + mm + ", yy=" + yy + "]";
		}


		public static void main(String[] args) {
			date d1= new date();
			d1.setDd(21);
			d1.setMm(11);
			d1.setYy(14);
			
			System.out.println(d1);
		}
}

