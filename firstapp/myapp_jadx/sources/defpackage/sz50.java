package defpackage;

import com.sportygames.evenodd.components.RoundResult;
import com.sportygames.evenodd.remote.models.PlaceBetResponse;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes7.dex */
@c0d(c = "com.sportygames.evenodd.components.RoundResult$showLost$1", f = "RoundResult.kt", l = {176, 185, 193}, m = "invokeSuspend", v = 1)
public final class sz50 extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public int a;
    public final /* synthetic */ PlaceBetResponse b;
    public final /* synthetic */ RoundResult c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sz50(v1b v1bVar, RoundResult roundResult, PlaceBetResponse placeBetResponse) {
        super(2, v1bVar);
        this.b = placeBetResponse;
        this.c = roundResult;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new sz50(v1bVar, this.c, this.b);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((sz50) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0070, code lost:
    
        if (r1.b(r9, r2, r8) == r0) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x00bb, code lost:
    
        if (r1.b(r9, r2, r8) == r0) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x00e3, code lost:
    
        if (r1.b(r9, r3, r8) == r0) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x00e5, code lost:
    
        return r0;
     */
    @Override // defpackage.pz1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r9) {
        /*
            Method dump skipped, instruction units count: 233
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.sz50.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
