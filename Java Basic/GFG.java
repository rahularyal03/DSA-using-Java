// Java program to illustrate
// page faults in LRU
import java.util.*;
class GFG {
public static void main(String[] args)
{
	int pages[] = new int[] { 3, 8, 2, 3, 9, 1, 6, 3, 8, 9, 3, 6, 2, 1, 3 };
	int n = 15, c = 5;

	System.out.println("Page Faults = "
					+ pageFaults(n, c, pages));
}
static int pageFaults(int N, int C, int pages[])
{
	// a queue to maintain page frames
	Queue<Integer> q = new LinkedList<>();

	// starting with 0 page faults
	int i = 0, c = 0;
	while (i < N)
	{

	// if queue is empty or the current page is
	// absent in the page frame then page fault
	// occurs
	if (q.isEmpty() || !q.contains(pages[i]))
	{
		if (q.size()== C) // if frame is full we remove the
		// least recently used page
		q.poll(); // removing the front element
		// which is not replaced for
		// long time

		q.add(pages[i]); // now we add the page to
		// frame
		c++; // incrementing page faults
	}
	else
	{
		q.remove(pages[i]); // if the page already exists
		// we'll remove it from
		// previous position and add
		// it to the end of the queue
		q.add(pages[i]);
	}

	i++;
	}
	return c;
}
}
// This code is contributed by tharunmadishetti1.
