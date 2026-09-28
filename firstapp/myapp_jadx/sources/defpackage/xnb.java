package defpackage;

import com.sportygames.crashInitiated.model.response.CrashInitiatedPlaceBetResponse;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes7.dex */
@c0d(c = "com.sportygames.crashInitiated.CrashInitiatedFragment$showCashOutToast$1", f = "CrashInitiatedFragment.kt", l = {3588, 3590}, m = "invokeSuspend", v = 1)
public final class xnb extends tje0 implements Function1<v1b<? super Unit>, Object> {
    public zqy a;
    public int b;
    public double c;
    public double d;
    public double e;
    public int f;
    public final /* synthetic */ zqy i;
    public final /* synthetic */ CrashInitiatedPlaceBetResponse v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xnb(v1b v1bVar, zqy zqyVar, CrashInitiatedPlaceBetResponse crashInitiatedPlaceBetResponse) {
        super(1, v1bVar);
        this.i = zqyVar;
        this.v = crashInitiatedPlaceBetResponse;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(v1b<?> v1bVar) {
        return new xnb(v1bVar, this.i, this.v);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(v1b<? super Unit> v1bVar) {
        return ((xnb) create(v1bVar)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:57:0x01bd, code lost:
    
        if (defpackage.hkd.b(500, r23) == r2) goto L58;
     */
    @Override // defpackage.pz1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r24) {
        /*
            Method dump skipped, instruction units count: 451
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xnb.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
