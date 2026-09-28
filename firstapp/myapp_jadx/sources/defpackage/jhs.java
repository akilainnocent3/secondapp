package defpackage;

import com.sportybet.android.social.data.remote.entity.AliasCode;
import com.sportybet.android.social.data.remote.entity.AliasCodeList;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sportybet.android.bookingcode.customCode.list.viewmodel.ListCustomCodeViewModel$loadInformation$1", f = "ListCustomCodeViewModel.kt", l = {33}, m = "invokeSuspend", v = 2)
public final class jhs extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public int a;
    public final /* synthetic */ lhs b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jhs(lhs lhsVar, v1b<? super jhs> v1bVar) {
        super(2, v1bVar);
        this.b = lhsVar;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new jhs(this.b, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((jhs) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        lhs lhsVar = this.b;
        v340 v340Var = lhsVar.b;
        y5b y5bVar = y5b.a;
        int i = this.a;
        if (i == 0) {
            uj50.b(obj);
            sl50 sl50Var = new sl50(bm50.b(lhsVar.e.g(), vch0.b));
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
        wwd0 wwd0Var = lhsVar.a;
        if (z) {
            hhs hhsVar = (hhs) v340Var.a.getValue();
            List<AliasCode> code = ((AliasCodeList) ((lk50.c) lk50Var).a).getCode();
            ArrayList arrayList = new ArrayList(l48.r(code, 10));
            Iterator<T> it = code.iterator();
            while (it.hasNext()) {
                arrayList.add(k9c.a((AliasCode) it.next(), lhsVar.f.getCountryCode(), false));
            }
            String lastNickName = lhsVar.i.getLastNickName();
            if (lastNickName == null) {
                lastNickName = "";
            }
            hhsVar.getClass();
            hhs hhsVar2 = new hhs(lastNickName, false, arrayList);
            wwd0Var.getClass();
            wwd0Var.k(null, hhsVar2);
        } else {
            hhs hhsVar3 = (hhs) v340Var.a.getValue();
            List<gdc> list = hhsVar3.b;
            String str = hhsVar3.c;
            list.getClass();
            str.getClass();
            hhs hhsVar4 = new hhs(str, false, list);
            wwd0Var.getClass();
            wwd0Var.k(null, hhsVar4);
        }
        return Unit.a;
    }
}
