package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import okhttp3.internal.ws.WebSocketProtocol;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.feature.payment.impl.tradeadditional.presentation.viewmodel.TradeAdditionalOtpViewModel$next$1", f = "TradeAdditionalOtpViewModel.kt", l = {WebSocketProtocol.B0_FLAG_RSV1, 69, 88}, m = "invokeSuspend", v = 2)
public final class ulg0 extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public int a;
    public final /* synthetic */ String b;
    public final /* synthetic */ vlg0 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ulg0(String str, vlg0 vlg0Var, v1b<? super ulg0> v1bVar) {
        super(2, v1bVar);
        this.b = str;
        this.c = vlg0Var;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new ulg0(this.b, this.c, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((ulg0) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code duplicated, block: B:29:0x008f A[Catch: all -> 0x0024, TryCatch #0 {all -> 0x0024, blocks: (B:7:0x001d, B:32:0x009e, B:13:0x002d, B:27:0x0088, B:28:0x008c, B:29:0x008f, B:33:0x00a1, B:35:0x00b8, B:37:0x00c2, B:36:0x00c0, B:24:0x0061), top: B:42:0x0015 }] */
    /* JADX WARN: Code duplicated, block: B:33:0x00a1 A[Catch: all -> 0x0024, TryCatch #0 {all -> 0x0024, blocks: (B:7:0x001d, B:32:0x009e, B:13:0x002d, B:27:0x0088, B:28:0x008c, B:29:0x008f, B:33:0x00a1, B:35:0x00b8, B:37:0x00c2, B:36:0x00c0, B:24:0x0061), top: B:42:0x0015 }] */
    /* JADX WARN: Code duplicated, block: B:35:0x00b8 A[Catch: all -> 0x0024, TryCatch #0 {all -> 0x0024, blocks: (B:7:0x001d, B:32:0x009e, B:13:0x002d, B:27:0x0088, B:28:0x008c, B:29:0x008f, B:33:0x00a1, B:35:0x00b8, B:37:0x00c2, B:36:0x00c0, B:24:0x0061), top: B:42:0x0015 }] */
    /* JADX WARN: Code duplicated, block: B:36:0x00c0 A[Catch: all -> 0x0024, TryCatch #0 {all -> 0x0024, blocks: (B:7:0x001d, B:32:0x009e, B:13:0x002d, B:27:0x0088, B:28:0x008c, B:29:0x008f, B:33:0x00a1, B:35:0x00b8, B:37:0x00c2, B:36:0x00c0, B:24:0x0061), top: B:42:0x0015 }] */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0056, code lost:
    
        if (r3.a.emit(r1, r23) == r6) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x009b, code lost:
    
        if (r0 == r6) goto L31;
     */
    @Override // defpackage.pz1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r24) {
        /*
            Method dump skipped, instruction units count: 244
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ulg0.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
