package defpackage;

import androidx.compose.ui.d;
import androidx.compose.ui.layout.t;
import androidx.compose.ui.layout.y;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class yj90 extends d.c implements psr, ya80 {
    public float D;
    public float E;
    public float F;
    public float G;
    public float H;
    public float I;
    public float J;
    public float K;
    public float L;
    public long M;
    public qx80 N;
    public boolean O;
    public long P;
    public long Q;
    public int R;
    public int S;
    public xj90 T;

    public static final class a extends qlr implements Function1<y.a, Unit> {
        public final /* synthetic */ y a;
        public final /* synthetic */ yj90 b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(y yVar, yj90 yj90Var) {
            super(1);
            this.a = yVar;
            this.b = yj90Var;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(y.a aVar) {
            y.a.J(aVar, this.a, 0, 0, this.b.T, 4);
            return Unit.a;
        }
    }

    @Override // defpackage.ya80
    public final boolean E() {
        return false;
    }

    @Override // defpackage.psr
    public final biv e(t tVar, vhv vhvVar, long j) {
        y yVarD0 = vhvVar.d0(j);
        return t.z1(tVar, yVarD0.a, yVarD0.b, new a(yVarD0, this));
    }

    @Override // androidx.compose.ui.d.c
    public final boolean e2() {
        return false;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SimpleGraphicsLayerModifier(scaleX=");
        sb.append(this.D);
        sb.append(", scaleY=");
        sb.append(this.E);
        sb.append(", alpha = ");
        sb.append(this.F);
        sb.append(", translationX=");
        sb.append(this.G);
        sb.append(", translationY=");
        sb.append(this.H);
        sb.append(", shadowElevation=");
        sb.append(this.I);
        sb.append(", rotationX=0.0, rotationY=");
        sb.append(this.J);
        sb.append(", rotationZ=");
        sb.append(this.K);
        sb.append(", cameraDistance=");
        sb.append(this.L);
        sb.append(", transformOrigin=");
        sb.append((Object) jsg0.b(this.M));
        sb.append(", shape=");
        sb.append(this.N);
        sb.append(", clip=");
        sb.append(this.O);
        sb.append(", renderEffect=null, ambientShadowColor=");
        ofz.a(this.P, ", spotShadowColor=", sb);
        ofz.a(this.Q, ", compositingStrategy=", sb);
        sb.append((Object) ("CompositingStrategy(value=" + this.R + ')'));
        sb.append(", blendMode=");
        sb.append((Object) ff4.a(this.S));
        sb.append(", colorFilter=null)");
        return sb.toString();
    }

    @Override // defpackage.ya80
    public final void G0(pb80 pb80Var) {
    }
}
