package com.github.jodersky.flow

import java.io.IOException

class NoSuchPortException(message: String) extends IOException(message)
class PortInUseException(message: String) extends IOException(message)
class AccessDeniedException(message: String) extends IOException(message)
class IllegalBaudRateException(message: String) extends IOException(message)
class PortClosingException(message: String) extends IOException(message)