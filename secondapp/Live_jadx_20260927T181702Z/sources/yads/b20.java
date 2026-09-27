package yads;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class b20 implements vj3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f147019a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f147020b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f147021c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final List f147022d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final e20 f147023e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f147024f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final n03 f147025g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f147026h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f147027i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final String f147028j;

    public b20(ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, ArrayList arrayList4, e20 e20Var, String str, n03 n03Var, String str2, int i10, String str3) {
        this.f147019a = arrayList;
        this.f147020b = arrayList2;
        this.f147021c = arrayList3;
        this.f147022d = arrayList4;
        this.f147023e = e20Var;
        this.f147024f = str;
        this.f147025g = n03Var;
        this.f147026h = str2;
        this.f147027i = i10;
        this.f147028j = str3;
    }

    @Override // yads.vj3
    public final Map a() {
        List<x73> list = this.f147022d;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (x73 x73Var : list) {
            String str = x73Var.f157706a;
            Object arrayList = linkedHashMap.get(str);
            if (arrayList == null) {
                arrayList = new ArrayList();
                linkedHashMap.put(str, arrayList);
            }
            ((List) arrayList).add(x73Var.f157707b);
        }
        return linkedHashMap;
    }

    public final e20 b() {
        return this.f147023e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b20)) {
            return false;
        }
        b20 b20Var = (b20) obj;
        return kotlin.jvm.internal.m0.g(this.f147019a, b20Var.f147019a) && kotlin.jvm.internal.m0.g(this.f147020b, b20Var.f147020b) && kotlin.jvm.internal.m0.g(this.f147021c, b20Var.f147021c) && kotlin.jvm.internal.m0.g(this.f147022d, b20Var.f147022d) && kotlin.jvm.internal.m0.g(this.f147023e, b20Var.f147023e) && kotlin.jvm.internal.m0.g(this.f147024f, b20Var.f147024f) && kotlin.jvm.internal.m0.g(this.f147025g, b20Var.f147025g) && kotlin.jvm.internal.m0.g(this.f147026h, b20Var.f147026h) && this.f147027i == b20Var.f147027i && kotlin.jvm.internal.m0.g(this.f147028j, b20Var.f147028j);
    }

    public final int hashCode() {
        int iA = eb.a(this.f147022d, eb.a(this.f147021c, eb.a(this.f147020b, this.f147019a.hashCode() * 31, 31), 31), 31);
        e20 e20Var = this.f147023e;
        int iHashCode = (iA + (e20Var == null ? 0 : e20Var.hashCode())) * 31;
        String str = this.f147024f;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        n03 n03Var = this.f147025g;
        int iHashCode3 = (iHashCode2 + (n03Var == null ? 0 : n03Var.hashCode())) * 31;
        String str2 = this.f147026h;
        int iA2 = nd3.a(this.f147027i, (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31, 31);
        String str3 = this.f147028j;
        return iA2 + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        return "Creative(mediaFiles=" + this.f147019a + ", interactiveCreativeFiles=" + this.f147020b + ", icons=" + this.f147021c + ", trackingEventsList=" + this.f147022d + ", creativeExtensions=" + this.f147023e + ", clickThroughUrl=" + this.f147024f + ", skipOffset=" + this.f147025g + ", id=" + this.f147026h + ", durationMillis=" + this.f147027i + ", adParameters=" + this.f147028j + gi.j.f86771d;
    }
}
