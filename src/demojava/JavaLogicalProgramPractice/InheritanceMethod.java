package demojava.JavaLogicalProgramPractice;

public class InheritanceMethod {

	public static void main(String[] args) {

	/*	Sports sports = new Sports();

		Soccer soccer = new Soccer();

		System.out.println(sports.getName());
		sports.getNumberOfTeamMembers();

		System.out.println(soccer.getName());
		soccer.getNumberOfTeamMembers();
*/
	}


	public class Sports {

		String getName() {
			return "Generic Sports";
		}

		void getNumberOfTeamMembers() {
			System.out.println("Each team has n players in " + getName());
		}

	}

	public class Soccer extends Sports {

		@Override
		String getName() {
			return "Soccer class";
		}

		@Override
		void getNumberOfTeamMembers() {
			System.out.println("Each team has 11 players in " + getName());
		}

	}

}
