package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
@c0d(c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapGestures$2", f = "TapGestureDetector.kt", l = {104}, m = "invokeSuspend")
public final class y4f0 extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public int a;
    public /* synthetic */ Object b;
    public final /* synthetic */ u020 c;
    public final /* synthetic */ gaj<ip20, gly, v1b<? super Unit>, Object> d;
    public final /* synthetic */ Function1<gly, Unit> e;
    public final /* synthetic */ Function1<gly, Unit> f;
    public final /* synthetic */ Function1<gly, Unit> i;

    @c0d(c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapGestures$2$1", f = "TapGestureDetector.kt", l = {105, 116, 119, 122, 149, 167, 169, 180}, m = "invokeSuspend")
    public static final class a extends ji50 implements Function2<vp1, v1b<? super Unit>, Object> {
        public final /* synthetic */ lp20 A;
        public Object b;
        public Object c;
        public m020 d;
        public int e;
        public /* synthetic */ Object f;
        public final /* synthetic */ v5b i;
        public final /* synthetic */ gaj<ip20, gly, v1b<? super Unit>, Object> v;
        public final /* synthetic */ Function1<gly, Unit> w;
        public final /* synthetic */ Function1<gly, Unit> y;
        public final /* synthetic */ Function1<gly, Unit> z;

        /* JADX INFO: renamed from: y4f0$a$a, reason: collision with other inner class name */
        @c0d(c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapGestures$2$1$1", f = "TapGestureDetector.kt", l = {110}, m = "invokeSuspend")
        public static final class C1326a extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
            public int a;
            public final /* synthetic */ gaj<ip20, gly, v1b<? super Unit>, Object> b;
            public final /* synthetic */ lp20 c;
            public final /* synthetic */ m020 d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public C1326a(gaj<? super ip20, ? super gly, ? super v1b<? super Unit>, ? extends Object> gajVar, lp20 lp20Var, m020 m020Var, v1b<? super C1326a> v1bVar) {
                super(2, v1bVar);
                this.b = gajVar;
                this.c = lp20Var;
                this.d = m020Var;
            }

            @Override // defpackage.pz1
            public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
                return new C1326a(this.b, this.c, this.d, v1bVar);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
                return ((C1326a) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
            }

            @Override // defpackage.pz1
            public final Object invokeSuspend(Object obj) {
                y5b y5bVar = y5b.a;
                int i = this.a;
                if (i == 0) {
                    uj50.b(obj);
                    gly glyVar = new gly(this.d.c);
                    this.a = 1;
                    if (this.b.invoke(this.c, glyVar, this) == y5bVar) {
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

        @c0d(c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapGestures$2$1$2", f = "TapGestureDetector.kt", l = {}, m = "invokeSuspend")
        public static final class b extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
            public final /* synthetic */ lp20 a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(lp20 lp20Var, v1b<? super b> v1bVar) {
                super(2, v1bVar);
                this.a = lp20Var;
            }

            @Override // defpackage.pz1
            public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
                return new b(this.a, v1bVar);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
                return ((b) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
            }

            @Override // defpackage.pz1
            public final Object invokeSuspend(Object obj) {
                y5b y5bVar = y5b.a;
                uj50.b(obj);
                this.a.g();
                return Unit.a;
            }
        }

        @c0d(c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapGestures$2$1$3", f = "TapGestureDetector.kt", l = {}, m = "invokeSuspend")
        public static final class c extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
            public final /* synthetic */ lp20 a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public c(lp20 lp20Var, v1b<? super c> v1bVar) {
                super(2, v1bVar);
                this.a = lp20Var;
            }

            @Override // defpackage.pz1
            public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
                return new c(this.a, v1bVar);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
                return ((c) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
            }

            @Override // defpackage.pz1
            public final Object invokeSuspend(Object obj) {
                y5b y5bVar = y5b.a;
                uj50.b(obj);
                this.a.e();
                return Unit.a;
            }
        }

        @c0d(c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapGestures$2$1$4", f = "TapGestureDetector.kt", l = {}, m = "invokeSuspend")
        public static final class d extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
            public final /* synthetic */ lp20 a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public d(lp20 lp20Var, v1b<? super d> v1bVar) {
                super(2, v1bVar);
                this.a = lp20Var;
            }

            @Override // defpackage.pz1
            public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
                return new d(this.a, v1bVar);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
                return ((d) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
            }

            @Override // defpackage.pz1
            public final Object invokeSuspend(Object obj) {
                y5b y5bVar = y5b.a;
                uj50.b(obj);
                this.a.g();
                return Unit.a;
            }
        }

        @c0d(c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapGestures$2$1$5", f = "TapGestureDetector.kt", l = {157, 158}, m = "invokeSuspend")
        public static final class e extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
            public int a;
            public final /* synthetic */ c9p b;
            public final /* synthetic */ lp20 c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public e(c9p c9pVar, lp20 lp20Var, v1b<? super e> v1bVar) {
                super(2, v1bVar);
                this.b = c9pVar;
                this.c = lp20Var;
            }

            @Override // defpackage.pz1
            public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
                return new e(this.b, this.c, v1bVar);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
                return ((e) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
            }

            /* JADX WARN: Code restructure failed: missing block: B:14:0x0031, code lost:
            
                if (r4.c.i(r4) == r0) goto L15;
             */
            @Override // defpackage.pz1
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object invokeSuspend(java.lang.Object r5) {
                /*
                    r4 = this;
                    y5b r0 = defpackage.y5b.a
                    int r1 = r4.a
                    r2 = 2
                    r3 = 1
                    if (r1 == 0) goto L1b
                    if (r1 == r3) goto L17
                    if (r1 != r2) goto L10
                    defpackage.uj50.b(r5)
                    goto L34
                L10:
                    java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
                    defpackage.ib5.a(r4)
                    r4 = 0
                    return r4
                L17:
                    defpackage.uj50.b(r5)
                    goto L29
                L1b:
                    defpackage.uj50.b(r5)
                    r4.a = r3
                    c9p r5 = r4.b
                    java.lang.Object r5 = r5.join(r4)
                    if (r5 != r0) goto L29
                    goto L33
                L29:
                    r4.a = r2
                    lp20 r5 = r4.c
                    java.lang.Object r4 = r5.i(r4)
                    if (r4 != r0) goto L34
                L33:
                    return r0
                L34:
                    kotlin.Unit r4 = kotlin.Unit.a
                    return r4
                */
                throw new UnsupportedOperationException("Method not decompiled: y4f0.a.e.invokeSuspend(java.lang.Object):java.lang.Object");
            }
        }

        @c0d(c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapGestures$2$1$6", f = "TapGestureDetector.kt", l = {161}, m = "invokeSuspend")
        public static final class f extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
            public int a;
            public final /* synthetic */ gaj<ip20, gly, v1b<? super Unit>, Object> b;
            public final /* synthetic */ lp20 c;
            public final /* synthetic */ m020 d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public f(gaj<? super ip20, ? super gly, ? super v1b<? super Unit>, ? extends Object> gajVar, lp20 lp20Var, m020 m020Var, v1b<? super f> v1bVar) {
                super(2, v1bVar);
                this.b = gajVar;
                this.c = lp20Var;
                this.d = m020Var;
            }

            @Override // defpackage.pz1
            public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
                return new f(this.b, this.c, this.d, v1bVar);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
                return ((f) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
            }

            @Override // defpackage.pz1
            public final Object invokeSuspend(Object obj) {
                y5b y5bVar = y5b.a;
                int i = this.a;
                if (i == 0) {
                    uj50.b(obj);
                    gly glyVar = new gly(this.d.c);
                    this.a = 1;
                    if (this.b.invoke(this.c, glyVar, this) == y5bVar) {
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

        @c0d(c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapGestures$2$1$7", f = "TapGestureDetector.kt", l = {}, m = "invokeSuspend")
        public static final class g extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
            public final /* synthetic */ lp20 a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public g(lp20 lp20Var, v1b<? super g> v1bVar) {
                super(2, v1bVar);
                this.a = lp20Var;
            }

            @Override // defpackage.pz1
            public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
                return new g(this.a, v1bVar);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
                return ((g) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
            }

            @Override // defpackage.pz1
            public final Object invokeSuspend(Object obj) {
                y5b y5bVar = y5b.a;
                uj50.b(obj);
                this.a.g();
                return Unit.a;
            }
        }

        @c0d(c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapGestures$2$1$8", f = "TapGestureDetector.kt", l = {}, m = "invokeSuspend")
        public static final class h extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
            public final /* synthetic */ lp20 a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public h(lp20 lp20Var, v1b<? super h> v1bVar) {
                super(2, v1bVar);
                this.a = lp20Var;
            }

            @Override // defpackage.pz1
            public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
                return new h(this.a, v1bVar);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
                return ((h) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
            }

            @Override // defpackage.pz1
            public final Object invokeSuspend(Object obj) {
                y5b y5bVar = y5b.a;
                uj50.b(obj);
                this.a.e();
                return Unit.a;
            }
        }

        @c0d(c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapGestures$2$1$resetJob$1", f = "TapGestureDetector.kt", l = {108}, m = "invokeSuspend")
        public static final class i extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
            public int a;
            public final /* synthetic */ lp20 b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public i(lp20 lp20Var, v1b<? super i> v1bVar) {
                super(2, v1bVar);
                this.b = lp20Var;
            }

            @Override // defpackage.pz1
            public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
                return new i(this.b, v1bVar);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
                return ((i) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
            }

            @Override // defpackage.pz1
            public final Object invokeSuspend(Object obj) {
                y5b y5bVar = y5b.a;
                int i = this.a;
                if (i == 0) {
                    uj50.b(obj);
                    this.a = 1;
                    if (this.b.i(this) == y5bVar) {
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

        @c0d(c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapGestures$2$1$secondUp$1", f = "TapGestureDetector.kt", l = {}, m = "invokeSuspend")
        public static final class j extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
            public final /* synthetic */ lp20 a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public j(lp20 lp20Var, v1b<? super j> v1bVar) {
                super(2, v1bVar);
                this.a = lp20Var;
            }

            @Override // defpackage.pz1
            public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
                return new j(this.a, v1bVar);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
                return ((j) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
            }

            @Override // defpackage.pz1
            public final Object invokeSuspend(Object obj) {
                y5b y5bVar = y5b.a;
                uj50.b(obj);
                this.a.g();
                return Unit.a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(v5b v5bVar, gaj<? super ip20, ? super gly, ? super v1b<? super Unit>, ? extends Object> gajVar, Function1<? super gly, Unit> function1, Function1<? super gly, Unit> function2, Function1<? super gly, Unit> function3, lp20 lp20Var, v1b<? super a> v1bVar) {
            super(2, v1bVar);
            this.i = v5bVar;
            this.v = gajVar;
            this.w = function1;
            this.y = function2;
            this.z = function3;
            this.A = lp20Var;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            a aVar = new a(this.i, this.v, this.w, this.y, this.z, this.A, v1bVar);
            aVar.f = obj;
            return aVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(vp1 vp1Var, v1b<? super Unit> v1bVar) {
            return ((a) create(vp1Var, v1bVar)).invokeSuspend(Unit.a);
        }

        /* JADX WARN: Code duplicated, block: B:19:0x00c1  */
        /* JADX WARN: Code duplicated, block: B:21:0x00cb  */
        /* JADX WARN: Code duplicated, block: B:24:0x00dc  */
        /* JADX WARN: Code duplicated, block: B:26:0x00e1  */
        /* JADX WARN: Code duplicated, block: B:29:0x00f3  */
        /* JADX WARN: Code duplicated, block: B:32:0x0102  */
        /* JADX WARN: Code duplicated, block: B:35:0x011d  */
        /* JADX WARN: Code duplicated, block: B:38:0x0129  */
        /* JADX WARN: Code duplicated, block: B:40:0x012d  */
        /* JADX WARN: Code duplicated, block: B:41:0x0132  */
        /* JADX WARN: Code duplicated, block: B:43:0x0136  */
        /* JADX WARN: Code duplicated, block: B:46:0x013a  */
        /* JADX WARN: Code duplicated, block: B:47:0x0144  */
        /* JADX WARN: Code duplicated, block: B:49:0x0152 A[DONT_INVERT] */
        /* JADX WARN: Code duplicated, block: B:50:0x0154 A[DONT_INVERT] */
        /* JADX WARN: Code duplicated, block: B:51:0x0156  */
        /* JADX WARN: Code duplicated, block: B:52:0x0162  */
        /* JADX WARN: Code duplicated, block: B:55:0x0180 A[PHI: r2 r3 r12 r13
          0x0180: PHI (r2v19 c9p) = (r2v13 c9p), (r2v23 c9p) binds: [B:53:0x017c, B:9:0x004e] A[DONT_GENERATE, DONT_INLINE]
          0x0180: PHI (r3v24 m020) = (r3v11 m020), (r3v26 m020) binds: [B:53:0x017c, B:9:0x004e] A[DONT_GENERATE, DONT_INLINE]
          0x0180: PHI (r12v14 vp1) = (r12v7 vp1), (r12v16 vp1) binds: [B:53:0x017c, B:9:0x004e] A[DONT_GENERATE, DONT_INLINE]
          0x0180: PHI (r13v12 java.lang.Object) = (r13v8 java.lang.Object), (r13v14 java.lang.Object) binds: [B:53:0x017c, B:9:0x004e] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Code duplicated, block: B:57:0x0184 A[DONT_INVERT] */
        /* JADX WARN: Code duplicated, block: B:58:0x0186  */
        /* JADX WARN: Code duplicated, block: B:59:0x0192  */
        /* JADX WARN: Code duplicated, block: B:61:0x01a3  */
        /* JADX WARN: Code duplicated, block: B:63:0x01ad  */
        /* JADX WARN: Code duplicated, block: B:66:0x01bf  */
        /* JADX WARN: Code duplicated, block: B:68:0x01c3  */
        /* JADX WARN: Code duplicated, block: B:71:0x01d7  */
        /* JADX WARN: Code duplicated, block: B:74:0x01e2  */
        /* JADX WARN: Code duplicated, block: B:77:0x01ff  */
        /* JADX WARN: Code duplicated, block: B:80:0x020b  */
        /* JADX WARN: Code duplicated, block: B:82:0x020f  */
        /* JADX WARN: Code duplicated, block: B:83:0x0215  */
        /* JADX WARN: Code duplicated, block: B:85:0x0219  */
        /* JADX WARN: Code duplicated, block: B:87:0x021d  */
        /* JADX WARN: Code duplicated, block: B:88:0x0233  */
        /* JADX WARN: Code duplicated, block: B:90:0x023d  */
        /* JADX WARN: Code duplicated, block: B:91:0x0248  */
        /* JADX WARN: Code duplicated, block: B:95:0x024f  */
        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            vp1 vp1Var;
            Object objB;
            m020 m020Var;
            jvd0 jvd0VarC;
            Object objG;
            vp1 vp1Var2;
            c9p c9pVar;
            Object objH;
            vp1 vp1Var3;
            m020 m020Var2;
            c9p c9pVarF;
            Object objG1;
            hkt hktVar;
            c9p c9pVar2;
            m020 m020Var3;
            c9p c9pVarC;
            Object objG2;
            vp1 vp1Var4;
            Object objH2;
            m020 m020Var4;
            m020 m020Var5;
            hkt hktVar2;
            c9p c9pVar3;
            y5b y5bVar = y5b.a;
            int i2 = this.e;
            v5b v5bVar = this.i;
            Function1<gly, Unit> function1 = this.y;
            gaj<ip20, gly, v1b<? super Unit>, Object> gajVar = this.v;
            Function1<gly, Unit> function2 = this.z;
            Function1<gly, Unit> function3 = this.w;
            lp20 lp20Var = this.A;
            switch (i2) {
                case 0:
                    uj50.b(obj);
                    vp1Var = (vp1) this.f;
                    this.f = vp1Var;
                    this.e = 1;
                    objB = u4f0.b(vp1Var, this, 3);
                    if (objB != y5bVar) {
                        m020Var = (m020) objB;
                        m020Var.a();
                        u4f0.a aVar = u4f0.a;
                        jvd0VarC = ej5.c(v5bVar, null, a6b.d, new i(lp20Var, null), 1);
                        if (gajVar != u4f0.a) {
                            u4f0.f(v5bVar, jvd0VarC, new C1326a(gajVar, lp20Var, m020Var, null));
                        }
                        if (function3 == null) {
                            this.f = vp1Var;
                            this.b = jvd0VarC;
                            this.e = 2;
                            objH = u4f0.h(vp1Var, c020.b, this);
                            if (objH != y5bVar) {
                                vp1Var3 = vp1Var;
                                c9pVar = jvd0VarC;
                                m020Var2 = (m020) objH;
                                if (m020Var2 == null) {
                                    c9pVarF = u4f0.f(v5bVar, c9pVar, new c(lp20Var, null));
                                } else {
                                    m020Var2.a();
                                    c9pVarF = u4f0.f(v5bVar, c9pVar, new d(lp20Var, null));
                                }
                                if (m020Var2 != null) {
                                    if (function1 == null) {
                                        this.f = vp1Var3;
                                        this.b = m020Var2;
                                        this.c = c9pVarF;
                                        this.e = 5;
                                        objG1 = vp1Var3.G1(vp1Var3.getViewConfiguration().a(), new v4f0(m020Var2, null), this);
                                        if (objG1 != y5bVar) {
                                            m020Var3 = (m020) objG1;
                                            if (m020Var3 != null) {
                                                u4f0.a aVar2 = u4f0.a;
                                                c9pVarC = ej5.c(v5bVar, null, a6b.d, new e(c9pVarF, lp20Var, null), 1);
                                                if (gajVar != u4f0.a) {
                                                    u4f0.f(v5bVar, c9pVarC, new f(gajVar, lp20Var, m020Var3, null));
                                                }
                                                if (function3 == null) {
                                                    this.f = c9pVarC;
                                                    this.b = m020Var2;
                                                    this.c = null;
                                                    this.e = 6;
                                                    objH2 = u4f0.h(vp1Var3, c020.b, this);
                                                    if (objH2 != y5bVar) {
                                                        m020Var4 = m020Var2;
                                                        m020Var5 = (m020) objH2;
                                                        if (m020Var5 != null) {
                                                            m020Var5.a();
                                                            u4f0.f(v5bVar, c9pVarC, new g(lp20Var, null));
                                                            function1.invoke(new gly(m020Var5.c));
                                                        } else {
                                                            u4f0.f(v5bVar, c9pVarC, new h(lp20Var, null));
                                                            if (function2 != null) {
                                                                function2.invoke(new gly(m020Var4.c));
                                                            }
                                                        }
                                                    }
                                                } else {
                                                    this.f = vp1Var3;
                                                    this.b = c9pVarC;
                                                    this.c = m020Var2;
                                                    this.d = m020Var3;
                                                    this.e = 7;
                                                    objG2 = u4f0.g(vp1Var3, c020.b, this);
                                                    if (objG2 != y5bVar) {
                                                        vp1Var4 = vp1Var3;
                                                        hktVar2 = (hkt) objG2;
                                                        if (Intrinsics.g(hktVar2, hkt.c.a)) {
                                                            function3.invoke(new gly(m020Var3.c));
                                                            this.f = c9pVarC;
                                                            this.b = null;
                                                            this.c = null;
                                                            this.d = null;
                                                            this.e = 8;
                                                            if (u4f0.c(vp1Var4, this) != y5bVar) {
                                                                c9pVar3 = c9pVarC;
                                                                u4f0.f(v5bVar, c9pVar3, new j(lp20Var, null));
                                                                return Unit.a;
                                                            }
                                                        } else {
                                                            if (hktVar2 instanceof hkt.b) {
                                                                m020Var5 = ((hkt.b) hktVar2).a;
                                                                m020Var4 = m020Var2;
                                                            } else {
                                                                if (hktVar2 instanceof hkt.a) {
                                                                    uhc.a();
                                                                    return null;
                                                                }
                                                                m020Var4 = m020Var2;
                                                                m020Var5 = null;
                                                            }
                                                            if (m020Var5 != null) {
                                                                m020Var5.a();
                                                                u4f0.f(v5bVar, c9pVarC, new g(lp20Var, null));
                                                                function1.invoke(new gly(m020Var5.c));
                                                            } else {
                                                                u4f0.f(v5bVar, c9pVarC, new h(lp20Var, null));
                                                                if (function2 != null) {
                                                                    function2.invoke(new gly(m020Var4.c));
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            } else if (function2 != null) {
                                                function2.invoke(new gly(m020Var2.c));
                                            }
                                        }
                                    } else if (function2 != null) {
                                        function2.invoke(new gly(m020Var2.c));
                                    }
                                }
                                return Unit.a;
                            }
                        } else {
                            this.f = vp1Var;
                            this.b = m020Var;
                            this.c = jvd0VarC;
                            this.e = 3;
                            objG = u4f0.g(vp1Var, c020.b, this);
                            if (objG != y5bVar) {
                                vp1Var2 = vp1Var;
                                c9pVar = jvd0VarC;
                                hktVar = (hkt) objG;
                                if (!Intrinsics.g(hktVar, hkt.c.a)) {
                                    if (hktVar instanceof hkt.b) {
                                        m020Var2 = ((hkt.b) hktVar).a;
                                    } else {
                                        if (!(hktVar instanceof hkt.a)) {
                                            uhc.a();
                                            return null;
                                        }
                                        m020Var2 = null;
                                    }
                                    vp1Var3 = vp1Var2;
                                    if (m020Var2 == null) {
                                        c9pVarF = u4f0.f(v5bVar, c9pVar, new c(lp20Var, null));
                                    } else {
                                        m020Var2.a();
                                        c9pVarF = u4f0.f(v5bVar, c9pVar, new d(lp20Var, null));
                                    }
                                    if (m020Var2 != null) {
                                        if (function1 == null) {
                                            this.f = vp1Var3;
                                            this.b = m020Var2;
                                            this.c = c9pVarF;
                                            this.e = 5;
                                            objG1 = vp1Var3.G1(vp1Var3.getViewConfiguration().a(), new v4f0(m020Var2, null), this);
                                            if (objG1 != y5bVar) {
                                                m020Var3 = (m020) objG1;
                                                if (m020Var3 != null) {
                                                    u4f0.a aVar3 = u4f0.a;
                                                    c9pVarC = ej5.c(v5bVar, null, a6b.d, new e(c9pVarF, lp20Var, null), 1);
                                                    if (gajVar != u4f0.a) {
                                                        u4f0.f(v5bVar, c9pVarC, new f(gajVar, lp20Var, m020Var3, null));
                                                    }
                                                    if (function3 == null) {
                                                        this.f = c9pVarC;
                                                        this.b = m020Var2;
                                                        this.c = null;
                                                        this.e = 6;
                                                        objH2 = u4f0.h(vp1Var3, c020.b, this);
                                                        if (objH2 != y5bVar) {
                                                            m020Var4 = m020Var2;
                                                            m020Var5 = (m020) objH2;
                                                            if (m020Var5 != null) {
                                                                m020Var5.a();
                                                                u4f0.f(v5bVar, c9pVarC, new g(lp20Var, null));
                                                                function1.invoke(new gly(m020Var5.c));
                                                            } else {
                                                                u4f0.f(v5bVar, c9pVarC, new h(lp20Var, null));
                                                                if (function2 != null) {
                                                                    function2.invoke(new gly(m020Var4.c));
                                                                }
                                                            }
                                                        }
                                                    } else {
                                                        this.f = vp1Var3;
                                                        this.b = c9pVarC;
                                                        this.c = m020Var2;
                                                        this.d = m020Var3;
                                                        this.e = 7;
                                                        objG2 = u4f0.g(vp1Var3, c020.b, this);
                                                        if (objG2 != y5bVar) {
                                                            vp1Var4 = vp1Var3;
                                                            hktVar2 = (hkt) objG2;
                                                            if (Intrinsics.g(hktVar2, hkt.c.a)) {
                                                                function3.invoke(new gly(m020Var3.c));
                                                                this.f = c9pVarC;
                                                                this.b = null;
                                                                this.c = null;
                                                                this.d = null;
                                                                this.e = 8;
                                                                if (u4f0.c(vp1Var4, this) != y5bVar) {
                                                                    c9pVar3 = c9pVarC;
                                                                    u4f0.f(v5bVar, c9pVar3, new j(lp20Var, null));
                                                                    return Unit.a;
                                                                }
                                                            } else {
                                                                if (hktVar2 instanceof hkt.b) {
                                                                    m020Var5 = ((hkt.b) hktVar2).a;
                                                                    m020Var4 = m020Var2;
                                                                } else {
                                                                    if (hktVar2 instanceof hkt.a) {
                                                                        uhc.a();
                                                                        return null;
                                                                    }
                                                                    m020Var4 = m020Var2;
                                                                    m020Var5 = null;
                                                                }
                                                                if (m020Var5 != null) {
                                                                    m020Var5.a();
                                                                    u4f0.f(v5bVar, c9pVarC, new g(lp20Var, null));
                                                                    function1.invoke(new gly(m020Var5.c));
                                                                } else {
                                                                    u4f0.f(v5bVar, c9pVarC, new h(lp20Var, null));
                                                                    if (function2 != null) {
                                                                        function2.invoke(new gly(m020Var4.c));
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                } else if (function2 != null) {
                                                    function2.invoke(new gly(m020Var2.c));
                                                }
                                            }
                                        } else if (function2 != null) {
                                            function2.invoke(new gly(m020Var2.c));
                                        }
                                    }
                                    return Unit.a;
                                }
                                function3.invoke(new gly(m020Var.c));
                                this.f = c9pVar;
                                this.b = null;
                                this.c = null;
                                this.e = 4;
                                if (u4f0.c(vp1Var2, this) != y5bVar) {
                                    c9pVar2 = c9pVar;
                                    u4f0.f(v5bVar, c9pVar2, new b(lp20Var, null));
                                    return Unit.a;
                                }
                            }
                        }
                    }
                    return y5bVar;
                case 1:
                    vp1Var = (vp1) this.f;
                    uj50.b(obj);
                    objB = obj;
                    m020Var = (m020) objB;
                    m020Var.a();
                    u4f0.a aVar4 = u4f0.a;
                    jvd0VarC = ej5.c(v5bVar, null, a6b.d, new i(lp20Var, null), 1);
                    if (gajVar != u4f0.a) {
                        u4f0.f(v5bVar, jvd0VarC, new C1326a(gajVar, lp20Var, m020Var, null));
                    }
                    if (function3 == null) {
                        this.f = vp1Var;
                        this.b = jvd0VarC;
                        this.e = 2;
                        objH = u4f0.h(vp1Var, c020.b, this);
                        if (objH != y5bVar) {
                            vp1Var3 = vp1Var;
                            c9pVar = jvd0VarC;
                            m020Var2 = (m020) objH;
                            if (m020Var2 == null) {
                                c9pVarF = u4f0.f(v5bVar, c9pVar, new c(lp20Var, null));
                            } else {
                                m020Var2.a();
                                c9pVarF = u4f0.f(v5bVar, c9pVar, new d(lp20Var, null));
                            }
                            if (m020Var2 != null) {
                                if (function1 == null) {
                                    this.f = vp1Var3;
                                    this.b = m020Var2;
                                    this.c = c9pVarF;
                                    this.e = 5;
                                    objG1 = vp1Var3.G1(vp1Var3.getViewConfiguration().a(), new v4f0(m020Var2, null), this);
                                    if (objG1 != y5bVar) {
                                        m020Var3 = (m020) objG1;
                                        if (m020Var3 != null) {
                                            u4f0.a aVar5 = u4f0.a;
                                            c9pVarC = ej5.c(v5bVar, null, a6b.d, new e(c9pVarF, lp20Var, null), 1);
                                            if (gajVar != u4f0.a) {
                                                u4f0.f(v5bVar, c9pVarC, new f(gajVar, lp20Var, m020Var3, null));
                                            }
                                            if (function3 == null) {
                                                this.f = c9pVarC;
                                                this.b = m020Var2;
                                                this.c = null;
                                                this.e = 6;
                                                objH2 = u4f0.h(vp1Var3, c020.b, this);
                                                if (objH2 != y5bVar) {
                                                    m020Var4 = m020Var2;
                                                    m020Var5 = (m020) objH2;
                                                    if (m020Var5 != null) {
                                                        m020Var5.a();
                                                        u4f0.f(v5bVar, c9pVarC, new g(lp20Var, null));
                                                        function1.invoke(new gly(m020Var5.c));
                                                    } else {
                                                        u4f0.f(v5bVar, c9pVarC, new h(lp20Var, null));
                                                        if (function2 != null) {
                                                            function2.invoke(new gly(m020Var4.c));
                                                        }
                                                    }
                                                }
                                            } else {
                                                this.f = vp1Var3;
                                                this.b = c9pVarC;
                                                this.c = m020Var2;
                                                this.d = m020Var3;
                                                this.e = 7;
                                                objG2 = u4f0.g(vp1Var3, c020.b, this);
                                                if (objG2 != y5bVar) {
                                                    vp1Var4 = vp1Var3;
                                                    hktVar2 = (hkt) objG2;
                                                    if (Intrinsics.g(hktVar2, hkt.c.a)) {
                                                        function3.invoke(new gly(m020Var3.c));
                                                        this.f = c9pVarC;
                                                        this.b = null;
                                                        this.c = null;
                                                        this.d = null;
                                                        this.e = 8;
                                                        if (u4f0.c(vp1Var4, this) != y5bVar) {
                                                            c9pVar3 = c9pVarC;
                                                            u4f0.f(v5bVar, c9pVar3, new j(lp20Var, null));
                                                            return Unit.a;
                                                        }
                                                    } else {
                                                        if (hktVar2 instanceof hkt.b) {
                                                            m020Var5 = ((hkt.b) hktVar2).a;
                                                            m020Var4 = m020Var2;
                                                        } else {
                                                            if (hktVar2 instanceof hkt.a) {
                                                                uhc.a();
                                                                return null;
                                                            }
                                                            m020Var4 = m020Var2;
                                                            m020Var5 = null;
                                                        }
                                                        if (m020Var5 != null) {
                                                            m020Var5.a();
                                                            u4f0.f(v5bVar, c9pVarC, new g(lp20Var, null));
                                                            function1.invoke(new gly(m020Var5.c));
                                                        } else {
                                                            u4f0.f(v5bVar, c9pVarC, new h(lp20Var, null));
                                                            if (function2 != null) {
                                                                function2.invoke(new gly(m020Var4.c));
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        } else if (function2 != null) {
                                            function2.invoke(new gly(m020Var2.c));
                                        }
                                    }
                                } else if (function2 != null) {
                                    function2.invoke(new gly(m020Var2.c));
                                }
                            }
                            return Unit.a;
                        }
                    } else {
                        this.f = vp1Var;
                        this.b = m020Var;
                        this.c = jvd0VarC;
                        this.e = 3;
                        objG = u4f0.g(vp1Var, c020.b, this);
                        if (objG != y5bVar) {
                            vp1Var2 = vp1Var;
                            c9pVar = jvd0VarC;
                            hktVar = (hkt) objG;
                            if (!Intrinsics.g(hktVar, hkt.c.a)) {
                                if (hktVar instanceof hkt.b) {
                                    m020Var2 = ((hkt.b) hktVar).a;
                                } else {
                                    if (!(hktVar instanceof hkt.a)) {
                                        uhc.a();
                                        return null;
                                    }
                                    m020Var2 = null;
                                }
                                vp1Var3 = vp1Var2;
                                if (m020Var2 == null) {
                                    c9pVarF = u4f0.f(v5bVar, c9pVar, new c(lp20Var, null));
                                } else {
                                    m020Var2.a();
                                    c9pVarF = u4f0.f(v5bVar, c9pVar, new d(lp20Var, null));
                                }
                                if (m020Var2 != null) {
                                    if (function1 == null) {
                                        this.f = vp1Var3;
                                        this.b = m020Var2;
                                        this.c = c9pVarF;
                                        this.e = 5;
                                        objG1 = vp1Var3.G1(vp1Var3.getViewConfiguration().a(), new v4f0(m020Var2, null), this);
                                        if (objG1 != y5bVar) {
                                            m020Var3 = (m020) objG1;
                                            if (m020Var3 != null) {
                                                u4f0.a aVar6 = u4f0.a;
                                                c9pVarC = ej5.c(v5bVar, null, a6b.d, new e(c9pVarF, lp20Var, null), 1);
                                                if (gajVar != u4f0.a) {
                                                    u4f0.f(v5bVar, c9pVarC, new f(gajVar, lp20Var, m020Var3, null));
                                                }
                                                if (function3 == null) {
                                                    this.f = c9pVarC;
                                                    this.b = m020Var2;
                                                    this.c = null;
                                                    this.e = 6;
                                                    objH2 = u4f0.h(vp1Var3, c020.b, this);
                                                    if (objH2 != y5bVar) {
                                                        m020Var4 = m020Var2;
                                                        m020Var5 = (m020) objH2;
                                                        if (m020Var5 != null) {
                                                            m020Var5.a();
                                                            u4f0.f(v5bVar, c9pVarC, new g(lp20Var, null));
                                                            function1.invoke(new gly(m020Var5.c));
                                                        } else {
                                                            u4f0.f(v5bVar, c9pVarC, new h(lp20Var, null));
                                                            if (function2 != null) {
                                                                function2.invoke(new gly(m020Var4.c));
                                                            }
                                                        }
                                                    }
                                                } else {
                                                    this.f = vp1Var3;
                                                    this.b = c9pVarC;
                                                    this.c = m020Var2;
                                                    this.d = m020Var3;
                                                    this.e = 7;
                                                    objG2 = u4f0.g(vp1Var3, c020.b, this);
                                                    if (objG2 != y5bVar) {
                                                        vp1Var4 = vp1Var3;
                                                        hktVar2 = (hkt) objG2;
                                                        if (Intrinsics.g(hktVar2, hkt.c.a)) {
                                                            function3.invoke(new gly(m020Var3.c));
                                                            this.f = c9pVarC;
                                                            this.b = null;
                                                            this.c = null;
                                                            this.d = null;
                                                            this.e = 8;
                                                            if (u4f0.c(vp1Var4, this) != y5bVar) {
                                                                c9pVar3 = c9pVarC;
                                                                u4f0.f(v5bVar, c9pVar3, new j(lp20Var, null));
                                                                return Unit.a;
                                                            }
                                                        } else {
                                                            if (hktVar2 instanceof hkt.b) {
                                                                m020Var5 = ((hkt.b) hktVar2).a;
                                                                m020Var4 = m020Var2;
                                                            } else {
                                                                if (hktVar2 instanceof hkt.a) {
                                                                    uhc.a();
                                                                    return null;
                                                                }
                                                                m020Var4 = m020Var2;
                                                                m020Var5 = null;
                                                            }
                                                            if (m020Var5 != null) {
                                                                m020Var5.a();
                                                                u4f0.f(v5bVar, c9pVarC, new g(lp20Var, null));
                                                                function1.invoke(new gly(m020Var5.c));
                                                            } else {
                                                                u4f0.f(v5bVar, c9pVarC, new h(lp20Var, null));
                                                                if (function2 != null) {
                                                                    function2.invoke(new gly(m020Var4.c));
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            } else if (function2 != null) {
                                                function2.invoke(new gly(m020Var2.c));
                                            }
                                        }
                                    } else if (function2 != null) {
                                        function2.invoke(new gly(m020Var2.c));
                                    }
                                }
                                return Unit.a;
                            }
                            function3.invoke(new gly(m020Var.c));
                            this.f = c9pVar;
                            this.b = null;
                            this.c = null;
                            this.e = 4;
                            if (u4f0.c(vp1Var2, this) != y5bVar) {
                                c9pVar2 = c9pVar;
                                u4f0.f(v5bVar, c9pVar2, new b(lp20Var, null));
                                return Unit.a;
                            }
                        }
                    }
                    return y5bVar;
                case 2:
                    c9pVar = (c9p) this.b;
                    vp1 vp1Var5 = (vp1) this.f;
                    uj50.b(obj);
                    vp1Var3 = vp1Var5;
                    objH = obj;
                    m020Var2 = (m020) objH;
                    if (m020Var2 == null) {
                        c9pVarF = u4f0.f(v5bVar, c9pVar, new c(lp20Var, null));
                    } else {
                        m020Var2.a();
                        c9pVarF = u4f0.f(v5bVar, c9pVar, new d(lp20Var, null));
                    }
                    if (m020Var2 != null) {
                        if (function1 == null) {
                            this.f = vp1Var3;
                            this.b = m020Var2;
                            this.c = c9pVarF;
                            this.e = 5;
                            objG1 = vp1Var3.G1(vp1Var3.getViewConfiguration().a(), new v4f0(m020Var2, null), this);
                            if (objG1 != y5bVar) {
                                m020Var3 = (m020) objG1;
                                if (m020Var3 != null) {
                                    u4f0.a aVar7 = u4f0.a;
                                    c9pVarC = ej5.c(v5bVar, null, a6b.d, new e(c9pVarF, lp20Var, null), 1);
                                    if (gajVar != u4f0.a) {
                                        u4f0.f(v5bVar, c9pVarC, new f(gajVar, lp20Var, m020Var3, null));
                                    }
                                    if (function3 == null) {
                                        this.f = c9pVarC;
                                        this.b = m020Var2;
                                        this.c = null;
                                        this.e = 6;
                                        objH2 = u4f0.h(vp1Var3, c020.b, this);
                                        if (objH2 != y5bVar) {
                                            m020Var4 = m020Var2;
                                            m020Var5 = (m020) objH2;
                                            if (m020Var5 != null) {
                                                m020Var5.a();
                                                u4f0.f(v5bVar, c9pVarC, new g(lp20Var, null));
                                                function1.invoke(new gly(m020Var5.c));
                                            } else {
                                                u4f0.f(v5bVar, c9pVarC, new h(lp20Var, null));
                                                if (function2 != null) {
                                                    function2.invoke(new gly(m020Var4.c));
                                                }
                                            }
                                        }
                                    } else {
                                        this.f = vp1Var3;
                                        this.b = c9pVarC;
                                        this.c = m020Var2;
                                        this.d = m020Var3;
                                        this.e = 7;
                                        objG2 = u4f0.g(vp1Var3, c020.b, this);
                                        if (objG2 != y5bVar) {
                                            vp1Var4 = vp1Var3;
                                            hktVar2 = (hkt) objG2;
                                            if (Intrinsics.g(hktVar2, hkt.c.a)) {
                                                function3.invoke(new gly(m020Var3.c));
                                                this.f = c9pVarC;
                                                this.b = null;
                                                this.c = null;
                                                this.d = null;
                                                this.e = 8;
                                                if (u4f0.c(vp1Var4, this) != y5bVar) {
                                                    c9pVar3 = c9pVarC;
                                                    u4f0.f(v5bVar, c9pVar3, new j(lp20Var, null));
                                                    return Unit.a;
                                                }
                                            } else {
                                                if (hktVar2 instanceof hkt.b) {
                                                    m020Var5 = ((hkt.b) hktVar2).a;
                                                    m020Var4 = m020Var2;
                                                } else {
                                                    if (hktVar2 instanceof hkt.a) {
                                                        uhc.a();
                                                        return null;
                                                    }
                                                    m020Var4 = m020Var2;
                                                    m020Var5 = null;
                                                }
                                                if (m020Var5 != null) {
                                                    m020Var5.a();
                                                    u4f0.f(v5bVar, c9pVarC, new g(lp20Var, null));
                                                    function1.invoke(new gly(m020Var5.c));
                                                } else {
                                                    u4f0.f(v5bVar, c9pVarC, new h(lp20Var, null));
                                                    if (function2 != null) {
                                                        function2.invoke(new gly(m020Var4.c));
                                                    }
                                                }
                                            }
                                        }
                                    }
                                } else if (function2 != null) {
                                    function2.invoke(new gly(m020Var2.c));
                                }
                            }
                            return y5bVar;
                        }
                        if (function2 != null) {
                            function2.invoke(new gly(m020Var2.c));
                        }
                    }
                    return Unit.a;
                case 3:
                    c9pVar = (c9p) this.c;
                    m020 m020Var6 = (m020) this.b;
                    vp1 vp1Var6 = (vp1) this.f;
                    uj50.b(obj);
                    vp1Var2 = vp1Var6;
                    m020Var = m020Var6;
                    objG = obj;
                    hktVar = (hkt) objG;
                    if (!Intrinsics.g(hktVar, hkt.c.a)) {
                        if (hktVar instanceof hkt.b) {
                            m020Var2 = ((hkt.b) hktVar).a;
                        } else {
                            if (!(hktVar instanceof hkt.a)) {
                                uhc.a();
                                return null;
                            }
                            m020Var2 = null;
                        }
                        vp1Var3 = vp1Var2;
                        if (m020Var2 == null) {
                            c9pVarF = u4f0.f(v5bVar, c9pVar, new c(lp20Var, null));
                        } else {
                            m020Var2.a();
                            c9pVarF = u4f0.f(v5bVar, c9pVar, new d(lp20Var, null));
                        }
                        if (m020Var2 != null) {
                            if (function1 == null) {
                                this.f = vp1Var3;
                                this.b = m020Var2;
                                this.c = c9pVarF;
                                this.e = 5;
                                objG1 = vp1Var3.G1(vp1Var3.getViewConfiguration().a(), new v4f0(m020Var2, null), this);
                                if (objG1 != y5bVar) {
                                    m020Var3 = (m020) objG1;
                                    if (m020Var3 != null) {
                                        u4f0.a aVar8 = u4f0.a;
                                        c9pVarC = ej5.c(v5bVar, null, a6b.d, new e(c9pVarF, lp20Var, null), 1);
                                        if (gajVar != u4f0.a) {
                                            u4f0.f(v5bVar, c9pVarC, new f(gajVar, lp20Var, m020Var3, null));
                                        }
                                        if (function3 == null) {
                                            this.f = c9pVarC;
                                            this.b = m020Var2;
                                            this.c = null;
                                            this.e = 6;
                                            objH2 = u4f0.h(vp1Var3, c020.b, this);
                                            if (objH2 != y5bVar) {
                                                m020Var4 = m020Var2;
                                                m020Var5 = (m020) objH2;
                                                if (m020Var5 != null) {
                                                    m020Var5.a();
                                                    u4f0.f(v5bVar, c9pVarC, new g(lp20Var, null));
                                                    function1.invoke(new gly(m020Var5.c));
                                                } else {
                                                    u4f0.f(v5bVar, c9pVarC, new h(lp20Var, null));
                                                    if (function2 != null) {
                                                        function2.invoke(new gly(m020Var4.c));
                                                    }
                                                }
                                            }
                                        } else {
                                            this.f = vp1Var3;
                                            this.b = c9pVarC;
                                            this.c = m020Var2;
                                            this.d = m020Var3;
                                            this.e = 7;
                                            objG2 = u4f0.g(vp1Var3, c020.b, this);
                                            if (objG2 != y5bVar) {
                                                vp1Var4 = vp1Var3;
                                                hktVar2 = (hkt) objG2;
                                                if (Intrinsics.g(hktVar2, hkt.c.a)) {
                                                    function3.invoke(new gly(m020Var3.c));
                                                    this.f = c9pVarC;
                                                    this.b = null;
                                                    this.c = null;
                                                    this.d = null;
                                                    this.e = 8;
                                                    if (u4f0.c(vp1Var4, this) != y5bVar) {
                                                        c9pVar3 = c9pVarC;
                                                        u4f0.f(v5bVar, c9pVar3, new j(lp20Var, null));
                                                        return Unit.a;
                                                    }
                                                } else {
                                                    if (hktVar2 instanceof hkt.b) {
                                                        m020Var5 = ((hkt.b) hktVar2).a;
                                                        m020Var4 = m020Var2;
                                                    } else {
                                                        if (hktVar2 instanceof hkt.a) {
                                                            uhc.a();
                                                            return null;
                                                        }
                                                        m020Var4 = m020Var2;
                                                        m020Var5 = null;
                                                    }
                                                    if (m020Var5 != null) {
                                                        m020Var5.a();
                                                        u4f0.f(v5bVar, c9pVarC, new g(lp20Var, null));
                                                        function1.invoke(new gly(m020Var5.c));
                                                    } else {
                                                        u4f0.f(v5bVar, c9pVarC, new h(lp20Var, null));
                                                        if (function2 != null) {
                                                            function2.invoke(new gly(m020Var4.c));
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    } else if (function2 != null) {
                                        function2.invoke(new gly(m020Var2.c));
                                    }
                                }
                            } else if (function2 != null) {
                                function2.invoke(new gly(m020Var2.c));
                            }
                        }
                        return Unit.a;
                    }
                    function3.invoke(new gly(m020Var.c));
                    this.f = c9pVar;
                    this.b = null;
                    this.c = null;
                    this.e = 4;
                    if (u4f0.c(vp1Var2, this) != y5bVar) {
                        c9pVar2 = c9pVar;
                        u4f0.f(v5bVar, c9pVar2, new b(lp20Var, null));
                        return Unit.a;
                    }
                    return y5bVar;
                case 4:
                    c9pVar2 = (c9p) this.f;
                    uj50.b(obj);
                    u4f0.f(v5bVar, c9pVar2, new b(lp20Var, null));
                    return Unit.a;
                case 5:
                    c9pVarF = (c9p) this.c;
                    m020Var2 = (m020) this.b;
                    vp1Var3 = (vp1) this.f;
                    uj50.b(obj);
                    objG1 = obj;
                    m020Var3 = (m020) objG1;
                    if (m020Var3 != null) {
                        u4f0.a aVar9 = u4f0.a;
                        c9pVarC = ej5.c(v5bVar, null, a6b.d, new e(c9pVarF, lp20Var, null), 1);
                        if (gajVar != u4f0.a) {
                            u4f0.f(v5bVar, c9pVarC, new f(gajVar, lp20Var, m020Var3, null));
                        }
                        if (function3 == null) {
                            this.f = c9pVarC;
                            this.b = m020Var2;
                            this.c = null;
                            this.e = 6;
                            objH2 = u4f0.h(vp1Var3, c020.b, this);
                            if (objH2 != y5bVar) {
                                m020Var4 = m020Var2;
                                m020Var5 = (m020) objH2;
                                if (m020Var5 != null) {
                                    m020Var5.a();
                                    u4f0.f(v5bVar, c9pVarC, new g(lp20Var, null));
                                    function1.invoke(new gly(m020Var5.c));
                                } else {
                                    u4f0.f(v5bVar, c9pVarC, new h(lp20Var, null));
                                    if (function2 != null) {
                                        function2.invoke(new gly(m020Var4.c));
                                    }
                                }
                            }
                        } else {
                            this.f = vp1Var3;
                            this.b = c9pVarC;
                            this.c = m020Var2;
                            this.d = m020Var3;
                            this.e = 7;
                            objG2 = u4f0.g(vp1Var3, c020.b, this);
                            if (objG2 != y5bVar) {
                                vp1Var4 = vp1Var3;
                                hktVar2 = (hkt) objG2;
                                if (Intrinsics.g(hktVar2, hkt.c.a)) {
                                    function3.invoke(new gly(m020Var3.c));
                                    this.f = c9pVarC;
                                    this.b = null;
                                    this.c = null;
                                    this.d = null;
                                    this.e = 8;
                                    if (u4f0.c(vp1Var4, this) != y5bVar) {
                                        c9pVar3 = c9pVarC;
                                        u4f0.f(v5bVar, c9pVar3, new j(lp20Var, null));
                                        return Unit.a;
                                    }
                                } else {
                                    if (hktVar2 instanceof hkt.b) {
                                        m020Var5 = ((hkt.b) hktVar2).a;
                                        m020Var4 = m020Var2;
                                    } else {
                                        if (hktVar2 instanceof hkt.a) {
                                            uhc.a();
                                            return null;
                                        }
                                        m020Var4 = m020Var2;
                                        m020Var5 = null;
                                    }
                                    if (m020Var5 != null) {
                                        m020Var5.a();
                                        u4f0.f(v5bVar, c9pVarC, new g(lp20Var, null));
                                        function1.invoke(new gly(m020Var5.c));
                                    } else {
                                        u4f0.f(v5bVar, c9pVarC, new h(lp20Var, null));
                                        if (function2 != null) {
                                            function2.invoke(new gly(m020Var4.c));
                                        }
                                    }
                                }
                            }
                        }
                        return y5bVar;
                    }
                    if (function2 != null) {
                        function2.invoke(new gly(m020Var2.c));
                    }
                    return Unit.a;
                case 6:
                    m020Var4 = (m020) this.b;
                    c9p c9pVar4 = (c9p) this.f;
                    uj50.b(obj);
                    c9pVarC = c9pVar4;
                    objH2 = obj;
                    m020Var5 = (m020) objH2;
                    if (m020Var5 != null) {
                        m020Var5.a();
                        u4f0.f(v5bVar, c9pVarC, new g(lp20Var, null));
                        function1.invoke(new gly(m020Var5.c));
                    } else {
                        u4f0.f(v5bVar, c9pVarC, new h(lp20Var, null));
                        if (function2 != null) {
                            function2.invoke(new gly(m020Var4.c));
                        }
                    }
                    return Unit.a;
                case 7:
                    m020 m020Var7 = this.d;
                    m020Var2 = (m020) this.c;
                    c9p c9pVar5 = (c9p) this.b;
                    vp1Var4 = (vp1) this.f;
                    uj50.b(obj);
                    m020Var3 = m020Var7;
                    c9pVarC = c9pVar5;
                    objG2 = obj;
                    hktVar2 = (hkt) objG2;
                    if (Intrinsics.g(hktVar2, hkt.c.a)) {
                        function3.invoke(new gly(m020Var3.c));
                        this.f = c9pVarC;
                        this.b = null;
                        this.c = null;
                        this.d = null;
                        this.e = 8;
                        if (u4f0.c(vp1Var4, this) != y5bVar) {
                            c9pVar3 = c9pVarC;
                            u4f0.f(v5bVar, c9pVar3, new j(lp20Var, null));
                            return Unit.a;
                        }
                        return y5bVar;
                    }
                    if (hktVar2 instanceof hkt.b) {
                        m020Var5 = ((hkt.b) hktVar2).a;
                        m020Var4 = m020Var2;
                    } else {
                        if (hktVar2 instanceof hkt.a) {
                            uhc.a();
                            return null;
                        }
                        m020Var4 = m020Var2;
                        m020Var5 = null;
                    }
                    if (m020Var5 != null) {
                        m020Var5.a();
                        u4f0.f(v5bVar, c9pVarC, new g(lp20Var, null));
                        function1.invoke(new gly(m020Var5.c));
                    } else {
                        u4f0.f(v5bVar, c9pVarC, new h(lp20Var, null));
                        if (function2 != null) {
                            function2.invoke(new gly(m020Var4.c));
                        }
                    }
                    return Unit.a;
                case 8:
                    c9pVar3 = (c9p) this.f;
                    uj50.b(obj);
                    u4f0.f(v5bVar, c9pVar3, new j(lp20Var, null));
                    return Unit.a;
                default:
                    ib5.a("call to 'resume' before 'invoke' with coroutine");
                    return null;
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public y4f0(u020 u020Var, gaj<? super ip20, ? super gly, ? super v1b<? super Unit>, ? extends Object> gajVar, Function1<? super gly, Unit> function1, Function1<? super gly, Unit> function2, Function1<? super gly, Unit> function3, v1b<? super y4f0> v1bVar) {
        super(2, v1bVar);
        this.c = u020Var;
        this.d = gajVar;
        this.e = function1;
        this.f = function2;
        this.i = function3;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        y4f0 y4f0Var = new y4f0(this.c, this.d, this.e, this.f, this.i, v1bVar);
        y4f0Var.b = obj;
        return y4f0Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((y4f0) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        y5b y5bVar = y5b.a;
        int i = this.a;
        if (i == 0) {
            uj50.b(obj);
            v5b v5bVar = (v5b) this.b;
            u020 u020Var = this.c;
            lp20 lp20Var = new lp20(u020Var);
            a aVar = new a(v5bVar, this.d, this.e, this.f, this.i, lp20Var, null);
            this.a = 1;
            if (dqi.b(u020Var, aVar, this) == y5bVar) {
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
