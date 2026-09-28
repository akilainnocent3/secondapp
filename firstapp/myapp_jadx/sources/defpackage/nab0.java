package defpackage;

import com.sportygames.commons.remote.model.HTTPResponse;
import com.sportygames.commons.remote.model.LoadingState;
import com.sportygames.spinmatch.model.response.DetailResponse;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.b;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportygames.spinmatch.views.SpinMatchFragment$observeLiveData$6$3", f = "SpinMatchFragment.kt", l = {1469}, m = "invokeSuspend", v = 1)
public final class nab0 extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public int a;
    public final /* synthetic */ kab0 b;
    public final /* synthetic */ LoadingState<HTTPResponse<DetailResponse>> c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nab0(kab0 kab0Var, LoadingState<HTTPResponse<DetailResponse>> loadingState, v1b<? super nab0> v1bVar) {
        super(2, v1bVar);
        this.b = kab0Var;
        this.c = loadingState;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new nab0(this.b, this.c, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((nab0) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        ArrayList<DetailResponse.BetDetails> arrayList;
        DetailResponse.BetConfigList betConfigList;
        y5b y5bVar = y5b.a;
        int i = this.a;
        if (i == 0) {
            uj50.b(obj);
            this.a = 1;
            if (hkd.b(100L, this) == y5bVar) {
                return y5bVar;
            }
        } else {
            if (i != 1) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            uj50.b(obj);
        }
        kab0 kab0Var = this.b;
        kab0Var.z0(false);
        DetailResponse data = this.c.getData().getData();
        if (data == null || (arrayList = data.getBetDetails()) == null) {
            arrayList = new ArrayList<>();
        }
        Iterator<DetailResponse.BetDetails> it = arrayList.iterator();
        it.getClass();
        while (it.hasNext()) {
            DetailResponse.BetDetails next = it.next();
            next.getClass();
            DetailResponse.BetDetails betDetails = next;
            ArrayList<DetailResponse.BetConfigList> arrayList2 = kab0Var.y;
            int size = arrayList2.size();
            int i2 = 0;
            do {
                if (i2 >= size) {
                    betConfigList = null;
                    break;
                }
                betConfigList = arrayList2.get(i2);
                i2++;
            } while (betConfigList.getId() != betDetails.getBetConfigId());
            DetailResponse.BetConfigList betConfigList2 = betConfigList;
            fo80 fo80Var = kab0Var.c;
            if (fo80Var != null) {
                fo80Var.c.E((betConfigList2 != null ? betConfigList2.getOrderedPosition() : 1) - 1, betDetails.getStakeAmount(), kab0Var.w, true);
            }
            boolean zContainsKey = kab0Var.f.containsKey(new Integer(betDetails.getBetConfigId()));
            HashMap<Integer, List<Double>> map = kab0Var.f;
            if (zContainsKey) {
                List<Double> list = map.get(new Integer(betDetails.getBetConfigId()));
                if (list != null) {
                    list.add(new Double(betDetails.getStakeAmount()));
                }
            } else {
                map.put(new Integer(betDetails.getBetConfigId()), b.f(new Double(betDetails.getStakeAmount())));
            }
        }
        return Unit.a;
    }
}
