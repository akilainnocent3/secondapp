package defpackage;

import com.sportygames.spin2win.components.Spin2WinWheel;
import com.sportygames.spin2win.model.response.Spin2WinPlaceBetResponse;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportygames.spin2win.components.Spin2WinWheel$handleWinAnimation$1", f = "Spin2WinWheel.kt", l = {208, 212}, m = "invokeSuspend", v = 1)
public final class i5b0 extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public int a;
    public final /* synthetic */ Spin2WinWheel b;
    public final /* synthetic */ Spin2WinPlaceBetResponse c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i5b0(Spin2WinWheel spin2WinWheel, Spin2WinPlaceBetResponse spin2WinPlaceBetResponse, v1b<? super i5b0> v1bVar) {
        super(2, v1bVar);
        this.b = spin2WinWheel;
        this.c = spin2WinPlaceBetResponse;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new i5b0(this.b, this.c, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((i5b0) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x0079, code lost:
    
        if (defpackage.hkd.b(300, r18) == r1) goto L36;
     */
    @Override // defpackage.pz1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r19) {
        /*
            Method dump skipped, instruction units count: 595
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.i5b0.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
