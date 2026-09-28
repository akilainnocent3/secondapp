package defpackage;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class zmd0 {
    public final List<List<mf4>> a;
    public final int b;
    public final List<Double> c;
    public final List<Long> d;
    public final double e;
    public final String f;

    public zmd0(ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, double d, String str, int i) {
        this((List<? extends List<? extends mf4>>) ((i & 1) != 0 ? m2g.a : arrayList), -1, (List<Double>) ((i & 4) != 0 ? m2g.a : arrayList2), (List<Long>) ((i & 8) != 0 ? m2g.a : arrayList3), (i & 16) != 0 ? 0.0d : d, (i & 32) != 0 ? "" : str);
    }

    public static zmd0 a(zmd0 zmd0Var, List list, int i, List list2, double d, int i2) {
        if ((i2 & 1) != 0) {
            list = zmd0Var.a;
        }
        List list3 = list;
        if ((i2 & 2) != 0) {
            i = zmd0Var.b;
        }
        int i3 = i;
        if ((i2 & 4) != 0) {
            list2 = zmd0Var.c;
        }
        List list4 = list2;
        List<Long> list5 = zmd0Var.d;
        if ((i2 & 16) != 0) {
            d = zmd0Var.e;
        }
        String str = zmd0Var.f;
        zmd0Var.getClass();
        list3.getClass();
        list4.getClass();
        list5.getClass();
        str.getClass();
        return new zmd0((List<? extends List<? extends mf4>>) list3, i3, (List<Double>) list4, list5, d, str);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zmd0)) {
            return false;
        }
        zmd0 zmd0Var = (zmd0) obj;
        return Intrinsics.g(this.a, zmd0Var.a) && this.b == zmd0Var.b && Intrinsics.g(this.c, zmd0Var.c) && Intrinsics.g(this.d, zmd0Var.d) && Double.compare(this.e, zmd0Var.e) == 0 && Intrinsics.g(this.f, zmd0Var.f);
    }

    public final int hashCode() {
        return this.f.hashCode() + nrg0.a(ai50.a(ai50.a(gpp.a(this.b, this.a.hashCode() * 31, 31), 31, this.c), 31, this.d), 31, this.e);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("StackerGameState(boardConfiguration=");
        sb.append(this.a);
        sb.append(", collapsingRowIndex=");
        sb.append(this.b);
        sb.append(", rewards=");
        sb.append(this.c);
        sb.append(", stackerRefreshRatePerRow=");
        sb.append(this.d);
        sb.append(", currentRewardTotal=");
        sb.append(this.e);
        sb.append(", rewardCurrency=");
        return j26.a(sb, this.f, ')');
    }

    /* JADX WARN: Multi-variable type inference failed */
    public zmd0(List<? extends List<? extends mf4>> list, int i, List<Double> list2, List<Long> list3, double d, String str) {
        list.getClass();
        list2.getClass();
        list3.getClass();
        str.getClass();
        this.a = list;
        this.b = i;
        this.c = list2;
        this.d = list3;
        this.e = d;
        this.f = str;
    }

    public zmd0() {
        this((ArrayList) null, (ArrayList) null, (ArrayList) null, 0.0d, (String) null, 63);
    }
}
