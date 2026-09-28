package defpackage;

import com.sportybet.android.gp.tz.R;
import java.util.Iterator;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class vx00 extends j8i0 {
    public final aum A;
    public final ztm B;
    public final btm C;
    public final fsm D;
    public final e0n E;
    public final ptm F;
    public final yzm G;
    public final String H;
    public final v340 I;
    public final wwd0 J;
    public jvd0 K;
    public jvd0 L;
    public final wwd0 M;
    public final wwd0 N;
    public final wwd0 O;
    public final wwd0 P;
    public final wwd0 Q;
    public final v340 R;
    public final wwd0 S;
    public final wwd0 T;
    public final wwd0 U;
    public final v340 V;
    public final v340 W;
    public final wwd0 X;
    public final b390 Y;
    public final b390 Z;
    public final en20 a;
    public final wwd0 a0;
    public final vtm b;
    public final wwd0 b0;
    public final jum c;
    public final com.sportygames.newcms.d d;
    public final atm e;
    public final fym f;
    public final oym i;
    public final rtm v;
    public final dzm w;
    public final sum y;
    public final mtm z;

    @c0d(c = "com.sportygames.piggybash.presentation.viewmodel.PiggyBashViewModel$bgMusicState$1", f = "PiggyBashViewModel.kt", l = {}, m = "invokeSuspend", v = 1)
    public static final class a extends tje0 implements jaj<Boolean, sx00, cp20, Boolean, v1b<? super ju00>, Object> {
        public /* synthetic */ boolean a;
        public /* synthetic */ sx00 b;
        public /* synthetic */ cp20 c;
        public /* synthetic */ boolean d;

        /* JADX INFO: renamed from: vx00$a$a, reason: collision with other inner class name */
        public static final /* synthetic */ class C1229a {
            public static final /* synthetic */ int[] a;

            static {
                int[] iArr = new int[cp20.values().length];
                try {
                    cp20 cp20Var = cp20.a;
                    iArr[1] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    cp20 cp20Var2 = cp20.a;
                    iArr[2] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    cp20 cp20Var3 = cp20.a;
                    iArr[3] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    cp20 cp20Var4 = cp20.a;
                    iArr[0] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                a = iArr;
            }
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            boolean z = this.a;
            sx00 sx00Var = this.b;
            cp20 cp20Var = this.c;
            boolean z2 = this.d;
            y5b y5bVar = y5b.a;
            uj50.b(obj);
            if (!z) {
                return ju00.b.a;
            }
            if (Intrinsics.g(sx00Var, sxs.a)) {
                return ju00.b.a;
            }
            if (Intrinsics.g(sx00Var, xzs.a)) {
                return new ju00.a(lu00.b2.o1);
            }
            if (Intrinsics.g(sx00Var, g7v.a) || Intrinsics.g(sx00Var, yi50.a)) {
                int i = cp20Var == null ? -1 : C1229a.a[cp20Var.ordinal()];
                if (i == -1) {
                    return ju00.b.a;
                }
                if (i == 1) {
                    return new ju00.a(lu00.b2.p1);
                }
                if (i == 2) {
                    return new ju00.a(lu00.b2.r1);
                }
                if (i == 3) {
                    return new ju00.a(lu00.b2.t1);
                }
                if (i == 4) {
                    return new ju00.a(lu00.b2.v1);
                }
                uhc.a();
                return null;
            }
            if (!Intrinsics.g(sx00Var, noj.a)) {
                uhc.a();
                return null;
            }
            int i2 = cp20Var == null ? -1 : C1229a.a[cp20Var.ordinal()];
            if (i2 == -1) {
                return ju00.b.a;
            }
            if (i2 == 1) {
                return new ju00.a(z2 ? lu00.b2.q1 : lu00.b2.p1);
            }
            if (i2 == 2) {
                return new ju00.a(z2 ? lu00.b2.s1 : lu00.b2.r1);
            }
            if (i2 == 3) {
                return new ju00.a(z2 ? lu00.b2.u1 : lu00.b2.t1);
            }
            if (i2 == 4) {
                return new ju00.a(z2 ? lu00.b2.w1 : lu00.b2.v1);
            }
            uhc.a();
            return null;
        }

        @Override // defpackage.jaj
        public final Object l(Boolean bool, sx00 sx00Var, cp20 cp20Var, Boolean bool2, v1b<? super ju00> v1bVar) {
            boolean zBooleanValue = bool.booleanValue();
            boolean zBooleanValue2 = bool2.booleanValue();
            a aVar = new a(5, v1bVar);
            aVar.a = zBooleanValue;
            aVar.b = sx00Var;
            aVar.c = cp20Var;
            aVar.d = zBooleanValue2;
            return aVar.invokeSuspend(Unit.a);
        }
    }

    @c0d(c = "com.sportygames.piggybash.presentation.viewmodel.PiggyBashViewModel$onLoadResources$1", f = "PiggyBashViewModel.kt", l = {323}, m = "invokeSuspend", v = 1)
    public static final class b extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public int a;

        @c0d(c = "com.sportygames.piggybash.presentation.viewmodel.PiggyBashViewModel$onLoadResources$1$2", f = "PiggyBashViewModel.kt", l = {}, m = "invokeSuspend", v = 1)
        public static final class a extends tje0 implements Function2<com.sportygames.newcms.b, v1b<? super Unit>, Object> {
            @Override // defpackage.pz1
            public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
                return new a(2, v1bVar);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(com.sportygames.newcms.b bVar, v1b<? super Unit> v1bVar) {
                return ((a) create(bVar, v1bVar)).invokeSuspend(Unit.a);
            }

            @Override // defpackage.pz1
            public final Object invokeSuspend(Object obj) {
                y5b y5bVar = y5b.a;
                uj50.b(obj);
                return Unit.a;
            }
        }

        /* JADX INFO: renamed from: vx00$b$b, reason: collision with other inner class name */
        @c0d(c = "com.sportygames.piggybash.presentation.viewmodel.PiggyBashViewModel$onLoadResources$1$3", f = "PiggyBashViewModel.kt", l = {321, 322}, m = "invokeSuspend", v = 1)
        public static final class C1230b extends tje0 implements gaj<myh<? super xxs<com.sportygames.newcms.b>>, Throwable, v1b<? super Unit>, Object> {
            public int a;
            public /* synthetic */ Throwable b;
            public final /* synthetic */ vx00 c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C1230b(vx00 vx00Var, v1b<? super C1230b> v1bVar) {
                super(3, v1bVar);
                this.c = vx00Var;
            }

            @Override // defpackage.gaj
            public final Object invoke(myh<? super xxs<com.sportygames.newcms.b>> myhVar, Throwable th, v1b<? super Unit> v1bVar) {
                C1230b c1230b = new C1230b(this.c, v1bVar);
                c1230b.b = th;
                return c1230b.invokeSuspend(Unit.a);
            }

            /* JADX WARN: Code restructure failed: missing block: B:14:0x0044, code lost:
            
                if (r9.a(r0) == r1) goto L15;
             */
            @Override // defpackage.pz1
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object invokeSuspend(java.lang.Object r9) {
                /*
                    r8 = this;
                    java.lang.Throwable r0 = r8.b
                    y5b r1 = defpackage.y5b.a
                    int r2 = r8.a
                    r3 = 0
                    vx00 r4 = r8.c
                    r5 = 2
                    r6 = 1
                    if (r2 == 0) goto L1f
                    if (r2 == r6) goto L1b
                    if (r2 != r5) goto L15
                    defpackage.uj50.b(r9)
                    goto L47
                L15:
                    java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
                    defpackage.ib5.a(r8)
                    return r3
                L1b:
                    defpackage.uj50.b(r9)
                    goto L3a
                L1f:
                    defpackage.uj50.b(r9)
                    wwd0 r9 = r4.O
                    nu00$g r2 = new nu00$g
                    kmx$b r7 = kmx.b.a
                    r2.<init>(r7)
                    r8.b = r0
                    r8.a = r6
                    r9.getClass()
                    r9.k(r3, r2)
                    kotlin.Unit r9 = kotlin.Unit.a
                    if (r9 != r1) goto L3a
                    goto L46
                L3a:
                    yzm r9 = r4.G
                    r8.b = r3
                    r8.a = r5
                    kotlin.Unit r8 = r9.a(r0)
                    if (r8 != r1) goto L47
                L46:
                    return r1
                L47:
                    kotlin.Unit r8 = kotlin.Unit.a
                    return r8
                */
                throw new UnsupportedOperationException("Method not decompiled: vx00.b.C1230b.invokeSuspend(java.lang.Object):java.lang.Object");
            }
        }

        public static final class c<T> implements myh {
            public final /* synthetic */ vx00 a;

            @c0d(c = "com.sportygames.piggybash.presentation.viewmodel.PiggyBashViewModel$onLoadResources$1$4", f = "PiggyBashViewModel.kt", l = {325, 326}, m = "emit", v = 1)
            public static final class a extends x1b {
                public vx00 a;
                public int b;
                public /* synthetic */ Object c;
                public final /* synthetic */ c<T> d;
                public int e;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                public a(c<? super T> cVar, v1b<? super a> v1bVar) {
                    super(v1bVar);
                    this.d = cVar;
                }

                @Override // defpackage.pz1
                public final Object invokeSuspend(Object obj) {
                    this.c = obj;
                    this.e |= Integer.MIN_VALUE;
                    return this.d.emit(null, this);
                }
            }

            public c(vx00 vx00Var) {
                this.a = vx00Var;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            /* JADX WARN: Code restructure failed: missing block: B:23:0x0068, code lost:
            
                if (r7.x1(r0) == r1) goto L24;
             */
            @Override // defpackage.myh
            /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object emit(defpackage.xxs<com.sportygames.newcms.b> r7, defpackage.v1b<? super kotlin.Unit> r8) {
                /*
                    r6 = this;
                    boolean r0 = r8 instanceof vx00.b.c.a
                    if (r0 == 0) goto L13
                    r0 = r8
                    vx00$b$c$a r0 = (vx00.b.c.a) r0
                    int r1 = r0.e
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.e = r1
                    goto L18
                L13:
                    vx00$b$c$a r0 = new vx00$b$c$a
                    r0.<init>(r6, r8)
                L18:
                    java.lang.Object r8 = r0.c
                    y5b r1 = defpackage.y5b.a
                    int r2 = r0.e
                    r3 = 2
                    r4 = 1
                    r5 = 0
                    if (r2 == 0) goto L3d
                    if (r2 == r4) goto L35
                    if (r2 != r3) goto L2f
                    vx00 r6 = r0.a
                    com.sportygames.newcms.b r6 = (com.sportygames.newcms.b) r6
                    defpackage.uj50.b(r8)
                    goto L6b
                L2f:
                    java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                    defpackage.ib5.a(r6)
                    return r5
                L35:
                    int r6 = r0.b
                    vx00 r7 = r0.a
                    defpackage.uj50.b(r8)
                    goto L5e
                L3d:
                    defpackage.uj50.b(r8)
                    T r7 = r7.b
                    com.sportygames.newcms.b r7 = (com.sportygames.newcms.b) r7
                    if (r7 == 0) goto L6b
                    vx00 r6 = r6.a
                    wwd0 r8 = r6.M
                    r0.a = r6
                    r2 = 0
                    r0.b = r2
                    r0.e = r4
                    r8.getClass()
                    r8.k(r5, r7)
                    kotlin.Unit r7 = kotlin.Unit.a
                    if (r7 != r1) goto L5c
                    goto L6a
                L5c:
                    r7 = r6
                    r6 = r2
                L5e:
                    r0.a = r5
                    r0.b = r6
                    r0.e = r3
                    java.lang.Object r6 = r7.x1(r0)
                    if (r6 != r1) goto L6b
                L6a:
                    return r1
                L6b:
                    kotlin.Unit r6 = kotlin.Unit.a
                    return r6
                */
                throw new UnsupportedOperationException("Method not decompiled: vx00.b.c.emit(xxs, v1b):java.lang.Object");
            }
        }

        public b(v1b<? super b> v1bVar) {
            super(2, v1bVar);
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            return vx00.this.new b(v1bVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
            return ((b) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            y5b y5bVar = y5b.a;
            int i = this.a;
            if (i == 0) {
                uj50.b(obj);
                vx00 vx00Var = vx00.this;
                yzh yzhVar = new yzh(vx00Var.d.a(new jy00(), new a(2, null)).a, new C1230b(vx00Var, null));
                c cVar = new c(vx00Var);
                this.a = 1;
                if (yzhVar.collect(cVar, this) == y5bVar) {
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

    @c0d(c = "com.sportygames.piggybash.presentation.viewmodel.PiggyBashViewModel$sidePanelState$1$1", f = "PiggyBashViewModel.kt", l = {}, m = "invokeSuspend", v = 1)
    public static final class c extends tje0 implements iaj<Boolean, Boolean, Pair<? extends String, ? extends String>, v1b<? super mx00>, Object> {
        public /* synthetic */ boolean a;
        public /* synthetic */ boolean b;
        public /* synthetic */ Pair c;

        @Override // defpackage.iaj
        public final Object d(Boolean bool, Boolean bool2, Pair<? extends String, ? extends String> pair, v1b<? super mx00> v1bVar) {
            boolean zBooleanValue = bool.booleanValue();
            boolean zBooleanValue2 = bool2.booleanValue();
            c cVar = new c(4, v1bVar);
            cVar.a = zBooleanValue;
            cVar.b = zBooleanValue2;
            cVar.c = pair;
            return cVar.invokeSuspend(Unit.a);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            boolean z = this.a;
            boolean z2 = this.b;
            Pair pair = this.c;
            y5b y5bVar = y5b.a;
            uj50.b(obj);
            String str = (String) pair.a;
            String str2 = (String) pair.b;
            lu00 lu00Var = lu00.b2;
            return new mx00(a4h.f(kotlin.collections.b.k(new tw00.b(R.drawable.music, lu00Var.K, z, new uw00.a("key-piggy-bash-music")), new tw00.b(R.drawable.ic_sound, lu00Var.L, z2, new uw00.a("key-piggy-bash-sound")), new tw00.a(R.drawable.ic_how_to_play, lu00Var.M, new uw00.b(lx00.b.a)), new tw00.a(R.drawable.ic_bethistory, lu00Var.N, new uw00.b(lx00.a.a)))), str, str2);
        }
    }

    @c0d(c = "com.sportygames.piggybash.presentation.viewmodel.PiggyBashViewModel", f = "PiggyBashViewModel.kt", l = {478, 477, 480, 481}, m = "startGameplayScreen", v = 1)
    public static final class d extends x1b {
        public wwd0 a;
        public /* synthetic */ Object b;
        public int d;

        public d(v1b<? super d> v1bVar) {
            super(v1bVar);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            this.b = obj;
            this.d |= Integer.MIN_VALUE;
            return vx00.this.F1(this);
        }
    }

    @c0d(c = "com.sportygames.piggybash.presentation.viewmodel.PiggyBashViewModel$trackPiggyBashEvent$1", f = "PiggyBashViewModel.kt", l = {239}, m = "invokeSuspend", v = 1)
    public static final class e extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ pu00 c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(pu00 pu00Var, v1b<? super e> v1bVar) {
            super(2, v1bVar);
            this.c = pu00Var;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            return vx00.this.new e(this.c, v1bVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
            return ((e) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            y5b y5bVar = y5b.a;
            int i = this.a;
            if (i == 0) {
                uj50.b(obj);
                yzm yzmVar = vx00.this.G;
                String str = this.c.a;
                this.a = 1;
                if (yzmVar.b(str) == y5bVar) {
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

    public vx00(en20 en20Var, vtm vtmVar, jum jumVar, com.sportygames.newcms.d dVar, atm atmVar, fym fymVar, oym oymVar, rtm rtmVar, dzm dzmVar, sum sumVar, mtm mtmVar, aum aumVar, ztm ztmVar, btm btmVar, fsm fsmVar, e0n e0nVar, ptm ptmVar, yzm yzmVar, String str) {
        en20Var.getClass();
        vtmVar.getClass();
        jumVar.getClass();
        dVar.getClass();
        atmVar.getClass();
        fymVar.getClass();
        oymVar.getClass();
        rtmVar.getClass();
        dzmVar.getClass();
        sumVar.getClass();
        mtmVar.getClass();
        aumVar.getClass();
        ztmVar.getClass();
        btmVar.getClass();
        fsmVar.getClass();
        e0nVar.getClass();
        ptmVar.getClass();
        yzmVar.getClass();
        this.a = en20Var;
        this.b = vtmVar;
        this.c = jumVar;
        this.d = dVar;
        this.e = atmVar;
        this.f = fymVar;
        this.i = oymVar;
        this.v = rtmVar;
        this.w = dzmVar;
        this.y = sumVar;
        this.z = mtmVar;
        this.A = aumVar;
        this.B = ztmVar;
        this.C = btmVar;
        this.D = fsmVar;
        this.E = e0nVar;
        this.F = ptmVar;
        this.G = yzmVar;
        this.H = str;
        hn20 booleanByFlow = en20Var.getBooleanByFlow("PIGGY_BASH_REACTION_TRAY_EXPANDED_KEY", true);
        et7 et7VarD = o8i0.d(this);
        Boolean bool = Boolean.TRUE;
        kwd0 kwd0Var = q490.a.a;
        this.I = e1i.e(booleanByFlow, et7VarD, kwd0Var, bool);
        int i = 0;
        this.J = xwd0.a(new yav(i));
        this.M = xwd0.a(new com.sportygames.newcms.b(0));
        wwd0 wwd0VarA = xwd0.a(sxs.a);
        this.N = wwd0VarA;
        this.O = xwd0.a(nu00.h.a);
        this.P = xwd0.a(lx00.c.a);
        wwd0 wwd0VarA2 = xwd0.a(new Pair(dzmVar.d(), dzmVar.b()));
        this.Q = wwd0VarA2;
        this.R = e1i.e(r1i.a(dzmVar.c(), dzmVar.e(), wwd0VarA2, new c(4, null)), o8i0.d(this), kwd0Var, new mx00(0));
        this.S = xwd0.a(a4h.f(m2g.a));
        wwd0 wwd0VarA3 = xwd0.a(null);
        this.T = wwd0VarA3;
        wwd0 wwd0VarA4 = xwd0.a(Boolean.FALSE);
        this.U = wwd0VarA4;
        this.V = e1i.e(dzmVar.e(), o8i0.d(this), kwd0Var, bool);
        this.W = e1i.e(r1i.b(dzmVar.c(), wwd0VarA, wwd0VarA3, wwd0VarA4, new a(5, null)), o8i0.d(this), kwd0Var, ju00.b.a);
        this.X = xwd0.a(new drj(0.0d, null, 0, 0, 0, 0, null, 4095));
        this.Y = d390.b(0, 10, null, 5);
        this.Z = d390.b(0, 10, null, 5);
        this.a0 = xwd0.a(new zj50(0));
        this.b0 = xwd0.a(new vxi0(i));
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0059  */
    /* JADX WARN: Code duplicated, block: B:28:0x0066  */
    /* JADX WARN: Code duplicated, block: B:30:0x006c  */
    /* JADX WARN: Code duplicated, block: B:35:0x008c  */
    /* JADX WARN: Code duplicated, block: B:37:0x0090  */
    /* JADX WARN: Code duplicated, block: B:40:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:45:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:47:0x00b9  */
    /* JADX WARN: Code duplicated, block: B:52:0x00d3  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0060, code lost:
    
        if (E1(r0) == r1) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0086, code lost:
    
        if (kotlin.Unit.a == r1) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00af, code lost:
    
        if (F1(r0) == r1) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00cd, code lost:
    
        if (kotlin.Unit.a == r1) goto L49;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object A1(defpackage.x1b r6) {
        /*
            Method dump skipped, instruction units count: 234
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vx00.A1(x1b):java.lang.Object");
    }

    public final void B1(double d2, long j, ap20 ap20Var, String str, String str2, boolean z) {
        Object next;
        Iterator it = ((Iterable) this.S.getValue()).iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (((dp20) next).a != j);
        dp20 dp20Var = (dp20) next;
        this.T.setValue(dp20Var != null ? dp20Var.h : null);
        nu00.b bVar = new nu00.b(d2, j, ap20Var, str2, str, z);
        wwd0 wwd0Var = this.O;
        wwd0Var.getClass();
        wwd0Var.k(null, bVar);
    }

    public final void C1() {
        ej5.c(o8i0.d(this), null, null, new b(null), 3);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x0124, code lost:
    
        if (kotlin.Unit.a == r3) goto L78;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x0143, code lost:
    
        if (kotlin.Unit.a == r3) goto L78;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object D1(defpackage.ap20 r27, defpackage.x1b r28) {
        /*
            Method dump skipped, instruction units count: 329
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vx00.D1(ap20, x1b):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:37:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00b2, code lost:
    
        if (kotlin.Unit.a == r1) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00cb, code lost:
    
        if (kotlin.Unit.a == r1) goto L44;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object E1(defpackage.x1b r10) {
        /*
            Method dump skipped, instruction units count: 209
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vx00.E1(x1b):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:33:0x00de  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00e5, code lost:
    
        if (r6.d(r2) == r3) goto L36;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object F1(defpackage.v1b<? super kotlin.Unit> r25) {
        /*
            Method dump skipped, instruction units count: 235
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vx00.F1(v1b):java.lang.Object");
    }

    public final void G1(pu00 pu00Var) {
        ej5.c(o8i0.d(this), null, null, new e(pu00Var, null), 3);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0075, code lost:
    
        if (A1(r0) == r1) goto L23;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object H1(defpackage.x1b r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof defpackage.ry00
            if (r0 == 0) goto L13
            r0 = r7
            ry00 r0 = (defpackage.ry00) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            ry00 r0 = new ry00
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
            goto L78
        L2b:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.ib5.a(r6)
            return r3
        L31:
            defpackage.uj50.b(r7)
            goto L43
        L35:
            defpackage.uj50.b(r7)
            r0.c = r5
            e0n r7 = r6.E
            java.lang.Object r7 = r7.a(r0)
            if (r7 != r1) goto L43
            goto L77
        L43:
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            boolean r7 = r7.booleanValue()
            if (r7 == 0) goto L7b
            dzm r7 = r6.w
            java.lang.String r2 = r7.d()
            java.lang.String r7 = r7.b()
            kotlin.Pair r5 = new kotlin.Pair
            r5.<init>(r2, r7)
            wwd0 r7 = r6.Q
            r7.getClass()
            r7.k(r3, r5)
            et7 r7 = defpackage.o8i0.d(r6)
            sy00 r2 = new sy00
            r2.<init>(r6, r3)
            r5 = 3
            defpackage.ej5.c(r7, r3, r3, r2, r5)
            r0.c = r4
            java.lang.Object r6 = r6.A1(r0)
            if (r6 != r1) goto L78
        L77:
            return r1
        L78:
            kotlin.Unit r6 = kotlin.Unit.a
            return r6
        L7b:
            kotlin.Unit r6 = kotlin.Unit.a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vx00.H1(x1b):java.lang.Object");
    }

    @Override // defpackage.j8i0
    public final void onCleared() {
        super.onCleared();
        this.z.b();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0057, code lost:
    
        if (H1(r0) == r1) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0065, code lost:
    
        if (kotlin.Unit.a == r1) goto L30;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object x1(defpackage.x1b r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof defpackage.tx00
            if (r0 == 0) goto L13
            r0 = r7
            tx00 r0 = (defpackage.tx00) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            tx00 r0 = new tx00
            r0.<init>(r6, r7)
        L18:
            java.lang.Object r7 = r0.a
            y5b r1 = defpackage.y5b.a
            int r2 = r0.c
            r3 = 3
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L39
            if (r2 == r5) goto L35
            if (r2 == r4) goto L31
            if (r2 != r3) goto L2a
            goto L31
        L2a:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.ib5.a(r6)
            r6 = 0
            return r6
        L31:
            defpackage.uj50.b(r7)
            goto L68
        L35:
            defpackage.uj50.b(r7)
            goto L47
        L39:
            defpackage.uj50.b(r7)
            r0.c = r5
            fsm r7 = r6.D
            java.lang.Object r7 = r7.a(r0)
            if (r7 != r1) goto L47
            goto L67
        L47:
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            if (r7 == 0) goto L68
            boolean r7 = r7.booleanValue()
            if (r7 == 0) goto L5a
            r0.c = r4
            java.lang.Object r6 = r6.H1(r0)
            if (r6 != r1) goto L68
            goto L67
        L5a:
            nu00$d r7 = nu00.d.a
            r0.c = r3
            wwd0 r6 = r6.O
            r6.setValue(r7)
            kotlin.Unit r6 = kotlin.Unit.a
            if (r6 != r1) goto L68
        L67:
            return r1
        L68:
            kotlin.Unit r6 = kotlin.Unit.a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vx00.x1(x1b):java.lang.Object");
    }

    public final void y1() {
        this.O.setValue(nu00.h.a);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0060, code lost:
    
        if (kotlin.Unit.a == r1) goto L23;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object z1(defpackage.x1b r11) {
        /*
            r10 = this;
            boolean r0 = r11 instanceof defpackage.wx00
            if (r0 == 0) goto L13
            r0 = r11
            wx00 r0 = (defpackage.wx00) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            wx00 r0 = new wx00
            r0.<init>(r10, r11)
        L18:
            java.lang.Object r11 = r0.a
            y5b r1 = defpackage.y5b.a
            int r2 = r0.c
            r3 = 0
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L35
            if (r2 == r5) goto L31
            if (r2 != r4) goto L2b
            defpackage.uj50.b(r11)
            goto L63
        L2b:
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.ib5.a(r10)
            return r3
        L31:
            defpackage.uj50.b(r11)
            goto L43
        L35:
            defpackage.uj50.b(r11)
            r0.c = r5
            aum r11 = r10.A
            java.lang.Object r11 = r11.a(r0)
            if (r11 != r1) goto L43
            goto L62
        L43:
            hxi0 r11 = (defpackage.hxi0) r11
            java.lang.String r2 = r11.b
            int r2 = r2.length()
            if (r2 != 0) goto L66
            nu00$g r11 = new nu00$g
            kmx$h r2 = kmx.h.a
            r11.<init>(r2)
            r0.c = r4
            wwd0 r10 = r10.O
            r10.getClass()
            r10.k(r3, r11)
            kotlin.Unit r10 = kotlin.Unit.a
            if (r10 != r1) goto L63
        L62:
            return r1
        L63:
            kotlin.Unit r10 = kotlin.Unit.a
            return r10
        L66:
            wwd0 r10 = r10.b0
            java.lang.Object r0 = r10.getValue()
            vxi0 r0 = (defpackage.vxi0) r0
            double r5 = r11.a
            java.lang.String r1 = r0.b
            int r1 = r1.length()
            if (r1 <= 0) goto L7e
            double r0 = r0.a
            double r0 = r5 - r0
        L7c:
            r8 = r0
            goto L81
        L7e:
            r0 = 0
            goto L7c
        L81:
            vxi0 r4 = new vxi0
            java.lang.String r7 = r11.b
            r4.<init>(r5, r7, r8)
            r10.getClass()
            r10.k(r3, r4)
            kotlin.Unit r10 = kotlin.Unit.a
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vx00.z1(x1b):java.lang.Object");
    }
}
