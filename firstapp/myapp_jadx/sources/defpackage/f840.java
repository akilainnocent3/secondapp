package defpackage;

import android.graphics.Bitmap;
import android.os.Looper;
import java.util.concurrent.CancellationException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class f840 {
    public static final qse a(nan nanVar, pjd pjdVar) {
        e5f0 e5f0Var = nanVar.c;
        if (!(e5f0Var instanceof vbn)) {
            return new pry(pjdVar);
        }
        w9i0 w9i0VarA = x9i0.a(((vbn) e5f0Var).getView());
        synchronized (w9i0VarA) {
            t9i0 t9i0Var = w9i0VarA.b;
            if (t9i0Var != null) {
                Bitmap.Config[] configArr = vsh0.a;
                if (Intrinsics.g(Looper.myLooper(), Looper.getMainLooper()) && w9i0VarA.e) {
                    w9i0VarA.e = false;
                    t9i0Var.b = pjdVar;
                    return t9i0Var;
                }
            }
            jvd0 jvd0Var = w9i0VarA.c;
            if (jvd0Var != null) {
                jvd0Var.cancel((CancellationException) null);
            }
            w9i0VarA.c = null;
            t9i0 t9i0Var2 = new t9i0(w9i0VarA.a, pjdVar);
            w9i0VarA.b = t9i0Var2;
            return t9i0Var2;
        }
    }
}
