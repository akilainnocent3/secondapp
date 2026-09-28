package defpackage;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class h2o {
    public final int a;
    public final int b;
    public final String c;
    public final List<Integer> d;
    public final int e;
    public final String f;
    public final String g;
    public final String h;
    public final String i;

    public h2o(int i, int i2, String str, List<Integer> list, int i3, String str2, String str3, String str4, String str5) {
        list.getClass();
        this.a = i;
        this.b = i2;
        this.c = str;
        this.d = list;
        this.e = i3;
        this.f = str2;
        this.g = str3;
        this.h = str4;
        this.i = str5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h2o)) {
            return false;
        }
        h2o h2oVar = (h2o) obj;
        return this.a == h2oVar.a && this.b == h2oVar.b && this.c.equals(h2oVar.c) && Intrinsics.g(this.d, h2oVar.d) && this.e == h2oVar.e && this.f.equals(h2oVar.f) && this.g.equals(h2oVar.g) && this.h.equals(h2oVar.h) && this.i.equals(h2oVar.i);
    }

    public final int hashCode() {
        return this.i.hashCode() + gmf0.a(gmf0.a(gmf0.a(gpp.a(this.e, ai50.a(gmf0.a(gpp.a(this.b, Integer.hashCode(this.a) * 31, 31), 31, this.c), 31, this.d), 31), 31, this.f), 31, this.g), 31, this.h);
    }

    public final String toString() {
        StringBuilder sbA = dy5.a("InstantRacingRacer(id=", this.a, this.b, ", number=", ", name=");
        kya0.b(this.c, ", previousResults=", ", starCount=", sbA, this.d);
        f78.b(this.e, ", url=", this.f, ", runningUrl=", sbA);
        hxa.c(sbA, this.g, ", numberCapeUrl=", this.h, ", numberUrl=");
        return uf80.a(sbA, this.i, ")");
    }
}
