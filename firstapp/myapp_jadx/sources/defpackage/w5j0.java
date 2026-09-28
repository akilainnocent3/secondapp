package defpackage;

import com.sporty.android.core.model.welcomereward.NonFtdEngagement;
import kotlin.Unit;

/* JADX INFO: loaded from: classes5.dex */
public final class w5j0 implements lyh<q1j0> {
    public final /* synthetic */ lyh a;
    public final /* synthetic */ w4j0 b;
    public final /* synthetic */ NonFtdEngagement c;

    @c0d(c = "com.sporty.android.platform.features.welcomereward.WelcomeRewardViewModel$welcomeRewardBannerState$lambda$0$$inlined$map$2", f = "WelcomeRewardViewModel.kt", l = {109}, m = "collect", v = 2)
    public static final class a extends x1b {
        public /* synthetic */ Object a;
        public int b;

        public a(v1b v1bVar) {
            super(v1bVar);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            this.a = obj;
            this.b |= Integer.MIN_VALUE;
            return w5j0.this.collect(null, this);
        }
    }

    public static final class b<T> implements myh {
        public final /* synthetic */ myh a;
        public final /* synthetic */ w4j0 b;
        public final /* synthetic */ NonFtdEngagement c;

        @c0d(c = "com.sporty.android.platform.features.welcomereward.WelcomeRewardViewModel$welcomeRewardBannerState$lambda$0$$inlined$map$2$2", f = "WelcomeRewardViewModel.kt", l = {52, 55, 50}, m = "emit", v = 2)
        public static final class a extends x1b {
            public /* synthetic */ Object a;
            public int b;
            public myh d;
            public boolean e;

            public a(v1b v1bVar) {
                super(v1bVar);
            }

            @Override // defpackage.pz1
            public final Object invokeSuspend(Object obj) {
                this.a = obj;
                this.b |= Integer.MIN_VALUE;
                return b.this.emit(null, this);
            }
        }

        public b(myh myhVar, w4j0 w4j0Var, NonFtdEngagement nonFtdEngagement) {
            this.a = myhVar;
            this.b = w4j0Var;
            this.c = nonFtdEngagement;
        }

        /* JADX WARN: Code duplicated, block: B:28:0x0086  */
        /* JADX WARN: Code duplicated, block: B:31:0x0090  */
        /* JADX WARN: Code duplicated, block: B:36:0x00aa  */
        /* JADX WARN: Code duplicated, block: B:42:0x00bf  */
        /* JADX WARN: Code duplicated, block: B:45:0x00ca  */
        /* JADX WARN: Code duplicated, block: B:47:0x00cd  */
        /* JADX WARN: Code duplicated, block: B:51:0x00d7 A[EDGE_INSN: B:51:0x00d7->B:53:0x00dc BREAK  A[LOOP:0: B:29:0x008a->B:64:?]] */
        /* JADX WARN: Code duplicated, block: B:57:0x0101 A[PHI: r11 r13
          0x0101: PHI (r11v3 myh) = (r11v9 myh), (r11v10 myh), (r11v11 myh) binds: [B:56:0x00fb, B:54:0x00f8, B:16:0x0039] A[DONT_GENERATE, DONT_INLINE]
          0x0101: PHI (r13v22 java.lang.Object) = (r13v2 java.lang.Object), (r13v20 java.lang.Object), (r13v1 java.lang.Object) binds: [B:56:0x00fb, B:54:0x00f8, B:16:0x0039] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Code duplicated, block: B:62:0x009c A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:63:0x00da A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:64:? A[LOOP:0: B:29:0x008a->B:64:?, LOOP_END, SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:65:0x00ba A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        /* JADX WARN: Code restructure failed: missing block: B:58:0x0109, code lost:
        
            if (r11.emit(r13, r0) == r1) goto L59;
         */
        @Override // defpackage.myh
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object emit(java.lang.Object r12, defpackage.v1b r13) {
            /*
                Method dump skipped, instruction units count: 271
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: w5j0.b.emit(java.lang.Object, v1b):java.lang.Object");
        }
    }

    public w5j0(lyh lyhVar, w4j0 w4j0Var, NonFtdEngagement nonFtdEngagement) {
        this.a = lyhVar;
        this.b = w4j0Var;
        this.c = nonFtdEngagement;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // defpackage.lyh
    public final Object collect(myh<? super q1j0> myhVar, v1b v1bVar) {
        a aVar;
        if (v1bVar instanceof a) {
            aVar = (a) v1bVar;
            int i = aVar.b;
            if ((i & Integer.MIN_VALUE) != 0) {
                aVar.b = i - Integer.MIN_VALUE;
            } else {
                aVar = new a(v1bVar);
            }
        } else {
            aVar = new a(v1bVar);
        }
        Object obj = aVar.a;
        y5b y5bVar = y5b.a;
        int i2 = aVar.b;
        if (i2 == 0) {
            uj50.b(obj);
            b bVar = new b(myhVar, this.b, this.c);
            aVar.b = 1;
            if (this.a.collect(bVar, aVar) == y5bVar) {
                return y5bVar;
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
