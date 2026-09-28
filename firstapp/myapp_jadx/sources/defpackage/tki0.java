package defpackage;

import androidx.compose.foundation.layout.j;
import androidx.compose.runtime.b;
import androidx.compose.runtime.e;
import androidx.compose.ui.c;
import androidx.compose.ui.d;
import com.sportybet.android.gp.tz.R;
import com.sportybet.android.instantwin.presentation.buildandgo.f;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class tki0 {

    @c0d(c = "com.sportybet.android.virtual.presentation.component.VirtualLobbyScreenKt$VirtualLobbyScreen$1$5$1", f = "VirtualLobbyScreen.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class a extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public final /* synthetic */ Function1<kli0, Unit> a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(Function1<? super kli0, Unit> function1, v1b<? super a> v1bVar) {
            super(2, v1bVar);
            this.a = function1;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            return new a(this.a, v1bVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
            return ((a) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            y5b y5bVar = y5b.a;
            uj50.b(obj);
            this.a.invoke(kli0.q.a);
            return Unit.a;
        }
    }

    public static final void a(mli0 mli0Var, f fVar, final Function1<? super kli0, Unit> function1, androidx.compose.runtime.a aVar, int i) {
        androidx.compose.runtime.a.C0041a.C0042a c0042a;
        boolean z;
        b bVarI = aVar.i(-1588131682);
        int i2 = i | (bVarI.M(mli0Var) ? 4 : 2) | (bVarI.A(fVar) ? 32 : 16) | (bVarI.A(function1) ? 256 : 128);
        if (bVarI.q(i2 & 1, (i2 & 147) != 146)) {
            d dVarB = androidx.compose.foundation.a.b(j.e(d.a.b, 1.0f), c68.a(R.color.background_type2_primary, bVarI), zk40.a);
            i78 i78VarA = g78.a(kw0.c, ht.a.m, bVarI, 0);
            int iHashCode = Long.hashCode(bVarI.T);
            ne00 ne00VarS = bVarI.S();
            d dVarC = c.c(bVarI, dVarB);
            yka.k.getClass();
            tsr.a aVar2 = yka.a.b;
            bVarI.D();
            if (bVarI.S) {
                bVarI.F(aVar2);
            } else {
                bVarI.p();
            }
            hlh0.a(bVarI, i78VarA, yka.a.f);
            hlh0.a(bVarI, ne00VarS, yka.a.e);
            yka.a.C1350a c1350a = yka.a.g;
            if (bVarI.S || !Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode))) {
                n30.a(iHashCode, bVarI, iHashCode, c1350a);
            }
            hlh0.a(bVarI, dVarC, yka.a.d);
            fqo fqoVar = mli0Var.a;
            int i3 = i2 & 896;
            boolean z2 = i3 == 256;
            Object objY = bVarI.y();
            androidx.compose.runtime.a.C0041a.C0042a c0042a2 = androidx.compose.runtime.a.C0041a.a;
            if (z2 || objY == c0042a2) {
                objY = new u9a(function1, 1);
                bVarI.r(objY);
            }
            Function0 function0 = (Function0) objY;
            boolean z3 = i3 == 256;
            Object objY2 = bVarI.y();
            if (z3 || objY2 == c0042a2) {
                objY2 = new odj(1, function1);
                bVarI.r(objY2);
            }
            Function0 function2 = (Function0) objY2;
            boolean z4 = i3 == 256;
            Object objY3 = bVarI.y();
            if (z4 || objY3 == c0042a2) {
                objY3 = new pdj(1, function1);
                bVarI.r(objY3);
            }
            Function0 function3 = (Function0) objY3;
            boolean z5 = i3 == 256;
            Object objY4 = bVarI.y();
            if (z5 || objY4 == c0042a2) {
                objY4 = new z9a(function1, 1);
                bVarI.r(objY4);
            }
            eqo.b(fqoVar, function0, function2, function3, null, (Function0) objY4, bVarI, 0, 16);
            qgi0 qgi0Var = mli0Var.b;
            if (Intrinsics.g(qgi0Var, qgi0.b.a)) {
                bVarI.N(673679474);
                jy90.c(0, bVarI);
                bVarI.X(false);
                c0042a = c0042a2;
            } else if (qgi0Var instanceof qgi0.a) {
                bVarI.N(673795259);
                Unit unit = Unit.a;
                boolean z6 = i3 == 256;
                Object objY5 = bVarI.y();
                if (z6) {
                    c0042a = c0042a2;
                } else {
                    c0042a = c0042a2;
                    if (objY5 == c0042a) {
                    }
                    xvf.e(bVarI, unit, (Function2) objY5);
                    bVarI.X(false);
                }
                objY5 = new a(function1, null);
                bVarI.r(objY5);
                xvf.e(bVarI, unit, (Function2) objY5);
                bVarI.X(false);
            } else {
                c0042a = c0042a2;
                if (!(qgi0Var instanceof qgi0.c)) {
                    throw igf0.a(bVarI, 160276354, false);
                }
                bVarI.N(673995302);
                xgi0.a(((qgi0.c) qgi0Var).a, function1, bVarI, (i2 >> 3) & 112);
                bVarI.X(false);
            }
            bVarI.X(true);
            uji0 uji0Var = mli0Var.c;
            if (uji0Var == null) {
                bVarI.N(1330325830);
                bVarI.X(false);
                z = true;
            } else {
                bVarI.N(1330325831);
                boolean z7 = i3 == 256;
                Object objY6 = bVarI.y();
                if (z7 || objY6 == c0042a) {
                    objY6 = new uje(function1);
                    bVarI.r(objY6);
                }
                Function2 function4 = (Function2) objY6;
                boolean z8 = i3 == 256;
                Object objY7 = bVarI.y();
                if (z8 || objY7 == c0042a) {
                    z = true;
                    objY7 = new sdj(1, function1);
                    bVarI.r(objY7);
                } else {
                    z = true;
                }
                tii0.a(uji0Var, function4, (Function0) objY7, bVarI, 0);
                bVarI.X(false);
            }
            if (mli0Var.d) {
                bVarI.N(1330991091);
                if (i3 != 256) {
                    z = false;
                }
                Object objY8 = bVarI.y();
                if (z || objY8 == c0042a) {
                    objY8 = new Function0() { // from class: ski0
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            function1.invoke(kli0.g.a);
                            return Unit.a;
                        }
                    };
                    bVarI.r(objY8);
                }
                kd5.a(fVar, (Function0) objY8, bVarI, ((i2 >> 3) & 14) | 8);
                bVarI.X(false);
            } else {
                bVarI.N(1331222692);
                bVarI.X(false);
            }
        } else {
            bVarI.G();
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new tdj(i, 2, function1, mli0Var, fVar);
        }
    }
}
