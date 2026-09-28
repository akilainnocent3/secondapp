package defpackage;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.sportybet.android.gp.tz.R;
import com.sportygames.rush.model.response.RushCoeffListResponse;
import com.sportygames.rush.model.response.RushPlaceBetResponse;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportygames.rush.view.RushFragment$animateHouseCoeffList$1", f = "RushFragment.kt", l = {3111}, m = "invokeSuspend", v = 1)
public final class p560 extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public int a;
    public final /* synthetic */ RushPlaceBetResponse b;
    public final /* synthetic */ l560 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p560(RushPlaceBetResponse rushPlaceBetResponse, l560 l560Var, v1b<? super p560> v1bVar) {
        super(2, v1bVar);
        this.b = rushPlaceBetResponse;
        this.c = l560Var;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new p560(this.b, this.c, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((p560) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        Double houseCoefficient;
        Double userCoefficient;
        Double houseCoefficient2;
        y5b y5bVar = y5b.a;
        int i = this.a;
        if (i == 0) {
            uj50.b(obj);
            this.a = 1;
            if (hkd.b(1500L, this) == y5bVar) {
                return y5bVar;
            }
        } else {
            if (i != 1) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            uj50.b(obj);
        }
        double dDoubleValue = 0.0d;
        RushPlaceBetResponse rushPlaceBetResponse = this.b;
        boolean z = ((rushPlaceBetResponse == null || (houseCoefficient2 = rushPlaceBetResponse.getHouseCoefficient()) == null) ? 0.0d : houseCoefficient2.doubleValue()) >= ((rushPlaceBetResponse == null || (userCoefficient = rushPlaceBetResponse.getUserCoefficient()) == null) ? 0.0d : userCoefficient.doubleValue());
        l560 l560Var = this.c;
        eo80 eo80Var = l560Var.l0;
        RecyclerView.f adapter = eo80Var != null ? eo80Var.N.getAdapter() : null;
        n28 n28Var = adapter instanceof n28 ? (n28) adapter : null;
        if (z) {
            String string = l560Var.getString(R.string.sg_rush_bet_win);
            string.getClass();
            l560Var.T0(string);
        } else {
            String string2 = l560Var.getString(R.string.sg_rush_bet_lost);
            string2.getClass();
            l560Var.T0(string2);
        }
        if (n28Var != null) {
            if (rushPlaceBetResponse != null && (houseCoefficient = rushPlaceBetResponse.getHouseCoefficient()) != null) {
                dDoubleValue = houseCoefficient.doubleValue();
            }
            n28Var.a.add(0, new RushCoeffListResponse(dDoubleValue, z));
            n28Var.notifyItemInserted(0);
        }
        if (n28Var != null) {
            ArrayList<RushCoeffListResponse> arrayList = n28Var.a;
            if (arrayList.size() != 0 && arrayList.size() > 9) {
                arrayList.remove(arrayList.size() - 1);
                n28Var.notifyItemRemoved(arrayList.size());
            }
        }
        if (n28Var != null && n28Var.a.size() == 1) {
            eo80 eo80Var2 = l560Var.l0;
            RecyclerView recyclerView = eo80Var2 != null ? eo80Var2.N : null;
            if (recyclerView != null) {
                recyclerView.setOnTouchListener(new o560());
            }
            if (recyclerView != null) {
                recyclerView.setAdapter(n28Var);
            }
            if (recyclerView != null) {
                recyclerView.getContext();
                recyclerView.setLayoutManager(new LinearLayoutManager(1, true));
            }
        }
        eo80 eo80Var3 = l560Var.l0;
        if (eo80Var3 != null) {
            eo80Var3.N.o0(0);
        }
        return Unit.a;
    }
}
