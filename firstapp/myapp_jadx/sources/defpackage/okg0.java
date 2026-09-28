package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.feature.payment.impl.tradeadditional.presentation.viewmodel.TradeAdditionalBirthdayViewModel$next$1", f = "TradeAdditionalBirthdayViewModel.kt", l = {74, 79, 100}, m = "invokeSuspend", v = 2)
public final class okg0 extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public int a;
    public final /* synthetic */ String b;
    public final /* synthetic */ nkg0 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public okg0(String str, nkg0 nkg0Var, v1b<? super okg0> v1bVar) {
        super(2, v1bVar);
        this.b = str;
        this.c = nkg0Var;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new okg0(this.b, this.c, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((okg0) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code duplicated, block: B:37:0x00a9 A[Catch: all -> 0x0081, TryCatch #0 {all -> 0x0081, blocks: (B:40:0x00b8, B:35:0x00a2, B:36:0x00a6, B:37:0x00a9, B:41:0x00bb, B:43:0x00d2, B:45:0x00dc, B:44:0x00da, B:28:0x0075, B:32:0x0087), top: B:50:0x0075 }] */
    /* JADX WARN: Code duplicated, block: B:41:0x00bb A[Catch: all -> 0x0081, TryCatch #0 {all -> 0x0081, blocks: (B:40:0x00b8, B:35:0x00a2, B:36:0x00a6, B:37:0x00a9, B:41:0x00bb, B:43:0x00d2, B:45:0x00dc, B:44:0x00da, B:28:0x0075, B:32:0x0087), top: B:50:0x0075 }] */
    /* JADX WARN: Code duplicated, block: B:43:0x00d2 A[Catch: all -> 0x0081, TryCatch #0 {all -> 0x0081, blocks: (B:40:0x00b8, B:35:0x00a2, B:36:0x00a6, B:37:0x00a9, B:41:0x00bb, B:43:0x00d2, B:45:0x00dc, B:44:0x00da, B:28:0x0075, B:32:0x0087), top: B:50:0x0075 }] */
    /* JADX WARN: Code duplicated, block: B:44:0x00da A[Catch: all -> 0x0081, TryCatch #0 {all -> 0x0081, blocks: (B:40:0x00b8, B:35:0x00a2, B:36:0x00a6, B:37:0x00a9, B:41:0x00bb, B:43:0x00d2, B:45:0x00dc, B:44:0x00da, B:28:0x0075, B:32:0x0087), top: B:50:0x0075 }] */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x005c, code lost:
    
        if (r4.a.emit(r1, r24) == r6) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00b5, code lost:
    
        if (r0 == r6) goto L39;
     */
    @Override // defpackage.pz1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r25) {
        /*
            Method dump skipped, instruction units count: 270
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.okg0.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
