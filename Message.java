public class Message{
	private String Text;
	private int Month;
	private int Day;
	private String Time;
	private String timeOfDay;

	//CONSTRUCTORS
		Message(){
		}
		Message(String Text, int Month,int Day,String Time,String timeOfDay){
		this.Text = Text;
		this.Month = Month;
		this.Day = Day;
		this.Time = Time;
		this.timeOfDay = timeOfDay;
		}
	//SETTERS
	public void setText(String Text){
			this.Text = Text;
		}
		public void setMonth(int Month){
			this.Month = Month;
		}
		public void setDay(int Day){
			this.Day = Day;
		}
		public void setTime(String Time){
			this.Time = Time;
		}
		public void setTimeOfDay(String timeOfDay){
			this.timeOfDay = timeOfDay;
		}
		//GETTERS
		public String getText(){
			return Text;
		}
		public int getMonth(){
			return Month;
		}
		public int getDay(){
			return Day;
		}
		public String getTime(){
			return Time;
		}
		public String getTimeOfDay(){
			return timeOfDay;
		}
		//toString Function
		public String toString(){
			return Month + "/" + Day + " " + Time + " " + timeOfDay +
				   "\n" + Text;
		}
	}
