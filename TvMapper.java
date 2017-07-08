package Assignment1;

import java.io.IOException;

import org.apache.hadoop.io.LongWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Mapper;

/*
 * @author abhilasha
 * Input key is the company name
 * Output key is total number of units sold
 */
public class TvMapper extends Mapper<Text,LongWritable,LongWritable,Text>
{
	@Override
	public void map(Text key,LongWritable value,Context context ) throws IOException, InterruptedException
	{
		
		//We need to sort the records on basis of number of units sold. Hence, switching the key-value
		System.out.println("Output of mapper is ["+value.get()+" , "+key.toString()+"]");
		context.write(value,key);
	}
}
