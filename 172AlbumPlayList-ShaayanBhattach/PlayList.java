import java.util.Arrays;

public class PlayList
{
	/** Song[] array list instance variable*/
	private Song[] list;
	
	/** default constructor used to set the instance variables to default values*/
	public PlayList()
	{
    Song s = new Song("","","", 0);
    list = new Song[1];
    list[0] = s;
    // I would recommend setting the length to 1
		
		// Then make sure you add 1 song to the list in index 0
	}
	
	/** initialization constructor used to set the instance variables
		* @param x the length of the playlist */
	public PlayList(int x)
	{
		list = new Song[x];
    // this should set the length of the playlist
		
	}
	
	/** modifier method to set the instance variable list
		* @param x the length of the playlist*/
	public void setList(int x)
	{

		list = new Song[x];
    // this should set the length of the playlist
		
	}
	
	/** accessor method to get the entire playlist
		* @return return the entire playslist as a Song[] array*/
	public Song[] getList()
	{
		return(list);
	}
	
	/** method to add a song to the playlist
		* @param x the position in the playlist to add the song
		* @param s the song to add to the playlist*/
	public void addSong(int x, Song s)
	{

  
		/* you need to check to make sure the array is big enough to add the song
		   if it is not big enough you will need to create a large enough array
			   and then transfer the songs to the new array before assigning the new
			   array back to the list array*/

    if(x >= list.length ){
      Song [] list2 = new Song[x + 1];
      for(int z = 0; z< list.length; z++){
        list2[z] = list[z];
      }  
      list2[x] = s;
      list = list2;
    }
      else{
        list[x] = s;
      }
    
		
	}
	
	/** method to get a song from the playlist
		* @param x the position in the playlist to get the song from
		* @return return the song in the position specified*/
	public Song getSong(int x)
	{
		if (x < list.length){
      return(list[x]);
    }
    else{
      return(null);
    }
	}
	
	/** method to get the number of songs in the playlist
		* @return return the number of songs in the playlist*/
	public int numSongs()
	{
		return(list.length);
	}
	
	/** method to get the total length of the playlist specified in seconds
		* @return return the length of the playlist in seconds*/
	public int totalLength()
	{
		/* before accessing the length of an individual song you should ensure that the 
				song reference is not null*/
  int totalSec = 0;
  for(int x = 0; x < list.length; x++){
    if(list[x] != null){
      totalSec = totalSec + list[x].getLength();

    }
  }
  return(totalSec);
		
	}
	
	/** method to remove any songs from the specified artist
		* @param ar the artist of the songs to remove from the playlist*/
	public void removeArtist(String ar)
	{
    int occur = 0;
    for(int x = 0; x < list.length; x++){
      if (list[x].getArtist() == ar){
        occur++;
      }
    Song[] newlist = new Song[list.length - occur];
    int count = 0;
    for(int y = 0; y < list.length; y++){
      if (list[y].getArtist() != ar){
        newlist[count] = list[y];
        count++;
      }
    }
    list = newlist;
    
    }
		/* to remove the songs with the specified artist you will first need to count the
				occurances of that artist. 
				Then you will need to create a new smaller array
				Then you can copy the songs to the new array excluding the ones from the artist*/
		
	}
	
	/** method to remove any songs longer than the length specified
		* @param length length of songs to removed given in seconds*/
	public void removeLength(int length)
	{
    int occur = 0;
    for(int x = 0; x < list.length; x++){
      if (list[x].getLength() > length){
        occur++;
      }
    }
    Song[] newlist = new Song[list.length - occur];
    int count = 0;
    for(int y = 0; y < list.length; y++){
      if (list[y].getLength() <= length){
        newlist[count] = list[y];
        count++;
      }
    }
    list = newlist;

		// same as method above with creating a smaller array
	}
	
	/** method to shuffle the order of the playlist - use the card shuffling example from the arrays presentation to help*/
	public void shuffle()
	{
		// use the card shuffling example from the arrays presentation to help you with this
    int n = list.length;
    for(int x = 0; x < n; x++){
      int exchange = x + (int)(Math.random() * (n - x));
      Song temp = list[x];
      list[x] = list[exchange];
      list[exchange] = temp;
    }
		
	}
	
	/** equals method to determine if two playlists are equal
	 * The base class for all classes instantiated into objects in Java is "Object"
		* @param obj the object to be compared
		* @return return true or false if the playlists are equal*/
	public boolean equals(Object obj)
	{
		PlayList pl = (PlayList)obj;
		if(!Arrays.equals(list, pl.getList()))
			return false;
		return true;
	}
	
	/** toString() method to get the instance variables
		* @return return a String containing the instance variablees*/
	public String toString()
	{
		return Arrays.toString(list);
	}
}