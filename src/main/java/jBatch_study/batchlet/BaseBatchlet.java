package jBatch_study.batchlet;

import javax.batch.api.Batchlet;
import javax.enterprise.context.Dependent;

@Dependent
public class BaseBatchlet implements Batchlet {

	/**
	 * バッチレットが担う機能を実装するためのメソッド.
	 * <p>
	 * 戻り値に指定した文字列が終了ステータスとしてコンテナに格納される。
	 * </p>
	 *
	 * @return String コンテナに格納する終了ステータス.
	 */
	@Override
	public String process() throws Exception {

		return "SUCCESS";
	}

	/**
	 * ジョブ全体の中断が指示された場合に呼び出されるメソッド.
	 * <p>
	 * 中断時に実行する処理を記載する。
	 * 中断が指示されても、processの処理が中断される保証がない。
	 * </p>
	 */
	@Override
	public void stop() throws Exception {

	}

}
