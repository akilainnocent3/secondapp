package defpackage;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class el1 extends she0.b {
    public final ehe0 a;
    public final ArrayList b;

    public el1(ehe0 ehe0Var, ArrayList arrayList) {
        if (ehe0Var == null) {
            bmy.a("Null surfaceEdge");
            throw null;
        }
        this.a = ehe0Var;
        this.b = arrayList;
    }

    @Override // she0.b
    public final List<v7z> a() {
        return this.b;
    }

    @Override // she0.b
    public final ehe0 b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof she0.b)) {
            return false;
        }
        she0.b bVar = (she0.b) obj;
        return this.a.equals(bVar.b()) && this.b.equals(bVar.a());
    }

    public final int hashCode() {
        return this.b.hashCode() ^ ((this.a.hashCode() ^ 1000003) * 1000003);
    }

    public final String toString() {
        return "In{surfaceEdge=" + this.a + ", outConfigs=" + this.b + "}";
    }
}
