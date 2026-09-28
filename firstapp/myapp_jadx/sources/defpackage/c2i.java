package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class c2i {
    public vhv a;
    public vhv b;

    public c2i() {
        z1i.a aVar = z1i.a.a;
    }

    public final void a(mzo mzoVar, mzo mzoVar2, long j) {
        long jA = dcu.a(j, btr.a);
        if (mzoVar != null) {
            int iH = kxa.h(jA);
            int i = y1i.a;
            int iA0 = mzoVar.a0(iH);
            new yvo(yvo.a(iA0, mzoVar.R(iA0)));
            this.a = mzoVar instanceof vhv ? (vhv) mzoVar : null;
        }
        if (mzoVar2 != null) {
            int iH2 = kxa.h(jA);
            int i2 = y1i.a;
            int iA1 = mzoVar2.a0(iH2);
            new yvo(yvo.a(iA1, mzoVar2.R(iA1)));
            this.b = mzoVar2 instanceof vhv ? (vhv) mzoVar2 : null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c2i)) {
            return false;
        }
        z1i.a aVar = z1i.a.a;
        return true;
    }

    public final int hashCode() {
        return Integer.hashCode(0) + gpp.a(0, z1i.a.a.hashCode() * 31, 31);
    }

    public final String toString() {
        return "FlowLayoutOverflowState(type=" + z1i.a.a + ", minLinesToShowCollapse=0, minCrossAxisSizeToShowCollapse=0)";
    }
}
