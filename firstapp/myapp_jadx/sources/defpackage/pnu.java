package defpackage;

import com.sportybet.android.social.data.remote.entity.AliasCode;
import com.sportybet.android.social.data.remote.entity.AliasCodeList;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sportybet.android.bookingcode.customCode.manage.viewmodel.ManageCustomCodeViewModel$loadInformation$1", f = "ManageCustomCodeViewModel.kt", l = {35}, m = "invokeSuspend", v = 2)
public final class pnu extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public int a;
    public final /* synthetic */ rnu b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pnu(rnu rnuVar, v1b<? super pnu> v1bVar) {
        super(2, v1bVar);
        this.b = rnuVar;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new pnu(this.b, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((pnu) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        rnu rnuVar = this.b;
        v340 v340Var = rnuVar.b;
        y5b y5bVar = y5b.a;
        int i = this.a;
        if (i == 0) {
            uj50.b(obj);
            sl50 sl50Var = new sl50(bm50.b(rnuVar.e.g(), vch0.b));
            this.a = 1;
            obj = s0i.a(sl50Var, this);
            if (obj == y5bVar) {
                return y5bVar;
            }
        } else {
            if (i != 1) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            uj50.b(obj);
        }
        lk50 lk50Var = (lk50) obj;
        boolean z = lk50Var instanceof lk50.c;
        wwd0 wwd0Var = rnuVar.a;
        if (z) {
            mnu mnuVar = (mnu) v340Var.a.getValue();
            List<AliasCode> code = ((AliasCodeList) ((lk50.c) lk50Var).a).getCode();
            ArrayList arrayList = new ArrayList(l48.r(code, 10));
            Iterator<T> it = code.iterator();
            while (it.hasNext()) {
                arrayList.add(k9c.a((AliasCode) it.next(), rnuVar.f.getCountryCode(), false));
            }
            uf00 uf00VarF = a4h.f(arrayList);
            String lastNickName = rnuVar.i.getLastNickName();
            if (lastNickName == null) {
                lastNickName = "";
            }
            mnuVar.getClass();
            uf00VarF.getClass();
            mnu mnuVar2 = new mnu(uf00VarF, lastNickName, false);
            wwd0Var.getClass();
            wwd0Var.k(null, mnuVar2);
        } else {
            mnu mnuVarA = mnu.a((mnu) v340Var.a.getValue(), false);
            wwd0Var.getClass();
            wwd0Var.k(null, mnuVarA);
        }
        return Unit.a;
    }
}
