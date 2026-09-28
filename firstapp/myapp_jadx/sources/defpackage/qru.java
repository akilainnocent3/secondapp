package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class qru {
    public final qcn<String> a;
    public final qcn<String> b;
    public final int c;

    public qru(qcn<String> qcnVar, qcn<String> qcnVar2, int i) {
        this.a = qcnVar;
        this.b = qcnVar2;
        this.c = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qru)) {
            return false;
        }
        qru qruVar = (qru) obj;
        return Intrinsics.g(this.a, qruVar.a) && Intrinsics.g(this.b, qruVar.b) && this.c == qruVar.c;
    }

    public final int hashCode() {
        qcn<String> qcnVar = this.a;
        int iHashCode = (qcnVar == null ? 0 : qcnVar.hashCode()) * 31;
        qcn<String> qcnVar2 = this.b;
        return Integer.hashCode(this.c) + ((iHashCode + (qcnVar2 != null ? qcnVar2.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MarketSubTitleUiState(titleList=");
        sb.append(this.a);
        sb.append(", specifierList=");
        sb.append(this.b);
        sb.append(", selectedIndex=");
        return zk1.a(this.c, ")", sb);
    }

    public /* synthetic */ qru(int i) {
        this(null, null, -1);
    }

    public qru() {
        this(0);
    }
}
