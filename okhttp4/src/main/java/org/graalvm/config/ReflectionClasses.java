package org.graalvm.config;

import com.oracle.svm.core.annotate.AutomaticFeature;
import org.graalvm.nativeimage.hosted.Feature;

@AutomaticFeature
class ReflectionClasses implements Feature {

	@Override
	public void duringSetup(DuringSetupAccess access) {
		System.out.printf("java.library.path=%s" + System.getProperty("java.library.path"));
		System.loadLibrary("sunec");
	}

}

