package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes4.dex */
@c0d(c = "com.sportybet.android.payment.deposit.presentation.viewmodel.AddNewMobileNumberViewModel$clickAddBtn$1", f = "AddNewMobileNumberViewModel.kt", l = {141, 538, 174}, m = "invokeSuspend", v = 2)
public final class fk extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public dk a;
    public int b;
    public final /* synthetic */ dk c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fk(dk dkVar, v1b<? super fk> v1bVar) {
        super(2, v1bVar);
        this.c = dkVar;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new fk(this.c, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((fk) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code duplicated, block: B:25:0x00b9  */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00e5, code lost:
    
        if (r0 == r13) goto L27;
     */
    @Override // defpackage.pz1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r34) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 589
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fk.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
