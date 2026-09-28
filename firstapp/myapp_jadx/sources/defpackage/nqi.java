package defpackage;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class nqi {
    public final String a;
    public final String b;
    public final int c;
    public final dja0 d;
    public final boolean e;
    public final y7i f;
    public final List<kl00> g;

    public nqi(String str, String str2, int i, dja0 dja0Var, boolean z, y7i y7iVar, List<kl00> list) {
        dja0Var.getClass();
        y7iVar.getClass();
        list.getClass();
        this.a = str;
        this.b = str2;
        this.c = i;
        this.d = dja0Var;
        this.e = z;
        this.f = y7iVar;
        this.g = list;
    }

    public static nqi a(nqi nqiVar, boolean z, y7i y7iVar, ArrayList arrayList, int i) {
        String str = nqiVar.a;
        String str2 = nqiVar.b;
        int i2 = nqiVar.c;
        dja0 dja0Var = nqiVar.d;
        if ((i & 16) != 0) {
            z = nqiVar.e;
        }
        boolean z2 = z;
        if ((i & 32) != 0) {
            y7iVar = nqiVar.f;
        }
        y7i y7iVar2 = y7iVar;
        List<kl00> list = arrayList;
        if ((i & 64) != 0) {
            list = nqiVar.g;
        }
        List<kl00> list2 = list;
        dja0Var.getClass();
        y7iVar2.getClass();
        list2.getClass();
        return new nqi(str, str2, i2, dja0Var, z2, y7iVar2, list2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nqi)) {
            return false;
        }
        nqi nqiVar = (nqi) obj;
        return this.a.equals(nqiVar.a) && Intrinsics.g(this.b, nqiVar.b) && this.c == nqiVar.c && this.d == nqiVar.d && this.e == nqiVar.e && Intrinsics.g(this.f, nqiVar.f) && Intrinsics.g(this.g, nqiVar.g);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        String str = this.b;
        return this.g.hashCode() + ((this.f.hashCode() + mtg0.a((this.d.hashCode() + gpp.a(this.c, (iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31)) * 31, 31, this.e)) * 31);
    }

    public final String toString() {
        StringBuilder sbA = ux5.a("ForYouAccountCodes(username=", this.a, ", avatarUrl=", this.b, ", followers=");
        sbA.append(this.c);
        sbA.append(", userType=");
        sbA.append(this.d);
        sbA.append(", isFollowed=");
        sbA.append(this.e);
        sbA.append(", followState=");
        sbA.append(this.f);
        sbA.append(", codes=");
        return ng1.a(sbA, this.g, ")");
    }
}
