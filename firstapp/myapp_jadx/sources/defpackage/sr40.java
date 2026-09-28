package defpackage;

import com.sportygames.common.framework.network.HTTPResponse;
import com.sportygames.refscall.data.dto.RCBetHistoryDTO;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes4.dex */
@c0d(c = "com.sportygames.refscall.data.repo.RefsCallRepositoryImpl$betHistory$1", f = "RefsCallRepositoryImpl.kt", l = {67, 67}, m = "invokeSuspend", v = 1)
public final class sr40 extends tje0 implements Function2<myh<? super HTTPResponse<List<? extends RCBetHistoryDTO>>>, v1b<? super Unit>, Object> {
    public myh a;
    public int b;
    public /* synthetic */ Object c;
    public final /* synthetic */ yr40 d;
    public final /* synthetic */ int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sr40(yr40 yr40Var, int i, v1b v1bVar) {
        super(2, v1bVar);
        this.d = yr40Var;
        this.e = i;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        sr40 sr40Var = new sr40(this.d, this.e, v1bVar);
        sr40Var.c = obj;
        return sr40Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(myh<? super HTTPResponse<List<? extends RCBetHistoryDTO>>> myhVar, v1b<? super Unit> v1bVar) {
        return ((sr40) create(myhVar, v1bVar)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0043, code lost:
    
        if (r0.emit(r7, r6) == r1) goto L15;
     */
    @Override // defpackage.pz1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r7) {
        /*
            r6 = this;
            java.lang.Object r0 = r6.c
            myh r0 = (defpackage.myh) r0
            y5b r1 = defpackage.y5b.a
            int r2 = r6.b
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L21
            if (r2 == r4) goto L1b
            if (r2 != r3) goto L15
            defpackage.uj50.b(r7)
            goto L46
        L15:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.ib5.a(r6)
            return r5
        L1b:
            myh r0 = r6.a
            defpackage.uj50.b(r7)
            goto L39
        L21:
            defpackage.uj50.b(r7)
            yr40 r7 = r6.d
            kr40 r7 = r7.a
            r6.c = r5
            r6.a = r0
            r6.b = r4
            int r2 = r6.e
            r4 = 15
            java.lang.Object r7 = r7.getBetHistory(r2, r4, r6)
            if (r7 != r1) goto L39
            goto L45
        L39:
            r6.c = r5
            r6.a = r5
            r6.b = r3
            java.lang.Object r6 = r0.emit(r7, r6)
            if (r6 != r1) goto L46
        L45:
            return r1
        L46:
            kotlin.Unit r6 = kotlin.Unit.a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.sr40.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
