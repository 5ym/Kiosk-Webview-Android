# Kisok-Webview-Android
ProfileOwner, DeviceOwnerを使用せずに[^1]端末の動作を制限することを目標としています。
[^1]: 両者共にデバイスセットアップ時にアプリの設定が必要になるため既存の端末をそのままキオスク端末化したいため

## Feature
- [x] webviewの実装
- [ ] intentのサポート
- [ ] コールバックでブラウザが開かれる際のサポート
- [x] ホームアプリとして実装
- [x] カメラパーミッションの実装
- [ ] システム領域(ステータスバーやナビバー)に表示領域をオーバーライドして操作不能にする
- [x] 没入モードの実装(上記実装した際には不要かも)
- [x] Lock Taskの実装(上記と同じく)
- [ ] キオスクモード解除ショートカット実装(任意の場所複数回タッチ)
