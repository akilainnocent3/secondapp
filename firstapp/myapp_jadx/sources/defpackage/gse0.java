package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes7.dex */
@c0d(c = "com.sportygames.goldmine.ui.animationpanel.TGAnimationViewModel$init$2", f = "TGAnimationViewModel.kt", l = {85, 95, 106}, m = "invokeSuspend", v = 1)
public final class gse0 extends tje0 implements Function2<mze0, v1b<? super Unit>, Object> {
    public int a;
    public /* synthetic */ Object b;
    public final /* synthetic */ ise0 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gse0(ise0 ise0Var, v1b<? super gse0> v1bVar) {
        super(2, v1bVar);
        this.c = ise0Var;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        gse0 gse0Var = new gse0(this.c, v1bVar);
        gse0Var.b = obj;
        return gse0Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(mze0 mze0Var, v1b<? super Unit> v1bVar) {
        return ((gse0) create(mze0Var, v1bVar)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x006a, code lost:
    
        if (r10.emit(r2, r9) == r1) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00a5, code lost:
    
        if (r10.emit(r0, r9) == r1) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00d0, code lost:
    
        if (r10.emit(r0, r9) == r1) goto L35;
     */
    @Override // defpackage.pz1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r10) {
        /*
            Method dump skipped, instruction units count: 220
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gse0.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
