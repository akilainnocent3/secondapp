package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sportybet.android.account.latam.personalinfo.presentation.PersonalInfoViewModel$onNextButtonClicked$2", f = "PersonalInfoViewModel.kt", l = {298, 315}, m = "invokeSuspend", v = 2)
public final class nm00 extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public int a;
    public int b;
    public int c;
    public final /* synthetic */ pm00 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nm00(pm00 pm00Var, v1b<? super nm00> v1bVar) {
        super(2, v1bVar);
        this.d = pm00Var;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new nm00(this.d, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((nm00) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x0198, code lost:
    
        if (r2.emit(r3, r25) == r10) goto L30;
     */
    @Override // defpackage.pz1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r26) {
        /*
            Method dump skipped, instruction units count: 566
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nm00.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
