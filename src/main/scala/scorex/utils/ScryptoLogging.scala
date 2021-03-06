package scorex.utils

import org.slf4j.LoggerFactory

trait ScryptoLogging {
  protected def log = LoggerFactory.getLogger(this.getClass)
}
