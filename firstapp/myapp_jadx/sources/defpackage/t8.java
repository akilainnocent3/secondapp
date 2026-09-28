package defpackage;

import com.sporty.android.permission.location.KN.qUnCRF;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class t8 {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;

    public t8(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.f = str6;
        this.g = str7;
    }

    public static t8 a(t8 t8Var, String str, String str2, String str3, String str4, String str5, String str6, String str7, int i) {
        if ((i & 1) != 0) {
            str = t8Var.a;
        }
        String str8 = str;
        if ((i & 2) != 0) {
            str2 = t8Var.b;
        }
        String str9 = str2;
        if ((i & 4) != 0) {
            str3 = t8Var.c;
        }
        String str10 = str3;
        if ((i & 8) != 0) {
            str4 = t8Var.d;
        }
        String str11 = str4;
        if ((i & 16) != 0) {
            str5 = t8Var.e;
        }
        String str12 = str5;
        if ((i & 32) != 0) {
            str6 = t8Var.f;
        }
        String str13 = str6;
        if ((i & 64) != 0) {
            str7 = t8Var.g;
        }
        t8Var.getClass();
        return new t8(str8, str9, str10, str11, str12, str13, str7);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t8)) {
            return false;
        }
        t8 t8Var = (t8) obj;
        return Intrinsics.g(this.a, t8Var.a) && Intrinsics.g(this.b, t8Var.b) && Intrinsics.g(this.c, t8Var.c) && Intrinsics.g(this.d, t8Var.d) && Intrinsics.g(this.e, t8Var.e) && Intrinsics.g(this.f, t8Var.f) && Intrinsics.g(this.g, t8Var.g);
    }

    public final int hashCode() {
        String str = this.a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.c;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.d;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.e;
        int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.f;
        int iHashCode6 = (iHashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.g;
        return iHashCode6 + (str7 != null ? str7.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbA = ux5.a("AccountHolder(lastAccount=", this.a, ", lastUserId=", this.b, ", lastAvatarUrl=");
        hxa.c(sbA, this.c, ", lastNickname=", this.d, ", loginType=");
        hxa.c(sbA, this.e, ", currentUserId=", this.f, qUnCRF.hUW);
        return uf80.a(sbA, this.g, ")");
    }

    public /* synthetic */ t8(int i) {
        this(null, null, null, null, null, null, null);
    }

    public t8() {
        this(0);
    }
}
