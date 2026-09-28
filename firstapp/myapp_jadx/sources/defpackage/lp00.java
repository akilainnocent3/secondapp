package defpackage;

import android.content.Context;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.android.social.presentation.personal.PersonalSocialScreenKt$PersonalSocialScreen$1$1$1", f = "PersonalSocialScreen.kt", l = {157, 181}, m = "invokeSuspend", v = 2)
public final class lp00 extends tje0 implements Function2<bba0, v1b<? super Unit>, Object> {
    public int a;
    public /* synthetic */ Object b;
    public final /* synthetic */ Function1<bba0, Unit> c;
    public final /* synthetic */ kq00 d;
    public final /* synthetic */ Context e;
    public final /* synthetic */ v3a0 f;
    public final /* synthetic */ el00 i;
    public final /* synthetic */ Function2<String, String, Unit> v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public lp00(Function1<? super bba0, Unit> function1, kq00 kq00Var, Context context, v3a0 v3a0Var, el00 el00Var, Function2<? super String, ? super String, Unit> function2, v1b<? super lp00> v1bVar) {
        super(2, v1bVar);
        this.c = function1;
        this.d = kq00Var;
        this.e = context;
        this.f = v3a0Var;
        this.i = el00Var;
        this.v = function2;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        lp00 lp00Var = new lp00(this.c, this.d, this.e, this.f, this.i, this.v, v1bVar);
        lp00Var.b = obj;
        return lp00Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(bba0 bba0Var, v1b<? super Unit> v1bVar) {
        return ((lp00) create(bba0Var, v1bVar)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x00fc, code lost:
    
        if (defpackage.v3a0.b(r10.f, r1, null, false, r0, r10, 6) == r7) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0143, code lost:
    
        if (defpackage.v3a0.b(r10.f, r1, null, false, r4, r10, 6) == r7) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0145, code lost:
    
        return r7;
     */
    @Override // defpackage.pz1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r11) {
        /*
            Method dump skipped, instruction units count: 348
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lp00.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
