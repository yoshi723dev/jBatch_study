package batch.chunk;

import java.io.Serializable;
import java.util.List;

import javax.batch.api.chunk.AbstractItemWriter;

public class Sample1Writer extends AbstractItemWriter {

	@Override
	public void open(Serializable checkpoint) throws Exception {

	}

	@Override
	public void close() throws Exception {

	}

	/**
	 * writeItems メソッド実行後にトランザクションがコミットされ、新たなトランザクションが開始される。
	 * writeItems メソッド実行後、バッチ処理が readItem メソッド実行から繰り返される.
	 *
	 * @param List<Object> ItemProcessor.processItem()の戻り値
	 */
	@Override
	public void writeItems(List<Object> items) throws Exception {
		// TODO 自動生成されたメソッド・スタブ
	}

	@Override
	public Serializable checkpointInfo() throws Exception {
		return null;
	}

}
