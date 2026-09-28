package defpackage;

import androidx.recyclerview.widget.r;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.android.kepay.deposit.KeOnlineDepositViewModel$clickKeDeposit$1", f = "KeOnlineDepositViewModel.kt", l = {232, 236, r.d.DEFAULT_SWIPE_ANIMATION_DURATION, 255, 268}, m = "invokeSuspend", v = 2)
public final class mjp extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public int a;
    public final /* synthetic */ pjp b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mjp(pjp pjpVar, v1b<? super mjp> v1bVar) {
        super(2, v1bVar);
        this.b = pjpVar;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new mjp(this.b, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((mjp) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code duplicated, block: B:67:0x0114  */
    /* JADX WARN: Code duplicated, block: B:70:0x0133 A[PHI: r14
      0x0133: PHI (r14v18 java.lang.Object) = (r14v14 java.lang.Object), (r14v0 java.lang.Object) binds: [B:68:0x0130, B:12:0x0024] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:72:0x013c  */
    /* JADX WARN: Code duplicated, block: B:74:0x013f  */
    /* JADX WARN: Code duplicated, block: B:76:0x0147  */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x010a, code lost:
    
        if (r9.O1(r13) == r0) goto L79;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x015c, code lost:
    
        if (r14.a.emit(r1, r13) == r0) goto L79;
     */
    @Override // defpackage.pz1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r14) {
        /*
            Method dump skipped, instruction units count: 354
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mjp.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
