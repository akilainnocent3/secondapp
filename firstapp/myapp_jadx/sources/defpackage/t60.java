package defpackage;

import android.content.Context;

/* JADX INFO: loaded from: classes.dex */
public final class t60 {
    public static final /* synthetic */ int a = 0;

    public static final pmd a(Context context) {
        float f = context.getResources().getConfiguration().fontScale;
        float f2 = context.getResources().getDisplayMetrics().density;
        f9i f9iVarA = g9i.a(f);
        if (f9iVarA == null) {
            f9iVarA = new ffs(f);
        }
        return new pmd(f2, f, f9iVarA);
    }
}
