import java.util.ArrayList;

public class Exercises {

  public int findMe(int[] list, int target) {
	  if (list == null) {
	      return -1;
	    }
	    for (int i = 0; i < list.length; i++) {
	          if (list[i] == target)
	              return i;
	      }
	    return -1;
  }

  public int findMe(ArrayList<String> list, String target) {
	  if (list == null || target.equals(null)) {
		     return -1;
	  }
	   for (int i = 0; i < list.size(); i++) {
	    if (list.get(i).equals(target)) {
	       return i;
	     }
	   }
	   return -1;
  }

  public int findMeFaster(ArrayList<Integer> list, int target) {
	  if (list == null) {
		     return -1;
		   }
	  int start = 0;
	  int mid = 0;
	  int end = list.size() - 1;
	  while (start <= end) {
		  mid = (start + end) / 2;
		     if (list.get(mid) < target) {
		       start = mid + 1;
		     } else if (list.get(mid) > target) {
		       end = mid - 1;
		     } else if (list.get(mid) == target) {
		       return mid;
		     }
		   }
		   return -1;
  }

  public int findMeFaster(String[] list, String target) {
	  if (list == null || list.length == 0 || target.equals(null)) {
		     return -1;
		   }
		   int start = 0;
		   int end = list.length;
		   while (start < end) {
			     int mid = (start + end) / 2;
	     if (list[mid].compareTo(target) < 0) {
	         start = mid + 1;
	       } else if (list[mid].compareTo(target) > 0) {
	         end = mid - 1;
	       } else if (list[mid].compareTo(target) == 0) {
	         return mid;
	       }

	   }
	return -1;     
  }

  public int[] bubble(int[] list, boolean ascending) {
    return null;
  }

  public ArrayList<String> bubble(ArrayList<String> list, boolean ascending) {
    return null;
  }

  public ArrayList<Integer> insertion(ArrayList<Integer> list, boolean ascending) {
    return null;
  }

  public String[] insertion(String[] list, boolean ascending) {
    return null;
  }

  public int[] selection(int[] list, boolean ascending) {
    return null;
  }

  public ArrayList<String> selection(ArrayList<String> list, boolean ascending) {
    return null;
  }

  public ArrayList<Integer> merge(ArrayList<Integer> list, boolean ascending) {
    return null;
  }

  public String[] merge(String[] list, boolean ascending) {
    return null;
  }
}