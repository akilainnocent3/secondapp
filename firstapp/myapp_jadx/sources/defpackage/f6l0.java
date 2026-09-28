package defpackage;

import android.content.SharedPreferences;

/* JADX INFO: loaded from: classes4.dex */
public final class f6l0 {
    public final long a;
    public final /* synthetic */ j6l0 b;

    public /* synthetic */ f6l0(j6l0 j6l0Var, long j) {
        this.b = j6l0Var;
        hm20.e("health_monitor");
        hm20.b(j > 0);
        this.a = j;
    }

    public final void a() {
        j6l0 j6l0Var = this.b;
        j6l0Var.g();
        j6l0Var.a.k.getClass();
        long jCurrentTimeMillis = System.currentTimeMillis();
        SharedPreferences.Editor editorEdit = j6l0Var.k().edit();
        editorEdit.remove("health_monitor:count");
        editorEdit.remove("health_monitor:value");
        editorEdit.putLong("health_monitor:start", jCurrentTimeMillis);
        editorEdit.apply();
    }
}
