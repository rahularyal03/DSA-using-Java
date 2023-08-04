nt main() {
  int capacity = 4;
  int arr[] = {7, 0, 1, 2, 0, 3, 0, 4, 2, 3, 0, 3, 2};
 
  deque<int> q(capacity);
  int count=0;
  int page_faults=0;
  deque<int>::iterator itr;
  q.clear();
  for(int i:arr)
  {
    itr = find(q.begin(),q.end(),i);
    if(!(itr != q.end()))
    {
 
      ++page_faults;
      if(q.size() == capacity)
      {
        q.erase(q.begin());
        q.push_back(i);
      }
      else{
        q.push_back(i);
 
      }
    }
    else
    {
      q.erase(itr);
      q.push_back(i);        
    }
 
  }
  cout<<page_faults;
}
{
   int capacity = 4;
   int arr[] = {7, 0, 1, 2, 0, 3, 0, 4, 2, 3, 0, 3, 2};
   ArrayList<Integer> s=new ArrayList<>(capacity);
   int count=0;
   int page_faults=0;
   for(int i:arr)
   {
      if(!s.contains(i))
      {
         if(s.size()==capacity)
         {
            s.remove(0);
            s.add(capacity-1,i);
         }
		 else
            s.add(count,i);
         page_faults++;
         ++count;
       } else {
         s.remove((Object)i);
         s.add(s.size(),i);		
   }
}