package defpackage;

import com.appsflyer.internal.v;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class r680 {
    public final String a;
    public final String b;
    public final Integer c;

    public r680(String str, int i, String str2, Integer num) {
        str2 = (i & 2) != 0 ? null : str2;
        num = (i & 4) != 0 ? null : num;
        str.getClass();
        this.a = str;
        this.b = str2;
        this.c = num;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r680)) {
            return false;
        }
        r680 r680Var = (r680) obj;
        return Intrinsics.g(this.a, r680Var.a) && Intrinsics.g(this.b, r680Var.b) && Intrinsics.g(this.c, r680Var.c);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        String str = this.b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        Integer num = this.c;
        return iHashCode2 + (num != null ? num.hashCode() : 0);
    }

    public final String toString() {
        return v.a(ux5.a("SelectChipItem(label=", this.a, ", iconUrl=", this.b, ", iconRes="), this.c, ")");
    }
}
