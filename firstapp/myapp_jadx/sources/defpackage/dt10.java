package defpackage;

import com.sporty.android.core.model.pocket.deposit.FirstDepositState;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.feature.payment.impl.common.domain.repository.PocketRepositoryImpl$getFirstDepositState$1", f = "PocketRepositoryImpl.kt", l = {507, 507}, m = "invokeSuspend", v = 2)
public final class dt10 extends tje0 implements Function1<v1b<? super FirstDepositState>, Object> {
    public pr10 a;
    public int b;
    public final /* synthetic */ ms10 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dt10(ms10 ms10Var, v1b<? super dt10> v1bVar) {
        super(1, v1bVar);
        this.c = ms10Var;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(v1b<?> v1bVar) {
        return new dt10(this.c, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(v1b<? super FirstDepositState> v1bVar) {
        return ((dt10) create(v1bVar)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x003b, code lost:
    
        if (r6 == r0) goto L15;
     */
    @Override // defpackage.pz1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r6) {
        /*
            r5 = this;
            y5b r0 = defpackage.y5b.a
            int r1 = r5.b
            r2 = 0
            r3 = 2
            r4 = 1
            if (r1 == 0) goto L1d
            if (r1 == r4) goto L17
            if (r1 != r3) goto L11
            defpackage.uj50.b(r6)
            goto L3e
        L11:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.ib5.a(r5)
            return r2
        L17:
            pr10 r1 = r5.a
            defpackage.uj50.b(r6)
            goto L31
        L1d:
            defpackage.uj50.b(r6)
            ms10 r6 = r5.c
            pr10 r1 = r6.a
            mgb0 r6 = r6.c
            r5.a = r1
            r5.b = r4
            java.lang.Object r6 = r6.getUserId(r5)
            if (r6 != r0) goto L31
            goto L3d
        L31:
            java.lang.String r6 = (java.lang.String) r6
            r5.a = r2
            r5.b = r3
            java.lang.Object r6 = r1.k0(r6, r5)
            if (r6 != r0) goto L3e
        L3d:
            return r0
        L3e:
            com.sporty.android.common.network.data.BaseResponse r6 = (com.sporty.android.common.network.data.BaseResponse) r6
            java.lang.Object r5 = defpackage.n52.b(r6)
            com.sporty.android.core.model.pocket.deposit.FirstDepositStateWrapper r5 = (com.sporty.android.core.model.pocket.deposit.FirstDepositStateWrapper) r5
            com.sporty.android.core.model.pocket.deposit.FirstDepositState r5 = r5.getState()
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dt10.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
