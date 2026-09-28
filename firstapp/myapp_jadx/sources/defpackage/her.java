package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class her {
    public final String a;
    public final String b;
    public final String c;

    public her(String str, String str2, String str3) {
        str2.getClass();
        str3.getClass();
        this.a = str;
        this.b = str2;
        this.c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof her)) {
            return false;
        }
        her herVar = (her) obj;
        return Intrinsics.g(this.a, herVar.a) && Intrinsics.g(this.b, herVar.b) && Intrinsics.g(this.c, herVar.c);
    }

    public final int hashCode() {
        String str = this.a;
        return this.c.hashCode() + gmf0.a((str == null ? 0 : str.hashCode()) * 31, 31, this.b);
    }

    public final String toString() {
        return uf80.a(ux5.a("LNSimpleScreenShot(name=", this.a, ", won=", this.b, ", imagePath="), this.c, ")");
    }
}
