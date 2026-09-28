package defpackage;

import android.content.Context;

/* JADX INFO: loaded from: classes4.dex */
public final class uvi {

    public interface a {
        e150 J();
    }

    public static boolean a(Context context) {
        e150 e150VarJ = ((a) qag.a(context, a.class)).J();
        z7b.c(e150VarJ.v <= 1, "Cannot bind the flag @DisableFragmentGetContextFix more than once.", new Object[0]);
        if (e150VarJ.isEmpty()) {
            return true;
        }
        return ((Boolean) ((g3) e150VarJ.iterator()).next()).booleanValue();
    }
}
