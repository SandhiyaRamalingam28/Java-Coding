/*
Your task here is to implement a Java code based on the following specifications. Note that your code should match the specifications in a precise manner. Consider default visibility of classes, data fields, and methods unless mentioned otherwise.
Specifications:
class definitions: 
  class Dog:
    data members:
     String name
     int age
     int weight

   Dog(String name, int age, int weight): constructor with public visibility
    Define getter setters with public visibility
    toString(): has been implemented for you

  class Implementation:
     method definition:
       filterByAgeAndWeight(List<Dog> listDog):
           return type: List<Dog> 
           visibility: public

       separateWithDelimeter(List<Dog> listDog):
           return type: String 
           visibility: public
Task:
class Dog:
- Define the class according to the above specifications
class Implementation:
Implement the below method for this class:
•	List<Dog> filterByAgeAndWeight(List<Dog> listDog): fetch dog details on the basis of:
•	age greater than 10
•	weight greater than 25
•	get the filtered data, put it into a list and return the list
•	String separateWithDelimeter(List<Dog> listDog):  concat and return the dogs details with delimeter "$~$~" 
Refer sample output for clarity
Sample Input
 List<Dog> list = new ArrayList<Dog>();
  list.add(new Dog("German Shepherd ", 20, 35));
  list.add(new Dog("Labrador ", 5, 40));
  list.add(new Dog("Pitbull ", 29, 100));
  list.add(new Dog("Poodle", 10, 45));
Sample Output
[Dog{name='German Shepherd ', age=20, weight=35}, Dog{name='Pitbull ', age=29, weight=100}]

----------------------------------------------------------

Dog{name='German Shepherd ', age=20, weight=35}$~$~Dog{name='Labrador ', age=5, weight=40}$~$~Dog{name='Pitbull ', age=29, weight=100}$~$~Dog{name='Poodle', age=10, weight=45}
NOTE
•	You can make suitable function calls and use the RUN CODE button to check your main() method output.
ALLOWED TECHNOLOGIES
•	Java 8



*/
package doselect_q31;

import java.util.ArrayList;
import java.util.List;

public class Dog {
	String name;
	int age;
	int weight;
	
	Dog(String name, int age, int weight){
		this.name=name;
		this.age=age;
		this.weight=weight;
	}
	public String getName() {
		return this.name;
	}
	public int getAge() {
		return this.age;
	}
	public int getWeight() {
		return this.weight;
	}
	public void setName(String name) {
		this.name=name;
	}
	public void setAge(int age) {
		this.age=age;
	}
	public void setWeight(int weight) {
		this.weight=weight;
	}
	@Override
	public String toString() {
		return "Dog{name='"+name+"', age="+age+", weight="+weight+"}";
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  List<Dog> list = new ArrayList<Dog>();
		  list.add(new Dog("German Shepherd ", 20, 35));
		  list.add(new Dog("Labrador ", 5, 40));
		  list.add(new Dog("Pitbull ", 29, 100));
		  list.add(new Dog("Poodle", 10, 45));
		  Implementation imp=new Implementation();
		  System.out.println(imp.filterByAgeAndWeight(list));
		  System.out.println(imp.separateWithDelimeter(list));

		

	}

}

class Implementation{
	public List<Dog> filterByAgeAndWeight(List<Dog> listDog){
		int i=0;
		List<Dog> list =new ArrayList<Dog>();
		for(Dog dog : listDog) {
			if(listDog.get(i).getAge()>10 && listDog.get(i).getWeight()>25) {
				list.add(dog);
			}
			i++;
		}
		return list;
	}
	public String separateWithDelimeter(List<Dog> listDog) {
		StringBuilder str=new StringBuilder();
		int n=listDog.size();
		str.append(listDog.get(0));
		for(int i=1;i<n;i++) {
			str.append("$~$~");
			str.append(listDog.get(i));
			}
		return str.toString();
		
	}
}
