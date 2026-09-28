package defpackage;

import com.sporty.android.core.model.pocket.common.ChannelAsset;
import kotlin.Unit;

/* JADX INFO: loaded from: classes6.dex */
public final class tak implements lyh<ChannelAsset.Channel> {
    public final /* synthetic */ sl50 a;
    public final /* synthetic */ rak b;
    public final /* synthetic */ log0 c;

    @c0d(c = "com.sportybet.feature.payment.impl.common.domain.usecase.GetPhoneChannelUseCase$getTZPhoneChannel$$inlined$map$1", f = "GetPhoneChannelUseCase.kt", l = {109}, m = "collect", v = 2)
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
            return tak.this.collect(null, this);
        }
    }

    public static final class b<T> implements myh {
        public final /* synthetic */ myh a;
        public final /* synthetic */ rak b;
        public final /* synthetic */ log0 c;

        @c0d(c = "com.sportybet.feature.payment.impl.common.domain.usecase.GetPhoneChannelUseCase$getTZPhoneChannel$$inlined$map$1$2", f = "GetPhoneChannelUseCase.kt", l = {54, 50}, m = "emit", v = 2)
        public static final class a extends x1b {
            public /* synthetic */ Object a;
            public int b;
            public myh d;

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

        public b(myh myhVar, rak rakVar, log0 log0Var) {
            this.a = myhVar;
            this.b = rakVar;
            this.c = log0Var;
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        /* JADX WARN: Code restructure failed: missing block: B:39:0x0086, code lost:
        
            if (r9.emit(r7, r0) == r1) goto L40;
         */
        @Override // defpackage.myh
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object emit(java.lang.Object r8, defpackage.v1b r9) {
            /*
                r7 = this;
                boolean r0 = r9 instanceof tak.b.a
                if (r0 == 0) goto L13
                r0 = r9
                tak$b$a r0 = (tak.b.a) r0
                int r1 = r0.b
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.b = r1
                goto L18
            L13:
                tak$b$a r0 = new tak$b$a
                r0.<init>(r9)
            L18:
                java.lang.Object r9 = r0.a
                y5b r1 = defpackage.y5b.a
                int r2 = r0.b
                r3 = 2
                r4 = 1
                r5 = 0
                if (r2 == 0) goto L38
                if (r2 == r4) goto L32
                if (r2 != r3) goto L2c
                defpackage.uj50.b(r9)
                goto L89
            L2c:
                java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                defpackage.ib5.a(r7)
                return r5
            L32:
                myh r7 = r0.d
                defpackage.uj50.b(r9)
                goto L79
            L38:
                defpackage.uj50.b(r9)
                lk50 r8 = (defpackage.lk50) r8
                boolean r9 = r8 instanceof lk50.c
                if (r9 == 0) goto L44
                lk50$c r8 = (lk50.c) r8
                goto L45
            L44:
                r8 = r5
            L45:
                myh r9 = r7.a
                if (r8 == 0) goto L7d
                T r8 = r8.a
                com.sporty.android.core.model.pocket.common.AssetData r8 = (com.sporty.android.core.model.pocket.common.AssetData) r8
                if (r8 != 0) goto L50
                goto L7d
            L50:
                rak r2 = r7.b
                c4k r2 = r2.c
                java.util.List r8 = r8.getMobileMoneys()
                if (r8 == 0) goto L7d
                java.lang.Object r8 = kotlin.collections.CollectionsKt.firstOrNull(r8)
                com.sporty.android.core.model.pocket.common.AssetData$MobileBean r8 = (com.sporty.android.core.model.pocket.common.AssetData.MobileBean) r8
                if (r8 == 0) goto L7d
                java.lang.String r8 = r8.getChannel()
                if (r8 != 0) goto L69
                goto L7d
            L69:
                r0.d = r9
                r0.b = r4
                log0 r7 = r7.c
                java.lang.Object r7 = r2.d(r7, r8, r0)
                if (r7 != r1) goto L76
                goto L88
            L76:
                r6 = r9
                r9 = r7
                r7 = r6
            L79:
                r6 = r9
                r9 = r7
                r7 = r6
                goto L7e
            L7d:
                r7 = r5
            L7e:
                r0.d = r5
                r0.b = r3
                java.lang.Object r7 = r9.emit(r7, r0)
                if (r7 != r1) goto L89
            L88:
                return r1
            L89:
                kotlin.Unit r7 = kotlin.Unit.a
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: tak.b.emit(java.lang.Object, v1b):java.lang.Object");
        }
    }

    public tak(sl50 sl50Var, rak rakVar, log0 log0Var) {
        this.a = sl50Var;
        this.b = rakVar;
        this.c = log0Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // defpackage.lyh
    public final Object collect(myh<? super ChannelAsset.Channel> myhVar, v1b v1bVar) {
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
