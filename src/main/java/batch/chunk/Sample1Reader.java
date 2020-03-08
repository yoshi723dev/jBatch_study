package batch.chunk;

import java.io.Serializable;

import javax.batch.api.chunk.ItemReader;

public class Sample1Reader implements ItemReader {

	/**
	 * 情報が格納されているリソース（DBやファイル）を開く処理を実装するメソッド.
	 *
	 * @param checkpoint チェックポイントの情報
	 */
	@Override
	public void open(Serializable checkpoint) throws Exception {
		// TODO 自動生成されたメソッド・スタブ
	}

	/**
	 * openでアクセスしたリソースを閉じる処理を記述するメソッド.
	 * <p>
	 * 例外が発生して途中で処理が停止する場合もcloseは必ず呼び出される。
	 * </p>
	 */
	@Override
	public void close() throws Exception {
		// TODO 自動生成されたメソッド・スタブ
	}

	/**
	 * openで開いたリソースを1行ずつ読み取って処理を実行する.
	 *
	 * @return Object ItemProcessorに渡される。読み取るレコードがない場合はnullを返却する。
	 */
	@Override
	public Object readItem() throws Exception {
        return null;
	}

	/**
	 * 処理の途中経過を記録するためのメソッド.
	 *
	 * @return Serializable 処理の途中経過。openの引数として渡される。nullを返却した場合は最初から実行される？
	 */
	@Override
	public Serializable checkpointInfo() throws Exception {
		// TODO 自動生成されたメソッド・スタブ
		return null;
	}

}
