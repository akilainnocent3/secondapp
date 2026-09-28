package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class l8i {
    public final f8i a;
    public final t9i b;

    public l8i(f8i f8iVar, t9i t9iVar) {
        f8iVar.getClass();
        t9iVar.getClass();
        this.a = f8iVar;
        this.b = t9iVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l8i)) {
            return false;
        }
        l8i l8iVar = (l8i) obj;
        return Intrinsics.g(this.a, l8iVar.a) && Intrinsics.g(this.b, l8iVar.b);
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + this.b.a;
    }

    public final String toString() {
        return "FontFamilyWithWeight(fontFamily=" + this.a + ", weight=" + this.b + ")";
    }

    public l8i(f8i f8iVar) {
        this(f8iVar, t9i.B);
    }
}
