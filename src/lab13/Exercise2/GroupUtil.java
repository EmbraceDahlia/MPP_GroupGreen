package lab13.Exercise2;
import java.util.*;

//public class GroupUtil {
//	public static <T> Group<T> copy(Group<T> group) {
//		List<T> elements = group.getElements();
//		Group<T> grp = new Group<T>(group.getSpecialElement(), elements);
//		return grp;
//	}
//
//	public static void main(String[] args) {
//		List<Integer> list = Arrays.asList(0,1,2,3,4);
//		Group<Integer> group = new Group<>(0, list);
//		System.out.println(group);
//		System.out.println(GroupUtil.copy(group));
//	}
//}
public class GroupUtil {
	//Fix this code
	//	public static Group<?> copy(Group<?> group) {
	//		List<?> elements = group.getElements();
	//		Group<?> grp = new Group<?>(group.getSpecialElement(), elements);
	//		return grp;
	//	}

	public static <T> Group<T> copyHelper(Group<T> group) {
		List<T> elements = group.getElements();
		Group<T> grp = new Group<T>(group.getSpecialElement(), elements);
		return grp;
	}

	public static Group<?> copy(Group<?> group) {
		return copyHelper(group);
	}

	//Test using this main method
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(0,1,2,3,4);
		Group<Integer> group = new Group<>(0, list);
		System.out.println(group);
		System.out.println(GroupUtil.copy(group));
	}
}
