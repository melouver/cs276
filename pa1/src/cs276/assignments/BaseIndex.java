package cs276.assignments;

import java.nio.channels.FileChannel;

public interface BaseIndex {
	
	public PostingList readPosting (FileChannel fc) throws Throwable;
	
	public void writePosting (FileChannel fc, PostingList p) throws Throwable;
}
