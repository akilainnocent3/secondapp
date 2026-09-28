package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes8.dex */
@c0d(c = "com.sportygames.sportyjet.views.SportyJetFragment$MovingBackGround$1$1", f = "SportyJetFragment.kt", l = {859, 866, 867, 871, 879}, m = "invokeSuspend", v = 1)
public final class t7c0 extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public int a;
    public final /* synthetic */ String b;
    public final /* synthetic */ wd0<Float, ij0> c;
    public final /* synthetic */ int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t7c0(String str, wd0<Float, ij0> wd0Var, int i, v1b<? super t7c0> v1bVar) {
        super(2, v1bVar);
        this.b = str;
        this.c = wd0Var;
        this.d = i;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new t7c0(this.b, this.c, this.d, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((t7c0) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code duplicated, block: B:24:0x0086  */
    /* JADX WARN: Code duplicated, block: B:27:0x00a3  */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00c3, code lost:
    
        if (defpackage.wd0.a(r15.c, r1, r2, null, null, r15, 12) == r7) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00cc, code lost:
    
        if (r0.g(r15) == r7) goto L32;
     */
    @Override // defpackage.pz1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r16) {
        /*
            Method dump skipped, instruction units count: 212
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.t7c0.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
