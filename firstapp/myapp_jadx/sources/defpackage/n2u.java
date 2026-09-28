package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
@c0d(c = "com.sportybet.android.loyalty.LoyaltyUseCase$loyaltyPromoteEnable$1", f = "LoyaltyUseCase.kt", l = {201, 206, 212, 216, 217, 220}, m = "invokeSuspend", v = 2)
public final class n2u extends tje0 implements Function2<myh<? super Boolean>, v1b<? super Unit>, Object> {
    public int a;
    public /* synthetic */ Object b;
    public final /* synthetic */ u2u c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n2u(v1b v1bVar, u2u u2uVar) {
        super(2, v1bVar);
        this.c = u2uVar;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        n2u n2uVar = new n2u(v1bVar, this.c);
        n2uVar.b = obj;
        return n2uVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(myh<? super Boolean> myhVar, v1b<? super Unit> v1bVar) {
        return ((n2u) create(myhVar, v1bVar)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code duplicated, block: B:38:0x0099  */
    /* JADX WARN: Code duplicated, block: B:43:0x00aa  */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0043, code lost:
    
        if (r0.emit(r7, r6) == r1) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x005d, code lost:
    
        if (r0.emit(r7, r6) == r1) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0079, code lost:
    
        if (r0.emit(r7, r6) == r1) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00a4, code lost:
    
        if (r0.emit(r7, r6) == r1) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00b5, code lost:
    
        if (r0.emit(r7, r6) == r1) goto L45;
     */
    @Override // defpackage.pz1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r7) {
        /*
            Method dump skipped, instruction units count: 206
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.n2u.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
