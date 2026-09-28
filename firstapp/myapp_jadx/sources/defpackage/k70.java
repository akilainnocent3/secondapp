package defpackage;

import android.content.Context;
import android.graphics.Typeface;
import android.os.Build;

/* JADX INFO: loaded from: classes.dex */
public final class k70 {
    public final Context a;

    public k70(Context context) {
        this.a = context.getApplicationContext();
    }

    /* JADX WARN: Code duplicated, block: B:44:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:47:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:48:0x00bc  */
    /* JADX WARN: Code duplicated, block: B:52:0x00e4 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0127, code lost:
    
        if (r14 == r1) goto L63;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(defpackage.z7i r13, defpackage.x1b r14) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 322
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.k70.a(z7i, x1b):java.lang.Object");
    }

    public final Typeface b(z7i z7iVar) {
        if (z7iVar instanceof a5l) {
            ogf.a((a5l) z7iVar, "GoogleFont only support async loading: ");
            return null;
        }
        if (!(z7iVar instanceof dh50)) {
            return null;
        }
        dh50 dh50Var = (dh50) z7iVar;
        int i = dh50Var.a;
        Context context = this.a;
        Typeface typefaceB = th50.b(context, i);
        typefaceB.getClass();
        return Build.VERSION.SDK_INT >= 26 ? m9h0.a(typefaceB, dh50Var.d, context) : typefaceB;
    }
}
