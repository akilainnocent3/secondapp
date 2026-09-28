package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import okhttp3.internal.http.HttpStatusCodesKt;

/* JADX INFO: loaded from: classes8.dex */
@c0d(c = "com.sportygames.sportyjet.components.RandomIconBackgroundKt$AnimatedStar$1$1", f = "RandomIconBackground.kt", l = {67, 82, 83, 84, 86}, m = "invokeSuspend", v = 1)
public final class rx30 extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public final /* synthetic */ float A;
    public final /* synthetic */ float B;
    public final /* synthetic */ float C;
    public final /* synthetic */ lx30 D;
    public final /* synthetic */ wd0<Float, ij0> E;
    public final /* synthetic */ wd0<Float, ij0> F;
    public final /* synthetic */ wd0<Float, ij0> G;
    public final /* synthetic */ ytw<Float> H;
    public float a;
    public float b;
    public float c;
    public float d;
    public float e;
    public float f;
    public float i;
    public int v;
    public int w;
    public final /* synthetic */ long y;
    public final /* synthetic */ float z;

    @c0d(c = "com.sportygames.sportyjet.components.RandomIconBackgroundKt$AnimatedStar$1$1$1", f = "RandomIconBackground.kt", l = {}, m = "invokeSuspend", v = 1)
    public static final class a extends tje0 implements Function2<v5b, v1b<? super c9p>, Object> {
        public /* synthetic */ Object a;
        public final /* synthetic */ wd0<Float, ij0> b;
        public final /* synthetic */ float c;
        public final /* synthetic */ wd0<Float, ij0> d;
        public final /* synthetic */ int e;
        public final /* synthetic */ wd0<Float, ij0> f;
        public final /* synthetic */ float i;

        /* JADX INFO: renamed from: rx30$a$a, reason: collision with other inner class name */
        @c0d(c = "com.sportygames.sportyjet.components.RandomIconBackgroundKt$AnimatedStar$1$1$1$1", f = "RandomIconBackground.kt", l = {88}, m = "invokeSuspend", v = 1)
        public static final class C1068a extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
            public int a;
            public final /* synthetic */ wd0<Float, ij0> b;
            public final /* synthetic */ float c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C1068a(wd0<Float, ij0> wd0Var, float f, v1b<? super C1068a> v1bVar) {
                super(2, v1bVar);
                this.b = wd0Var;
                this.c = f;
            }

            @Override // defpackage.pz1
            public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
                return new C1068a(this.b, this.c, v1bVar);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
                return ((C1068a) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
            }

            @Override // defpackage.pz1
            public final Object invokeSuspend(Object obj) {
                y5b y5bVar = y5b.a;
                int i = this.a;
                if (i == 0) {
                    uj50.b(obj);
                    Float f = new Float(this.c);
                    gzg0 gzg0VarE = yi0.e(1000, 0, vkf.e, 2);
                    this.a = 1;
                    if (wd0.a(this.b, f, gzg0VarE, null, null, this, 12) == y5bVar) {
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

        @c0d(c = "com.sportygames.sportyjet.components.RandomIconBackgroundKt$AnimatedStar$1$1$1$2", f = "RandomIconBackground.kt", l = {95}, m = "invokeSuspend", v = 1)
        public static final class b extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
            public int a;
            public final /* synthetic */ wd0<Float, ij0> b;
            public final /* synthetic */ int c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(wd0<Float, ij0> wd0Var, int i, v1b<? super b> v1bVar) {
                super(2, v1bVar);
                this.b = wd0Var;
                this.c = i;
            }

            @Override // defpackage.pz1
            public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
                return new b(this.b, this.c, v1bVar);
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
                    Float f = new Float(-50.0f);
                    gzg0 gzg0VarE = yi0.e(this.c, 0, xkf.d, 2);
                    this.a = 1;
                    if (wd0.a(this.b, f, gzg0VarE, null, null, this, 12) == y5bVar) {
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

        @c0d(c = "com.sportygames.sportyjet.components.RandomIconBackgroundKt$AnimatedStar$1$1$1$3", f = "RandomIconBackground.kt", l = {HttpStatusCodesKt.HTTP_PROCESSING}, m = "invokeSuspend", v = 1)
        public static final class c extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
            public int a;
            public final /* synthetic */ wd0<Float, ij0> b;
            public final /* synthetic */ float c;
            public final /* synthetic */ int d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public c(wd0<Float, ij0> wd0Var, float f, int i, v1b<? super c> v1bVar) {
                super(2, v1bVar);
                this.b = wd0Var;
                this.c = f;
                this.d = i;
            }

            @Override // defpackage.pz1
            public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
                return new c(this.b, this.c, this.d, v1bVar);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
                return ((c) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
            }

            @Override // defpackage.pz1
            public final Object invokeSuspend(Object obj) {
                y5b y5bVar = y5b.a;
                int i = this.a;
                if (i == 0) {
                    uj50.b(obj);
                    Float f = new Float(this.c);
                    gzg0 gzg0VarE = yi0.e(this.d, 0, xkf.d, 2);
                    this.a = 1;
                    if (wd0.a(this.b, f, gzg0VarE, null, null, this, 12) == y5bVar) {
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

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(wd0<Float, ij0> wd0Var, float f, wd0<Float, ij0> wd0Var2, int i, wd0<Float, ij0> wd0Var3, float f2, v1b<? super a> v1bVar) {
            super(2, v1bVar);
            this.b = wd0Var;
            this.c = f;
            this.d = wd0Var2;
            this.e = i;
            this.f = wd0Var3;
            this.i = f2;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            a aVar = new a(this.b, this.c, this.d, this.e, this.f, this.i, v1bVar);
            aVar.a = obj;
            return aVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(v5b v5bVar, v1b<? super c9p> v1bVar) {
            return ((a) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            v5b v5bVar = (v5b) this.a;
            y5b y5bVar = y5b.a;
            uj50.b(obj);
            ej5.c(v5bVar, null, null, new C1068a(this.b, this.c, null), 3);
            wd0<Float, ij0> wd0Var = this.d;
            int i = this.e;
            ej5.c(v5bVar, null, null, new b(wd0Var, i, null), 3);
            return ej5.c(v5bVar, null, null, new c(this.f, this.i, i, null), 3);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rx30(long j, float f, float f2, float f3, float f4, lx30 lx30Var, wd0<Float, ij0> wd0Var, wd0<Float, ij0> wd0Var2, wd0<Float, ij0> wd0Var3, ytw<Float> ytwVar, v1b<? super rx30> v1bVar) {
        super(2, v1bVar);
        this.y = j;
        this.z = f;
        this.A = f2;
        this.B = f3;
        this.C = f4;
        this.D = lx30Var;
        this.E = wd0Var;
        this.F = wd0Var2;
        this.G = wd0Var3;
        this.H = ytwVar;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new rx30(this.y, this.z, this.A, this.B, this.C, this.D, this.E, this.F, this.G, this.H, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        ((rx30) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
        return y5b.a;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0044 A[PHI: r2 r8 r9 r10 r11 r12 r13 r14
      0x0044: PHI (r2v4 float) = (r2v6 float), (r2v14 float) binds: [B:30:0x013e, B:13:0x0031] A[DONT_GENERATE, DONT_INLINE]
      0x0044: PHI (r8v4 int) = (r8v6 int), (r8v13 int) binds: [B:30:0x013e, B:13:0x0031] A[DONT_GENERATE, DONT_INLINE]
      0x0044: PHI (r9v1 float) = (r9v3 float), (r9v11 float) binds: [B:30:0x013e, B:13:0x0031] A[DONT_GENERATE, DONT_INLINE]
      0x0044: PHI (r10v1 float) = (r10v3 float), (r10v10 float) binds: [B:30:0x013e, B:13:0x0031] A[DONT_GENERATE, DONT_INLINE]
      0x0044: PHI (r11v0 float) = (r11v4 float), (r11v14 float) binds: [B:30:0x013e, B:13:0x0031] A[DONT_GENERATE, DONT_INLINE]
      0x0044: PHI (r12v0 float) = (r12v3 float), (r12v12 float) binds: [B:30:0x013e, B:13:0x0031] A[DONT_GENERATE, DONT_INLINE]
      0x0044: PHI (r13v0 float) = (r13v3 float), (r13v15 float) binds: [B:30:0x013e, B:13:0x0031] A[DONT_GENERATE, DONT_INLINE]
      0x0044: PHI (r14v0 float) = (r14v2 float), (r14v16 float) binds: [B:30:0x013e, B:13:0x0031] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:25:0x00f8  */
    /* JADX WARN: Code duplicated, block: B:29:0x0121 A[PHI: r2 r8 r9 r10 r11 r12 r13 r14
      0x0121: PHI (r2v6 float) = (r2v7 float), (r2v13 float) binds: [B:27:0x011e, B:15:0x0051] A[DONT_GENERATE, DONT_INLINE]
      0x0121: PHI (r8v6 int) = (r8v7 int), (r8v12 int) binds: [B:27:0x011e, B:15:0x0051] A[DONT_GENERATE, DONT_INLINE]
      0x0121: PHI (r9v3 float) = (r9v4 float), (r9v10 float) binds: [B:27:0x011e, B:15:0x0051] A[DONT_GENERATE, DONT_INLINE]
      0x0121: PHI (r10v3 float) = (r10v4 float), (r10v9 float) binds: [B:27:0x011e, B:15:0x0051] A[DONT_GENERATE, DONT_INLINE]
      0x0121: PHI (r11v4 float) = (r11v5 float), (r11v13 float) binds: [B:27:0x011e, B:15:0x0051] A[DONT_GENERATE, DONT_INLINE]
      0x0121: PHI (r12v3 float) = (r12v4 float), (r12v11 float) binds: [B:27:0x011e, B:15:0x0051] A[DONT_GENERATE, DONT_INLINE]
      0x0121: PHI (r13v3 float) = (r13v4 float), (r13v14 float) binds: [B:27:0x011e, B:15:0x0051] A[DONT_GENERATE, DONT_INLINE]
      0x0121: PHI (r14v2 float) = (r14v3 float), (r14v15 float) binds: [B:27:0x011e, B:15:0x0051] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x008a, code lost:
    
        if (defpackage.hkd.b(r25.y, r25) == r1) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0173, code lost:
    
        if (defpackage.w5b.d(r16, r25) == r1) goto L34;
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:33:0x0173 -> B:10:0x0023). Please report as a decompilation issue!!! */
    @Override // defpackage.pz1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r26) {
        /*
            Method dump skipped, instruction units count: 374
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rx30.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
