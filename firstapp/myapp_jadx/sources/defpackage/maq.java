package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.feature.luckynumber.featurematch.presentation.quickbet.LNFeatureMatchQuickBetViewModel$bet$1", f = "LNFeatureMatchQuickBetViewModel.kt", l = {313, 314, 315, 319, 322, 323, 329}, m = "invokeSuspend", v = 2)
public final class maq extends tje0 implements Function2<lk50<? extends u2q>, v1b<? super Unit>, Object> {
    public int a;
    public /* synthetic */ Object b;
    public final /* synthetic */ uaq c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public maq(uaq uaqVar, v1b<? super maq> v1bVar) {
        super(2, v1bVar);
        this.c = uaqVar;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        maq maqVar = new maq(this.c, v1bVar);
        maqVar.b = obj;
        return maqVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(lk50<? extends u2q> lk50Var, v1b<? super Unit> v1bVar) {
        return ((maq) create(lk50Var, v1bVar)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0059  */
    /* JADX WARN: Code duplicated, block: B:35:0x00bf  */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x006a, code lost:
    
        if (kotlin.Unit.a == r1) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0084, code lost:
    
        if (kotlin.Unit.a == r1) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00df, code lost:
    
        if (kotlin.Unit.a == r1) goto L37;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.pz1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r8) {
        /*
            Method dump skipped, instruction units count: 254
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.maq.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
