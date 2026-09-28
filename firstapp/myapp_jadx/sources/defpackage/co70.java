package defpackage;

import java.util.HashMap;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class co70<T> extends ynn<T> {
    public final boolean b;
    public final HashMap<String, T> c;

    public co70() {
        throw null;
    }

    public co70(yd2 yd2Var) {
        super(yd2Var);
        this.b = true;
        this.c = new HashMap<>();
    }

    @Override // defpackage.ynn
    public final T b(uf50 uf50Var) throws xqv {
        if (!Intrinsics.g(uf50Var.b.a, this.a.a) && !Intrinsics.g(uf50Var.g, this.a.a)) {
            throw new IllegalStateException(("Wrong Scope qualifier: trying to open instance for " + uf50Var.b.b + " in " + this.a).toString());
        }
        synchronized (this) {
            if (this.c.get(uf50Var.b.b) == null && this.b) {
                this.c.put(uf50Var.b.b, a(uf50Var));
            }
            Unit unit = Unit.a;
        }
        T t = this.c.get(uf50Var.b.b);
        if (t != null) {
            return t;
        }
        throw new xqv("Factory.get -Scoped instance not found for " + uf50Var.b.b + " in " + this.a);
    }
}
