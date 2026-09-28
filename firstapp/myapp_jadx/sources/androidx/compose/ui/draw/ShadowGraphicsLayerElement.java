package androidx.compose.ui.draw;

import androidx.compose.ui.d;
import defpackage.f87;
import defpackage.g7f;
import defpackage.j58;
import defpackage.k35;
import defpackage.kx80;
import defpackage.mtg0;
import defpackage.nbh0;
import defpackage.of4;
import defpackage.ofz;
import defpackage.p3w;
import defpackage.pkd;
import defpackage.qx80;
import defpackage.ywx;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0081\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/ui/draw/ShadowGraphicsLayerElement;", "Lp3w;", "Lof4;", "ui_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class ShadowGraphicsLayerElement extends p3w<of4> {
    public final float b;
    public final qx80 c;
    public final boolean d;
    public final long e;
    public final long f;

    public ShadowGraphicsLayerElement(float f, qx80 qx80Var, boolean z, long j, long j2) {
        this.b = f;
        this.c = qx80Var;
        this.d = z;
        this.e = j;
        this.f = j2;
    }

    @Override // defpackage.p3w
    public final d.c a() {
        return new of4(new kx80(this));
    }

    @Override // defpackage.p3w
    public final void d(d.c cVar) {
        of4 of4Var = (of4) cVar;
        of4Var.D = new kx80(this);
        ywx ywxVar = pkd.d(of4Var, 2).H;
        if (ywxVar != null) {
            ywxVar.s2(true, of4Var.D);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ShadowGraphicsLayerElement)) {
            return false;
        }
        ShadowGraphicsLayerElement shadowGraphicsLayerElement = (ShadowGraphicsLayerElement) obj;
        if (!g7f.b(this.b, shadowGraphicsLayerElement.b) || !Intrinsics.g(this.c, shadowGraphicsLayerElement.c) || this.d != shadowGraphicsLayerElement.d) {
            return false;
        }
        long j = shadowGraphicsLayerElement.e;
        int i = j58.n;
        return nbh0.a(this.e, j) && nbh0.a(this.f, shadowGraphicsLayerElement.f);
    }

    public final int hashCode() {
        int iA = mtg0.a((this.c.hashCode() + (Float.hashCode(this.b) * 31)) * 31, 31, this.d);
        int i = j58.n;
        nbh0.a aVar = nbh0.b;
        return Long.hashCode(this.f) + f87.a(iA, this.e, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ShadowGraphicsLayerElement(elevation=");
        k35.a(this.b, ", shape=", sb);
        sb.append(this.c);
        sb.append(", clip=");
        sb.append(this.d);
        sb.append(", ambientColor=");
        ofz.a(this.e, ", spotColor=", sb);
        sb.append((Object) j58.i(this.f));
        sb.append(')');
        return sb.toString();
    }
}
