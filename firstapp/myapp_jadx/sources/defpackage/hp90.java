package defpackage;

import androidx.compose.runtime.a;
import androidx.compose.runtime.b;
import androidx.compose.runtime.e;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
public final class hp90 {
    public static final void a(final qq90 qq90Var, final Function1<? super pq90, Unit> function1, a aVar, final int i) {
        function1.getClass();
        b bVarI = aVar.i(-1169499640);
        int i2 = (bVarI.A(qq90Var) ? 4 : 2) | i | (bVarI.A(function1) ? 32 : 16);
        if (bVarI.q(i2 & 1, (i2 & 19) != 18)) {
            rn90 rn90Var = qq90Var.a;
            boolean z = rn90Var instanceof bq90;
            a.C0041a.C0042a c0042a = a.C0041a.a;
            if (z) {
                bVarI.N(211176395);
                boolean z2 = (i2 & 112) == 32;
                Object objY = bVarI.y();
                if (z2 || objY == c0042a) {
                    objY = new aii(1, function1);
                    bVarI.r(objY);
                }
                aq90.b((Function0) objY, bVarI, 0);
                bVarI.X(false);
            } else if (rn90Var instanceof uo90) {
                bVarI.N(211412181);
                uo90 uo90Var = (uo90) rn90Var;
                int i3 = i2 & 112;
                boolean z3 = i3 == 32;
                Object objY2 = bVarI.y();
                if (z3 || objY2 == c0042a) {
                    objY2 = new Function1() { // from class: fp90
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            zji zjiVar = (zji) obj;
                            zjiVar.getClass();
                            function1.invoke(new pq90.g(zjiVar));
                            return Unit.a;
                        }
                    };
                    bVarI.r(objY2);
                }
                Function1 function2 = (Function1) objY2;
                boolean z4 = i3 == 32;
                Object objY3 = bVarI.y();
                if (z4 || objY3 == c0042a) {
                    objY3 = new Function0() { // from class: gp90
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            function1.invoke(pq90.c.a);
                            return Unit.a;
                        }
                    };
                    bVarI.r(objY3);
                }
                Function0 function0 = (Function0) objY3;
                boolean z5 = i3 == 32;
                Object objY4 = bVarI.y();
                if (z5 || objY4 == c0042a) {
                    objY4 = new wo90(0, function1);
                    bVarI.r(objY4);
                }
                Function1 function3 = (Function1) objY4;
                boolean z6 = i3 == 32;
                Object objY5 = bVarI.y();
                if (z6 || objY5 == c0042a) {
                    objY5 = new Function1() { // from class: xo90
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            String str = (String) obj;
                            str.getClass();
                            function1.invoke(new pq90.f(str));
                            return Unit.a;
                        }
                    };
                    bVarI.r(objY5);
                }
                Function1 function4 = (Function1) objY5;
                boolean z7 = i3 == 32;
                Object objY6 = bVarI.y();
                if (z7 || objY6 == c0042a) {
                    objY6 = new l6s(function1, 1);
                    bVarI.r(objY6);
                }
                Function1 function5 = (Function1) objY6;
                boolean z8 = i3 == 32;
                Object objY7 = bVarI.y();
                if (z8 || objY7 == c0042a) {
                    objY7 = new Function2() { // from class: yo90
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            String str = (String) obj;
                            String str2 = (String) obj2;
                            str.getClass();
                            str2.getClass();
                            function1.invoke(new pq90.b.C0981b(str, str2));
                            return Unit.a;
                        }
                    };
                    bVarI.r(objY7);
                }
                Function2 function6 = (Function2) objY7;
                boolean z9 = i3 == 32;
                Object objY8 = bVarI.y();
                if (z9 || objY8 == c0042a) {
                    objY8 = new w410(function1, 1);
                    bVarI.r(objY8);
                }
                to90.a(uo90Var, function2, function0, function3, function4, function5, function6, (Function0) objY8, bVarI, 0);
                bVarI.X(false);
            } else {
                if (!(rn90Var instanceof gq90)) {
                    throw igf0.a(bVarI, 1392284437, false);
                }
                bVarI.N(212816543);
                gq90 gq90Var = (gq90) rn90Var;
                int i4 = i2 & 112;
                boolean z10 = i4 == 32;
                Object objY9 = bVarI.y();
                if (z10 || objY9 == c0042a) {
                    objY9 = new tqw(function1, 1);
                    bVarI.r(objY9);
                }
                Function1 function7 = (Function1) objY9;
                boolean z11 = i4 == 32;
                Object objY10 = bVarI.y();
                if (z11 || objY10 == c0042a) {
                    objY10 = new Function0() { // from class: zo90
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            function1.invoke(pq90.a.a);
                            return Unit.a;
                        }
                    };
                    bVarI.r(objY10);
                }
                Function0 function8 = (Function0) objY10;
                boolean z12 = i4 == 32;
                Object objY11 = bVarI.y();
                if (z12 || objY11 == c0042a) {
                    objY11 = new Function1() { // from class: dp90
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            String str = (String) obj;
                            str.getClass();
                            function1.invoke(new pq90.e.b(str));
                            return Unit.a;
                        }
                    };
                    bVarI.r(objY11);
                }
                Function1 function9 = (Function1) objY11;
                boolean z13 = i4 == 32;
                Object objY12 = bVarI.y();
                if (z13 || objY12 == c0042a) {
                    objY12 = new cii(1, function1);
                    bVarI.r(objY12);
                }
                fq90.a(gq90Var, function7, function8, function9, (Function0) objY12, bVarI, 0);
                bVarI.X(false);
            }
        } else {
            bVarI.G();
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2(function1, i) { // from class: ep90
                public final /* synthetic */ Function1 b;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = qj40.a(9);
                    hp90.a(this.a, this.b, (a) obj, iA);
                    return Unit.a;
                }
            };
        }
    }
}
