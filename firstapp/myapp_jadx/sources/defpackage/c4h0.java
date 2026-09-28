package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.feature.payment.impl.transaction.presentation.viewmodel.TxDetailsV2ViewModel$clickUpdateNow$1", f = "TxDetailsV2ViewModel.kt", l = {397, 398, 399, 404, 409, 414}, m = "invokeSuspend", v = 2)
public final class c4h0 extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public Object a;
    public Object b;
    public int c;
    public /* synthetic */ Object d;
    public final /* synthetic */ r4h0 e;
    public final /* synthetic */ String f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c4h0(r4h0 r4h0Var, String str, v1b<? super c4h0> v1bVar) {
        super(2, v1bVar);
        this.e = r4h0Var;
        this.f = str;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        c4h0 c4h0Var = new c4h0(this.e, this.f, v1bVar);
        c4h0Var.d = obj;
        return c4h0Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((c4h0) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code duplicated, block: B:26:0x00a2 A[PHI: r0
      0x00a2: PHI (r0v6 java.lang.Object) = (r0v5 java.lang.Object), (r0v37 java.lang.Object) binds: [B:24:0x009e, B:10:0x002b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:31:0x00da  */
    /* JADX WARN: Code duplicated, block: B:33:0x00e5  */
    /* JADX WARN: Code duplicated, block: B:35:0x00e9  */
    /* JADX WARN: Code duplicated, block: B:37:0x00f2  */
    /* JADX WARN: Code duplicated, block: B:43:0x0111  */
    /* JADX WARN: Code duplicated, block: B:45:0x0118  */
    /* JADX WARN: Code duplicated, block: B:46:0x0120  */
    /* JADX WARN: Code duplicated, block: B:49:0x0127  */
    /* JADX WARN: Code duplicated, block: B:50:0x012f  */
    /* JADX WARN: Code duplicated, block: B:54:0x014a A[PHI: r13
      0x014a: PHI (r13v1 java.lang.Object) = (r13v0 java.lang.Object), (r13v2 java.lang.Object) binds: [B:30:0x00d8, B:42:0x010f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:56:0x0150  */
    /* JADX WARN: Code duplicated, block: B:9:0x0028 A[PHI: r0
      0x0028: PHI (r0v7 java.lang.Object) = (r0v6 java.lang.Object), (r0v38 java.lang.Object) binds: [B:27:0x00b2, B:8:0x0023] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x010b, code lost:
    
        if (com.sporty.android.common.uievent.b.f(r2, null, null, r3, null, null, null, null, r20, 251) == r10) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x010e, code lost:
    
        r0 = r13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0147, code lost:
    
        if (com.sporty.android.common.uievent.b.f(r2, r3, null, r2, null, null, null, null, r20, androidx.recyclerview.widget.r.d.DEFAULT_SWIPE_ANIMATION_DURATION) == r10) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0169, code lost:
    
        if (com.sporty.android.common.uievent.b.f(r0, null, null, r3, null, null, null, null, r20, 251) == r10) goto L58;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.pz1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r21) {
        /*
            Method dump skipped, instruction units count: 386
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.c4h0.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
