package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.feature.payment.impl.deposit.presentation.viewmodel.DepositMomoViewModel$addNewMobile$1", f = "DepositMomoViewModel.kt", l = {479, 494, 512, 522}, m = "invokeSuspend", v = 2)
public final class s1e extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public String a;
    public int b;
    public /* synthetic */ Object c;
    public final /* synthetic */ r2e d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s1e(v1b v1bVar, r2e r2eVar) {
        super(2, v1bVar);
        this.d = r2eVar;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        s1e s1eVar = new s1e(v1bVar, this.d);
        s1eVar.c = obj;
        return s1eVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((s1e) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code duplicated, block: B:60:0x0161  */
    /* JADX WARN: Code duplicated, block: B:62:0x0164 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:63:0x0166  */
    /* JADX WARN: Code duplicated, block: B:65:0x016c  */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0199, code lost:
    
        if (r0 == r14) goto L80;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x01da, code lost:
    
        if (r0 == r14) goto L80;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.pz1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r26) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 581
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.s1e.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
