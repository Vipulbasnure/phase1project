package UserFiles;

import java.util.Scanner;


 public class UserFilesRunner { UserFiles Userfiles; 

public static void main(String[] args) {
UserFilesRunner userfilesrunner =new UserFilesRunner(); userfilesrunner.MainMenu();


}

public void MainMenu()
{ System.out.println("Main Menu");
Userfiles = new UserFiles();
this.Userfiles.createDirectory();

 Scanner input = new Scanner(System.in);
	int mainSelection;
	
	
	System.out.println("*************************************SIMPLILEARN*********************************************");
	System.out.println("**********************************FSD PHASE1 PROJECT**********************************************");
	System.out.println("**********************************Vipul***********************************************************");
	System.out.println();
	
	
	do {
	
	
	System.out.println("Choose from the below options");
	System.out.println("1.Display the File Names in Ascending order");
	
	System.out.println("2.Display User Interface Menu");
	System.out.println("3.Exit");
	
	
	mainSelection = input.nextInt();
	
	switch(mainSelection) {
	case 1:
	Userfiles.listFilesinAscendingOrder();
	
	break;
	
	case 2:
	System.out.println("Option 2 selected");
	userInterfaceMenu();
	break; 
	case 3:
	System.out.println("Thank You for using our application");
	System.exit(0);
	
	break;
	
	default:
	System.out.println("Wrong option");
	}
	}while(mainSelection!=3);
}

public void userInterfaceMenu() {
Scanner input = new Scanner(System.in);
int selection;
do {
System.out.println("***************USER INTERFACE MENU**************");
System.out.println("Choose from the below options");
System.out.println("1.Add a user specified file to the application");

System.out.println("2.Delete a user specified file from the application");
System.out.println("3.Search for a user specified file from application");
System.out.println("4.Back to Main Menu");

selection = input.nextInt();
switch(selection) {
case 1:
this.Userfiles.createuserFile();
break;

case 2:
System.out.println("Option 2 Selected");
this.Userfiles.deleteuserFile(); 
break;

case 3:
System.out.println("Option 3 Selected");
this.Userfiles.searchFile();
break;

case 4:
MainMenu();

default:
System.out.println("Wrong Option Selected");


}
}while(selection!=4);
}
}

