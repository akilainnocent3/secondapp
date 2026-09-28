package defpackage;

import android.os.Trace;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class ww20 {
    public static final ww20 b = new ww20(new fas());
    public final fas a;

    public ww20(fas fasVar) {
        this.a = fasVar;
    }

    public final void a(ibs ibsVar, k36 k36Var, pnh0... pnh0VarArr) {
        int iB;
        k36Var.getClass();
        fas fasVar = this.a;
        pnh0[] pnh0VarArr2 = (pnh0[]) Arrays.copyOf(pnh0VarArr, pnh0VarArr.length);
        Trace.beginSection(sig0.d("CX:bindToLifecycle"));
        try {
            c46 c46Var = fasVar.e;
            if (c46Var == null) {
                iB = 0;
            } else {
                g26 g26Var = c46Var.g;
                if (g26Var == null) {
                    throw new IllegalStateException("CameraX not initialized yet.");
                }
                iB = g26Var.f().b();
            }
            if (iB == 2) {
                throw new UnsupportedOperationException("bindToLifecycle for single camera is not supported in concurrent camera mode, call unbindAll() first");
            }
            fasVar.d(1);
            fas.a(fasVar, ibsVar, k36Var, new e6s(m2g.a, ay0.v(pnh0VarArr2)));
            Trace.endSection();
        } catch (Throwable th) {
            Trace.endSection();
            throw th;
        }
    }
}
