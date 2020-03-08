package batch.chunk;

import javax.batch.api.chunk.ItemProcessor;

public class Sample1Processor implements ItemProcessor {

	/**
	 * processItemメソッドで一定数(JOB設定ファイルを作成するにて設定方法を解説)のエンティティを返却した時点で
	 * 後続するItemWriterのwriteItemsメソッドが実行される.
	 *
	 * @param Object ItemReaderのreadItem()で戻り値として設定された情報.
	 * @return Object ItemWriteのwriteItem()に渡す情報.
	 */
	@Override
	public Object processItem(Object item) throws Exception {
        return item;
	}

}
