package coil3.compose.internal;

import androidx.compose.ui.d;
import defpackage.b01;
import defpackage.c0b;
import defpackage.d0b;
import defpackage.f01;
import defpackage.gpp;
import defpackage.ht;
import defpackage.hx90;
import defpackage.l58;
import defpackage.m9n;
import defpackage.mtg0;
import defpackage.nan;
import defpackage.p3w;
import defpackage.pkd;
import defpackage.qxa;
import defpackage.rcf;
import defpackage.tvh;
import defpackage.uf80;
import defpackage.w57;
import defpackage.yw90;
import defpackage.zz0;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0081\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcoil3/compose/internal/ContentPainterElement;", "Lp3w;", "Lc0b;", "coil-compose-core_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class ContentPainterElement extends p3w<c0b> {
    public final nan b;
    public final m9n c;
    public final zz0 d;
    public final Function1<b01.b, b01.b> e;
    public final Function1<b01.b, Unit> f;
    public final int g;
    public final ht h;
    public final d0b i;
    public final float j;
    public final l58 k;
    public final boolean l;
    public final f01 m;
    public final String n;

    /* JADX WARN: Multi-variable type inference failed */
    public ContentPainterElement(nan nanVar, m9n m9nVar, zz0 zz0Var, Function1<? super b01.b, ? extends b01.b> function1, Function1<? super b01.b, Unit> function2, int i, ht htVar, d0b d0bVar, float f, l58 l58Var, boolean z, f01 f01Var, String str) {
        this.b = nanVar;
        this.c = m9nVar;
        this.d = zz0Var;
        this.e = function1;
        this.f = function2;
        this.g = i;
        this.h = htVar;
        this.i = d0bVar;
        this.j = f;
        this.k = l58Var;
        this.l = z;
        this.m = f01Var;
        this.n = str;
    }

    @Override // defpackage.p3w
    public final d.c a() {
        zz0 zz0Var = this.d;
        m9n m9nVar = this.c;
        nan nanVar = this.b;
        b01.a aVar = new b01.a(m9nVar, nanVar, zz0Var);
        b01 b01Var = new b01(aVar);
        b01Var.C = this.e;
        b01Var.D = this.f;
        b01Var.E = this.i;
        b01Var.F = this.g;
        b01Var.G = this.m;
        b01Var.l(aVar);
        hx90 hx90Var = nanVar.q;
        return new c0b(b01Var, this.h, this.i, this.j, this.k, this.l, this.n, hx90Var instanceof qxa ? (qxa) hx90Var : null);
    }

    @Override // defpackage.p3w
    public final void d(d.c cVar) {
        c0b c0bVar = (c0b) cVar;
        long jI = c0bVar.K.i();
        qxa qxaVar = c0bVar.J;
        zz0 zz0Var = this.d;
        m9n m9nVar = this.c;
        nan nanVar = this.b;
        b01.a aVar = new b01.a(m9nVar, nanVar, zz0Var);
        b01 b01Var = c0bVar.K;
        b01Var.C = this.e;
        b01Var.D = this.f;
        d0b d0bVar = this.i;
        b01Var.E = d0bVar;
        b01Var.F = this.g;
        b01Var.G = this.m;
        b01Var.l(aVar);
        boolean zA = yw90.a(jI, b01Var.i());
        c0bVar.D = this.h;
        hx90 hx90Var = nanVar.q;
        c0bVar.J = hx90Var instanceof qxa ? (qxa) hx90Var : null;
        c0bVar.E = d0bVar;
        c0bVar.F = this.j;
        c0bVar.G = this.k;
        c0bVar.H = this.l;
        String str = c0bVar.I;
        String str2 = this.n;
        if (!Intrinsics.g(str, str2)) {
            c0bVar.I = str2;
            pkd.f(c0bVar).R();
        }
        boolean zG = Intrinsics.g(qxaVar, c0bVar.J);
        if (!zA || !zG) {
            pkd.f(c0bVar).P();
        }
        rcf.a(c0bVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ContentPainterElement)) {
            return false;
        }
        ContentPainterElement contentPainterElement = (ContentPainterElement) obj;
        return Intrinsics.g(this.b, contentPainterElement.b) && Intrinsics.g(this.c, contentPainterElement.c) && Intrinsics.g(this.d, contentPainterElement.d) && Intrinsics.g(this.e, contentPainterElement.e) && Intrinsics.g(this.f, contentPainterElement.f) && this.g == contentPainterElement.g && Intrinsics.g(this.h, contentPainterElement.h) && Intrinsics.g(this.i, contentPainterElement.i) && Float.compare(this.j, contentPainterElement.j) == 0 && Intrinsics.g(this.k, contentPainterElement.k) && this.l == contentPainterElement.l && Intrinsics.g(this.m, contentPainterElement.m) && Intrinsics.g(this.n, contentPainterElement.n);
    }

    public final int hashCode() {
        int iB = w57.b((this.d.hashCode() + ((this.c.hashCode() + (this.b.hashCode() * 31)) * 31)) * 31, 31, this.e);
        Function1<b01.b, Unit> function1 = this.f;
        int iA = tvh.a(this.j, (this.i.hashCode() + ((this.h.hashCode() + gpp.a(this.g, (iB + (function1 == null ? 0 : function1.hashCode())) * 31, 31)) * 31)) * 31, 31);
        l58 l58Var = this.k;
        int iA2 = mtg0.a((iA + (l58Var == null ? 0 : l58Var.hashCode())) * 31, 31, this.l);
        f01 f01Var = this.m;
        int iHashCode = (iA2 + (f01Var == null ? 0 : f01Var.hashCode())) * 31;
        String str = this.n;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        String str;
        int i = this.g;
        if (i == 0) {
            str = "None";
        } else if (i == 1) {
            str = "Low";
        } else if (i == 2) {
            str = "Medium";
        } else {
            str = i == 3 ? "High" : "Unknown";
        }
        StringBuilder sb = new StringBuilder("ContentPainterElement(request=");
        sb.append(this.b);
        sb.append(", imageLoader=");
        sb.append(this.c);
        sb.append(", modelEqualityDelegate=");
        sb.append(this.d);
        sb.append(", transform=");
        sb.append(this.e);
        sb.append(", onState=");
        sb.append(this.f);
        sb.append(", filterQuality=");
        sb.append(str);
        sb.append(", alignment=");
        sb.append(this.h);
        sb.append(", contentScale=");
        sb.append(this.i);
        sb.append(", alpha=");
        sb.append(this.j);
        sb.append(", colorFilter=");
        sb.append(this.k);
        sb.append(", clipToBounds=");
        sb.append(this.l);
        sb.append(", previewHandler=");
        sb.append(this.m);
        sb.append(", contentDescription=");
        return uf80.a(sb, this.n, ")");
    }
}
