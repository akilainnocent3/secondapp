package defpackage;

import com.sporty.android.common.network.data.BaseResponse;
import com.sportybet.feature.luckynumber.placebet.data.data.LNPlaceBetDTO;
import java.math.BigDecimal;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.feature.luckynumber.placebet.domain.PlaceBetUseCase$invoke$betFlow$1", f = "PlaceBetUseCase.kt", l = {62, 52}, m = "invokeSuspend", v = 2)
public final class yh10 extends tje0 implements Function2<myh<? super BaseResponse<LNPlaceBetDTO>>, v1b<? super Unit>, Object> {
    public final /* synthetic */ ai10 A;
    public final /* synthetic */ erq B;
    public final /* synthetic */ yxq C;
    public final /* synthetic */ dqh0 D;
    public final /* synthetic */ String E;
    public final /* synthetic */ String F;
    public final /* synthetic */ String G;
    public a7q a;
    public String b;
    public yxq c;
    public uf00 d;
    public uf00 e;
    public BigDecimal f;
    public myh i;
    public int v;
    public /* synthetic */ Object w;
    public final /* synthetic */ dq40<rkd0> y;
    public final /* synthetic */ String z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yh10(dq40<rkd0> dq40Var, String str, ai10 ai10Var, erq erqVar, yxq yxqVar, dqh0 dqh0Var, String str2, String str3, String str4, v1b<? super yh10> v1bVar) {
        super(2, v1bVar);
        this.y = dq40Var;
        this.z = str;
        this.A = ai10Var;
        this.B = erqVar;
        this.C = yxqVar;
        this.D = dqh0Var;
        this.E = str2;
        this.F = str3;
        this.G = str4;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        yh10 yh10Var = new yh10(this.y, this.z, this.A, this.B, this.C, this.D, this.E, this.F, this.G, v1bVar);
        yh10Var.w = obj;
        return yh10Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(myh<? super BaseResponse<LNPlaceBetDTO>> myhVar, v1b<? super Unit> v1bVar) {
        return ((yh10) create(myhVar, v1bVar)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0118, code lost:
    
        if (defpackage.kzh.c(r1, r3, r19) == r2) goto L24;
     */
    /* JADX WARN: Type inference failed for: r3v1, types: [T, java.math.BigDecimal] */
    @Override // defpackage.pz1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r20) {
        /*
            Method dump skipped, instruction units count: 286
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.yh10.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
