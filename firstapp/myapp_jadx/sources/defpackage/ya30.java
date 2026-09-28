package defpackage;

import android.util.Log;
import java.io.Serializable;

/* JADX INFO: loaded from: classes4.dex */
public final class ya30 {
    public static void a(Serializable serializable) {
        Log.e("RootBeer", b().concat(String.valueOf(serializable)));
        Log.e("QLog", b().concat(String.valueOf(serializable)));
    }

    public static String b() {
        StackTraceElement[] stackTrace = new Throwable().getStackTrace();
        String methodName = stackTrace[2].getMethodName();
        String className = stackTrace[2].getClassName();
        return className.substring(className.lastIndexOf(46) + 1) + ": " + methodName + "() [" + stackTrace[2].getLineNumber() + "] - ";
    }
}
