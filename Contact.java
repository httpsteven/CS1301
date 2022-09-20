public class Contact{
	private String firstName;
	private String lastName;
	private String phoneNumber;
	private Message currMessage;

		public Contact(){
		}

		Contact(String firstName, String lastName, String phoneNumber, Message currMessage){
			this.firstName = firstName;
			this.lastName = lastName;
			this.phoneNumber = phoneNumber;
			this.currMessage = currMessage;
		}

		//SETTERS
		public void setFirstName(String firstName){
			this.firstName = firstName;
		}
		public void setLastName(String lastName){
			this.lastName = lastName;
		}
		public void setPhoneNumber(String phoneNumber){
			this.phoneNumber = phoneNumber;
		}
		public void setCurrMessage(Message currMessage){
			this.currMessage = currMessage;
		}

		//GETTERS
		public String getFirstName(){
			return firstName;
		}
		public String getLastName(){
			return lastName;
		}
		public String getPhoneNumber(){
			return phoneNumber;
		}
		public Message getCurrMessage(){
			return currMessage;
		}

		//toString Function
		public String toString(){
			return "Message from: " + firstName +
			"\n" + currMessage;
		}
	}
