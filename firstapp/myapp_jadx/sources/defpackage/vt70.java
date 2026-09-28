package defpackage;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class vt70 {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final vw70 e;
    public final List<qz70> f;
    public final List<n080> g;
    public final List<fu70> h;
    public final List<zv70> i;

    public vt70(String str, String str2, String str3, String str4, vw70 vw70Var, List<qz70> list, List<n080> list2, List<fu70> list3, List<zv70> list4) {
        str.getClass();
        str2.getClass();
        str3.getClass();
        str4.getClass();
        list.getClass();
        list2.getClass();
        list3.getClass();
        list4.getClass();
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = vw70Var;
        this.f = list;
        this.g = list2;
        this.h = list3;
        this.i = list4;
    }

    public static vt70 a(vt70 vt70Var, vw70 vw70Var, ArrayList arrayList, int i) {
        String str = vt70Var.a;
        String str2 = vt70Var.b;
        String str3 = vt70Var.c;
        String str4 = vt70Var.d;
        if ((i & 16) != 0) {
            vw70Var = vt70Var.e;
        }
        vw70 vw70Var2 = vw70Var;
        List<qz70> list = vt70Var.f;
        List<n080> list2 = vt70Var.g;
        List<fu70> list3 = arrayList;
        if ((i & 128) != 0) {
            list3 = vt70Var.h;
        }
        List<fu70> list4 = list3;
        List<zv70> list5 = vt70Var.i;
        str.getClass();
        str2.getClass();
        str3.getClass();
        str4.getClass();
        list.getClass();
        list2.getClass();
        list4.getClass();
        list5.getClass();
        return new vt70(str, str2, str3, str4, vw70Var2, list, list2, list4, list5);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vt70)) {
            return false;
        }
        vt70 vt70Var = (vt70) obj;
        return Intrinsics.g(this.a, vt70Var.a) && Intrinsics.g(this.b, vt70Var.b) && Intrinsics.g(this.c, vt70Var.c) && Intrinsics.g(this.d, vt70Var.d) && this.e.equals(vt70Var.e) && Intrinsics.g(this.f, vt70Var.f) && Intrinsics.g(this.g, vt70Var.g) && Intrinsics.g(this.h, vt70Var.h) && Intrinsics.g(this.i, vt70Var.i);
    }

    public final int hashCode() {
        return this.i.hashCode() + ai50.a(ai50.a(ai50.a((this.e.hashCode() + gmf0.a(gmf0.a(gmf0.a(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d)) * 31, 31, this.f), 31, this.g), 31, this.h);
    }

    public final String toString() {
        StringBuilder sbA = ux5.a("SearchCategory(type=", this.a, ", categoryId=", this.b, ", categoryName=");
        hxa.c(sbA, this.c, ", categoryIcon=", this.d, ", matches=");
        sbA.append(this.e);
        sbA.append(", teams=");
        sbA.append(this.f);
        sbA.append(", tournaments=");
        qpu.a(", players=", ", games=", sbA, this.g, this.h);
        return ng1.a(sbA, this.i, ")");
    }
}
