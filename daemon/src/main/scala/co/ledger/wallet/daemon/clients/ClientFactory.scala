package co.ledger.wallet.daemon.clients

import co.ledger.wallet.daemon.async.MDCPropagatingExecutionContext
import co.ledger.wallet.daemon.libledger_core.async.ScalaThreadDispatcher


object ClientFactory {
  implicit val ec = MDCPropagatingExecutionContext.cachedNamedThreads("client-factory-thread-pool")

  lazy val webSocketClient = new ScalaWebSocketClient
  lazy val httpClient = new ScalaHttpClient
  lazy val threadDispatcher = new ScalaThreadDispatcher(MDCPropagatingExecutionContext.Implicits.global)
}