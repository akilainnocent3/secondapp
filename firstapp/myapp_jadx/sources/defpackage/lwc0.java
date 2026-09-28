package defpackage;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class lwc0 {
    public final String a;
    public final h5d0 b;
    public final h5d0 c;
    public final List<owc0> d;

    public lwc0(String str, h5d0 h5d0Var, h5d0 h5d0Var2, List<owc0> list) {
        list.getClass();
        this.a = str;
        this.b = h5d0Var;
        this.c = h5d0Var2;
        this.d = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lwc0)) {
            return false;
        }
        lwc0 lwc0Var = (lwc0) obj;
        return this.a.equals(lwc0Var.a) && this.b.equals(lwc0Var.b) && this.c.equals(lwc0Var.c) && Intrinsics.g(this.d, lwc0Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "SportyPenaltyEvent(id=" + this.a + ", leftTeam=" + this.b + ", rightTeam=" + this.c + ", markets=" + this.d + ")";
    }
}
