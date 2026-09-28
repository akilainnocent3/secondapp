package defpackage;

import android.content.Context;

/* JADX INFO: loaded from: classes.dex */
public final class frg implements m730 {
    public final m730<Context> a;

    public frg(m730<Context> m730Var) {
        this.a = m730Var;
    }

    @Override // defpackage.m730
    public final Object get() {
        String packageName = this.a.get().getPackageName();
        if (packageName != null) {
            return packageName;
        }
        bmy.a("Cannot return null from a non-@Nullable @Provides method");
        return null;
    }
}
