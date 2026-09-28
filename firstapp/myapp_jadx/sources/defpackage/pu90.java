package defpackage;

import kotlin.Unit;

/* JADX INFO: loaded from: classes8.dex */
public final class pu90<T> extends ynn<T> {
    public T b;

    public pu90() {
        throw null;
    }

    @Override // defpackage.ynn
    public final T a(uf50 uf50Var) {
        T t = this.b;
        if (t == null) {
            return (T) super.a(uf50Var);
        }
        if (t != null) {
            return t;
        }
        ib5.a("Single instance created couldn't return value");
        return null;
    }

    @Override // defpackage.ynn
    public final T b(uf50 uf50Var) {
        synchronized (this) {
            if (this.b == null) {
                this.b = a(uf50Var);
            }
            Unit unit = Unit.a;
        }
        T t = this.b;
        if (t != null) {
            return t;
        }
        ib5.a("Single instance created couldn't return value");
        return null;
    }
}
