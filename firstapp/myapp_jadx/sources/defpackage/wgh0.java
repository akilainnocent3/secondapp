package defpackage;

import java.util.HashMap;

/* JADX INFO: loaded from: classes8.dex */
public final class wgh0 extends HashMap<e21<?>, Object> implements m21, n21 {
    public final <T> n21 d(e21<T> e21Var, T t) {
        put(e21Var, t);
        return this;
    }

    @Override // defpackage.m21
    public final <T> T e(e21<T> e21Var) {
        return (T) get(e21Var);
    }

    @Override // defpackage.m21
    public final xw0 toBuilder() {
        xw0 xw0Var = new xw0();
        xw0Var.c(this);
        return xw0Var;
    }
}
