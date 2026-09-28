package defpackage;

import com.sporty.android.common.uievent.a;
import com.sporty.android.core.model.pocket.common.AssetData;
import com.sporty.android.core.model.pocket.deposit.DepositRequest;
import java.math.BigDecimal;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.feature.payment.impl.deposit.presentation.viewmodel.DepositCardViewModel$requestSavedCardDeposit$1", f = "DepositCardViewModel.kt", l = {846, 868}, m = "invokeSuspend", v = 2)
public final class cud extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public int a;
    public final /* synthetic */ tud b;
    public final /* synthetic */ AssetData.CardsBean c;
    public final /* synthetic */ String d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cud(tud tudVar, AssetData.CardsBean cardsBean, String str, v1b<? super cud> v1bVar) {
        super(2, v1bVar);
        this.b = tudVar;
        this.c = cardsBean;
        this.d = str;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new cud(this.b, this.c, this.d, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((cud) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objZ1;
        String strA;
        wwd0 wwd0Var;
        wwd0 wwd0Var2;
        String str;
        tud tudVar = this.b;
        wwd0 wwd0Var3 = tudVar.K0;
        wwd0 wwd0Var4 = tudVar.G;
        y5b y5bVar = y5b.a;
        int i = this.a;
        if (i != 0) {
            if (i == 1) {
                uj50.b(obj);
                objZ1 = obj;
            } else {
                if (i != 2) {
                    ib5.a("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                uj50.b(obj);
                wwd0Var = wwd0Var3;
                wwd0Var2 = wwd0Var4;
            }
            wwd0Var2.setValue(tzs.a.a);
            c330.a aVar = new c330.a(null, false);
            wwd0Var.getClass();
            wwd0Var.k(null, aVar);
            vpg0.d(tudVar.v);
            tudVar.P1("");
            tudVar.N1("");
            wwd0 wwd0Var5 = tudVar.a1;
            Boolean bool = Boolean.TRUE;
            wwd0Var5.getClass();
            wwd0Var5.k(null, bool);
            tudVar.R1("");
            tudVar.x1("");
            return Unit.a;
        }
        uj50.b(obj);
        this.a = 1;
        objZ1 = tudVar.Z1(this);
        if (objZ1 == y5bVar) {
            return y5bVar;
        }
        v1i0.c cVar = objZ1 instanceof v1i0.c ? (v1i0.c) objZ1 : null;
        boolean zG = Intrinsics.g(tudVar.z1(), i41.d.a);
        BigDecimal bigDecimalC = p54.c(tudVar.S.c);
        c100 c100Var = c100.e;
        String strF = tudVar.u0.f();
        AssetData.CardsBean cardsBean = this.c;
        int id = cardsBean.getId();
        String str2 = (String) tudVar.Z0.getValue();
        String strA2 = inm.a("20", cardsBean.getCardExpDate());
        String str3 = cVar != null ? cVar.a : null;
        String str4 = cVar != null ? cVar.e : null;
        if (cVar == null || (str = cVar.b) == null) {
            strA = null;
        } else {
            tudVar.x0.getClass();
            strA = nel.a(str);
        }
        DepositRequest depositRequest = new DepositRequest(zG ? 1 : 0, bigDecimalC, 1, this.d, null, strF, new Integer(id), null, null, null, null, strA2, str2, null, null, null, str3, strA, str4, null, null, null, null, null, 16312208, null);
        wwd0Var4.setValue(tzs.b.a);
        wwd0Var3.setValue(c330.b.a);
        f9e f9eVar = tudVar.l0;
        a300.b bVar = tudVar.A0;
        wwd0 wwd0Var6 = tudVar.G;
        ku90<a> ku90Var = tudVar.f;
        ku90<spg0> ku90Var2 = tudVar.v;
        ku90<m480> ku90Var3 = tudVar.y;
        ku90<tng0> ku90Var4 = tudVar.A;
        ku90<z7e> ku90Var5 = tudVar.h0;
        ku90<cg6> ku90Var6 = tudVar.l1;
        ku90<x7e> ku90Var7 = tudVar.r1;
        wwd0Var = wwd0Var3;
        dtd dtdVar = tudVar.t1;
        ku90<pdd0> ku90Var8 = tudVar.K;
        wzd wzdVarI1 = tudVar.I1();
        w7e w7eVar = new w7e(CollectionsKt.A0(tudVar.g0), 2);
        this.a = 2;
        wwd0Var2 = wwd0Var4;
        if (f9eVar.a(bVar, depositRequest, wwd0Var6, ku90Var, ku90Var2, ku90Var3, ku90Var4, ku90Var5, ku90Var6, ku90Var7, dtdVar, ku90Var8, wzdVarI1, w7eVar, null, this) == y5bVar) {
            return y5bVar;
        }
        wwd0Var2.setValue(tzs.a.a);
        c330.a aVar2 = new c330.a(null, false);
        wwd0Var.getClass();
        wwd0Var.k(null, aVar2);
        vpg0.d(tudVar.v);
        tudVar.P1("");
        tudVar.N1("");
        wwd0 wwd0Var7 = tudVar.a1;
        Boolean bool2 = Boolean.TRUE;
        wwd0Var7.getClass();
        wwd0Var7.k(null, bool2);
        tudVar.R1("");
        tudVar.x1("");
        return Unit.a;
    }
}
