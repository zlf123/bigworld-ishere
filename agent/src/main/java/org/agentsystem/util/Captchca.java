package org.agentsystem.util;

import java.io.OutputStream;

public interface Captchca {
	String generate_captchca(OutputStream os) throws Exception;
}