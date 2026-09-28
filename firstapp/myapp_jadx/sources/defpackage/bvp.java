package defpackage;

import android.content.Context;

/* JADX INFO: loaded from: classes4.dex */
public final class bvp extends p32 {
    public int a;

    public final void i(g1y g1yVar, String str, String str2, Context context) {
        f1y f1yVar = new f1y();
        f1yVar.e = g1y.b(str);
        f1yVar.b = g1y.b(str2);
        g1yVar.f(f1yVar);
        int i = this.a;
        this.a = i + 1;
        p32.h(context, i, g1yVar.a());
    }
}
