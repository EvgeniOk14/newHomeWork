package model.Comparator;

import model.FamilyTree.FamilyTree;
import model.Persons.Person;

public class SortByLastName
{
    private FamilyTree familyTree;
        void SortByLastName(FamilyTree familyTree)
        {
            this.familyTree = familyTree;
        }

        public void sortByLastName()
        {
            familyTree.sortByLastName(familyTree); 
            System.out.println("Список, отсортированный по фамилии: " + familyTree);
        } 
}
