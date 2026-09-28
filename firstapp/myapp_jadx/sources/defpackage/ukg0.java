package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.feature.payment.impl.tradeadditional.presentation.viewmodel.TradeAdditionalCheckHoldingViewModel$initPolling$1", f = "TradeAdditionalCheckHoldingViewModel.kt", l = {65, 69, 73, 81, 85}, m = "invokeSuspend", v = 2)
public final class ukg0 extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public Object a;
    public int b;
    public /* synthetic */ Object c;
    public final /* synthetic */ wkg0 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ukg0(wkg0 wkg0Var, v1b<? super ukg0> v1bVar) {
        super(2, v1bVar);
        this.d = wkg0Var;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        ukg0 ukg0Var = new ukg0(this.d, v1bVar);
        ukg0Var.c = obj;
        return ukg0Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((ukg0) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0048  */
    /* JADX WARN: Code duplicated, block: B:24:0x0058  */
    /* JADX WARN: Code duplicated, block: B:26:0x005c  */
    /* JADX WARN: Code duplicated, block: B:31:0x007c A[Catch: all -> 0x003b, TRY_ENTER, TryCatch #0 {all -> 0x003b, blocks: (B:31:0x007c, B:34:0x00a2, B:14:0x0035), top: B:52:0x0035 }] */
    /* JADX WARN: Code duplicated, block: B:33:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:34:0x00a2 A[Catch: all -> 0x003b, PHI: r0
      0x00a2: PHI (r0v5 java.lang.Object) = (r0v10 java.lang.Object), (r0v20 java.lang.Object) binds: [B:32:0x009f, B:15:0x0038] A[DONT_GENERATE, DONT_INLINE], TRY_LEAVE, TryCatch #0 {all -> 0x003b, blocks: (B:31:0x007c, B:34:0x00a2, B:14:0x0035), top: B:52:0x0035 }] */
    /* JADX WARN: Code duplicated, block: B:39:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:41:0x00bd  */
    /* JADX WARN: Code duplicated, block: B:47:0x00d7 A[PHI: r0
      0x00d7: PHI (r0v15 java.lang.Object) = (r0v4 java.lang.Object), (r0v4 java.lang.Object), (r0v4 java.lang.Object), (r0v21 java.lang.Object) binds: [B:38:0x00b2, B:45:0x00d4, B:42:0x00c1, B:12:0x002a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:49:0x00dd  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:48:0x00db -> B:21:0x0048). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:50:0x00f8 -> B:21:0x0048). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // defpackage.pz1
    public final java.lang.Object invokeSuspend(java.lang.Object r24) {
        /*
            Method dump skipped, instruction units count: 251
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ukg0.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
