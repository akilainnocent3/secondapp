package defpackage;

import androidx.compose.foundation.layout.h;
import androidx.compose.foundation.layout.j;
import androidx.compose.runtime.m;
import androidx.compose.ui.layout.t;
import androidx.compose.ui.layout.y;
import com.sportybet.android.gp.tz.R;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class aga {

    public static final class a implements aiv {
        public final /* synthetic */ ytw a;
        public final /* synthetic */ niv b;
        public final /* synthetic */ twa c;
        public final /* synthetic */ ytw d;

        /* JADX INFO: renamed from: aga$a$a, reason: collision with other inner class name */
        public static final class C0021a extends qlr implements Function1<y.a, Unit> {
            public final /* synthetic */ niv a;
            public final /* synthetic */ List b;
            public final /* synthetic */ LinkedHashMap c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0021a(niv nivVar, List list, LinkedHashMap linkedHashMap) {
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
            return t.z1(tVar, (int) (jF >> 32), (int) (jF & 4294967295L), new C0021a(this.b, list, linkedHashMap));
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
                cwa cwaVarE2 = nwaVar2.e();
                Object objY = aVar2.y();
                androidx.compose.runtime.a.C0041a.C0042a c0042a = androidx.compose.runtime.a.C0041a.a;
                if (objY == c0042a) {
                    objY = e.a;
                    aVar2.r(objY);
                }
                androidx.compose.ui.d.a aVar3 = androidx.compose.ui.d.a.b;
                q330.a(nwa.d(aVar3, cwaVarE, (Function1) objY), c68.a(R.color.text_type1_secondary, aVar2), 0.0f, 0L, 0, 0.0f, aVar2, 0, 60);
                boolean zM = aVar2.M(cwaVarE);
                Object objY2 = aVar2.y();
                if (zM || objY2 == c0042a) {
                    objY2 = new f(cwaVarE);
                    aVar2.r(objY2);
                }
                lkf0.d(cb40.a(R.string.common_functions__loading_with_dot, new Object[0], aVar2), nwa.d(aVar3, cwaVarE2, (Function1) objY2), c68.a(R.color.text_type1_secondary, aVar2), null, d2l.f(12), null, null, null, 0L, null, new gdf0(3), 0L, 0, false, 0, 0, null, null, aVar2, 24576, 0, 261096);
                aVar2.H();
                if (nwaVar.b != i) {
                    use useVar = xvf.a;
                    aVar2.t(this.c);
                }
            }
            return Unit.a;
        }
    }

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

    public static final class f implements Function1<bwa, Unit> {
        public final /* synthetic */ cwa a;

        public f(cwa cwaVar) {
            this.a = cwaVar;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(bwa bwaVar) {
            bwa bwaVar2 = bwaVar;
            bwaVar2.getClass();
            njm.a(bwaVar2.e, this.a.g, 10.0f, 4);
            gxa gxaVar = bwaVar2.d;
            cwa cwaVar = bwaVar2.c;
            u2i0.a(gxaVar, cwaVar.d, 0.0f, 6);
            u2i0.a(bwaVar2.f, cwaVar.f, 0.0f, 6);
            return Unit.a;
        }
    }

    public static final void a(int i, androidx.compose.runtime.a aVar) {
        androidx.compose.runtime.b bVarI = aVar.i(-153796347);
        if (bVarI.q(i & 1, i != 0)) {
            androidx.compose.ui.d dVarE = j.e(androidx.compose.ui.d.a.b, 1.0f);
            bVarI.N(-1003410150);
            bVarI.N(212064437);
            bVarI.X(false);
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
            lsr.a(xa80.b(dVarE, false, (Function1) objY8), pp8.b(1200550679, new d(ytwVar2, nwaVar, function0), bVarI), aivVar, bVarI, 48);
            bVarI.X(false);
        } else {
            bVarI.G();
        }
        androidx.compose.runtime.e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new yfa();
        }
    }

    public static final void b(int i, androidx.compose.runtime.a aVar) {
        androidx.compose.runtime.b bVarI = aVar.i(1954071932);
        if (bVarI.q(i & 1, i != 0)) {
            androidx.compose.ui.d.a aVar2 = androidx.compose.ui.d.a.b;
            androidx.compose.ui.d dVarI = j.i(h.j(j.g(aVar2, 1.0f), 0.0f, 12.0f, 0.0f, 0.0f, 13), 114.0f);
            aiv aivVarC = g75.c(ht.a.e, false);
            int iHashCode = Long.hashCode(bVarI.T);
            ne00 ne00VarS = bVarI.S();
            androidx.compose.ui.d dVarC = androidx.compose.ui.c.c(bVarI, dVarI);
            yka.k.getClass();
            tsr.a aVar3 = yka.a.b;
            bVarI.D();
            if (bVarI.S) {
                bVarI.F(aVar3);
            } else {
                bVarI.p();
            }
            yka.a.b bVar = yka.a.f;
            hlh0.a(bVarI, aivVarC, bVar);
            yka.a.d dVar = yka.a.e;
            hlh0.a(bVarI, ne00VarS, dVar);
            yka.a.C1350a c1350a = yka.a.g;
            if (bVarI.S || !Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode))) {
                n30.a(iHashCode, bVarI, iHashCode, c1350a);
            }
            yka.a.c cVar = yka.a.d;
            hlh0.a(bVarI, dVarC, cVar);
            i78 i78VarA = g78.a(kw0.e, ht.a.n, bVarI, 54);
            int iHashCode2 = Long.hashCode(bVarI.T);
            ne00 ne00VarS2 = bVarI.S();
            androidx.compose.ui.d dVarC2 = androidx.compose.ui.c.c(bVarI, aVar2);
            bVarI.D();
            if (bVarI.S) {
                bVarI.F(aVar3);
            } else {
                bVarI.p();
            }
            hlh0.a(bVarI, i78VarA, bVar);
            hlh0.a(bVarI, ne00VarS2, dVar);
            if (bVarI.S || !Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode2))) {
                n30.a(iHashCode2, bVarI, iHashCode2, c1350a);
            }
            hlh0.a(bVarI, dVarC2, cVar);
            q330.a(null, c68.a(R.color.text_type1_secondary, bVarI), 0.0f, 0L, 0, 0.0f, bVarI, 0, 61);
            ty0.a(bVarI, j.i(aVar2, 8.0f));
            lkf0.d(cb40.a(R.string.common_functions__loading_with_dot, new Object[0], bVarI), null, c68.a(R.color.text_type1_secondary, bVarI), null, d2l.f(12), null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, bVarI, 24576, 0, 262122);
            bVarI = bVarI;
            bVarI.X(true);
            bVarI.X(true);
        } else {
            bVarI.G();
        }
        androidx.compose.runtime.e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new zfa();
        }
    }
}
