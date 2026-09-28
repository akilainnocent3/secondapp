package defpackage;

import com.google.protobuf.DescriptorProtos;
import com.sporty.android.common.network.data.BaseResponse;
import com.sporty.android.core.model.pocket.banktrade.BankTradeData;
import com.sporty.android.core.model.pocket.common.BankTradeResponse;
import com.sporty.android.core.model.pocket.withdraw.WithDrawInfo;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
@fae
public final class h600 implements g600 {
    public final psm a;
    public final pr10 b;

    @c0d(c = "com.sportybet.android.basepay.repository.PaymentApiRepoImpl$deposit$1", f = "PaymentApiRepoImpl.kt", l = {32, 32}, m = "invokeSuspend", v = 2)
    public static final class a extends tje0 implements Function2<myh<? super BaseResponse<BankTradeResponse>>, v1b<? super Unit>, Object> {
        public myh a;
        public int b;
        public /* synthetic */ Object c;
        public final /* synthetic */ String e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String str, v1b<? super a> v1bVar) {
            super(2, v1bVar);
            this.e = str;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            a aVar = h600.this.new a(this.e, v1bVar);
            aVar.c = obj;
            return aVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(myh<? super BaseResponse<BankTradeResponse>> myhVar, v1b<? super Unit> v1bVar) {
            return ((a) create(myhVar, v1bVar)).invokeSuspend(Unit.a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x0041, code lost:
        
            if (r0.emit(r7, r6) == r1) goto L15;
         */
        @Override // defpackage.pz1
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r7) {
            /*
                r6 = this;
                java.lang.Object r0 = r6.c
                myh r0 = (defpackage.myh) r0
                y5b r1 = defpackage.y5b.a
                int r2 = r6.b
                r3 = 2
                r4 = 1
                r5 = 0
                if (r2 == 0) goto L21
                if (r2 == r4) goto L1b
                if (r2 != r3) goto L15
                defpackage.uj50.b(r7)
                goto L44
            L15:
                java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                defpackage.ib5.a(r6)
                return r5
            L1b:
                myh r0 = r6.a
                defpackage.uj50.b(r7)
                goto L37
            L21:
                defpackage.uj50.b(r7)
                h600 r7 = defpackage.h600.this
                pr10 r7 = r7.b
                r6.c = r5
                r6.a = r0
                r6.b = r4
                java.lang.String r2 = r6.e
                java.lang.Object r7 = r7.T(r2, r6)
                if (r7 != r1) goto L37
                goto L43
            L37:
                r6.c = r5
                r6.a = r5
                r6.b = r3
                java.lang.Object r6 = r0.emit(r7, r6)
                if (r6 != r1) goto L44
            L43:
                return r1
            L44:
                kotlin.Unit r6 = kotlin.Unit.a
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: h600.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @c0d(c = "com.sportybet.android.basepay.repository.PaymentApiRepoImpl$getBankTrade$1", f = "PaymentApiRepoImpl.kt", l = {40, 40}, m = "invokeSuspend", v = 2)
    public static final class b extends tje0 implements Function2<myh<? super BaseResponse<BankTradeData>>, v1b<? super Unit>, Object> {
        public myh a;
        public int b;
        public /* synthetic */ Object c;
        public final /* synthetic */ String e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(String str, v1b<? super b> v1bVar) {
            super(2, v1bVar);
            this.e = str;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            b bVar = h600.this.new b(this.e, v1bVar);
            bVar.c = obj;
            return bVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(myh<? super BaseResponse<BankTradeData>> myhVar, v1b<? super Unit> v1bVar) {
            return ((b) create(myhVar, v1bVar)).invokeSuspend(Unit.a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x0041, code lost:
        
            if (r0.emit(r7, r6) == r1) goto L15;
         */
        @Override // defpackage.pz1
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r7) {
            /*
                r6 = this;
                java.lang.Object r0 = r6.c
                myh r0 = (defpackage.myh) r0
                y5b r1 = defpackage.y5b.a
                int r2 = r6.b
                r3 = 2
                r4 = 1
                r5 = 0
                if (r2 == 0) goto L21
                if (r2 == r4) goto L1b
                if (r2 != r3) goto L15
                defpackage.uj50.b(r7)
                goto L44
            L15:
                java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                defpackage.ib5.a(r6)
                return r5
            L1b:
                myh r0 = r6.a
                defpackage.uj50.b(r7)
                goto L37
            L21:
                defpackage.uj50.b(r7)
                h600 r7 = defpackage.h600.this
                pr10 r7 = r7.b
                r6.c = r5
                r6.a = r0
                r6.b = r4
                java.lang.String r2 = r6.e
                java.lang.Object r7 = r7.B(r2, r6)
                if (r7 != r1) goto L37
                goto L43
            L37:
                r6.c = r5
                r6.a = r5
                r6.b = r3
                java.lang.Object r6 = r0.emit(r7, r6)
                if (r6 != r1) goto L44
            L43:
                return r1
            L44:
                kotlin.Unit r6 = kotlin.Unit.a
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: h600.b.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @c0d(c = "com.sportybet.android.basepay.repository.PaymentApiRepoImpl$getWithdrawBalance$1", f = "PaymentApiRepoImpl.kt", l = {21, 20}, m = "invokeSuspend", v = 2)
    public static final class c extends tje0 implements Function2<myh<? super BaseResponse<WithDrawInfo>>, v1b<? super Unit>, Object> {
        public myh a;
        public int b;
        public /* synthetic */ Object c;

        public c(v1b<? super c> v1bVar) {
            super(2, v1bVar);
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            c cVar = h600.this.new c(v1bVar);
            cVar.c = obj;
            return cVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(myh<? super BaseResponse<WithDrawInfo>> myhVar, v1b<? super Unit> v1bVar) {
            return ((c) create(myhVar, v1bVar)).invokeSuspend(Unit.a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:21:0x0056, code lost:
        
            if (r2.emit(r9, r8) == r3) goto L22;
         */
        @Override // defpackage.pz1
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r9) {
            /*
                r8 = this;
                h600 r0 = defpackage.h600.this
                psm r1 = r0.a
                java.lang.Object r2 = r8.c
                myh r2 = (defpackage.myh) r2
                y5b r3 = defpackage.y5b.a
                int r4 = r8.b
                r5 = 2
                r6 = 1
                r7 = 0
                if (r4 == 0) goto L25
                if (r4 == r6) goto L1f
                if (r4 != r5) goto L19
                defpackage.uj50.b(r9)
                goto L59
            L19:
                java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
                defpackage.ib5.a(r8)
                return r7
            L1f:
                myh r2 = r8.a
                defpackage.uj50.b(r9)
                goto L4c
            L25:
                defpackage.uj50.b(r9)
                pr10 r9 = r0.b
                boolean r0 = r1.r()
                if (r0 != 0) goto L3b
                com.sporty.android.core.model.service.CountryCodeName r0 = r1.getCountryCode()
                com.sporty.android.core.model.service.CountryCodeName r4 = com.sporty.android.core.model.service.CountryCodeName.SOUTH_AFRICA
                if (r0 != r4) goto L39
                goto L3b
            L39:
                r0 = r7
                goto L3f
            L3b:
                java.lang.String r0 = r1.B()
            L3f:
                r8.c = r7
                r8.a = r2
                r8.b = r6
                java.lang.Object r9 = r9.g0(r0, r8)
                if (r9 != r3) goto L4c
                goto L58
            L4c:
                r8.c = r7
                r8.a = r7
                r8.b = r5
                java.lang.Object r8 = r2.emit(r9, r8)
                if (r8 != r3) goto L59
            L58:
                return r3
            L59:
                kotlin.Unit r8 = kotlin.Unit.a
                return r8
            */
            throw new UnsupportedOperationException("Method not decompiled: h600.c.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @c0d(c = "com.sportybet.android.basepay.repository.PaymentApiRepoImpl$withdraw$1", f = "PaymentApiRepoImpl.kt", l = {DescriptorProtos.FileOptions.OBJC_CLASS_PREFIX_FIELD_NUMBER, DescriptorProtos.FileOptions.OBJC_CLASS_PREFIX_FIELD_NUMBER}, m = "invokeSuspend", v = 2)
    public static final class d extends tje0 implements Function2<myh<? super BaseResponse<BankTradeResponse>>, v1b<? super Unit>, Object> {
        public myh a;
        public int b;
        public /* synthetic */ Object c;
        public final /* synthetic */ String e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(String str, v1b<? super d> v1bVar) {
            super(2, v1bVar);
            this.e = str;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            d dVar = h600.this.new d(this.e, v1bVar);
            dVar.c = obj;
            return dVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(myh<? super BaseResponse<BankTradeResponse>> myhVar, v1b<? super Unit> v1bVar) {
            return ((d) create(myhVar, v1bVar)).invokeSuspend(Unit.a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x0042, code lost:
        
            if (r0.emit(r7, r6) == r1) goto L15;
         */
        @Override // defpackage.pz1
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r7) {
            /*
                r6 = this;
                java.lang.Object r0 = r6.c
                myh r0 = (defpackage.myh) r0
                y5b r1 = defpackage.y5b.a
                int r2 = r6.b
                r3 = 2
                r4 = 1
                r5 = 0
                if (r2 == 0) goto L21
                if (r2 == r4) goto L1b
                if (r2 != r3) goto L15
                defpackage.uj50.b(r7)
                goto L45
            L15:
                java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                defpackage.ib5.a(r6)
                return r5
            L1b:
                myh r0 = r6.a
                defpackage.uj50.b(r7)
                goto L38
            L21:
                defpackage.uj50.b(r7)
                h600 r7 = defpackage.h600.this
                pr10 r7 = r7.b
                r6.c = r5
                r6.a = r0
                r6.b = r4
                java.lang.String r2 = r6.e
                r4 = 0
                java.lang.Object r7 = r7.g(r2, r4, r6)
                if (r7 != r1) goto L38
                goto L44
            L38:
                r6.c = r5
                r6.a = r5
                r6.b = r3
                java.lang.Object r6 = r0.emit(r7, r6)
                if (r6 != r1) goto L45
            L44:
                return r1
            L45:
                kotlin.Unit r6 = kotlin.Unit.a
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: h600.d.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public h600(psm psmVar, pr10 pr10Var) {
        this.a = psmVar;
        this.b = pr10Var;
    }

    @Override // defpackage.g600
    public final lyh<BaseResponse<BankTradeResponse>> a(String str) {
        or60 or60Var = new or60(new a(str, null));
        pfd pfdVar = fse.a;
        return ozh.c(or60Var, odd.b);
    }

    @Override // defpackage.g600
    public final lyh<BaseResponse<WithDrawInfo>> b() {
        or60 or60Var = new or60(new c(null));
        pfd pfdVar = fse.a;
        return ozh.c(or60Var, odd.b);
    }

    @Override // defpackage.g600
    public final lyh<BaseResponse<BankTradeData>> c(String str) {
        str.getClass();
        or60 or60Var = new or60(new b(str, null));
        pfd pfdVar = fse.a;
        return ozh.c(or60Var, odd.b);
    }

    @Override // defpackage.g600
    public final lyh<BaseResponse<BankTradeResponse>> d(String str) {
        or60 or60Var = new or60(new d(str, null));
        pfd pfdVar = fse.a;
        return ozh.c(or60Var, odd.b);
    }
}
