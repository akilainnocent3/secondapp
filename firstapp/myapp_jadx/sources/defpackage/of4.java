package defpackage;

import androidx.compose.ui.d;
import androidx.compose.ui.layout.t;
import androidx.compose.ui.layout.y;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class of4 extends d.c implements psr, ya80 {
    public Function1<? super a7l, Unit> D;

    public static final class a extends qlr implements Function1<y.a, Unit> {
        public final /* synthetic */ y a;
        public final /* synthetic */ of4 b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(y yVar, of4 of4Var) {
            super(1);
            this.a = yVar;
            this.b = of4Var;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(y.a aVar) {
            y.a.J(aVar, this.a, 0, 0, this.b.D, 4);
            return Unit.a;
        }
    }

    public of4(Function1<? super a7l, Unit> function1) {
        this.D = function1;
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
        return "BlockGraphicsLayerModifier(block=" + this.D + ')';
    }

    @Override // defpackage.ya80
    public final void G0(pb80 pb80Var) {
    }
}
