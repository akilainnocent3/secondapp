package androidx.compose.ui.layout;

import android.graphics.Rect;
import defpackage.biv;
import defpackage.etw;
import defpackage.hvg0;
import defpackage.o9j0;
import defpackage.psr;
import defpackage.qlr;
import defpackage.r160;
import defpackage.rtw;
import defpackage.u5a0;
import defpackage.uk40;
import defpackage.vhv;
import defpackage.x5a0;
import defpackage.ytw;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class d0 extends androidx.compose.ui.d.c implements psr, hvg0 {
    public g D;
    public final b E;

    public static final class a extends qlr implements Function1<y.a, Unit> {
        public final /* synthetic */ y a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(y yVar) {
            super(1);
            this.a = yVar;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(y.a aVar) {
            aVar.s(this.a, 0, 0, 0.0f);
            return Unit.a;
        }
    }

    public static final class b extends qlr implements Function1<r160, Unit> {
        public final /* synthetic */ g b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(g gVar) {
            super(1);
            this.b = gVar;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(r160 r160Var) {
            r160 r160Var2 = r160Var;
            d0 d0Var = d0.this;
            if (((u5a0) d0Var.D.i).D() > 0) {
                long jA = r160Var2.f1().a();
                rtw rtwVar = this.b.f;
                int i = (int) (jA >> 32);
                int i2 = (int) (jA & 4294967295L);
                for (l0 l0Var : n0.b) {
                    V vD = rtwVar.d(l0Var);
                    vD.getClass();
                    o9j0 o9j0Var = (o9j0) vD;
                    n0.b(r160Var2, l0Var.b(), o9j0Var.h, i, i2);
                    if (((Boolean) ((x5a0) o9j0Var.b).getValue()).booleanValue()) {
                        n0.b(r160Var2, o9j0Var.f, o9j0Var.j, i, i2);
                        n0.b(r160Var2, o9j0Var.g, o9j0Var.k, i, i2);
                    }
                    n0.b(r160Var2, l0Var.a(), o9j0Var.i, i, i2);
                }
                if (d0Var.D.v.e()) {
                    etw<ytw<Rect>> etwVar = d0Var.D.v;
                    Object[] objArr = etwVar.a;
                    int i3 = etwVar.b;
                    for (int i4 = 0; i4 < i3; i4++) {
                        ytw ytwVar = (ytw) objArr[i4];
                        uk40 uk40Var = d0Var.D.w.get(i4);
                        Rect rect = (Rect) ytwVar.getValue();
                        r160Var2.F0(uk40Var.a(), rect.left);
                        r160Var2.F0(uk40Var.b(), rect.top);
                        r160Var2.F0(uk40Var.d(), rect.right);
                        r160Var2.F0(uk40Var.c(), rect.bottom);
                    }
                }
            }
            return Unit.a;
        }
    }

    public d0(g gVar) {
        this.D = gVar;
        this.E = new b(gVar);
    }

    @Override // defpackage.hvg0
    public final Object J() {
        return "androidx.compose.ui.layout.WindowInsetsRulers";
    }

    @Override // defpackage.psr
    public final biv e(t tVar, vhv vhvVar, long j) {
        y yVarD0 = vhvVar.d0(j);
        return t.X0(tVar, yVarD0.a, yVarD0.b, this.E, new a(yVarD0));
    }
}
