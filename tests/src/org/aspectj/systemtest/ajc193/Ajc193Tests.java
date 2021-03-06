/*******************************************************************************
 * Copyright (c) 2018 Contributors
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Andy Clement - initial API and implementation
 *******************************************************************************/
package org.aspectj.systemtest.ajc193;

import java.io.File;

import org.aspectj.testing.XMLBasedAjcTestCase;
import org.aspectj.testing.XMLBasedAjcTestCaseForJava10OrLater;

import junit.framework.Test;

/**
 * @author Andy Clement
 */
public class Ajc193Tests extends XMLBasedAjcTestCaseForJava10OrLater {

	// ---

	public static Test suite() {
		return XMLBasedAjcTestCase.loadSuite(Ajc193Tests.class);
	}

	@Override
	protected File getSpecFile() {
        return getClassResource("ajc193.xml");
	}

}
