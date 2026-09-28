package defpackage;

import com.sporty.android.common.network.data.BaseResponse;
import com.sporty.android.core.model.patron.LoginResponse;
import kotlin.Unit;

/* JADX INFO: loaded from: classes7.dex */
public final class zit implements lyh<rit> {
    public final /* synthetic */ lyh a;
    public final /* synthetic */ djt b;
    public final /* synthetic */ String c;

    @c0d(c = "com.sportybet.plugin.sportydesk.domain.LoginUseCase$execute$$inlined$map$1", f = "LoginUseCase.kt", l = {109}, m = "collect", v = 2)
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
            return zit.this.collect(null, this);
        }
    }

    public static final class b<T> implements myh {
        public final /* synthetic */ myh a;
        public final /* synthetic */ djt b;
        public final /* synthetic */ String c;

        @c0d(c = "com.sportybet.plugin.sportydesk.domain.LoginUseCase$execute$$inlined$map$1$2", f = "LoginUseCase.kt", l = {58, 50}, m = "emit", v = 2)
        public static final class a extends x1b {
            public /* synthetic */ Object a;
            public int b;
            public myh d;
            public BaseResponse e;
            public LoginResponse f;

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

        public b(myh myhVar, djt djtVar, String str) {
            this.a = myhVar;
            this.b = djtVar;
            this.c = str;
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        /* JADX WARN: Code restructure failed: missing block: B:31:0x00b6, code lost:
        
            if (r6.emit(r9, r0) == r1) goto L32;
         */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // defpackage.myh
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object emit(java.lang.Object r10, defpackage.v1b r11) throws java.lang.Throwable {
            /*
                r9 = this;
                boolean r0 = r11 instanceof zit.b.a
                if (r0 == 0) goto L13
                r0 = r11
                zit$b$a r0 = (zit.b.a) r0
                int r1 = r0.b
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.b = r1
                goto L18
            L13:
                zit$b$a r0 = new zit$b$a
                r0.<init>(r11)
            L18:
                java.lang.Object r11 = r0.a
                y5b r1 = defpackage.y5b.a
                int r2 = r0.b
                r3 = 1
                r4 = 2
                r5 = 0
                if (r2 == 0) goto L3c
                if (r2 == r3) goto L32
                if (r2 != r4) goto L2c
                defpackage.uj50.b(r11)
                goto Lb9
            L2c:
                java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
                defpackage.ib5.a(r9)
                return r5
            L32:
                com.sporty.android.core.model.patron.LoginResponse r9 = r0.f
                com.sporty.android.common.network.data.BaseResponse r10 = r0.e
                myh r2 = r0.d
                defpackage.uj50.b(r11)
                goto L96
            L3c:
                defpackage.uj50.b(r11)
                com.sporty.android.common.network.data.BaseResponse r10 = (com.sporty.android.common.network.data.BaseResponse) r10
                int r11 = r10.bizCode
                r2 = 10000(0x2710, float:1.4013E-41)
                myh r6 = r9.a
                if (r11 != r2) goto La0
                T r2 = r10.data
                com.sporty.android.core.model.patron.LoginResponse r2 = (com.sporty.android.core.model.patron.LoginResponse) r2
                if (r2 != 0) goto L5a
                rit$a r9 = new rit$a
                java.lang.Integer r10 = new java.lang.Integer
                r10.<init>(r11)
                r9.<init>(r10, r5, r4)
                goto Laa
            L5a:
                com.sporty.android.core.model.patron.LoginResponse$SelfExclusion r11 = r2.getSelfExclusion()
                long r7 = com.sporty.android.core.model.patron.LoginResponseKt.resolveLoginTimeOrNow(r11)
                java.lang.String r11 = r9.c
                vqm r11 = vqm.a.a(r2, r11, r7)
                r0.d = r6
                r0.e = r10
                r0.f = r2
                r0.b = r3
                djt r9 = r9.b
                r9.getClass()
                nr60 r3 = new nr60
                v1b r7 = defpackage.yzo.b(r0)
                r3.<init>(r7)
                uqm r9 = r9.d
                cjt r7 = new cjt
                r7.<init>(r3)
                r9.saveToken(r5, r11, r7)
                java.lang.Object r9 = r3.a()
                if (r9 != r1) goto L8f
                goto L91
            L8f:
                kotlin.Unit r9 = kotlin.Unit.a
            L91:
                if (r9 != r1) goto L94
                goto Lb8
            L94:
                r9 = r2
                r2 = r6
            L96:
                rit$b r11 = new rit$b
                int r10 = r10.bizCode
                r11.<init>(r9, r10)
                r9 = r11
                r6 = r2
                goto Laa
            La0:
                rit$a r9 = new rit$a
                java.lang.Integer r10 = new java.lang.Integer
                r10.<init>(r11)
                r9.<init>(r10, r5, r4)
            Laa:
                r0.d = r5
                r0.e = r5
                r0.f = r5
                r0.b = r4
                java.lang.Object r9 = r6.emit(r9, r0)
                if (r9 != r1) goto Lb9
            Lb8:
                return r1
            Lb9:
                kotlin.Unit r9 = kotlin.Unit.a
                return r9
            */
            throw new UnsupportedOperationException("Method not decompiled: zit.b.emit(java.lang.Object, v1b):java.lang.Object");
        }
    }

    public zit(lyh lyhVar, djt djtVar, String str) {
        this.a = lyhVar;
        this.b = djtVar;
        this.c = str;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // defpackage.lyh
    public final Object collect(myh<? super rit> myhVar, v1b v1bVar) {
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
