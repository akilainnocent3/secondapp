package defpackage;

import android.content.Context;

/* JADX INFO: loaded from: classes4.dex */
public final class r7k0 {
    public static final r7k0 b;
    public jmz a;

    static {
        r7k0 r7k0Var = new r7k0();
        r7k0Var.a = null;
        b = r7k0Var;
    }

    public static jmz a(Context context) {
        jmz jmzVar;
        r7k0 r7k0Var = b;
        synchronized (r7k0Var) {
            try {
                jmzVar = r7k0Var.a;
                if (jmzVar == null) {
                    if (context.getApplicationContext() != null) {
                        context = context.getApplicationContext();
                    }
                    jmzVar = new jmz(context);
                    r7k0Var.a = jmzVar;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return jmzVar;
    }
}
