package defpackage;

import com.sporty.android.core.model.pocket.common.AssetData;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.feature.payment.impl.deposit.presentation.fragment.DepositOtherBanksFragment$initSwitchItemListViewModel$1$1", f = "DepositOtherBanksFragment.kt", l = {}, m = "invokeSuspend", v = 2)
public final class e4e extends tje0 implements Function2<vne0, v1b<? super Unit>, Object> {
    public /* synthetic */ Object a;
    public final /* synthetic */ f4e b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e4e(f4e f4eVar, v1b<? super e4e> v1bVar) {
        super(2, v1bVar);
        this.b = f4eVar;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        e4e e4eVar = new e4e(this.b, v1bVar);
        e4eVar.a = obj;
        return e4eVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(vne0 vne0Var, v1b<? super Unit> v1bVar) {
        return ((e4e) create(vne0Var, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        vne0 vne0Var = (vne0) this.a;
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        boolean zG = Intrinsics.g(vne0Var, vne0.a.a);
        f4e f4eVar = this.b;
        if (zG) {
            f4eVar.P0().N1();
        } else if (!Intrinsics.g(vne0Var, vne0.b.a)) {
            Object obj2 = null;
            if (vne0Var instanceof vne0.e) {
                aoe0 aoe0Var = ((vne0.e) vne0Var).a;
                if (aoe0Var instanceof aoe0.a) {
                    f4eVar.P0().P1(((aoe0.a) aoe0Var).a);
                } else if (aoe0Var instanceof aoe0.b) {
                    f5e f5eVarS0 = f4eVar.P0();
                    Object obj3 = ((aoe0.b) aoe0Var).a;
                    obj3.getClass();
                    Object value = ((uwd0) f5eVarS0.D0.getValue()).getValue();
                    lk50.c cVar = value instanceof lk50.c ? (lk50.c) value : null;
                    List list = cVar != null ? (List) cVar.a : null;
                    if (list != null) {
                        for (Object obj4 : list) {
                            int id = ((AssetData.AccountsBean) obj4).getId();
                            if ((obj3 instanceof Integer) && id == ((Number) obj3).intValue()) {
                                obj2 = obj4;
                                break;
                            }
                        }
                        obj2 = (AssetData.AccountsBean) obj2;
                    }
                    f5eVarS0.y0.setValue(obj2);
                }
            } else if (vne0Var instanceof vne0.c) {
                aoe0 aoe0Var2 = ((vne0.c) vne0Var).a;
                if (aoe0Var2 instanceof aoe0.b) {
                    f5e f5eVarS1 = f4eVar.P0();
                    Object obj5 = ((aoe0.b) aoe0Var2).a;
                    obj5.getClass();
                    ej5.c(o8i0.d(f5eVarS1), null, null, new m4e(f5eVarS1, obj5, null), 3);
                }
            }
        }
        return Unit.a;
    }
}
