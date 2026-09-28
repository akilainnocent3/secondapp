package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class e4j {
    public final boolean a;
    public final boolean b;
    public final int c;
    public final String d;
    public final qcn<w3j> e;

    public e4j(boolean z, boolean z2, int i, String str, qcn<w3j> qcnVar) {
        qcnVar.getClass();
        this.a = z;
        this.b = z2;
        this.c = i;
        this.d = str;
        this.e = qcnVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e4j)) {
            return false;
        }
        e4j e4jVar = (e4j) obj;
        return this.a == e4jVar.a && this.b == e4jVar.b && this.c == e4jVar.c && Intrinsics.g(this.d, e4jVar.d) && Intrinsics.g(this.e, e4jVar.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + gmf0.a(gpp.a(this.c, mtg0.a(Boolean.hashCode(this.a) * 31, 31, this.b), 31), 31, this.d);
    }

    public final String toString() {
        StringBuilder sbA = cwz.a("FruitHuntChipUIState(enabled=", ", isOpened=", ", selectedIndex=", this.a, this.b);
        f78.b(this.c, ", title=", this.d, ", chips=", sbA);
        return ts3.a(sbA, this.e, ")");
    }

    public e4j() {
        this(0);
    }

    public e4j(int i) {
        this(true, false, 0, "", n1a0.c);
    }
}
