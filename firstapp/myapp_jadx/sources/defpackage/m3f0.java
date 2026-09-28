package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class m3f0 {
    public final uf00<tyt> a;
    public final tyt b;
    public final int c;

    /* JADX WARN: Multi-variable type inference failed */
    public m3f0(uf00<? extends tyt> uf00Var, tyt tytVar, int i) {
        tytVar.getClass();
        this.a = uf00Var;
        this.b = tytVar;
        this.c = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m3f0)) {
            return false;
        }
        m3f0 m3f0Var = (m3f0) obj;
        return this.a.equals(m3f0Var.a) && Intrinsics.g(this.b, m3f0Var.b) && this.c == m3f0Var.c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.c) + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TabState(tabs=");
        sb.append(this.a);
        sb.append(", selectedTab=");
        sb.append(this.b);
        sb.append(", selectedIndex=");
        return zk1.a(this.c, ")", sb);
    }
}
