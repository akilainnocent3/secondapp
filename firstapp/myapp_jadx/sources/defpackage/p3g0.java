package defpackage;

import android.text.TextUtils;
import java.lang.ref.WeakReference;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes4.dex */
public final class p3g0 {
    public static WeakReference<p3g0> b;
    public t390 a;

    public final synchronized j3g0 a() {
        String strPeek;
        j3g0 j3g0Var;
        t390 t390Var = this.a;
        synchronized (t390Var.b) {
            strPeek = t390Var.b.peek();
        }
        Pattern pattern = j3g0.d;
        j3g0Var = null;
        if (!TextUtils.isEmpty(strPeek)) {
            String[] strArrSplit = strPeek.split("!", -1);
            if (strArrSplit.length == 2) {
                j3g0Var = new j3g0(strArrSplit[0], strArrSplit[1]);
            }
        }
        return j3g0Var;
    }
}
