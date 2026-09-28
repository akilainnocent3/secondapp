package androidx.compose.ui.layout;

import defpackage.biv;
import defpackage.fxx;
import defpackage.hxx;
import defpackage.ixx;
import defpackage.mzo;
import defpackage.nv0;
import defpackage.ov0;
import defpackage.oxa;
import defpackage.psr;
import defpackage.qlr;
import defpackage.vhv;
import defpackage.ykt;
import defpackage.ywx;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public interface b extends psr {

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

    default int A0(nv0 nv0Var, mzo mzoVar, int i) {
        ywx ywxVar = i().v;
        ywxVar.getClass();
        ykt yktVarX1 = ywxVar.x1();
        yktVarX1.getClass();
        if (!yktVarX1.N0()) {
            return mzoVar.R(i);
        }
        return H1(new androidx.compose.ui.layout.a(nv0Var, nv0Var.getLayoutDirection()), new fxx(mzoVar, hxx.a, ixx.b), oxa.b(0, i, 0, 13)).b();
    }

    biv H1(ov0 ov0Var, vhv vhvVar, long j);

    default int N0(nv0 nv0Var, mzo mzoVar, int i) {
        ywx ywxVar = i().v;
        ywxVar.getClass();
        ykt yktVarX1 = ywxVar.x1();
        yktVarX1.getClass();
        if (!yktVarX1.N0()) {
            return mzoVar.x(i);
        }
        return H1(new androidx.compose.ui.layout.a(nv0Var, nv0Var.getLayoutDirection()), new fxx(mzoVar, hxx.b, ixx.b), oxa.b(0, i, 0, 13)).b();
    }

    default int d0(nv0 nv0Var, mzo mzoVar, int i) {
        ywx ywxVar = i().v;
        ywxVar.getClass();
        ykt yktVarX1 = ywxVar.x1();
        yktVarX1.getClass();
        if (!yktVarX1.N0()) {
            return mzoVar.a0(i);
        }
        return H1(new androidx.compose.ui.layout.a(nv0Var, nv0Var.getLayoutDirection()), new fxx(mzoVar, hxx.a, ixx.a), oxa.b(0, 0, i, 7)).c();
    }

    @Override // defpackage.psr
    default biv e(t tVar, vhv vhvVar, long j) {
        y yVarD0 = vhvVar.d0(j);
        return t.z1(tVar, yVarD0.a, yVarD0.b, new a(yVarD0));
    }

    default int i1(nv0 nv0Var, mzo mzoVar, int i) {
        ywx ywxVar = i().v;
        ywxVar.getClass();
        ykt yktVarX1 = ywxVar.x1();
        yktVarX1.getClass();
        if (!yktVarX1.N0()) {
            return mzoVar.b0(i);
        }
        return H1(new androidx.compose.ui.layout.a(nv0Var, nv0Var.getLayoutDirection()), new fxx(mzoVar, hxx.b, ixx.a), oxa.b(0, 0, i, 7)).c();
    }

    boolean m1();
}
