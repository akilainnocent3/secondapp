package defpackage;

import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class lk1 extends sm70 {
    public final ss7 a;
    public final HashMap b;

    public lk1(ss7 ss7Var, HashMap map) {
        this.a = ss7Var;
        this.b = map;
    }

    @Override // defpackage.sm70
    public final ss7 a() {
        return this.a;
    }

    @Override // defpackage.sm70
    public final Map<kw20, sm70.a> c() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof sm70)) {
            return false;
        }
        sm70 sm70Var = (sm70) obj;
        return this.a.equals(sm70Var.a()) && this.b.equals(sm70Var.c());
    }

    public final int hashCode() {
        return this.b.hashCode() ^ ((this.a.hashCode() ^ 1000003) * 1000003);
    }

    public final String toString() {
        return "SchedulerConfig{clock=" + this.a + ", values=" + this.b + "}";
    }
}
