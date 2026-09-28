package defpackage;

import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.foundation.layout.VerticalAlignElement;
import androidx.compose.runtime.a;
import androidx.compose.runtime.m;
import androidx.compose.ui.d;
import androidx.compose.ui.layout.t;
import androidx.compose.ui.layout.y;
import com.sporty.android.core.model.tracking.AnalyticsEvent;
import com.sportybet.android.gp.tz.R;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class s1o {

    public static final /* synthetic */ class a extends saj implements Function1<com.sportybet.android.instantwin.presentation.racingrace.a, Unit> {
        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(com.sportybet.android.instantwin.presentation.racingrace.a aVar) {
            Object value;
            com.sportybet.android.instantwin.presentation.racingrace.b aVar2;
            com.sportybet.android.instantwin.presentation.racingrace.a aVar3 = aVar;
            aVar3.getClass();
            com.sportybet.android.instantwin.presentation.racingrace.c cVar = (com.sportybet.android.instantwin.presentation.racingrace.c) this.receiver;
            cVar.getClass();
            if (aVar3 instanceof com.sportybet.android.instantwin.presentation.racingrace.a.b) {
                com.sportybet.android.instantwin.presentation.racingrace.a.b bVar = (com.sportybet.android.instantwin.presentation.racingrace.a.b) aVar3;
                if (bVar instanceof com.sportybet.android.instantwin.presentation.racingrace.a.b.C0318b) {
                    aVar2 = new com.sportybet.android.instantwin.presentation.racingrace.b.C0319b(cVar.x1(), ((com.sportybet.android.instantwin.presentation.racingrace.a.b.C0318b) bVar).a);
                } else {
                    if (!(bVar instanceof com.sportybet.android.instantwin.presentation.racingrace.a.b.C0317a)) {
                        uhc.a();
                        return null;
                    }
                    aVar2 = new com.sportybet.android.instantwin.presentation.racingrace.b.a(cVar.x1());
                }
                cVar.i.a(aVar2);
            } else if (aVar3 instanceof com.sportybet.android.instantwin.presentation.racingrace.a.c) {
                wwd0 wwd0Var = cVar.f;
                do {
                    value = wwd0Var.getValue();
                } while (!wwd0Var.g(value, x1o.b));
            } else {
                if (!(aVar3 instanceof com.sportybet.android.instantwin.presentation.racingrace.a.InterfaceC0315a)) {
                    uhc.a();
                    return null;
                }
                com.sportybet.android.instantwin.presentation.racingrace.a.InterfaceC0315a interfaceC0315a = (com.sportybet.android.instantwin.presentation.racingrace.a.InterfaceC0315a) aVar3;
                y8j y8jVar = cVar.c;
                rdd0 rdd0Var = cVar.b;
                if (interfaceC0315a instanceof com.sportybet.android.instantwin.presentation.racingrace.a.InterfaceC0315a.b) {
                    rdd0Var.a(new a5o.k0(cVar.x1()), k00.d);
                    y8j.a(y8jVar, AnalyticsEvent.IV_SKIP_TO_RESULT_BTN);
                } else {
                    if (!(interfaceC0315a instanceof com.sportybet.android.instantwin.presentation.racingrace.a.InterfaceC0315a.C0316a)) {
                        uhc.a();
                        return null;
                    }
                    a5o.a aVar4 = new a5o.a(cVar.x1());
                    rdd0Var.a(aVar4, k00.d);
                    y8jVar.f(AnalyticsEvent.IV_ANIMATION_ERROR, aVar4.createCustomMetrics());
                }
            }
            return Unit.a;
        }
    }

    public static final class b implements Function1<bwa, Unit> {
        public static final b a = new b();

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(bwa bwaVar) {
            bwa bwaVar2 = bwaVar;
            bwaVar2.getClass();
            gxa gxaVar = bwaVar2.d;
            cwa cwaVar = bwaVar2.c;
            u2i0.a(gxaVar, cwaVar.d, 0.0f, 6);
            njm.a(bwaVar2.e, cwaVar.e, 0.0f, 6);
            u2i0.a(bwaVar2.f, cwaVar.f, 0.0f, 6);
            njm.a(bwaVar2.g, cwaVar.g, 0.0f, 6);
            return Unit.a;
        }
    }

    public static final class c implements Function1<y1o, Unit> {
        public final /* synthetic */ ytw<y1o> a;

        public c(ytw<y1o> ytwVar) {
            this.a = ytwVar;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(y1o y1oVar) {
            y1o y1oVar2 = y1oVar;
            y1oVar2.getClass();
            this.a.setValue(y1oVar2);
            return Unit.a;
        }
    }

    public static final class d implements Function1<bwa, Unit> {
        public final /* synthetic */ cwa a;

        public d(cwa cwaVar) {
            this.a = cwaVar;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(bwa bwaVar) {
            bwa bwaVar2 = bwaVar;
            bwaVar2.getClass();
            bwaVar2.h(new gqe("spread"));
            bwaVar2.e(new gqe("spread"));
            gxa gxaVar = bwaVar2.d;
            cwa cwaVar = this.a;
            u2i0.a(gxaVar, cwaVar.d, 0.0f, 6);
            njm.a(bwaVar2.e, cwaVar.e, 0.0f, 6);
            u2i0.a(bwaVar2.f, cwaVar.f, 0.0f, 6);
            njm.a(bwaVar2.g, cwaVar.g, 0.0f, 6);
            return Unit.a;
        }
    }

    public static final class e implements Function0<Unit> {
        public final /* synthetic */ Function1<com.sportybet.android.instantwin.presentation.racingrace.a, Unit> a;

        /* JADX WARN: Multi-variable type inference failed */
        public e(Function1<? super com.sportybet.android.instantwin.presentation.racingrace.a, Unit> function1) {
            this.a = function1;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            this.a.invoke(com.sportybet.android.instantwin.presentation.racingrace.a.InterfaceC0315a.C0316a.a);
            return Unit.a;
        }
    }

    public static final class f implements Function0<Unit> {
        public final /* synthetic */ Function1<com.sportybet.android.instantwin.presentation.racingrace.a, Unit> a;

        /* JADX WARN: Multi-variable type inference failed */
        public f(Function1<? super com.sportybet.android.instantwin.presentation.racingrace.a, Unit> function1) {
            this.a = function1;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            this.a.invoke(com.sportybet.android.instantwin.presentation.racingrace.a.c.a);
            return Unit.a;
        }
    }

    public static final class g implements Function1<bwa, Unit> {
        public final /* synthetic */ cwa a;

        public g(cwa cwaVar) {
            this.a = cwaVar;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(bwa bwaVar) {
            bwa bwaVar2 = bwaVar;
            bwaVar2.getClass();
            bwaVar2.h(new gqe("spread"));
            bwaVar2.e(new gqe("spread"));
            gxa gxaVar = bwaVar2.d;
            cwa cwaVar = this.a;
            u2i0.a(gxaVar, cwaVar.d, 0.0f, 6);
            njm.a(bwaVar2.e, cwaVar.e, 0.0f, 6);
            u2i0.a(bwaVar2.f, cwaVar.f, 0.0f, 6);
            njm.a(bwaVar2.g, cwaVar.g, 0.0f, 6);
            return Unit.a;
        }
    }

    public static final class h implements aiv {
        public final /* synthetic */ ytw a;
        public final /* synthetic */ niv b;
        public final /* synthetic */ twa c;
        public final /* synthetic */ ytw d;

        public static final class a extends qlr implements Function1<y.a, Unit> {
            public final /* synthetic */ niv a;
            public final /* synthetic */ List b;
            public final /* synthetic */ LinkedHashMap c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(niv nivVar, List list, LinkedHashMap linkedHashMap) {
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

        public h(ytw ytwVar, niv nivVar, twa twaVar, ytw ytwVar2) {
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
            return t.z1(tVar, (int) (jF >> 32), (int) (jF & 4294967295L), new a(this.b, list, linkedHashMap));
        }
    }

    public static final class i extends qlr implements Function0<Unit> {
        public final /* synthetic */ ytw a;
        public final /* synthetic */ twa b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(ytw ytwVar, twa twaVar) {
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

    public static final class j extends qlr implements Function1<pb80, Unit> {
        public final /* synthetic */ niv a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(niv nivVar) {
            super(1);
            this.a = nivVar;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(pb80 pb80Var) {
            b0g0.a(pb80Var, this.a);
            return Unit.a;
        }
    }

    public static final class k extends qlr implements Function2<androidx.compose.runtime.a, Integer, Unit> {
        public final /* synthetic */ ytw a;
        public final /* synthetic */ nwa b;
        public final /* synthetic */ Function0 c;
        public final /* synthetic */ g0o d;
        public final /* synthetic */ Function1 e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k(ytw ytwVar, nwa nwaVar, Function0 function0, g0o g0oVar, Function1 function1) {
            super(2);
            this.a = ytwVar;
            this.b = nwaVar;
            this.c = function0;
            this.d = g0oVar;
            this.e = function1;
        }

        /* JADX WARN: Code duplicated, block: B:30:0x00d8  */
        /* JADX WARN: Code duplicated, block: B:33:0x00f0  */
        /* JADX WARN: Code duplicated, block: B:35:0x00fe  */
        /* JADX WARN: Code duplicated, block: B:36:0x0109  */
        /* JADX WARN: Code duplicated, block: B:39:0x0118  */
        /* JADX WARN: Code duplicated, block: B:42:0x0141  */
        /* JADX WARN: Code duplicated, block: B:44:0x014a  */
        /* JADX WARN: Code duplicated, block: B:45:0x014e  */
        /* JADX WARN: Code duplicated, block: B:50:0x016b  */
        /* JADX WARN: Code duplicated, block: B:54:0x0183  */
        /* JADX WARN: Code duplicated, block: B:58:0x019a  */
        /* JADX WARN: Code duplicated, block: B:61:0x01b5  */
        /* JADX WARN: Code duplicated, block: B:63:0x01b9  */
        /* JADX WARN: Code duplicated, block: B:66:0x01cb  */
        /* JADX WARN: Code duplicated, block: B:69:0x0203  */
        /* JADX WARN: Code duplicated, block: B:71:0x020c  */
        /* JADX WARN: Code duplicated, block: B:72:0x0210  */
        /* JADX WARN: Code duplicated, block: B:77:0x022d  */
        /* JADX WARN: Code duplicated, block: B:80:0x0237  */
        /* JADX WARN: Code duplicated, block: B:81:0x0247  */
        /* JADX WARN: Code duplicated, block: B:85:0x0265  */
        /* JADX WARN: Code duplicated, block: B:88:0x026f  */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(androidx.compose.runtime.a aVar, Integer num) {
            cwa cwaVar;
            nwa nwaVar;
            yka.a.c cVar;
            g0o g0oVar;
            Object objY;
            boolean zM;
            Object objY2;
            aiv aivVarC;
            int iHashCode;
            ne00 ne00VarO;
            androidx.compose.ui.d dVarC;
            y1o y1oVar;
            boolean zM2;
            Object objY3;
            aiv aivVarC2;
            int iHashCode2;
            ne00 ne00VarO2;
            androidx.compose.ui.d dVarC2;
            Function1 function1;
            boolean zM3;
            Object objY4;
            boolean zM4;
            Object objY5;
            androidx.compose.runtime.a aVar2 = aVar;
            if ((num.intValue() & 3) == 2 && aVar2.j()) {
                aVar2.G();
            } else {
                this.a.setValue(Unit.a);
                nwa nwaVar2 = this.b;
                int i = nwaVar2.b;
                nwa nwaVar3 = nwa.this;
                cwa cwaVarE = nwaVar3.e();
                cwa cwaVarE2 = nwaVar3.e();
                cwa cwaVarE3 = nwaVar3.e();
                Object objY6 = aVar2.y();
                androidx.compose.runtime.a.C0041a.C0042a c0042a = androidx.compose.runtime.a.C0041a.a;
                if (objY6 == c0042a) {
                    objY6 = m.b(null);
                    aVar2.r(objY6);
                }
                ytw ytwVar = (ytw) objY6;
                Object objY7 = aVar2.y();
                if (objY7 == c0042a) {
                    objY7 = b.a;
                    aVar2.r(objY7);
                }
                androidx.compose.ui.d.a aVar3 = androidx.compose.ui.d.a.b;
                androidx.compose.ui.d dVarD = nwa.d(aVar3, cwaVarE, (Function1) objY7);
                n54 n54Var = ht.a.a;
                aiv aivVarC3 = g75.c(n54Var, false);
                int iHashCode3 = Long.hashCode(aVar2.m());
                ne00 ne00VarO3 = aVar2.o();
                androidx.compose.ui.d dVarC3 = androidx.compose.ui.c.c(aVar2, dVarD);
                yka.k.getClass();
                tsr.a aVar4 = yka.a.b;
                if (aVar2.k() == null) {
                    l2a.b();
                    throw null;
                }
                aVar2.D();
                if (aVar2.g()) {
                    aVar2.F(aVar4);
                } else {
                    aVar2.p();
                }
                yka.a.b bVar = yka.a.f;
                hlh0.a(aVar2, aivVarC3, bVar);
                yka.a.d dVar = yka.a.e;
                hlh0.a(aVar2, ne00VarO3, dVar);
                yka.a.C1350a c1350a = yka.a.g;
                if (aVar2.g()) {
                    cwaVar = cwaVarE3;
                    nwaVar = nwaVar2;
                } else {
                    nwaVar = nwaVar2;
                    cwaVar = cwaVarE3;
                    if (!Intrinsics.g(aVar2.y(), Integer.valueOf(iHashCode3))) {
                    }
                    cVar = yka.a.d;
                    hlh0.a(aVar2, dVarC3, cVar);
                    g0oVar = this.d;
                    qcn<t0o> qcnVar = g0oVar.d;
                    objY = aVar2.y();
                    if (objY == c0042a) {
                        objY = new c(ytwVar);
                        aVar2.r(objY);
                    }
                    b2o.a(qcnVar, (Function1) objY, aVar2, 48);
                    aVar2.s();
                    if (g0oVar.b) {
                        aVar2.N(-934848953);
                        y1oVar = (y1o) ytwVar.getValue();
                        if (y1oVar == null) {
                            aVar2.N(-934848954);
                            aVar2.H();
                        } else {
                            aVar2.N(-934848953);
                            zM2 = aVar2.M(cwaVarE);
                            objY3 = aVar2.y();
                            if (zM2 || objY3 == c0042a) {
                                objY3 = new d(cwaVarE);
                                aVar2.r(objY3);
                            }
                            androidx.compose.ui.d dVarD2 = nwa.d(aVar3, cwaVarE2, (Function1) objY3);
                            aivVarC2 = g75.c(n54Var, false);
                            iHashCode2 = Long.hashCode(aVar2.m());
                            ne00VarO2 = aVar2.o();
                            dVarC2 = androidx.compose.ui.c.c(aVar2, dVarD2);
                            if (aVar2.k() != null) {
                                l2a.b();
                                throw null;
                            }
                            aVar2.D();
                            if (aVar2.g()) {
                                aVar2.F(aVar4);
                            } else {
                                aVar2.p();
                            }
                            hlh0.a(aVar2, aivVarC2, bVar);
                            hlh0.a(aVar2, ne00VarO2, dVar);
                            if (aVar2.g() || !Intrinsics.g(aVar2.y(), Integer.valueOf(iHashCode2))) {
                                j3c.a(iHashCode2, aVar2, iHashCode2, c1350a);
                            }
                            hlh0.a(aVar2, dVarC2, cVar);
                            qcn<t0o> qcnVar2 = g0oVar.d;
                            qcn<String> qcnVar3 = g0oVar.e;
                            function1 = this.e;
                            zM3 = aVar2.M(function1);
                            objY4 = aVar2.y();
                            if (zM3 || objY4 == c0042a) {
                                objY4 = new e(function1);
                                aVar2.r(objY4);
                            }
                            Function0 function0 = (Function0) objY4;
                            zM4 = aVar2.M(function1);
                            objY5 = aVar2.y();
                            if (zM4 || objY5 == c0042a) {
                                objY5 = new f(function1);
                                aVar2.r(objY5);
                            }
                            p0o.a(y1oVar, qcnVar2, qcnVar3, function0, (Function0) objY5, aVar2, 0);
                            aVar2.s();
                            aVar2.H();
                        }
                        aVar2.H();
                    } else {
                        aVar2.N(-933608271);
                        zM = aVar2.M(cwaVarE);
                        objY2 = aVar2.y();
                        if (zM || objY2 == c0042a) {
                            objY2 = new g(cwaVarE);
                            aVar2.r(objY2);
                        }
                        androidx.compose.ui.d dVarB = androidx.compose.foundation.a.b(nwa.d(aVar3, cwaVar, (Function1) objY2), c68.a(R.color.bg_mask, aVar2), zk40.a);
                        aivVarC = g75.c(n54Var, false);
                        iHashCode = Long.hashCode(aVar2.m());
                        ne00VarO = aVar2.o();
                        dVarC = androidx.compose.ui.c.c(aVar2, dVarB);
                        if (aVar2.k() != null) {
                            l2a.b();
                            throw null;
                        }
                        aVar2.D();
                        if (aVar2.g()) {
                            aVar2.F(aVar4);
                        } else {
                            aVar2.p();
                        }
                        hlh0.a(aVar2, aivVarC, bVar);
                        hlh0.a(aVar2, ne00VarO, dVar);
                        if (aVar2.g() || !Intrinsics.g(aVar2.y(), Integer.valueOf(iHashCode))) {
                            j3c.a(iHashCode, aVar2, iHashCode, c1350a);
                        }
                        hlh0.a(aVar2, dVarC, cVar);
                        if (g0oVar.c) {
                            aVar2.N(1953488828);
                            s1o.g(g0oVar.h, aVar2, 0);
                            aVar2.H();
                        } else {
                            aVar2.N(1953585827);
                            s1o.b(0, aVar2);
                            aVar2.H();
                        }
                        aVar2.s();
                        aVar2.H();
                    }
                    aVar2.H();
                    if (nwaVar.b != i) {
                        use useVar = xvf.a;
                        aVar2.t(this.c);
                    }
                }
                j3c.a(iHashCode3, aVar2, iHashCode3, c1350a);
                cVar = yka.a.d;
                hlh0.a(aVar2, dVarC3, cVar);
                g0oVar = this.d;
                qcn<t0o> qcnVar4 = g0oVar.d;
                objY = aVar2.y();
                if (objY == c0042a) {
                    objY = new c(ytwVar);
                    aVar2.r(objY);
                }
                b2o.a(qcnVar4, (Function1) objY, aVar2, 48);
                aVar2.s();
                if (g0oVar.b) {
                    aVar2.N(-934848953);
                    y1oVar = (y1o) ytwVar.getValue();
                    if (y1oVar == null) {
                        aVar2.N(-934848954);
                        aVar2.H();
                    } else {
                        aVar2.N(-934848953);
                        zM2 = aVar2.M(cwaVarE);
                        objY3 = aVar2.y();
                        if (zM2) {
                            objY3 = new d(cwaVarE);
                            aVar2.r(objY3);
                        } else {
                            objY3 = new d(cwaVarE);
                            aVar2.r(objY3);
                        }
                        androidx.compose.ui.d dVarD3 = nwa.d(aVar3, cwaVarE2, (Function1) objY3);
                        aivVarC2 = g75.c(n54Var, false);
                        iHashCode2 = Long.hashCode(aVar2.m());
                        ne00VarO2 = aVar2.o();
                        dVarC2 = androidx.compose.ui.c.c(aVar2, dVarD3);
                        if (aVar2.k() != null) {
                            l2a.b();
                            throw null;
                        }
                        aVar2.D();
                        if (aVar2.g()) {
                            aVar2.F(aVar4);
                        } else {
                            aVar2.p();
                        }
                        hlh0.a(aVar2, aivVarC2, bVar);
                        hlh0.a(aVar2, ne00VarO2, dVar);
                        if (aVar2.g()) {
                            j3c.a(iHashCode2, aVar2, iHashCode2, c1350a);
                        } else {
                            j3c.a(iHashCode2, aVar2, iHashCode2, c1350a);
                        }
                        hlh0.a(aVar2, dVarC2, cVar);
                        qcn<t0o> qcnVar5 = g0oVar.d;
                        qcn<String> qcnVar6 = g0oVar.e;
                        function1 = this.e;
                        zM3 = aVar2.M(function1);
                        objY4 = aVar2.y();
                        if (zM3) {
                            objY4 = new e(function1);
                            aVar2.r(objY4);
                        } else {
                            objY4 = new e(function1);
                            aVar2.r(objY4);
                        }
                        Function0 function2 = (Function0) objY4;
                        zM4 = aVar2.M(function1);
                        objY5 = aVar2.y();
                        if (zM4) {
                            objY5 = new f(function1);
                            aVar2.r(objY5);
                        } else {
                            objY5 = new f(function1);
                            aVar2.r(objY5);
                        }
                        p0o.a(y1oVar, qcnVar5, qcnVar6, function2, (Function0) objY5, aVar2, 0);
                        aVar2.s();
                        aVar2.H();
                    }
                    aVar2.H();
                } else {
                    aVar2.N(-933608271);
                    zM = aVar2.M(cwaVarE);
                    objY2 = aVar2.y();
                    if (zM) {
                        objY2 = new g(cwaVarE);
                        aVar2.r(objY2);
                    } else {
                        objY2 = new g(cwaVarE);
                        aVar2.r(objY2);
                    }
                    androidx.compose.ui.d dVarB2 = androidx.compose.foundation.a.b(nwa.d(aVar3, cwaVar, (Function1) objY2), c68.a(R.color.bg_mask, aVar2), zk40.a);
                    aivVarC = g75.c(n54Var, false);
                    iHashCode = Long.hashCode(aVar2.m());
                    ne00VarO = aVar2.o();
                    dVarC = androidx.compose.ui.c.c(aVar2, dVarB2);
                    if (aVar2.k() != null) {
                        l2a.b();
                        throw null;
                    }
                    aVar2.D();
                    if (aVar2.g()) {
                        aVar2.F(aVar4);
                    } else {
                        aVar2.p();
                    }
                    hlh0.a(aVar2, aivVarC, bVar);
                    hlh0.a(aVar2, ne00VarO, dVar);
                    if (aVar2.g()) {
                        j3c.a(iHashCode, aVar2, iHashCode, c1350a);
                    } else {
                        j3c.a(iHashCode, aVar2, iHashCode, c1350a);
                    }
                    hlh0.a(aVar2, dVarC, cVar);
                    if (g0oVar.c) {
                        aVar2.N(1953488828);
                        s1o.g(g0oVar.h, aVar2, 0);
                        aVar2.H();
                    } else {
                        aVar2.N(1953585827);
                        s1o.b(0, aVar2);
                        aVar2.H();
                    }
                    aVar2.s();
                    aVar2.H();
                }
                aVar2.H();
                if (nwaVar.b != i) {
                    use useVar2 = xvf.a;
                    aVar2.t(this.c);
                }
            }
            return Unit.a;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void a(int i2, androidx.compose.runtime.a aVar) {
        androidx.compose.runtime.b bVarI = aVar.i(2059634643);
        if (bVarI.q(i2 & 1, i2 != 0)) {
            w8i0 w8i0VarA = zdt.a(bVarI);
            if (w8i0VarA == null) {
                ib5.a("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                return;
            }
            com.sportybet.android.instantwin.presentation.racingrace.c cVar = (com.sportybet.android.instantwin.presentation.racingrace.c) p8i0.a(jq40.a(com.sportybet.android.instantwin.presentation.racingrace.c.class), w8i0VarA, null, cll.a(w8i0VarA, bVarI), w8i0VarA instanceof iel ? ((iel) w8i0VarA).getDefaultViewModelCreationExtras() : cyb.a.b, bVarI);
            c2o c2oVar = (c2o) wyh.c(cVar.v, bVarI, 0, 7).getValue();
            boolean zA = bVarI.A(cVar);
            Object objY = bVarI.y();
            if (zA || objY == androidx.compose.runtime.a.C0041a.a) {
                a aVar2 = new a(1, cVar, com.sportybet.android.instantwin.presentation.racingrace.c.class, "handleUiAction", "handleUiAction(Lcom/sportybet/android/instantwin/presentation/racingrace/InstantRacingRaceUiAction;)V", 0);
                bVarI.r(aVar2);
                objY = aVar2;
            }
            d(c2oVar, (Function1) ((chp) objY), bVarI, 8);
        } else {
            bVarI.G();
        }
        androidx.compose.runtime.e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new e1o();
        }
    }

    public static final void b(int i2, androidx.compose.runtime.a aVar) {
        int i3;
        androidx.compose.runtime.b bVarI = aVar.i(1722992481);
        if (bVarI.q(i2 & 1, i2 != 0)) {
            androidx.compose.ui.d.a aVar2 = androidx.compose.ui.d.a.b;
            androidx.compose.ui.d dVarE = androidx.compose.foundation.layout.j.e(aVar2, 1.0f);
            d160 d160VarA = b160.a(kw0.e, ht.a.k, bVarI, 54);
            int iHashCode = Long.hashCode(bVarI.T);
            ne00 ne00VarS = bVarI.S();
            androidx.compose.ui.d dVarC = androidx.compose.ui.c.c(bVarI, dVarE);
            yka.k.getClass();
            tsr.a aVar3 = yka.a.b;
            bVarI.D();
            if (bVarI.S) {
                bVarI.F(aVar3);
            } else {
                bVarI.p();
            }
            hlh0.a(bVarI, d160VarA, yka.a.f);
            hlh0.a(bVarI, ne00VarS, yka.a.e);
            yka.a.C1350a c1350a = yka.a.g;
            if (bVarI.S || !Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode))) {
                n30.a(iHashCode, bVarI, iHashCode, c1350a);
            }
            hlh0.a(bVarI, dVarC, yka.a.d);
            h9n.a(erz.a(R.drawable.img__feature__instant_racing_race_end_left, 0, bVarI), "", null, null, null, 0.0f, null, bVarI, 48, 124);
            i3 = 0;
            lkf0.d(cb40.a(R.string.page_instant_virtual__race_ends, new Object[0], bVarI), androidx.compose.foundation.layout.h.h(aVar2, 6.0f, 0.0f, 2), c68.a(R.color.text_inverse_primary, bVarI), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, mla.l(R.style.H1_B, bVarI), bVarI, 48, 0, 131064);
            bVarI = bVarI;
            h9n.a(erz.a(R.drawable.img__feature__instant_racing_race_end_right, 0, bVarI), "", null, null, null, 0.0f, null, bVarI, 48, 124);
            bVarI.X(true);
        } else {
            i3 = 0;
            bVarI.G();
        }
        androidx.compose.runtime.e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new f1o(i2, i3);
        }
    }

    public static final void c(final int i2, androidx.compose.runtime.a aVar, final androidx.compose.ui.d dVar, final String str, final Function0 function0) {
        androidx.compose.runtime.b bVar;
        androidx.compose.runtime.b bVarI = aVar.i(-1130741644);
        int i3 = (bVarI.M(dVar) ? 4 : 2) | i2 | (bVarI.M(str) ? 32 : 16) | (bVarI.A(function0) ? 256 : 128);
        if (bVarI.q(i3 & 1, (i3 & 147) != 146)) {
            androidx.compose.ui.d dVarD = androidx.compose.foundation.d.d(androidx.compose.foundation.a.b(dVar, c68.a(R.color.bg_brand_sub_primary_d_base, bVarI), zk40.a), false, null, null, function0, 15);
            Object objY = bVarI.y();
            if (objY == androidx.compose.runtime.a.C0041a.a) {
                objY = new q1o();
                bVarI.r(objY);
            }
            androidx.compose.ui.d dVarH = g3w.h(xa80.b(dVarD, false, (Function1) objY), "next_round_button");
            i78 i78VarA = g78.a(kw0.e, ht.a.n, bVarI, 54);
            int iHashCode = Long.hashCode(bVarI.T);
            ne00 ne00VarS = bVarI.S();
            androidx.compose.ui.d dVarC = androidx.compose.ui.c.c(bVarI, dVarH);
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
            lkf0.d(cb40.a(R.string.page_instant_virtual__next_round, new Object[0], bVarI), null, c68.a(R.color.text_inverse_primary, bVarI), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, mla.l(R.style.H4_M, bVarI), bVarI, 0, 0, 131066);
            lkf0.d(cb40.a(R.string.page_instant_virtual__total_win_with_stake, new Object[]{str}, bVarI), g3w.h(androidx.compose.foundation.layout.h.j(androidx.compose.ui.d.a.b, 0.0f, 2.0f, 0.0f, 0.0f, 13), "next_round_winning_amount_text"), c68.a(R.color.text_inverse_primary, bVarI), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, mla.l(R.style.B2_M, bVarI), bVarI, 48, 0, 131064);
            bVar = bVarI;
            bVar.X(true);
        } else {
            bVar = bVarI;
            bVar.G();
        }
        androidx.compose.runtime.e eVarZ = bVar.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2(i2, dVar, str, function0) { // from class: r1o
                public final /* synthetic */ d a;
                public final /* synthetic */ String b;
                public final /* synthetic */ Function0 c;

                {
                    this.a = dVar;
                    this.b = str;
                    this.c = function0;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    s1o.c(qj40.a(1), (a) obj, this.a, this.b, this.c);
                    return Unit.a;
                }
            };
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v13 */
    /* JADX WARN: Type inference failed for: r12v14, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r12v16 */
    public static final void d(final c2o c2oVar, final Function1<? super com.sportybet.android.instantwin.presentation.racingrace.a, Unit> function1, androidx.compose.runtime.a aVar, final int i2) {
        androidx.compose.runtime.b bVar;
        Object objA;
        boolean z;
        boolean z2;
        ?? r12;
        Object obj;
        androidx.compose.runtime.b bVarI = aVar.i(392994546);
        int iF0 = bVarI.f0();
        int i3 = (bVarI.A(c2oVar) ? 4 : 2) | i2 | (bVarI.A(function1) ? 32 : 16);
        if (bVarI.q(i3 & 1, (i3 & 19) != 18)) {
            androidx.compose.ui.d.a aVar2 = androidx.compose.ui.d.a.b;
            androidx.compose.ui.d dVarB = androidx.compose.foundation.a.b(androidx.compose.foundation.layout.j.e(aVar2, 1.0f), c68.a(R.color.bg_primary_d_base, bVarI), zk40.a);
            i78 i78VarA = g78.a(kw0.c, ht.a.m, bVarI, 0);
            int iHashCode = Long.hashCode(bVarI.T);
            ne00 ne00VarS = bVarI.S();
            androidx.compose.ui.d dVarC = androidx.compose.ui.c.c(bVarI, dVarB);
            yka.k.getClass();
            tsr.a aVar3 = yka.a.b;
            bVarI.D();
            if (bVarI.S) {
                bVarI.F(aVar3);
            } else {
                bVarI.p();
            }
            yka.a.b bVar2 = yka.a.f;
            hlh0.a(bVarI, i78VarA, bVar2);
            yka.a.d dVar = yka.a.e;
            hlh0.a(bVarI, ne00VarS, dVar);
            yka.a.C1350a c1350a = yka.a.g;
            if (bVarI.S || !Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode))) {
                n30.a(iHashCode, bVarI, iHashCode, c1350a);
            }
            yka.a.c cVar = yka.a.d;
            hlh0.a(bVarI, dVarC, cVar);
            bVarI.N(-1035953418);
            eqo.b(c2oVar.a, null, null, null, null, null, bVarI, 0, 62);
            final g0o g0oVar = c2oVar.b;
            if (g0oVar == null) {
                bVarI.c0(iF0);
                androidx.compose.runtime.e eVarZ = bVarI.Z();
                if (eVarZ != null) {
                    eVarZ.d = new Function2(function1, i2) { // from class: k1o
                        public final /* synthetic */ Function1 b;

                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj2, Object obj3) {
                            ((Integer) obj3).getClass();
                            int iA = qj40.a(9);
                            s1o.d(this.a, this.b, (a) obj2, iA);
                            return Unit.a;
                        }
                    };
                    return;
                }
                return;
            }
            i0b.a(bVarI, -1003410150, 212064437, false);
            mmd mmdVar = (mmd) bVarI.O(kna.h);
            Object objY = bVarI.y();
            Object obj2 = androidx.compose.runtime.a.C0041a.a;
            if (objY == obj2) {
                objA = objY;
                objA = rzj.a(mmdVar, bVarI);
            }
            objA = objY;
            niv nivVar = (niv) objA;
            Object objY2 = bVarI.y();
            Object objA2 = objY2;
            if (objY2 == obj2) {
                objA2 = pzj.a(bVarI);
            }
            nwa nwaVar = (nwa) objA2;
            Object objY3 = bVarI.y();
            Object obj3 = objY3;
            if (objY3 == obj2) {
                Object objB = m.b(Boolean.FALSE);
                bVarI.r(objB);
                obj3 = objB;
            }
            ytw ytwVar = (ytw) obj3;
            Object objY4 = bVarI.y();
            Object objA3 = objY4;
            if (objY4 == obj2) {
                objA3 = qzj.a(nwaVar, bVarI);
            }
            twa twaVar = (twa) objA3;
            Object objY5 = bVarI.y();
            Object obj4 = objY5;
            if (objY5 == obj2) {
                Object objA4 = m.a(Unit.a, epx.a);
                bVarI.r(objA4);
                obj4 = objA4;
            }
            ytw ytwVar2 = (ytw) obj4;
            boolean zD = bVarI.d(257) | bVarI.A(nivVar);
            Object objY6 = bVarI.y();
            Object obj5 = objY6;
            if (zD || objY6 == obj2) {
                Object hVar = new h(ytwVar2, nivVar, twaVar, ytwVar);
                bVarI.r(hVar);
                obj5 = hVar;
            }
            aiv aivVar = (aiv) obj5;
            Object objY7 = bVarI.y();
            Object obj6 = objY7;
            if (objY7 == obj2) {
                Object iVar = new i(ytwVar, twaVar);
                bVarI.r(iVar);
                obj6 = iVar;
            }
            Function0 function0 = (Function0) obj6;
            boolean zA = bVarI.A(nivVar);
            Object objY8 = bVarI.y();
            Object obj7 = objY8;
            if (zA || objY8 == obj2) {
                Object jVar = new j(nivVar);
                bVarI.r(jVar);
                obj7 = jVar;
            }
            lsr.a(xa80.b(aVar2, false, (Function1) obj7), pp8.b(1200550679, new k(ytwVar2, nwaVar, function0, g0oVar, function1), bVarI), aivVar, bVarI, 48);
            bVarI.X(false);
            f0o.a(new LayoutWeightElement(1.0f, true), g0oVar.b, g0oVar.f, g0oVar.g, bVarI, 4096, 0);
            androidx.compose.runtime.b bVar3 = bVarI;
            if (g0oVar.b) {
                bVar3.N(-1032830386);
                boolean z3 = (i3 & 112) == 32;
                Object objY9 = bVar3.y();
                if (z3 || objY9 == obj2) {
                    r12 = 0;
                    Object l1oVar = new l1o(function1, false ? 1 : 0);
                    bVar3.r(l1oVar);
                    obj = l1oVar;
                } else {
                    r12 = 0;
                    obj = objY9;
                }
                e((Function0) obj, bVar3, r12);
                bVar3.X(r12);
                z2 = r12;
                z = true;
            } else {
                bVar3.N(-1032601451);
                androidx.compose.ui.d dVarG = androidx.compose.foundation.layout.j.g(aVar2, 1.0f);
                d160 d160VarA = b160.a(kw0.a, ht.a.j, bVar3, 0);
                int iHashCode2 = Long.hashCode(bVar3.T);
                ne00 ne00VarS2 = bVar3.S();
                androidx.compose.ui.d dVarC2 = androidx.compose.ui.c.c(bVar3, dVarG);
                bVar3.D();
                if (bVar3.S) {
                    bVar3.F(aVar3);
                } else {
                    bVar3.p();
                }
                hlh0.a(bVar3, d160VarA, bVar2);
                hlh0.a(bVar3, ne00VarS2, dVar);
                if (bVar3.S || !Intrinsics.g(bVar3.y(), Integer.valueOf(iHashCode2))) {
                    n30.a(iHashCode2, bVar3, iHashCode2, c1350a);
                }
                hlh0.a(bVar3, dVarC2, cVar);
                androidx.compose.ui.d dVarI = androidx.compose.foundation.layout.j.i(aVar2, 48.0f);
                if (1.0f <= 0.0d) {
                    ukn.a("invalid weight; must be greater than zero");
                }
                z = true;
                androidx.compose.ui.d dVarN = dVarI.n(new LayoutWeightElement(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true));
                int i4 = i3 & 112;
                boolean zA2 = bVar3.A(g0oVar) | (i4 == 32);
                Object objY10 = bVar3.y();
                Object obj8 = objY10;
                if (zA2 || objY10 == obj2) {
                    Object obj9 = new Function0() { // from class: m1o
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            function1.invoke(new com.sportybet.android.instantwin.presentation.racingrace.a.b.C0318b(g0oVar.a));
                            return Unit.a;
                        }
                    };
                    bVar3.r(obj9);
                    obj8 = obj9;
                }
                f(0, bVar3, dVarN, (Function0) obj8);
                androidx.compose.ui.d dVarI2 = androidx.compose.foundation.layout.j.i(aVar2, 48.0f);
                if (2.0f <= 0.0d) {
                    ukn.a("invalid weight; must be greater than zero");
                }
                androidx.compose.ui.d dVarN2 = dVarI2.n(new LayoutWeightElement(2.0f <= Float.MAX_VALUE ? 2.0f : Float.MAX_VALUE, true));
                String str = g0oVar.h;
                boolean z4 = i4 == 32;
                Object objY11 = bVar3.y();
                Object obj10 = objY11;
                if (z4 || objY11 == obj2) {
                    Object qwdVar = new qwd(1, function1);
                    bVar3.r(qwdVar);
                    obj10 = qwdVar;
                }
                z2 = 0;
                c(0, bVar3, dVarN2, str, (Function0) obj10);
                bVar3.X(true);
                bVar3.X(false);
            }
            bVar3.X(z2);
            bVar3.X(z);
            bVar = bVar3;
        } else {
            androidx.compose.runtime.b bVar4 = bVarI;
            bVar4.G();
            bVar = bVar4;
        }
        androidx.compose.runtime.e eVarZ2 = bVar.Z();
        if (eVarZ2 != null) {
            eVarZ2.d = new Function2(function1, i2) { // from class: n1o
                public final /* synthetic */ Function1 b;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj11, Object obj12) {
                    ((Integer) obj12).getClass();
                    int iA = qj40.a(9);
                    s1o.d(this.a, this.b, (a) obj11, iA);
                    return Unit.a;
                }
            };
        }
    }

    public static final void e(Function0<Unit> function0, androidx.compose.runtime.a aVar, int i2) {
        androidx.compose.runtime.b bVar;
        androidx.compose.runtime.b bVarI = aVar.i(431278554);
        int i3 = (bVarI.A(function0) ? 4 : 2) | i2;
        if (bVarI.q(i3 & 1, (i3 & 3) != 2)) {
            androidx.compose.ui.d dVarD = androidx.compose.foundation.d.d(androidx.compose.foundation.a.b(androidx.compose.foundation.layout.j.i(androidx.compose.foundation.layout.j.g(androidx.compose.ui.d.a.b, 1.0f), 48.0f), c68.a(R.color.bg_brand_sub_primary_d_base, bVarI), zk40.a), false, null, null, function0, 15);
            Object objY = bVarI.y();
            if (objY == androidx.compose.runtime.a.C0041a.a) {
                objY = new o1o();
                bVarI.r(objY);
            }
            androidx.compose.ui.d dVarH = g3w.h(xa80.b(dVarD, false, (Function1) objY), "skip_to_result_button");
            aiv aivVarC = g75.c(ht.a.e, false);
            int iHashCode = Long.hashCode(bVarI.T);
            ne00 ne00VarS = bVarI.S();
            androidx.compose.ui.d dVarC = androidx.compose.ui.c.c(bVarI, dVarH);
            yka.k.getClass();
            tsr.a aVar2 = yka.a.b;
            bVarI.D();
            if (bVarI.S) {
                bVarI.F(aVar2);
            } else {
                bVarI.p();
            }
            hlh0.a(bVarI, aivVarC, yka.a.f);
            hlh0.a(bVarI, ne00VarS, yka.a.e);
            yka.a.C1350a c1350a = yka.a.g;
            if (bVarI.S || !Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode))) {
                n30.a(iHashCode, bVarI, iHashCode, c1350a);
            }
            hlh0.a(bVarI, dVarC, yka.a.d);
            lkf0.d(cb40.a(R.string.page_instant_virtual__skip_to_result, new Object[0], bVarI), null, c68.a(R.color.text_inverse_primary, bVarI), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, mla.l(R.style.H4_M, bVarI), bVarI, 0, 0, 131066);
            bVar = bVarI;
            bVar.X(true);
        } else {
            bVar = bVarI;
            bVar.G();
        }
        androidx.compose.runtime.e eVarZ = bVar.Z();
        if (eVarZ != null) {
            eVarZ.d = new p1o(i2, function0);
        }
    }

    public static final void f(final int i2, androidx.compose.runtime.a aVar, final androidx.compose.ui.d dVar, Function0 function0) {
        final Function0 function1;
        androidx.compose.runtime.b bVar;
        androidx.compose.runtime.b bVarI = aVar.i(1406041632);
        int i3 = i2 | (bVarI.M(dVar) ? 4 : 2) | (bVarI.A(function0) ? 32 : 16);
        if (bVarI.q(i3 & 1, (i3 & 19) != 18)) {
            androidx.compose.ui.d dVarD = androidx.compose.foundation.d.d(androidx.compose.foundation.a.b(dVar, c68.a(R.color.bg_inverse_secondary, bVarI), zk40.a), false, null, null, function0, 15);
            Object objY = bVarI.y();
            if (objY == androidx.compose.runtime.a.C0041a.a) {
                objY = new g1o();
                bVarI.r(objY);
            }
            androidx.compose.ui.d dVarH = g3w.h(xa80.b(dVarD, false, (Function1) objY), "view_details_button");
            aiv aivVarC = g75.c(ht.a.e, false);
            int iHashCode = Long.hashCode(bVarI.T);
            ne00 ne00VarS = bVarI.S();
            androidx.compose.ui.d dVarC = androidx.compose.ui.c.c(bVarI, dVarH);
            yka.k.getClass();
            tsr.a aVar2 = yka.a.b;
            bVarI.D();
            if (bVarI.S) {
                bVarI.F(aVar2);
            } else {
                bVarI.p();
            }
            hlh0.a(bVarI, aivVarC, yka.a.f);
            hlh0.a(bVarI, ne00VarS, yka.a.e);
            yka.a.C1350a c1350a = yka.a.g;
            if (bVarI.S || !Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode))) {
                n30.a(iHashCode, bVarI, iHashCode, c1350a);
            }
            hlh0.a(bVarI, dVarC, yka.a.d);
            function1 = function0;
            lkf0.d(cb40.a(R.string.page_instant_virtual__view_details, new Object[0], bVarI), null, c68.a(R.color.text_inverse_primary, bVarI), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, mla.l(R.style.H4_M, bVarI), bVarI, 0, 0, 131066);
            bVar = bVarI;
            bVar.X(true);
        } else {
            function1 = function0;
            bVar = bVarI;
            bVar.G();
        }
        androidx.compose.runtime.e eVarZ = bVar.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2(i2, dVar, function1) { // from class: h1o
                public final /* synthetic */ d a;
                public final /* synthetic */ Function0 b;

                {
                    this.a = dVar;
                    this.b = function1;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    s1o.f(qj40.a(1), (a) obj, this.a, this.b);
                    return Unit.a;
                }
            };
        }
    }

    public static final void g(final String str, androidx.compose.runtime.a aVar, final int i2) {
        androidx.compose.runtime.b bVarI = aVar.i(594766844);
        int i3 = i2 | (bVarI.M(str) ? 4 : 2);
        if (bVarI.q(i3 & 1, (i3 & 3) != 2)) {
            androidx.compose.ui.d.a aVar2 = androidx.compose.ui.d.a.b;
            androidx.compose.ui.d dVarE = androidx.compose.foundation.layout.j.e(aVar2, 1.0f);
            Object objY = bVarI.y();
            if (objY == androidx.compose.runtime.a.C0041a.a) {
                objY = new i1o();
                bVarI.r(objY);
            }
            androidx.compose.ui.d dVarB = xa80.b(dVarE, false, (Function1) objY);
            d160 d160VarA = b160.a(kw0.e, ht.a.j, bVarI, 6);
            int iHashCode = Long.hashCode(bVarI.T);
            ne00 ne00VarS = bVarI.S();
            androidx.compose.ui.d dVarC = androidx.compose.ui.c.c(bVarI, dVarB);
            yka.k.getClass();
            tsr.a aVar3 = yka.a.b;
            bVarI.D();
            if (bVarI.S) {
                bVarI.F(aVar3);
            } else {
                bVarI.p();
            }
            yka.a.b bVar = yka.a.f;
            hlh0.a(bVarI, d160VarA, bVar);
            yka.a.d dVar = yka.a.e;
            hlh0.a(bVarI, ne00VarS, dVar);
            yka.a.C1350a c1350a = yka.a.g;
            if (bVarI.S || !Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode))) {
                n30.a(iHashCode, bVarI, iHashCode, c1350a);
            }
            yka.a.c cVar = yka.a.d;
            hlh0.a(bVarI, dVarC, cVar);
            VerticalAlignElement verticalAlignElement = new VerticalAlignElement(ht.a.k);
            i78 i78VarA = g78.a(kw0.c, ht.a.n, bVarI, 48);
            int iHashCode2 = Long.hashCode(bVarI.T);
            ne00 ne00VarS2 = bVarI.S();
            androidx.compose.ui.d dVarC2 = androidx.compose.ui.c.c(bVarI, verticalAlignElement);
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
            lkf0.d(cb40.a(R.string.common_functions__you_won, new Object[0], bVarI), g3w.h(aVar2, "result_text"), c68.a(R.color.text_inverse_focus, bVarI), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, imf0.b(mla.l(R.style.H1_B, bVarI), 0L, mla.m(32.0f, bVarI), null, null, null, 0L, null, null, null, 0, mla.m(38.0f, bVarI), null, null, 16646141), bVarI, 48, 0, 131064);
            lkf0.d(str, g3w.h(androidx.compose.foundation.layout.h.j(aVar2, 0.0f, 4.0f, 0.0f, 0.0f, 13), "winning_amount_text"), c68.a(R.color.text_inverse_primary, bVarI), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, mla.l(R.style.H4_M, bVarI), bVarI, (i3 & 14) | 48, 0, 131064);
            bVarI = bVarI;
            bVarI.X(true);
            mw90.a("https://s.sporty.net/cms/instant_win_winning_image_v2_de0e10ff6b.png", "Winning image", androidx.compose.foundation.layout.j.t(aVar2, 135.0f, 170.0f).n(new VerticalAlignElement(ht.a.l)), null, null, null, null, bVarI, 54, 2040);
            bVarI.X(true);
        } else {
            bVarI.G();
        }
        androidx.compose.runtime.e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2(str, i2) { // from class: j1o
                public final /* synthetic */ String a;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = qj40.a(1);
                    s1o.g(this.a, (a) obj, iA);
                    return Unit.a;
                }
            };
        }
    }
}
