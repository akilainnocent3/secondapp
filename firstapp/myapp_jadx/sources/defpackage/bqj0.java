package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.feature.payment.impl.withdraw.presentation.viewmodel.WithdrawTransferViewModel$requestTransfer$1", f = "WithdrawTransferViewModel.kt", l = {469, 376}, m = "invokeSuspend", v = 2)
public final class bqj0 extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public hqj0 a;
    public int b;
    public /* synthetic */ Object c;
    public final /* synthetic */ hqj0 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bqj0(hqj0 hqj0Var, v1b<? super bqj0> v1bVar) {
        super(2, v1bVar);
        this.d = hqj0Var;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        bqj0 bqj0Var = new bqj0(this.d, v1bVar);
        bqj0Var.c = obj;
        return bqj0Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((bqj0) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x00a3, code lost:
    
        if (r0 == r5) goto L24;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.pz1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r20) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 371
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bqj0.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
