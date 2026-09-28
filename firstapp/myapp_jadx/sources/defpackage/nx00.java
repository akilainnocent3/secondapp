package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class nx00 {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final hu00 g;

    public nx00(String str, String str2, String str3, String str4, String str5, String str6, hu00 hu00Var) {
        str.getClass();
        str2.getClass();
        str3.getClass();
        str4.getClass();
        hu00Var.getClass();
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.f = str6;
        this.g = hu00Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nx00)) {
            return false;
        }
        nx00 nx00Var = (nx00) obj;
        return Intrinsics.g(this.a, nx00Var.a) && Intrinsics.g(this.b, nx00Var.b) && Intrinsics.g(this.c, nx00Var.c) && Intrinsics.g(this.d, nx00Var.d) && Intrinsics.g(this.e, nx00Var.e) && Intrinsics.g(this.f, nx00Var.f) && this.g == nx00Var.g;
    }

    public final int hashCode() {
        int iA = gmf0.a(gmf0.a(gmf0.a(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d);
        String str = this.e;
        int iHashCode = (iA + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f;
        return this.g.hashCode() + ((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31);
    }

    public final String toString() {
        return "PiggyBashSpineData(piggyAtlasFilePath=" + this.a + ", piggySkeletonFilePath=" + this.b + ", piggyBackgroundAtlasFilePath=" + this.c + ", piggyBackgroundSkeletonFilePath=" + this.d + ", hammerSpawnSmokeAtlasFilePath=" + this.e + ", hammerSpawnSmokeSkeletonFilePath=" + this.f + ", pigType=" + this.g + ')';
    }
}
