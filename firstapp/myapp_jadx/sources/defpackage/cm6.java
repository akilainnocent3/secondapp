package defpackage;

import com.sporty.android.common.network.data.BaseResponse;
import com.sporty.android.core.model.cashout.CashOutResponse;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes4.dex */
@c0d(c = "com.sporty.android.core.data.repository.cashout.CashOutRepositoryImpl$cashout$1", f = "CashOutRepositoryImpl.kt", l = {35, 35}, m = "invokeSuspend", v = 2)
public final class cm6 extends tje0 implements Function2<myh<? super BaseResponse<CashOutResponse>>, v1b<? super Unit>, Object> {
    public myh a;
    public int b;
    public /* synthetic */ Object c;
    public final /* synthetic */ String d;
    public final /* synthetic */ boolean e;
    public final /* synthetic */ String f;
    public final /* synthetic */ String i;
    public final /* synthetic */ boolean v;
    public final /* synthetic */ hm6 w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cm6(String str, boolean z, String str2, String str3, boolean z2, hm6 hm6Var, v1b<? super cm6> v1bVar) {
        super(2, v1bVar);
        this.d = str;
        this.e = z;
        this.f = str2;
        this.i = str3;
        this.v = z2;
        this.w = hm6Var;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        cm6 cm6Var = new cm6(this.d, this.e, this.f, this.i, this.v, this.w, v1bVar);
        cm6Var.c = obj;
        return cm6Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(myh<? super BaseResponse<CashOutResponse>> myhVar, v1b<? super Unit> v1bVar) {
        return ((cm6) create(myhVar, v1bVar)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x004e, code lost:
    
        if (r0.emit(r13, r12) == r1) goto L15;
     */
    @Override // defpackage.pz1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r13) {
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
            goto L51
        L15:
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.ib5.a(r12)
            return r5
        L1b:
            myh r0 = r12.a
            defpackage.uj50.b(r13)
            goto L44
        L21:
            defpackage.uj50.b(r13)
            com.sporty.android.core.model.cashout.PostCashoutRequest r6 = new com.sporty.android.core.model.cashout.PostCashoutRequest
            java.lang.String r10 = r12.i
            boolean r11 = r12.v
            java.lang.String r7 = r12.d
            boolean r8 = r12.e
            java.lang.String r9 = r12.f
            r6.<init>(r7, r8, r9, r10, r11)
            hm6 r13 = r12.w
            t840 r13 = r13.a
            r12.c = r5
            r12.a = r0
            r12.b = r4
            java.lang.Object r13 = r13.f(r6, r12)
            if (r13 != r1) goto L44
            goto L50
        L44:
            r12.c = r5
            r12.a = r5
            r12.b = r3
            java.lang.Object r12 = r0.emit(r13, r12)
            if (r12 != r1) goto L51
        L50:
            return r1
        L51:
            kotlin.Unit r12 = kotlin.Unit.a
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cm6.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
