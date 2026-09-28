package defpackage;

import com.sporty.android.core.model.pocket.transaction.fixstatus.FixStatusResponse;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.feature.payment.impl.transaction.presentation.viewmodel.TxFixStatusViewModel$clickConfirm$1", f = "TxFixStatusViewModel.kt", l = {201, 202, 207, 212, 230}, m = "invokeSuspend", v = 2)
public final class w5h0 extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public Object a;
    public Object b;
    public x5h0 c;
    public FixStatusResponse d;
    public int e;
    public /* synthetic */ Object f;
    public final /* synthetic */ x5h0 i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w5h0(x5h0 x5h0Var, v1b<? super w5h0> v1bVar) {
        super(2, v1bVar);
        this.i = x5h0Var;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        w5h0 w5h0Var = new w5h0(this.i, v1bVar);
        w5h0Var.f = obj;
        return w5h0Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((w5h0) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code duplicated, block: B:33:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:35:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:37:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:38:0x00be  */
    /* JADX WARN: Code duplicated, block: B:42:0x00dc  */
    /* JADX WARN: Code duplicated, block: B:44:0x00e0  */
    /* JADX WARN: Code duplicated, block: B:46:0x00e7  */
    /* JADX WARN: Code duplicated, block: B:47:0x00f0  */
    /* JADX WARN: Code duplicated, block: B:50:0x00f7  */
    /* JADX WARN: Code duplicated, block: B:52:0x0100  */
    /* JADX WARN: Code duplicated, block: B:56:0x011d  */
    /* JADX WARN: Code duplicated, block: B:59:0x0126  */
    /* JADX WARN: Code duplicated, block: B:63:0x0132  */
    /* JADX WARN: Code duplicated, block: B:66:0x014d A[PHI: r14
      0x014d: PHI (r14v2 java.lang.Object) = (r14v0 java.lang.Object), (r14v1 java.lang.Object), (r14v3 java.lang.Object) binds: [B:32:0x00a4, B:43:0x00dd, B:65:0x014c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:68:0x0153  */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x016f, code lost:
    
        if (com.sporty.android.common.uievent.b.f(r0, null, null, r3, null, null, null, null, r16, 251) == r11) goto L70;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.pz1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r17) {
        /*
            Method dump skipped, instruction units count: 373
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.w5h0.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
