package defpackage;

import androidx.compose.foundation.layout.j;
import androidx.compose.runtime.a;
import androidx.compose.runtime.m;
import androidx.compose.ui.layout.t;
import androidx.compose.ui.layout.y;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes4.dex */
public final class k0k {

    public static final class a implements aiv {
        public final /* synthetic */ ytw a;
        public final /* synthetic */ niv b;
        public final /* synthetic */ twa c;
        public final /* synthetic */ ytw d;

        /* JADX INFO: renamed from: k0k$a$a, reason: collision with other inner class name */
        public static final class C0744a extends qlr implements Function1<y.a, Unit> {
            public final /* synthetic */ niv a;
            public final /* synthetic */ List b;
            public final /* synthetic */ LinkedHashMap c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0744a(niv nivVar, List list, LinkedHashMap linkedHashMap) {
                super(1);
                this.a = nivVar;
                this.b = list;
                this.c = linkedHashMap;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Unit invoke(y.a aVar) {
                List<? extends vhv> list = this.b;
                LinkedHashMap linkedHashMap = this.c;
                this.a.e(aVar, list, linkedHashMap);
                return Unit.a;
            }
        }

        public a(ytw ytwVar, niv nivVar, twa twaVar, ytw ytwVar2) {
            this.a = ytwVar;
            this.b = nivVar;
            this.c = twaVar;
            this.d = ytwVar2;
        }

        @Override // defpackage.aiv
        public final biv c(t tVar, List<? extends vhv> list, long j) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            this.a.getValue();
            long jF = this.b.f(j, tVar.getLayoutDirection(), this.c, list, linkedHashMap);
            this.d.getValue();
            return t.z1(tVar, (int) (jF >> 32), (int) (jF & 4294967295L), new C0744a(this.b, list, linkedHashMap));
        }
    }

    public static final class b extends qlr implements Function0<Unit> {
        public final /* synthetic */ ytw a;
        public final /* synthetic */ twa b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(ytw ytwVar, twa twaVar) {
            super(0);
            this.a = ytwVar;
            this.b = twaVar;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            ytw ytwVar = this.a;
            ytwVar.setValue(Boolean.valueOf(!((Boolean) ytwVar.getValue()).booleanValue()));
            this.b.d = true;
            return Unit.a;
        }
    }

    public static final class c extends qlr implements Function1<pb80, Unit> {
        public final /* synthetic */ niv a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(niv nivVar) {
            super(1);
            this.a = nivVar;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(pb80 pb80Var) {
            b0g0.a(pb80Var, this.a);
            return Unit.a;
        }
    }

    public static final class d extends qlr implements Function2<androidx.compose.runtime.a, Integer, Unit> {
        public final /* synthetic */ ytw a;
        public final /* synthetic */ nwa b;
        public final /* synthetic */ Function0 c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(ytw ytwVar, nwa nwaVar, Function0 function0) {
            super(2);
            this.a = ytwVar;
            this.b = nwaVar;
            this.c = function0;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(androidx.compose.runtime.a aVar, Integer num) {
            androidx.compose.runtime.a aVar2 = aVar;
            if ((num.intValue() & 3) == 2 && aVar2.j()) {
                aVar2.G();
            } else {
                this.a.setValue(Unit.a);
                nwa nwaVar = this.b;
                int i = nwaVar.b;
                nwa nwaVar2 = nwa.this;
                cwa cwaVarE = nwaVar2.e();
                nwaVar2.e();
                Object objY = aVar2.y();
                if (objY == androidx.compose.runtime.a.C0041a.a) {
                    objY = e.a;
                    aVar2.r(objY);
                }
                q330.a(nwa.d(androidx.compose.ui.d.a.b, cwaVarE, (Function1) objY), ((d68) aVar2.O(g68.a)).a, 0.0f, 0L, 0, 0.0f, aVar2, 0, 60);
                aVar2.N(1405704751);
                aVar2.H();
                aVar2.H();
                if (nwaVar.b != i) {
                    use useVar = xvf.a;
                    aVar2.t(this.c);
                }
            }
            return Unit.a;
        }
    }

    /* JADX INFO: loaded from: classes.dex */
    public static final class e implements Function1<bwa, Unit> {
        public static final e a = new e();

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(bwa bwaVar) {
            bwa bwaVar2 = bwaVar;
            bwaVar2.getClass();
            hwa hwaVar = bwaVar2.e;
            cwa cwaVar = bwaVar2.c;
            njm.a(hwaVar, cwaVar.e, 0.0f, 6);
            u2i0.a(bwaVar2.d, cwaVar.d, 0.0f, 6);
            u2i0.a(bwaVar2.f, cwaVar.f, 0.0f, 6);
            njm.a(bwaVar2.g, cwaVar.g, 0.0f, 6);
            return Unit.a;
        }
    }

    public static final void a(final int i, final int i2, androidx.compose.runtime.a aVar, final androidx.compose.ui.d dVar, final String str) {
        int i3;
        androidx.compose.runtime.b bVarI = aVar.i(-97088630);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (bVarI.M(dVar) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i5 = i3 | 48;
        if (bVarI.q(i5 & 1, (i5 & 19) != 18)) {
            if (i4 != 0) {
                dVar = androidx.compose.ui.d.a.b;
            }
            androidx.compose.ui.d dVarB = androidx.compose.foundation.a.b(j.e(dVar, 1.0f), ((d68) bVarI.O(g68.a)).n, zk40.a);
            i0b.a(bVarI, -1003410150, 212064437, false);
            mmd mmdVar = (mmd) bVarI.O(kna.h);
            Object objY = bVarI.y();
            androidx.compose.runtime.a.C0041a.C0042a c0042a = androidx.compose.runtime.a.C0041a.a;
            if (objY == c0042a) {
                objY = rzj.a(mmdVar, bVarI);
            }
            niv nivVar = (niv) objY;
            Object objY2 = bVarI.y();
            if (objY2 == c0042a) {
                objY2 = pzj.a(bVarI);
            }
            nwa nwaVar = (nwa) objY2;
            Object objY3 = bVarI.y();
            if (objY3 == c0042a) {
                objY3 = m.b(Boolean.FALSE);
                bVarI.r(objY3);
            }
            ytw ytwVar = (ytw) objY3;
            Object objY4 = bVarI.y();
            if (objY4 == c0042a) {
                objY4 = qzj.a(nwaVar, bVarI);
            }
            twa twaVar = (twa) objY4;
            Object objY5 = bVarI.y();
            if (objY5 == c0042a) {
                objY5 = m.a(Unit.a, epx.a);
                bVarI.r(objY5);
            }
            ytw ytwVar2 = (ytw) objY5;
            boolean zA = bVarI.A(nivVar) | bVarI.d(257);
            Object objY6 = bVarI.y();
            if (zA || objY6 == c0042a) {
                objY6 = new a(ytwVar2, nivVar, twaVar, ytwVar);
                bVarI.r(objY6);
            }
            aiv aivVar = (aiv) objY6;
            Object objY7 = bVarI.y();
            if (objY7 == c0042a) {
                objY7 = new b(ytwVar, twaVar);
                bVarI.r(objY7);
            }
            Function0 function0 = (Function0) objY7;
            boolean zA2 = bVarI.A(nivVar);
            Object objY8 = bVarI.y();
            if (zA2 || objY8 == c0042a) {
                objY8 = new c(nivVar);
                bVarI.r(objY8);
            }
            lsr.a(xa80.b(dVarB, false, (Function1) objY8), pp8.b(1200550679, new d(ytwVar2, nwaVar, function0), bVarI), aivVar, bVarI, 48);
            bVarI.X(false);
            str = "";
        } else {
            bVarI.G();
        }
        androidx.compose.runtime.e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2() { // from class: j0k
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    k0k.a(qj40.a(i | 1), i2, (a) obj, dVar, str);
                    return Unit.a;
                }
            };
        }
    }
}
