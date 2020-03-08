package batch.rest;

import javax.batch.operations.JobOperator;
import javax.batch.runtime.BatchRuntime;
import javax.ws.rs.GET;
import javax.ws.rs.Path;


/**
 * sample1-batch.xml実行用API.
 *
 * @author yoshitaka
 *
 */
@Path("sample1")
public class Sample1Resource {

    @GET
    public String start() {
        JobOperator job = BatchRuntime.getJobOperator();
        long id = job.start("sample1-batch", null);
        return "sample1-batch Start. id = " + id;
    }
}