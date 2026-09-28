package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class dh50 implements z7i {
    public final int a;
    public final t9i b;
    public final int c;
    public final s9i d;

    public dh50(int i, t9i t9iVar, int i2, s9i s9iVar) {
        this.a = i;
        this.b = t9iVar;
        this.c = i2;
        this.d = s9iVar;
    }

    @Override // defpackage.z7i
    public final int a() {
        return 0;
    }

    @Override // defpackage.z7i
    public final t9i b() {
        return this.b;
    }

    @Override // defpackage.z7i
    public final int c() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dh50)) {
            return false;
        }
        dh50 dh50Var = (dh50) obj;
        return this.a == dh50Var.a && Intrinsics.g(this.b, dh50Var.b) && this.c == dh50Var.c && this.d.equals(dh50Var.d);
    }

    public final int hashCode() {
        return this.d.a.hashCode() + gpp.a(0, gpp.a(this.c, ((this.a * 31) + this.b.a) * 31, 31), 31);
    }

    public final String toString() {
        return "ResourceFont(resId=" + this.a + ", weight=" + this.b + ", style=" + ((Object) n9i.b(this.c)) + ", loadingStrategy=Blocking)";
    }
}
