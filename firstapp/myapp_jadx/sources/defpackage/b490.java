package defpackage;

import androidx.compose.foundation.layout.j;
import androidx.compose.runtime.a;
import androidx.compose.runtime.m;
import androidx.compose.ui.d;
import androidx.compose.ui.layout.t;
import androidx.compose.ui.layout.y;
import com.sportybet.android.gp.tz.R;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
public final class b490 {

    public static final class a implements Function1<bwa, Unit> {
        public static final a a = new a();

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(bwa bwaVar) {
            bwa bwaVar2 = bwaVar;
            bwaVar2.getClass();
            hwa hwaVar = bwaVar2.e;
            cwa cwaVar = bwaVar2.c;
            njm.a(hwaVar, cwaVar.e, 0.0f, 6);
            njm.a(bwaVar2.g, cwaVar.g, 0.0f, 6);
            u2i0.a(bwaVar2.d, cwaVar.d, 0.0f, 6);
            u2i0.a(bwaVar2.f, cwaVar.f, 0.0f, 6);
            return Unit.a;
        }
    }

    public static final class b implements Function1<bwa, Unit> {
        public final /* synthetic */ cwa a;

        public b(cwa cwaVar) {
            this.a = cwaVar;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(bwa bwaVar) {
            bwa bwaVar2 = bwaVar;
            bwaVar2.getClass();
            hwa hwaVar = bwaVar2.e;
            cwa cwaVar = this.a;
            njm.a(hwaVar, cwaVar.e, 0.0f, 6);
            u2i0.a(bwaVar2.d, cwaVar.f, 0.0f, 6);
            return Unit.a;
        }
    }

    public static final class c implements aiv {
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

        public c(ytw ytwVar, niv nivVar, twa twaVar, ytw ytwVar2) {
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

    public static final class d extends qlr implements Function0<Unit> {
        public final /* synthetic */ ytw a;
        public final /* synthetic */ twa b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(ytw ytwVar, twa twaVar) {
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

    public static final class e extends qlr implements Function1<pb80, Unit> {
        public final /* synthetic */ niv a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(niv nivVar) {
            super(1);
            this.a = nivVar;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(pb80 pb80Var) {
            b0g0.a(pb80Var, this.a);
            return Unit.a;
        }
    }

    public static final class f extends qlr implements Function2<androidx.compose.runtime.a, Integer, Unit> {
        public final /* synthetic */ ytw a;
        public final /* synthetic */ nwa b;
        public final /* synthetic */ Function0 c;
        public final /* synthetic */ boolean d;
        public final /* synthetic */ boolean e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(ytw ytwVar, nwa nwaVar, Function0 function0, boolean z, boolean z2) {
            super(2);
            this.a = ytwVar;
            this.b = nwaVar;
            this.c = function0;
            this.d = z;
            this.e = z2;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(androidx.compose.runtime.a aVar, Integer num) {
            qyd0 qyd0Var;
            long j;
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
                if (this.d) {
                    aVar2.N(-1824192243);
                    qyd0Var = oib0.a;
                    j = ((lib0) aVar2.O(qyd0Var)).Y;
                    aVar2.H();
                } else {
                    aVar2.N(-1824130677);
                    qyd0Var = oib0.a;
                    j = ((lib0) aVar2.O(qyd0Var)).c0;
                    aVar2.H();
                }
                qyd0 qyd0Var2 = qyd0Var;
                long j2 = j;
                crz crzVarA = erz.a(R.drawable.ic__feature__statistic, 0, aVar2);
                androidx.compose.ui.d.a aVar3 = androidx.compose.ui.d.a.b;
                androidx.compose.ui.d dVarR = j.r(aVar3, 20.0f);
                Object objY = aVar2.y();
                androidx.compose.runtime.a.C0041a.C0042a c0042a = androidx.compose.runtime.a.C0041a.a;
                if (objY == c0042a) {
                    objY = a.a;
                    aVar2.r(objY);
                }
                h6n.b(crzVarA, "Stats icon", nwa.d(dVarR, cwaVarE, (Function1) objY), j2, aVar2, 48, 0);
                if (!this.e) {
                    androidx.compose.ui.d dVarR2 = j.r(aVar3, 6.0f);
                    boolean zM = aVar2.M(cwaVarE);
                    Object objY2 = aVar2.y();
                    if (zM || objY2 == c0042a) {
                        objY2 = new b(cwaVarE);
                        aVar2.r(objY2);
                    }
                    g75.a(androidx.compose.foundation.a.b(ls7.a(nwa.d(dVarR2, cwaVarE2, (Function1) objY2), j060.a), ((lib0) aVar2.O(qyd0Var2)).V, zk40.a), aVar2, 0);
                }
                aVar2.H();
                if (nwaVar.b != i) {
                    use useVar = xvf.a;
                    aVar2.t(this.c);
                }
            }
            return Unit.a;
        }
    }

    /* JADX WARN: Code duplicated, block: B:30:0x004f  */
    /* JADX WARN: Code duplicated, block: B:32:0x0057  */
    /* JADX WARN: Code duplicated, block: B:33:0x005a  */
    /* JADX WARN: Code duplicated, block: B:35:0x005e  */
    /* JADX WARN: Code duplicated, block: B:38:0x0067  */
    /* JADX WARN: Code duplicated, block: B:39:0x0069  */
    /* JADX WARN: Code duplicated, block: B:42:0x0072 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:43:0x0074  */
    /* JADX WARN: Code duplicated, block: B:46:0x009c  */
    /* JADX WARN: Code duplicated, block: B:49:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:51:? A[RETURN, SYNTHETIC] */
    public static final void a(final int i, final int i2, androidx.compose.runtime.a aVar, final androidx.compose.ui.d dVar, final Function0 function0, final boolean z, boolean z2) {
        int i3;
        final boolean z3;
        Function0 function1;
        boolean z4;
        final boolean z5;
        androidx.compose.runtime.e eVarZ;
        int i4;
        function0.getClass();
        androidx.compose.runtime.b bVarI = aVar.i(1511900200);
        if ((i & 6) == 0) {
            i3 = (bVarI.M(dVar) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= bVarI.b(z) ? 32 : 16;
        }
        int i5 = i2 & 4;
        if (i5 == 0) {
            if ((i & 384) == 0) {
                z3 = z2;
                i3 |= bVarI.b(z3) ? 256 : 128;
            }
            if ((i & 3072) == 0) {
                function1 = function0;
                if (bVarI.A(function1)) {
                    i4 = 2048;
                } else {
                    i4 = 1024;
                }
                i3 |= i4;
            } else {
                function1 = function0;
            }
            if ((i3 & 1171) != 1170) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (bVarI.q(i3 & 1, z4)) {
                if (i5 != 0) {
                    z3 = true;
                }
                c6n.a(function1, j.t(dVar, 44.0f, 48.0f), false, null, null, pp8.b(1273463366, new Function2() { // from class: z390
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        a aVar2 = (a) obj;
                        int iIntValue = ((Integer) obj2).intValue();
                        if (aVar2.q(iIntValue & 1, (iIntValue & 3) != 2)) {
                            d dVarE = j.e(d.a.b, 1.0f);
                            aVar2.N(-1003410150);
                            aVar2.N(212064437);
                            aVar2.H();
                            mmd mmdVar = (mmd) aVar2.O(kna.h);
                            Object objY = aVar2.y();
                            a.C0041a.C0042a c0042a = a.C0041a.a;
                            if (objY == c0042a) {
                                objY = new niv(mmdVar);
                                aVar2.r(objY);
                            }
                            niv nivVar = (niv) objY;
                            Object objY2 = aVar2.y();
                            if (objY2 == c0042a) {
                                objY2 = new nwa();
                                aVar2.r(objY2);
                            }
                            nwa nwaVar = (nwa) objY2;
                            Object objY3 = aVar2.y();
                            if (objY3 == c0042a) {
                                objY3 = m.b(Boolean.FALSE);
                                aVar2.r(objY3);
                            }
                            ytw ytwVar = (ytw) objY3;
                            Object objY4 = aVar2.y();
                            if (objY4 == c0042a) {
                                objY4 = new twa(nwaVar);
                                aVar2.r(objY4);
                            }
                            twa twaVar = (twa) objY4;
                            Object objY5 = aVar2.y();
                            if (objY5 == c0042a) {
                                objY5 = m.a(Unit.a, epx.a);
                                aVar2.r(objY5);
                            }
                            ytw ytwVar2 = (ytw) objY5;
                            boolean zA = aVar2.A(nivVar) | aVar2.d(257);
                            Object objY6 = aVar2.y();
                            if (zA || objY6 == c0042a) {
                                objY6 = new b490.c(ytwVar2, nivVar, twaVar, ytwVar);
                                aVar2.r(objY6);
                            }
                            aiv aivVar = (aiv) objY6;
                            Object objY7 = aVar2.y();
                            if (objY7 == c0042a) {
                                objY7 = new b490.d(ytwVar, twaVar);
                                aVar2.r(objY7);
                            }
                            Function0 function2 = (Function0) objY7;
                            boolean zA2 = aVar2.A(nivVar);
                            Object objY8 = aVar2.y();
                            if (zA2 || objY8 == c0042a) {
                                objY8 = new b490.e(nivVar);
                                aVar2.r(objY8);
                            }
                            lsr.a(xa80.b(dVarE, false, (Function1) objY8), pp8.b(1200550679, new b490.f(ytwVar2, nwaVar, function2, z3, z), aVar2), aivVar, aVar2, 48);
                            aVar2.H();
                        } else {
                            aVar2.G();
                        }
                        return Unit.a;
                    }
                }, bVarI), bVarI, ((i3 >> 9) & 14) | 1572864, 60);
            } else {
                bVarI.G();
            }
            z5 = z3;
            eVarZ = bVarI.Z();
            if (eVarZ != null) {
                eVarZ.d = new Function2() { // from class: a490
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        b490.a(qj40.a(i | 1), i2, (a) obj, dVar, function0, z, z5);
                        return Unit.a;
                    }
                };
            }
        }
        i3 |= 384;
        z3 = z2;
        if ((i & 3072) == 0) {
            function1 = function0;
            if (bVarI.A(function1)) {
                i4 = 2048;
            } else {
                i4 = 1024;
            }
            i3 |= i4;
        } else {
            function1 = function0;
        }
        if ((i3 & 1171) != 1170) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (bVarI.q(i3 & 1, z4)) {
            if (i5 != 0) {
                z3 = true;
            }
            c6n.a(function1, j.t(dVar, 44.0f, 48.0f), false, null, null, pp8.b(1273463366, new Function2() { // from class: z390
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    a aVar2 = (a) obj;
                    int iIntValue = ((Integer) obj2).intValue();
                    if (aVar2.q(iIntValue & 1, (iIntValue & 3) != 2)) {
                        d dVarE = j.e(d.a.b, 1.0f);
                        aVar2.N(-1003410150);
                        aVar2.N(212064437);
                        aVar2.H();
                        mmd mmdVar = (mmd) aVar2.O(kna.h);
                        Object objY = aVar2.y();
                        a.C0041a.C0042a c0042a = a.C0041a.a;
                        if (objY == c0042a) {
                            objY = new niv(mmdVar);
                            aVar2.r(objY);
                        }
                        niv nivVar = (niv) objY;
                        Object objY2 = aVar2.y();
                        if (objY2 == c0042a) {
                            objY2 = new nwa();
                            aVar2.r(objY2);
                        }
                        nwa nwaVar = (nwa) objY2;
                        Object objY3 = aVar2.y();
                        if (objY3 == c0042a) {
                            objY3 = m.b(Boolean.FALSE);
                            aVar2.r(objY3);
                        }
                        ytw ytwVar = (ytw) objY3;
                        Object objY4 = aVar2.y();
                        if (objY4 == c0042a) {
                            objY4 = new twa(nwaVar);
                            aVar2.r(objY4);
                        }
                        twa twaVar = (twa) objY4;
                        Object objY5 = aVar2.y();
                        if (objY5 == c0042a) {
                            objY5 = m.a(Unit.a, epx.a);
                            aVar2.r(objY5);
                        }
                        ytw ytwVar2 = (ytw) objY5;
                        boolean zA = aVar2.A(nivVar) | aVar2.d(257);
                        Object objY6 = aVar2.y();
                        if (zA || objY6 == c0042a) {
                            objY6 = new b490.c(ytwVar2, nivVar, twaVar, ytwVar);
                            aVar2.r(objY6);
                        }
                        aiv aivVar = (aiv) objY6;
                        Object objY7 = aVar2.y();
                        if (objY7 == c0042a) {
                            objY7 = new b490.d(ytwVar, twaVar);
                            aVar2.r(objY7);
                        }
                        Function0 function2 = (Function0) objY7;
                        boolean zA2 = aVar2.A(nivVar);
                        Object objY8 = aVar2.y();
                        if (zA2 || objY8 == c0042a) {
                            objY8 = new b490.e(nivVar);
                            aVar2.r(objY8);
                        }
                        lsr.a(xa80.b(dVarE, false, (Function1) objY8), pp8.b(1200550679, new b490.f(ytwVar2, nwaVar, function2, z3, z), aVar2), aivVar, aVar2, 48);
                        aVar2.H();
                    } else {
                        aVar2.G();
                    }
                    return Unit.a;
                }
            }, bVarI), bVarI, ((i3 >> 9) & 14) | 1572864, 60);
        } else {
            bVarI.G();
        }
        z5 = z3;
        eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2() { // from class: a490
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    b490.a(qj40.a(i | 1), i2, (a) obj, dVar, function0, z, z5);
                    return Unit.a;
                }
            };
        }
    }
}
