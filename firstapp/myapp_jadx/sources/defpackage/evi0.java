package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes8.dex */
@c0d(c = "com.sportygames.wheelanddeal.WDViewModel$bet$6", f = "WDViewModel.kt", l = {770, 771, 774, 776, 777}, m = "invokeSuspend", v = 1)
public final class evi0 extends tje0 implements Function2<mk50<? extends pd3>, v1b<? super Unit>, Object> {
    public int a;
    public /* synthetic */ Object b;
    public final /* synthetic */ yui0 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public evi0(yui0 yui0Var, v1b<? super evi0> v1bVar) {
        super(2, v1bVar);
        this.c = yui0Var;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        evi0 evi0Var = new evi0(this.c, v1bVar);
        evi0Var.b = obj;
        return evi0Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(mk50<? extends pd3> mk50Var, v1b<? super Unit> v1bVar) {
        return ((evi0) create(mk50Var, v1bVar)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code duplicated, block: B:36:0x00ae  */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0056, code lost:
    
        if (r1.B1(r2, r20) == r4) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x006d, code lost:
    
        if (kotlin.Unit.a == r4) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00e4, code lost:
    
        if (kotlin.Unit.a == r4) goto L39;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.pz1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r21) {
        /*
            Method dump skipped, instruction units count: 238
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.evi0.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
