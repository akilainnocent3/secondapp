package defpackage;

import androidx.compose.foundation.layout.j;
import androidx.compose.runtime.a;
import androidx.compose.runtime.b;
import androidx.compose.runtime.e;
import androidx.compose.ui.d;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
public final class xgi0 {
    public static final void a(final pgi0 pgi0Var, final Function1<? super kli0, Unit> function1, a aVar, final int i) {
        int i2;
        b bVar;
        a.C0041a.C0042a c0042a;
        b bVar2;
        vki0 vki0Var;
        boolean z;
        pgi0Var.getClass();
        function1.getClass();
        b bVarI = aVar.i(1500339886);
        if ((i & 6) == 0) {
            i2 = (bVarI.M(pgi0Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= bVarI.A(function1) ? 32 : 16;
        }
        if (bVarI.q(i2 & 1, (i2 & 19) != 18)) {
            boolean z2 = pgi0Var.c;
            vki0 vki0Var2 = pgi0Var.a;
            a.C0041a.C0042a c0042a2 = a.C0041a.a;
            if (z2) {
                bVarI.N(-1098944475);
                qcn<vki0> qcnVar = pgi0Var.b;
                int iIndexOf = qcnVar.indexOf(vki0Var2);
                if (iIndexOf < 0) {
                    iIndexOf = 0;
                }
                jli0 jli0Var = new jli0(qcnVar, vki0Var2, iIndexOf);
                boolean z3 = pgi0Var.d;
                int i3 = i2 & 112;
                boolean z4 = i3 == 32;
                Object objY = bVarI.y();
                if (z4 || objY == c0042a2) {
                    objY = new pfe(function1, 3);
                    bVarI.r(objY);
                }
                Function1 function2 = (Function1) objY;
                boolean z5 = i3 == 32;
                Object objY2 = bVarI.y();
                if (z5 || objY2 == c0042a2) {
                    objY2 = new vu10(function1, 2);
                    bVarI.r(objY2);
                }
                Function0 function0 = (Function0) objY2;
                vki0Var = vki0Var2;
                bVar2 = bVarI;
                c0042a = c0042a2;
                ili0.a(jli0Var, z3, function2, function0, null, bVar2, 8);
                bVar2.X(false);
            } else {
                c0042a = c0042a2;
                bVar2 = bVarI;
                vki0Var = vki0Var2;
                bVar2.N(-1098468780);
                bVar2.X(false);
            }
            if (vki0Var instanceof vki0.b) {
                bVar2.N(-1098343044);
                iki0 iki0Var = pgi0Var.g;
                d dVarE = j.e(d.a.b, 1.0f);
                int i4 = i2 & 112;
                boolean z6 = i4 == 32;
                Object objY3 = bVar2.y();
                if (z6 || objY3 == c0042a) {
                    objY3 = new wu10(function1, 2);
                    bVar2.r(objY3);
                }
                Function1 function3 = (Function1) objY3;
                boolean z7 = i4 == 32;
                Object objY4 = bVar2.y();
                if (z7 || objY4 == c0042a) {
                    objY4 = new xu10(function1, 1);
                    bVar2.r(objY4);
                }
                Function1 function4 = (Function1) objY4;
                boolean z8 = i4 == 32;
                Object objY5 = bVar2.y();
                if (z8 || objY5 == c0042a) {
                    objY5 = new Function0() { // from class: wgi0
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            function1.invoke(new kli0.o("m/wv/loyalty/mission/terms-and-conditions", vj5.a(new Pair("data_enable_default_action_bar", Boolean.FALSE))));
                            return Unit.a;
                        }
                    };
                    bVar2.r(objY5);
                }
                Function0 function5 = (Function0) objY5;
                boolean z9 = i4 == 32;
                Object objY6 = bVar2.y();
                if (z9 || objY6 == c0042a) {
                    objY6 = new Function0() { // from class: rgi0
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            function1.invoke(new kli0.l(wae.LOYALTY));
                            return Unit.a;
                        }
                    };
                    bVar2.r(objY6);
                }
                Function0 function6 = (Function0) objY6;
                boolean z10 = i4 == 32;
                Object objY7 = bVar2.y();
                if (z10 || objY7 == c0042a) {
                    objY7 = new Function0() { // from class: sgi0
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            function1.invoke(kli0.t.a);
                            return Unit.a;
                        }
                    };
                    bVar2.r(objY7);
                }
                Function0 function7 = (Function0) objY7;
                boolean z11 = i4 == 32;
                Object objY8 = bVar2.y();
                if (z11 || objY8 == c0042a) {
                    objY8 = new xja0(function1, 1);
                    bVar2.r(objY8);
                }
                Function1 function8 = (Function1) objY8;
                boolean z12 = i4 == 32;
                Object objY9 = bVar2.y();
                if (z12 || objY9 == c0042a) {
                    objY9 = new j8j(function1, 2);
                    bVar2.r(objY9);
                }
                b bVar3 = bVar2;
                ymi0.a(iki0Var, function3, function4, function5, function6, function7, function8, (Function1) objY9, dVarE, bVar3, 100663296);
                bVar = bVar3;
                bVar.X(false);
            } else {
                if (!(vki0Var instanceof vki0.a)) {
                    throw igf0.a(bVar2, -1282358002, false);
                }
                bVar2.N(-1096987600);
                aii0 aii0Var = pgi0Var.f;
                boolean z13 = pgi0Var.e;
                int i5 = i2 & 112;
                boolean z14 = i5 == 32;
                Object objY10 = bVar2.y();
                if (z14 || objY10 == c0042a) {
                    objY10 = new qu10(function1, 2);
                    bVar2.r(objY10);
                }
                Function0 function9 = (Function0) objY10;
                boolean z15 = i5 == 32;
                Object objY11 = bVar2.y();
                if (z15 || objY11 == c0042a) {
                    z = true;
                    objY11 = new s260(function1, 1);
                    bVar2.r(objY11);
                } else {
                    z = true;
                }
                Function1 function10 = (Function1) objY11;
                boolean z16 = i5 == 32 ? z : false;
                Object objY12 = bVar2.y();
                if (z16 || objY12 == c0042a) {
                    objY12 = new Function1() { // from class: tgi0
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            chi0 chi0Var = (chi0) obj;
                            chi0Var.getClass();
                            function1.invoke(new kli0.j(chi0Var));
                            return Unit.a;
                        }
                    };
                    bVar2.r(objY12);
                }
                Function1 function11 = (Function1) objY12;
                boolean z17 = i5 == 32 ? z : false;
                Object objY13 = bVar2.y();
                if (z17 || objY13 == c0042a) {
                    objY13 = new Function1() { // from class: ugi0
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            fgi0 fgi0Var = (fgi0) obj;
                            fgi0Var.getClass();
                            function1.invoke(new kli0.d(fgi0Var));
                            return Unit.a;
                        }
                    };
                    bVar2.r(objY13);
                }
                Function1 function12 = (Function1) objY13;
                if (i5 != 32) {
                    z = false;
                }
                Object objY14 = bVar2.y();
                if (z || objY14 == c0042a) {
                    objY14 = new o7a(function1, 2);
                    bVar2.r(objY14);
                }
                b bVar4 = bVar2;
                shi0.b(aii0Var, z13, function9, function10, function11, function12, (Function0) objY14, bVar4, 0);
                bVar = bVar4;
                bVar.X(false);
            }
        } else {
            bVar = bVarI;
            bVar.G();
        }
        e eVarZ = bVar.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2() { // from class: vgi0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    int iA = qj40.a(i | 1);
                    xgi0.a(pgi0Var, function1, (a) obj, iA);
                    return Unit.a;
                }
            };
        }
    }
}
