package defpackage;

import kotlin.Unit;

/* JADX INFO: loaded from: classes.dex */
public final class pfk implements lyh<lk50<? extends fwf0>> {
    public final /* synthetic */ yzh a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ qfk c;

    @c0d(c = "com.sportybet.android.limits.domain.GetTimeLimitsUseCase$invoke$$inlined$map$1", f = "GetTimeLimitsUseCase.kt", l = {109}, m = "collect", v = 2)
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
            return pfk.this.collect(null, this);
        }
    }

    public static final class b<T> implements myh {
        public final /* synthetic */ myh a;
        public final /* synthetic */ boolean b;
        public final /* synthetic */ qfk c;

        @c0d(c = "com.sportybet.android.limits.domain.GetTimeLimitsUseCase$invoke$$inlined$map$1$2", f = "GetTimeLimitsUseCase.kt", l = {66, 50}, m = "emit", v = 2)
        public static final class a extends x1b {
            public /* synthetic */ Object a;
            public int b;
            public myh d;
            public lk50.c e;
            public fwf0 f;

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

        public b(myh myhVar, boolean z, qfk qfkVar) {
            this.a = myhVar;
            this.b = z;
            this.c = qfkVar;
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0017  */
        /* JADX WARN: Code restructure failed: missing block: B:53:0x00e2, code lost:
        
            if (r8.emit(r4, r2) == r3) goto L54;
         */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // defpackage.myh
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object emit(java.lang.Object r18, defpackage.v1b r19) {
            /*
                Method dump skipped, instruction units count: 236
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: pfk.b.emit(java.lang.Object, v1b):java.lang.Object");
        }
    }

    public pfk(yzh yzhVar, boolean z, qfk qfkVar) {
        this.a = yzhVar;
        this.b = z;
        this.c = qfkVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // defpackage.lyh
    public final Object collect(myh<? super lk50<? extends fwf0>> myhVar, v1b v1bVar) {
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
