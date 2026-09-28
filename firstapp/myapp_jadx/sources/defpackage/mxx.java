package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sporty.android.platform.features.welcomereward.NonFtdEngagementRefresher$1", f = "NonFtdEngagementRefresher.kt", l = {46}, m = "invokeSuspend", v = 2)
public final class mxx extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public int a;
    public final /* synthetic */ mgb0 b;
    public final /* synthetic */ rxx c;

    public static final class a<T> implements myh {
        public final /* synthetic */ rxx a;
        public final /* synthetic */ dq40<Boolean> b;

        /* JADX INFO: renamed from: mxx$a$a, reason: collision with other inner class name */
        @c0d(c = "com.sporty.android.platform.features.welcomereward.NonFtdEngagementRefresher$1$1", f = "NonFtdEngagementRefresher.kt", l = {48, 77, 51, 53}, m = "emit", v = 2)
        public static final class C0883a extends x1b {
            public boolean a;
            public quw b;
            public rxx c;
            public /* synthetic */ Object d;
            public final /* synthetic */ a<T> e;
            public int f;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public C0883a(a<? super T> aVar, v1b<? super C0883a> v1bVar) {
                super(v1bVar);
                this.e = aVar;
            }

            @Override // defpackage.pz1
            public final Object invokeSuspend(Object obj) {
                this.d = obj;
                this.f |= Integer.MIN_VALUE;
                return this.e.c(false, this);
            }
        }

        public a(rxx rxxVar, dq40<Boolean> dq40Var) {
            this.a = rxxVar;
            this.b = dq40Var;
        }

        /* JADX WARN: Code duplicated, block: B:41:0x009b A[Catch: all -> 0x00ad, TryCatch #1 {all -> 0x00ad, blocks: (B:44:0x00aa, B:47:0x00b0, B:39:0x0097, B:41:0x009b), top: B:59:0x0097 }] */
        /* JADX WARN: Code duplicated, block: B:43:0x00a9  */
        /* JADX WARN: Code duplicated, block: B:44:0x00aa A[Catch: all -> 0x00ad, PHI: r2 r10 r11 r12
          0x00aa: PHI (r2v5 java.lang.Object) = (r2v4 java.lang.Object), (r2v9 java.lang.Object) binds: [B:42:0x00a7, B:23:0x004a] A[DONT_GENERATE, DONT_INLINE]
          0x00aa: PHI (r10v7 boolean) = (r10v4 boolean), (r10v15 boolean) binds: [B:42:0x00a7, B:23:0x004a] A[DONT_GENERATE, DONT_INLINE]
          0x00aa: PHI (r11v9 rxx) = (r11v2 rxx), (r11v18 rxx) binds: [B:42:0x00a7, B:23:0x004a] A[DONT_GENERATE, DONT_INLINE]
          0x00aa: PHI (r12v8 quw) = (r12v5 quw), (r12v12 quw) binds: [B:42:0x00a7, B:23:0x004a] A[DONT_GENERATE, DONT_INLINE], TryCatch #1 {all -> 0x00ad, blocks: (B:44:0x00aa, B:47:0x00b0, B:39:0x0097, B:41:0x009b), top: B:59:0x0097 }] */
        /* JADX WARN: Code duplicated, block: B:47:0x00b0 A[Catch: all -> 0x00ad, PHI: r10 r11 r12
          0x00b0: PHI (r10v6 boolean) = (r10v4 boolean), (r10v7 boolean) binds: [B:40:0x0099, B:44:0x00aa] A[DONT_GENERATE, DONT_INLINE]
          0x00b0: PHI (r11v4 rxx) = (r11v2 rxx), (r11v9 rxx) binds: [B:40:0x0099, B:44:0x00aa] A[DONT_GENERATE, DONT_INLINE]
          0x00b0: PHI (r12v7 quw) = (r12v5 quw), (r12v8 quw) binds: [B:40:0x0099, B:44:0x00aa] A[DONT_GENERATE, DONT_INLINE], TRY_LEAVE, TryCatch #1 {all -> 0x00ad, blocks: (B:44:0x00aa, B:47:0x00b0, B:39:0x0097, B:41:0x009b), top: B:59:0x0097 }] */
        /* JADX WARN: Code duplicated, block: B:50:0x00c7  */
        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        /* JADX WARN: Code restructure failed: missing block: B:31:0x0076, code lost:
        
            if (r10.a(r0) == r1) goto L49;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object c(boolean r11, defpackage.v1b<? super kotlin.Unit> r12) throws java.lang.Throwable {
            /*
                Method dump skipped, instruction units count: 220
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: mxx.a.c(boolean, v1b):java.lang.Object");
        }

        @Override // defpackage.myh
        public final /* bridge */ /* synthetic */ Object emit(Object obj, v1b v1bVar) {
            return c(((Boolean) obj).booleanValue(), v1bVar);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mxx(mgb0 mgb0Var, rxx rxxVar, v1b<? super mxx> v1bVar) {
        super(2, v1bVar);
        this.b = mgb0Var;
        this.c = rxxVar;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new mxx(this.b, this.c, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((mxx) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        y5b y5bVar = y5b.a;
        int i = this.a;
        if (i == 0) {
            dq40 dq40VarA = j6w.a(obj);
            lyh lyhVarB = uzh.b(this.b.isLoginFlow());
            a aVar = new a(this.c, dq40VarA);
            this.a = 1;
            if (lyhVarB.collect(aVar, this) == y5bVar) {
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
