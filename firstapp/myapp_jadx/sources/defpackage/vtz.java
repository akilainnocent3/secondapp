package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.feature.payment.impl.withdraw.presentation.viewmodel.PartnerWithdrawRequestDetailsViewModel$clickCancel$1", f = "PartnerWithdrawRequestDetailsViewModel.kt", l = {161, 173, 175, 179}, m = "invokeSuspend", v = 2)
public final class vtz extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public Object a;
    public int b;
    public /* synthetic */ Object c;
    public final /* synthetic */ buz d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vtz(buz buzVar, v1b<? super vtz> v1bVar) {
        super(2, v1bVar);
        this.d = buzVar;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        vtz vtzVar = new vtz(this.d, v1bVar);
        vtzVar.c = obj;
        return vtzVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((vtz) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code duplicated, block: B:61:0x0126  */
    /* JADX WARN: Code duplicated, block: B:64:0x014a  */
    /* JADX WARN: Code duplicated, block: B:66:0x014c A[PHI: r13 r15
      0x014c: PHI (r13v6 java.lang.Throwable) = (r13v17 java.lang.Throwable), (r13v18 java.lang.Throwable) binds: [B:60:0x0124, B:65:0x014b] A[DONT_GENERATE, DONT_INLINE]
      0x014c: PHI (r15v4 java.lang.Object) = (r15v2 java.lang.Object), (r15v5 java.lang.Object) binds: [B:60:0x0124, B:65:0x014b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:68:0x0152  */
    /* JADX WARN: Code duplicated, block: B:70:0x0158  */
    /* JADX WARN: Code duplicated, block: B:72:0x0162  */
    /* JADX WARN: Code duplicated, block: B:74:0x016e  */
    /* JADX WARN: Code duplicated, block: B:75:0x0177  */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x018e, code lost:
    
        if (com.sporty.android.common.uievent.b.f(r1, null, null, r3, null, null, null, null, r17, 251) == r12) goto L78;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v13 */
    /* JADX WARN: Type inference failed for: r13v14 */
    /* JADX WARN: Type inference failed for: r13v15 */
    /* JADX WARN: Type inference failed for: r13v8, types: [a6b, kotlin.coroutines.CoroutineContext, v1b] */
    @Override // defpackage.pz1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r18) {
        /*
            Method dump skipped, instruction units count: 424
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vtz.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
