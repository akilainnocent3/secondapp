package defpackage;

import androidx.recyclerview.widget.IUw.QWvyvNzGsBpRT;
import com.sportybet.plugin.realsports.search.widget.searchprematchpanel.SEfl.gvQvkPPtA;
import com.sportygames.newcms.CMSRes;
import com.sportygames.newcms.uitext.CMSUiText;
import com.sportygames.newcms.uitext.UiText;
import java.math.BigDecimal;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class uua0 extends j8i0 implements fb60, tc60 {
    public final wwd0 A;
    public final v340 B;
    public final v340 C;
    public final v340 D;
    public final wwd0 E;
    public final v340 F;
    public final wwd0 G;
    public final v340 H;
    public final wwd0 I;
    public final wwd0 J;
    public final v340 K;
    public final dw1 L;
    public final v340 M;
    public final wwd0 N;
    public final wwd0 O;
    public final wwd0 P;
    public final wwd0 Q;
    public final v340 R;
    public final wwd0 S;
    public final v340 T;
    public final wwd0 U;
    public final v340 V;
    public final wwd0 W;
    public final v340 X;
    public final v340 Y;
    public pjd Z;
    public final kd60 a;
    public jvd0 a0;
    public final ja60 b;
    public boolean b0;
    public final wd60 c;
    public dm8 c0;
    public final td60 d;
    public final en20 e;
    public final if60 f;
    public final k5b i;
    public final String v;
    public boolean w;
    public final tj10 y;
    public final wwd0 z;

    @c0d(c = "com.sportygames.speedybingo.presentation.SpeedyBingoViewModel$11", f = "SpeedyBingoViewModel.kt", l = {}, m = "invokeSuspend", v = 1)
    public static final class a extends tje0 implements Function2<Boolean, v1b<? super Unit>, Object> {
        public a(v1b<? super a> v1bVar) {
            super(2, v1bVar);
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            return uua0.this.new a(v1bVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Boolean bool, v1b<? super Unit> v1bVar) {
            Boolean bool2 = bool;
            bool2.booleanValue();
            return ((a) create(bool2, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            y5b y5bVar = y5b.a;
            uj50.b(obj);
            uua0 uua0Var = uua0.this;
            int i = 0;
            for (Integer num : ((xc60) uua0Var.W.getValue()).c) {
                int i2 = i + 1;
                if (i < 0) {
                    kotlin.collections.b.q();
                    throw null;
                }
                int iIntValue = num.intValue();
                dw1 dw1Var = uua0Var.L;
                ov1.c cVar = new ov1.c(iIntValue);
                dw1Var.getClass();
                ytw ytwVar = (ytw) CollectionsKt.V(i, dw1Var.b);
                if (ytwVar != null) {
                    ytwVar.setValue(cVar);
                }
                i = i2;
            }
            return Unit.a;
        }
    }

    @c0d(c = "com.sportygames.speedybingo.presentation.SpeedyBingoViewModel$handleEvent$10", f = "SpeedyBingoViewModel.kt", l = {708}, m = "invokeSuspend", v = 1)
    public static final class a0 extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ vc60 c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a0(vc60 vc60Var, v1b<? super a0> v1bVar) {
            super(2, v1bVar);
            this.c = vc60Var;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            return uua0.this.new a0(this.c, v1bVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
            return ((a0) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            y5b y5bVar = y5b.a;
            int i = this.a;
            if (i == 0) {
                uj50.b(obj);
                en20 en20Var = uua0.this.e;
                boolean z = !((vc60.x) this.c).a;
                this.a = 1;
                if (en20Var.a("speedy_bingo_turbo_mode", z, this) == y5bVar) {
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

    public static final class a1 implements lyh<xc60> {
        public final /* synthetic */ wwd0 a;

        public static final class a<T> implements myh {
            public final /* synthetic */ myh a;

            /* JADX INFO: renamed from: uua0$a1$a$a, reason: collision with other inner class name */
            @c0d(c = "com.sportygames.speedybingo.presentation.SpeedyBingoViewModel$special$$inlined$map$3$2", f = "SpeedyBingoViewModel.kt", l = {50}, m = "emit", v = 1)
            public static final class C1180a extends x1b {
                public /* synthetic */ Object a;
                public int b;

                public C1180a(v1b v1bVar) {
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
                C1180a c1180a;
                if (v1bVar instanceof C1180a) {
                    c1180a = (C1180a) v1bVar;
                    int i = c1180a.b;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        c1180a.b = i - Integer.MIN_VALUE;
                    } else {
                        c1180a = new C1180a(v1bVar);
                    }
                } else {
                    c1180a = new C1180a(v1bVar);
                }
                Object obj2 = c1180a.a;
                y5b y5bVar = y5b.a;
                int i2 = c1180a.b;
                xc60 xc60Var = null;
                if (i2 == 0) {
                    uj50.b(obj2);
                    mk50 mk50Var = (mk50) obj;
                    if (!(mk50Var instanceof mk50.a) && !Intrinsics.g(mk50Var, mk50.b.a)) {
                        if (!(mk50Var instanceof mk50.c)) {
                            uhc.a();
                            return null;
                        }
                        xc60Var = (xc60) ((mk50.c) mk50Var).a;
                    }
                    c1180a.b = 1;
                    if (this.a.emit(xc60Var, c1180a) == y5bVar) {
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

        public a1(wwd0 wwd0Var) {
            this.a = wwd0Var;
        }

        @Override // defpackage.lyh
        public final Object collect(myh<? super xc60> myhVar, v1b v1bVar) throws Throwable {
            this.a.collect(new a(myhVar), v1bVar);
            return y5b.a;
        }
    }

    @c0d(c = "com.sportygames.speedybingo.presentation.SpeedyBingoViewModel$12", f = "SpeedyBingoViewModel.kt", l = {439}, m = "invokeSuspend", v = 1)
    public static final class b extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public int a;
        public /* synthetic */ Object b;

        @c0d(c = "com.sportygames.speedybingo.presentation.SpeedyBingoViewModel$12$1", f = "SpeedyBingoViewModel.kt", l = {443, 447, 460, 462, 464, 469, 471, 474, 482, 484, 488, 490, 500, 502, 510, 511, 517, 524, 529, 534}, m = "invokeSuspend", v = 1)
        public static final class a extends tje0 implements Function2<tx60, v1b<? super Unit>, Object> {
            public int a;
            public /* synthetic */ Object b;
            public final /* synthetic */ uua0 c;
            public final /* synthetic */ v5b d;

            /* JADX INFO: renamed from: uua0$b$a$a, reason: collision with other inner class name */
            @c0d(c = "com.sportygames.speedybingo.presentation.SpeedyBingoViewModel$12$1$3", f = "SpeedyBingoViewModel.kt", l = {530}, m = "invokeSuspend", v = 1)
            public static final class C1181a extends tje0 implements Function2<v5b, v1b<? super goh0>, Object> {
                public int a;
                public final /* synthetic */ uua0 b;

                /* JADX INFO: renamed from: uua0$b$a$a$a, reason: collision with other inner class name */
                @c0d(c = "com.sportygames.speedybingo.presentation.SpeedyBingoViewModel$12$1$3$1", f = "SpeedyBingoViewModel.kt", l = {}, m = "invokeSuspend", v = 1)
                public static final class C1182a extends tje0 implements Function2<goh0, v1b<? super Boolean>, Object> {
                    public /* synthetic */ Object a;

                    @Override // defpackage.pz1
                    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
                        C1182a c1182a = new C1182a(2, v1bVar);
                        c1182a.a = obj;
                        return c1182a;
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(goh0 goh0Var, v1b<? super Boolean> v1bVar) {
                        return ((C1182a) create(goh0Var, v1bVar)).invokeSuspend(Unit.a);
                    }

                    @Override // defpackage.pz1
                    public final Object invokeSuspend(Object obj) {
                        goh0 goh0Var = (goh0) this.a;
                        y5b y5bVar = y5b.a;
                        uj50.b(obj);
                        return Boolean.valueOf(!v760.a(goh0Var));
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C1181a(uua0 uua0Var, v1b<? super C1181a> v1bVar) {
                    super(2, v1bVar);
                    this.b = uua0Var;
                }

                @Override // defpackage.pz1
                public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
                    return new C1181a(this.b, v1bVar);
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(v5b v5bVar, v1b<? super goh0> v1bVar) {
                    return ((C1181a) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
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
                    wwd0 wwd0Var = this.b.S;
                    C1182a c1182a = new C1182a(2, null);
                    this.a = 1;
                    Object objB = s0i.b(wwd0Var, c1182a, this);
                    return objB == y5bVar ? y5bVar : objB;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(uua0 uua0Var, v5b v5bVar, v1b<? super a> v1bVar) {
                super(2, v1bVar);
                this.c = uua0Var;
                this.d = v5bVar;
            }

            @Override // defpackage.pz1
            public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
                a aVar = new a(this.c, this.d, v1bVar);
                aVar.b = obj;
                return aVar;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(tx60 tx60Var, v1b<? super Unit> v1bVar) {
                return ((a) create(tx60Var, v1bVar)).invokeSuspend(Unit.a);
            }

            /* JADX WARN: Code duplicated, block: B:100:0x0298  */
            /* JADX WARN: Code duplicated, block: B:101:0x02a0  */
            /* JADX WARN: Code duplicated, block: B:104:0x02a6  */
            /* JADX WARN: Code duplicated, block: B:107:0x02b5  */
            /* JADX WARN: Code duplicated, block: B:122:0x0326  */
            /* JADX WARN: Code duplicated, block: B:123:0x032e  */
            /* JADX WARN: Code duplicated, block: B:148:0x03a4  */
            /* JADX WARN: Code duplicated, block: B:150:0x03b0  */
            /* JADX WARN: Code duplicated, block: B:152:0x03b9  */
            /* JADX WARN: Code duplicated, block: B:169:0x0417  */
            /* JADX WARN: Code duplicated, block: B:171:0x0426  */
            /* JADX WARN: Code duplicated, block: B:176:0x044a  */
            /* JADX WARN: Code duplicated, block: B:179:0x0458 A[LOOP:0: B:179:0x0458->B:192:?, LOOP_START] */
            /* JADX WARN: Code duplicated, block: B:182:0x0472  */
            /* JADX WARN: Code duplicated, block: B:184:0x047a  */
            /* JADX WARN: Code duplicated, block: B:187:0x0480  */
            /* JADX WARN: Code duplicated, block: B:30:0x00a9  */
            /* JADX WARN: Code duplicated, block: B:33:0x00be  */
            /* JADX WARN: Code duplicated, block: B:44:0x0102  */
            /* JADX WARN: Code duplicated, block: B:45:0x0104  */
            /* JADX WARN: Code duplicated, block: B:50:0x0122 A[PHI: r14
              0x0122: PHI (r14v15 java.lang.Object) = (r14v11 java.lang.Object), (r14v0 java.lang.Object) binds: [B:48:0x011e, B:15:0x0059] A[DONT_GENERATE, DONT_INLINE]] */
            /* JADX WARN: Code duplicated, block: B:53:0x0174  */
            /* JADX WARN: Code duplicated, block: B:56:0x017a  */
            /* JADX WARN: Code duplicated, block: B:58:0x019a  */
            /* JADX WARN: Code duplicated, block: B:59:0x01a2  */
            /* JADX WARN: Code duplicated, block: B:62:0x01a8  */
            /* JADX WARN: Code duplicated, block: B:74:0x01e6  */
            /* JADX WARN: Code duplicated, block: B:77:0x0200  */
            /* JADX WARN: Code duplicated, block: B:80:0x0218  */
            /* JADX WARN: Code duplicated, block: B:82:0x0224  */
            /* JADX WARN: Code duplicated, block: B:83:0x022c  */
            /* JADX WARN: Code duplicated, block: B:86:0x0245  */
            /* JADX WARN: Code duplicated, block: B:88:0x024f  */
            /* JADX WARN: Code duplicated, block: B:91:0x025e  */
            /* JADX WARN: Code duplicated, block: B:94:0x026d  */
            /* JADX WARN: Code duplicated, block: B:96:0x0275  */
            /* JADX WARN: Code duplicated, block: B:98:0x0283  */
            /* JADX WARN: Code restructure failed: missing block: B:102:0x02a2, code lost:
            
                if (r0 == r1) goto L178;
             */
            /* JADX WARN: Code restructure failed: missing block: B:105:0x02b1, code lost:
            
                if (defpackage.ux60.d(r9, r24) == r1) goto L178;
             */
            /* JADX WARN: Code restructure failed: missing block: B:124:0x0330, code lost:
            
                if (r0 == r1) goto L178;
             */
            /* JADX WARN: Code restructure failed: missing block: B:142:0x0390, code lost:
            
                if (r4 == r1) goto L178;
             */
            /* JADX WARN: Code restructure failed: missing block: B:154:0x03cb, code lost:
            
                if (defpackage.ux60.d(r9, r24) == r1) goto L178;
             */
            /* JADX WARN: Code restructure failed: missing block: B:177:0x0455, code lost:
            
                if (defpackage.ux60.a(r9, r24) == r1) goto L178;
             */
            /* JADX WARN: Code restructure failed: missing block: B:21:0x0085, code lost:
            
                if (kotlin.Unit.a == r1) goto L178;
             */
            /* JADX WARN: Code restructure failed: missing block: B:60:0x01a4, code lost:
            
                if (r0 == r1) goto L178;
             */
            /* JADX WARN: Code restructure failed: missing block: B:89:0x025a, code lost:
            
                if (defpackage.ux60.b(r9, r24) == r1) goto L178;
             */
            /* JADX WARN: Code restructure failed: missing block: B:92:0x0269, code lost:
            
                if (defpackage.ux60.d(r9, r24) == r1) goto L178;
             */
            @Override // defpackage.pz1
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object invokeSuspend(java.lang.Object r25) {
                /*
                    Method dump skipped, instruction units count: 1210
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: uua0.b.a.invokeSuspend(java.lang.Object):java.lang.Object");
            }
        }

        public b(v1b<? super b> v1bVar) {
            super(2, v1bVar);
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            b bVar = uua0.this.new b(v1bVar);
            bVar.b = obj;
            return bVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
            return ((b) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            v5b v5bVar = (v5b) this.b;
            y5b y5bVar = y5b.a;
            int i = this.a;
            if (i == 0) {
                uj50.b(obj);
                uua0 uua0Var = uua0.this;
                wwd0 wwd0Var = uua0Var.A;
                a aVar = new a(uua0Var, v5bVar, null);
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

    @c0d(c = "com.sportygames.speedybingo.presentation.SpeedyBingoViewModel$handleEvent$15", f = "SpeedyBingoViewModel.kt", l = {768, 769}, m = "invokeSuspend", v = 1)
    public static final class b0 extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public int a;

        public b0(v1b<? super b0> v1bVar) {
            super(2, v1bVar);
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            return uua0.this.new b0(v1bVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
            return ((b0) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x0036, code lost:
        
            if (defpackage.ux60.a(r6, r5) == r0) goto L15;
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
                uua0 r2 = defpackage.uua0.this
                r3 = 2
                r4 = 1
                if (r1 == 0) goto L1d
                if (r1 == r4) goto L19
                if (r1 != r3) goto L12
                defpackage.uj50.b(r6)
                goto L39
            L12:
                java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
                defpackage.ib5.a(r5)
                r5 = 0
                return r5
            L19:
                defpackage.uj50.b(r6)
                goto L2e
            L1d:
                defpackage.uj50.b(r6)
                wwd0 r6 = r2.z
                rc60$c r1 = rc60.c.a
                r5.a = r4
                r6.setValue(r1)
                kotlin.Unit r6 = kotlin.Unit.a
                if (r6 != r0) goto L2e
                goto L38
            L2e:
                wwd0 r6 = r2.A
                r5.a = r3
                java.lang.Object r5 = defpackage.ux60.a(r6, r5)
                if (r5 != r0) goto L39
            L38:
                return r0
            L39:
                kotlin.Unit r5 = kotlin.Unit.a
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: uua0.b0.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public static final class b1 implements lyh<qe60.c> {
        public final /* synthetic */ wwd0 a;

        public static final class a<T> implements myh {
            public final /* synthetic */ myh a;

            /* JADX INFO: renamed from: uua0$b1$a$a, reason: collision with other inner class name */
            @c0d(c = "com.sportygames.speedybingo.presentation.SpeedyBingoViewModel$special$$inlined$map$4$2", f = "SpeedyBingoViewModel.kt", l = {50}, m = "emit", v = 1)
            public static final class C1183a extends x1b {
                public /* synthetic */ Object a;
                public int b;

                public C1183a(v1b v1bVar) {
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
                C1183a c1183a;
                if (v1bVar instanceof C1183a) {
                    c1183a = (C1183a) v1bVar;
                    int i = c1183a.b;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        c1183a.b = i - Integer.MIN_VALUE;
                    } else {
                        c1183a = new C1183a(v1bVar);
                    }
                } else {
                    c1183a = new C1183a(v1bVar);
                }
                Object obj2 = c1183a.a;
                y5b y5bVar = y5b.a;
                int i2 = c1183a.b;
                qe60.c cVar = null;
                if (i2 == 0) {
                    uj50.b(obj2);
                    qe60 qe60Var = (qe60) obj;
                    if (!(qe60Var instanceof qe60.b) && !(qe60Var instanceof qe60.a)) {
                        if (!(qe60Var instanceof qe60.c)) {
                            uhc.a();
                            return null;
                        }
                        cVar = (qe60.c) qe60Var;
                    }
                    c1183a.b = 1;
                    if (this.a.emit(cVar, c1183a) == y5bVar) {
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

        public b1(wwd0 wwd0Var) {
            this.a = wwd0Var;
        }

        @Override // defpackage.lyh
        public final Object collect(myh<? super qe60.c> myhVar, v1b v1bVar) throws Throwable {
            this.a.collect(new a(myhVar), v1bVar);
            return y5b.a;
        }
    }

    @c0d(c = "com.sportygames.speedybingo.presentation.SpeedyBingoViewModel$1", f = "SpeedyBingoViewModel.kt", l = {}, m = "invokeSuspend", v = 1)
    public static final class c extends tje0 implements Function2<fg60, v1b<? super Unit>, Object> {
        public /* synthetic */ Object a;

        public c(v1b<? super c> v1bVar) {
            super(2, v1bVar);
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            c cVar = uua0.this.new c(v1bVar);
            cVar.a = obj;
            return cVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(fg60 fg60Var, v1b<? super Unit> v1bVar) {
            return ((c) create(fg60Var, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            fg60 fg60Var = (fg60) this.a;
            y5b y5bVar = y5b.a;
            uj50.b(obj);
            ((x5a0) uua0.this.L.f).setValue(fg60Var);
            return Unit.a;
        }
    }

    @c0d(c = "com.sportygames.speedybingo.presentation.SpeedyBingoViewModel$handleEvent$16", f = "SpeedyBingoViewModel.kt", l = {779, 780}, m = "invokeSuspend", v = 1)
    public static final class c0 extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ vc60 c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c0(vc60 vc60Var, v1b<? super c0> v1bVar) {
            super(2, v1bVar);
            this.c = vc60Var;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            return uua0.this.new c0(this.c, v1bVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
            return ((c0) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
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
                uua0 r2 = defpackage.uua0.this
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
                vc60 r1 = r5.c
                vc60$l r1 = (vc60.l) r1
                boolean r1 = r1.a
                r5.a = r4
                java.lang.String r4 = "speedy_bingo_one_tap_bet"
                java.lang.Object r6 = r6.a(r4, r1, r5)
                if (r6 != r0) goto L33
                goto L40
            L33:
                wwd0 r6 = r2.z
                rc60$c r1 = rc60.c.a
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
            throw new UnsupportedOperationException("Method not decompiled: uua0.c0.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public static final class c1 implements lyh<com.sportygames.newcms.b> {
        public final /* synthetic */ v340 a;

        public static final class a<T> implements myh {
            public final /* synthetic */ myh a;

            /* JADX INFO: renamed from: uua0$c1$a$a, reason: collision with other inner class name */
            @c0d(c = "com.sportygames.speedybingo.presentation.SpeedyBingoViewModel$special$$inlined$map$5$2", f = "SpeedyBingoViewModel.kt", l = {50}, m = "emit", v = 1)
            public static final class C1184a extends x1b {
                public /* synthetic */ Object a;
                public int b;

                public C1184a(v1b v1bVar) {
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
                C1184a c1184a;
                if (v1bVar instanceof C1184a) {
                    c1184a = (C1184a) v1bVar;
                    int i = c1184a.b;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        c1184a.b = i - Integer.MIN_VALUE;
                    } else {
                        c1184a = new C1184a(v1bVar);
                    }
                } else {
                    c1184a = new C1184a(v1bVar);
                }
                Object obj2 = c1184a.a;
                y5b y5bVar = y5b.a;
                int i2 = c1184a.b;
                if (i2 == 0) {
                    uj50.b(obj2);
                    com.sportygames.newcms.b bVar = ((qe60.c) obj).a;
                    c1184a.b = 1;
                    if (this.a.emit(bVar, c1184a) == y5bVar) {
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

        public c1(v340 v340Var) {
            this.a = v340Var;
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        @Override // defpackage.lyh
        public final Object collect(myh<? super com.sportygames.newcms.b> myhVar, v1b v1bVar) {
            Object objCollect = this.a.a.collect(new a(myhVar), (v1b<? super Unit>) v1bVar);
            return objCollect == y5b.a ? objCollect : Unit.a;
        }
    }

    @c0d(c = "com.sportygames.speedybingo.presentation.SpeedyBingoViewModel$4", f = "SpeedyBingoViewModel.kt", l = {388}, m = "invokeSuspend", v = 1)
    public static final class d extends tje0 implements Function2<Boolean, v1b<? super Unit>, Object> {
        public int a;

        public d(v1b<? super d> v1bVar) {
            super(2, v1bVar);
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            return uua0.this.new d(v1bVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Boolean bool, v1b<? super Unit> v1bVar) {
            Boolean bool2 = bool;
            bool2.booleanValue();
            return ((d) create(bool2, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            y5b y5bVar = y5b.a;
            int i = this.a;
            uua0 uua0Var = uua0.this;
            if (i == 0) {
                uj50.b(obj);
                if (!((Boolean) uua0Var.B.a.getValue()).booleanValue() && !uua0Var.b0) {
                    wwd0 wwd0Var = uua0Var.z;
                    ma60 ma60Var = ma60.B0;
                    tbd tbdVar = ma60Var.e;
                    tbd tbdVar2 = ma60Var.e;
                    rc60.a aVar = new rc60.a(new CMSUiText(tbdVar.n), new CMSUiText(tbdVar2.m), new CMSUiText(tbdVar2.l), new vc60.l(false), new vc60.l(true));
                    this.a = 1;
                    wwd0Var.getClass();
                    wwd0Var.k(null, aVar);
                    if (Unit.a == y5bVar) {
                        return y5bVar;
                    }
                }
            } else {
                if (i != 1) {
                    ib5.a("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                uj50.b(obj);
            }
            uua0Var.b0 = true;
            return Unit.a;
        }
    }

    @c0d(c = "com.sportygames.speedybingo.presentation.SpeedyBingoViewModel$handleEvent$18", f = "SpeedyBingoViewModel.kt", l = {}, m = "invokeSuspend", v = 1)
    public static final class d0 extends tje0 implements gaj<myh<? super hg60>, Throwable, v1b<? super Unit>, Object> {
        @Override // defpackage.gaj
        public final Object invoke(myh<? super hg60> myhVar, Throwable th, v1b<? super Unit> v1bVar) {
            return new d0(3, v1bVar).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            y5b y5bVar = y5b.a;
            uj50.b(obj);
            return Unit.a;
        }
    }

    public static final class d1 implements lyh<Boolean> {
        public final /* synthetic */ v340 a;

        public static final class a<T> implements myh {
            public final /* synthetic */ myh a;

            /* JADX INFO: renamed from: uua0$d1$a$a, reason: collision with other inner class name */
            @c0d(c = "com.sportygames.speedybingo.presentation.SpeedyBingoViewModel$special$$inlined$map$6$2", f = "SpeedyBingoViewModel.kt", l = {50}, m = "emit", v = 1)
            public static final class C1185a extends x1b {
                public /* synthetic */ Object a;
                public int b;

                public C1185a(v1b v1bVar) {
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
                C1185a c1185a;
                if (v1bVar instanceof C1185a) {
                    c1185a = (C1185a) v1bVar;
                    int i = c1185a.b;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        c1185a.b = i - Integer.MIN_VALUE;
                    } else {
                        c1185a = new C1185a(v1bVar);
                    }
                } else {
                    c1185a = new C1185a(v1bVar);
                }
                Object obj2 = c1185a.a;
                y5b y5bVar = y5b.a;
                int i2 = c1185a.b;
                if (i2 == 0) {
                    uj50.b(obj2);
                    Boolean boolValueOf = Boolean.valueOf(((se60) obj) instanceof se60.b);
                    c1185a.b = 1;
                    if (this.a.emit(boolValueOf, c1185a) == y5bVar) {
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

        public d1(v340 v340Var) {
            this.a = v340Var;
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        @Override // defpackage.lyh
        public final Object collect(myh<? super Boolean> myhVar, v1b v1bVar) {
            Object objCollect = this.a.a.collect(new a(myhVar), (v1b<? super Unit>) v1bVar);
            return objCollect == y5b.a ? objCollect : Unit.a;
        }
    }

    @c0d(c = "com.sportygames.speedybingo.presentation.SpeedyBingoViewModel$5", f = "SpeedyBingoViewModel.kt", l = {402, 403}, m = "invokeSuspend", v = 1)
    public static final class e extends tje0 implements Function2<qe60.c, v1b<? super Unit>, Object> {
        public int a;
        public /* synthetic */ Object b;

        public e(v1b<? super e> v1bVar) {
            super(2, v1bVar);
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            e eVar = uua0.this.new e(v1bVar);
            eVar.b = obj;
            return eVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(qe60.c cVar, v1b<? super Unit> v1bVar) {
            return ((e) create(cVar, v1bVar)).invokeSuspend(Unit.a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x004b, code lost:
        
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
                qe60$c r0 = (qe60.c) r0
                y5b r1 = defpackage.y5b.a
                int r2 = r8.a
                r3 = 0
                uua0 r4 = defpackage.uua0.this
                r5 = 2
                r6 = 1
                if (r2 == 0) goto L21
                if (r2 == r6) goto L1d
                if (r2 != r5) goto L17
                defpackage.uj50.b(r9)
                goto L4e
            L17:
                java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
                defpackage.ib5.a(r8)
                return r3
            L1d:
                defpackage.uj50.b(r9)
                goto L3e
            L21:
                defpackage.uj50.b(r9)
                wwd0 r9 = r4.E
                d860$a r2 = new d860$a
                e860 r7 = r0.b
                java.math.BigDecimal r7 = r7.d
                r2.<init>(r7)
                r8.b = r0
                r8.a = r6
                r9.getClass()
                r9.k(r3, r2)
                kotlin.Unit r9 = kotlin.Unit.a
                if (r9 != r1) goto L3e
                goto L4d
            L3e:
                wwd0 r9 = r4.I
                hg60 r0 = r0.f
                r8.b = r3
                r8.a = r5
                r9.setValue(r0)
                kotlin.Unit r8 = kotlin.Unit.a
                if (r8 != r1) goto L4e
            L4d:
                return r1
            L4e:
                kotlin.Unit r8 = kotlin.Unit.a
                return r8
            */
            throw new UnsupportedOperationException("Method not decompiled: uua0.e.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @c0d(c = "com.sportygames.speedybingo.presentation.SpeedyBingoViewModel$handleEvent$19", f = "SpeedyBingoViewModel.kt", l = {801}, m = "invokeSuspend", v = 1)
    public static final class e0 extends tje0 implements Function2<hg60, v1b<? super Unit>, Object> {
        public int a;
        public /* synthetic */ Object b;

        public e0(v1b<? super e0> v1bVar) {
            super(2, v1bVar);
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            e0 e0Var = uua0.this.new e0(v1bVar);
            e0Var.b = obj;
            return e0Var;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(hg60 hg60Var, v1b<? super Unit> v1bVar) {
            return ((e0) create(hg60Var, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            hg60 hg60Var = (hg60) this.b;
            y5b y5bVar = y5b.a;
            int i = this.a;
            if (i == 0) {
                uj50.b(obj);
                wwd0 wwd0Var = uua0.this.I;
                this.b = null;
                this.a = 1;
                wwd0Var.setValue(hg60Var);
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

    @c0d(c = "com.sportygames.speedybingo.presentation.SpeedyBingoViewModel$uiState$1", f = "SpeedyBingoViewModel.kt", l = {}, m = "invokeSuspend", v = 1)
    public static final class e1 extends tje0 implements gaj<se60, rc60, v1b<? super eg60>, Object> {
        public /* synthetic */ se60 a;
        public /* synthetic */ rc60 b;

        @Override // defpackage.gaj
        public final Object invoke(se60 se60Var, rc60 rc60Var, v1b<? super eg60> v1bVar) {
            e1 e1Var = new e1(3, v1bVar);
            e1Var.a = se60Var;
            e1Var.b = rc60Var;
            return e1Var.invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            se60 se60Var = this.a;
            rc60 rc60Var = this.b;
            y5b y5bVar = y5b.a;
            uj50.b(obj);
            return new eg60(se60Var, rc60Var);
        }
    }

    @c0d(c = "com.sportygames.speedybingo.presentation.SpeedyBingoViewModel$6", f = "SpeedyBingoViewModel.kt", l = {}, m = "invokeSuspend", v = 1)
    public static final class f extends tje0 implements Function2<Boolean, v1b<? super Unit>, Object> {
        public /* synthetic */ boolean a;

        public f(v1b<? super f> v1bVar) {
            super(2, v1bVar);
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            f fVar = uua0.this.new f(v1bVar);
            fVar.a = ((Boolean) obj).booleanValue();
            return fVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Boolean bool, v1b<? super Unit> v1bVar) {
            Boolean bool2 = bool;
            bool2.booleanValue();
            return ((f) create(bool2, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            boolean z = this.a;
            y5b y5bVar = y5b.a;
            uj50.b(obj);
            ((x5a0) uua0.this.L.c).setValue(Boolean.valueOf(z));
            return Unit.a;
        }
    }

    @c0d(c = "com.sportygames.speedybingo.presentation.SpeedyBingoViewModel$handleEvent$1", f = "SpeedyBingoViewModel.kt", l = {640, 641}, m = "invokeSuspend", v = 1)
    public static final class f0 extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ vc60 c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f0(vc60 vc60Var, v1b<? super f0> v1bVar) {
            super(2, v1bVar);
            this.c = vc60Var;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            return uua0.this.new f0(this.c, v1bVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
            return ((f0) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x0044, code lost:
        
            if (defpackage.ux60.c(r7, r6) == r0) goto L15;
         */
        @Override // defpackage.pz1
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r7) {
            /*
                r6 = this;
                y5b r0 = defpackage.y5b.a
                int r1 = r6.a
                r2 = 0
                r3 = 2
                r4 = 1
                uua0 r5 = defpackage.uua0.this
                if (r1 == 0) goto L1d
                if (r1 == r4) goto L19
                if (r1 != r3) goto L13
                defpackage.uj50.b(r7)
                goto L47
            L13:
                java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                defpackage.ib5.a(r6)
                return r2
            L19:
                defpackage.uj50.b(r7)
                goto L3c
            L1d:
                defpackage.uj50.b(r7)
                wwd0 r7 = r5.z
                rc60$c r1 = rc60.c.a
                r7.setValue(r1)
                wwd0 r7 = r5.E
                vc60 r1 = r6.c
                vc60$w r1 = (vc60.w) r1
                d860 r1 = r1.a
                r6.a = r4
                r7.getClass()
                r7.k(r2, r1)
                kotlin.Unit r7 = kotlin.Unit.a
                if (r7 != r0) goto L3c
                goto L46
            L3c:
                wwd0 r7 = r5.A
                r6.a = r3
                java.lang.Object r6 = defpackage.ux60.c(r7, r6)
                if (r6 != r0) goto L47
            L46:
                return r0
            L47:
                kotlin.Unit r6 = kotlin.Unit.a
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: uua0.f0.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @c0d(c = "com.sportygames.speedybingo.presentation.SpeedyBingoViewModel$7", f = "SpeedyBingoViewModel.kt", l = {413}, m = "invokeSuspend", v = 1)
    public static final class g extends tje0 implements Function2<r760, v1b<? super Unit>, Object> {
        public int a;
        public /* synthetic */ Object b;

        public g(v1b<? super g> v1bVar) {
            super(2, v1bVar);
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            g gVar = uua0.this.new g(v1bVar);
            gVar.b = obj;
            return gVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(r760 r760Var, v1b<? super Unit> v1bVar) {
            return ((g) create(r760Var, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            wwd0 wwd0Var = uua0.this.z;
            r760 r760Var = (r760) this.b;
            y5b y5bVar = y5b.a;
            int i = this.a;
            if (i == 0) {
                uj50.b(obj);
                if (wwd0Var.getValue() instanceof r760) {
                    this.b = null;
                    this.a = 1;
                    wwd0Var.setValue(r760Var);
                    if (Unit.a == y5bVar) {
                        return y5bVar;
                    }
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

    @c0d(c = "com.sportygames.speedybingo.presentation.SpeedyBingoViewModel$handleEvent$2", f = "SpeedyBingoViewModel.kt", l = {656}, m = "invokeSuspend", v = 1)
    public static final class g0 extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public int a;

        public g0(v1b<? super g0> v1bVar) {
            super(2, v1bVar);
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            return uua0.this.new g0(v1bVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
            return ((g0) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            y5b y5bVar = y5b.a;
            int i = this.a;
            if (i == 0) {
                uj50.b(obj);
                wwd0 wwd0Var = uua0.this.A;
                this.a = 1;
                if (ux60.a(wwd0Var, this) == y5bVar) {
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

    @c0d(c = "com.sportygames.speedybingo.presentation.SpeedyBingoViewModel$8", f = "SpeedyBingoViewModel.kt", l = {422}, m = "invokeSuspend", v = 1)
    public static final class h extends tje0 implements gaj<Integer, d860, v1b<? super Unit>, Object> {
        public int a;
        public /* synthetic */ int b;
        public /* synthetic */ d860 c;

        public h(v1b<? super h> v1bVar) {
            super(3, v1bVar);
        }

        @Override // defpackage.gaj
        public final Object invoke(Integer num, d860 d860Var, v1b<? super Unit> v1bVar) {
            int iIntValue = num.intValue();
            h hVar = uua0.this.new h(v1bVar);
            hVar.b = iIntValue;
            hVar.c = d860Var;
            return hVar.invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            int i = this.b;
            d860 d860Var = this.c;
            y5b y5bVar = y5b.a;
            int i2 = this.a;
            if (i2 == 0) {
                uj50.b(obj);
                if (!(d860Var instanceof d860.a)) {
                    if (!(d860Var instanceof d860.b)) {
                        uhc.a();
                        return null;
                    }
                    if (i != 1) {
                        uua0 uua0Var = uua0.this;
                        wwd0 wwd0Var = uua0Var.E;
                        d860.a aVar = new d860.a(((qe60.c) uua0Var.R.a.getValue()).b.d);
                        this.c = null;
                        this.b = i;
                        this.a = 1;
                        wwd0Var.getClass();
                        wwd0Var.k(null, aVar);
                        if (Unit.a == y5bVar) {
                            return y5bVar;
                        }
                    }
                }
            } else {
                if (i2 != 1) {
                    ib5.a("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                uj50.b(obj);
            }
            return Unit.a;
        }
    }

    @c0d(c = "com.sportygames.speedybingo.presentation.SpeedyBingoViewModel$handleEvent$3", f = "SpeedyBingoViewModel.kt", l = {662}, m = "invokeSuspend", v = 1)
    public static final class h0 extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public int a;

        public h0(v1b<? super h0> v1bVar) {
            super(2, v1bVar);
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            return uua0.this.new h0(v1bVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
            return ((h0) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            y5b y5bVar = y5b.a;
            int i = this.a;
            if (i == 0) {
                uj50.b(obj);
                wwd0 wwd0Var = uua0.this.A;
                this.a = 1;
                if (ux60.b(wwd0Var, this) == y5bVar) {
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

    @c0d(c = "com.sportygames.speedybingo.presentation.SpeedyBingoViewModel$9", f = "SpeedyBingoViewModel.kt", l = {}, m = "invokeSuspend", v = 1)
    public static final class i extends tje0 implements Function2<Boolean, v1b<? super Unit>, Object> {
        public /* synthetic */ boolean a;

        public i(v1b<? super i> v1bVar) {
            super(2, v1bVar);
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            i iVar = uua0.this.new i(v1bVar);
            iVar.a = ((Boolean) obj).booleanValue();
            return iVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Boolean bool, v1b<? super Unit> v1bVar) {
            Boolean bool2 = bool;
            bool2.booleanValue();
            return ((i) create(bool2, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            boolean z = this.a;
            y5b y5bVar = y5b.a;
            uj50.b(obj);
            ((x5a0) uua0.this.L.e).setValue(Boolean.valueOf(z));
            return Unit.a;
        }
    }

    @c0d(c = "com.sportygames.speedybingo.presentation.SpeedyBingoViewModel$handleEvent$4", f = "SpeedyBingoViewModel.kt", l = {667}, m = "invokeSuspend", v = 1)
    public static final class i0 extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public int a;

        public i0(v1b<? super i0> v1bVar) {
            super(2, v1bVar);
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            return uua0.this.new i0(v1bVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
            return ((i0) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            y5b y5bVar = y5b.a;
            int i = this.a;
            if (i == 0) {
                uj50.b(obj);
                wwd0 wwd0Var = uua0.this.A;
                this.a = 1;
                if (ux60.d(wwd0Var, this) == y5bVar) {
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

    @c0d(c = "com.sportygames.speedybingo.presentation.SpeedyBingoViewModel$handleEvent$5", f = "SpeedyBingoViewModel.kt", l = {}, m = "invokeSuspend", v = 1)
    public static final class j0 extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public j0(v1b<? super j0> v1bVar) {
            super(2, v1bVar);
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            return uua0.this.new j0(v1bVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
            return ((j0) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            y5b y5bVar = y5b.a;
            uj50.b(obj);
            dm8 dm8Var = uua0.this.c0;
            if (dm8Var != null) {
                dm8Var.R(Unit.a);
            }
            return Unit.a;
        }
    }

    @c0d(c = "com.sportygames.speedybingo.presentation.SpeedyBingoViewModel$animationPeriodConfig$1", f = "SpeedyBingoViewModel.kt", l = {}, m = "invokeSuspend", v = 1)
    public static final class k extends tje0 implements gaj<tx60, Boolean, v1b<? super fg60>, Object> {
        public /* synthetic */ tx60 a;
        public /* synthetic */ boolean b;

        @Override // defpackage.gaj
        public final Object invoke(tx60 tx60Var, Boolean bool, v1b<? super fg60> v1bVar) {
            boolean zBooleanValue = bool.booleanValue();
            k kVar = new k(3, v1bVar);
            kVar.a = tx60Var;
            kVar.b = zBooleanValue;
            return kVar.invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            tx60 tx60Var = this.a;
            boolean z = this.b;
            y5b y5bVar = y5b.a;
            uj50.b(obj);
            if (Intrinsics.g(tx60Var, tx60.b.a) || Intrinsics.g(tx60Var, tx60.f.a)) {
                return null;
            }
            return z ? fg60.Turbo : fg60.Normal;
        }
    }

    @c0d(c = "com.sportygames.speedybingo.presentation.SpeedyBingoViewModel$handleEvent$6", f = "SpeedyBingoViewModel.kt", l = {677}, m = "invokeSuspend", v = 1)
    public static final class k0 extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public int a;

        public k0(v1b<? super k0> v1bVar) {
            super(2, v1bVar);
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            return uua0.this.new k0(v1bVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
            return ((k0) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            y5b y5bVar = y5b.a;
            int i = this.a;
            if (i == 0) {
                uj50.b(obj);
                wwd0 wwd0Var = uua0.this.A;
                this.a = 1;
                if (ux60.c(wwd0Var, this) == y5bVar) {
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

    @c0d(c = "com.sportygames.speedybingo.presentation.SpeedyBingoViewModel$autoSpinDialogState$1", f = "SpeedyBingoViewModel.kt", l = {}, m = "invokeSuspend", v = 1)
    public static final class l extends tje0 implements gaj<qe60.c, goh0, v1b<? super r760>, Object> {
        public /* synthetic */ qe60.c a;
        public /* synthetic */ goh0 b;

        @Override // defpackage.gaj
        public final Object invoke(qe60.c cVar, goh0 goh0Var, v1b<? super r760> v1bVar) {
            l lVar = new l(3, v1bVar);
            lVar.a = cVar;
            lVar.b = goh0Var;
            return lVar.invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            qe60.c cVar = this.a;
            goh0 goh0Var = this.b;
            y5b y5bVar = y5b.a;
            uj50.b(obj);
            qcn<Integer> qcnVar = cVar.c.e;
            ArrayList arrayList = new ArrayList(l48.r(qcnVar, 10));
            Iterator<Integer> it = qcnVar.iterator();
            while (it.hasNext()) {
                arrayList.add(new t760.c(it.next().intValue()));
            }
            return new r760(a4h.f(CollectionsKt.j0(arrayList, t760.a.a)), goh0Var);
        }
    }

    /* JADX INFO: loaded from: classes2.dex */
    @c0d(c = "com.sportygames.speedybingo.presentation.SpeedyBingoViewModel$handleEvent$7", f = "SpeedyBingoViewModel.kt", l = {684}, m = "invokeSuspend", v = 1)
    public static final class l0 extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public int a;

        public l0(v1b<? super l0> v1bVar) {
            super(2, v1bVar);
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            return uua0.this.new l0(v1bVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
            return ((l0) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            y5b y5bVar = y5b.a;
            int i = this.a;
            if (i == 0) {
                uj50.b(obj);
                CMSRes cMSRes = ma60.B0.n0;
                uua0 uua0Var = uua0.this;
                uua0Var.C1(cMSRes);
                wwd0 wwd0Var = uua0Var.P;
                Boolean boolValueOf = Boolean.valueOf(!((Boolean) wwd0Var.getValue()).booleanValue());
                this.a = 1;
                wwd0Var.getClass();
                wwd0Var.k(null, boolValueOf);
                if (Unit.a == y5bVar) {
                    return y5bVar;
                }
            } else {
                if (i != 1) {
                    ib5.a(gvQvkPPtA.IrobB);
                    return null;
                }
                uj50.b(obj);
            }
            return Unit.a;
        }
    }

    @c0d(c = "com.sportygames.speedybingo.presentation.SpeedyBingoViewModel$betPanelState$1", f = "SpeedyBingoViewModel.kt", l = {}, m = "invokeSuspend", v = 1)
    public static final class m extends tje0 implements jaj<qe60.c, d860, hg60, Integer, v1b<? super fa60>, Object> {
        public /* synthetic */ qe60.c a;
        public /* synthetic */ d860 b;
        public /* synthetic */ hg60 c;
        public /* synthetic */ int d;

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            qe60.c cVar = this.a;
            d860 d860Var = this.b;
            hg60 hg60Var = this.c;
            int i = this.d;
            y5b y5bVar = y5b.a;
            uj50.b(obj);
            e860 e860Var = cVar.b;
            return new fa60(d860Var, e860Var.d, e860Var.a, e860Var.b, e860Var.c, e860Var.e, hg60Var.c, i == 1);
        }

        @Override // defpackage.jaj
        public final Object l(qe60.c cVar, d860 d860Var, hg60 hg60Var, Integer num, v1b<? super fa60> v1bVar) {
            int iIntValue = num.intValue();
            m mVar = new m(5, v1bVar);
            mVar.a = cVar;
            mVar.b = d860Var;
            mVar.c = hg60Var;
            mVar.d = iIntValue;
            return mVar.invokeSuspend(Unit.a);
        }
    }

    @c0d(c = "com.sportygames.speedybingo.presentation.SpeedyBingoViewModel$handleEvent$8", f = "SpeedyBingoViewModel.kt", l = {690, 691}, m = "invokeSuspend", v = 1)
    public static final class m0 extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ vc60 c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public m0(vc60 vc60Var, v1b<? super m0> v1bVar) {
            super(2, v1bVar);
            this.c = vc60Var;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            return uua0.this.new m0(this.c, v1bVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
            return ((m0) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:18:0x0046, code lost:
        
            if (defpackage.ux60.c(r7, r6) == r0) goto L19;
         */
        @Override // defpackage.pz1
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r7) {
            /*
                r6 = this;
                y5b r0 = defpackage.y5b.a
                int r1 = r6.a
                r2 = 0
                r3 = 2
                r4 = 1
                uua0 r5 = defpackage.uua0.this
                if (r1 == 0) goto L1d
                if (r1 == r4) goto L19
                if (r1 != r3) goto L13
                defpackage.uj50.b(r7)
                goto L49
            L13:
                java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                defpackage.ib5.a(r6)
                return r2
            L19:
                defpackage.uj50.b(r7)
                goto L3e
            L1d:
                defpackage.uj50.b(r7)
                vc60 r7 = r6.c
                vc60$a r7 = (vc60.a) r7
                int r7 = r7.a
                if (r7 != 0) goto L2b
                wwd0 r7 = r5.N
                goto L2d
            L2b:
                wwd0 r7 = r5.O
            L2d:
                na60$a r1 = r5.S0()
                r6.a = r4
                r7.getClass()
                r7.k(r2, r1)
                kotlin.Unit r7 = kotlin.Unit.a
                if (r7 != r0) goto L3e
                goto L48
            L3e:
                wwd0 r7 = r5.A
                r6.a = r3
                java.lang.Object r6 = defpackage.ux60.c(r7, r6)
                if (r6 != r0) goto L49
            L48:
                return r0
            L49:
                kotlin.Unit r6 = kotlin.Unit.a
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: uua0.m0.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @c0d(c = "com.sportygames.speedybingo.presentation.SpeedyBingoViewModel$betRowState$1", f = "SpeedyBingoViewModel.kt", l = {}, m = "invokeSuspend", v = 1)
    public static final class n extends tje0 implements gaj<goh0, d860, v1b<? super Pair<? extends goh0, ? extends d860>>, Object> {
        public /* synthetic */ goh0 a;
        public /* synthetic */ d860 b;

        @Override // defpackage.gaj
        public final Object invoke(goh0 goh0Var, d860 d860Var, v1b<? super Pair<? extends goh0, ? extends d860>> v1bVar) {
            n nVar = new n(3, v1bVar);
            nVar.a = goh0Var;
            nVar.b = d860Var;
            return nVar.invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            goh0 goh0Var = this.a;
            d860 d860Var = this.b;
            y5b y5bVar = y5b.a;
            uj50.b(obj);
            return new Pair(goh0Var, d860Var);
        }
    }

    @c0d(c = "com.sportygames.speedybingo.presentation.SpeedyBingoViewModel$handleEvent$9", f = "SpeedyBingoViewModel.kt", l = {697, 698}, m = "invokeSuspend", v = 1)
    public static final class n0 extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ vc60 c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public n0(vc60 vc60Var, v1b<? super n0> v1bVar) {
            super(2, v1bVar);
            this.c = vc60Var;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            return uua0.this.new n0(this.c, v1bVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
            return ((n0) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:18:0x0048, code lost:
        
            if (defpackage.ux60.c(r6, r5) == r0) goto L19;
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
                r2 = 2
                r3 = 1
                uua0 r4 = defpackage.uua0.this
                if (r1 == 0) goto L1d
                if (r1 == r3) goto L19
                if (r1 != r2) goto L12
                defpackage.uj50.b(r6)
                goto L4b
            L12:
                java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
                defpackage.ib5.a(r5)
                r5 = 0
                return r5
            L19:
                defpackage.uj50.b(r6)
                goto L40
            L1d:
                defpackage.uj50.b(r6)
                ma60 r6 = defpackage.ma60.B0
                com.sportygames.newcms.CMSRes r6 = r6.l0
                r4.C1(r6)
                vc60 r6 = r5.c
                vc60$q r6 = (vc60.q) r6
                int r6 = r6.a
                if (r6 != 0) goto L32
                wwd0 r6 = r4.N
                goto L34
            L32:
                wwd0 r6 = r4.O
            L34:
                na60$b r1 = na60.b.a
                r5.a = r3
                r6.setValue(r1)
                kotlin.Unit r6 = kotlin.Unit.a
                if (r6 != r0) goto L40
                goto L4a
            L40:
                wwd0 r6 = r4.A
                r5.a = r2
                java.lang.Object r5 = defpackage.ux60.c(r6, r5)
                if (r5 != r0) goto L4b
            L4a:
                return r0
            L4b:
                kotlin.Unit r5 = kotlin.Unit.a
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: uua0.n0.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @c0d(c = "com.sportygames.speedybingo.presentation.SpeedyBingoViewModel$betRowState$2", f = "SpeedyBingoViewModel.kt", l = {}, m = "invokeSuspend", v = 1)
    public static final class o extends tje0 implements kaj<tx60, ia60, qcn<? extends Integer>, Boolean, Pair<? extends goh0, ? extends d860>, v1b<? super bz2>, Object> {
        public /* synthetic */ tx60 a;
        public /* synthetic */ ia60 b;
        public /* synthetic */ qcn c;
        public /* synthetic */ boolean d;
        public /* synthetic */ Pair e;

        public o(v1b<? super o> v1bVar) {
            super(6, v1bVar);
        }

        @Override // defpackage.kaj
        public final Object f(tx60 tx60Var, ia60 ia60Var, qcn<? extends Integer> qcnVar, Boolean bool, Pair<? extends goh0, ? extends d860> pair, v1b<? super bz2> v1bVar) {
            boolean zBooleanValue = bool.booleanValue();
            o oVar = new o(v1bVar);
            oVar.a = tx60Var;
            oVar.b = ia60Var;
            oVar.c = qcnVar;
            oVar.d = zBooleanValue;
            oVar.e = pair;
            return oVar.invokeSuspend(Unit.a);
        }

        /* JADX WARN: Code duplicated, block: B:22:0x0068  */
        /* JADX WARN: Code duplicated, block: B:57:0x00e6  */
        /* JADX WARN: Code duplicated, block: B:59:0x00f5  */
        /* JADX WARN: Code duplicated, block: B:61:0x00fd  */
        /* JADX WARN: Code duplicated, block: B:63:0x010f  */
        /* JADX WARN: Code duplicated, block: B:87:0x016b  */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            boolean z;
            s760 aVar;
            s760 aVar2;
            Integer num;
            String strValueOf;
            tx60 tx60Var = this.a;
            ia60 ia60Var = this.b;
            qcn qcnVar = this.c;
            boolean z2 = this.d;
            Pair pair = this.e;
            y5b y5bVar = y5b.a;
            uj50.b(obj);
            goh0 goh0Var = (goh0) pair.a;
            d860 d860Var = (d860) pair.b;
            tx60Var.getClass();
            ia60Var.getClass();
            qcnVar.getClass();
            goh0Var.getClass();
            d860Var.getClass();
            dg60 dg60Var = goh0Var.c;
            boolean z3 = dg60Var instanceof dg60.a;
            boolean z4 = false;
            if (z3) {
                z = true;
            } else {
                if (!Intrinsics.g(dg60Var, dg60.b.a)) {
                    uhc.a();
                    return null;
                }
                z = false;
            }
            t760 t760Var = goh0Var.a;
            if (!z3) {
                if (!Intrinsics.g(dg60Var, dg60.b.a)) {
                    uhc.a();
                    return null;
                }
                if (tx60Var.equals(tx60.c.a) || tx60Var.equals(tx60.b.a) || tx60Var.equals(tx60.a.a) || tx60Var.equals(tx60.d.a) || tx60Var.equals(tx60.f.a)) {
                    aVar = new s760.a(false);
                } else {
                    if (!tx60Var.equals(tx60.e.a) && !tx60Var.equals(tx60.g.a)) {
                        uhc.a();
                        return null;
                    }
                    if (!(d860Var instanceof d860.a)) {
                        if (!(d860Var instanceof d860.b)) {
                            uhc.a();
                            return null;
                        }
                        z4 = true;
                    }
                    aVar2 = new s760.a(!z4);
                }
                if (tx60Var.equals(tx60.a.a)) {
                    return new bz2.b(ia60Var.e, tkd0.a(ia60Var.d, (4 & 2) != 0, (4 & 4) != 0));
                }
                if (tx60Var.equals(tx60.c.a)) {
                    return new bz2.a(pj2.c.a, false, aVar2, new gg60(z2), false);
                }
                if (!tx60Var.equals(tx60.b.a) || tx60Var.equals(tx60.d.a) || tx60Var.equals(tx60.f.a)) {
                    num = (Integer) CollectionsKt.d0(qcnVar);
                    if (num != null || (strValueOf = String.valueOf(num.intValue())) == null) {
                        strValueOf = "";
                    }
                    return new bz2.a(new pj2.a(strValueOf), false, aVar2, new gg60(z2), false);
                }
                if (tx60Var.equals(tx60.e.a) || tx60Var.equals(tx60.g.a)) {
                    boolean z5 = !z;
                    return new bz2.a(z ? pj2.c.a : pj2.b.a, z5, aVar2, new gg60(z2), z5);
                }
                uhc.a();
                return null;
            }
            t760Var.getClass();
            if (t760Var.equals(t760.a.a) || t760Var.equals(t760.b.a)) {
                aVar = new s760.b(t760Var.a(), !((dg60.a) dg60Var).a);
            } else {
                if (!(t760Var instanceof t760.c)) {
                    uhc.a();
                    return null;
                }
                if (((t760.c) t760Var).a == 0) {
                    aVar = new s760.a(false);
                } else {
                    aVar = new s760.b(t760Var.a(), !((dg60.a) dg60Var).a);
                }
            }
            aVar2 = aVar;
            if (tx60Var.equals(tx60.a.a)) {
                return new bz2.b(ia60Var.e, tkd0.a(ia60Var.d, (4 & 2) != 0, (4 & 4) != 0));
            }
            if (tx60Var.equals(tx60.c.a)) {
                return new bz2.a(pj2.c.a, false, aVar2, new gg60(z2), false);
            }
            if (tx60Var.equals(tx60.b.a)) {
            }
            num = (Integer) CollectionsKt.d0(qcnVar);
            if (num != null) {
                strValueOf = "";
            } else {
                strValueOf = "";
            }
            return new bz2.a(new pj2.a(strValueOf), false, aVar2, new gg60(z2), false);
        }
    }

    @c0d(c = "com.sportygames.speedybingo.presentation.SpeedyBingoViewModel$initSuccess$1", f = "SpeedyBingoViewModel.kt", l = {}, m = "invokeSuspend", v = 1)
    public static final class o0 extends tje0 implements gaj<sd60, Boolean, v1b<? super Pair<? extends sd60, ? extends Boolean>>, Object> {
        public /* synthetic */ sd60 a;
        public /* synthetic */ boolean b;

        @Override // defpackage.gaj
        public final Object invoke(sd60 sd60Var, Boolean bool, v1b<? super Pair<? extends sd60, ? extends Boolean>> v1bVar) {
            boolean zBooleanValue = bool.booleanValue();
            o0 o0Var = new o0(3, v1bVar);
            o0Var.a = sd60Var;
            o0Var.b = zBooleanValue;
            return o0Var.invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            sd60 sd60Var = this.a;
            boolean z = this.b;
            y5b y5bVar = y5b.a;
            uj50.b(obj);
            return new Pair(sd60Var, Boolean.valueOf(z));
        }
    }

    @c0d(c = "com.sportygames.speedybingo.presentation.SpeedyBingoViewModel$cardCount$1", f = "SpeedyBingoViewModel.kt", l = {}, m = "invokeSuspend", v = 1)
    public static final class p extends tje0 implements gaj<na60, na60, v1b<? super Integer>, Object> {
        public /* synthetic */ na60 a;
        public /* synthetic */ na60 b;

        @Override // defpackage.gaj
        public final Object invoke(na60 na60Var, na60 na60Var2, v1b<? super Integer> v1bVar) {
            p pVar = new p(3, v1bVar);
            pVar.a = na60Var;
            pVar.b = na60Var2;
            return pVar.invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            na60 na60Var = this.a;
            na60 na60Var2 = this.b;
            y5b y5bVar = y5b.a;
            uj50.b(obj);
            int i = 0;
            List<na60> listK = kotlin.collections.b.k(na60Var, na60Var2);
            if (listK == null || !listK.isEmpty()) {
                for (na60 na60Var3 : listK) {
                    if (na60Var3 instanceof na60.a) {
                        i++;
                        if (i < 0) {
                            kotlin.collections.b.p();
                            throw null;
                        }
                    } else if (!Intrinsics.g(na60Var3, na60.b.a)) {
                        uhc.a();
                        return null;
                    }
                }
            }
            return new Integer(i);
        }
    }

    @c0d(c = "com.sportygames.speedybingo.presentation.SpeedyBingoViewModel$initSuccess$2", f = "SpeedyBingoViewModel.kt", l = {}, m = "invokeSuspend", v = 1)
    public static final class p0 extends tje0 implements kaj<fa60, j, bz2, i4h, Pair<? extends sd60, ? extends Boolean>, v1b<? super se60.b>, Object> {
        public /* synthetic */ fa60 a;
        public /* synthetic */ j b;
        public /* synthetic */ bz2 c;
        public /* synthetic */ i4h d;
        public /* synthetic */ Pair e;

        public p0(v1b<? super p0> v1bVar) {
            super(6, v1bVar);
        }

        @Override // defpackage.kaj
        public final Object f(fa60 fa60Var, j jVar, bz2 bz2Var, i4h i4hVar, Pair<? extends sd60, ? extends Boolean> pair, v1b<? super se60.b> v1bVar) {
            p0 p0Var = new p0(v1bVar);
            p0Var.a = fa60Var;
            p0Var.b = jVar;
            p0Var.c = bz2Var;
            p0Var.d = i4hVar;
            p0Var.e = pair;
            return p0Var.invokeSuspend(Unit.a);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            fa60 fa60Var = this.a;
            j jVar = this.b;
            bz2 bz2Var = this.c;
            i4h i4hVar = this.d;
            Pair pair = this.e;
            y5b y5bVar = y5b.a;
            uj50.b(obj);
            return new se60.b(fa60Var, jVar.a, jVar.b, jVar.d, jVar.c, bz2Var, i4hVar, (sd60) pair.a, ((Boolean) pair.b).booleanValue());
        }
    }

    @c0d(c = "com.sportygames.speedybingo.presentation.SpeedyBingoViewModel$cardRequiredData$1", f = "SpeedyBingoViewModel.kt", l = {}, m = "invokeSuspend", v = 1)
    public static final class q extends tje0 implements gaj<tx60, na60, v1b<? super Pair<? extends tx60, ? extends na60>>, Object> {
        public /* synthetic */ tx60 a;
        public /* synthetic */ na60 b;

        @Override // defpackage.gaj
        public final Object invoke(tx60 tx60Var, na60 na60Var, v1b<? super Pair<? extends tx60, ? extends na60>> v1bVar) {
            q qVar = new q(3, v1bVar);
            qVar.a = tx60Var;
            qVar.b = na60Var;
            return qVar.invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            tx60 tx60Var = this.a;
            na60 na60Var = this.b;
            y5b y5bVar = y5b.a;
            uj50.b(obj);
            return new Pair(tx60Var, na60Var);
        }
    }

    @c0d(c = "com.sportygames.speedybingo.presentation.SpeedyBingoViewModel$loadingState$1", f = "SpeedyBingoViewModel.kt", l = {}, m = "invokeSuspend", v = 1)
    public static final class q0 extends tje0 implements gaj<qe60, se60.b, v1b<? super se60>, Object> {
        public /* synthetic */ qe60 a;
        public /* synthetic */ se60.b b;

        @Override // defpackage.gaj
        public final Object invoke(qe60 qe60Var, se60.b bVar, v1b<? super se60> v1bVar) {
            q0 q0Var = new q0(3, v1bVar);
            q0Var.a = qe60Var;
            q0Var.b = bVar;
            return q0Var.invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            qe60 qe60Var = this.a;
            se60.b bVar = this.b;
            y5b y5bVar = y5b.a;
            uj50.b(obj);
            if (qe60Var instanceof qe60.a) {
                return null;
            }
            if (qe60Var instanceof qe60.b) {
                return new se60.a(((qe60.b) qe60Var).a);
            }
            if (qe60Var instanceof qe60.c) {
                return bVar;
            }
            uhc.a();
            return null;
        }
    }

    @c0d(c = "com.sportygames.speedybingo.presentation.SpeedyBingoViewModel$cardRequiredData$2", f = "SpeedyBingoViewModel.kt", l = {}, m = "invokeSuspend", v = 1)
    public static final class r extends tje0 implements gaj<d860, qe60.c, v1b<? super Pair<? extends d860, ? extends qe60.c>>, Object> {
        public /* synthetic */ d860 a;
        public /* synthetic */ qe60.c b;

        @Override // defpackage.gaj
        public final Object invoke(d860 d860Var, qe60.c cVar, v1b<? super Pair<? extends d860, ? extends qe60.c>> v1bVar) {
            r rVar = new r(3, v1bVar);
            rVar.a = d860Var;
            rVar.b = cVar;
            return rVar.invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            d860 d860Var = this.a;
            qe60.c cVar = this.b;
            y5b y5bVar = y5b.a;
            uj50.b(obj);
            return new Pair(d860Var, cVar);
        }
    }

    @c0d(c = "com.sportygames.speedybingo.presentation.SpeedyBingoViewModel$scoreLayoutState$1", f = "SpeedyBingoViewModel.kt", l = {}, m = "invokeSuspend", v = 1)
    public static final class r0 extends tje0 implements jaj<wb60, wb60, d860, qe60.c, v1b<? super do70>, Object> {
        public /* synthetic */ wb60 a;
        public /* synthetic */ wb60 b;
        public /* synthetic */ d860 c;
        public /* synthetic */ qe60.c d;

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r10v10, types: [java.math.BigDecimal] */
        /* JADX WARN: Type inference failed for: r10v15 */
        /* JADX WARN: Type inference failed for: r10v7 */
        /* JADX WARN: Type inference failed for: r10v8 */
        /* JADX WARN: Type inference failed for: r10v9, types: [java.math.BigDecimal] */
        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) throws Throwable {
            int i;
            int i2;
            Object bVar;
            ?? r10;
            Object aVar;
            BigDecimal bigDecimal;
            wb60.a aVar2;
            wb60 wb60Var = this.a;
            wb60 wb60Var2 = this.b;
            d860 d860Var = this.c;
            qe60.c cVar = this.d;
            y5b y5bVar = y5b.a;
            uj50.b(obj);
            qf60 qf60Var = qf60.a;
            qcn<skd0> qcnVar = cVar.d;
            qf60Var.getClass();
            wb60Var.getClass();
            wb60Var2.getClass();
            d860Var.getClass();
            qcnVar.getClass();
            List<Integer> list = fc60.a;
            ArrayList arrayList = new ArrayList(l48.r(list, 10));
            int i3 = 0;
            int i4 = 0;
            for (Object obj2 : list) {
                int i5 = i4 + 1;
                Throwable th = null;
                if (i4 < 0) {
                    kotlin.collections.b.q();
                    throw null;
                }
                int iIntValue = ((Number) obj2).intValue();
                skd0 skd0Var = (skd0) CollectionsKt.V(i4, qcnVar);
                BigDecimal bigDecimal2 = skd0Var != null ? skd0Var.a : null;
                if (bigDecimal2 == null) {
                    bigDecimal2 = skd0.b;
                }
                qf60 qf60Var2 = qf60.a;
                BigDecimal bigDecimalMultiply = bigDecimal2.multiply(d860Var.a());
                bigDecimalMultiply.getClass();
                BigDecimal bigDecimal3 = skd0.b;
                qf60Var2.getClass();
                wb60[] wb60VarArr = new wb60[2];
                wb60VarArr[i3] = wb60Var;
                wb60VarArr[1] = wb60Var2;
                List<wb60> listK = kotlin.collections.b.k(wb60VarArr);
                ArrayList arrayList2 = new ArrayList();
                for (wb60 wb60Var3 : listK) {
                    if (wb60Var3 instanceof wb60.a) {
                        aVar2 = (wb60.a) wb60Var3;
                    } else {
                        if (!(wb60Var3 instanceof wb60.b)) {
                            uhc.a();
                            return null;
                        }
                        aVar2 = null;
                    }
                    if (aVar2 != null) {
                        arrayList2.add(aVar2);
                    }
                }
                if (arrayList2.isEmpty()) {
                    i = i3;
                } else {
                    int size = arrayList2.size();
                    i = i3;
                    int i6 = i;
                    while (i6 < size) {
                        Object obj3 = arrayList2.get(i6);
                        i6++;
                        Throwable th2 = th;
                        if (((wb60.a) obj3).c == iIntValue && (i = i + 1) < 0) {
                            kotlin.collections.b.p();
                            throw th2;
                        }
                        th = th2;
                    }
                }
                Object obj4 = th;
                try {
                    zi50.a aVar3 = zi50.b;
                    BigDecimal bigDecimalValueOf = BigDecimal.valueOf(0.5d);
                    bigDecimalValueOf.getClass();
                    BigDecimal bigDecimal4 = skd0.b;
                    BigDecimal bigDecimalValueOf2 = BigDecimal.valueOf(3L);
                    bigDecimalValueOf2.getClass();
                    i2 = iIntValue;
                    try {
                        BigDecimal bigDecimalValueOf3 = BigDecimal.valueOf(arrayList2.size());
                        bigDecimalValueOf3.getClass();
                        BigDecimal bigDecimalSubtract = bigDecimalValueOf2.subtract(bigDecimalValueOf3);
                        bigDecimalSubtract.getClass();
                        BigDecimal bigDecimalMultiply2 = bigDecimalValueOf.multiply(bigDecimalSubtract);
                        bigDecimalMultiply2.getClass();
                        BigDecimal bigDecimalMultiply3 = bigDecimalMultiply.multiply(bigDecimalMultiply2);
                        bigDecimalMultiply3.getClass();
                        bVar = new skd0(bigDecimalMultiply3);
                    } catch (Throwable th3) {
                        th = th3;
                        zi50.a aVar4 = zi50.b;
                        bVar = new zi50.b(th);
                    }
                } catch (Throwable th4) {
                    th = th4;
                    i2 = iIntValue;
                }
                if (bVar instanceof zi50.b) {
                    bVar = obj4;
                }
                skd0 skd0Var2 = (skd0) bVar;
                if (skd0Var2 != null) {
                    bigDecimal = skd0Var2.a;
                } else {
                    r10 = obj4;
                }
                if (r10 == 0) {
                    r10 = bigDecimal;
                    r10 = skd0.b;
                }
                if (i > 0) {
                    i3 = 0;
                    aVar = new eo70.b(tkd0.a(r10, true, false), i, i2);
                } else {
                    i3 = 0;
                    aVar = new eo70.a(tkd0.a(r10, true, false), i2);
                }
                arrayList.add(aVar);
                i4 = i5;
            }
            return new do70(a4h.f(arrayList));
        }

        @Override // defpackage.jaj
        public final Object l(wb60 wb60Var, wb60 wb60Var2, d860 d860Var, qe60.c cVar, v1b<? super do70> v1bVar) {
            r0 r0Var = new r0(5, v1bVar);
            r0Var.a = wb60Var;
            r0Var.b = wb60Var2;
            r0Var.c = d860Var;
            r0Var.d = cVar;
            return r0Var.invokeSuspend(Unit.a);
        }
    }

    @c0d(c = "com.sportygames.speedybingo.presentation.SpeedyBingoViewModel$cardRequiredData$3", f = "SpeedyBingoViewModel.kt", l = {}, m = "invokeSuspend", v = 1)
    public static final class s extends tje0 implements gaj<Boolean, Integer, v1b<? super Pair<? extends Boolean, ? extends Integer>>, Object> {
        public /* synthetic */ boolean a;
        public /* synthetic */ int b;

        @Override // defpackage.gaj
        public final Object invoke(Boolean bool, Integer num, v1b<? super Pair<? extends Boolean, ? extends Integer>> v1bVar) {
            boolean zBooleanValue = bool.booleanValue();
            int iIntValue = num.intValue();
            s sVar = new s(3, v1bVar);
            sVar.a = zBooleanValue;
            sVar.b = iIntValue;
            return sVar.invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            boolean z = this.a;
            int i = this.b;
            y5b y5bVar = y5b.a;
            uj50.b(obj);
            return new Pair(Boolean.valueOf(z), new Integer(i));
        }
    }

    @c0d(c = "com.sportygames.speedybingo.presentation.SpeedyBingoViewModel$secondCardState$1", f = "SpeedyBingoViewModel.kt", l = {}, m = "invokeSuspend", v = 1)
    public static final class s0 extends tje0 implements iaj<na60, ub60, qcn<? extends Integer>, v1b<? super wb60>, Object> {
        public /* synthetic */ na60 a;
        public /* synthetic */ ub60 b;
        public /* synthetic */ qcn c;

        public s0(v1b<? super s0> v1bVar) {
            super(4, v1bVar);
        }

        @Override // defpackage.iaj
        public final Object d(na60 na60Var, ub60 ub60Var, qcn<? extends Integer> qcnVar, v1b<? super wb60> v1bVar) {
            s0 s0Var = uua0.this.new s0(v1bVar);
            s0Var.a = na60Var;
            s0Var.b = ub60Var;
            s0Var.c = qcnVar;
            return s0Var.invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            na60 na60Var = this.a;
            ub60 ub60Var = this.b;
            qcn qcnVar = this.c;
            y5b y5bVar = y5b.a;
            uj50.b(obj);
            return fb60.v(na60Var, qcnVar, ub60Var);
        }
    }

    @c0d(c = "com.sportygames.speedybingo.presentation.SpeedyBingoViewModel$cardRequiredData$4", f = "SpeedyBingoViewModel.kt", l = {}, m = "invokeSuspend", v = 1)
    public static final class t extends tje0 implements gaj<xc60, ia60, v1b<? super Pair<? extends xc60, ? extends ia60>>, Object> {
        public /* synthetic */ xc60 a;
        public /* synthetic */ ia60 b;

        @Override // defpackage.gaj
        public final Object invoke(xc60 xc60Var, ia60 ia60Var, v1b<? super Pair<? extends xc60, ? extends ia60>> v1bVar) {
            t tVar = new t(3, v1bVar);
            tVar.a = xc60Var;
            tVar.b = ia60Var;
            return tVar.invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            xc60 xc60Var = this.a;
            ia60 ia60Var = this.b;
            y5b y5bVar = y5b.a;
            uj50.b(obj);
            return new Pair(xc60Var, ia60Var);
        }
    }

    @c0d(c = "com.sportygames.speedybingo.presentation.SpeedyBingoViewModel$seekExtraBall$1", f = "SpeedyBingoViewModel.kt", l = {883}, m = "invokeSuspend", v = 1)
    public static final class t0 extends tje0 implements Function2<mk50<? extends xc60>, v1b<? super Unit>, Object> {
        public int a;
        public /* synthetic */ Object b;

        public t0(v1b<? super t0> v1bVar) {
            super(2, v1bVar);
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            t0 t0Var = uua0.this.new t0(v1bVar);
            t0Var.b = obj;
            return t0Var;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(mk50<? extends xc60> mk50Var, v1b<? super Unit> v1bVar) {
            return ((t0) create(mk50Var, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            mk50 mk50Var = (mk50) this.b;
            y5b y5bVar = y5b.a;
            int i = this.a;
            uua0 uua0Var = uua0.this;
            if (i == 0) {
                uj50.b(obj);
                if (!(mk50Var instanceof mk50.a) && !Intrinsics.g(mk50Var, mk50.b.a)) {
                    if (!(mk50Var instanceof mk50.c)) {
                        uhc.a();
                        return null;
                    }
                    wwd0 wwd0Var = uua0Var.W;
                    T t = ((mk50.c) mk50Var).a;
                    this.b = null;
                    this.a = 1;
                    wwd0Var.setValue(t);
                    if (Unit.a == y5bVar) {
                        return y5bVar;
                    }
                }
            } else {
                if (i != 1) {
                    ib5.a("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                uj50.b(obj);
            }
            uua0Var.a0 = null;
            return Unit.a;
        }
    }

    @c0d(c = "com.sportygames.speedybingo.presentation.SpeedyBingoViewModel$cardRequiredData$5", f = "SpeedyBingoViewModel.kt", l = {}, m = "invokeSuspend", v = 1)
    public static final class u extends tje0 implements gaj<goh0, Boolean, v1b<? super Pair<? extends goh0, ? extends Boolean>>, Object> {
        public /* synthetic */ goh0 a;
        public /* synthetic */ boolean b;

        @Override // defpackage.gaj
        public final Object invoke(goh0 goh0Var, Boolean bool, v1b<? super Pair<? extends goh0, ? extends Boolean>> v1bVar) {
            boolean zBooleanValue = bool.booleanValue();
            u uVar = new u(3, v1bVar);
            uVar.a = goh0Var;
            uVar.b = zBooleanValue;
            return uVar.invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            goh0 goh0Var = this.a;
            boolean z = this.b;
            y5b y5bVar = y5b.a;
            uj50.b(obj);
            return new Pair(goh0Var, Boolean.valueOf(z));
        }
    }

    @c0d(c = "com.sportygames.speedybingo.presentation.SpeedyBingoViewModel$seekExtraEyeEnable$1", f = "SpeedyBingoViewModel.kt", l = {}, m = "invokeSuspend", v = 1)
    public static final class u0 extends tje0 implements jaj<tx60, ia60, xc60, Boolean, v1b<? super Boolean>, Object> {
        public /* synthetic */ tx60 a;
        public /* synthetic */ ia60 b;
        public /* synthetic */ xc60 c;
        public /* synthetic */ boolean d;

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            tx60 tx60Var = this.a;
            ia60 ia60Var = this.b;
            xc60 xc60Var = this.c;
            boolean z = this.d;
            y5b y5bVar = y5b.a;
            uj50.b(obj);
            if (Intrinsics.g(tx60Var, tx60.g.a)) {
                return Boolean.valueOf((z || ia60Var.b || ia60Var.a != xc60Var.a) ? false : true);
            }
            return Boolean.FALSE;
        }

        @Override // defpackage.jaj
        public final Object l(tx60 tx60Var, ia60 ia60Var, xc60 xc60Var, Boolean bool, v1b<? super Boolean> v1bVar) {
            boolean zBooleanValue = bool.booleanValue();
            u0 u0Var = new u0(5, v1bVar);
            u0Var.a = tx60Var;
            u0Var.b = ia60Var;
            u0Var.c = xc60Var;
            u0Var.d = zBooleanValue;
            return u0Var.invokeSuspend(Unit.a);
        }
    }

    @c0d(c = "com.sportygames.speedybingo.presentation.SpeedyBingoViewModel$cardRequiredData$6", f = "SpeedyBingoViewModel.kt", l = {}, m = "invokeSuspend", v = 1)
    public static final class v extends tje0 implements kaj<Pair<? extends tx60, ? extends na60>, Pair<? extends d860, ? extends qe60.c>, Pair<? extends Boolean, ? extends Integer>, Pair<? extends xc60, ? extends ia60>, Pair<? extends goh0, ? extends Boolean>, v1b<? super ub60>, Object> {
        public /* synthetic */ Pair a;
        public /* synthetic */ Pair b;
        public /* synthetic */ Pair c;
        public /* synthetic */ Pair d;
        public /* synthetic */ Pair e;

        public v(v1b<? super v> v1bVar) {
            super(6, v1bVar);
        }

        @Override // defpackage.kaj
        public final Object f(Pair<? extends tx60, ? extends na60> pair, Pair<? extends d860, ? extends qe60.c> pair2, Pair<? extends Boolean, ? extends Integer> pair3, Pair<? extends xc60, ? extends ia60> pair4, Pair<? extends goh0, ? extends Boolean> pair5, v1b<? super ub60> v1bVar) {
            v vVar = uua0.this.new v(v1bVar);
            vVar.a = pair;
            vVar.b = pair2;
            vVar.c = pair3;
            vVar.d = pair4;
            vVar.e = pair5;
            return vVar.invokeSuspend(Unit.a);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            boolean z;
            boolean z2;
            Pair pair = this.a;
            Pair pair2 = this.b;
            Pair pair3 = this.c;
            Pair pair4 = this.d;
            Pair pair5 = this.e;
            y5b y5bVar = y5b.a;
            uj50.b(obj);
            tx60 tx60Var = (tx60) pair.a;
            d860 d860Var = (d860) pair2.a;
            qe60.c cVar = (qe60.c) pair2.b;
            boolean zBooleanValue = ((Boolean) pair3.a).booleanValue();
            int iIntValue = ((Number) pair3.b).intValue();
            xc60 xc60Var = (xc60) pair4.a;
            ia60 ia60Var = (ia60) pair4.b;
            goh0 goh0Var = (goh0) pair5.a;
            boolean zBooleanValue2 = ((Boolean) pair5.b).booleanValue();
            goh0Var.getClass();
            dg60 dg60Var = goh0Var.c;
            boolean z3 = dg60Var instanceof dg60.a;
            boolean z4 = false;
            if (z3) {
                z = true;
            } else {
                if (!Intrinsics.g(dg60Var, dg60.b.a)) {
                    uhc.a();
                    return null;
                }
                z = false;
            }
            tx60Var.getClass();
            if (!zBooleanValue && !z && (tx60Var.equals(tx60.e.a) || tx60Var.equals(tx60.g.a))) {
                z4 = true;
            }
            BigDecimal bigDecimalA = d860Var.a();
            qcn<skd0> qcnVar = cVar.d;
            int i = ia60Var.a;
            if (z3) {
                z2 = true;
            } else {
                if (!Intrinsics.g(dg60Var, dg60.b.a)) {
                    uhc.a();
                    return null;
                }
                z2 = false;
            }
            return new ub60(z4, bigDecimalA, qcnVar, zBooleanValue, iIntValue, xc60Var, i, z2, zBooleanValue2);
        }
    }

    @c0d(c = "com.sportygames.speedybingo.presentation.SpeedyBingoViewModel$showExitDialog$1", f = "SpeedyBingoViewModel.kt", l = {924}, m = "invokeSuspend", v = 1)
    public static final class v0 extends tje0 implements Function2<iwg, v1b<? super Unit>, Object> {
        public int a;
        public /* synthetic */ Object b;
        public final /* synthetic */ UiText d;
        public final /* synthetic */ boolean e;
        public final /* synthetic */ boolean f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public v0(UiText uiText, boolean z, boolean z2, v1b<? super v0> v1bVar) {
            super(2, v1bVar);
            this.d = uiText;
            this.e = z;
            this.f = z2;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            v0 v0Var = uua0.this.new v0(this.d, this.e, this.f, v1bVar);
            v0Var.b = obj;
            return v0Var;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(iwg iwgVar, v1b<? super Unit> v1bVar) {
            return ((v0) create(iwgVar, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            iwg iwgVar = (iwg) this.b;
            y5b y5bVar = y5b.a;
            int i = this.a;
            if (i == 0) {
                uj50.b(obj);
                wwd0 wwd0Var = uua0.this.z;
                rc60.e eVar = new rc60.e(this.d, iwgVar, this.e, this.f);
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

    @c0d(c = "com.sportygames.speedybingo.presentation.SpeedyBingoViewModel$cardsInternalState$1", f = "SpeedyBingoViewModel.kt", l = {}, m = "invokeSuspend", v = 1)
    public static final class w extends tje0 implements iaj<wb60, wb60, do70, v1b<? super j>, Object> {
        public /* synthetic */ wb60 a;
        public /* synthetic */ wb60 b;
        public /* synthetic */ do70 c;

        public w(v1b<? super w> v1bVar) {
            super(4, v1bVar);
        }

        @Override // defpackage.iaj
        public final Object d(wb60 wb60Var, wb60 wb60Var2, do70 do70Var, v1b<? super j> v1bVar) {
            w wVar = uua0.this.new w(v1bVar);
            wVar.a = wb60Var;
            wVar.b = wb60Var2;
            wVar.c = do70Var;
            return wVar.invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            wb60 wb60Var = this.a;
            wb60 wb60Var2 = this.b;
            do70 do70Var = this.c;
            y5b y5bVar = y5b.a;
            uj50.b(obj);
            return new j(wb60Var, wb60Var2, do70Var, uua0.this.L);
        }
    }

    public static final class w0 implements lyh<Boolean> {
        public final /* synthetic */ lyh a;

        public static final class a<T> implements myh {
            public final /* synthetic */ myh a;

            /* JADX INFO: renamed from: uua0$w0$a$a, reason: collision with other inner class name */
            @c0d(c = "com.sportygames.speedybingo.presentation.SpeedyBingoViewModel$special$$inlined$filter$1$2", f = "SpeedyBingoViewModel.kt", l = {50}, m = "emit", v = 1)
            public static final class C1186a extends x1b {
                public /* synthetic */ Object a;
                public int b;

                public C1186a(v1b v1bVar) {
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
                C1186a c1186a;
                if (v1bVar instanceof C1186a) {
                    c1186a = (C1186a) v1bVar;
                    int i = c1186a.b;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        c1186a.b = i - Integer.MIN_VALUE;
                    } else {
                        c1186a = new C1186a(v1bVar);
                    }
                } else {
                    c1186a = new C1186a(v1bVar);
                }
                Object obj2 = c1186a.a;
                y5b y5bVar = y5b.a;
                int i2 = c1186a.b;
                if (i2 == 0) {
                    uj50.b(obj2);
                    if (((Boolean) obj).booleanValue()) {
                        c1186a.b = 1;
                        if (this.a.emit(obj, c1186a) == y5bVar) {
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

        public w0(lyh lyhVar) {
            this.a = lyhVar;
        }

        @Override // defpackage.lyh
        public final Object collect(myh<? super Boolean> myhVar, v1b v1bVar) {
            Object objCollect = this.a.collect(new a(myhVar), v1bVar);
            return objCollect == y5b.a ? objCollect : Unit.a;
        }
    }

    @c0d(c = "com.sportygames.speedybingo.presentation.SpeedyBingoViewModel$extraBallState$1", f = "SpeedyBingoViewModel.kt", l = {}, m = "invokeSuspend", v = 1)
    public static final class x extends tje0 implements jaj<tx60, xc60, Boolean, fg60, v1b<? super i4h>, Object> {
        public /* synthetic */ tx60 a;
        public /* synthetic */ xc60 b;
        public /* synthetic */ boolean c;
        public /* synthetic */ fg60 d;

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            tx60 tx60Var = this.a;
            xc60 xc60Var = this.b;
            boolean z = this.c;
            fg60 fg60Var = this.d;
            y5b y5bVar = y5b.a;
            uj50.b(obj);
            tx60Var.getClass();
            xc60Var.getClass();
            fg60Var.getClass();
            return tx60Var.equals(tx60.f.a) ? new i4h.b(xc60Var.c, z, fg60Var.c) : i4h.a.a;
        }

        @Override // defpackage.jaj
        public final Object l(tx60 tx60Var, xc60 xc60Var, Boolean bool, fg60 fg60Var, v1b<? super i4h> v1bVar) {
            boolean zBooleanValue = bool.booleanValue();
            x xVar = new x(5, v1bVar);
            xVar.a = tx60Var;
            xVar.b = xc60Var;
            xVar.c = zBooleanValue;
            xVar.d = fg60Var;
            return xVar.invokeSuspend(Unit.a);
        }
    }

    public static final class x0 implements lyh<Boolean> {
        public final /* synthetic */ wwd0 a;

        /* JADX INFO: loaded from: classes2.dex */
        public static final class a<T> implements myh {
            public final /* synthetic */ myh a;

            /* JADX INFO: renamed from: uua0$x0$a$a, reason: collision with other inner class name */
            /* JADX INFO: loaded from: classes6.dex */
            @c0d(c = "com.sportygames.speedybingo.presentation.SpeedyBingoViewModel$special$$inlined$filter$2$2", f = "SpeedyBingoViewModel.kt", l = {50}, m = "emit", v = 1)
            public static final class C1187a extends x1b {
                public /* synthetic */ Object a;
                public int b;

                public C1187a(v1b v1bVar) {
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
                C1187a c1187a;
                if (v1bVar instanceof C1187a) {
                    c1187a = (C1187a) v1bVar;
                    int i = c1187a.b;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        c1187a.b = i - Integer.MIN_VALUE;
                    } else {
                        c1187a = new C1187a(v1bVar);
                    }
                } else {
                    c1187a = new C1187a(v1bVar);
                }
                Object obj2 = c1187a.a;
                y5b y5bVar = y5b.a;
                int i2 = c1187a.b;
                if (i2 == 0) {
                    uj50.b(obj2);
                    if (((Boolean) obj).booleanValue()) {
                        c1187a.b = 1;
                        if (this.a.emit(obj, c1187a) == y5bVar) {
                            return y5bVar;
                        }
                    }
                } else {
                    if (i2 != 1) {
                        ib5.a(QWvyvNzGsBpRT.xipC);
                        return null;
                    }
                    uj50.b(obj2);
                }
                return Unit.a;
            }
        }

        public x0(wwd0 wwd0Var) {
            this.a = wwd0Var;
        }

        @Override // defpackage.lyh
        public final Object collect(myh<? super Boolean> myhVar, v1b v1bVar) throws Throwable {
            this.a.collect(new a(myhVar), v1bVar);
            return y5b.a;
        }
    }

    @c0d(c = "com.sportygames.speedybingo.presentation.SpeedyBingoViewModel$firstCardState$1", f = "SpeedyBingoViewModel.kt", l = {}, m = "invokeSuspend", v = 1)
    public static final class y extends tje0 implements iaj<na60, ub60, qcn<? extends Integer>, v1b<? super wb60>, Object> {
        public /* synthetic */ na60 a;
        public /* synthetic */ ub60 b;
        public /* synthetic */ qcn c;

        public y(v1b<? super y> v1bVar) {
            super(4, v1bVar);
        }

        @Override // defpackage.iaj
        public final Object d(na60 na60Var, ub60 ub60Var, qcn<? extends Integer> qcnVar, v1b<? super wb60> v1bVar) {
            y yVar = uua0.this.new y(v1bVar);
            yVar.a = na60Var;
            yVar.b = ub60Var;
            yVar.c = qcnVar;
            return yVar.invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            na60 na60Var = this.a;
            ub60 ub60Var = this.b;
            qcn qcnVar = this.c;
            y5b y5bVar = y5b.a;
            uj50.b(obj);
            return fb60.v(na60Var, qcnVar, ub60Var);
        }
    }

    public static final class y0 implements lyh<Boolean> {
        public final /* synthetic */ wwd0 a;

        public static final class a<T> implements myh {
            public final /* synthetic */ myh a;

            /* JADX INFO: renamed from: uua0$y0$a$a, reason: collision with other inner class name */
            @c0d(c = "com.sportygames.speedybingo.presentation.SpeedyBingoViewModel$special$$inlined$map$1$2", f = "SpeedyBingoViewModel.kt", l = {50}, m = "emit", v = 1)
            public static final class C1188a extends x1b {
                public /* synthetic */ Object a;
                public int b;

                public C1188a(v1b v1bVar) {
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
                C1188a c1188a;
                boolean z;
                if (v1bVar instanceof C1188a) {
                    c1188a = (C1188a) v1bVar;
                    int i = c1188a.b;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        c1188a.b = i - Integer.MIN_VALUE;
                    } else {
                        c1188a = new C1188a(v1bVar);
                    }
                } else {
                    c1188a = new C1188a(v1bVar);
                }
                Object obj2 = c1188a.a;
                y5b y5bVar = y5b.a;
                int i2 = c1188a.b;
                if (i2 == 0) {
                    uj50.b(obj2);
                    d860 d860Var = (d860) obj;
                    if (d860Var instanceof d860.a) {
                        z = true;
                    } else {
                        if (!(d860Var instanceof d860.b)) {
                            uhc.a();
                            return null;
                        }
                        z = false;
                    }
                    Boolean boolValueOf = Boolean.valueOf(z);
                    c1188a.b = 1;
                    if (this.a.emit(boolValueOf, c1188a) == y5bVar) {
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

        public y0(wwd0 wwd0Var) {
            this.a = wwd0Var;
        }

        @Override // defpackage.lyh
        public final Object collect(myh<? super Boolean> myhVar, v1b v1bVar) throws Throwable {
            this.a.collect(new a(myhVar), v1bVar);
            return y5b.a;
        }
    }

    @c0d(c = "com.sportygames.speedybingo.presentation.SpeedyBingoViewModel$footerState$1", f = "SpeedyBingoViewModel.kt", l = {}, m = "invokeSuspend", v = 1)
    public static final class z extends tje0 implements kaj<hg60, wb60, wb60, d860, ia60, v1b<? super sd60>, Object> {
        public /* synthetic */ hg60 a;
        public /* synthetic */ wb60 b;
        public /* synthetic */ wb60 c;
        public /* synthetic */ d860 d;
        public /* synthetic */ ia60 e;

        public z(v1b<? super z> v1bVar) {
            super(6, v1bVar);
        }

        @Override // defpackage.kaj
        public final Object f(hg60 hg60Var, wb60 wb60Var, wb60 wb60Var2, d860 d860Var, ia60 ia60Var, v1b<? super sd60> v1bVar) {
            z zVar = new z(v1bVar);
            zVar.a = hg60Var;
            zVar.b = wb60Var;
            zVar.c = wb60Var2;
            zVar.d = d860Var;
            zVar.e = ia60Var;
            return zVar.invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            boolean z;
            hg60 hg60Var = this.a;
            wb60 wb60Var = this.b;
            wb60 wb60Var2 = this.c;
            d860 d860Var = this.d;
            ia60 ia60Var = this.e;
            y5b y5bVar = y5b.a;
            uj50.b(obj);
            hg60Var.getClass();
            wb60Var.getClass();
            wb60Var2.getClass();
            d860Var.getClass();
            ia60Var.getClass();
            int i = 0;
            List listK = kotlin.collections.b.k(wb60Var, wb60Var2);
            ArrayList arrayList = new ArrayList();
            Iterator it = listK.iterator();
            while (true) {
                wb60.a aVar = null;
                if (!it.hasNext()) {
                    if (d860Var instanceof d860.a) {
                        z = false;
                    } else {
                        if (!(d860Var instanceof d860.b)) {
                            uhc.a();
                            return null;
                        }
                        z = true;
                    }
                    String str = hg60Var.b + ' ' + tkd0.a(hg60Var.a, (4 & 2) != 0, (4 & 4) != 0);
                    BigDecimal bigDecimalValueOf = BigDecimal.valueOf(0L);
                    bigDecimalValueOf.getClass();
                    int size = arrayList.size();
                    int i2 = 0;
                    while (i2 < size) {
                        Object obj2 = arrayList.get(i2);
                        i2++;
                        wb60.a aVar2 = (wb60.a) obj2;
                        aVar2.getClass();
                        bigDecimalValueOf = bigDecimalValueOf.add(aVar2.d);
                        bigDecimalValueOf.getClass();
                    }
                    BigDecimal bigDecimal = skd0.b;
                    String strA = tkd0.a(bigDecimalValueOf, (4 & 2) != 0, (4 & 4) != 0);
                    BigDecimal bigDecimalValueOf2 = BigDecimal.valueOf(0L);
                    bigDecimalValueOf2.getClass();
                    int size2 = arrayList.size();
                    while (i < size2) {
                        Object obj3 = arrayList.get(i);
                        i++;
                        wb60.a aVar3 = (wb60.a) obj3;
                        aVar3.getClass();
                        bigDecimalValueOf2 = bigDecimalValueOf2.add(aVar3.f);
                        bigDecimalValueOf2.getClass();
                    }
                    BigDecimal bigDecimal2 = skd0.b;
                    return new sd60(str, strA, tkd0.a(bigDecimalValueOf2, (4 & 2) != 0, (4 & 4) != 0), z, ia60Var.b);
                }
                wb60 wb60Var3 = (wb60) it.next();
                if (wb60Var3 instanceof wb60.a) {
                    aVar = (wb60.a) wb60Var3;
                } else if (!(wb60Var3 instanceof wb60.b)) {
                    uhc.a();
                    return null;
                }
                if (aVar != null) {
                    arrayList.add(aVar);
                }
            }
        }
    }

    public static final class z0 implements lyh<ia60> {
        public final /* synthetic */ wwd0 a;
        public final /* synthetic */ uua0 b;

        public static final class a<T> implements myh {
            public final /* synthetic */ myh a;
            public final /* synthetic */ uua0 b;

            /* JADX INFO: renamed from: uua0$z0$a$a, reason: collision with other inner class name */
            @c0d(c = "com.sportygames.speedybingo.presentation.SpeedyBingoViewModel$special$$inlined$map$2$2", f = "SpeedyBingoViewModel.kt", l = {50}, m = "emit", v = 1)
            public static final class C1189a extends x1b {
                public /* synthetic */ Object a;
                public int b;

                public C1189a(v1b v1bVar) {
                    super(v1bVar);
                }

                @Override // defpackage.pz1
                public final Object invokeSuspend(Object obj) {
                    this.a = obj;
                    this.b |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(myh myhVar, uua0 uua0Var) {
                this.a = myhVar;
                this.b = uua0Var;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0017  */
            @Override // defpackage.myh
            public final Object emit(Object obj, v1b v1bVar) {
                C1189a c1189a;
                tj10 tj10Var = this.b.y;
                if (v1bVar instanceof C1189a) {
                    c1189a = (C1189a) v1bVar;
                    int i = c1189a.b;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        c1189a.b = i - Integer.MIN_VALUE;
                    } else {
                        c1189a = new C1189a(v1bVar);
                    }
                } else {
                    c1189a = new C1189a(v1bVar);
                }
                Object obj2 = c1189a.a;
                y5b y5bVar = y5b.a;
                int i2 = c1189a.b;
                ia60 ia60Var = null;
                if (i2 == 0) {
                    uj50.b(obj2);
                    mk50 mk50Var = (mk50) obj;
                    if (!(mk50Var instanceof mk50.a) && !Intrinsics.g(mk50Var, mk50.b.a)) {
                        if (!(mk50Var instanceof mk50.c)) {
                            uhc.a();
                            return null;
                        }
                        ia60 ia60Var2 = (ia60) ((mk50.c) mk50Var).a;
                        qcn<qcn<Integer>> qcnVar = ia60Var2.c;
                        ArrayList arrayList = new ArrayList(l48.r(qcnVar, 10));
                        Iterator<qcn<Integer>> it = qcnVar.iterator();
                        while (it.hasNext()) {
                            arrayList.add(a4h.f(kotlin.collections.b.o(it.next(), tj10Var)));
                        }
                        uf00 uf00VarF = a4h.f(kotlin.collections.b.o(arrayList, tj10Var));
                        int i3 = ia60Var2.a;
                        boolean z = ia60Var2.b;
                        BigDecimal bigDecimal = ia60Var2.d;
                        String str = ia60Var2.e;
                        boolean z2 = ia60Var2.f;
                        uf00VarF.getClass();
                        bigDecimal.getClass();
                        str.getClass();
                        ia60Var = new ia60(i3, z, uf00VarF, bigDecimal, str, z2);
                    }
                    c1189a.b = 1;
                    if (this.a.emit(ia60Var, c1189a) == y5bVar) {
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

        public z0(wwd0 wwd0Var, uua0 uua0Var) {
            this.a = wwd0Var;
            this.b = uua0Var;
        }

        @Override // defpackage.lyh
        public final Object collect(myh<? super ia60> myhVar, v1b v1bVar) throws Throwable {
            this.a.collect(new a(myhVar, this.b), v1bVar);
            return y5b.a;
        }
    }

    /* JADX WARN: Type inference failed for: r3v4, types: [tua0] */
    public uua0(kd60 kd60Var, ja60 ja60Var, wd60 wd60Var, td60 td60Var, en20 en20Var, if60 if60Var, k5b k5bVar, String str) {
        kd60Var.getClass();
        ja60Var.getClass();
        wd60Var.getClass();
        td60Var.getClass();
        en20Var.getClass();
        if60Var.getClass();
        k5bVar.getClass();
        this.a = kd60Var;
        this.b = ja60Var;
        this.c = wd60Var;
        this.d = td60Var;
        this.e = en20Var;
        this.f = if60Var;
        this.i = k5bVar;
        this.v = str;
        this.y = new tj10(new SecureRandom());
        wwd0 wwd0VarA = xwd0.a(rc60.c.a);
        this.z = wwd0VarA;
        wwd0 wwd0VarA2 = xwd0.a(tx60.e.a);
        this.A = wwd0VarA2;
        lyh booleanByFlow = en20Var.getBooleanByFlow("speedy_bingo_turbo_mode", false);
        Object obj = Boolean.FALSE;
        v340 v340VarG1 = G1(booleanByFlow, obj);
        this.B = G1(en20Var.getBooleanByFlow("speedy_bingo_one_tap_bet", false), obj);
        lyh booleanByFlow2 = en20Var.getBooleanByFlow("speedy_bingo_sound", true);
        Object obj2 = Boolean.TRUE;
        v340 v340VarG2 = G1(booleanByFlow2, obj2);
        this.C = v340VarG2;
        v340 v340VarG3 = G1(en20Var.getBooleanByFlow("speedy_bingo_music", true), obj2);
        v340 v340VarG4 = G1(new f1i(new n1i(wwd0VarA2, v340VarG1, new k(3, null))), fg60.Normal);
        this.D = v340VarG4;
        wwd0 wwd0VarA3 = xwd0.a(new d860.a());
        this.E = wwd0VarA3;
        v340 v340VarG5 = G1(new y0(wwd0VarA3), obj2);
        this.F = v340VarG5;
        mk50.b bVar = mk50.b.a;
        wwd0 wwd0VarA4 = xwd0.a(bVar);
        this.G = wwd0VarA4;
        lyh f1iVar = new f1i(new z0(wwd0VarA4, this));
        n1a0 n1a0Var = n1a0.c;
        v340 v340VarG6 = G1(f1iVar, new ia60(0, false, n1a0Var, skd0.b, "", false));
        this.H = v340VarG6;
        wwd0 wwd0VarA5 = xwd0.a(new hg60());
        this.I = wwd0VarA5;
        wwd0 wwd0VarA6 = xwd0.a(bVar);
        this.J = wwd0VarA6;
        v340 v340VarG7 = G1(new f1i(new a1(wwd0VarA6)), new xc60(null, null, 15));
        this.K = v340VarG7;
        dw1 dw1Var = new dw1();
        this.L = dw1Var;
        v340 v340VarG8 = G1(r0i.f(new f1i(r1i.c(wwd0VarA2, v340VarG6, v340VarG5, v340VarG4, v340VarG7, new b860(null))), new a860(null, dw1Var, new Function0() { // from class: tua0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                this.a.C1(ma60.B0.A0);
                return Unit.a;
            }
        })), n1a0Var);
        this.M = v340VarG8;
        wwd0 wwd0VarA7 = xwd0.a(S0());
        this.N = wwd0VarA7;
        wwd0 wwd0VarA8 = xwd0.a(S0());
        this.O = wwd0VarA8;
        wwd0 wwd0VarA9 = xwd0.a(obj);
        this.P = wwd0VarA9;
        wwd0 wwd0VarA10 = xwd0.a(new qe60.b(0.0f));
        this.Q = wwd0VarA10;
        v340 v340VarG9 = G1(new f1i(new b1(wwd0VarA10)), new qe60.c(0));
        this.R = v340VarG9;
        wwd0 wwd0VarA11 = xwd0.a(new goh0(0));
        this.S = wwd0VarA11;
        v340 v340VarG10 = G1(new n1i(v340VarG9, wwd0VarA11, new l(3, null)), new r760(0));
        this.T = v340VarG10;
        v340 v340VarG11 = G1(new n1i(wwd0VarA7, wwd0VarA8, new p(3, null)), 0);
        wwd0 wwd0VarA12 = xwd0.a(obj);
        this.U = wwd0VarA12;
        v340 v340VarG12 = G1(r1i.c(new n1i(wwd0VarA2, wwd0VarA7, new q(3, null)), new n1i(wwd0VarA3, v340VarG9, new r(3, null)), new n1i(wwd0VarA9, v340VarG11, new s(3, null)), new n1i(v340VarG7, v340VarG6, new t(3, null)), new n1i(wwd0VarA11, wwd0VarA12, new u(3, null)), new v(null)), new ub60(null, null, 0, null, 511));
        v340 v340VarG13 = G1(r1i.a(wwd0VarA7, v340VarG12, ozh.b(v340VarG8, 0, 3), new y(null)), new wb60.b(3, false));
        v340 v340VarG14 = G1(r1i.a(wwd0VarA8, v340VarG12, ozh.b(v340VarG8, 0, 3), new s0(null)), new wb60.b(3, false));
        v340 v340VarG15 = G1(r1i.c(wwd0VarA2, v340VarG6, v340VarG8, v340VarG1, new n1i(wwd0VarA11, wwd0VarA3, new n(3, null)), new o(null)), new bz2.a(0));
        v340 v340VarG16 = G1(r1i.b(v340VarG13, v340VarG14, wwd0VarA3, v340VarG9, new r0(5, null)), new do70(0));
        v340 v340VarG17 = G1(r1i.b(v340VarG9, wwd0VarA3, wwd0VarA5, v340VarG11, new m(5, null)), new fa60());
        this.V = v340VarG17;
        v340 v340VarG18 = G1(r1i.a(v340VarG13, v340VarG14, v340VarG16, new w(null)), new j(0));
        v340 v340VarG19 = G1(r1i.b(wwd0VarA2, v340VarG7, v340VarG2, v340VarG4, new x(5, null)), i4h.a.a);
        wwd0 wwd0VarA13 = xwd0.a(new xc60(null, null, 15));
        this.W = wwd0VarA13;
        v340 v340VarG20 = G1(r1i.b(wwd0VarA2, v340VarG6, wwd0VarA13, wwd0VarA12, new u0(5, null)), obj);
        v340 v340VarG21 = G1(new f1i(new n1i(wwd0VarA10, G1(r1i.c(v340VarG17, v340VarG18, v340VarG15, v340VarG19, new n1i(G1(r1i.c(wwd0VarA5, v340VarG13, v340VarG14, wwd0VarA3, v340VarG6, new z(null)), new sd60(0)), v340VarG3, new o0(3, null)), new p0(null)), new se60.b(0)), new q0(3, null))), new se60.a(0));
        this.X = G1(new c1(v340VarG9), new com.sportygames.newcms.b(0));
        this.Y = G1(new n1i(v340VarG21, wwd0VarA, new e1(3, null)), new eg60(0));
        kzh.d(new g1i(v340VarG4, new c(null)), o8i0.d(this));
        kzh.d(new g1i(new w0(uzh.b(new d1(v340VarG21))), new d(null)), o8i0.d(this));
        kzh.d(new g1i(v340VarG9, new e(null)), o8i0.d(this));
        kzh.d(new g1i(v340VarG5, new f(null)), o8i0.d(this));
        kzh.d(new g1i(v340VarG10, new g(null)), o8i0.d(this));
        kzh.d(new n1i(v340VarG11, wwd0VarA3, new h(null)), o8i0.d(this));
        kzh.d(new g1i(v340VarG20, new i(null)), o8i0.d(this));
        kzh.d(new g1i(new x0(wwd0VarA12), new a(null)), o8i0.d(this));
        ej5.c(o8i0.d(this), null, null, new b(null), 3);
    }

    public final void A1(vc60 vc60Var) {
        Object value;
        Object value2;
        Object value3;
        Object value4;
        vc60Var.getClass();
        boolean zEquals = vc60Var.equals(vc60.m.a);
        wwd0 wwd0Var = this.z;
        if (zEquals) {
            C1(ma60.B0.n0);
            wwd0Var.setValue(this.V.a.getValue());
            return;
        }
        if (vc60Var instanceof vc60.w) {
            ej5.c(o8i0.d(this), null, null, new f0(vc60Var, null), 3);
            return;
        }
        if (vc60Var instanceof vc60.d) {
            if (B1(false, ((vc60.d) vc60Var).a, new vc60.d(false), ma60.B0.o0)) {
                return;
            }
            ej5.c(o8i0.d(this), null, null, new g0(null), 3);
            return;
        }
        if (vc60Var.equals(vc60.e.a)) {
            C1(ma60.B0.u0);
            ej5.c(o8i0.d(this), null, null, new h0(null), 3);
            return;
        }
        if (vc60Var.equals(vc60.p.a)) {
            C1(ma60.B0.t0);
            ej5.c(o8i0.d(this), null, null, new i0(null), 3);
            return;
        }
        if (vc60Var.equals(vc60.h.a)) {
            ej5.c(o8i0.d(this), null, null, new j0(null), 3);
            return;
        }
        if (vc60Var instanceof vc60.o) {
            C1(ma60.B0.n0);
            ej5.c(o8i0.d(this), null, null, new k0(null), 3);
            wwd0 wwd0Var2 = ((vc60.o) vc60Var).a == 0 ? this.N : this.O;
            na60.a aVarS0 = S0();
            wwd0Var2.getClass();
            wwd0Var2.k(null, aVarS0);
            return;
        }
        if (vc60Var.equals(vc60.j.a)) {
            ej5.c(o8i0.d(this), null, null, new l0(null), 3);
            return;
        }
        if (vc60Var instanceof vc60.a) {
            C1(ma60.B0.m0);
            ej5.c(o8i0.d(this), null, null, new m0(vc60Var, null), 3);
            return;
        }
        if (vc60Var instanceof vc60.q) {
            ej5.c(o8i0.d(this), null, null, new n0(vc60Var, null), 3);
            return;
        }
        boolean z2 = vc60Var instanceof vc60.x;
        k5b k5bVar = this.i;
        if (z2) {
            if (((vc60.x) vc60Var).a) {
                C1(ma60.B0.y0);
            } else {
                C1(ma60.B0.z0);
            }
            ej5.c(o8i0.d(this), k5bVar, null, new a0(vc60Var, null), 2);
            return;
        }
        if (vc60Var instanceof vc60.t) {
            wwd0Var.setValue(((vc60.t) vc60Var).a);
            return;
        }
        if (vc60Var.equals(vc60.k.a)) {
            Object value5 = wwd0Var.getValue();
            rc60.c cVar = rc60.c.a;
            if (!Intrinsics.g(value5, cVar)) {
                wwd0Var.setValue(cVar);
                return;
            } else {
                A1(new vc60.g(true));
                Unit unit = Unit.a;
                return;
            }
        }
        if (vc60Var.equals(vc60.n.a)) {
            cg60 cg60Var = new cg60(new me90.a(this.v, ((qe60.c) this.R.a.getValue()).g));
            wwd0Var.getClass();
            wwd0Var.k(null, cg60Var);
            return;
        }
        if (vc60Var.equals(vc60.f.a)) {
            wwd0Var.setValue(rc60.c.a);
            return;
        }
        boolean zEquals2 = vc60Var.equals(vc60.c.a);
        wwd0 wwd0Var3 = this.S;
        if (zEquals2) {
            C1(ma60.B0.n0);
            dg60 dg60Var = ((goh0) wwd0Var3.getValue()).c;
            if (dg60Var instanceof dg60.a) {
                do {
                    value4 = wwd0Var3.getValue();
                } while (!wwd0Var3.g(value4, goh0.a((goh0) value4, null, false, new dg60.a(true), 3)));
                Unit unit2 = Unit.a;
                return;
            } else if (Intrinsics.g(dg60Var, dg60.b.a)) {
                wwd0Var.setValue(this.T.a.getValue());
                return;
            } else {
                uhc.a();
                return;
            }
        }
        if (vc60Var instanceof vc60.b) {
            do {
                value3 = wwd0Var3.getValue();
            } while (!wwd0Var3.g(value3, goh0.a((goh0) value3, null, ((vc60.b) vc60Var).a, null, 5)));
            Unit unit3 = Unit.a;
            return;
        }
        if (vc60Var instanceof vc60.u) {
            do {
                value2 = wwd0Var3.getValue();
            } while (!wwd0Var3.g(value2, goh0.a((goh0) value2, ((vc60.u) vc60Var).a, false, null, 6)));
            Unit unit4 = Unit.a;
            return;
        }
        if (vc60Var instanceof vc60.s) {
            if (B1(true, ((vc60.s) vc60Var).a, new vc60.s(false), new ln30().o0)) {
                return;
            }
            do {
                value = wwd0Var3.getValue();
            } while (!wwd0Var3.g(value, goh0.a((goh0) value, null, false, new dg60.a(false), 3)));
            ej5.c(o8i0.d(this), null, null, new b0(null), 3);
            return;
        }
        if (vc60Var.equals(vc60.r.a)) {
            C1(ma60.B0.w0);
            Boolean bool = Boolean.TRUE;
            wwd0 wwd0Var4 = this.U;
            wwd0Var4.getClass();
            wwd0Var4.k(null, bool);
            return;
        }
        if (vc60Var instanceof vc60.l) {
            ej5.c(o8i0.d(this), k5bVar, null, new c0(vc60Var, null), 2);
            return;
        }
        if (vc60Var instanceof vc60.g) {
            F1(null, ((vc60.g) vc60Var).a, false);
            Unit unit5 = Unit.a;
            return;
        }
        if (vc60Var.equals(vc60.i.a)) {
            this.w = false;
            this.b0 = false;
            y1();
            wwd0Var.setValue(rc60.c.a);
            return;
        }
        if (!vc60Var.equals(vc60.v.a)) {
            uhc.a();
        } else if (this.Q.getValue() instanceof qe60.c) {
            kzh.d(ozh.c(new g1i(new yzh(this.c.invoke(), new d0(3, null)), new e0(null)), k5bVar), o8i0.d(this));
        }
    }

    public final boolean B1(boolean z2, boolean z3, vc60 vc60Var, CMSRes cMSRes) {
        rc60.a aVar;
        rc60.a aVar2;
        wwd0 wwd0Var = this.z;
        if (!z3 || ((Boolean) this.B.a.getValue()).booleanValue()) {
            C1(cMSRes);
            wwd0Var.setValue(rc60.c.a);
            return false;
        }
        wwd0 wwd0Var2 = this.I;
        String str = ((hg60) wwd0Var2.getValue()).b;
        wwd0 wwd0Var3 = this.E;
        tkd0.a(((d860) wwd0Var3.getValue()).a(), (4 & 2) != 0, (4 & 4) != 0);
        String str2 = ((hg60) wwd0Var2.getValue()).b;
        String strA = tkd0.a(((d860) wwd0Var3.getValue()).a(), (4 & 2) != 0, (4 & 4) != 0);
        if (z2) {
            t760 t760Var = ((goh0) this.S.getValue()).a;
            if (Intrinsics.g(t760Var, t760.a.a) || Intrinsics.g(t760Var, t760.b.a)) {
                ma60 ma60Var = ma60.B0;
                CMSRes cMSRes2 = ma60Var.G;
                tbd tbdVar = ma60Var.e;
                aVar = new rc60.a(new CMSUiText(cMSRes2, a4h.a(str2, strA)), new CMSUiText(tbdVar.j), new CMSUiText(tbdVar.k), vc60.f.a, vc60Var);
            } else {
                if (!(t760Var instanceof t760.c)) {
                    uhc.a();
                    return false;
                }
                ma60 ma60Var2 = ma60.B0;
                CMSRes cMSRes3 = ma60Var2.F;
                tbd tbdVar2 = ma60Var2.e;
                aVar = new rc60.a(new CMSUiText(cMSRes3, a4h.a(String.valueOf(((t760.c) t760Var).a), str2, strA)), new CMSUiText(tbdVar2.j), new CMSUiText(tbdVar2.k), vc60.f.a, vc60Var);
            }
            aVar2 = aVar;
        } else {
            ma60 ma60Var3 = ma60.B0;
            CMSRes cMSRes4 = ma60Var3.E;
            tbd tbdVar3 = ma60Var3.e;
            aVar2 = new rc60.a(new CMSUiText(cMSRes4, a4h.a(str2, strA)), new CMSUiText(tbdVar3.j), new CMSUiText(tbdVar3.k), vc60.f.a, vc60Var);
        }
        wwd0Var.getClass();
        wwd0Var.k(null, aVar2);
        return true;
    }

    public final void C1(CMSRes cMSRes) {
        if (((Boolean) this.C.a.getValue()).booleanValue()) {
            ((com.sportygames.newcms.b) this.X.a.getValue()).c(cMSRes);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    public final Object D1(ojd ojdVar, x1b x1bVar) {
        ava0 ava0Var;
        if (x1bVar instanceof ava0) {
            ava0Var = (ava0) x1bVar;
            int i2 = ava0Var.d;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                ava0Var.d = i2 - Integer.MIN_VALUE;
            } else {
                ava0Var = new ava0(this, x1bVar);
            }
        } else {
            ava0Var = new ava0(this, x1bVar);
        }
        Object obj = ava0Var.b;
        y5b y5bVar = y5b.a;
        int i3 = ava0Var.d;
        try {
            if (i3 == 0) {
                uj50.b(obj);
                ava0Var.a = (m9p) ojdVar;
                ava0Var.d = 1;
                Object objAwait = ojdVar.await(ava0Var);
                return objAwait == y5bVar ? y5bVar : objAwait;
            }
            if (i3 != 1) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            uj50.b(obj);
            return obj;
        } catch (Throwable unused) {
            ojdVar.cancel((CancellationException) null);
            return null;
        }
    }

    public final void E1() {
        v340 v340Var = this.H;
        if (((ia60) v340Var.a.getValue()).b || ((xc60) this.K.a.getValue()).a == ((ia60) v340Var.a.getValue()).a) {
            return;
        }
        jvd0 jvd0Var = this.a0;
        if (jvd0Var != null) {
            jvd0Var.cancel((CancellationException) null);
        }
        this.a0 = kzh.d(new g1i(this.d.a(((ia60) v340Var.a.getValue()).a), new t0(null)), o8i0.d(this));
    }

    public final void F1(UiText uiText, boolean z2, boolean z3) {
        kzh.d(new g1i(this.f.a(this.v), new v0(uiText, z2, z3, null)), o8i0.d(this));
    }

    public final v340 G1(lyh lyhVar, Object obj) {
        return e1i.e(ozh.c(lyhVar, this.i), o8i0.d(this), q490.a.a, obj);
    }

    @Override // defpackage.fb60
    public final lx30 M0() {
        return this.y;
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0049  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0055, code lost:
    
        if (kotlin.Unit.a == r1) goto L25;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object x1(defpackage.x1b r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof defpackage.vua0
            if (r0 == 0) goto L13
            r0 = r7
            vua0 r0 = (defpackage.vua0) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            vua0 r0 = new vua0
            r0.<init>(r6, r7)
        L18:
            java.lang.Object r7 = r0.a
            y5b r1 = defpackage.y5b.a
            int r2 = r0.c
            r3 = 0
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L35
            if (r2 == r5) goto L31
            if (r2 != r4) goto L2b
            defpackage.uj50.b(r7)
            goto L58
        L2b:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.ib5.a(r6)
            return r3
        L31:
            defpackage.uj50.b(r7)
            goto L45
        L35:
            defpackage.uj50.b(r7)
            pjd r7 = r6.Z
            if (r7 == 0) goto L58
            r0.c = r5
            java.lang.Object r7 = r6.D1(r7, r0)
            if (r7 != r1) goto L45
            goto L57
        L45:
            hg60 r7 = (defpackage.hg60) r7
            if (r7 == 0) goto L58
            r0.c = r4
            wwd0 r0 = r6.I
            r0.getClass()
            r0.k(r3, r7)
            kotlin.Unit r7 = kotlin.Unit.a
            if (r7 != r1) goto L58
        L57:
            return r1
        L58:
            r6.Z = r3
            kotlin.Unit r6 = kotlin.Unit.a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.uua0.x1(x1b):java.lang.Object");
    }

    public final void y1() {
        if (this.w) {
            return;
        }
        this.w = true;
        kd60 kd60Var = this.a;
        String str = this.v;
        kzh.d(new g1i(kd60Var.b(str), new xua0(this, null)), o8i0.d(this));
        kzh.d(this.f.a(str), o8i0.d(this));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0060, code lost:
    
        if (kotlin.Unit.a == r1) goto L25;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object z1(java.lang.Throwable r7, defpackage.x1b r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof defpackage.zua0
            if (r0 == 0) goto L13
            r0 = r8
            zua0 r0 = (defpackage.zua0) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            zua0 r0 = new zua0
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
            v340 r8 = r6.X
            uwd0<T> r8 = r8.a
            java.lang.Object r8 = r8.getValue()
            com.sportygames.newcms.b r8 = (com.sportygames.newcms.b) r8
            r0.c = r5
            wwd0 r8 = r6.A
            java.lang.Object r8 = defpackage.tc60.D0(r6, r7, r8, r0)
            if (r8 != r1) goto L4d
            goto L62
        L4d:
            rc60 r8 = (defpackage.rc60) r8
            if (r8 != 0) goto L54
            kotlin.Unit r6 = kotlin.Unit.a
            return r6
        L54:
            r0.c = r4
            wwd0 r6 = r6.z
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
        throw new UnsupportedOperationException("Method not decompiled: defpackage.uua0.z1(java.lang.Throwable, x1b):java.lang.Object");
    }

    public static final class j {
        public final wb60 a;
        public final wb60 b;
        public final do70 c;
        public final dw1 d;

        public /* synthetic */ j(int i) {
            this(new wb60.b(3, false), new wb60.b(3, false), new do70(0), new dw1());
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof j)) {
                return false;
            }
            j jVar = (j) obj;
            return Intrinsics.g(this.a, jVar.a) && Intrinsics.g(this.b, jVar.b) && Intrinsics.g(this.c, jVar.c) && Intrinsics.g(this.d, jVar.d);
        }

        public final int hashCode() {
            return this.d.hashCode() + shu.a(this.c.a, (this.b.hashCode() + (this.a.hashCode() * 31)) * 31, 31);
        }

        public final String toString() {
            return "CardsInternalState(firstCard=" + this.a + ", secondCard=" + this.b + ", scoreLayoutState=" + this.c + ", ballPoolState=" + this.d + ')';
        }

        public j(wb60 wb60Var, wb60 wb60Var2, do70 do70Var, dw1 dw1Var) {
            wb60Var.getClass();
            wb60Var2.getClass();
            do70Var.getClass();
            dw1Var.getClass();
            this.a = wb60Var;
            this.b = wb60Var2;
            this.c = do70Var;
            this.d = dw1Var;
        }

        public j() {
            this(0);
        }
    }
}
