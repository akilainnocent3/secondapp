package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes4.dex */
@c0d(c = "com.sportybet.android.bookingcode.presentation.viewmodel.SocialShareViewModel$onSocialShareAction$1", f = "SocialShareViewModel.kt", l = {90, 94, 95}, m = "invokeSuspend", v = 2)
public final class tia0 extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public int a;
    public final /* synthetic */ via0 b;
    public final /* synthetic */ aga0 c;
    public final /* synthetic */ long d;
    public final /* synthetic */ boolean e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tia0(via0 via0Var, aga0 aga0Var, long j, boolean z, v1b<? super tia0> v1bVar) {
        super(2, v1bVar);
        this.b = via0Var;
        this.c = aga0Var;
        this.d = j;
        this.e = z;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new tia0(this.b, this.c, this.d, this.e, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((tia0) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code duplicated, block: B:45:0x00fe  */
    /* JADX WARN: Code duplicated, block: B:47:0x0101  */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00eb, code lost:
    
        if (r1.a.emit(r0, r13) == r2) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0109, code lost:
    
        if (r1.a.emit(r14, r13) == r2) goto L49;
     */
    @Override // defpackage.pz1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r14) {
        /*
            Method dump skipped, instruction units count: 271
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.tia0.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
