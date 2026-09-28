package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sportybet.android.account.latam.personalinfo.presentation.PersonalInfoViewModel$loadAdvancedSettingsData$2", f = "PersonalInfoViewModel.kt", l = {159, 162}, m = "invokeSuspend", v = 2)
public final class lm00 extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public pm00 a;
    public int b;
    public /* synthetic */ Object c;
    public final /* synthetic */ pm00 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lm00(pm00 pm00Var, v1b<? super lm00> v1bVar) {
        super(2, v1bVar);
        this.d = pm00Var;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        lm00 lm00Var = new lm00(this.d, v1bVar);
        lm00Var.c = obj;
        return lm00Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((lm00) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x006d, code lost:
    
        if (r0 == r1) goto L22;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.pz1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r28) {
        /*
            Method dump skipped, instruction units count: 218
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lm00.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
