[See new repo](https://github.com/czono-motoharu/scala-tutorial1)


#Tachyon

##概要

> タキオン（tachyon、ギリシャ語のταχύς「速い」の意より）は、超光速で動くと仮定されている粒子である。


###現状ワークフロー
```
1. 本を購入したい人もしくは___がまとめて稟議をあげ、購入する。
2. 本が届いたら、ラベルシールを貼り、以下のページに記入する。
https://docs.google.com/XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX
3. 本を借りたい人はチャットワークにタスクを切る。
```

###問題
* チャットワークに手入力するのが煩雑
* 在庫管理ができない
* 誰が何を読んだのかわからない
* どんな本が書棚にあるのかわからない
* 書棚にある本がどんな本かわからない(レビュー情報、評判など)
* 稟議が面倒(稟議フローについて知る必要がある)
* ラベルを貼るのが面倒では？

###どうしよう
* Amazon 1-Click稟議
* バーコードで管理
* ソーシャル的機能も欲しいかも
* amazon連携,レビュー一覧
* ラベル
* 本はRFIDを利用した遠距離、人は社員証
* FOXで計測しよう


##成果物について
###サービスデザイン
* 本と借主のIdentifyをどうするか
* 利用フローを考える

###周辺技術/ライブラリー調査
サービスデザインと並行して、実装難易度やメリットデメリットを軽く把握する。

使用技術 			|　どうですか
	---				|			---
RFID 				| 無理っぽい　リーダーが高い　タグ設置が手間
NFC					| 本ならタグ貼り付けが手間だけど、IDmから社員情報取れるなら借主のIdentifyにつかいたい
バーコードリーダー 	| 最有力　タグ貼り付けなどが不要で実装も用意　iOSなどはライブラリも軽く触ってみてある
google login 		| 社員情報やメアド、名前、アイコンが取れるので最高だし簡単　これは使うしかない
amazon api		| 本の情報を取得するのに使う　これなしでは無理

##開発スケジュール
###設計(〜17)
* 画面遷移図
* 画面部品設計
* ER図

###実装(〜24)
###FW選定(21)
###サーバー実装(22,23)
###フロント実装(24-27)
###デザイン(28)
###デバッグ(29,30)
###予備+発表準備(30)


***


参考

* [signup with google](https://developers.google.com/identity/sign-in/web/)
* [AmazonAPI](http://qiita.com/na1412/items/1965d42a41b9eccd5126)
* [Amazon api doc](https://images-na.ssl-images-amazon.com/images/G/09/associates/paapi/dg/index.html?RG_ItemAttributes.html)



