package defpackage;

import com.sportygames.newcms.CMSRes;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CancellationException;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class gux extends j8i0 implements nx2, x8x {
    public final wwd0 A;
    public final wwd0 B;
    public final wwd0 C;
    public final wwd0 D;
    public final v340 E;
    public final wwd0 F;
    public final v340 G;
    public final wwd0 H;
    public final wwd0 I;
    public final wwd0 J;
    public final v340 K;
    public final v340 L;
    public final wwd0 M;
    public dm8 N;
    public dm8 O;
    public dm8 P;
    public final v340 Q;
    public final ju90<Object> R;
    public final k5b a;
    public final e9x b;
    public final s8x c;
    public final hbx d;
    public final vax e;
    public final en20 f;
    public final String i;
    public boolean v;
    public boolean w;
    public final v340 y;
    public final v340 z;

    @c0d(c = "com.sportygames.nightnday.presentation.NightNDayViewModel$2", f = "NightNDayViewModel.kt", l = {282}, m = "invokeSuspend", v = 1)
    public static final class a extends tje0 implements Function2<gax, v1b<? super Unit>, Object> {
        public int a;

        public a(v1b<? super a> v1bVar) {
            super(2, v1bVar);
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            return gux.this.new a(v1bVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(gax gaxVar, v1b<? super Unit> v1bVar) {
            return ((a) create(gaxVar, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            gux guxVar = gux.this;
            v340 v340Var = guxVar.K;
            y5b y5bVar = y5b.a;
            int i = this.a;
            if (i == 0) {
                uj50.b(obj);
                guxVar.w = true;
                wwd0 wwd0Var = guxVar.I;
                com.sportygames.newcms.b bVar = (com.sportygames.newcms.b) v340Var.a.getValue();
                shj shjVar = shj.v0;
                v8x.a aVar = new v8x.a(bVar.b(shjVar.h0, ""), ((com.sportygames.newcms.b) v340Var.a.getValue()).b(shjVar.g0, ""), ((com.sportygames.newcms.b) v340Var.a.getValue()).b(shjVar.f0, ""), new z8x.i(false), new z8x.i(true));
                this.a = 1;
                wwd0Var.getClass();
                wwd0Var.k(null, aVar);
                if (Unit.a == y5bVar) {
                    return y5bVar;
                }
            } else {
                if (i != 1) {
                    ib5.a("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                uj50.b(obj);
            }
            return Unit.a;
        }
    }

    @c0d(c = "com.sportygames.nightnday.presentation.NightNDayViewModel$3", f = "NightNDayViewModel.kt", l = {294, 295}, m = "invokeSuspend", v = 1)
    public static final class b extends tje0 implements Function2<d9x.c, v1b<? super Unit>, Object> {
        public int a;
        public /* synthetic */ Object b;

        public b(v1b<? super b> v1bVar) {
            super(2, v1bVar);
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            b bVar = gux.this.new b(v1bVar);
            bVar.b = obj;
            return bVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(d9x.c cVar, v1b<? super Unit> v1bVar) {
            return ((b) create(cVar, v1bVar)).invokeSuspend(Unit.a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x004d, code lost:
        
            if (kotlin.Unit.a == r1) goto L15;
         */
        @Override // defpackage.pz1
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r9) {
            /*
                r8 = this;
                java.lang.Object r0 = r8.b
                d9x$c r0 = (d9x.c) r0
                y5b r1 = defpackage.y5b.a
                int r2 = r8.a
                r3 = 0
                gux r4 = defpackage.gux.this
                r5 = 2
                r6 = 1
                if (r2 == 0) goto L21
                if (r2 == r6) goto L1d
                if (r2 != r5) goto L17
                defpackage.uj50.b(r9)
                goto L50
            L17:
                java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
                defpackage.ib5.a(r8)
                return r3
            L1d:
                defpackage.uj50.b(r9)
                goto L34
            L21:
                defpackage.uj50.b(r9)
                wwd0 r9 = r4.H
                gbx r2 = r0.f
                r8.b = r0
                r8.a = r6
                r9.setValue(r2)
                kotlin.Unit r9 = kotlin.Unit.a
                if (r9 != r1) goto L34
                goto L4f
            L34:
                wwd0 r9 = r4.J
                y6x$a r2 = new y6x$a
                double r6 = r0.d
                java.math.BigDecimal r0 = defpackage.gux.E1(r6)
                r2.<init>(r0)
                r8.b = r3
                r8.a = r5
                r9.getClass()
                r9.k(r3, r2)
                kotlin.Unit r8 = kotlin.Unit.a
                if (r8 != r1) goto L50
            L4f:
                return r1
            L50:
                kotlin.Unit r8 = kotlin.Unit.a
                return r8
            */
            throw new UnsupportedOperationException("Method not decompiled: gux.b.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @c0d(c = "com.sportygames.nightnday.presentation.NightNDayViewModel$4", f = "NightNDayViewModel.kt", l = {299}, m = "invokeSuspend", v = 1)
    public static final class c extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public int a;
        public /* synthetic */ Object b;

        @c0d(c = "com.sportygames.nightnday.presentation.NightNDayViewModel$4$1", f = "NightNDayViewModel.kt", l = {304, 305, 309, 310, 316, 318, 336, 337, 339, 341, 350, 352, 353, 362, 364}, m = "invokeSuspend", v = 1)
        public static final class a extends tje0 implements Function2<b9x, v1b<? super Unit>, Object> {
            public pjd a;
            public int b;
            public /* synthetic */ Object c;
            public final /* synthetic */ gux d;
            public final /* synthetic */ v5b e;

            /* JADX INFO: renamed from: gux$c$a$a, reason: collision with other inner class name */
            @c0d(c = "com.sportygames.nightnday.presentation.NightNDayViewModel$4$1$1", f = "NightNDayViewModel.kt", l = {305}, m = "invokeSuspend", v = 1)
            public static final class C0609a extends tje0 implements Function2<v5b, v1b<? super gbx>, Object> {
                public int a;
                public final /* synthetic */ gux b;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C0609a(gux guxVar, v1b<? super C0609a> v1bVar) {
                    super(2, v1bVar);
                    this.b = guxVar;
                }

                @Override // defpackage.pz1
                public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
                    return new C0609a(this.b, v1bVar);
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(v5b v5bVar, v1b<? super gbx> v1bVar) {
                    return ((C0609a) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
                }

                @Override // defpackage.pz1
                public final Object invokeSuspend(Object obj) {
                    y5b y5bVar = y5b.a;
                    int i = this.a;
                    if (i != 0) {
                        if (i == 1) {
                            uj50.b(obj);
                            return obj;
                        }
                        ib5.a("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    uj50.b(obj);
                    this.a = 1;
                    gux guxVar = this.b;
                    Object objD = ej5.d(guxVar.a, new mux(guxVar, null), this);
                    return objD == y5bVar ? y5bVar : objD;
                }
            }

            @c0d(c = "com.sportygames.nightnday.presentation.NightNDayViewModel$4$1$2", f = "NightNDayViewModel.kt", l = {310}, m = "invokeSuspend", v = 1)
            public static final class b extends tje0 implements Function2<v5b, v1b<? super gbx>, Object> {
                public int a;
                public final /* synthetic */ gux b;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public b(gux guxVar, v1b<? super b> v1bVar) {
                    super(2, v1bVar);
                    this.b = guxVar;
                }

                @Override // defpackage.pz1
                public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
                    return new b(this.b, v1bVar);
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(v5b v5bVar, v1b<? super gbx> v1bVar) {
                    return ((b) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
                }

                @Override // defpackage.pz1
                public final Object invokeSuspend(Object obj) {
                    y5b y5bVar = y5b.a;
                    int i = this.a;
                    if (i != 0) {
                        if (i == 1) {
                            uj50.b(obj);
                            return obj;
                        }
                        ib5.a("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    uj50.b(obj);
                    this.a = 1;
                    gux guxVar = this.b;
                    Object objD = ej5.d(guxVar.a, new mux(guxVar, null), this);
                    return objD == y5bVar ? y5bVar : objD;
                }
            }

            /* JADX INFO: renamed from: gux$c$a$c, reason: collision with other inner class name */
            @c0d(c = "com.sportygames.nightnday.presentation.NightNDayViewModel$4$1$betJob$1", f = "NightNDayViewModel.kt", l = {360}, m = "invokeSuspend", v = 1)
            public static final class C0610c extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
                public int a;
                public final /* synthetic */ gux b;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C0610c(gux guxVar, v1b<? super C0610c> v1bVar) {
                    super(2, v1bVar);
                    this.b = guxVar;
                }

                @Override // defpackage.pz1
                public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
                    return new C0610c(this.b, v1bVar);
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
                    return ((C0610c) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
                }

                @Override // defpackage.pz1
                public final Object invokeSuspend(Object obj) {
                    Object obj2 = y5b.a;
                    int i = this.a;
                    if (i == 0) {
                        uj50.b(obj);
                        gux guxVar = this.b;
                        fbx fbxVar = (fbx) guxVar.C.getValue();
                        this.a = 1;
                        Object objD = ej5.d(guxVar.a, new hux(guxVar, fbxVar, null), this);
                        if (objD != obj2) {
                            objD = Unit.a;
                        }
                        if (objD == obj2) {
                            return obj2;
                        }
                    } else {
                        if (i != 1) {
                            ib5.a("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        uj50.b(obj);
                    }
                    return Unit.a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(gux guxVar, v5b v5bVar, v1b<? super a> v1bVar) {
                super(2, v1bVar);
                this.d = guxVar;
                this.e = v5bVar;
            }

            @Override // defpackage.pz1
            public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
                a aVar = new a(this.d, this.e, v1bVar);
                aVar.c = obj;
                return aVar;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(b9x b9xVar, v1b<? super Unit> v1bVar) {
                return ((a) create(b9xVar, v1bVar)).invokeSuspend(Unit.a);
            }

            /* JADX WARN: Code duplicated, block: B:102:0x0247  */
            /* JADX WARN: Code duplicated, block: B:112:0x0285 A[PHI: r1
              0x0285: PHI (r1v9 pjd) = (r1v1 pjd), (r1v1 pjd), (r1v10 pjd) binds: [B:108:0x0274, B:110:0x0282, B:6:0x001e] A[DONT_GENERATE, DONT_INLINE]] */
            /* JADX WARN: Code duplicated, block: B:114:0x029d  */
            /* JADX WARN: Code duplicated, block: B:115:0x02a8  */
            /* JADX WARN: Code duplicated, block: B:44:0x00f0  */
            /* JADX WARN: Code duplicated, block: B:46:0x0105  */
            /* JADX WARN: Code duplicated, block: B:47:0x0110  */
            /* JADX WARN: Code duplicated, block: B:77:0x0199  */
            /* JADX WARN: Code duplicated, block: B:80:0x01ad  */
            /* JADX WARN: Code duplicated, block: B:82:0x01b1  */
            /* JADX WARN: Code duplicated, block: B:85:0x01c1  */
            /* JADX WARN: Code duplicated, block: B:87:0x01d5  */
            /* JADX WARN: Code duplicated, block: B:88:0x01dd  */
            /* JADX WARN: Code restructure failed: missing block: B:103:0x0251, code lost:
            
                if (defpackage.c9x.c(r3, r11) == r5) goto L117;
             */
            /* JADX WARN: Code restructure failed: missing block: B:116:0x02aa, code lost:
            
                if (r11 == r5) goto L117;
             */
            /* JADX WARN: Code restructure failed: missing block: B:27:0x00a0, code lost:
            
                if (defpackage.c9x.b(r3, r12, r11) == r5) goto L117;
             */
            /* JADX WARN: Code restructure failed: missing block: B:35:0x00ca, code lost:
            
                if (defpackage.c9x.b(r3, r12, r11) == r5) goto L117;
             */
            /* JADX WARN: Code restructure failed: missing block: B:48:0x0112, code lost:
            
                if (r11 == r5) goto L117;
             */
            /* JADX WARN: Code restructure failed: missing block: B:89:0x01df, code lost:
            
                if (r11 == r5) goto L117;
             */
            @Override // defpackage.pz1
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object invokeSuspend(java.lang.Object r12) {
                /*
                    Method dump skipped, instruction units count: 728
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: gux.c.a.invokeSuspend(java.lang.Object):java.lang.Object");
            }
        }

        public c(v1b<? super c> v1bVar) {
            super(2, v1bVar);
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            c cVar = gux.this.new c(v1bVar);
            cVar.b = obj;
            return cVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
            return ((c) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            v5b v5bVar = (v5b) this.b;
            y5b y5bVar = y5b.a;
            int i = this.a;
            if (i == 0) {
                uj50.b(obj);
                gux guxVar = gux.this;
                wwd0 wwd0Var = guxVar.B;
                a aVar = new a(guxVar, v5bVar, null);
                this.b = null;
                this.a = 1;
                if (kzh.b(wwd0Var, aVar, this) == y5bVar) {
                    return y5bVar;
                }
            } else {
                if (i != 1) {
                    ib5.a("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                uj50.b(obj);
            }
            return Unit.a;
        }
    }

    @c0d(c = "com.sportygames.nightnday.presentation.NightNDayViewModel$animationState$1", f = "NightNDayViewModel.kt", l = {}, m = "invokeSuspend", v = 1)
    public static final class d extends tje0 implements gaj<d9x, dbx, v1b<? super x6x>, Object> {
        public /* synthetic */ d9x a;
        public /* synthetic */ dbx b;

        @Override // defpackage.gaj
        public final Object invoke(d9x d9xVar, dbx dbxVar, v1b<? super x6x> v1bVar) {
            d dVar = new d(3, v1bVar);
            dVar.a = d9xVar;
            dVar.b = dbxVar;
            return dVar.invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            d9x d9xVar = this.a;
            dbx dbxVar = this.b;
            y5b y5bVar = y5b.a;
            uj50.b(obj);
            return d9xVar instanceof d9x.c ? new x6x.a(dbxVar) : x6x.b.a;
        }
    }

    @c0d(c = "com.sportygames.nightnday.presentation.NightNDayViewModel$betResultState$1", f = "NightNDayViewModel.kt", l = {}, m = "invokeSuspend", v = 1)
    public static final class e extends tje0 implements jaj<a7x, b9x, y6x, fbx, v1b<? super r8x>, Object> {
        public /* synthetic */ a7x a;
        public /* synthetic */ b9x b;
        public /* synthetic */ y6x c;
        public /* synthetic */ fbx d;

        public e(v1b<? super e> v1bVar) {
            super(5, v1bVar);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            yax aVar;
            a7x a7xVar = this.a;
            b9x b9xVar = this.b;
            y6x y6xVar = this.c;
            fbx fbxVar = this.d;
            y5b y5bVar = y5b.a;
            uj50.b(obj);
            a7xVar.getClass();
            b9xVar.getClass();
            y6xVar.getClass();
            fbxVar.getClass();
            if (!(b9xVar instanceof b9x.f) && !b9xVar.equals(b9x.e.a)) {
                return r8x.b.a;
            }
            boolean z = a7xVar.j;
            String str = a7xVar.c;
            if (!z) {
                return new r8x.a.C1043a(nx2.a.a[fbxVar.ordinal()] == 1 ? shj.v0.h : shj.v0.i);
            }
            String strK = nx2.k(a7xVar.g, str);
            if (y6xVar instanceof y6x.a) {
                aVar = yax.b.a;
            } else {
                if (!(y6xVar instanceof y6x.b)) {
                    uhc.a();
                    return null;
                }
                aVar = new yax.a(nx2.k(a7xVar.d, str), nx2.k(a7xVar.i, str));
            }
            return new r8x.a.b(strK, aVar);
        }

        @Override // defpackage.jaj
        public final Object l(a7x a7xVar, b9x b9xVar, y6x y6xVar, fbx fbxVar, v1b<? super r8x> v1bVar) {
            e eVar = gux.this.new e(v1bVar);
            eVar.a = a7xVar;
            eVar.b = b9xVar;
            eVar.c = y6xVar;
            eVar.d = fbxVar;
            return eVar.invokeSuspend(Unit.a);
        }
    }

    @c0d(c = "com.sportygames.nightnday.presentation.NightNDayViewModel$betSliderState$1", f = "NightNDayViewModel.kt", l = {}, m = "invokeSuspend", v = 1)
    public static final class f extends tje0 implements iaj<d9x.c, y6x, gbx, v1b<? super s03>, Object> {
        public /* synthetic */ d9x.c a;
        public /* synthetic */ y6x b;
        public /* synthetic */ gbx c;

        @Override // defpackage.iaj
        public final Object d(d9x.c cVar, y6x y6xVar, gbx gbxVar, v1b<? super s03> v1bVar) {
            f fVar = new f(4, v1bVar);
            fVar.a = cVar;
            fVar.b = y6xVar;
            fVar.c = gbxVar;
            return fVar.invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            boolean z;
            d9x.c cVar = this.a;
            y6x y6xVar = this.b;
            gbx gbxVar = this.c;
            y5b y5bVar = y5b.a;
            uj50.b(obj);
            BigDecimal bigDecimal = new BigDecimal(String.valueOf(cVar.c));
            double d = cVar.b;
            BigDecimal bigDecimalSubtract = bigDecimal.subtract(new BigDecimal(String.valueOf(d)));
            bigDecimalSubtract.getClass();
            BigDecimal bigDecimalAbs = bigDecimalSubtract.abs();
            bigDecimalAbs.getClass();
            BigDecimal bigDecimalValueOf = BigDecimal.valueOf(100L);
            bigDecimalValueOf.getClass();
            bigDecimalAbs.divide(bigDecimalValueOf, RoundingMode.HALF_EVEN).getClass();
            BigDecimal bigDecimalValueOf2 = BigDecimal.valueOf(y6xVar.d().doubleValue());
            bigDecimalValueOf2.getClass();
            BigDecimal bigDecimal2 = skd0.b;
            BigDecimal bigDecimalValueOf3 = BigDecimal.valueOf(d);
            bigDecimalValueOf3.getClass();
            BigDecimal bigDecimalValueOf4 = BigDecimal.valueOf(cVar.c);
            bigDecimalValueOf4.getClass();
            if (y6xVar instanceof y6x.a) {
                z = false;
            } else {
                if (!(y6xVar instanceof y6x.b)) {
                    uhc.a();
                    return null;
                }
                z = true;
            }
            boolean z2 = z;
            BigDecimal bigDecimalValueOf5 = BigDecimal.valueOf(gbxVar.a);
            bigDecimalValueOf5.getClass();
            qcn<Double> qcnVar = cVar.e;
            ArrayList arrayList = new ArrayList(l48.r(qcnVar, 10));
            Iterator<Double> it = qcnVar.iterator();
            while (it.hasNext()) {
                BigDecimal bigDecimalValueOf6 = BigDecimal.valueOf(it.next().doubleValue());
                bigDecimalValueOf6.getClass();
                arrayList.add(new skd0(bigDecimalValueOf6));
            }
            return new s03(bigDecimalValueOf3, bigDecimalValueOf4, bigDecimalValueOf2, z2, bigDecimalValueOf5, a4h.f(arrayList));
        }
    }

    @c0d(c = "com.sportygames.nightnday.presentation.NightNDayViewModel$chipSelectorState$1", f = "NightNDayViewModel.kt", l = {}, m = "invokeSuspend", v = 1)
    public static final class g extends tje0 implements iaj<d9x.c, y6x, gbx, v1b<? super bm7>, Object> {
        public /* synthetic */ d9x.c a;
        public /* synthetic */ y6x b;
        public /* synthetic */ gbx c;

        @Override // defpackage.iaj
        public final Object d(d9x.c cVar, y6x y6xVar, gbx gbxVar, v1b<? super bm7> v1bVar) {
            g gVar = new g(4, v1bVar);
            gVar.a = cVar;
            gVar.b = y6xVar;
            gVar.c = gbxVar;
            return gVar.invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            boolean z;
            d9x.c cVar = this.a;
            y6x y6xVar = this.b;
            gbx gbxVar = this.c;
            y5b y5bVar = y5b.a;
            uj50.b(obj);
            if (y6xVar instanceof y6x.a) {
                z = true;
            } else {
                if (!(y6xVar instanceof y6x.b)) {
                    uhc.a();
                    return null;
                }
                z = false;
            }
            boolean z2 = z;
            boolean z3 = gbxVar.d;
            qcn<Double> qcnVar = cVar.e;
            ArrayList arrayList = new ArrayList(l48.r(qcnVar, 10));
            Iterator<Double> it = qcnVar.iterator();
            while (it.hasNext()) {
                BigDecimal bigDecimalValueOf = BigDecimal.valueOf(it.next().doubleValue());
                bigDecimalValueOf.getClass();
                arrayList.add(new skd0(bigDecimalValueOf));
            }
            uf00 uf00VarF = a4h.f(arrayList);
            BigDecimal bigDecimalValueOf2 = BigDecimal.valueOf(y6xVar.d().doubleValue());
            bigDecimalValueOf2.getClass();
            BigDecimal bigDecimal = skd0.b;
            BigDecimal bigDecimalValueOf3 = BigDecimal.valueOf(cVar.b);
            bigDecimalValueOf3.getClass();
            BigDecimal bigDecimalValueOf4 = BigDecimal.valueOf(cVar.c);
            bigDecimalValueOf4.getClass();
            return new bm7(z2, z3, uf00VarF, bigDecimalValueOf3, bigDecimalValueOf4, bigDecimalValueOf2);
        }
    }

    @c0d(c = "com.sportygames.nightnday.presentation.NightNDayViewModel$controlPanelState$1", f = "NightNDayViewModel.kt", l = {}, m = "invokeSuspend", v = 1)
    public static final class h extends tje0 implements iaj<b9x, s03, bm7, v1b<? super u8x>, Object> {
        public /* synthetic */ b9x a;
        public /* synthetic */ s03 b;
        public /* synthetic */ bm7 c;

        @Override // defpackage.iaj
        public final Object d(b9x b9xVar, s03 s03Var, bm7 bm7Var, v1b<? super u8x> v1bVar) {
            h hVar = new h(4, v1bVar);
            hVar.a = b9xVar;
            hVar.b = s03Var;
            hVar.c = bm7Var;
            return hVar.invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            b9x b9xVar = this.a;
            s03 s03Var = this.b;
            bm7 bm7Var = this.c;
            y5b y5bVar = y5b.a;
            uj50.b(obj);
            return Intrinsics.g(b9xVar, b9x.c.a) ? new u8x.a(s03Var, bm7Var) : u8x.b.a;
        }
    }

    @c0d(c = "com.sportygames.nightnday.presentation.NightNDayViewModel$handleEvent$1", f = "NightNDayViewModel.kt", l = {433, 434}, m = "invokeSuspend", v = 1)
    public static final class i extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ z8x c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(z8x z8xVar, v1b<? super i> v1bVar) {
            super(2, v1bVar);
            this.c = z8xVar;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            return gux.this.new i(this.c, v1bVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
            return ((i) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x003a, code lost:
        
            if (defpackage.c9x.a(r6, r5) == r0) goto L15;
         */
        @Override // defpackage.pz1
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r6) {
            /*
                r5 = this;
                y5b r0 = defpackage.y5b.a
                int r1 = r5.a
                gux r2 = defpackage.gux.this
                r3 = 2
                r4 = 1
                if (r1 == 0) goto L1d
                if (r1 == r4) goto L19
                if (r1 != r3) goto L12
                defpackage.uj50.b(r6)
                goto L3d
            L12:
                java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
                defpackage.ib5.a(r5)
                r5 = 0
                return r5
            L19:
                defpackage.uj50.b(r6)
                goto L32
            L1d:
                defpackage.uj50.b(r6)
                wwd0 r6 = r2.C
                z8x r1 = r5.c
                z8x$b r1 = (z8x.b) r1
                fbx r1 = r1.a
                r5.a = r4
                r6.setValue(r1)
                kotlin.Unit r6 = kotlin.Unit.a
                if (r6 != r0) goto L32
                goto L3c
            L32:
                wwd0 r6 = r2.B
                r5.a = r3
                java.lang.Object r5 = defpackage.c9x.a(r6, r5)
                if (r5 != r0) goto L3d
            L3c:
                return r0
            L3d:
                kotlin.Unit r5 = kotlin.Unit.a
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: gux.i.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @c0d(c = "com.sportygames.nightnday.presentation.NightNDayViewModel$handleEvent$2", f = "NightNDayViewModel.kt", l = {440}, m = "invokeSuspend", v = 1)
    public static final class j extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public int a;

        public j(v1b<? super j> v1bVar) {
            super(2, v1bVar);
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            return gux.this.new j(v1bVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
            return ((j) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            Unit unit;
            y5b y5bVar = y5b.a;
            int i = this.a;
            if (i == 0) {
                uj50.b(obj);
                wwd0 wwd0Var = gux.this.B;
                this.a = 1;
                if (((b9x) wwd0Var.getValue()) instanceof b9x.e) {
                    wwd0Var.setValue(b9x.a.a);
                    unit = Unit.a;
                } else {
                    unit = Unit.a;
                }
                if (unit == y5bVar) {
                    return y5bVar;
                }
            } else {
                if (i != 1) {
                    ib5.a("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                uj50.b(obj);
            }
            return Unit.a;
        }
    }

    @c0d(c = "com.sportygames.nightnday.presentation.NightNDayViewModel$handleEvent$3", f = "NightNDayViewModel.kt", l = {453}, m = "invokeSuspend", v = 1)
    public static final class k extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public int a;

        public k(v1b<? super k> v1bVar) {
            super(2, v1bVar);
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            return gux.this.new k(v1bVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
            return ((k) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            y5b y5bVar = y5b.a;
            int i = this.a;
            if (i == 0) {
                uj50.b(obj);
                wwd0 wwd0Var = gux.this.B;
                this.a = 1;
                if (c9x.a(wwd0Var, this) == y5bVar) {
                    return y5bVar;
                }
            } else {
                if (i != 1) {
                    ib5.a("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                uj50.b(obj);
            }
            return Unit.a;
        }
    }

    @c0d(c = "com.sportygames.nightnday.presentation.NightNDayViewModel$handleEvent$5", f = "NightNDayViewModel.kt", l = {524, 525}, m = "invokeSuspend", v = 1)
    public static final class l extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ z8x c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public l(z8x z8xVar, v1b<? super l> v1bVar) {
            super(2, v1bVar);
            this.c = z8xVar;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            return gux.this.new l(this.c, v1bVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
            return ((l) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x003e, code lost:
        
            if (kotlin.Unit.a == r0) goto L15;
         */
        @Override // defpackage.pz1
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r6) {
            /*
                r5 = this;
                y5b r0 = defpackage.y5b.a
                int r1 = r5.a
                gux r2 = defpackage.gux.this
                r3 = 2
                r4 = 1
                if (r1 == 0) goto L1d
                if (r1 == r4) goto L19
                if (r1 != r3) goto L12
                defpackage.uj50.b(r6)
                goto L41
            L12:
                java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
                defpackage.ib5.a(r5)
                r5 = 0
                return r5
            L19:
                defpackage.uj50.b(r6)
                goto L33
            L1d:
                defpackage.uj50.b(r6)
                en20 r6 = r2.f
                z8x r1 = r5.c
                z8x$i r1 = (z8x.i) r1
                boolean r1 = r1.a
                r5.a = r4
                java.lang.String r4 = "key-NND-one-tap-bet"
                java.lang.Object r6 = r6.a(r4, r1, r5)
                if (r6 != r0) goto L33
                goto L40
            L33:
                wwd0 r6 = r2.I
                v8x$d r1 = v8x.d.a
                r5.a = r3
                r6.setValue(r1)
                kotlin.Unit r5 = kotlin.Unit.a
                if (r5 != r0) goto L41
            L40:
                return r0
            L41:
                kotlin.Unit r5 = kotlin.Unit.a
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: gux.l.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @c0d(c = "com.sportygames.nightnday.presentation.NightNDayViewModel$loadedState$1", f = "NightNDayViewModel.kt", l = {}, m = "invokeSuspend", v = 1)
    public static final class m extends tje0 implements gaj<r8x, z6x, v1b<? super Pair<? extends r8x, ? extends z6x>>, Object> {
        public /* synthetic */ r8x a;
        public /* synthetic */ z6x b;

        @Override // defpackage.gaj
        public final Object invoke(r8x r8xVar, z6x z6xVar, v1b<? super Pair<? extends r8x, ? extends z6x>> v1bVar) {
            m mVar = new m(3, v1bVar);
            mVar.a = r8xVar;
            mVar.b = z6xVar;
            return mVar.invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            r8x r8xVar = this.a;
            z6x z6xVar = this.b;
            y5b y5bVar = y5b.a;
            uj50.b(obj);
            return new Pair(r8xVar, z6xVar);
        }
    }

    @c0d(c = "com.sportygames.nightnday.presentation.NightNDayViewModel$loadedState$2", f = "NightNDayViewModel.kt", l = {}, m = "invokeSuspend", v = 1)
    public static final class n extends tje0 implements kaj<Pair<? extends r8x, ? extends z6x>, uax, u8x, jv1, Boolean, v1b<? super gax.a>, Object> {
        public /* synthetic */ Pair a;
        public /* synthetic */ uax b;
        public /* synthetic */ u8x c;
        public /* synthetic */ jv1 d;
        public /* synthetic */ boolean e;

        public n(v1b<? super n> v1bVar) {
            super(6, v1bVar);
        }

        @Override // defpackage.kaj
        public final Object f(Pair<? extends r8x, ? extends z6x> pair, uax uaxVar, u8x u8xVar, jv1 jv1Var, Boolean bool, v1b<? super gax.a> v1bVar) {
            boolean zBooleanValue = bool.booleanValue();
            n nVar = new n(v1bVar);
            nVar.a = pair;
            nVar.b = uaxVar;
            nVar.c = u8xVar;
            nVar.d = jv1Var;
            nVar.e = zBooleanValue;
            return nVar.invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            Pair pair = this.a;
            uax uaxVar = this.b;
            u8x u8xVar = this.c;
            jv1 jv1Var = this.d;
            boolean z = this.e;
            y5b y5bVar = y5b.a;
            uj50.b(obj);
            return new gax.a((z6x) pair.b, uaxVar, u8xVar, jv1Var, (r8x) pair.a, z);
        }
    }

    @c0d(c = "com.sportygames.nightnday.presentation.NightNDayViewModel$loadingState$1", f = "NightNDayViewModel.kt", l = {}, m = "invokeSuspend", v = 1)
    public static final class o extends tje0 implements jaj<Boolean, d9x, Boolean, gax.a, v1b<? super gax>, Object> {
        public /* synthetic */ boolean a;
        public /* synthetic */ d9x b;
        public /* synthetic */ boolean c;
        public /* synthetic */ gax.a d;

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            boolean z = this.a;
            d9x d9xVar = this.b;
            boolean z2 = this.c;
            gax.a aVar = this.d;
            y5b y5bVar = y5b.a;
            uj50.b(obj);
            if (d9xVar instanceof d9x.b) {
                return new gax.b(((d9x.b) d9xVar).a);
            }
            if ((d9xVar instanceof d9x.c) && z2 && z) {
                return aVar;
            }
            return null;
        }

        @Override // defpackage.jaj
        public final Object l(Boolean bool, d9x d9xVar, Boolean bool2, gax.a aVar, v1b<? super gax> v1bVar) {
            boolean zBooleanValue = bool.booleanValue();
            boolean zBooleanValue2 = bool2.booleanValue();
            o oVar = new o(5, v1bVar);
            oVar.a = zBooleanValue;
            oVar.b = d9xVar;
            oVar.c = zBooleanValue2;
            oVar.d = aVar;
            return oVar.invokeSuspend(Unit.a);
        }
    }

    @c0d(c = "com.sportygames.nightnday.presentation.NightNDayViewModel$pointerState$1", f = "NightNDayViewModel.kt", l = {}, m = "invokeSuspend", v = 1)
    public static final class p extends tje0 implements gaj<b9x, a7x, v1b<? super uax>, Object> {
        public /* synthetic */ b9x a;
        public /* synthetic */ a7x b;

        public p(v1b<? super p> v1bVar) {
            super(3, v1bVar);
        }

        @Override // defpackage.gaj
        public final Object invoke(b9x b9xVar, a7x a7xVar, v1b<? super uax> v1bVar) {
            p pVar = gux.this.new p(v1bVar);
            pVar.a = b9xVar;
            pVar.b = a7xVar;
            return pVar.invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            float f;
            b9x b9xVar = this.a;
            a7x a7xVar = this.b;
            y5b y5bVar = y5b.a;
            uj50.b(obj);
            b9xVar.getClass();
            a7xVar.getClass();
            if (!(b9xVar instanceof b9x.g)) {
                return (b9xVar.equals(b9x.c.a) || b9xVar.equals(b9x.b.a) || (b9xVar instanceof b9x.d)) ? new uax.a(0.0f, false) : uax.b.a;
            }
            fbx fbxVar = a7xVar.b;
            float f2 = a7xVar.h;
            int iOrdinal = fbxVar.ordinal();
            if (iOrdinal == 0) {
                f = (f2 * 180.0f * 0.9f) + 9.0f + 720.0f + 180.0f;
            } else if (iOrdinal == 1) {
                f = (f2 * 180.0f * 0.9f) + 9.0f + 720.0f;
            } else {
                if (iOrdinal != 2) {
                    uhc.a();
                    return null;
                }
                f = (((int) (f2 * 10.0f)) % 2 != 0 ? 180.0f : 0.0f) + 720.0f;
            }
            return new uax.a(f, true);
        }
    }

    @c0d(c = "com.sportygames.nightnday.presentation.NightNDayViewModel$showExitDialog$1", f = "NightNDayViewModel.kt", l = {562}, m = "invokeSuspend", v = 1)
    public static final class q extends tje0 implements Function2<iwg, v1b<? super Unit>, Object> {
        public int a;
        public /* synthetic */ Object b;
        public final /* synthetic */ String d;
        public final /* synthetic */ boolean e;
        public final /* synthetic */ boolean f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public q(String str, boolean z, boolean z2, v1b<? super q> v1bVar) {
            super(2, v1bVar);
            this.d = str;
            this.e = z;
            this.f = z2;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            q qVar = gux.this.new q(this.d, this.e, this.f, v1bVar);
            qVar.b = obj;
            return qVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(iwg iwgVar, v1b<? super Unit> v1bVar) {
            return ((q) create(iwgVar, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            iwg iwgVar = (iwg) this.b;
            y5b y5bVar = y5b.a;
            int i = this.a;
            if (i == 0) {
                uj50.b(obj);
                wwd0 wwd0Var = gux.this.I;
                v8x.f fVar = new v8x.f(this.d, iwgVar, this.e, this.f);
                this.b = null;
                this.a = 1;
                wwd0Var.getClass();
                wwd0Var.k(null, fVar);
                if (Unit.a == y5bVar) {
                    return y5bVar;
                }
            } else {
                if (i != 1) {
                    ib5.a("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                uj50.b(obj);
            }
            return Unit.a;
        }
    }

    @c0d(c = "com.sportygames.nightnday.presentation.NightNDayViewModel$showWinningConfetti$1", f = "NightNDayViewModel.kt", l = {}, m = "invokeSuspend", v = 1)
    public static final class r extends tje0 implements gaj<a7x, b9x, v1b<? super Boolean>, Object> {
        public /* synthetic */ a7x a;
        public /* synthetic */ b9x b;

        @Override // defpackage.gaj
        public final Object invoke(a7x a7xVar, b9x b9xVar, v1b<? super Boolean> v1bVar) {
            r rVar = new r(3, v1bVar);
            rVar.a = a7xVar;
            rVar.b = b9xVar;
            return rVar.invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            a7x a7xVar = this.a;
            b9x b9xVar = this.b;
            y5b y5bVar = y5b.a;
            uj50.b(obj);
            return Boolean.valueOf(((b9xVar instanceof b9x.f) || Intrinsics.g(b9xVar, b9x.e.a)) ? a7xVar.j : false);
        }
    }

    @c0d(c = "com.sportygames.nightnday.presentation.NightNDayViewModel$sidePanelState$1", f = "NightNDayViewModel.kt", l = {}, m = "invokeSuspend", v = 1)
    public static final class s extends tje0 implements gaj<com.sportygames.newcms.b, d9x.c, v1b<? super cbx>, Object> {
        public /* synthetic */ com.sportygames.newcms.b a;
        public /* synthetic */ d9x.c b;

        @Override // defpackage.gaj
        public final Object invoke(com.sportygames.newcms.b bVar, d9x.c cVar, v1b<? super cbx> v1bVar) {
            s sVar = new s(3, v1bVar);
            sVar.a = bVar;
            sVar.b = cVar;
            return sVar.invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            com.sportygames.newcms.b bVar = this.a;
            d9x.c cVar = this.b;
            y5b y5bVar = y5b.a;
            uj50.b(obj);
            return new cbx(new me90.a(bVar.b(shj.v0.g, ""), cVar.g));
        }
    }

    public static final class t implements lyh<gax> {
        public final /* synthetic */ v340 a;
        public final /* synthetic */ gux b;

        public static final class a<T> implements myh {
            public final /* synthetic */ myh a;
            public final /* synthetic */ gux b;

            /* JADX INFO: renamed from: gux$t$a$a, reason: collision with other inner class name */
            @c0d(c = "com.sportygames.nightnday.presentation.NightNDayViewModel$special$$inlined$filter$1$2", f = "NightNDayViewModel.kt", l = {50}, m = "emit", v = 1)
            public static final class C0611a extends x1b {
                public /* synthetic */ Object a;
                public int b;

                public C0611a(v1b v1bVar) {
                    super(v1bVar);
                }

                @Override // defpackage.pz1
                public final Object invokeSuspend(Object obj) {
                    this.a = obj;
                    this.b |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(myh myhVar, gux guxVar) {
                this.a = myhVar;
                this.b = guxVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // defpackage.myh
            public final Object emit(Object obj, v1b v1bVar) {
                C0611a c0611a;
                if (v1bVar instanceof C0611a) {
                    c0611a = (C0611a) v1bVar;
                    int i = c0611a.b;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        c0611a.b = i - Integer.MIN_VALUE;
                    } else {
                        c0611a = new C0611a(v1bVar);
                    }
                } else {
                    c0611a = new C0611a(v1bVar);
                }
                Object obj2 = c0611a.a;
                y5b y5bVar = y5b.a;
                int i2 = c0611a.b;
                if (i2 == 0) {
                    uj50.b(obj2);
                    if (((gax) obj) instanceof gax.a) {
                        gux guxVar = this.b;
                        if (!((Boolean) guxVar.z.a.getValue()).booleanValue() && !guxVar.w) {
                            c0611a.b = 1;
                            if (this.a.emit(obj, c0611a) == y5bVar) {
                                return y5bVar;
                            }
                        }
                    }
                } else {
                    if (i2 != 1) {
                        ib5.a("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    uj50.b(obj2);
                }
                return Unit.a;
            }
        }

        public t(v340 v340Var, gux guxVar) {
            this.a = v340Var;
            this.b = guxVar;
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        @Override // defpackage.lyh
        public final Object collect(myh<? super gax> myhVar, v1b v1bVar) {
            Object objCollect = this.a.a.collect(new a(myhVar, this.b), (v1b<? super Unit>) v1bVar);
            return objCollect == y5b.a ? objCollect : Unit.a;
        }
    }

    public static final class u implements lyh<a7x> {
        public final /* synthetic */ wwd0 a;

        public static final class a<T> implements myh {
            public final /* synthetic */ myh a;

            /* JADX INFO: renamed from: gux$u$a$a, reason: collision with other inner class name */
            @c0d(c = "com.sportygames.nightnday.presentation.NightNDayViewModel$special$$inlined$map$1$2", f = "NightNDayViewModel.kt", l = {50}, m = "emit", v = 1)
            public static final class C0612a extends x1b {
                public /* synthetic */ Object a;
                public int b;

                public C0612a(v1b v1bVar) {
                    super(v1bVar);
                }

                @Override // defpackage.pz1
                public final Object invokeSuspend(Object obj) {
                    this.a = obj;
                    this.b |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(myh myhVar) {
                this.a = myhVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // defpackage.myh
            public final Object emit(Object obj, v1b v1bVar) {
                C0612a c0612a;
                if (v1bVar instanceof C0612a) {
                    c0612a = (C0612a) v1bVar;
                    int i = c0612a.b;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        c0612a.b = i - Integer.MIN_VALUE;
                    } else {
                        c0612a = new C0612a(v1bVar);
                    }
                } else {
                    c0612a = new C0612a(v1bVar);
                }
                Object obj2 = c0612a.a;
                y5b y5bVar = y5b.a;
                int i2 = c0612a.b;
                if (i2 == 0) {
                    uj50.b(obj2);
                    mk50 mk50Var = (mk50) obj;
                    a7x a7xVar = mk50Var instanceof mk50.c ? (a7x) ((mk50.c) mk50Var).a : null;
                    c0612a.b = 1;
                    if (this.a.emit(a7xVar, c0612a) == y5bVar) {
                        return y5bVar;
                    }
                } else {
                    if (i2 != 1) {
                        ib5.a("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    uj50.b(obj2);
                }
                return Unit.a;
            }
        }

        public u(wwd0 wwd0Var) {
            this.a = wwd0Var;
        }

        @Override // defpackage.lyh
        public final Object collect(myh<? super a7x> myhVar, v1b v1bVar) throws Throwable {
            this.a.collect(new a(myhVar), v1bVar);
            return y5b.a;
        }
    }

    public static final class v implements lyh<d9x.c> {
        public final /* synthetic */ wwd0 a;

        public static final class a<T> implements myh {
            public final /* synthetic */ myh a;

            /* JADX INFO: renamed from: gux$v$a$a, reason: collision with other inner class name */
            @c0d(c = "com.sportygames.nightnday.presentation.NightNDayViewModel$special$$inlined$map$2$2", f = "NightNDayViewModel.kt", l = {50}, m = "emit", v = 1)
            public static final class C0613a extends x1b {
                public /* synthetic */ Object a;
                public int b;

                public C0613a(v1b v1bVar) {
                    super(v1bVar);
                }

                @Override // defpackage.pz1
                public final Object invokeSuspend(Object obj) {
                    this.a = obj;
                    this.b |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(myh myhVar) {
                this.a = myhVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // defpackage.myh
            public final Object emit(Object obj, v1b v1bVar) {
                C0613a c0613a;
                if (v1bVar instanceof C0613a) {
                    c0613a = (C0613a) v1bVar;
                    int i = c0613a.b;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        c0613a.b = i - Integer.MIN_VALUE;
                    } else {
                        c0613a = new C0613a(v1bVar);
                    }
                } else {
                    c0613a = new C0613a(v1bVar);
                }
                Object obj2 = c0613a.a;
                y5b y5bVar = y5b.a;
                int i2 = c0613a.b;
                if (i2 == 0) {
                    uj50.b(obj2);
                    d9x d9xVar = (d9x) obj;
                    d9x.c cVar = d9xVar instanceof d9x.c ? (d9x.c) d9xVar : null;
                    c0613a.b = 1;
                    if (this.a.emit(cVar, c0613a) == y5bVar) {
                        return y5bVar;
                    }
                } else {
                    if (i2 != 1) {
                        ib5.a("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    uj50.b(obj2);
                }
                return Unit.a;
            }
        }

        public v(wwd0 wwd0Var) {
            this.a = wwd0Var;
        }

        @Override // defpackage.lyh
        public final Object collect(myh<? super d9x.c> myhVar, v1b v1bVar) throws Throwable {
            this.a.collect(new a(myhVar), v1bVar);
            return y5b.a;
        }
    }

    public static final class w implements lyh<com.sportygames.newcms.b> {
        public final /* synthetic */ v340 a;

        public static final class a<T> implements myh {
            public final /* synthetic */ myh a;

            /* JADX INFO: renamed from: gux$w$a$a, reason: collision with other inner class name */
            @c0d(c = "com.sportygames.nightnday.presentation.NightNDayViewModel$special$$inlined$map$3$2", f = "NightNDayViewModel.kt", l = {50}, m = "emit", v = 1)
            public static final class C0614a extends x1b {
                public /* synthetic */ Object a;
                public int b;

                public C0614a(v1b v1bVar) {
                    super(v1bVar);
                }

                @Override // defpackage.pz1
                public final Object invokeSuspend(Object obj) {
                    this.a = obj;
                    this.b |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(myh myhVar) {
                this.a = myhVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // defpackage.myh
            public final Object emit(Object obj, v1b v1bVar) {
                C0614a c0614a;
                if (v1bVar instanceof C0614a) {
                    c0614a = (C0614a) v1bVar;
                    int i = c0614a.b;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        c0614a.b = i - Integer.MIN_VALUE;
                    } else {
                        c0614a = new C0614a(v1bVar);
                    }
                } else {
                    c0614a = new C0614a(v1bVar);
                }
                Object obj2 = c0614a.a;
                y5b y5bVar = y5b.a;
                int i2 = c0614a.b;
                if (i2 == 0) {
                    uj50.b(obj2);
                    com.sportygames.newcms.b bVar = ((d9x.c) obj).a;
                    c0614a.b = 1;
                    if (this.a.emit(bVar, c0614a) == y5bVar) {
                        return y5bVar;
                    }
                } else {
                    if (i2 != 1) {
                        ib5.a("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    uj50.b(obj2);
                }
                return Unit.a;
            }
        }

        public w(v340 v340Var) {
            this.a = v340Var;
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        @Override // defpackage.lyh
        public final Object collect(myh<? super com.sportygames.newcms.b> myhVar, v1b v1bVar) {
            Object objCollect = this.a.a.collect(new a(myhVar), (v1b<? super Unit>) v1bVar);
            return objCollect == y5b.a ? objCollect : Unit.a;
        }
    }

    public static final class x implements lyh<z6x> {
        public final /* synthetic */ wwd0 a;
        public final /* synthetic */ gux b;

        public static final class a<T> implements myh {
            public final /* synthetic */ myh a;
            public final /* synthetic */ gux b;

            /* JADX INFO: renamed from: gux$x$a$a, reason: collision with other inner class name */
            @c0d(c = "com.sportygames.nightnday.presentation.NightNDayViewModel$special$$inlined$map$4$2", f = "NightNDayViewModel.kt", l = {50}, m = "emit", v = 1)
            public static final class C0615a extends x1b {
                public /* synthetic */ Object a;
                public int b;

                public C0615a(v1b v1bVar) {
                    super(v1bVar);
                }

                @Override // defpackage.pz1
                public final Object invokeSuspend(Object obj) {
                    this.a = obj;
                    this.b |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(myh myhVar, gux guxVar) {
                this.a = myhVar;
                this.b = guxVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference fix 'apply assigned field type' failed
            java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
            	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
            	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
            	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
             */
            @Override // defpackage.myh
            public final Object emit(Object obj, v1b v1bVar) {
                C0615a c0615a;
                Object obj2;
                if (v1bVar instanceof C0615a) {
                    c0615a = (C0615a) v1bVar;
                    int i = c0615a.b;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        c0615a.b = i - Integer.MIN_VALUE;
                    } else {
                        c0615a = new C0615a(v1bVar);
                    }
                } else {
                    c0615a = new C0615a(v1bVar);
                }
                Object obj3 = c0615a.a;
                y5b y5bVar = y5b.a;
                int i2 = c0615a.b;
                if (i2 == 0) {
                    uj50.b(obj3);
                    b9x b9xVar = (b9x) obj;
                    if (Intrinsics.g(b9xVar, b9x.c.a)) {
                        obj2 = z6x.a.a;
                    } else if (Intrinsics.g(b9xVar, b9x.b.a) || (b9xVar instanceof b9x.d) || Intrinsics.g(b9xVar, b9x.h.a) || (b9xVar instanceof b9x.f) || (b9xVar instanceof b9x.g) || Intrinsics.g(b9xVar, b9x.a.a)) {
                        obj2 = z6x.b.a;
                    } else {
                        if (!Intrinsics.g(b9xVar, b9x.e.a)) {
                            uhc.a();
                            return null;
                        }
                        y6x y6xVar = (y6x) this.b.J.getValue();
                        if (y6xVar instanceof y6x.a) {
                            obj2 = z6x.d.a;
                        } else {
                            if (!(y6xVar instanceof y6x.b)) {
                                uhc.a();
                                return null;
                            }
                            obj2 = z6x.c.a;
                        }
                    }
                    c0615a.b = 1;
                    if (this.a.emit(obj2, c0615a) == y5bVar) {
                        return y5bVar;
                    }
                } else {
                    if (i2 != 1) {
                        ib5.a("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    uj50.b(obj3);
                }
                return Unit.a;
            }
        }

        public x(wwd0 wwd0Var, gux guxVar) {
            this.a = wwd0Var;
            this.b = guxVar;
        }

        @Override // defpackage.lyh
        public final Object collect(myh<? super z6x> myhVar, v1b v1bVar) throws Throwable {
            this.a.collect(new a(myhVar, this.b), v1bVar);
            return y5b.a;
        }
    }

    @c0d(c = "com.sportygames.nightnday.presentation.NightNDayViewModel$spineData$1", f = "NightNDayViewModel.kt", l = {}, m = "invokeSuspend", v = 1)
    public static final class y extends tje0 implements gaj<b9x, a7x, v1b<? super dbx>, Object> {
        public /* synthetic */ b9x a;
        public /* synthetic */ a7x b;

        @Override // defpackage.gaj
        public final Object invoke(b9x b9xVar, a7x a7xVar, v1b<? super dbx> v1bVar) {
            y yVar = new y(3, v1bVar);
            yVar.a = b9xVar;
            yVar.b = a7xVar;
            return yVar.invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            b9x b9xVar = this.a;
            a7x a7xVar = this.b;
            y5b y5bVar = y5b.a;
            uj50.b(obj);
            return ((b9xVar instanceof b9x.f) || Intrinsics.g(b9xVar, b9x.e.a)) ? new dbx.a(a7xVar.b, a7xVar.j) : dbx.b.a;
        }
    }

    @c0d(c = "com.sportygames.nightnday.presentation.NightNDayViewModel$uiState$1", f = "NightNDayViewModel.kt", l = {}, m = "invokeSuspend", v = 1)
    public static final class z extends tje0 implements jaj<gax, x6x, v8x, Boolean, v1b<? super ebx>, Object> {
        public /* synthetic */ gax a;
        public /* synthetic */ x6x b;
        public /* synthetic */ v8x c;
        public /* synthetic */ boolean d;

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            gax gaxVar = this.a;
            x6x x6xVar = this.b;
            v8x v8xVar = this.c;
            boolean z = this.d;
            y5b y5bVar = y5b.a;
            uj50.b(obj);
            return new ebx(gaxVar, x6xVar, v8xVar, z);
        }

        @Override // defpackage.jaj
        public final Object l(gax gaxVar, x6x x6xVar, v8x v8xVar, Boolean bool, v1b<? super ebx> v1bVar) {
            boolean zBooleanValue = bool.booleanValue();
            z zVar = new z(5, v1bVar);
            zVar.a = gaxVar;
            zVar.b = x6xVar;
            zVar.c = v8xVar;
            zVar.d = zBooleanValue;
            return zVar.invokeSuspend(Unit.a);
        }
    }

    public gux(k5b k5bVar, e9x e9xVar, s8x s8xVar, hbx hbxVar, vax vaxVar, en20 en20Var, String str) {
        k5bVar.getClass();
        e9xVar.getClass();
        s8xVar.getClass();
        hbxVar.getClass();
        vaxVar.getClass();
        en20Var.getClass();
        this.a = k5bVar;
        this.b = e9xVar;
        this.c = s8xVar;
        this.d = hbxVar;
        this.e = vaxVar;
        this.f = en20Var;
        this.i = str;
        hn20 booleanByFlow = en20Var.getBooleanByFlow("key-NND-music", true);
        Boolean bool = Boolean.TRUE;
        v340 v340VarF1 = F1(booleanByFlow, bool);
        this.y = F1(en20Var.getBooleanByFlow("key-NND-sound", true), bool);
        hn20 booleanByFlow2 = en20Var.getBooleanByFlow("key-NND-one-tap-bet", false);
        Boolean bool2 = Boolean.FALSE;
        this.z = F1(booleanByFlow2, bool2);
        wwd0 wwd0VarA = xwd0.a(bool2);
        this.A = wwd0VarA;
        wwd0 wwd0VarA2 = xwd0.a(b9x.c.a);
        this.B = wwd0VarA2;
        wwd0 wwd0VarA3 = xwd0.a(fbx.d);
        this.C = wwd0VarA3;
        wwd0 wwd0VarA4 = xwd0.a(mk50.b.a);
        this.D = wwd0VarA4;
        v340 v340VarF2 = F1(new f1i(new u(wwd0VarA4)), new a7x(0));
        this.E = v340VarF2;
        wwd0 wwd0VarA5 = xwd0.a(new d9x.b(0.0f));
        this.F = wwd0VarA5;
        v340 v340VarF3 = F1(new f1i(new v(wwd0VarA5)), new d9x.c(0));
        this.G = v340VarF3;
        wwd0 wwd0VarA6 = xwd0.a(new gbx(0));
        this.H = wwd0VarA6;
        wwd0 wwd0VarA7 = xwd0.a(v8x.d.a);
        this.I = wwd0VarA7;
        v340 v340VarF4 = F1(new dv1(new h1i(new bv1(0), wwd0VarA6, new fv1(3, null)), this), new jv1(0));
        BigDecimal bigDecimal = BigDecimal.ZERO;
        bigDecimal.getClass();
        wwd0 wwd0VarA8 = xwd0.a(new y6x.a(bigDecimal));
        this.J = wwd0VarA8;
        v340 v340VarF5 = F1(r1i.b(v340VarF2, wwd0VarA2, wwd0VarA8, wwd0VarA3, new e(null)), r8x.b.a);
        v340 v340VarF6 = F1(r1i.a(wwd0VarA2, F1(r1i.a(v340VarF3, wwd0VarA8, wwd0VarA6, new f(4, null)), new s03()), F1(r1i.a(v340VarF3, wwd0VarA8, wwd0VarA6, new g(4, null)), new bm7()), new h(4, null)), new u8x.a(0));
        v340 v340VarF7 = F1(new w(v340VarF3), new com.sportygames.newcms.b(0));
        this.K = v340VarF7;
        this.L = F1(new n1i(v340VarF7, v340VarF3, new s(3, null)), new cbx(new me90.a(0)));
        wwd0 wwd0VarA9 = xwd0.a(bool2);
        this.M = wwd0VarA9;
        v340 v340VarF8 = F1(new n1i(wwd0VarA2, v340VarF2, new y(3, null)), dbx.b.a);
        v340 v340VarF9 = F1(new n1i(wwd0VarA2, v340VarF2, new p(null)), new uax.a(0));
        v340 v340VarF10 = F1(new n1i(wwd0VarA5, v340VarF8, new d(3, null)), x6x.b.a);
        v340 v340VarF11 = F1(new f1i(r1i.b(wwd0VarA, wwd0VarA5, wwd0VarA9, F1(r1i.c(new n1i(v340VarF5, F1(new x(wwd0VarA2, this), z6x.a.a), new m(3, null)), v340VarF9, v340VarF6, v340VarF4, v340VarF1, new n(null)), new gax.a(0)), new o(5, null))), new gax.b(0));
        this.Q = F1(r1i.b(v340VarF11, v340VarF10, wwd0VarA7, F1(new n1i(v340VarF2, wwd0VarA2, new r(3, null)), bool2), new z(5, null)), new ebx(0));
        this.R = new ju90<>();
        kzh.d(new g1i(new t(v340VarF11, this), new a(null)), o8i0.d(this));
        kzh.d(new g1i(v340VarF3, new b(null)), o8i0.d(this));
        ej5.c(o8i0.d(this), null, null, new c(null), 3);
    }

    public static BigDecimal E1(double d2) {
        BigDecimal scale = new BigDecimal(d2).setScale(2, RoundingMode.DOWN);
        scale.getClass();
        return scale;
    }

    public final boolean A1(fbx fbxVar, boolean z2) {
        CMSRes cMSRes;
        wwd0 wwd0Var = this.I;
        if (!z2 || ((Boolean) this.z.a.getValue()).booleanValue()) {
            wwd0Var.setValue(v8x.d.a);
            return false;
        }
        shj shjVar = shj.v0;
        B1(shjVar.e0);
        int iOrdinal = fbxVar.ordinal();
        if (iOrdinal == 0) {
            cMSRes = shjVar.i0;
        } else {
            if (iOrdinal != 1 && iOrdinal != 2) {
                uhc.a();
                return false;
            }
            cMSRes = shjVar.j0;
        }
        String str = ((gbx) this.H.getValue()).b;
        String str2 = new DecimalFormat("#,##0.00").format(((y6x) this.J.getValue()).d().setScale(2, RoundingMode.DOWN));
        v340 v340Var = this.K;
        com.sportygames.newcms.b bVar = (com.sportygames.newcms.b) v340Var.a.getValue();
        str2.getClass();
        v8x.a aVar = new v8x.a(bVar.a(cMSRes, str, str2), ((com.sportygames.newcms.b) v340Var.a.getValue()).b(shjVar.o0, ""), ((com.sportygames.newcms.b) v340Var.a.getValue()).b(shjVar.p0, ""), z8x.e.a, new z8x.b(fbxVar, false));
        wwd0Var.getClass();
        wwd0Var.k(null, aVar);
        return true;
    }

    public final void B1(CMSRes cMSRes) {
        if (((Boolean) this.y.a.getValue()).booleanValue()) {
            ((com.sportygames.newcms.b) this.K.a.getValue()).c(cMSRes);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object C1(ojd ojdVar, x1b x1bVar) {
        lux luxVar;
        if (x1bVar instanceof lux) {
            luxVar = (lux) x1bVar;
            int i2 = luxVar.d;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                luxVar.d = i2 - Integer.MIN_VALUE;
            } else {
                luxVar = new lux(this, x1bVar);
            }
        } else {
            luxVar = new lux(this, x1bVar);
        }
        Object obj = luxVar.b;
        y5b y5bVar = y5b.a;
        int i3 = luxVar.d;
        try {
            if (i3 == 0) {
                uj50.b(obj);
                luxVar.a = ojdVar;
                luxVar.d = 1;
                Object objAwait = ojdVar.await(luxVar);
                return objAwait == y5bVar ? y5bVar : objAwait;
            }
            if (i3 != 1) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ojd ojdVar2 = luxVar.a;
            uj50.b(obj);
            return obj;
        } catch (Throwable unused) {
            ojdVar.cancel((CancellationException) null);
            return null;
        }
    }

    public final void D1(String str, boolean z2, boolean z3) {
        kzh.d(new g1i(this.e.a(this.i), new q(str, z2, z3, null)), o8i0.d(this));
    }

    public final v340 F1(lyh lyhVar, Object obj) {
        return e1i.e(ozh.c(lyhVar, this.a), o8i0.d(this), q490.a.a, obj);
    }

    @Override // defpackage.j8i0
    public final void onCleared() {
        super.onCleared();
        ((com.sportygames.newcms.b) this.K.a.getValue()).d();
    }

    public final void x1() {
        if (this.v) {
            return;
        }
        this.v = true;
        kzh.d(new xzh(new g1i(this.b.a(), new iux(this, null)), new jux(this, null)), o8i0.d(this));
        kzh.d(this.e.a(this.i), o8i0.d(this));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0060, code lost:
    
        if (kotlin.Unit.a == r1) goto L25;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object y1(java.lang.Throwable r7, defpackage.x1b r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof defpackage.kux
            if (r0 == 0) goto L13
            r0 = r8
            kux r0 = (defpackage.kux) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            kux r0 = new kux
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.a
            y5b r1 = defpackage.y5b.a
            int r2 = r0.c
            r3 = 0
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L35
            if (r2 == r5) goto L31
            if (r2 != r4) goto L2b
            defpackage.uj50.b(r8)
            goto L63
        L2b:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.ib5.a(r6)
            return r3
        L31:
            defpackage.uj50.b(r8)
            goto L4d
        L35:
            defpackage.uj50.b(r8)
            v340 r8 = r6.K
            uwd0<T> r8 = r8.a
            java.lang.Object r8 = r8.getValue()
            com.sportygames.newcms.b r8 = (com.sportygames.newcms.b) r8
            r0.c = r5
            wwd0 r2 = r6.B
            java.lang.Object r8 = defpackage.x8x.i1(r6, r7, r8, r2, r0)
            if (r8 != r1) goto L4d
            goto L62
        L4d:
            v8x r8 = (defpackage.v8x) r8
            if (r8 != 0) goto L54
            kotlin.Unit r6 = kotlin.Unit.a
            return r6
        L54:
            r0.c = r4
            wwd0 r6 = r6.I
            r6.getClass()
            r6.k(r3, r8)
            kotlin.Unit r6 = kotlin.Unit.a
            if (r6 != r1) goto L63
        L62:
            return r1
        L63:
            kotlin.Unit r6 = kotlin.Unit.a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gux.y1(java.lang.Throwable, x1b):java.lang.Object");
    }

    public final void z1(z8x z8xVar) {
        Object value;
        y6x aVar;
        z8xVar.getClass();
        if (z8xVar.equals(z8x.p.a)) {
            Boolean bool = Boolean.TRUE;
            wwd0 wwd0Var = this.M;
            wwd0Var.getClass();
            wwd0Var.k(null, bool);
            return;
        }
        if (z8xVar instanceof z8x.b) {
            z8x.b bVar = (z8x.b) z8xVar;
            if (A1(bVar.a, bVar.b)) {
                return;
            }
            ej5.c(o8i0.d(this), null, null, new i(z8xVar, null), 3);
            return;
        }
        if (z8xVar.equals(z8x.h.a)) {
            B1(shj.v0.V);
            ej5.c(o8i0.d(this), null, null, new j(null), 3);
            return;
        }
        if (z8xVar instanceof z8x.m) {
            if (A1((fbx) this.C.getValue(), ((z8x.m) z8xVar).a)) {
                return;
            }
            ej5.c(o8i0.d(this), null, null, new k(null), 3);
            return;
        }
        if (z8xVar.equals(z8x.n.a)) {
            dm8 dm8Var = this.N;
            if (dm8Var != null) {
                dm8Var.R(Unit.a);
                return;
            }
            return;
        }
        if (z8xVar.equals(z8x.o.a)) {
            dm8 dm8Var2 = this.O;
            if (dm8Var2 != null) {
                dm8Var2.R(Unit.a);
                return;
            }
            return;
        }
        if (z8xVar.equals(z8x.l.a)) {
            dm8 dm8Var3 = this.P;
            if (dm8Var3 != null) {
                dm8Var3.R(Unit.a);
                return;
            }
            return;
        }
        boolean z2 = z8xVar instanceof z8x.r;
        wwd0 wwd0Var2 = this.J;
        if (z2) {
            B1(shj.v0.c0);
            y6x.a aVar2 = new y6x.a(((z8x.r) z8xVar).a);
            wwd0Var2.getClass();
            wwd0Var2.k(null, aVar2);
            return;
        }
        if (z8xVar instanceof z8x.a) {
            B1(shj.v0.Z);
            do {
                value = wwd0Var2.getValue();
                aVar = (y6x) value;
                if (aVar instanceof y6x.a) {
                    BigDecimal bigDecimalAdd = ((y6x.a) aVar).a.add(((z8x.a) z8xVar).a);
                    bigDecimalAdd.getClass();
                    aVar = new y6x.a(bigDecimalAdd);
                } else if (!(aVar instanceof y6x.b)) {
                    uhc.a();
                    return;
                }
            } while (!wwd0Var2.g(value, aVar));
            return;
        }
        boolean zEquals = z8xVar.equals(z8x.j.a);
        v340 v340Var = this.G;
        wwd0 wwd0Var3 = this.I;
        if (zEquals) {
            v8x.b bVar2 = new v8x.b(((gbx) this.H.getValue()).c, ((d9x.c) v340Var.a.getValue()).c, ((d9x.c) v340Var.a.getValue()).b, ((d9x.c) v340Var.a.getValue()).c);
            wwd0Var3.getClass();
            wwd0Var3.k(null, bVar2);
            return;
        }
        if (z8xVar.equals(z8x.e.a)) {
            wwd0Var3.setValue(v8x.d.a);
            return;
        }
        if (z8xVar instanceof z8x.s) {
            z8x.s sVar = (z8x.s) z8xVar;
            y6x.b bVar3 = new y6x.b(sVar.a, E1(sVar.b));
            wwd0Var2.getClass();
            wwd0Var2.k(null, bVar3);
            wwd0Var3.setValue(v8x.d.a);
            return;
        }
        if (z8xVar.equals(z8x.c.a)) {
            y6x.a aVar3 = new y6x.a(E1(((d9x.c) v340Var.a.getValue()).d));
            wwd0Var2.getClass();
            wwd0Var2.k(null, aVar3);
            return;
        }
        if (z8xVar.equals(z8x.k.a)) {
            wwd0Var3.setValue(this.L.a.getValue());
            return;
        }
        if (z8xVar instanceof z8x.q) {
            wwd0Var3.setValue(((z8x.q) z8xVar).a);
            return;
        }
        if (z8xVar.equals(z8x.g.a)) {
            Object value2 = wwd0Var3.getValue();
            v8x.d dVar = v8x.d.a;
            if (Intrinsics.g(value2, dVar)) {
                z1(new z8x.d(true));
                return;
            } else {
                wwd0Var3.setValue(dVar);
                return;
            }
        }
        if (z8xVar instanceof z8x.d) {
            D1(null, ((z8x.d) z8xVar).a, false);
            return;
        }
        if (z8xVar.equals(z8x.f.a)) {
            this.v = false;
            this.w = false;
            x1();
            wwd0Var3.setValue(v8x.d.a);
            return;
        }
        if (z8xVar instanceof z8x.i) {
            ej5.c(o8i0.d(this), null, null, new l(z8xVar, null), 3);
        } else {
            uhc.a();
        }
    }
}
