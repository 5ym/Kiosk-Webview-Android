# Kisok-Webview-Android

ProfileOwner, DeviceOwnerを使用せずに^1端末の動作を制限することを目標としています。

^1 両者共にデバイスセットアップ時にアプリの設定が必要になるため既存の端末をそのままキオスク端末化したいため

## How to

1. Android5より搭載されているユーザー機能を使ってこのアプリ用のユーザーを作成する。
2. このアプリをインストールしデフォルトホームとブラウザをこのアプリに設定する。

## Feature

- [x] webviewの実装
- [x] コールバックでブラウザが開かれる際のサポート(デフォルトブラウザに設定することで対応)
- [x] ホームアプリとして実装(ホームボタン、最近のアプリのボタンを無効化できる)
- [x] 音量ボタン,バックキー無効化(電源ボタンは無効化できなかった物理的な手段で塞ぐべきだと思われる)
- [x] カメラパーミッションの実装(webview内で使用するため)
- [x] 没入モードの実装(上記実装した際には不要かも)
- [x] Lock Taskの実装(上記と同じく)
- [x] 画面常時点灯
- [x] スクリーンショット無効化
- [x] vue等で使うためDOM Storage有効化
- [ ] `TYPE_ACCESSIBILITY_OVERLAY`の実装(ステータスバーとナビバーを無効化するため)(AccessibilityServiceが必要らしいのだが実装方法不明)
- [ ] キオスクモード解除ショートカット実装(音量ボタン)