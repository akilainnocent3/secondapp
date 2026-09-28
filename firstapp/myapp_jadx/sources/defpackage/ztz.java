package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.feature.payment.impl.withdraw.presentation.viewmodel.PartnerWithdrawRequestDetailsViewModel$initRequestDetails$1", f = "PartnerWithdrawRequestDetailsViewModel.kt", l = {81, 87}, m = "invokeSuspend", v = 2)
public final class ztz extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public int a;
    public final /* synthetic */ buz b;

    @c0d(c = "com.sportybet.feature.payment.impl.withdraw.presentation.viewmodel.PartnerWithdrawRequestDetailsViewModel$initRequestDetails$1$2", f = "PartnerWithdrawRequestDetailsViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class a extends tje0 implements Function2<lk50<? extends mtz>, v1b<? super Unit>, Object> {
        public /* synthetic */ Object a;
        public final /* synthetic */ buz b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(buz buzVar, v1b<? super a> v1bVar) {
            super(2, v1bVar);
            this.b = buzVar;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            a aVar = new a(this.b, v1bVar);
            aVar.a = obj;
            return aVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(lk50<? extends mtz> lk50Var, v1b<? super Unit> v1bVar) {
            return ((a) create(lk50Var, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            lk50 lk50Var = (lk50) this.a;
            y5b y5bVar = y5b.a;
            uj50.b(obj);
            this.b.A.setValue(lk50Var);
            return Unit.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ztz(buz buzVar, v1b<? super ztz> v1bVar) {
        super(2, v1bVar);
        this.b = buzVar;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new ztz(this.b, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((ztz) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0058, code lost:
    
        if (defpackage.bm50.p(r1, r6) == r0) goto L17;
     */
    @Override // defpackage.pz1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r7) {
        /*
            r6 = this;
            y5b r0 = defpackage.y5b.a
            int r1 = r6.a
            buz r2 = r6.b
            r3 = 2
            r4 = 1
            r5 = 0
            if (r1 == 0) goto L1d
            if (r1 == r4) goto L19
            if (r1 != r3) goto L13
            defpackage.uj50.b(r7)
            goto L5b
        L13:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.ib5.a(r6)
            return r5
        L19:
            defpackage.uj50.b(r7)
            goto L2f
        L1d:
            defpackage.uj50.b(r7)
            sr10 r7 = r2.a
            java.lang.String r1 = r2.D
            if (r1 == 0) goto L5e
            r6.a = r4
            java.lang.Object r7 = r7.N(r1, r6)
            if (r7 != r0) goto L2f
            goto L5a
        L2f:
            com.sporty.android.common.network.data.BaseResponse r7 = (com.sporty.android.common.network.data.BaseResponse) r7
            java.lang.Object r7 = defpackage.n52.b(r7)
            gzh r1 = new gzh
            r1.<init>(r7)
            yzh r7 = defpackage.bm50.a(r1)
            ytz r1 = new ytz
            r1.<init>()
            wl50 r4 = new wl50
            r4.<init>(r7, r1)
            ztz$a r7 = new ztz$a
            r7.<init>(r2, r5)
            g1i r1 = new g1i
            r1.<init>(r4, r7)
            r6.a = r3
            java.lang.Object r6 = defpackage.bm50.p(r1, r6)
            if (r6 != r0) goto L5b
        L5a:
            return r0
        L5b:
            kotlin.Unit r6 = kotlin.Unit.a
            return r6
        L5e:
            java.lang.String r6 = "tradeId"
            kotlin.jvm.internal.Intrinsics.n(r6)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ztz.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
