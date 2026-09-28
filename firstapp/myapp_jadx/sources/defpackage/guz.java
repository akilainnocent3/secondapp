package defpackage;

import java.util.List;
import kotlin.collections.b;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class guz {
    public final int a;
    public final int b;
    public final float c;
    public final float d;
    public final float e;
    public final List<xw90> f;
    public final List<Integer> g;
    public final List<px80> h;
    public final long i;
    public final boolean j;
    public final i620 k;
    public final mw50 l;
    public final x0g m;

    public guz(List list, List list2, i620.b bVar, x0g x0gVar, int i) {
        this((i & 1) != 0 ? 0 : 90, (i & 2) != 0 ? 360 : 35, (i & 4) != 0 ? 30.0f : 0.0f, (i & 8) == 0 ? 3.0f : 0.0f, (i & 16) != 0 ? 0.9f : 0.95f, (i & 32) != 0 ? b.k(xw90.c, xw90.d, xw90.e) : list, (i & 64) != 0 ? b.k(16572810, 16740973, 16003181, 11832815) : list2, b.k(px80.d.a, px80.a.a), 2000L, true, (i & 1024) != 0 ? new i620.c(0.5d, 0.5d) : bVar, new mw50(31), x0gVar);
    }

    public static guz a(guz guzVar, int i, float f, List list, List list2, i620.c cVar, int i2) {
        int i3 = (i2 & 1) != 0 ? guzVar.a : i;
        int i4 = (i2 & 2) != 0 ? guzVar.b : 100;
        float f2 = (i2 & 4) != 0 ? guzVar.c : 10.0f;
        float f3 = (i2 & 8) != 0 ? guzVar.d : f;
        float f4 = guzVar.e;
        List<xw90> list3 = guzVar.f;
        List list4 = (i2 & 64) != 0 ? guzVar.g : list;
        List list5 = (i2 & 128) != 0 ? guzVar.h : list2;
        long j = guzVar.i;
        boolean z = guzVar.j;
        i620 i620Var = (i2 & 1024) != 0 ? guzVar.k : cVar;
        guzVar.getClass();
        mw50 mw50Var = guzVar.l;
        x0g x0gVar = guzVar.m;
        guzVar.getClass();
        list3.getClass();
        list4.getClass();
        list5.getClass();
        i620Var.getClass();
        mw50Var.getClass();
        x0gVar.getClass();
        return new guz(i3, i4, f2, f3, f4, list3, list4, list5, j, z, i620Var, mw50Var, x0gVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof guz)) {
            return false;
        }
        guz guzVar = (guz) obj;
        return this.a == guzVar.a && this.b == guzVar.b && Float.compare(this.c, guzVar.c) == 0 && Float.compare(this.d, guzVar.d) == 0 && Float.compare(this.e, guzVar.e) == 0 && Intrinsics.g(this.f, guzVar.f) && Intrinsics.g(this.g, guzVar.g) && Intrinsics.g(this.h, guzVar.h) && this.i == guzVar.i && this.j == guzVar.j && Intrinsics.g(this.k, guzVar.k) && Intrinsics.g(this.l, guzVar.l) && Intrinsics.g(this.m, guzVar.m);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v11, types: [int] */
    /* JADX WARN: Type inference failed for: r2v18 */
    /* JADX WARN: Type inference failed for: r2v19 */
    /* JADX WARN: Type inference failed for: r2v9, types: [int] */
    public final int hashCode() {
        int iA = f87.a(ai50.a(ai50.a(ai50.a(tvh.a(this.e, tvh.a(this.d, tvh.a(this.c, gpp.a(this.b, Integer.hashCode(this.a) * 31, 31), 31), 31), 31), 31, this.f), 31, this.g), 31, this.h), this.i, 31);
        boolean z = this.j;
        ?? r2 = z;
        if (z) {
            r2 = 1;
        }
        return this.m.hashCode() + ((this.l.hashCode() + gpp.a(0, (this.k.hashCode() + ((iA + r2) * 31)) * 31, 31)) * 31);
    }

    public final String toString() {
        StringBuilder sbA = dy5.a("Party(angle=", this.a, this.b, ", spread=", ", speed=");
        ew7.b(sbA, this.c, ", maxSpeed=", this.d, ", damping=");
        sbA.append(this.e);
        sbA.append(", size=");
        sbA.append(this.f);
        sbA.append(", colors=");
        qpu.a(", shapes=", ", timeToLive=", sbA, this.g, this.h);
        sbA.append(this.i);
        sbA.append(", fadeOutEnabled=");
        sbA.append(this.j);
        sbA.append(", position=");
        sbA.append(this.k);
        sbA.append(", delay=0, rotation=");
        sbA.append(this.l);
        sbA.append(", emitter=");
        sbA.append(this.m);
        sbA.append(")");
        return sbA.toString();
    }

    public guz(int i, int i2, float f, float f2, float f3, List list, List list2, List list3, long j, boolean z, i620 i620Var, mw50 mw50Var, x0g x0gVar) {
        list.getClass();
        list2.getClass();
        list3.getClass();
        i620Var.getClass();
        x0gVar.getClass();
        this.a = i;
        this.b = i2;
        this.c = f;
        this.d = f2;
        this.e = f3;
        this.f = list;
        this.g = list2;
        this.h = list3;
        this.i = j;
        this.j = z;
        this.k = i620Var;
        this.l = mw50Var;
        this.m = x0gVar;
    }
}
