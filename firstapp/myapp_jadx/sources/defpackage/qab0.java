package defpackage;

import androidx.recyclerview.widget.RecyclerView;
import com.sportybet.android.gp.tz.R;
import com.sportygames.commons.remote.model.HTTPResponse;
import com.sportygames.commons.remote.model.LoadingState;
import com.sportygames.spinmatch.components.RoundResult;
import com.sportygames.spinmatch.model.response.MatchPlaceBetResponse;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.b;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.c;
import nl.dionsegijn.konfetti.xml.KonfettiView;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportygames.spinmatch.views.SpinMatchFragment$observeLiveData$9$2", f = "SpinMatchFragment.kt", l = {1661}, m = "invokeSuspend", v = 1)
public final class qab0 extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public int a;
    public final /* synthetic */ kab0 b;
    public final /* synthetic */ LoadingState<HTTPResponse<MatchPlaceBetResponse>> c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qab0(kab0 kab0Var, LoadingState<HTTPResponse<MatchPlaceBetResponse>> loadingState, v1b<? super qab0> v1bVar) {
        super(2, v1bVar);
        this.b = kab0Var;
        this.c = loadingState;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new qab0(this.b, this.c, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((qab0) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        boolean z;
        MatchPlaceBetResponse.IndividualBetDetailsList individualBetDetailsList;
        MatchPlaceBetResponse data;
        MatchPlaceBetResponse.Wheel1Draw result;
        Integer orderedPosition;
        List<MatchPlaceBetResponse.IndividualBetDetailsList> individualBetDetailsList2;
        Object next;
        MatchPlaceBetResponse data2;
        MatchPlaceBetResponse data3;
        fo80 fo80Var;
        HTTPResponse<MatchPlaceBetResponse> data4;
        MatchPlaceBetResponse data5;
        MatchPlaceBetResponse.Wheel1Draw result2;
        Integer orderedPosition2;
        MatchPlaceBetResponse data6;
        y5b y5bVar = y5b.a;
        int i = this.a;
        kab0 kab0Var = this.b;
        if (i == 0) {
            uj50.b(obj);
            kab0Var.w0().y1();
            this.a = 1;
            if (hkd.b(3400L, this) == y5bVar) {
                return y5bVar;
            }
        } else {
            if (i != 1) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            uj50.b(obj);
        }
        fo80 fo80Var2 = kab0Var.c;
        if (fo80Var2 != null) {
            fo80Var2.G.setBackImageVisible(0);
        }
        LoadingState<HTTPResponse<MatchPlaceBetResponse>> loadingState = this.c;
        HTTPResponse<MatchPlaceBetResponse> data7 = loadingState.getData();
        if (((data7 == null || (data6 = data7.getData()) == null) ? false : Intrinsics.g(data6.isFreeSpin(), Boolean.FALSE)) && (data4 = loadingState.getData()) != null && (data5 = data4.getData()) != null && (result2 = data5.getResult()) != null && (orderedPosition2 = result2.getOrderedPosition()) != null) {
            int iIntValue = orderedPosition2.intValue();
            fo80 fo80Var3 = kab0Var.c;
            if (fo80Var3 != null) {
                fo80Var3.c.setCrown(iIntValue - 1);
            }
        }
        kab0Var.w0().z1();
        HTTPResponse<MatchPlaceBetResponse> data8 = loadingState.getData();
        if (data8 != null && (data3 = data8.getData()) != null && (fo80Var = kab0Var.c) != null) {
            RoundResult roundResult = fo80Var.Q;
            op5 op5Var = op5.a;
            String str = kab0Var.L;
            op5Var.getClass();
            roundResult.setResult(op5.i(str), data3);
        }
        fo80 fo80Var4 = kab0Var.c;
        if (fo80Var4 != null) {
            fo80Var4.i.setVisibility(4);
        }
        fo80 fo80Var5 = kab0Var.c;
        if (fo80Var5 != null) {
            fo80Var5.Q.E(true);
        }
        HTTPResponse<MatchPlaceBetResponse> data9 = loadingState.getData();
        if ((data9 == null || (data2 = data9.getData()) == null) ? false : Intrinsics.g(data2.isFreeSpin(), Boolean.FALSE)) {
            fo80 fo80Var6 = kab0Var.c;
            if (fo80Var6 != null) {
                fo80Var6.P.setVisibility(0);
            }
            boolean z2 = kab0Var.j0;
            fo80 fo80Var7 = kab0Var.c;
            if (z2) {
                if (fo80Var7 != null) {
                    fo80Var7.O.setVisibility(8);
                }
            } else if (fo80Var7 != null) {
                fo80Var7.O.setVisibility(0);
            }
            MatchPlaceBetResponse data10 = loadingState.getData().getData();
            if (data10 == null || (individualBetDetailsList2 = data10.getIndividualBetDetailsList()) == null) {
                individualBetDetailsList = null;
            } else {
                Iterator<T> it = individualBetDetailsList2.iterator();
                do {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                } while (!c.l(((MatchPlaceBetResponse.IndividualBetDetailsList) next).getWinStatus(), "WIN", true));
                individualBetDetailsList = (MatchPlaceBetResponse.IndividualBetDetailsList) next;
            }
            if (individualBetDetailsList != null) {
                fo80 fo80Var8 = kab0Var.c;
                x0g x0gVar = kab0Var.a0;
                if (fo80Var8 != null) {
                    KonfettiView konfettiView = fo80Var8.J;
                    iuz iuzVar = new iuz(x0gVar);
                    iuzVar.a(-75);
                    iuzVar.f();
                    px80.d dVar = px80.d.a;
                    px80.a aVar = px80.a.a;
                    iuzVar.e(b.k(dVar, aVar));
                    iuzVar.b(b.k(new Integer(16777215), new Integer(16766720), new Integer(12632256), new Integer(16740285), new Integer(5631999)));
                    iuzVar.d(80.0f);
                    iuzVar.c(new i620.c(0.0d, 0.8d));
                    guz guzVar = iuzVar.a;
                    iuz iuzVar2 = new iuz(x0gVar);
                    iuzVar2.a(255);
                    iuzVar2.f();
                    iuzVar2.e(b.k(dVar, aVar));
                    iuzVar2.b(b.k(new Integer(16777215), new Integer(16766720), new Integer(12632256), new Integer(16740285), new Integer(5631999)));
                    iuzVar2.d(80.0f);
                    iuzVar2.c(new i620.c(1.0d, 0.8d));
                    konfettiView.a(guzVar, iuzVar2.a);
                }
                if (kab0Var.getContext() != null) {
                    String string = kab0Var.getString(R.string.bet_win);
                    string.getClass();
                    kab0Var.F0(string);
                }
                HTTPResponse<MatchPlaceBetResponse> data11 = loadingState.getData();
                if (data11 != null && (data = data11.getData()) != null && (result = data.getResult()) != null && (orderedPosition = result.getOrderedPosition()) != null) {
                    int iIntValue2 = orderedPosition.intValue();
                    fo80 fo80Var9 = kab0Var.c;
                    if (fo80Var9 != null) {
                        int i2 = iIntValue2 - 1;
                        vk2 vk2Var = fo80Var9.c.binding;
                        RecyclerView.f adapter = vk2Var != null ? vk2Var.b.getAdapter() : null;
                        adapter.getClass();
                        RecyclerView recyclerView = ((tk2) adapter).c;
                        RecyclerView.d0 d0VarQ = recyclerView.Q(recyclerView.getChildAt(i2));
                        d0VarQ.getClass();
                        wk2 wk2Var = ((tk2.a) d0VarQ).a;
                        wk2Var.e.setAlpha(1.0f);
                        wk2Var.b.setAlpha(1.0f);
                    }
                }
            } else {
                kab0Var = kab0Var;
                if (kab0Var.getContext() != null) {
                    String string2 = kab0Var.getString(R.string.bet_lost);
                    string2.getClass();
                    kab0Var.F0(string2);
                }
            }
        } else {
            kab0Var = kab0Var;
            if (kab0Var.getContext() != null) {
                String string3 = kab0Var.getString(R.string.free_spin_sound);
                string3.getClass();
                kab0Var.F0(string3);
                fo80 fo80Var10 = kab0Var.c;
                if (fo80Var10 != null) {
                    z = false;
                    fo80Var10.C.setVisibility(0);
                } else {
                    z = false;
                }
                kab0Var.z0(z);
            }
        }
        nbb0 nbb0VarW0 = kab0Var.w0();
        nbb0VarW0.c = null;
        nbb0VarW0.b = null;
        return Unit.a;
    }
}
