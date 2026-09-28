package defpackage;

import com.sporty.android.common.network.data.BaseResponse;
import com.sportybet.feature.luckynumber.placebet.data.data.LNPlaceBetDTO;
import java.math.BigDecimal;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.feature.luckynumber.placebet.data.LNDrawRepository$placeBet$1", f = "LNDrawRepository.kt", l = {96, 96}, m = "invokeSuspend", v = 2)
public final class y6q extends tje0 implements Function2<myh<? super BaseResponse<LNPlaceBetDTO>>, v1b<? super Unit>, Object> {
    public final /* synthetic */ uf00 A;
    public final /* synthetic */ jfq B;
    public final /* synthetic */ String C;
    public myh a;
    public long b;
    public int c;
    public /* synthetic */ Object d;
    public final /* synthetic */ a7q e;
    public final /* synthetic */ BigDecimal f;
    public final /* synthetic */ yxq i;
    public final /* synthetic */ String v;
    public final /* synthetic */ String w;
    public final /* synthetic */ String y;
    public final /* synthetic */ uf00 z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y6q(a7q a7qVar, BigDecimal bigDecimal, yxq yxqVar, String str, String str2, String str3, uf00 uf00Var, uf00 uf00Var2, jfq jfqVar, String str4, v1b v1bVar) {
        super(2, v1bVar);
        this.e = a7qVar;
        this.f = bigDecimal;
        this.i = yxqVar;
        this.v = str;
        this.w = str2;
        this.y = str3;
        this.z = uf00Var;
        this.A = uf00Var2;
        this.B = jfqVar;
        this.C = str4;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        y6q y6qVar = new y6q(this.e, this.f, this.i, this.v, this.w, this.y, this.z, this.A, this.B, this.C, v1bVar);
        y6qVar.d = obj;
        return y6qVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(myh<? super BaseResponse<LNPlaceBetDTO>> myhVar, v1b<? super Unit> v1bVar) {
        return ((y6q) create(myhVar, v1bVar)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code duplicated, block: B:18:0x007b  */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x00d8, code lost:
    
        if (r1.emit(r3, r21) == r2) goto L25;
     */
    @Override // defpackage.pz1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r22) {
        /*
            Method dump skipped, instruction units count: 222
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.y6q.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
