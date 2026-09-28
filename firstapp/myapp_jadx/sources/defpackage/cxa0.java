package defpackage;

import androidx.recyclerview.widget.r;
import com.sporty.android.core.model.pocket.common.ClabeBankAccount;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sportybet.android.globalpay.stp.spei.withdraw.SpeiByStpWithdrawViewModel$loadClabeBankAccounts$1", f = "SpeiByStpWithdrawViewModel.kt", l = {r.d.DEFAULT_DRAG_ANIMATION_DURATION}, m = "invokeSuspend", v = 2)
public final class cxa0 extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public int a;
    public final /* synthetic */ zwa0 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cxa0(zwa0 zwa0Var, v1b<? super cxa0> v1bVar) {
        super(2, v1bVar);
        this.b = zwa0Var;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new cxa0(this.b, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((cxa0) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        Object objA;
        Object value;
        y5b y5bVar = y5b.a;
        int i = this.a;
        zwa0 zwa0Var = this.b;
        if (i == 0) {
            uj50.b(obj);
            i4k i4kVar = zwa0Var.A;
            int i2 = zwa0Var.W.a;
            this.a = 1;
            objA = i4kVar.a(i2, this);
            if (objA == y5bVar) {
                return y5bVar;
            }
        } else {
            if (i != 1) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            uj50.b(obj);
            objA = ((zi50) obj).a;
        }
        zi50.a aVar = zi50.b;
        if (!(objA instanceof zi50.b)) {
            List list = (List) objA;
            ClabeBankAccount clabeBankAccount = (ClabeBankAccount) CollectionsKt.firstOrNull(list);
            String clabe = clabeBankAccount != null ? clabeBankAccount.getClabe() : null;
            if (clabe == null) {
                clabe = "";
            }
            wwd0 wwd0Var = zwa0Var.E;
            do {
                value = wwd0Var.getValue();
            } while (!wwd0Var.g(value, wwa0.a((wwa0) value, null, null, new ijf0(clabe, 0L, 6), list.size() > 1, false, 3)));
            if (clabe.length() > 0) {
                zwa0Var.D1(clabe);
            }
            ArrayList arrayList = new ArrayList(l48.r(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(((ClabeBankAccount) it.next()).getClabe());
            }
            zwa0Var.C1(arrayList);
        }
        return Unit.a;
    }
}
