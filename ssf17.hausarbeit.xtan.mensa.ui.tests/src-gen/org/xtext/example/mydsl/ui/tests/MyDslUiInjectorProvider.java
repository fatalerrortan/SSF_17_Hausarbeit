/*
 * generated by Xtext 2.10.0
 */
package org.xtext.example.mydsl.ui.tests;

import com.google.inject.Injector;
import org.eclipse.xtext.junit4.IInjectorProvider;
import ssf17.hausarbeit.xtan.mensa.ui.internal.MensaActivator;

public class MyDslUiInjectorProvider implements IInjectorProvider {

	@Override
	public Injector getInjector() {
		return MensaActivator.getInstance().getInjector("org.xtext.example.mydsl.MyDsl");
	}

}