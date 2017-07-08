package Assignment1;
import java.io.IOException;

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.fs.Path;
import org.apache.hadoop.io.LongWritable;
import org.apache.hadoop.io.SequenceFile;
import org.apache.hadoop.io.Text;
public class SequenceFileReader 
{
	public static void main(String[] args) throws IOException
	{
		Path inputPath = new Path("/abhilasha/TVSalesOutput/part-r-00000");
		SequenceFile.Reader reader = new SequenceFile.Reader(new Configuration(), SequenceFile.Reader.file(inputPath));
		System.out.println("Is file compressed : "+reader.isCompressed());
		
		Text key = new Text();
		LongWritable value = new LongWritable();
		while(reader.next(key, value))
		{
			System.out.println("key : "+key+"\t\tValue : "+value);
		}
		
		reader.close();
	}
}
