package defpackage;

import com.sporty.android.core.model.patron.UserPhone;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.feature.payment.impl.deposit.presentation.fragment.DepositMomoFragment$initSwitchItemListViewModel$1$1", f = "DepositMomoFragment.kt", l = {}, m = "invokeSuspend", v = 2)
public final class l1e extends tje0 implements Function2<vne0, v1b<? super Unit>, Object> {
    public /* synthetic */ Object a;
    public final /* synthetic */ m1e b;
    public final /* synthetic */ xne0 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l1e(m1e m1eVar, xne0 xne0Var, v1b<? super l1e> v1bVar) {
        super(2, v1bVar);
        this.b = m1eVar;
        this.c = xne0Var;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        l1e l1eVar = new l1e(this.b, this.c, v1bVar);
        l1eVar.a = obj;
        return l1eVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(vne0 vne0Var, v1b<? super Unit> v1bVar) {
        return ((l1e) create(vne0Var, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        String str;
        Object next;
        Object next2;
        vne0 vne0Var = (vne0) this.a;
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        boolean z = vne0Var instanceof vne0.a;
        m1e m1eVar = this.b;
        if (z) {
            r2e r2eVarR0 = m1eVar.P0();
            ej5.c(o8i0.d(r2eVarR0), null, null, new s1e(null, r2eVarR0), 3);
        } else if (vne0Var instanceof vne0.e) {
            aoe0 aoe0Var = ((vne0.e) vne0Var).a;
            if (aoe0Var instanceof aoe0.h) {
                r2e r2eVarR1 = m1eVar.P0();
                Object obj2 = ((aoe0.h) aoe0Var).a;
                String str2 = obj2 instanceof String ? (String) obj2 : null;
                if (str2 == null) {
                    return Unit.a;
                }
                ej5.c(o8i0.d(r2eVarR1), null, null, new k2e(r2eVarR1, str2, null), 3);
            } else if ((aoe0Var instanceof aoe0.g) && !((wne0) this.c.c.getValue()).d) {
                r2e r2eVarR2 = m1eVar.P0();
                String str3 = ((aoe0.g) aoe0Var).b;
                str3.getClass();
                Object value = r2eVarR2.N0.a.getValue();
                lk50.c cVar = value instanceof lk50.c ? (lk50.c) value : null;
                List list = cVar != null ? (List) cVar.a : null;
                if (list != null) {
                    Iterator it = list.iterator();
                    do {
                        if (!it.hasNext()) {
                            next2 = null;
                            break;
                        }
                        next2 = it.next();
                    } while (!Intrinsics.g(((UserPhone) next2).getPhone(), str3));
                    UserPhone userPhone = (UserPhone) next2;
                    if (userPhone != null) {
                        wwd0 wwd0Var = r2eVarR2.L0;
                        wwd0Var.getClass();
                        wwd0Var.k(null, userPhone);
                    }
                }
            }
        } else if (vne0Var instanceof vne0.d) {
            aoe0 aoe0Var2 = ((vne0.d) vne0Var).a;
            aoe0.g gVar = aoe0Var2 instanceof aoe0.g ? (aoe0.g) aoe0Var2 : null;
            if (gVar != null && (str = gVar.b) != null) {
                r2e r2eVarR3 = m1eVar.P0();
                Object value2 = r2eVarR3.N0.a.getValue();
                lk50.c cVar2 = value2 instanceof lk50.c ? (lk50.c) value2 : null;
                List list2 = cVar2 != null ? (List) cVar2.a : null;
                if (list2 != null) {
                    Iterator it2 = list2.iterator();
                    do {
                        if (!it2.hasNext()) {
                            next = null;
                            break;
                        }
                        next = it2.next();
                    } while (!Intrinsics.g(((UserPhone) next).getPhone(), str));
                    UserPhone userPhone2 = (UserPhone) next;
                    if (userPhone2 != null) {
                        ej5.c(o8i0.d(r2eVarR3), null, null, new m2e(r2eVarR3, userPhone2, str, null), 3);
                    }
                }
            }
        }
        return Unit.a;
    }
}
