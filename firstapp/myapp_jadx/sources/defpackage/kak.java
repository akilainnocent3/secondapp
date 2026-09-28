package defpackage;

import com.google.protobuf.DescriptorProtos;
import com.sporty.android.common.network.data.BaseResponse;
import com.sportybet.android.globalpay.data.FullSummaryData;
import com.sportybet.android.globalpay.data.KycLimitData;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import okhttp3.internal.ws.WebSocketProtocol;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sportybet.android.globalpay.usecase.GetPaymentLimitsUseCase$invoke$2", f = "GetPaymentLimitsUseCase.kt", l = {70, 71}, m = "invokeSuspend", v = 2)
public final class kak extends tje0 implements Function2<v5b, v1b<? super jak.b>, Object> {
    public pjd a;
    public Object b;
    public int c;
    public /* synthetic */ Object d;
    public final /* synthetic */ jak e;
    public final /* synthetic */ ga00 f;
    public final /* synthetic */ jak.a i;

    @c0d(c = "com.sportybet.android.globalpay.usecase.GetPaymentLimitsUseCase$invoke$2$fullSummaryDeferred$1", f = "GetPaymentLimitsUseCase.kt", l = {DescriptorProtos.FileOptions.RUBY_PACKAGE_FIELD_NUMBER, 49}, m = "invokeSuspend", v = 2)
    public static final class a extends tje0 implements Function2<v5b, v1b<? super zi50<? extends FullSummaryData>>, Object> {
        public jak a;
        public ga00 b;
        public u1l c;
        public int d;
        public /* synthetic */ Object e;
        public final /* synthetic */ jak f;
        public final /* synthetic */ ga00 i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(jak jakVar, ga00 ga00Var, v1b<? super a> v1bVar) {
            super(2, v1bVar);
            this.f = jakVar;
            this.i = ga00Var;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            a aVar = new a(this.f, this.i, v1bVar);
            aVar.e = obj;
            return aVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(v5b v5bVar, v1b<? super zi50<? extends FullSummaryData>> v1bVar) {
            return ((a) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:23:0x0067, code lost:
        
            if (r9 == r0) goto L24;
         */
        @Override // defpackage.pz1
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r9) {
            /*
                r8 = this;
                java.lang.Object r0 = r8.e
                v5b r0 = (defpackage.v5b) r0
                y5b r0 = defpackage.y5b.a
                int r1 = r8.d
                r2 = 2
                r3 = 1
                r4 = 0
                if (r1 == 0) goto L29
                if (r1 == r3) goto L1f
                if (r1 != r2) goto L19
                jak r8 = r8.a
                v5b r8 = (defpackage.v5b) r8
                defpackage.uj50.b(r9)     // Catch: java.lang.Throwable -> L75
                goto L6a
            L19:
                java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
                defpackage.ib5.a(r8)
                return r4
            L1f:
                u1l r1 = r8.c
                ga00 r5 = r8.b
                jak r6 = r8.a
                defpackage.uj50.b(r9)     // Catch: java.lang.Throwable -> L75
                goto L47
            L29:
                defpackage.uj50.b(r9)
                jak r6 = r8.f
                ga00 r5 = r8.i
                zi50$a r9 = defpackage.zi50.b     // Catch: java.lang.Throwable -> L75
                u1l r1 = r6.c     // Catch: java.lang.Throwable -> L75
                mgb0 r9 = r6.a     // Catch: java.lang.Throwable -> L75
                r8.e = r4     // Catch: java.lang.Throwable -> L75
                r8.a = r6     // Catch: java.lang.Throwable -> L75
                r8.b = r5     // Catch: java.lang.Throwable -> L75
                r8.c = r1     // Catch: java.lang.Throwable -> L75
                r8.d = r3     // Catch: java.lang.Throwable -> L75
                java.lang.Object r9 = r9.getUserId(r8)     // Catch: java.lang.Throwable -> L75
                if (r9 != r0) goto L47
                goto L69
            L47:
                java.lang.String r9 = (java.lang.String) r9     // Catch: java.lang.Throwable -> L75
                psm r6 = r6.b     // Catch: java.lang.Throwable -> L75
                java.lang.String r6 = r6.B()     // Catch: java.lang.Throwable -> L75
                ga00 r7 = defpackage.ga00.WITHDRAW     // Catch: java.lang.Throwable -> L75
                if (r5 != r7) goto L54
                goto L55
            L54:
                r3 = 0
            L55:
                lyh r9 = r1.c(r9, r6, r3)     // Catch: java.lang.Throwable -> L75
                r8.e = r4     // Catch: java.lang.Throwable -> L75
                r8.a = r4     // Catch: java.lang.Throwable -> L75
                r8.b = r4     // Catch: java.lang.Throwable -> L75
                r8.c = r4     // Catch: java.lang.Throwable -> L75
                r8.d = r2     // Catch: java.lang.Throwable -> L75
                java.lang.Object r9 = defpackage.bm50.r(r9, r4, r8)     // Catch: java.lang.Throwable -> L75
                if (r9 != r0) goto L6a
            L69:
                return r0
            L6a:
                com.sporty.android.common.network.data.BaseResponse r9 = (com.sporty.android.common.network.data.BaseResponse) r9     // Catch: java.lang.Throwable -> L75
                java.lang.Object r8 = defpackage.n52.b(r9)     // Catch: java.lang.Throwable -> L75
                com.sportybet.android.globalpay.data.FullSummaryData r8 = (com.sportybet.android.globalpay.data.FullSummaryData) r8     // Catch: java.lang.Throwable -> L75
                zi50$a r9 = defpackage.zi50.b     // Catch: java.lang.Throwable -> L75
                goto L7e
            L75:
                r8 = move-exception
                zi50$a r9 = defpackage.zi50.b
                zi50$b r9 = new zi50$b
                r9.<init>(r8)
                r8 = r9
            L7e:
                zi50 r9 = new zi50
                r9.<init>(r8)
                return r9
            */
            throw new UnsupportedOperationException("Method not decompiled: kak.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @c0d(c = "com.sportybet.android.globalpay.usecase.GetPaymentLimitsUseCase$invoke$2$kycLimitsDeferred$1", f = "GetPaymentLimitsUseCase.kt", l = {WebSocketProtocol.B0_FLAG_RSV1}, m = "invokeSuspend", v = 2)
    public static final class b extends tje0 implements Function2<v5b, v1b<? super zi50<? extends KycLimitData>>, Object> {
        public int a;
        public /* synthetic */ Object b;
        public final /* synthetic */ jak.a c;
        public final /* synthetic */ jak d;
        public final /* synthetic */ ga00 e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(v1b v1bVar, jak.a aVar, jak jakVar, ga00 ga00Var) {
            super(2, v1bVar);
            this.c = aVar;
            this.d = jakVar;
            this.e = ga00Var;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            b bVar = new b(v1bVar, this.c, this.d, this.e);
            bVar.b = obj;
            return bVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(v5b v5bVar, v1b<? super zi50<? extends KycLimitData>> v1bVar) {
            return ((b) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            y5b y5bVar = y5b.a;
            int i = this.a;
            Object bVar = null;
            try {
                if (i == 0) {
                    uj50.b(obj);
                    jak.a aVar = this.c;
                    if (aVar == null) {
                        zi50.a aVar2 = zi50.b;
                    } else {
                        jak jakVar = this.d;
                        ga00 ga00Var = this.e;
                        zi50.a aVar3 = zi50.b;
                        lyh lyhVarA = jakVar.c.a(new String[]{String.valueOf(aVar.a.a)}, new String[]{String.valueOf(aVar.b.a)}, new String[]{String.valueOf(ga00Var.a)});
                        this.b = null;
                        this.a = 1;
                        obj = bm50.r(lyhVarA, null, this);
                        if (obj == y5bVar) {
                            return y5bVar;
                        }
                    }
                    return new zi50(bVar);
                }
                if (i != 1) {
                    ib5.a("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                uj50.b(obj);
                KycLimitData kycLimitData = (KycLimitData) n52.b((BaseResponse) obj);
                zi50.a aVar4 = zi50.b;
                bVar = kycLimitData;
            } catch (Throwable th) {
                zi50.a aVar5 = zi50.b;
                bVar = new zi50.b(th);
            }
            return new zi50(bVar);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kak(v1b v1bVar, jak.a aVar, jak jakVar, ga00 ga00Var) {
        super(2, v1bVar);
        this.e = jakVar;
        this.f = ga00Var;
        this.i = aVar;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        kak kakVar = new kak(v1bVar, this.i, this.e, this.f);
        kakVar.d = obj;
        return kakVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super jak.b> v1bVar) {
        return ((kak) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) throws Throwable {
        pjd pjdVarA;
        Object obj2;
        v5b v5bVar = (v5b) this.d;
        y5b y5bVar = y5b.a;
        int i = this.c;
        if (i != 0) {
            if (i == 1) {
                pjdVarA = this.a;
                uj50.b(obj);
            } else {
                if (i != 2) {
                    ib5.a("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                obj2 = this.b;
                uj50.b(obj);
            }
            return new jak.b(obj2, ((zi50) obj).a);
        }
        uj50.b(obj);
        jak jakVar = this.e;
        ga00 ga00Var = this.f;
        pjd pjdVarA2 = ej5.a(v5bVar, null, new a(jakVar, ga00Var, null), 3);
        pjdVarA = ej5.a(v5bVar, null, new b(null, this.i, jakVar, ga00Var), 3);
        this.d = null;
        this.a = pjdVarA;
        this.c = 1;
        obj = pjdVarA2.q(this);
        if (obj != y5bVar) {
        }
        return y5bVar;
        Object obj3 = ((zi50) obj).a;
        this.d = null;
        this.a = null;
        this.b = obj3;
        this.c = 2;
        Object objAwait = pjdVarA.await(this);
        if (objAwait != y5bVar) {
            obj = objAwait;
            obj2 = obj3;
            return new jak.b(obj2, ((zi50) obj).a);
        }
        return y5bVar;
    }
}
