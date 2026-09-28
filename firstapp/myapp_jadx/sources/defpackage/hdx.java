package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class hdx {
    public final String a;
    public final boolean b;
    public final int c;
    public final String d;

    public hdx(int i, String str, String str2, boolean z) {
        this.a = str;
        this.b = z;
        this.c = i;
        this.d = str2;
    }

    public static hdx a(hdx hdxVar, String str, boolean z, int i, String str2, int i2) {
        if ((i2 & 1) != 0) {
            str = hdxVar.a;
        }
        if ((i2 & 2) != 0) {
            z = hdxVar.b;
        }
        if ((i2 & 4) != 0) {
            i = hdxVar.c;
        }
        if ((i2 & 8) != 0) {
            str2 = hdxVar.d;
        }
        hdxVar.getClass();
        str.getClass();
        str2.getClass();
        return new hdx(i, str, str2, z);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hdx)) {
            return false;
        }
        hdx hdxVar = (hdx) obj;
        return Intrinsics.g(this.a, hdxVar.a) && this.b == hdxVar.b && this.c == hdxVar.c && Intrinsics.g(this.d, hdxVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + gpp.a(this.c, mtg0.a(this.a.hashCode() * 31, 31, this.b), 31);
    }

    public final String toString() {
        StringBuilder sbA = z620.a("NameUpdateByNINState(previousNin=", this.a, ", isLoading=", ", bizCode=", this.b);
        sbA.append(this.c);
        sbA.append(", errorMessage=");
        sbA.append(this.d);
        sbA.append(")");
        return sbA.toString();
    }

    public /* synthetic */ hdx(int i) {
        this(0, "", "", false);
    }

    public hdx() {
        this(0);
    }
}
