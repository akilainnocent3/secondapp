package defpackage;

import android.content.Context;

/* JADX INFO: loaded from: classes.dex */
public final class ln70 implements m730 {
    public final m730<Context> a;

    public ln70(m730 m730Var) {
        this.a = m730Var;
    }

    @Override // defpackage.m730
    public final Object get() {
        return new kn70(Integer.valueOf(kn70.d).intValue(), this.a.get(), "com.google.android.datatransport.events");
    }
}
