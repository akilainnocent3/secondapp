package defpackage;

import com.google.protobuf.Reader;
import com.sportygames.common.business.CommonGameDetails;
import com.sportygames.newcms.CMSRes;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.List;
import java.util.Locale;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes7.dex */
public final class aof0 extends j8i0 implements dre0, xse0 {
    public final wwd0 A;
    public final v340 B;
    public final wwd0 C;
    public final wwd0 D;
    public final wwd0 E;
    public final wwd0 F;
    public final wwd0 G;
    public final wwd0 H;
    public final wwd0 I;
    public final v340 J;
    public final v340 K;
    public final wwd0 L;
    public final wwd0 M;
    public final wwd0 N;
    public final v340 O;
    public final v340 P;
    public final v340 Q;
    public dm8 R;
    public dm8 S;
    public final v340 T;
    public final v340 U;
    public final v340 V;
    public final ju90<cre0> W;
    public final t340 X;
    public final zve0 a;
    public final que0 b;
    public final k5b c;
    public final k5b d;
    public final en20 e;
    public final cwe0 f;
    public final String i;
    public final String v;
    public boolean w;
    public final wwd0 y;
    public final wwd0 z;

    @c0d(c = "com.sportygames.goldmine.TheGoldmineViewModel$2", f = "TheGoldmineViewModel.kt", l = {438}, m = "invokeSuspend", v = 1)
    public static final class a extends tje0 implements Function2<hzs, v1b<? super Unit>, Object> {
        public int a;

        public a(v1b<? super a> v1bVar) {
            super(2, v1bVar);
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            return aof0.this.new a(v1bVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(hzs hzsVar, v1b<? super Unit> v1bVar) {
            return ((a) create(hzsVar, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            aof0 aof0Var = aof0.this;
            v340 v340Var = aof0Var.B;
            y5b y5bVar = y5b.a;
            int i = this.a;
            if (i == 0) {
                uj50.b(obj);
                wwd0 wwd0Var = aof0Var.N;
                com.sportygames.newcms.b bVar = (com.sportygames.newcms.b) v340Var.a.getValue();
                vue0 vue0Var = vue0.X0;
                ove0.a aVar = new ove0.a(bVar.b(vue0Var.K, ""), ((com.sportygames.newcms.b) v340Var.a.getValue()).b(vue0Var.J, ""), ((com.sportygames.newcms.b) v340Var.a.getValue()).b(vue0Var.I, ""), new qve0.u(false), new qve0.u(true));
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

    @c0d(c = "com.sportygames.goldmine.TheGoldmineViewModel$loadedState$2", f = "TheGoldmineViewModel.kt", l = {}, m = "invokeSuspend", v = 1)
    public static final class a0 extends tje0 implements kaj<c0f0, nve0, dse0, jv1, Pair<? extends kwe0, ? extends lse0>, v1b<? super gxe0.a>, Object> {
        public /* synthetic */ c0f0 a;
        public /* synthetic */ nve0 b;
        public /* synthetic */ dse0 c;
        public /* synthetic */ jv1 d;
        public /* synthetic */ Pair e;

        public a0(v1b<? super a0> v1bVar) {
            super(6, v1bVar);
        }

        @Override // defpackage.kaj
        public final Object f(c0f0 c0f0Var, nve0 nve0Var, dse0 dse0Var, jv1 jv1Var, Pair<? extends kwe0, ? extends lse0> pair, v1b<? super gxe0.a> v1bVar) {
            a0 a0Var = new a0(v1bVar);
            a0Var.a = c0f0Var;
            a0Var.b = nve0Var;
            a0Var.c = dse0Var;
            a0Var.d = jv1Var;
            a0Var.e = pair;
            return a0Var.invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            c0f0 c0f0Var = this.a;
            nve0 nve0Var = this.b;
            dse0 dse0Var = this.c;
            jv1 jv1Var = this.d;
            Pair pair = this.e;
            y5b y5bVar = y5b.a;
            uj50.b(obj);
            return new gxe0.a(nve0Var, c0f0Var, (lse0) pair.b, dse0Var, jv1Var, (kwe0) pair.a);
        }
    }

    @c0d(c = "com.sportygames.goldmine.TheGoldmineViewModel$4", f = "TheGoldmineViewModel.kt", l = {}, m = "invokeSuspend", v = 1)
    public static final class b extends tje0 implements Function2<Boolean, v1b<? super Unit>, Object> {
        public b(v1b<? super b> v1bVar) {
            super(2, v1bVar);
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            return aof0.this.new b(v1bVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Boolean bool, v1b<? super Unit> v1bVar) {
            Boolean bool2 = bool;
            bool2.booleanValue();
            return ((b) create(bool2, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            y5b y5bVar = y5b.a;
            uj50.b(obj);
            aof0 aof0Var = aof0.this;
            wwd0 wwd0Var = aof0Var.E;
            ose0 ose0Var = (ose0) wwd0Var.getValue();
            if (!(ose0Var instanceof ose0.a)) {
                if (!(ose0Var instanceof ose0.b)) {
                    uhc.a();
                    return null;
                }
                dre0.Z(wwd0Var, (mse0) aof0Var.Q.a.getValue());
            }
            return Unit.a;
        }
    }

    @c0d(c = "com.sportygames.goldmine.TheGoldmineViewModel$loadingUIState$1", f = "TheGoldmineViewModel.kt", l = {}, m = "invokeSuspend", v = 1)
    public static final class b0 extends tje0 implements gaj<hzs, gxe0, v1b<? super gxe0>, Object> {
        public /* synthetic */ hzs a;
        public /* synthetic */ gxe0 b;

        @Override // defpackage.gaj
        public final Object invoke(hzs hzsVar, gxe0 gxe0Var, v1b<? super gxe0> v1bVar) {
            b0 b0Var = new b0(3, v1bVar);
            b0Var.a = hzsVar;
            b0Var.b = gxe0Var;
            return b0Var.invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            hzs hzsVar = this.a;
            gxe0 gxe0Var = this.b;
            y5b y5bVar = y5b.a;
            uj50.b(obj);
            if (hzsVar instanceof hzs.b) {
                return new gxe0.b(((hzs.b) hzsVar).a);
            }
            if (hzsVar instanceof hzs.a) {
                return gxe0Var;
            }
            uhc.a();
            return null;
        }
    }

    @c0d(c = "com.sportygames.goldmine.TheGoldmineViewModel$5", f = "TheGoldmineViewModel.kt", l = {457, 459, 461}, m = "invokeSuspend", v = 1)
    public static final class c extends tje0 implements Function2<q4l.c, v1b<? super Unit>, Object> {
        public int a;
        public /* synthetic */ Object b;

        public c(v1b<? super c> v1bVar) {
            super(2, v1bVar);
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            c cVar = aof0.this.new c(v1bVar);
            cVar.b = obj;
            return cVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(q4l.c cVar, v1b<? super Unit> v1bVar) {
            return ((c) create(cVar, v1bVar)).invokeSuspend(Unit.a);
        }

        /* JADX WARN: Code duplicated, block: B:20:0x0056  */
        /* JADX WARN: Code restructure failed: missing block: B:21:0x0079, code lost:
        
            if (kotlin.Unit.a == r1) goto L22;
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
                q4l$c r0 = (q4l.c) r0
                y5b r1 = defpackage.y5b.a
                int r2 = r8.a
                r3 = 3
                r4 = 2
                r5 = 1
                aof0 r6 = defpackage.aof0.this
                r7 = 0
                if (r2 == 0) goto L28
                if (r2 == r5) goto L24
                if (r2 == r4) goto L20
                if (r2 != r3) goto L1a
                defpackage.uj50.b(r9)
                goto L7c
            L1a:
                java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
                defpackage.ib5.a(r8)
                return r7
            L20:
                defpackage.uj50.b(r9)
                goto L56
            L24:
                defpackage.uj50.b(r9)
                goto L3b
            L28:
                defpackage.uj50.b(r9)
                wwd0 r9 = r6.C
                p0f0 r2 = r0.f
                r8.b = r0
                r8.a = r5
                r9.setValue(r2)
                kotlin.Unit r9 = kotlin.Unit.a
                if (r9 != r1) goto L3b
                goto L7b
            L3b:
                uf00<xue0> r9 = r0.d
                java.lang.Object r9 = kotlin.collections.CollectionsKt.firstOrNull(r9)
                xue0 r9 = (defpackage.xue0) r9
                if (r9 == 0) goto L56
                wwd0 r2 = r6.D
                r8.b = r0
                r8.a = r4
                r2.getClass()
                r2.k(r7, r9)
                kotlin.Unit r9 = kotlin.Unit.a
                if (r9 != r1) goto L56
                goto L7b
            L56:
                wwd0 r9 = r6.F
                nse0 r0 = r0.c
                kse0 r0 = r0.b
                r8.b = r7
                r8.a = r3
                int r8 = r0.d
                java.lang.String r8 = java.lang.String.valueOf(r8)
                ijf0 r0 = new ijf0
                int r2 = r8.length()
                long r2 = defpackage.vlf0.a(r2, r2)
                r4 = 4
                r0.<init>(r8, r2, r4)
                r9.setValue(r0)
                kotlin.Unit r8 = kotlin.Unit.a
                if (r8 != r1) goto L7c
            L7b:
                return r1
            L7c:
                kotlin.Unit r8 = kotlin.Unit.a
                return r8
            */
            throw new UnsupportedOperationException("Method not decompiled: aof0.c.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @c0d(c = "com.sportygames.goldmine.TheGoldmineViewModel$onErrorEncountered$1", f = "TheGoldmineViewModel.kt", l = {630}, m = "invokeSuspend", v = 1)
    public static final class c0 extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ Throwable c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c0(Throwable th, v1b<? super c0> v1bVar) {
            super(2, v1bVar);
            this.c = th;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            return aof0.this.new c0(this.c, v1bVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
            return ((c0) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            ove0 fVar;
            ove0 fVar2;
            Unit unit;
            y5b y5bVar = y5b.a;
            int i = this.a;
            if (i == 0) {
                uj50.b(obj);
                this.a = 1;
                aof0 aof0Var = aof0.this;
                v340 v340Var = aof0Var.B;
                Throwable th = this.c;
                if (th instanceof rve0.b) {
                    aof0Var.z1(new qve0.h(((com.sportygames.newcms.b) v340Var.a.getValue()).b(vue0.X0.z, "Game temporarily unavailable. Contact support for assistance!"), true));
                    unit = Unit.a;
                } else {
                    wwd0 wwd0Var = aof0Var.N;
                    com.sportygames.newcms.b bVar = (com.sportygames.newcms.b) v340Var.a.getValue();
                    th.getClass();
                    bVar.getClass();
                    if ((th instanceof tom) && ((tom) th).a == 401) {
                        fVar2 = ove0.b.a;
                    } else {
                        if (th instanceof rve0.a) {
                            vue0 vue0Var = vue0.X0;
                            fVar = new ove0.f(bVar.b(vue0Var.W, "Error! Game is not available in your country."), bVar.b(vue0Var.Q, "Exit"), new qve0.h(null, false));
                        } else {
                            wjd0 wjd0Var = th instanceof wjd0 ? (wjd0) th : null;
                            if (wjd0Var == null) {
                                vue0 vue0Var2 = vue0.X0;
                                fVar = new ove0.f(bVar.b(vue0Var2.Y, "Something went wrong."), bVar.b(vue0Var2.Q, "Exit"), new qve0.h(null, false));
                            } else {
                                int i2 = wjd0Var.a;
                                if (i2 == 11100 || i2 == 19000) {
                                    vue0 vue0Var3 = vue0.X0;
                                    fVar = new ove0.f(bVar.b(vue0Var3.S, "Something went wrong! Please try again later."), bVar.b(vue0Var3.T, "OK"), qve0.g.a);
                                } else if (i2 == 19102) {
                                    fVar2 = ove0.d.a;
                                } else if (i2 == 19108) {
                                    vue0 vue0Var4 = vue0.X0;
                                    fVar = new ove0.f(bVar.b(vue0Var4.X, "Error! Gift not applicable for this bet. Please try a different one."), bVar.b(vue0Var4.T, "OK"), qve0.g.a);
                                } else if (i2 == 60003) {
                                    vue0 vue0Var5 = vue0.X0;
                                    fVar = new ove0.f(bVar.b(vue0Var5.Z, "Something went wrong, please refresh the page."), bVar.b(vue0Var5.Q, "Exit"), new qve0.h(null, false));
                                } else if (i2 != 60007) {
                                    String strB = ((wjd0) th).b;
                                    if (StringsKt.U(strB)) {
                                        strB = null;
                                    }
                                    if (strB == null) {
                                        strB = bVar.b(vue0.X0.Y, "Something went wrong.");
                                    }
                                    fVar2 = new ove0.f(strB, bVar.b(vue0.X0.Q, "Exit"), new qve0.h(null, false));
                                } else {
                                    vue0 vue0Var6 = vue0.X0;
                                    fVar = new ove0.f(bVar.b(vue0Var6.Y, "Something went wrong."), bVar.b(vue0Var6.Q, "Exit"), new qve0.h(null, false));
                                }
                            }
                        }
                        fVar2 = fVar;
                    }
                    wwd0Var.setValue(fVar2);
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

    @c0d(c = "com.sportygames.goldmine.TheGoldmineViewModel$6", f = "TheGoldmineViewModel.kt", l = {466, 469}, m = "invokeSuspend", v = 1)
    public static final class d extends tje0 implements Function2<mse0, v1b<? super Unit>, Object> {
        public int a;
        public /* synthetic */ Object b;

        public d(v1b<? super d> v1bVar) {
            super(2, v1bVar);
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            d dVar = aof0.this.new d(v1bVar);
            dVar.b = obj;
            return dVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(mse0 mse0Var, v1b<? super Unit> v1bVar) {
            return ((d) create(mse0Var, v1bVar)).invokeSuspend(Unit.a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x0060, code lost:
        
            if (r12.a.emit(r0, r11) == r1) goto L15;
         */
        @Override // defpackage.pz1
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r12) {
            /*
                r11 = this;
                java.lang.Object r0 = r11.b
                mse0 r0 = (defpackage.mse0) r0
                y5b r1 = defpackage.y5b.a
                int r2 = r11.a
                r3 = 2
                r4 = 1
                aof0 r5 = defpackage.aof0.this
                r6 = 0
                if (r2 == 0) goto L21
                if (r2 == r4) goto L1d
                if (r2 != r3) goto L17
                defpackage.uj50.b(r12)
                goto L63
            L17:
                java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
                defpackage.ib5.a(r11)
                return r6
            L1d:
                defpackage.uj50.b(r12)
                goto L52
            L21:
                defpackage.uj50.b(r12)
                double r7 = r0.c
                java.lang.String r12 = java.lang.String.valueOf(r7)
                java.lang.String r12 = defpackage.dre0.H(r12)
                wwd0 r0 = r5.E
                ose0$a r2 = new ose0$a
                ijf0 r7 = new ijf0
                int r8 = r12.length()
                long r8 = defpackage.vlf0.a(r8, r8)
                r10 = 4
                r7.<init>(r12, r8, r10)
                r2.<init>(r7)
                r11.b = r6
                r11.a = r4
                r0.getClass()
                r0.k(r6, r2)
                kotlin.Unit r12 = kotlin.Unit.a
                if (r12 != r1) goto L52
                goto L62
            L52:
                ju90<cre0> r12 = r5.W
                cre0$a r0 = cre0.a.a
                r11.b = r6
                r11.a = r3
                b390 r12 = r12.a
                java.lang.Object r11 = r12.emit(r0, r11)
                if (r11 != r1) goto L63
            L62:
                return r1
            L63:
                kotlin.Unit r11 = kotlin.Unit.a
                return r11
            */
            throw new UnsupportedOperationException("Method not decompiled: aof0.d.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @c0d(c = "com.sportygames.goldmine.TheGoldmineViewModel$selectedCaveEnable$1", f = "TheGoldmineViewModel.kt", l = {}, m = "invokeSuspend", v = 1)
    public static final class d0 extends tje0 implements gaj<xue0, p0f0, v1b<? super Boolean>, Object> {
        public /* synthetic */ xue0 a;
        public /* synthetic */ p0f0 b;

        @Override // defpackage.gaj
        public final Object invoke(xue0 xue0Var, p0f0 p0f0Var, v1b<? super Boolean> v1bVar) {
            d0 d0Var = new d0(3, v1bVar);
            d0Var.a = xue0Var;
            d0Var.b = p0f0Var;
            return d0Var.invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            xue0 xue0Var = this.a;
            p0f0 p0f0Var = this.b;
            y5b y5bVar = y5b.a;
            uj50.b(obj);
            return Boolean.valueOf(Intrinsics.g(p0f0Var.d.get(new Integer(xue0Var.b)), Boolean.TRUE));
        }
    }

    @c0d(c = "com.sportygames.goldmine.TheGoldmineViewModel$7", f = "TheGoldmineViewModel.kt", l = {482, 490, 492, 494, 504, 515, 518, 520, 522}, m = "invokeSuspend", v = 1)
    public static final class e extends tje0 implements Function2<wwe0, v1b<? super Unit>, Object> {
        public long a;
        public int b;
        public /* synthetic */ Object c;

        @c0d(c = "com.sportygames.goldmine.TheGoldmineViewModel$7$1", f = "TheGoldmineViewModel.kt", l = {516}, m = "invokeSuspend", v = 1)
        public static final class a extends tje0 implements Function2<v5b, v1b<? super Boolean>, Object> {
            public int a;
            public final /* synthetic */ aof0 b;

            /* JADX INFO: renamed from: aof0$e$a$a, reason: collision with other inner class name */
            @c0d(c = "com.sportygames.goldmine.TheGoldmineViewModel$7$1$1", f = "TheGoldmineViewModel.kt", l = {}, m = "invokeSuspend", v = 1)
            public static final class C0083a extends tje0 implements Function2<Boolean, v1b<? super Boolean>, Object> {
                public /* synthetic */ boolean a;

                @Override // defpackage.pz1
                public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
                    C0083a c0083a = new C0083a(2, v1bVar);
                    c0083a.a = ((Boolean) obj).booleanValue();
                    return c0083a;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Boolean bool, v1b<? super Boolean> v1bVar) {
                    Boolean bool2 = bool;
                    bool2.booleanValue();
                    return ((C0083a) create(bool2, v1bVar)).invokeSuspend(Unit.a);
                }

                @Override // defpackage.pz1
                public final Object invokeSuspend(Object obj) {
                    boolean z = this.a;
                    y5b y5bVar = y5b.a;
                    uj50.b(obj);
                    return Boolean.valueOf(!z);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(aof0 aof0Var, v1b<? super a> v1bVar) {
                super(2, v1bVar);
                this.b = aof0Var;
            }

            @Override // defpackage.pz1
            public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
                return new a(this.b, v1bVar);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(v5b v5bVar, v1b<? super Boolean> v1bVar) {
                return ((a) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
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
                v340 v340Var = this.b.T;
                C0083a c0083a = new C0083a(2, null);
                this.a = 1;
                Object objB = s0i.b(v340Var, c0083a, this);
                return objB == y5bVar ? y5bVar : objB;
            }
        }

        public e(v1b<? super e> v1bVar) {
            super(2, v1bVar);
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            e eVar = aof0.this.new e(v1bVar);
            eVar.c = obj;
            return eVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(wwe0 wwe0Var, v1b<? super Unit> v1bVar) {
            return ((e) create(wwe0Var, v1bVar)).invokeSuspend(Unit.a);
        }

        /* JADX WARN: Code duplicated, block: B:119:0x02ad  */
        /* JADX WARN: Code duplicated, block: B:124:0x02c9  */
        /* JADX WARN: Code duplicated, block: B:127:0x02d8  */
        /* JADX WARN: Code duplicated, block: B:35:0x00ce  */
        /* JADX WARN: Code duplicated, block: B:36:0x00d1  */
        /* JADX WARN: Code duplicated, block: B:39:0x00dd  */
        /* JADX WARN: Code duplicated, block: B:40:0x00df  */
        /* JADX WARN: Code duplicated, block: B:42:0x00e3  */
        /* JADX WARN: Code duplicated, block: B:45:0x0101  */
        /* JADX WARN: Code duplicated, block: B:47:0x0108  */
        /* JADX WARN: Code duplicated, block: B:50:0x0115  */
        /* JADX WARN: Code duplicated, block: B:51:0x011a  */
        /* JADX WARN: Code duplicated, block: B:56:0x0129  */
        /* JADX WARN: Code duplicated, block: B:58:0x016f  */
        /* JADX WARN: Code duplicated, block: B:75:0x01d3  */
        /* JADX WARN: Code duplicated, block: B:77:0x01ed A[DONT_INVERT] */
        /* JADX WARN: Code duplicated, block: B:78:0x01ef  */
        /* JADX WARN: Code duplicated, block: B:79:0x01f2  */
        /* JADX WARN: Code duplicated, block: B:81:0x01fa  */
        /* JADX WARN: Code restructure failed: missing block: B:103:0x0272, code lost:
        
            if (r0 == r9) goto L129;
         */
        /* JADX WARN: Code restructure failed: missing block: B:125:0x02d5, code lost:
        
            if (defpackage.xwe0.a(r2, r24) == r9) goto L129;
         */
        /* JADX WARN: Code restructure failed: missing block: B:128:0x02e7, code lost:
        
            if (kotlin.Unit.a == r9) goto L129;
         */
        /* JADX WARN: Code restructure failed: missing block: B:29:0x00b6, code lost:
        
            if (r0 == r9) goto L129;
         */
        /* JADX WARN: Code restructure failed: missing block: B:82:0x01fc, code lost:
        
            if (r0 == r9) goto L129;
         */
        @Override // defpackage.pz1
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r25) {
            /*
                Method dump skipped, instruction units count: 778
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: aof0.e.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public static final class e0 implements lyh<hzs> {
        public final /* synthetic */ wwd0 a;
        public final /* synthetic */ aof0 b;

        public static final class a<T> implements myh {
            public final /* synthetic */ myh a;
            public final /* synthetic */ aof0 b;

            /* JADX INFO: renamed from: aof0$e0$a$a, reason: collision with other inner class name */
            @c0d(c = "com.sportygames.goldmine.TheGoldmineViewModel$special$$inlined$filter$1$2", f = "TheGoldmineViewModel.kt", l = {50}, m = "emit", v = 1)
            public static final class C0084a extends x1b {
                public /* synthetic */ Object a;
                public int b;

                public C0084a(v1b v1bVar) {
                    super(v1bVar);
                }

                @Override // defpackage.pz1
                public final Object invokeSuspend(Object obj) {
                    this.a = obj;
                    this.b |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(myh myhVar, aof0 aof0Var) {
                this.a = myhVar;
                this.b = aof0Var;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // defpackage.myh
            public final Object emit(Object obj, v1b v1bVar) {
                C0084a c0084a;
                if (v1bVar instanceof C0084a) {
                    c0084a = (C0084a) v1bVar;
                    int i = c0084a.b;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        c0084a.b = i - Integer.MIN_VALUE;
                    } else {
                        c0084a = new C0084a(v1bVar);
                    }
                } else {
                    c0084a = new C0084a(v1bVar);
                }
                Object obj2 = c0084a.a;
                y5b y5bVar = y5b.a;
                int i2 = c0084a.b;
                if (i2 == 0) {
                    uj50.b(obj2);
                    if ((((hzs) obj) instanceof hzs.a) && !((Boolean) this.b.P.a.getValue()).booleanValue()) {
                        c0084a.b = 1;
                        if (this.a.emit(obj, c0084a) == y5bVar) {
                            return y5bVar;
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

        public e0(wwd0 wwd0Var, aof0 aof0Var) {
            this.a = wwd0Var;
            this.b = aof0Var;
        }

        @Override // defpackage.lyh
        public final Object collect(myh<? super hzs> myhVar, v1b v1bVar) throws Throwable {
            this.a.collect(new a(myhVar, this.b), v1bVar);
            return y5b.a;
        }
    }

    @c0d(c = "com.sportygames.goldmine.TheGoldmineViewModel$animationPanel$1", f = "TheGoldmineViewModel.kt", l = {}, m = "invokeSuspend", v = 1)
    public static final class f extends tje0 implements kaj<xue0, mze0, p0f0, Boolean, Boolean, v1b<? super dse0>, Object> {
        public /* synthetic */ xue0 a;
        public /* synthetic */ mze0 b;
        public /* synthetic */ p0f0 c;
        public /* synthetic */ boolean d;
        public /* synthetic */ boolean e;

        public f(v1b<? super f> v1bVar) {
            super(6, v1bVar);
        }

        @Override // defpackage.kaj
        public final Object f(xue0 xue0Var, mze0 mze0Var, p0f0 p0f0Var, Boolean bool, Boolean bool2, v1b<? super dse0> v1bVar) {
            boolean zBooleanValue = bool.booleanValue();
            boolean zBooleanValue2 = bool2.booleanValue();
            f fVar = aof0.this.new f(v1bVar);
            fVar.a = xue0Var;
            fVar.b = mze0Var;
            fVar.c = p0f0Var;
            fVar.d = zBooleanValue;
            fVar.e = zBooleanValue2;
            return fVar.invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            xue0 xue0Var = this.a;
            mze0 mze0Var = this.b;
            p0f0 p0f0Var = this.c;
            boolean z = this.d;
            boolean z2 = this.e;
            y5b y5bVar = y5b.a;
            uj50.b(obj);
            int i = xue0Var.b;
            v340 v340Var = aof0.this.B;
            com.sportygames.newcms.b bVar = (com.sportygames.newcms.b) v340Var.a.getValue();
            vue0 vue0Var = vue0.X0;
            return new dse0(i, bVar.a(vue0Var.s, String.valueOf((int) xue0Var.c)), ((com.sportygames.newcms.b) v340Var.a.getValue()).a(vue0Var.t, String.valueOf((int) (xue0Var.d * 100.0d))), !z, p0f0Var.c, z2, mze0Var);
        }
    }

    public static final class f0 implements lyh<Boolean> {
        public final /* synthetic */ v340 a;

        public static final class a<T> implements myh {
            public final /* synthetic */ myh a;

            /* JADX INFO: renamed from: aof0$f0$a$a, reason: collision with other inner class name */
            @c0d(c = "com.sportygames.goldmine.TheGoldmineViewModel$special$$inlined$filter$2$2", f = "TheGoldmineViewModel.kt", l = {50}, m = "emit", v = 1)
            public static final class C0085a extends x1b {
                public /* synthetic */ Object a;
                public int b;

                public C0085a(v1b v1bVar) {
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
                C0085a c0085a;
                if (v1bVar instanceof C0085a) {
                    c0085a = (C0085a) v1bVar;
                    int i = c0085a.b;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        c0085a.b = i - Integer.MIN_VALUE;
                    } else {
                        c0085a = new C0085a(v1bVar);
                    }
                } else {
                    c0085a = new C0085a(v1bVar);
                }
                Object obj2 = c0085a.a;
                y5b y5bVar = y5b.a;
                int i2 = c0085a.b;
                if (i2 == 0) {
                    uj50.b(obj2);
                    if (!((Boolean) obj).booleanValue()) {
                        c0085a.b = 1;
                        if (this.a.emit(obj, c0085a) == y5bVar) {
                            return y5bVar;
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

        public f0(v340 v340Var) {
            this.a = v340Var;
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        @Override // defpackage.lyh
        public final Object collect(myh<? super Boolean> myhVar, v1b v1bVar) {
            Object objCollect = this.a.a.collect(new a(myhVar), (v1b<? super Unit>) v1bVar);
            return objCollect == y5b.a ? objCollect : Unit.a;
        }
    }

    @c0d(c = "com.sportygames.goldmine.TheGoldmineViewModel$animationResult$1", f = "TheGoldmineViewModel.kt", l = {}, m = "invokeSuspend", v = 1)
    public static final class g extends tje0 implements gaj<wwe0, mue0, v1b<? super mze0>, Object> {
        public /* synthetic */ wwe0 a;
        public /* synthetic */ mue0 b;

        public g(v1b<? super g> v1bVar) {
            super(3, v1bVar);
        }

        @Override // defpackage.gaj
        public final Object invoke(wwe0 wwe0Var, mue0 mue0Var, v1b<? super mze0> v1bVar) {
            g gVar = aof0.this.new g(v1bVar);
            gVar.a = wwe0Var;
            gVar.b = mue0Var;
            return gVar.invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            lze0 aVar;
            wwe0 wwe0Var = this.a;
            mue0 mue0Var = this.b;
            y5b y5bVar = y5b.a;
            uj50.b(obj);
            if (!Intrinsics.g(wwe0Var, wwe0.d.a) && !Intrinsics.g(wwe0Var, wwe0.c.a) && !Intrinsics.g(wwe0Var, wwe0.e.a) && !Intrinsics.g(wwe0Var, wwe0.b.a)) {
                if (Intrinsics.g(wwe0Var, wwe0.a.a)) {
                    return mze0.b.a;
                }
                uhc.a();
                return null;
            }
            if (Intrinsics.g(mue0Var, mue0.a.a)) {
                return mze0.a.a;
            }
            if (Intrinsics.g(mue0Var, mue0.b.a)) {
                return mze0.c.a;
            }
            if (!(mue0Var instanceof mue0.c)) {
                uhc.a();
                return null;
            }
            mue0.c cVar = (mue0.c) mue0Var;
            kze0 kze0Var = cVar.d;
            if (kze0Var instanceof kze0.a) {
                aVar = new lze0.a(dre0.H(String.valueOf(((kze0.a) kze0Var).a)));
            } else {
                if (!Intrinsics.g(kze0Var, kze0.b.a)) {
                    uhc.a();
                    return null;
                }
                aVar = lze0.b.a;
            }
            return new mze0.d(cVar.a, cVar.b, new jze0(dre0.H(String.valueOf(cVar.c)), aVar));
        }
    }

    public static final class g0 implements lyh<com.sportygames.newcms.b> {
        public final /* synthetic */ wwd0 a;

        public static final class a<T> implements myh {
            public final /* synthetic */ myh a;

            /* JADX INFO: renamed from: aof0$g0$a$a, reason: collision with other inner class name */
            @c0d(c = "com.sportygames.goldmine.TheGoldmineViewModel$special$$inlined$map$1$2", f = "TheGoldmineViewModel.kt", l = {50}, m = "emit", v = 1)
            public static final class C0086a extends x1b {
                public /* synthetic */ Object a;
                public int b;

                public C0086a(v1b v1bVar) {
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
                C0086a c0086a;
                if (v1bVar instanceof C0086a) {
                    c0086a = (C0086a) v1bVar;
                    int i = c0086a.b;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        c0086a.b = i - Integer.MIN_VALUE;
                    } else {
                        c0086a = new C0086a(v1bVar);
                    }
                } else {
                    c0086a = new C0086a(v1bVar);
                }
                Object obj2 = c0086a.a;
                y5b y5bVar = y5b.a;
                int i2 = c0086a.b;
                if (i2 == 0) {
                    uj50.b(obj2);
                    com.sportygames.newcms.b bVar = ((q4l.c) obj).a;
                    c0086a.b = 1;
                    if (this.a.emit(bVar, c0086a) == y5bVar) {
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

        public g0(wwd0 wwd0Var) {
            this.a = wwd0Var;
        }

        @Override // defpackage.lyh
        public final Object collect(myh<? super com.sportygames.newcms.b> myhVar, v1b v1bVar) throws Throwable {
            this.a.collect(new a(myhVar), v1bVar);
            return y5b.a;
        }
    }

    @c0d(c = "com.sportygames.goldmine.TheGoldmineViewModel$balance$1", f = "TheGoldmineViewModel.kt", l = {}, m = "invokeSuspend", v = 1)
    public static final class h extends tje0 implements gaj<o0f0, p0f0, v1b<? super o0f0>, Object> {
        public /* synthetic */ o0f0 a;
        public /* synthetic */ p0f0 b;

        @Override // defpackage.gaj
        public final Object invoke(o0f0 o0f0Var, p0f0 p0f0Var, v1b<? super o0f0> v1bVar) {
            h hVar = new h(3, v1bVar);
            hVar.a = o0f0Var;
            hVar.b = p0f0Var;
            return hVar.invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            Double d;
            o0f0 o0f0Var = this.a;
            p0f0 p0f0Var = this.b;
            y5b y5bVar = y5b.a;
            uj50.b(obj);
            return new o0f0(p0f0Var.b, p0f0Var.a, (o0f0Var.b == null || (d = p0f0Var.a) == null) ? null : new Double(d.doubleValue() - o0f0Var.b.doubleValue()));
        }
    }

    public static final class h0 implements lyh<mue0.c> {
        public final /* synthetic */ wwd0 a;

        public static final class a<T> implements myh {
            public final /* synthetic */ myh a;

            /* JADX INFO: renamed from: aof0$h0$a$a, reason: collision with other inner class name */
            @c0d(c = "com.sportygames.goldmine.TheGoldmineViewModel$special$$inlined$map$2$2", f = "TheGoldmineViewModel.kt", l = {50}, m = "emit", v = 1)
            public static final class C0087a extends x1b {
                public /* synthetic */ Object a;
                public int b;

                public C0087a(v1b v1bVar) {
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
                C0087a c0087a;
                if (v1bVar instanceof C0087a) {
                    c0087a = (C0087a) v1bVar;
                    int i = c0087a.b;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        c0087a.b = i - Integer.MIN_VALUE;
                    } else {
                        c0087a = new C0087a(v1bVar);
                    }
                } else {
                    c0087a = new C0087a(v1bVar);
                }
                Object obj2 = c0087a.a;
                y5b y5bVar = y5b.a;
                int i2 = c0087a.b;
                mue0.c cVar = null;
                if (i2 == 0) {
                    uj50.b(obj2);
                    mue0 mue0Var = (mue0) obj;
                    if (!Intrinsics.g(mue0Var, mue0.b.a) && !Intrinsics.g(mue0Var, mue0.a.a)) {
                        if (!(mue0Var instanceof mue0.c)) {
                            uhc.a();
                            return null;
                        }
                        cVar = (mue0.c) mue0Var;
                    }
                    c0087a.b = 1;
                    if (this.a.emit(cVar, c0087a) == y5bVar) {
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

        public h0(wwd0 wwd0Var) {
            this.a = wwd0Var;
        }

        @Override // defpackage.lyh
        public final Object collect(myh<? super mue0.c> myhVar, v1b v1bVar) throws Throwable {
            this.a.collect(new a(myhVar), v1bVar);
            return y5b.a;
        }
    }

    @c0d(c = "com.sportygames.goldmine.TheGoldmineViewModel$betAmountState$1", f = "TheGoldmineViewModel.kt", l = {}, m = "invokeSuspend", v = 1)
    public static final class i extends tje0 implements gaj<ose0, mse0, v1b<? super ere0>, Object> {
        public /* synthetic */ ose0 a;
        public /* synthetic */ mse0 b;

        public i(v1b<? super i> v1bVar) {
            super(3, v1bVar);
        }

        @Override // defpackage.gaj
        public final Object invoke(ose0 ose0Var, mse0 mse0Var, v1b<? super ere0> v1bVar) {
            i iVar = aof0.this.new i(v1bVar);
            iVar.a = ose0Var;
            iVar.b = mse0Var;
            return iVar.invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            fre0 bVar;
            ose0 ose0Var = this.a;
            mse0 mse0Var = this.b;
            y5b y5bVar = y5b.a;
            uj50.b(obj);
            String strY1 = aof0.y1(mse0Var.b);
            double d = mse0Var.a;
            String strH = dre0.H(String.valueOf(d));
            ose0Var.getClass();
            Double dH = kotlin.text.b.h(ose0Var.getText());
            double dDoubleValue = dH != null ? dH.doubleValue() : 0.0d;
            if (ose0Var instanceof ose0.a) {
                ijf0 ijf0Var = ((ose0.a) ose0Var).a;
                boolean z = true;
                if (Math.abs(dDoubleValue - d) <= 1.0E-6d) {
                    z = false;
                }
                boolean z2 = dDoubleValue > d;
                double d2 = mse0Var.b;
                bVar = new fre0.a(ijf0Var, z, z2, dDoubleValue < d2 ? z : false, dDoubleValue < d2 ? z : false);
            } else {
                if (!(ose0Var instanceof ose0.b)) {
                    uhc.a();
                    return null;
                }
                bVar = new fre0.b(((ose0.b) ose0Var).a);
            }
            return new ere0(strY1, strH, bVar);
        }
    }

    public static final class i0 implements lyh<Boolean> {
        public final /* synthetic */ wwd0 a;

        public static final class a<T> implements myh {
            public final /* synthetic */ myh a;

            /* JADX INFO: renamed from: aof0$i0$a$a, reason: collision with other inner class name */
            @c0d(c = "com.sportygames.goldmine.TheGoldmineViewModel$special$$inlined$map$3$2", f = "TheGoldmineViewModel.kt", l = {50}, m = "emit", v = 1)
            public static final class C0088a extends x1b {
                public /* synthetic */ Object a;
                public int b;

                public C0088a(v1b v1bVar) {
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
                C0088a c0088a;
                if (v1bVar instanceof C0088a) {
                    c0088a = (C0088a) v1bVar;
                    int i = c0088a.b;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        c0088a.b = i - Integer.MIN_VALUE;
                    } else {
                        c0088a = new C0088a(v1bVar);
                    }
                } else {
                    c0088a = new C0088a(v1bVar);
                }
                Object obj2 = c0088a.a;
                y5b y5bVar = y5b.a;
                int i2 = c0088a.b;
                if (i2 == 0) {
                    uj50.b(obj2);
                    wwe0 wwe0Var = (wwe0) obj;
                    Boolean boolValueOf = Boolean.valueOf(Intrinsics.g(wwe0Var, wwe0.b.a) || Intrinsics.g(wwe0Var, wwe0.c.a));
                    c0088a.b = 1;
                    if (this.a.emit(boolValueOf, c0088a) == y5bVar) {
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

        public i0(wwd0 wwd0Var) {
            this.a = wwd0Var;
        }

        @Override // defpackage.lyh
        public final Object collect(myh<? super Boolean> myhVar, v1b v1bVar) throws Throwable {
            this.a.collect(new a(myhVar), v1bVar);
            return y5b.a;
        }
    }

    @c0d(c = "com.sportygames.goldmine.TheGoldmineViewModel$betButtonState$1", f = "TheGoldmineViewModel.kt", l = {}, m = "invokeSuspend", v = 1)
    public static final class j extends tje0 implements kaj<wwe0, h0f0, Boolean, Boolean, Boolean, v1b<? super wse0>, Object> {
        public /* synthetic */ wwe0 a;
        public /* synthetic */ h0f0 b;
        public /* synthetic */ boolean c;
        public /* synthetic */ boolean d;
        public /* synthetic */ boolean e;

        public j(v1b<? super j> v1bVar) {
            super(6, v1bVar);
        }

        @Override // defpackage.kaj
        public final Object f(wwe0 wwe0Var, h0f0 h0f0Var, Boolean bool, Boolean bool2, Boolean bool3, v1b<? super wse0> v1bVar) {
            boolean zBooleanValue = bool.booleanValue();
            boolean zBooleanValue2 = bool2.booleanValue();
            boolean zBooleanValue3 = bool3.booleanValue();
            j jVar = new j(v1bVar);
            jVar.a = wwe0Var;
            jVar.b = h0f0Var;
            jVar.c = zBooleanValue;
            jVar.d = zBooleanValue2;
            jVar.e = zBooleanValue3;
            return jVar.invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            wwe0 wwe0Var = this.a;
            h0f0 h0f0Var = this.b;
            boolean z = this.c;
            boolean z2 = this.d;
            boolean z3 = this.e;
            y5b y5bVar = y5b.a;
            uj50.b(obj);
            if (Intrinsics.g(wwe0Var, wwe0.a.a) || Intrinsics.g(wwe0Var, wwe0.d.a) || Intrinsics.g(wwe0Var, wwe0.e.a)) {
                int iOrdinal = h0f0Var.ordinal();
                if (iOrdinal == 0) {
                    return wse0.c.a;
                }
                if (iOrdinal == 1) {
                    return z ? wse0.e.a : wse0.d.a;
                }
                uhc.a();
                return null;
            }
            boolean z4 = z2 && z3;
            int iOrdinal2 = h0f0Var.ordinal();
            if (iOrdinal2 == 0) {
                return new wse0.b(z4);
            }
            if (iOrdinal2 == 1) {
                return new wse0.a(z4);
            }
            uhc.a();
            return null;
        }
    }

    public static final class j0 implements lyh<jv1> {
        public final /* synthetic */ h1i a;
        public final /* synthetic */ aof0 b;

        public static final class a<T> implements myh {
            public final /* synthetic */ myh a;

            /* JADX INFO: renamed from: aof0$j0$a$a, reason: collision with other inner class name */
            @c0d(c = "com.sportygames.goldmine.TheGoldmineViewModel$special$$inlined$map$4$2", f = "TheGoldmineViewModel.kt", l = {50}, m = "emit", v = 1)
            public static final class C0089a extends x1b {
                public /* synthetic */ Object a;
                public int b;

                public C0089a(v1b v1bVar) {
                    super(v1bVar);
                }

                @Override // defpackage.pz1
                public final Object invokeSuspend(Object obj) {
                    this.a = obj;
                    this.b |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(myh myhVar, aof0 aof0Var) {
                this.a = myhVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // defpackage.myh
            public final Object emit(Object obj, v1b v1bVar) {
                C0089a c0089a;
                if (v1bVar instanceof C0089a) {
                    c0089a = (C0089a) v1bVar;
                    int i = c0089a.b;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        c0089a.b = i - Integer.MIN_VALUE;
                    } else {
                        c0089a = new C0089a(v1bVar);
                    }
                } else {
                    c0089a = new C0089a(v1bVar);
                }
                Object obj2 = c0089a.a;
                y5b y5bVar = y5b.a;
                int i2 = c0089a.b;
                if (i2 == 0) {
                    uj50.b(obj2);
                    o0f0 o0f0Var = (o0f0) obj;
                    Double d = o0f0Var.c;
                    boolean z = false;
                    if (d != null && d.doubleValue() <= 0.0d) {
                        z = true;
                    }
                    boolean z2 = !z;
                    String str = !z ? "+" : "-";
                    Double d2 = o0f0Var.c;
                    String strY1 = d2 != null ? aof0.y1(Math.abs(d2.doubleValue())) : "";
                    String str2 = o0f0Var.a;
                    Double d3 = o0f0Var.b;
                    jv1 jv1Var = new jv1(str2, aof0.y1(d3 != null ? d3.doubleValue() : 0.0d), str + ' ' + strY1, z2);
                    c0089a.b = 1;
                    if (this.a.emit(jv1Var, c0089a) == y5bVar) {
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

        public j0(h1i h1iVar, aof0 aof0Var) {
            this.a = h1iVar;
            this.b = aof0Var;
        }

        @Override // defpackage.lyh
        public final Object collect(myh<? super jv1> myhVar, v1b v1bVar) {
            Object objCollect = this.a.collect(new a(myhVar, this.b), v1bVar);
            return objCollect == y5b.a ? objCollect : Unit.a;
        }
    }

    @c0d(c = "com.sportygames.goldmine.TheGoldmineViewModel$bgMusicState$1", f = "TheGoldmineViewModel.kt", l = {}, m = "invokeSuspend", v = 1)
    public static final class k extends tje0 implements gaj<Boolean, xue0, v1b<? super lse0>, Object> {
        public /* synthetic */ boolean a;
        public /* synthetic */ xue0 b;

        @Override // defpackage.gaj
        public final Object invoke(Boolean bool, xue0 xue0Var, v1b<? super lse0> v1bVar) {
            boolean zBooleanValue = bool.booleanValue();
            k kVar = new k(3, v1bVar);
            kVar.a = zBooleanValue;
            kVar.b = xue0Var;
            return kVar.invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            boolean z = this.a;
            xue0 xue0Var = this.b;
            y5b y5bVar = y5b.a;
            uj50.b(obj);
            if (!z) {
                return lse0.b.a;
            }
            int i = xue0Var.b;
            if (i != 0) {
                return i != 1 ? lse0.b.a : new lse0.a(vue0.X0.M0);
            }
            return new lse0.a(vue0.X0.L0);
        }
    }

    @c0d(c = "com.sportygames.goldmine.TheGoldmineViewModel$spinModeDataState$1", f = "TheGoldmineViewModel.kt", l = {}, m = "invokeSuspend", v = 1)
    public static final class k0 extends tje0 implements jaj<q4l.c, ere0, h0f0, ijf0, v1b<? super i0f0>, Object> {
        public /* synthetic */ q4l.c a;
        public /* synthetic */ ere0 b;
        public /* synthetic */ h0f0 c;
        public /* synthetic */ ijf0 d;

        public k0(v1b<? super k0> v1bVar) {
            super(5, v1bVar);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            int iIntValue;
            q4l.c cVar = this.a;
            ere0 ere0Var = this.b;
            h0f0 h0f0Var = this.c;
            ijf0 ijf0Var = this.d;
            y5b y5bVar = y5b.a;
            uj50.b(obj);
            cVar.getClass();
            ere0Var.getClass();
            h0f0Var.getClass();
            ijf0Var.getClass();
            if (h0f0Var == h0f0.a) {
                return new i0f0.b(ere0Var);
            }
            kse0 kse0Var = cVar.c.b;
            nk0 nk0Var = ijf0Var.a;
            String str = nk0Var.b;
            String str2 = nk0Var.b;
            if (Intrinsics.g(str, "∞")) {
                iIntValue = Reader.READ_DONE;
            } else {
                Integer intOrNull = StringsKt.toIntOrNull(str2);
                iIntValue = intOrNull != null ? intOrNull.intValue() : 0;
            }
            int i = kse0Var.a;
            int i2 = kse0Var.b;
            String strValueOf = String.valueOf(i);
            String strValueOf2 = String.valueOf(i2);
            boolean z = false;
            boolean z2 = false;
            if (iIntValue != i2) {
                z = true;
            }
            boolean z3 = iIntValue > i2;
            if (iIntValue <= kse0Var.a) {
                z2 = true;
            }
            return new i0f0.a(ere0Var, new ere0(strValueOf, strValueOf2, new fre0.a(ijf0Var, z, z3, z2, !Intrinsics.g(str2, "∞"))));
        }

        @Override // defpackage.jaj
        public final Object l(q4l.c cVar, ere0 ere0Var, h0f0 h0f0Var, ijf0 ijf0Var, v1b<? super i0f0> v1bVar) {
            k0 k0Var = aof0.this.new k0(v1bVar);
            k0Var.a = cVar;
            k0Var.b = ere0Var;
            k0Var.c = h0f0Var;
            k0Var.d = ijf0Var;
            return k0Var.invokeSuspend(Unit.a);
        }
    }

    @c0d(c = "com.sportygames.goldmine.TheGoldmineViewModel$caveSelectorState$1", f = "TheGoldmineViewModel.kt", l = {}, m = "invokeSuspend", v = 1)
    public static final class l extends tje0 implements gaj<q4l.c, xue0, v1b<? super exe0>, Object> {
        public /* synthetic */ q4l.c a;
        public /* synthetic */ xue0 b;

        @Override // defpackage.gaj
        public final Object invoke(q4l.c cVar, xue0 xue0Var, v1b<? super exe0> v1bVar) {
            l lVar = new l(3, v1bVar);
            lVar.a = cVar;
            lVar.b = xue0Var;
            return lVar.invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            q4l.c cVar = this.a;
            xue0 xue0Var = this.b;
            y5b y5bVar = y5b.a;
            uj50.b(obj);
            String str = xue0Var.a;
            int i = xue0Var.b;
            return new exe0(str, i > 0, i + 1 < cVar.d.size());
        }
    }

    @c0d(c = "com.sportygames.goldmine.TheGoldmineViewModel$state$1", f = "TheGoldmineViewModel.kt", l = {}, m = "invokeSuspend", v = 1)
    public static final class l0 extends tje0 implements gaj<gxe0, ove0, v1b<? super m0f0>, Object> {
        public /* synthetic */ gxe0 a;
        public /* synthetic */ ove0 b;

        @Override // defpackage.gaj
        public final Object invoke(gxe0 gxe0Var, ove0 ove0Var, v1b<? super m0f0> v1bVar) {
            l0 l0Var = new l0(3, v1bVar);
            l0Var.a = gxe0Var;
            l0Var.b = ove0Var;
            return l0Var.invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            gxe0 gxe0Var = this.a;
            ove0 ove0Var = this.b;
            y5b y5bVar = y5b.a;
            uj50.b(obj);
            return new m0f0(gxe0Var, ove0Var);
        }
    }

    @c0d(c = "com.sportygames.goldmine.TheGoldmineViewModel$controlPanelEditable$1", f = "TheGoldmineViewModel.kt", l = {}, m = "invokeSuspend", v = 1)
    public static final class m extends tje0 implements gaj<Boolean, Boolean, v1b<? super Boolean>, Object> {
        public /* synthetic */ boolean a;
        public /* synthetic */ boolean b;

        @Override // defpackage.gaj
        public final Object invoke(Boolean bool, Boolean bool2, v1b<? super Boolean> v1bVar) {
            boolean zBooleanValue = bool.booleanValue();
            boolean zBooleanValue2 = bool2.booleanValue();
            m mVar = new m(3, v1bVar);
            mVar.a = zBooleanValue;
            mVar.b = zBooleanValue2;
            return mVar.invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            boolean z = this.a;
            boolean z2 = this.b;
            y5b y5bVar = y5b.a;
            uj50.b(obj);
            return Boolean.valueOf(z && z2);
        }
    }

    @c0d(c = "com.sportygames.goldmine.TheGoldmineViewModel$turboState$1", f = "TheGoldmineViewModel.kt", l = {}, m = "invokeSuspend", v = 1)
    public static final class m0 extends tje0 implements kaj<h0f0, Boolean, wse0, Boolean, Boolean, v1b<? super l0f0>, Object> {
        public /* synthetic */ h0f0 a;
        public /* synthetic */ boolean b;
        public /* synthetic */ wse0 c;
        public /* synthetic */ boolean d;
        public /* synthetic */ boolean e;

        public m0(v1b<? super m0> v1bVar) {
            super(6, v1bVar);
        }

        @Override // defpackage.kaj
        public final Object f(h0f0 h0f0Var, Boolean bool, wse0 wse0Var, Boolean bool2, Boolean bool3, v1b<? super l0f0> v1bVar) {
            boolean zBooleanValue = bool.booleanValue();
            boolean zBooleanValue2 = bool2.booleanValue();
            boolean zBooleanValue3 = bool3.booleanValue();
            m0 m0Var = new m0(v1bVar);
            m0Var.a = h0f0Var;
            m0Var.b = zBooleanValue;
            m0Var.c = wse0Var;
            m0Var.d = zBooleanValue2;
            m0Var.e = zBooleanValue3;
            return m0Var.invokeSuspend(Unit.a);
        }

        /* JADX WARN: Code duplicated, block: B:8:0x0021  */
        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            h0f0 h0f0Var = this.a;
            boolean z = this.b;
            wse0 wse0Var = this.c;
            boolean z2 = this.d;
            boolean z3 = this.e;
            y5b y5bVar = y5b.a;
            uj50.b(obj);
            int iOrdinal = h0f0Var.ordinal();
            boolean z4 = false;
            if (iOrdinal != 0) {
                if (iOrdinal != 1) {
                    uhc.a();
                    return null;
                }
                if (!(wse0Var instanceof wse0.e) && z2) {
                    z4 = true;
                }
            } else if (z3) {
                z4 = true;
            }
            return new l0f0(z4, z);
        }
    }

    @c0d(c = "com.sportygames.goldmine.TheGoldmineViewModel$controlPanelState$1", f = "TheGoldmineViewModel.kt", l = {}, m = "invokeSuspend", v = 1)
    public static final class n extends tje0 implements gaj<Boolean, Boolean, v1b<? super Pair<? extends Boolean, ? extends Boolean>>, Object> {
        public /* synthetic */ boolean a;
        public /* synthetic */ boolean b;

        @Override // defpackage.gaj
        public final Object invoke(Boolean bool, Boolean bool2, v1b<? super Pair<? extends Boolean, ? extends Boolean>> v1bVar) {
            boolean zBooleanValue = bool.booleanValue();
            boolean zBooleanValue2 = bool2.booleanValue();
            n nVar = new n(3, v1bVar);
            nVar.a = zBooleanValue;
            nVar.b = zBooleanValue2;
            return nVar.invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            boolean z = this.a;
            boolean z2 = this.b;
            y5b y5bVar = y5b.a;
            uj50.b(obj);
            return new Pair(Boolean.valueOf(z), Boolean.valueOf(z2));
        }
    }

    @c0d(c = "com.sportygames.goldmine.TheGoldmineViewModel$controlPanelState$2", f = "TheGoldmineViewModel.kt", l = {}, m = "invokeSuspend", v = 1)
    public static final class o extends tje0 implements gaj<wse0, Boolean, v1b<? super Pair<? extends wse0, ? extends Boolean>>, Object> {
        public /* synthetic */ wse0 a;
        public /* synthetic */ boolean b;

        @Override // defpackage.gaj
        public final Object invoke(wse0 wse0Var, Boolean bool, v1b<? super Pair<? extends wse0, ? extends Boolean>> v1bVar) {
            boolean zBooleanValue = bool.booleanValue();
            o oVar = new o(3, v1bVar);
            oVar.a = wse0Var;
            oVar.b = zBooleanValue;
            return oVar.invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            wse0 wse0Var = this.a;
            boolean z = this.b;
            y5b y5bVar = y5b.a;
            uj50.b(obj);
            return new Pair(wse0Var, Boolean.valueOf(z));
        }
    }

    @c0d(c = "com.sportygames.goldmine.TheGoldmineViewModel$controlPanelState$3", f = "TheGoldmineViewModel.kt", l = {}, m = "invokeSuspend", v = 1)
    public static final class p extends tje0 implements kaj<i0f0, exe0, Pair<? extends Boolean, ? extends Boolean>, Pair<? extends wse0, ? extends Boolean>, l0f0, v1b<? super nve0>, Object> {
        public /* synthetic */ i0f0 a;
        public /* synthetic */ exe0 b;
        public /* synthetic */ Pair c;
        public /* synthetic */ Pair d;
        public /* synthetic */ l0f0 e;

        public p(v1b<? super p> v1bVar) {
            super(6, v1bVar);
        }

        @Override // defpackage.kaj
        public final Object f(i0f0 i0f0Var, exe0 exe0Var, Pair<? extends Boolean, ? extends Boolean> pair, Pair<? extends wse0, ? extends Boolean> pair2, l0f0 l0f0Var, v1b<? super nve0> v1bVar) {
            p pVar = new p(v1bVar);
            pVar.a = i0f0Var;
            pVar.b = exe0Var;
            pVar.c = pair;
            pVar.d = pair2;
            pVar.e = l0f0Var;
            return pVar.invokeSuspend(Unit.a);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            i0f0 i0f0Var = this.a;
            exe0 exe0Var = this.b;
            Pair pair = this.c;
            Pair pair2 = this.d;
            l0f0 l0f0Var = this.e;
            y5b y5bVar = y5b.a;
            uj50.b(obj);
            return new nve0(((Boolean) pair.a).booleanValue(), i0f0Var, ((Boolean) pair.b).booleanValue(), exe0Var, (wse0) pair2.a, l0f0Var, ((Boolean) pair2.b).booleanValue());
        }
    }

    @c0d(c = "com.sportygames.goldmine.TheGoldmineViewModel$currentConfig$1", f = "TheGoldmineViewModel.kt", l = {}, m = "invokeSuspend", v = 1)
    public static final class q extends tje0 implements gaj<q4l.c, xue0, v1b<? super mse0>, Object> {
        public /* synthetic */ q4l.c a;
        public /* synthetic */ xue0 b;

        @Override // defpackage.gaj
        public final Object invoke(q4l.c cVar, xue0 xue0Var, v1b<? super mse0> v1bVar) {
            q qVar = new q(3, v1bVar);
            qVar.a = cVar;
            qVar.b = xue0Var;
            return qVar.invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            q4l.c cVar = this.a;
            xue0 xue0Var = this.b;
            y5b y5bVar = y5b.a;
            uj50.b(obj);
            mse0 mse0Var = (mse0) CollectionsKt.V(xue0Var.b, cVar.c.a);
            return mse0Var == null ? new mse0(0) : mse0Var;
        }
    }

    @c0d(c = "com.sportygames.goldmine.TheGoldmineViewModel$giftDialog$1", f = "TheGoldmineViewModel.kt", l = {}, m = "invokeSuspend", v = 1)
    public static final class r extends tje0 implements iaj<Boolean, mse0, p0f0, v1b<? super kwe0>, Object> {
        public /* synthetic */ boolean a;
        public /* synthetic */ mse0 b;
        public /* synthetic */ p0f0 c;

        @Override // defpackage.iaj
        public final Object d(Boolean bool, mse0 mse0Var, p0f0 p0f0Var, v1b<? super kwe0> v1bVar) {
            boolean zBooleanValue = bool.booleanValue();
            r rVar = new r(4, v1bVar);
            rVar.a = zBooleanValue;
            rVar.b = mse0Var;
            rVar.c = p0f0Var;
            return rVar.invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            boolean z = this.a;
            mse0 mse0Var = this.b;
            p0f0 p0f0Var = this.c;
            y5b y5bVar = y5b.a;
            uj50.b(obj);
            if (!z) {
                return kwe0.a.a;
            }
            uf00 uf00VarF = a4h.f(p0f0Var.e);
            double d = mse0Var.b;
            return new kwe0.b(uf00VarF, d, mse0Var.a, d);
        }
    }

    @c0d(c = "com.sportygames.goldmine.TheGoldmineViewModel$handleEvent$2", f = "TheGoldmineViewModel.kt", l = {730}, m = "invokeSuspend", v = 1)
    public static final class s extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public int a;

        public s(v1b<? super s> v1bVar) {
            super(2, v1bVar);
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            return aof0.this.new s(v1bVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
            return ((s) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            y5b y5bVar = y5b.a;
            int i = this.a;
            if (i == 0) {
                uj50.b(obj);
                wwd0 wwd0Var = aof0.this.y;
                this.a = 1;
                if (xwe0.a(wwd0Var, this) == y5bVar) {
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

    @c0d(c = "com.sportygames.goldmine.TheGoldmineViewModel$handleEvent$3", f = "TheGoldmineViewModel.kt", l = {738}, m = "invokeSuspend", v = 1)
    public static final class t extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public int a;

        public t(v1b<? super t> v1bVar) {
            super(2, v1bVar);
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            return aof0.this.new t(v1bVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
            return ((t) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            y5b y5bVar = y5b.a;
            int i = this.a;
            if (i == 0) {
                uj50.b(obj);
                aof0 aof0Var = aof0.this;
                en20 en20Var = aof0Var.e;
                boolean z = !((Boolean) aof0Var.K.a.getValue()).booleanValue();
                this.a = 1;
                if (en20Var.a("key - TG- turbo mode", z, this) == y5bVar) {
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

    @c0d(c = "com.sportygames.goldmine.TheGoldmineViewModel$handleEvent$4", f = "TheGoldmineViewModel.kt", l = {749}, m = "invokeSuspend", v = 1)
    public static final class u extends tje0 implements Function2<mk50<? extends List<? extends CommonGameDetails>>, v1b<? super Unit>, Object> {
        public int a;
        public /* synthetic */ Object b;
        public final /* synthetic */ qve0 d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public u(qve0 qve0Var, v1b<? super u> v1bVar) {
            super(2, v1bVar);
            this.d = qve0Var;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            u uVar = aof0.this.new u(this.d, v1bVar);
            uVar.b = obj;
            return uVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(mk50<? extends List<? extends CommonGameDetails>> mk50Var, v1b<? super Unit> v1bVar) {
            return ((u) create(mk50Var, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            iwg bVar;
            mk50 mk50Var = (mk50) this.b;
            y5b y5bVar = y5b.a;
            int i = this.a;
            if (i == 0) {
                uj50.b(obj);
                if (Intrinsics.g(mk50Var, mk50.b.a)) {
                    bVar = iwg.a.a;
                } else {
                    mk50.c cVar = mk50Var instanceof mk50.c ? (mk50.c) mk50Var : null;
                    bVar = new iwg.b(cVar != null ? (List) cVar.a : null);
                }
                wwd0 wwd0Var = aof0.this.N;
                qve0.h hVar = (qve0.h) this.d;
                ove0.e eVar = new ove0.e(hVar.a, bVar, hVar.b);
                this.b = null;
                this.a = 1;
                wwd0Var.getClass();
                wwd0Var.k(null, eVar);
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

    @c0d(c = "com.sportygames.goldmine.TheGoldmineViewModel$handleEvent$5", f = "TheGoldmineViewModel.kt", l = {784, 785}, m = "invokeSuspend", v = 1)
    public static final class v extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ qve0 c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public v(qve0 qve0Var, v1b<? super v> v1bVar) {
            super(2, v1bVar);
            this.c = qve0Var;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            return aof0.this.new v(this.c, v1bVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
            return ((v) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
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
                aof0 r2 = defpackage.aof0.this
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
                en20 r6 = r2.e
                qve0 r1 = r5.c
                qve0$u r1 = (qve0.u) r1
                boolean r1 = r1.a
                r5.a = r4
                java.lang.String r4 = "key-TG-one-tap-bet"
                java.lang.Object r6 = r6.a(r4, r1, r5)
                if (r6 != r0) goto L33
                goto L40
            L33:
                wwd0 r6 = r2.N
                ove0$c r1 = ove0.c.a
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
            throw new UnsupportedOperationException("Method not decompiled: aof0.v.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @c0d(c = "com.sportygames.goldmine.TheGoldmineViewModel$hasGiftButton$1", f = "TheGoldmineViewModel.kt", l = {}, m = "invokeSuspend", v = 1)
    public static final class w extends tje0 implements gaj<p0f0, h0f0, v1b<? super Boolean>, Object> {
        public /* synthetic */ p0f0 a;
        public /* synthetic */ h0f0 b;

        @Override // defpackage.gaj
        public final Object invoke(p0f0 p0f0Var, h0f0 h0f0Var, v1b<? super Boolean> v1bVar) {
            w wVar = new w(3, v1bVar);
            wVar.a = p0f0Var;
            wVar.b = h0f0Var;
            return wVar.invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            p0f0 p0f0Var = this.a;
            h0f0 h0f0Var = this.b;
            y5b y5bVar = y5b.a;
            uj50.b(obj);
            int iOrdinal = h0f0Var.ordinal();
            boolean z = false;
            if (iOrdinal != 0) {
                if (iOrdinal != 1) {
                    uhc.a();
                    return null;
                }
            } else if (!p0f0Var.e.isEmpty()) {
                z = true;
            }
            return Boolean.valueOf(z);
        }
    }

    @c0d(c = "com.sportygames.goldmine.TheGoldmineViewModel$haveNextBet$1", f = "TheGoldmineViewModel.kt", l = {}, m = "invokeSuspend", v = 1)
    public static final class x extends tje0 implements iaj<h0f0, ijf0, Boolean, v1b<? super Boolean>, Object> {
        public /* synthetic */ h0f0 a;
        public /* synthetic */ ijf0 b;
        public /* synthetic */ boolean c;

        @Override // defpackage.iaj
        public final Object d(h0f0 h0f0Var, ijf0 ijf0Var, Boolean bool, v1b<? super Boolean> v1bVar) {
            boolean zBooleanValue = bool.booleanValue();
            x xVar = new x(4, v1bVar);
            xVar.a = h0f0Var;
            xVar.b = ijf0Var;
            xVar.c = zBooleanValue;
            return xVar.invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            Integer intOrNull;
            h0f0 h0f0Var = this.a;
            ijf0 ijf0Var = this.b;
            boolean z = this.c;
            y5b y5bVar = y5b.a;
            uj50.b(obj);
            int iOrdinal = h0f0Var.ordinal();
            boolean z2 = false;
            if (iOrdinal != 0) {
                if (iOrdinal != 1) {
                    uhc.a();
                    return null;
                }
                boolean z3 = Intrinsics.g(ijf0Var.a.b, "∞") || ((intOrNull = StringsKt.toIntOrNull(ijf0Var.a.b)) != null && intOrNull.intValue() > 0);
                if (!z && z3) {
                    z2 = true;
                }
            }
            return Boolean.valueOf(z2);
        }
    }

    @c0d(c = "com.sportygames.goldmine.TheGoldmineViewModel$isTextFieldLegal$1", f = "TheGoldmineViewModel.kt", l = {}, m = "invokeSuspend", v = 1)
    public static final class y extends tje0 implements jaj<ose0, mse0, ijf0, q4l.c, v1b<? super Boolean>, Object> {
        public /* synthetic */ ose0 a;
        public /* synthetic */ mse0 b;
        public /* synthetic */ ijf0 c;
        public /* synthetic */ q4l.c d;

        /* JADX WARN: Code duplicated, block: B:16:0x003d  */
        /* JADX WARN: Code duplicated, block: B:9:0x0029  */
        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            boolean z;
            ose0 ose0Var = this.a;
            mse0 mse0Var = this.b;
            ijf0 ijf0Var = this.c;
            q4l.c cVar = this.d;
            y5b y5bVar = y5b.a;
            uj50.b(obj);
            Double dH = kotlin.text.b.h(ose0Var.getText());
            if (dH != null) {
                double dDoubleValue = dH.doubleValue();
                double d = mse0Var.a;
                if (dDoubleValue > mse0Var.b || d > dDoubleValue) {
                    dH = null;
                }
            } else {
                dH = null;
            }
            boolean z2 = false;
            boolean z3 = dH != null;
            if (Intrinsics.g(ijf0Var.a.b, "∞")) {
                z = true;
            } else {
                Integer intOrNull = StringsKt.toIntOrNull(ijf0Var.a.b);
                if ((intOrNull != null ? intOrNull.intValue() : -1) >= cVar.c.b.b) {
                    z = true;
                } else {
                    z = false;
                }
            }
            if (z3 && z) {
                z2 = true;
            }
            return Boolean.valueOf(z2);
        }

        @Override // defpackage.jaj
        public final Object l(ose0 ose0Var, mse0 mse0Var, ijf0 ijf0Var, q4l.c cVar, v1b<? super Boolean> v1bVar) {
            y yVar = new y(5, v1bVar);
            yVar.a = ose0Var;
            yVar.b = mse0Var;
            yVar.c = ijf0Var;
            yVar.d = cVar;
            return yVar.invokeSuspend(Unit.a);
        }
    }

    @c0d(c = "com.sportygames.goldmine.TheGoldmineViewModel$loadedState$1", f = "TheGoldmineViewModel.kt", l = {}, m = "invokeSuspend", v = 1)
    public static final class z extends tje0 implements gaj<kwe0, lse0, v1b<? super Pair<? extends kwe0, ? extends lse0>>, Object> {
        public /* synthetic */ kwe0 a;
        public /* synthetic */ lse0 b;

        @Override // defpackage.gaj
        public final Object invoke(kwe0 kwe0Var, lse0 lse0Var, v1b<? super Pair<? extends kwe0, ? extends lse0>> v1bVar) {
            z zVar = new z(3, v1bVar);
            zVar.a = kwe0Var;
            zVar.b = lse0Var;
            return zVar.invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            kwe0 kwe0Var = this.a;
            lse0 lse0Var = this.b;
            y5b y5bVar = y5b.a;
            uj50.b(obj);
            return new Pair(kwe0Var, lse0Var);
        }
    }

    public aof0(zve0 zve0Var, que0 que0Var, k5b k5bVar, k5b k5bVar2, en20 en20Var, cwe0 cwe0Var, String str, String str2) {
        zve0Var.getClass();
        que0Var.getClass();
        k5bVar.getClass();
        k5bVar2.getClass();
        en20Var.getClass();
        cwe0Var.getClass();
        str.getClass();
        this.a = zve0Var;
        this.b = que0Var;
        this.c = k5bVar;
        this.d = k5bVar2;
        this.e = en20Var;
        this.f = cwe0Var;
        this.i = str;
        this.v = str2;
        wwd0 wwd0VarA = xwd0.a(wwe0.b.a);
        this.y = wwd0VarA;
        wwd0 wwd0VarA2 = xwd0.a(new hzs.b(0.0f));
        this.z = wwd0VarA2;
        wwd0 wwd0VarA3 = xwd0.a(new q4l.c(0));
        this.A = wwd0VarA3;
        this.B = C1(new g0(wwd0VarA3), new com.sportygames.newcms.b(0));
        wwd0 wwd0VarA4 = xwd0.a(new p0f0(0));
        this.C = wwd0VarA4;
        wwd0 wwd0VarA5 = xwd0.a(new xue0(0));
        this.D = wwd0VarA5;
        wwd0 wwd0VarA6 = xwd0.a(new ose0.a(new ijf0((String) null, 0L, 7)));
        this.E = wwd0VarA6;
        wwd0 wwd0VarA7 = xwd0.a(new ijf0((String) null, 0L, 7));
        this.F = wwd0VarA7;
        wwd0 wwd0VarA8 = xwd0.a(h0f0.a);
        this.G = wwd0VarA8;
        wwd0 wwd0VarA9 = xwd0.a(c0f0.d.a);
        this.H = wwd0VarA9;
        wwd0 wwd0VarA10 = xwd0.a(mue0.b.a);
        this.I = wwd0VarA10;
        this.J = C1(new f1i(new h0(wwd0VarA10)), new mue0.c(0));
        hn20 booleanByFlow = en20Var.getBooleanByFlow("key - TG- turbo mode", false);
        Boolean bool = Boolean.FALSE;
        v340 v340VarC1 = C1(booleanByFlow, bool);
        this.K = v340VarC1;
        wwd0 wwd0VarA11 = xwd0.a(bool);
        this.L = wwd0VarA11;
        wwd0 wwd0VarA12 = xwd0.a(bool);
        this.M = wwd0VarA12;
        wwd0 wwd0VarA13 = xwd0.a(ove0.c.a);
        this.N = wwd0VarA13;
        hn20 booleanByFlow2 = en20Var.getBooleanByFlow("key-TG-music", true);
        Boolean bool2 = Boolean.TRUE;
        v340 v340VarC2 = C1(booleanByFlow2, bool2);
        this.O = C1(en20Var.getBooleanByFlow("key-TG-sound", true), bool2);
        this.P = C1(en20Var.getBooleanByFlow("key-TG-one-tap-bet", false), bool);
        v340 v340VarC3 = C1(new n1i(v340VarC2, wwd0VarA5, new k(3, null)), lse0.b.a);
        v340 v340VarC4 = C1(new n1i(wwd0VarA5, wwd0VarA4, new d0(3, null)), bool2);
        v340 v340VarC5 = C1(new i0(wwd0VarA), bool2);
        v340 v340VarC6 = C1(new n1i(v340VarC5, v340VarC4, new m(3, null)), bool2);
        v340 v340VarC7 = C1(new j0(new h1i(new o0f0(0), wwd0VarA4, new h(3, null)), this), new jv1(0));
        v340 v340VarC8 = C1(new n1i(wwd0VarA3, wwd0VarA5, new q(3, null)), new mse0(0));
        this.Q = v340VarC8;
        v340 v340VarC9 = C1(new n1i(wwd0VarA6, v340VarC8, new i(null)), new ere0(0));
        this.T = C1(r1i.a(wwd0VarA8, wwd0VarA7, wwd0VarA11, new x(4, null)), bool);
        v340 v340VarC10 = C1(r1i.b(wwd0VarA3, v340VarC9, wwd0VarA8, wwd0VarA7, new k0(null)), new i0f0.b(0));
        v340 v340VarC11 = C1(new n1i(wwd0VarA3, wwd0VarA5, new l(3, null)), new exe0(0));
        v340 v340VarC12 = C1(r1i.c(wwd0VarA, wwd0VarA8, wwd0VarA11, C1(r1i.b(wwd0VarA6, v340VarC8, wwd0VarA7, wwd0VarA3, new y(5, null)), bool), v340VarC4, new j(null)), new wse0.b(true));
        this.U = v340VarC12;
        v340 v340VarC13 = C1(r1i.c(wwd0VarA8, v340VarC1, v340VarC12, v340VarC4, v340VarC6, new m0(null)), new l0f0(0));
        v340 v340VarC14 = C1(new n1i(wwd0VarA4, wwd0VarA8, new w(3, null)), bool);
        this.V = C1(new n1i(C1(new n1i(wwd0VarA2, C1(r1i.c(wwd0VarA9, C1(r1i.c(v340VarC10, v340VarC11, new n1i(v340VarC6, v340VarC5, new n(3, null)), new n1i(v340VarC12, v340VarC14, new o(3, null)), v340VarC13, new p(null)), new nve0(0)), C1(r1i.c(wwd0VarA5, C1(new n1i(wwd0VarA, wwd0VarA10, new g(null)), mze0.c.a), wwd0VarA4, v340VarC4, v340VarC5, new f(null)), new dse0(0)), v340VarC7, new n1i(C1(r1i.a(wwd0VarA12, v340VarC8, wwd0VarA4, new r(4, null)), kwe0.a.a), v340VarC3, new z(3, null)), new a0(null)), new gxe0.b(0.0f)), new b0(3, null)), new gxe0.b(0.0f)), wwd0VarA13, new l0(3, null)), new m0f0(0));
        ju90<cre0> ju90Var = new ju90<>();
        this.W = ju90Var;
        this.X = e1i.a(ju90Var);
        kzh.d(new g1i(new e0(wwd0VarA2, this), new a(null)), o8i0.d(this));
        kzh.d(new g1i(new f0(v340VarC14), new b(null)), o8i0.d(this));
        kzh.d(new g1i(wwd0VarA3, new c(null)), o8i0.d(this));
        kzh.d(new g1i(v340VarC8, new d(null)), o8i0.d(this));
        kzh.d(new g1i(wwd0VarA, new e(null)), o8i0.d(this));
    }

    public static String y1(double d2) {
        DecimalFormat decimalFormat = new DecimalFormat("#,##0.00", new DecimalFormatSymbols(Locale.ENGLISH));
        decimalFormat.setRoundingMode(RoundingMode.DOWN);
        String str = decimalFormat.format(d2);
        str.getClass();
        return str;
    }

    public final void A1(Throwable th) {
        th.getClass();
        ej5.c(o8i0.d(this), null, null, new c0(th, null), 3);
    }

    public final void B1(CMSRes cMSRes) {
        if (((Boolean) this.O.a.getValue()).booleanValue()) {
            ((com.sportygames.newcms.b) this.B.a.getValue()).c(cMSRes);
        }
    }

    public final v340 C1(lyh lyhVar, Object obj) {
        return e1i.e(ozh.c(lyhVar, this.c), o8i0.d(this), q490.a.a, obj);
    }

    @Override // defpackage.j8i0
    public final void onCleared() {
        super.onCleared();
        ((com.sportygames.newcms.b) this.B.a.getValue()).d();
    }

    public final void x1() {
        if (this.w) {
            return;
        }
        this.w = true;
        zve0 zve0Var = this.a;
        zve0Var.getClass();
        dm8 dm8VarA = em8.a();
        dm8 dm8VarA2 = em8.a();
        dm8 dm8VarA3 = em8.a();
        dm8 dm8VarA4 = em8.a();
        dm8 dm8VarA5 = em8.a();
        dm8 dm8VarA6 = em8.a();
        kzh.d(ozh.c(new g1i(new f1i(new yzh(new vve0(zm8.a(kee.a(new xve0(zve0Var, dm8VarA, dm8VarA2, dm8VarA3, dm8VarA5, dm8VarA6, dm8VarA4, null))), zve0Var, dm8VarA2, dm8VarA3, dm8VarA4, dm8VarA5, dm8VarA6), new yve0(3, null))), new cof0(this, null)), this.c), o8i0.d(this));
    }

    public final void z1(qve0 qve0Var) {
        vue0 vue0Var;
        String strA;
        String strA2;
        boolean z2 = qve0Var instanceof qve0.y;
        wwd0 wwd0Var = this.H;
        if (z2) {
            wwd0Var.setValue(((qve0.y) qve0Var).a);
            return;
        }
        boolean zEquals = qve0Var.equals(qve0.w.a);
        v340 v340Var = this.B;
        wwd0 wwd0Var2 = this.A;
        if (zEquals) {
            String strB = ((q4l.c) wwd0Var2.getValue()).b.a;
            if (StringsKt.U(strB)) {
                strB = null;
            }
            if (strB == null) {
                strB = ((com.sportygames.newcms.b) v340Var.a.getValue()).b(vue0.X0.G, "");
            }
            c0f0.e eVar = new c0f0.e(strB, this.i + ((q4l.c) wwd0Var2.getValue()).b.b, ((q4l.c) wwd0Var2.getValue()).f.c);
            wwd0Var.getClass();
            wwd0Var.k(null, eVar);
            return;
        }
        boolean z3 = qve0Var instanceof qve0.z;
        v340 v340Var2 = this.Q;
        wwd0 wwd0Var3 = this.E;
        if (z3) {
            ijf0 ijf0Var = ((qve0.z) qve0Var).a;
            mse0 mse0Var = (mse0) v340Var2.a.getValue();
            wwd0Var3.getClass();
            mse0Var.getClass();
            String strG1 = dre0.g1(ijf0Var.a.b, mse0Var, null);
            if (strG1 != null) {
                wwd0Var3.setValue(new ose0.a(ijf0.b(ijf0Var, strG1, 0L, 6)));
                return;
            }
            return;
        }
        int i2 = 1;
        if (qve0Var.equals(qve0.a.a)) {
            B1(vue0.X0.O0);
            mse0 mse0Var2 = (mse0) v340Var2.a.getValue();
            wwd0Var3.getClass();
            mse0Var2.getClass();
            if (kotlin.text.b.h(((ose0) wwd0Var3.getValue()).getText()) == null) {
                dre0.i(wwd0Var3, dre0.H(String.valueOf(mse0Var2.a)));
                return;
            }
            String strG2 = dre0.g1(((ose0) wwd0Var3.getValue()).getText(), mse0Var2, new f6b0(mse0Var2, i2));
            if (strG2 != null) {
                dre0.i(wwd0Var3, strG2);
                return;
            }
            return;
        }
        if (qve0Var.equals(qve0.q.a)) {
            B1(vue0.X0.O0);
            mse0 mse0Var3 = (mse0) v340Var2.a.getValue();
            wwd0Var3.getClass();
            mse0Var3.getClass();
            String strG3 = dre0.g1(((ose0) wwd0Var3.getValue()).getText(), mse0Var3, new rtt(mse0Var3, 2));
            if (strG3 != null) {
                dre0.i(wwd0Var3, strG3);
                return;
            }
            return;
        }
        if (qve0Var.equals(qve0.m.a)) {
            B1(vue0.X0.O0);
            mse0 mse0Var4 = (mse0) v340Var2.a.getValue();
            wwd0Var3.getClass();
            mse0Var4.getClass();
            dre0.i(wwd0Var3, dre0.H(String.valueOf(mse0Var4.b)));
            return;
        }
        if (qve0Var.equals(qve0.o.a)) {
            B1(vue0.X0.O0);
            mse0 mse0Var5 = (mse0) v340Var2.a.getValue();
            wwd0Var3.getClass();
            mse0Var5.getClass();
            dre0.i(wwd0Var3, dre0.H(String.valueOf(mse0Var5.a)));
            return;
        }
        boolean zEquals2 = qve0Var.equals(qve0.b.a);
        wwd0 wwd0Var4 = this.F;
        if (zEquals2) {
            B1(vue0.X0.N0);
            kse0 kse0Var = ((q4l.c) wwd0Var2.getValue()).c.b;
            wwd0Var4.getClass();
            kse0Var.getClass();
            if (StringsKt.toIntOrNull(((ijf0) wwd0Var4.getValue()).a.b) == null) {
                xse0.m1(wwd0Var4, String.valueOf(kse0Var.b));
                return;
            }
            Integer intOrNull = StringsKt.toIntOrNull(((ijf0) wwd0Var4.getValue()).a.b);
            if ((intOrNull != null ? intOrNull.intValue() : 0) >= kse0Var.a) {
                xse0.m1(wwd0Var4, "∞");
                return;
            }
            String strM0 = xse0.m0(((ijf0) wwd0Var4.getValue()).a.b, kse0Var, new gp60(kse0Var, 1));
            if (strM0 != null) {
                xse0.m1(wwd0Var4, strM0);
                return;
            }
            return;
        }
        boolean z4 = qve0Var instanceof qve0.d;
        wwd0 wwd0Var5 = this.G;
        wwd0 wwd0Var6 = this.N;
        if (z4) {
            boolean z5 = this.U.a.getValue() instanceof wse0.d;
            wwd0 wwd0Var7 = this.L;
            if (z5) {
                Boolean bool = Boolean.TRUE;
                wwd0Var7.getClass();
                wwd0Var7.k(null, bool);
                return;
            }
            boolean z6 = ((qve0.d) qve0Var).a;
            if (z6) {
                B1(vue0.X0.R0);
            }
            if (!z6 || ((Boolean) this.P.a.getValue()).booleanValue()) {
                wwd0Var6.setValue(ove0.c.a);
                if (wwd0Var5.getValue() == h0f0.b) {
                    Boolean bool2 = Boolean.FALSE;
                    wwd0Var7.getClass();
                    wwd0Var7.k(null, bool2);
                }
                ej5.c(o8i0.d(this), null, null, new s(null), 3);
                return;
            }
            String str = ((p0f0) this.C.getValue()).b;
            Double dH = kotlin.text.b.h(((ose0) wwd0Var3.getValue()).getText());
            String strH = dre0.H(String.valueOf(dH != null ? dH.doubleValue() : 0.0d));
            int iOrdinal = ((h0f0) wwd0Var5.getValue()).ordinal();
            if (iOrdinal != 0) {
                if (iOrdinal != 1) {
                    uhc.a();
                    return;
                }
                if (Intrinsics.g(((ijf0) wwd0Var4.getValue()).a.b, "∞")) {
                    com.sportygames.newcms.b bVar = (com.sportygames.newcms.b) v340Var.a.getValue();
                    vue0Var = vue0.X0;
                    strA = bVar.a(vue0Var.N, str, strH);
                } else {
                    com.sportygames.newcms.b bVar2 = (com.sportygames.newcms.b) v340Var.a.getValue();
                    vue0 vue0Var2 = vue0.X0;
                    strA2 = bVar2.a(vue0Var2.M, ((ijf0) wwd0Var4.getValue()).a.b, str, strH);
                    vue0Var = vue0Var2;
                }
                ove0.a aVar = new ove0.a(strA2, ((com.sportygames.newcms.b) v340Var.a.getValue()).b(vue0Var.U, ""), ((com.sportygames.newcms.b) v340Var.a.getValue()).b(vue0Var.V, ""), qve0.g.a, new qve0.d(false));
                wwd0Var6.getClass();
                wwd0Var6.k(null, aVar);
                return;
            }
            com.sportygames.newcms.b bVar3 = (com.sportygames.newcms.b) v340Var.a.getValue();
            vue0Var = vue0.X0;
            strA = bVar3.a(vue0Var.L, str, strH);
            strA2 = strA;
            ove0.a aVar2 = new ove0.a(strA2, ((com.sportygames.newcms.b) v340Var.a.getValue()).b(vue0Var.U, ""), ((com.sportygames.newcms.b) v340Var.a.getValue()).b(vue0Var.V, ""), qve0.g.a, new qve0.d(false));
            wwd0Var6.getClass();
            wwd0Var6.k(null, aVar2);
            return;
        }
        if (qve0Var.equals(qve0.e.a)) {
            dre0.Z(wwd0Var3, (mse0) v340Var2.a.getValue());
            return;
        }
        boolean zEquals3 = qve0Var.equals(qve0.f.a);
        k5b k5bVar = this.c;
        if (zEquals3) {
            B1(vue0.X0.T0);
            ej5.c(o8i0.d(this), k5bVar, null, new t(null), 2);
            return;
        }
        if (qve0Var.equals(qve0.g.a)) {
            wwd0Var6.setValue(ove0.c.a);
            return;
        }
        if (qve0Var instanceof qve0.h) {
            zve0 zve0Var = this.a;
            zve0Var.getClass();
            String str2 = this.v;
            str2.getClass();
            kzh.d(new g1i(em50.a(zve0Var.e.a(str2)), new u(qve0Var, null)), o8i0.d(this));
            return;
        }
        boolean zEquals4 = qve0Var.equals(qve0.i.a);
        wwd0 wwd0Var8 = this.M;
        if (zEquals4) {
            Boolean bool3 = Boolean.FALSE;
            wwd0Var8.getClass();
            wwd0Var8.k(null, bool3);
            return;
        }
        if (qve0Var.equals(qve0.j.a)) {
            mse0 mse0Var6 = (mse0) v340Var2.a.getValue();
            wwd0Var3.getClass();
            mse0Var6.getClass();
            Double dH2 = kotlin.text.b.h(((ose0) wwd0Var3.getValue()).getText());
            double dDoubleValue = dH2 != null ? dH2.doubleValue() : 0.0d;
            double d2 = mse0Var6.a;
            if (dDoubleValue < d2) {
                dre0.i(wwd0Var3, String.valueOf(d2));
                return;
            }
            return;
        }
        if (qve0Var.equals(qve0.k.a)) {
            kse0 kse0Var2 = ((q4l.c) wwd0Var2.getValue()).c.b;
            wwd0Var4.getClass();
            kse0Var2.getClass();
            if (Intrinsics.g(((ijf0) wwd0Var4.getValue()).a.b, "∞")) {
                return;
            }
            Integer intOrNull2 = StringsKt.toIntOrNull(((ijf0) wwd0Var4.getValue()).a.b);
            int iIntValue = intOrNull2 != null ? intOrNull2.intValue() : 0;
            int i3 = kse0Var2.b;
            if (iIntValue < i3) {
                xse0.m1(wwd0Var4, String.valueOf(i3));
                return;
            }
            return;
        }
        if (qve0Var.equals(qve0.l.a)) {
            wwd0Var6.setValue(ove0.c.a);
            this.w = false;
            x1();
            return;
        }
        if (qve0Var.equals(qve0.n.a)) {
            B1(vue0.X0.N0);
            wwd0Var4.getClass();
            xse0.m1(wwd0Var4, "∞");
            return;
        }
        if (qve0Var.equals(qve0.p.a)) {
            B1(vue0.X0.N0);
            kse0 kse0Var3 = ((q4l.c) wwd0Var2.getValue()).c.b;
            wwd0Var4.getClass();
            kse0Var3.getClass();
            xse0.m1(wwd0Var4, String.valueOf(kse0Var3.b));
            return;
        }
        if (qve0Var.equals(qve0.r.a)) {
            B1(vue0.X0.N0);
            kse0 kse0Var4 = ((q4l.c) wwd0Var2.getValue()).c.b;
            wwd0Var4.getClass();
            kse0Var4.getClass();
            if (Intrinsics.g(((ijf0) wwd0Var4.getValue()).a.b, "∞")) {
                xse0.m1(wwd0Var4, String.valueOf(kse0Var4.a));
                return;
            }
            String strM1 = xse0.m0(((ijf0) wwd0Var4.getValue()).a.b, kse0Var4, new hp60(kse0Var4, 1));
            if (strM1 != null) {
                xse0.m1(wwd0Var4, strM1);
                return;
            }
            return;
        }
        if (qve0Var instanceof qve0.u) {
            ej5.c(o8i0.d(this), k5bVar, null, new v(qve0Var, null), 2);
            return;
        }
        if (qve0Var.equals(qve0.v.a)) {
            Boolean bool4 = Boolean.TRUE;
            wwd0Var8.getClass();
            wwd0Var8.k(null, bool4);
            return;
        }
        if (qve0Var instanceof qve0.x) {
            h0f0 h0f0Var = ((qve0.x) qve0Var).a;
            wwd0Var5.getClass();
            wwd0Var5.k(null, h0f0Var);
            return;
        }
        if (qve0Var instanceof qve0.a0) {
            ijf0 ijf0Var2 = ((qve0.a0) qve0Var).a;
            kse0 kse0Var5 = ((q4l.c) wwd0Var2.getValue()).c.b;
            wwd0Var4.getClass();
            kse0Var5.getClass();
            String strM2 = xse0.m0(ijf0Var2.a.b, kse0Var5, null);
            if (strM2 != null) {
                wwd0Var4.setValue(ijf0.b(ijf0Var2, strM2, 0L, 6));
                return;
            }
            return;
        }
        if (qve0Var instanceof qve0.b0) {
            qve0.b0 b0Var = (qve0.b0) qve0Var;
            ose0.b bVar4 = new ose0.b(dre0.H(String.valueOf(b0Var.b)), b0Var.a.getGiftId());
            wwd0Var3.getClass();
            wwd0Var3.k(null, bVar4);
            Boolean bool5 = Boolean.FALSE;
            wwd0Var8.getClass();
            wwd0Var8.k(null, bool5);
            return;
        }
        boolean zEquals5 = qve0Var.equals(qve0.c.a);
        wwd0 wwd0Var9 = this.D;
        if (zEquals5) {
            B1(vue0.X0.S0);
            xue0 xue0Var = (xue0) CollectionsKt.V(((xue0) wwd0Var9.getValue()).b + 1, ((q4l.c) wwd0Var2.getValue()).d);
            if (xue0Var != null) {
                wwd0Var9.getClass();
                wwd0Var9.k(null, xue0Var);
                return;
            }
            return;
        }
        if (qve0Var.equals(qve0.s.a)) {
            B1(vue0.X0.S0);
            xue0 xue0Var2 = (xue0) CollectionsKt.V(((xue0) wwd0Var9.getValue()).b - 1, ((q4l.c) wwd0Var2.getValue()).d);
            if (xue0Var2 != null) {
                wwd0Var9.getClass();
                wwd0Var9.k(null, xue0Var2);
                return;
            }
            return;
        }
        if (!qve0Var.equals(qve0.t.a)) {
            uhc.a();
            return;
        }
        try {
            zi50.a aVar3 = zi50.b;
            dm8 dm8Var = this.R;
            if (dm8Var != null) {
                dm8Var.R(Unit.a);
            }
        } catch (Throwable unused) {
            zi50.a aVar4 = zi50.b;
        }
    }
}
