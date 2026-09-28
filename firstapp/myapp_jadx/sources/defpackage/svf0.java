package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import okhttp3.internal.ws.WebSocketProtocol;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.feature.timeAlert.viewmodel.TimeAlertViewModel$onTimeAlertChanged$1", f = "TimeAlertViewModel.kt", l = {WebSocketProtocol.B0_FLAG_RSV1, 66, 67, 71}, m = "invokeSuspend", v = 2)
public final class svf0 extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public Integer a;
    public tvf0 b;
    public int c;
    public /* synthetic */ Object d;
    public final /* synthetic */ tvf0 e;
    public final /* synthetic */ auf0 f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public svf0(tvf0 tvf0Var, auf0 auf0Var, v1b<? super svf0> v1bVar) {
        super(2, v1bVar);
        this.e = tvf0Var;
        this.f = auf0Var;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        svf0 svf0Var = new svf0(this.e, this.f, v1bVar);
        svf0Var.d = obj;
        return svf0Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((svf0) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code duplicated, block: B:30:0x0096  */
    /* JADX WARN: Code duplicated, block: B:32:0x0099  */
    /* JADX WARN: Code duplicated, block: B:33:0x00b7  */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00d4, code lost:
    
        if (r13.emit(r2, r12) == r1) goto L36;
     */
    @Override // defpackage.pz1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r13) {
        /*
            Method dump skipped, instruction units count: 218
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.svf0.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
