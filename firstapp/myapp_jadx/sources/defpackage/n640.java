package defpackage;

import com.sportybet.android.bethistory.data.dto.RealBetHistoryOrderDto;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sportybet.android.bethistory.data.paging.mediator.RealBetHistoryOrderPagingMediator$fetchRemote$2$1", f = "RealBetHistoryOrderPagingMediator.kt", l = {110, 114, 128}, m = "invokeSuspend", v = 2)
public final class n640 extends tje0 implements Function1<v1b<? super Unit>, Object> {
    public int a;
    public boolean b;
    public boolean c;
    public int d;
    public final /* synthetic */ o640 e;
    public final /* synthetic */ boolean f;
    public final /* synthetic */ List<RealBetHistoryOrderDto> i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n640(o640 o640Var, boolean z, List<RealBetHistoryOrderDto> list, v1b<? super n640> v1bVar) {
        super(1, v1bVar);
        this.e = o640Var;
        this.f = z;
        this.i = list;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(v1b<?> v1bVar) {
        return new n640(this.e, this.f, this.i, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(v1b<? super Unit> v1bVar) {
        return ((n640) create(v1bVar)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code duplicated, block: B:30:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:32:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:33:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:36:0x00df  */
    /* JADX WARN: Code duplicated, block: B:39:0x010d  */
    /* JADX WARN: Code duplicated, block: B:40:0x0114  */
    /* JADX WARN: Code duplicated, block: B:43:0x011c  */
    /* JADX WARN: Code duplicated, block: B:44:0x0123  */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x014f, code lost:
    
        if (r1.m(r2, r42) == r4) goto L48;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v0 */
    /* JADX WARN: Type inference failed for: r11v1, types: [int] */
    /* JADX WARN: Type inference failed for: r11v2 */
    /* JADX WARN: Type inference failed for: r11v3, types: [int] */
    /* JADX WARN: Type inference failed for: r11v4 */
    /* JADX WARN: Type inference failed for: r11v6 */
    /* JADX WARN: Type inference failed for: r11v7 */
    /* JADX WARN: Type inference failed for: r11v8 */
    /* JADX WARN: Type inference failed for: r11v9 */
    @Override // defpackage.pz1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r43) {
        /*
            Method dump skipped, instruction units count: 341
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.n640.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
