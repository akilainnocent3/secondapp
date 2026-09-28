package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.android.transaction.ui.txdetails.TxDetailsViewModel$clickUpdateNow$1", f = "TxDetailsViewModel.kt", l = {284, 285, 286, 291, 296, 301}, m = "invokeSuspend", v = 2)
public final class u4h0 extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public Object a;
    public Object b;
    public int c;
    public /* synthetic */ Object d;
    public final /* synthetic */ e5h0 e;
    public final /* synthetic */ String f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u4h0(e5h0 e5h0Var, String str, v1b<? super u4h0> v1bVar) {
        super(2, v1bVar);
        this.e = e5h0Var;
        this.f = str;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        u4h0 u4h0Var = new u4h0(this.e, this.f, v1bVar);
        u4h0Var.d = obj;
        return u4h0Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((u4h0) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0085 A[PHI: r0
      0x0085: PHI (r0v6 java.lang.Object) = (r0v5 java.lang.Object), (r0v33 java.lang.Object) binds: [B:24:0x0081, B:10:0x0029] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:31:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:33:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:35:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:37:0x00be  */
    /* JADX WARN: Code duplicated, block: B:43:0x00de  */
    /* JADX WARN: Code duplicated, block: B:45:0x00e5  */
    /* JADX WARN: Code duplicated, block: B:46:0x00ed  */
    /* JADX WARN: Code duplicated, block: B:49:0x00f4  */
    /* JADX WARN: Code duplicated, block: B:50:0x00fc  */
    /* JADX WARN: Code duplicated, block: B:54:0x0118 A[PHI: r13
      0x0118: PHI (r13v1 java.lang.Object) = (r13v0 java.lang.Object), (r13v2 java.lang.Object) binds: [B:30:0x00a4, B:42:0x00dc] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:56:0x011e  */
    /* JADX WARN: Code duplicated, block: B:9:0x0026 A[PHI: r0
      0x0026: PHI (r0v7 java.lang.Object) = (r0v6 java.lang.Object), (r0v34 java.lang.Object) binds: [B:27:0x0095, B:8:0x0021] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00d8, code lost:
    
        if (com.sporty.android.common.uievent.b.f(r2, null, null, r3, null, null, null, null, r14, 251) == r10) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00db, code lost:
    
        r0 = r13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0115, code lost:
    
        if (com.sporty.android.common.uievent.b.f(r2, r3, null, r2, null, null, null, null, r14, androidx.recyclerview.widget.r.d.DEFAULT_SWIPE_ANIMATION_DURATION) == r10) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0138, code lost:
    
        if (com.sporty.android.common.uievent.b.f(r0, null, null, r3, null, null, null, null, r14, 251) == r10) goto L58;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.pz1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r15) {
        /*
            Method dump skipped, instruction units count: 336
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.u4h0.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
