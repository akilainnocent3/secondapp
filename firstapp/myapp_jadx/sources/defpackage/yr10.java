package defpackage;

import com.sporty.android.core.model.pocket.withdraw.otp.CheckNeedOTPResult;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.feature.payment.impl.common.domain.repository.PocketRepositoryImpl$checkBankTradeOtp$1", f = "PocketRepositoryImpl.kt", l = {1316, 1316}, m = "invokeSuspend", v = 2)
public final class yr10 extends tje0 implements Function2<myh<? super CheckNeedOTPResult>, v1b<? super Unit>, Object> {
    public myh a;
    public int b;
    public /* synthetic */ Object c;
    public final /* synthetic */ iw1 d;
    public final /* synthetic */ String e;
    public final /* synthetic */ ms10 f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yr10(iw1 iw1Var, String str, ms10 ms10Var, v1b<? super yr10> v1bVar) {
        super(2, v1bVar);
        this.d = iw1Var;
        this.e = str;
        this.f = ms10Var;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        yr10 yr10Var = new yr10(this.d, this.e, this.f, v1bVar);
        yr10Var.c = obj;
        return yr10Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(myh<? super CheckNeedOTPResult> myhVar, v1b<? super Unit> v1bVar) {
        return ((yr10) create(myhVar, v1bVar)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0071, code lost:
    
        if (r0.emit(r13, r12) == r1) goto L21;
     */
    @Override // defpackage.pz1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r13) throws com.sporty.android.common.network.data.SprThrowable {
        /*
            r12 = this;
            java.lang.Object r0 = r12.c
            myh r0 = (defpackage.myh) r0
            y5b r1 = defpackage.y5b.a
            int r2 = r12.b
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L21
            if (r2 == r4) goto L1b
            if (r2 != r3) goto L15
            defpackage.uj50.b(r13)
            goto L74
        L15:
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.ib5.a(r12)
            return r5
        L1b:
            myh r0 = r12.a
            defpackage.uj50.b(r13)
            goto L61
        L21:
            defpackage.uj50.b(r13)
            iw1 r13 = r12.d
            boolean r2 = r13 instanceof iw1.a
            if (r2 == 0) goto L39
            com.sporty.android.core.model.pocket.withdraw.otp.CheckBankTradeOtpRequest r6 = new com.sporty.android.core.model.pocket.withdraw.otp.CheckBankTradeOtpRequest
            iw1$a r13 = (iw1.a) r13
            java.lang.String r7 = r13.a
            r10 = 2
            r11 = 0
            r8 = 0
            java.lang.String r9 = r12.e
            r6.<init>(r7, r8, r9, r10, r11)
            goto L50
        L39:
            boolean r2 = r13 instanceof iw1.b
            if (r2 == 0) goto L77
            com.sporty.android.core.model.pocket.withdraw.otp.CheckBankTradeOtpRequest r6 = new com.sporty.android.core.model.pocket.withdraw.otp.CheckBankTradeOtpRequest
            iw1$b r13 = (iw1.b) r13
            int r13 = r13.a
            java.lang.Integer r8 = new java.lang.Integer
            r8.<init>(r13)
            r10 = 1
            r11 = 0
            r7 = 0
            java.lang.String r9 = r12.e
            r6.<init>(r7, r8, r9, r10, r11)
        L50:
            ms10 r13 = r12.f
            pr10 r13 = r13.a
            r12.c = r5
            r12.a = r0
            r12.b = r4
            java.lang.Object r13 = r13.V(r6, r12)
            if (r13 != r1) goto L61
            goto L73
        L61:
            com.sporty.android.common.network.data.BaseResponse r13 = (com.sporty.android.common.network.data.BaseResponse) r13
            java.lang.Object r13 = defpackage.n52.b(r13)
            r12.c = r5
            r12.a = r5
            r12.b = r3
            java.lang.Object r12 = r0.emit(r13, r12)
            if (r12 != r1) goto L74
        L73:
            return r1
        L74:
            kotlin.Unit r12 = kotlin.Unit.a
            return r12
        L77:
            defpackage.uhc.a()
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.yr10.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
