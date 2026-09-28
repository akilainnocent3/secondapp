package defpackage;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes5.dex */
public final class c2a0 {
    public final ArrayList a;
    public final ArrayList b;

    public c2a0(ArrayList arrayList, ArrayList arrayList2) {
        this.a = arrayList;
        this.b = arrayList2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c2a0)) {
            return false;
        }
        c2a0 c2a0Var = (c2a0) obj;
        return this.a.equals(c2a0Var.a) && this.b.equals(c2a0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "SmartRemixDiffResult(removing=" + this.a + ", adding=" + this.b + ")";
    }
}
