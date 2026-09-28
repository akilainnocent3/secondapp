package androidx.compose.ui.graphics;

import androidx.compose.ui.d;
import defpackage.f87;
import defpackage.ff4;
import defpackage.gpp;
import defpackage.j58;
import defpackage.jsg0;
import defpackage.mtg0;
import defpackage.nbh0;
import defpackage.ofz;
import defpackage.p3w;
import defpackage.pkd;
import defpackage.qx80;
import defpackage.tvh;
import defpackage.xj90;
import defpackage.yj90;
import defpackage.ywx;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0082\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/ui/graphics/GraphicsLayerElement;", "Lp3w;", "Lyj90;", "ui_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
final /* data */ class GraphicsLayerElement extends p3w<yj90> {
    public final float b;
    public final float c;
    public final float d;
    public final float e;
    public final float f;
    public final float g;
    public final float h;
    public final float i;
    public final long k;
    public final qx80 l;
    public final boolean m;
    public final long n;
    public final long o;
    public final int p;
    public final float j = 8.0f;
    public final int q = 3;

    public GraphicsLayerElement(float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8, long j, qx80 qx80Var, boolean z, long j2, long j3, int i) {
        this.b = f;
        this.c = f2;
        this.d = f3;
        this.e = f4;
        this.f = f5;
        this.g = f6;
        this.h = f7;
        this.i = f8;
        this.k = j;
        this.l = qx80Var;
        this.m = z;
        this.n = j2;
        this.o = j3;
        this.p = i;
    }

    @Override // defpackage.p3w
    public final d.c a() {
        yj90 yj90Var = new yj90();
        yj90Var.D = this.b;
        yj90Var.E = this.c;
        yj90Var.F = this.d;
        yj90Var.G = this.e;
        yj90Var.H = this.f;
        yj90Var.I = this.g;
        yj90Var.J = this.h;
        yj90Var.K = this.i;
        yj90Var.L = this.j;
        yj90Var.M = this.k;
        yj90Var.N = this.l;
        yj90Var.O = this.m;
        yj90Var.P = this.n;
        yj90Var.Q = this.o;
        yj90Var.R = this.p;
        yj90Var.S = this.q;
        yj90Var.T = new xj90(yj90Var);
        return yj90Var;
    }

    @Override // defpackage.p3w
    public final void d(d.c cVar) {
        yj90 yj90Var = (yj90) cVar;
        yj90Var.D = this.b;
        yj90Var.E = this.c;
        yj90Var.F = this.d;
        yj90Var.G = this.e;
        yj90Var.H = this.f;
        yj90Var.I = this.g;
        yj90Var.J = this.h;
        yj90Var.K = this.i;
        yj90Var.L = this.j;
        yj90Var.M = this.k;
        yj90Var.N = this.l;
        yj90Var.O = this.m;
        yj90Var.P = this.n;
        yj90Var.Q = this.o;
        yj90Var.R = this.p;
        yj90Var.S = this.q;
        ywx ywxVar = pkd.d(yj90Var, 2).H;
        if (ywxVar != null) {
            ywxVar.s2(true, yj90Var.T);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GraphicsLayerElement)) {
            return false;
        }
        GraphicsLayerElement graphicsLayerElement = (GraphicsLayerElement) obj;
        if (Float.compare(this.b, graphicsLayerElement.b) != 0 || Float.compare(this.c, graphicsLayerElement.c) != 0 || Float.compare(this.d, graphicsLayerElement.d) != 0 || Float.compare(this.e, graphicsLayerElement.e) != 0 || Float.compare(this.f, graphicsLayerElement.f) != 0 || Float.compare(this.g, graphicsLayerElement.g) != 0 || Float.compare(0.0f, 0.0f) != 0 || Float.compare(this.h, graphicsLayerElement.h) != 0 || Float.compare(this.i, graphicsLayerElement.i) != 0 || Float.compare(this.j, graphicsLayerElement.j) != 0 || !jsg0.a(this.k, graphicsLayerElement.k) || !Intrinsics.g(this.l, graphicsLayerElement.l) || this.m != graphicsLayerElement.m) {
            return false;
        }
        long j = graphicsLayerElement.n;
        int i = j58.n;
        return nbh0.a(this.n, j) && nbh0.a(this.o, graphicsLayerElement.o) && this.p == graphicsLayerElement.p && this.q == graphicsLayerElement.q;
    }

    public final int hashCode() {
        int iA = tvh.a(this.j, tvh.a(this.i, tvh.a(this.h, tvh.a(0.0f, tvh.a(this.g, tvh.a(this.f, tvh.a(this.e, tvh.a(this.d, tvh.a(this.c, Float.hashCode(this.b) * 31, 31), 31), 31), 31), 31), 31), 31), 31), 31);
        int i = jsg0.c;
        int iA2 = mtg0.a((this.l.hashCode() + f87.a(iA, this.k, 31)) * 31, 961, this.m);
        int i2 = j58.n;
        nbh0.a aVar = nbh0.b;
        return gpp.a(this.q, gpp.a(this.p, f87.a(f87.a(iA2, this.n, 31), this.o, 31), 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("GraphicsLayerElement(scaleX=");
        sb.append(this.b);
        sb.append(", scaleY=");
        sb.append(this.c);
        sb.append(", alpha=");
        sb.append(this.d);
        sb.append(", translationX=");
        sb.append(this.e);
        sb.append(", translationY=");
        sb.append(this.f);
        sb.append(", shadowElevation=");
        sb.append(this.g);
        sb.append(", rotationX=0.0, rotationY=");
        sb.append(this.h);
        sb.append(", rotationZ=");
        sb.append(this.i);
        sb.append(", cameraDistance=");
        sb.append(this.j);
        sb.append(", transformOrigin=");
        sb.append((Object) jsg0.b(this.k));
        sb.append(", shape=");
        sb.append(this.l);
        sb.append(", clip=");
        sb.append(this.m);
        sb.append(", renderEffect=null, ambientShadowColor=");
        ofz.a(this.n, ", spotShadowColor=", sb);
        ofz.a(this.o, ", compositingStrategy=", sb);
        sb.append((Object) ("CompositingStrategy(value=" + this.p + ')'));
        sb.append(", blendMode=");
        sb.append((Object) ff4.a(this.q));
        sb.append(", colorFilter=null)");
        return sb.toString();
    }
}
