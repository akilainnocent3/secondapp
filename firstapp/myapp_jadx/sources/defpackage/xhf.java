package defpackage;

import com.sporty.android.core.model.pocket.common.AssetData;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sportybet.android.globalpay.ozow.withdraw.EFTWithdrawFragment$initSwitchItemListViewModel$1$1", f = "EFTWithdrawFragment.kt", l = {}, m = "invokeSuspend", v = 2)
public final class xhf extends tje0 implements Function2<vne0, v1b<? super Unit>, Object> {
    public /* synthetic */ Object a;
    public final /* synthetic */ yhf b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xhf(yhf yhfVar, v1b<? super xhf> v1bVar) {
        super(2, v1bVar);
        this.b = yhfVar;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        xhf xhfVar = new xhf(this.b, v1bVar);
        xhfVar.a = obj;
        return xhfVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(vne0 vne0Var, v1b<? super Unit> v1bVar) {
        return ((xhf) create(vne0Var, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        AssetData.AccountsBean accountsBean;
        Object next;
        vne0 vne0Var = (vne0) this.a;
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        boolean zG = Intrinsics.g(vne0Var, vne0.a.a);
        yhf yhfVar = this.b;
        if (zG) {
            sif sifVarP0 = yhfVar.P0();
            sifVarP0.L1();
            ku90<spg0> ku90Var = sifVarP0.v;
            int i = vpg0.a;
            ku90Var.getClass();
            ku90Var.a(spg0.a.a);
        } else if (!Intrinsics.g(vne0Var, vne0.b.a)) {
            if (vne0Var instanceof vne0.e) {
                aoe0 aoe0Var = ((vne0.e) vne0Var).a;
                if (aoe0Var instanceof aoe0.a) {
                    yhfVar.P0().T1(((aoe0.a) aoe0Var).a);
                } else if (aoe0Var instanceof aoe0.b) {
                    sif sifVarP1 = yhfVar.P0();
                    Object obj2 = ((aoe0.b) aoe0Var).a;
                    obj2.getClass();
                    lk50<List<AssetData.AccountsBean>> value = sifVarP1.O1().getValue();
                    lk50.c cVar = value instanceof lk50.c ? (lk50.c) value : null;
                    List list = cVar != null ? (List) cVar.a : null;
                    if (list != null) {
                        Iterator it = list.iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                next = null;
                                break;
                            }
                            next = it.next();
                            int id = ((AssetData.AccountsBean) next).getId();
                            if ((obj2 instanceof Integer) && id == ((Number) obj2).intValue()) {
                                break;
                            }
                        }
                        accountsBean = (AssetData.AccountsBean) next;
                    } else {
                        accountsBean = null;
                    }
                    sifVarP1.v0.setValue(accountsBean);
                    wwd0 wwd0Var = sifVarP1.Y0;
                    Boolean bool = Boolean.FALSE;
                    wwd0Var.getClass();
                    wwd0Var.k(null, bool);
                    wwd0 wwd0Var2 = sifVarP1.a1;
                    jo50 jo50Var = new jo50();
                    wwd0Var2.getClass();
                    wwd0Var2.k(null, jo50Var);
                }
            } else if (vne0Var instanceof vne0.c) {
                aoe0 aoe0Var2 = ((vne0.c) vne0Var).a;
                if (aoe0Var2 instanceof aoe0.b) {
                    sif sifVarP2 = yhfVar.P0();
                    Object obj3 = ((aoe0.b) aoe0Var2).a;
                    obj3.getClass();
                    ej5.c(o8i0.d(sifVarP2), null, null, new dkj0(sifVarP2, obj3, null), 3);
                }
            } else if (vne0Var instanceof vne0.d) {
                aoe0 aoe0Var3 = ((vne0.d) vne0Var).a;
                if (aoe0Var3 instanceof aoe0.b) {
                    sif sifVarP3 = yhfVar.P0();
                    Object obj4 = ((aoe0.b) aoe0Var3).a;
                    obj4.getClass();
                    ej5.c(o8i0.d(sifVarP3), null, null, new jkj0(sifVarP3, obj4, null), 3);
                }
            }
        }
        return Unit.a;
    }
}
