package defpackage;

import androidx.compose.runtime.a;
import androidx.compose.runtime.m;
import androidx.compose.ui.layout.t;
import androidx.compose.ui.layout.w;
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
public final class aq90 {

    @c0d(c = "com.sportybet.android.instantwin.presentation.simulationsettlement.component.content.SimulationSettlementSkippingContentKt$SimulationSettlementSkippingContent$2$1$1$1", f = "SimulationSettlementSkippingContent.kt", l = {56, 63}, m = "invokeSuspend", v = 2)
    public static final class a extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ wd0<Float, ij0> b;
        public final /* synthetic */ Function0<Unit> c;
        public final /* synthetic */ osw d;
        public final /* synthetic */ osw e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(wd0<Float, ij0> wd0Var, Function0<Unit> function0, osw oswVar, osw oswVar2, v1b<? super a> v1bVar) {
            super(2, v1bVar);
            this.b = wd0Var;
            this.c = function0;
            this.d = oswVar;
            this.e = oswVar2;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            return new a(this.b, this.c, this.d, this.e, v1bVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
            return ((a) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:19:0x0063, code lost:
        
            if (defpackage.hkd.b(300, r9) == r0) goto L20;
         */
        @Override // defpackage.pz1
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r12) {
            /*
                r11 = this;
                y5b r0 = defpackage.y5b.a
                int r1 = r11.a
                r2 = 1
                r3 = 2
                if (r1 == 0) goto L1d
                if (r1 == r2) goto L18
                if (r1 != r3) goto L11
                defpackage.uj50.b(r12)
                r9 = r11
                goto L66
            L11:
                java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
                defpackage.ib5.a(r11)
                r11 = 0
                return r11
            L18:
                defpackage.uj50.b(r12)
                r9 = r11
                goto L5b
            L1d:
                defpackage.uj50.b(r12)
                osw r12 = r11.d
                int r12 = r12.D()
                if (r12 == 0) goto L6e
                osw r12 = r11.e
                int r12 = r12.D()
                if (r12 != 0) goto L31
                goto L6e
            L31:
                java.lang.Float r5 = new java.lang.Float
                r12 = 1065353216(0x3f800000, float:1.0)
                r5.<init>(r12)
                f4c r1 = new f4c
                r4 = 0
                r6 = 1059565076(0x3f27ae14, float:0.655)
                r7 = 1052434760(0x3ebae148, float:0.365)
                r1.<init>(r7, r4, r6, r12)
                r12 = 1000(0x3e8, float:1.401E-42)
                r4 = 0
                gzg0 r6 = defpackage.yi0.e(r12, r4, r1, r3)
                r11.a = r2
                wd0<java.lang.Float, ij0> r4 = r11.b
                r7 = 0
                r8 = 0
                r10 = 12
                r9 = r11
                java.lang.Object r11 = defpackage.wd0.a(r4, r5, r6, r7, r8, r9, r10)
                if (r11 != r0) goto L5b
                goto L65
            L5b:
                r9.a = r3
                r11 = 300(0x12c, double:1.48E-321)
                java.lang.Object r11 = defpackage.hkd.b(r11, r9)
                if (r11 != r0) goto L66
            L65:
                return r0
            L66:
                kotlin.jvm.functions.Function0<kotlin.Unit> r11 = r9.c
                r11.invoke()
                kotlin.Unit r11 = kotlin.Unit.a
                return r11
            L6e:
                kotlin.Unit r11 = kotlin.Unit.a
                return r11
            */
            throw new UnsupportedOperationException("Method not decompiled: aq90.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public static final class b implements Function1<bwa, Unit> {
        public static final b a = new b();

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(bwa bwaVar) {
            bwa bwaVar2 = bwaVar;
            bwaVar2.getClass();
            bwaVar2.h(new gqe("spread"));
            bwaVar2.e(new gqe("wrap"));
            gxa gxaVar = bwaVar2.d;
            cwa cwaVar = bwaVar2.c;
            u2i0.a(gxaVar, cwaVar.d, 0.0f, 6);
            njm.a(bwaVar2.e, cwaVar.e, 0.0f, 6);
            u2i0.a(bwaVar2.f, cwaVar.f, 0.0f, 6);
            njm.a(bwaVar2.g, cwaVar.g, 0.0f, 6);
            return Unit.a;
        }
    }

    public static final class c implements Function1<jxo, Unit> {
        public final /* synthetic */ osw a;

        public c(osw oswVar) {
            this.a = oswVar;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(jxo jxoVar) {
            this.a.k((int) (jxoVar.a >> 32));
            return Unit.a;
        }
    }

    public static final class d implements Function0<Unit> {
        public static final d a = new d();

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            return Unit.a;
        }
    }

    public static final class e implements Function1<bwa, Unit> {
        public final /* synthetic */ cwa a;

        public e(cwa cwaVar) {
            this.a = cwaVar;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(bwa bwaVar) {
            bwa bwaVar2 = bwaVar;
            bwaVar2.getClass();
            bwaVar2.h(new gqe("wrap"));
            bwaVar2.e(new gqe("spread"));
            hwa hwaVar = bwaVar2.e;
            cwa cwaVar = this.a;
            njm.a(hwaVar, cwaVar.e, 0.0f, 6);
            u2i0.a(bwaVar2.f, cwaVar.d, 0.0f, 6);
            njm.a(bwaVar2.g, cwaVar.g, 0.0f, 6);
            return Unit.a;
        }
    }

    public static final class f implements Function1<jxo, Unit> {
        public final /* synthetic */ osw a;

        public f(osw oswVar) {
            this.a = oswVar;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(jxo jxoVar) {
            this.a.k((int) (jxoVar.a >> 32));
            return Unit.a;
        }
    }

    public static final class g implements aiv {
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

        public g(ytw ytwVar, niv nivVar, twa twaVar, ytw ytwVar2) {
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

    public static final class h extends qlr implements Function0<Unit> {
        public final /* synthetic */ ytw a;
        public final /* synthetic */ twa b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(ytw ytwVar, twa twaVar) {
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

    public static final class i extends qlr implements Function1<pb80, Unit> {
        public final /* synthetic */ niv a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(niv nivVar) {
            super(1);
            this.a = nivVar;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(pb80 pb80Var) {
            b0g0.a(pb80Var, this.a);
            return Unit.a;
        }
    }

    public static final class j extends qlr implements Function2<androidx.compose.runtime.a, Integer, Unit> {
        public final /* synthetic */ ytw a;
        public final /* synthetic */ nwa b;
        public final /* synthetic */ Function0 c;
        public final /* synthetic */ wd0 d;
        public final /* synthetic */ osw e;
        public final /* synthetic */ osw f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(ytw ytwVar, nwa nwaVar, Function0 function0, wd0 wd0Var, osw oswVar, osw oswVar2) {
            super(2);
            this.a = ytwVar;
            this.b = nwaVar;
            this.c = function0;
            this.d = wd0Var;
            this.e = oswVar;
            this.f = oswVar2;
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
                    objY = b.a;
                    aVar2.r(objY);
                }
                androidx.compose.ui.d.a aVar3 = androidx.compose.ui.d.a.b;
                androidx.compose.ui.d dVarD = nwa.d(aVar3, cwaVarE, (Function1) objY);
                Object objY2 = aVar2.y();
                osw oswVar = this.e;
                if (objY2 == c0042a) {
                    objY2 = new c(oswVar);
                    aVar2.r(objY2);
                }
                androidx.compose.ui.d dVarA = w.a(dVarD, (Function1) objY2);
                aiv aivVarC = g75.c(ht.a.a, false);
                int iHashCode = Long.hashCode(aVar2.m());
                ne00 ne00VarO = aVar2.o();
                androidx.compose.ui.d dVarC = androidx.compose.ui.c.c(aVar2, dVarA);
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
                hlh0.a(aVar2, aivVarC, yka.a.f);
                hlh0.a(aVar2, ne00VarO, yka.a.e);
                yka.a.C1350a c1350a = yka.a.g;
                if (aVar2.g() || !Intrinsics.g(aVar2.y(), Integer.valueOf(iHashCode))) {
                    j3c.a(iHashCode, aVar2, iHashCode, c1350a);
                }
                hlh0.a(aVar2, dVarC, yka.a.d);
                String strA = cb40.a(R.string.page_instant_virtual__kick_off, new Object[0], aVar2);
                Object objY3 = aVar2.y();
                if (objY3 == c0042a) {
                    objY3 = d.a;
                    aVar2.r(objY3);
                }
                pn90.a(strA, "simulation_settlement_skip_button", (Function0) objY3, aVar2, 432);
                aVar2.s();
                boolean zM = aVar2.M(cwaVarE);
                Object objY4 = aVar2.y();
                if (zM || objY4 == c0042a) {
                    objY4 = new e(cwaVarE);
                    aVar2.r(objY4);
                }
                androidx.compose.ui.d dVarD2 = nwa.d(aVar3, cwaVarE2, (Function1) objY4);
                Object objY5 = aVar2.y();
                osw oswVar2 = this.f;
                if (objY5 == c0042a) {
                    objY5 = new f(oswVar2);
                    aVar2.r(objY5);
                }
                androidx.compose.ui.d dVarA2 = w.a(dVarD2, (Function1) objY5);
                float fD = oswVar2.D() + oswVar.D();
                wd0 wd0Var = this.d;
                aq90.a(dVarA2, ((Number) wd0Var.d()).floatValue() * fD, ((Number) wd0Var.d()).floatValue() * 720.0f, aVar2, 0);
                aVar2.H();
                if (nwaVar.b != i) {
                    use useVar = xvf.a;
                    aVar2.t(this.c);
                }
            }
            return Unit.a;
        }
    }

    public static final void a(final androidx.compose.ui.d dVar, final float f2, final float f3, androidx.compose.runtime.a aVar, final int i2) {
        androidx.compose.runtime.b bVarI = aVar.i(273778917);
        int i3 = (bVarI.M(dVar) ? 4 : 2) | i2 | (bVarI.c(f2) ? 32 : 16) | (bVarI.c(f3) ? 256 : 128);
        if (bVarI.q(i3 & 1, (i3 & 147) != 146)) {
            boolean z = (i3 & 112) == 32;
            Object objY = bVarI.y();
            androidx.compose.runtime.a.C0041a.C0042a c0042a = androidx.compose.runtime.a.C0041a.a;
            if (z || objY == c0042a) {
                objY = new Function1() { // from class: qp90
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        a7l a7lVar = (a7l) obj;
                        a7lVar.getClass();
                        a7lVar.B(f2);
                        return Unit.a;
                    }
                };
                bVarI.r(objY);
            }
            androidx.compose.ui.d dVarA = androidx.compose.ui.graphics.a.a(dVar, (Function1) objY);
            bVarI.N(-1003410150);
            bVarI.N(212064437);
            bVarI.X(false);
            mmd mmdVar = (mmd) bVarI.O(kna.h);
            Object objY2 = bVarI.y();
            if (objY2 == c0042a) {
                objY2 = rzj.a(mmdVar, bVarI);
            }
            niv nivVar = (niv) objY2;
            Object objY3 = bVarI.y();
            if (objY3 == c0042a) {
                objY3 = pzj.a(bVarI);
            }
            nwa nwaVar = (nwa) objY3;
            Object objY4 = bVarI.y();
            if (objY4 == c0042a) {
                objY4 = m.b(Boolean.FALSE);
                bVarI.r(objY4);
            }
            ytw ytwVar = (ytw) objY4;
            Object objY5 = bVarI.y();
            if (objY5 == c0042a) {
                objY5 = qzj.a(nwaVar, bVarI);
            }
            twa twaVar = (twa) objY5;
            Object objY6 = bVarI.y();
            if (objY6 == c0042a) {
                objY6 = m.a(Unit.a, epx.a);
                bVarI.r(objY6);
            }
            ytw ytwVar2 = (ytw) objY6;
            boolean zA = bVarI.A(nivVar) | bVarI.d(257);
            Object objY7 = bVarI.y();
            if (zA || objY7 == c0042a) {
                objY7 = new sp90(ytwVar2, nivVar, twaVar, ytwVar);
                bVarI.r(objY7);
            }
            aiv aivVar = (aiv) objY7;
            Object objY8 = bVarI.y();
            if (objY8 == c0042a) {
                objY8 = new tp90(ytwVar, twaVar);
                bVarI.r(objY8);
            }
            Function0 function0 = (Function0) objY8;
            boolean zA2 = bVarI.A(nivVar);
            Object objY9 = bVarI.y();
            if (zA2 || objY9 == c0042a) {
                objY9 = new up90(nivVar);
                bVarI.r(objY9);
            }
            lsr.a(xa80.b(dVarA, false, (Function1) objY9), pp8.b(1200550679, new vp90(ytwVar2, nwaVar, function0, f3), bVarI), aivVar, bVarI, 48);
            bVarI.X(false);
        } else {
            bVarI.G();
        }
        androidx.compose.runtime.e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2(f2, f3, i2) { // from class: rp90
                public final /* synthetic */ float b;
                public final /* synthetic */ float c;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = qj40.a(1);
                    aq90.a(this.a, this.b, this.c, (a) obj, iA);
                    return Unit.a;
                }
            };
        }
    }

    public static final void b(final Function0<Unit> function0, androidx.compose.runtime.a aVar, final int i2) {
        function0.getClass();
        androidx.compose.runtime.b bVarI = aVar.i(-28001321);
        int i3 = (bVarI.A(function0) ? 4 : 2) | i2;
        int i4 = 1;
        if (bVarI.q(i3 & 1, (i3 & 3) != 2)) {
            Object objY = bVarI.y();
            if (objY == androidx.compose.runtime.a.C0041a.a) {
                objY = new op90();
                bVarI.r(objY);
            }
            u60.a((Function0) objY, new yle(false, false, false), pp8.b(2041369646, new jii(function0, i4), bVarI), bVarI, 438, 0);
        } else {
            bVarI.G();
        }
        androidx.compose.runtime.e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2(i2, function0) { // from class: pp90
                public final /* synthetic */ Function0 a;

                {
                    this.a = function0;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = qj40.a(1);
                    aq90.b(this.a, (a) obj, iA);
                    return Unit.a;
                }
            };
        }
    }
}
