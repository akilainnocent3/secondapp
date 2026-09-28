package defpackage;

import android.content.Context;
import androidx.fragment.app.e;
import androidx.recyclerview.widget.RecyclerView;
import com.sportybet.android.gp.tz.R;
import com.sportybet.plugin.realsports.data.Bet;
import com.sportygames.commons.models.PagingState;
import com.sportygames.commons.models.enums.PagingFetchType;
import com.sportygames.commons.remote.model.HTTPResponse;
import com.sportygames.commons.remote.model.LoadingState;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class uh6 implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ uh6(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Bet bet;
        PagingFetchType type;
        fo2 fo2Var;
        fo2 fo2Var2;
        int i = this.a;
        Object obj2 = this.b;
        String str = null;
        switch (i) {
            case 0:
                xh6 xh6Var = (xh6) obj2;
                pl6 pl6Var = (pl6) obj;
                pl6Var.getClass();
                pl6 pl6Var2 = xh6Var.B;
                if (pl6Var2 != null && (bet = pl6Var2.a) != null) {
                    str = bet.id;
                }
                if (Intrinsics.g(str, pl6Var.a.id)) {
                    xh6Var.s();
                } else {
                    xh6Var.l(pl6Var);
                }
                return Unit.a;
            default:
                final a1b0 a1b0Var = (a1b0) obj2;
                LoadingState loadingState = (LoadingState) obj;
                int i2 = a1b0.a.a[loadingState.getStatus().ordinal()];
                int i3 = 1;
                int i4 = 3;
                if (i2 != 1) {
                    if (i2 == 2) {
                        xbg xbgVar = a1b0Var.w;
                        if (xbgVar != null && !xbgVar.isShowing()) {
                            e activity = a1b0Var.getActivity();
                            if (activity != null) {
                                nya0 nya0Var = nya0.e;
                                a1b0Var.z0();
                                jcg.d(nya0Var, activity, "Spin2Win", loadingState.getError(), new nra(a1b0Var, i3), new t0b0(), new bn6(a1b0Var, i4), 0, activity.getColor(R.color.try_again_color), null, null, null, new Function1() { // from class: u0b0
                                    @Override // kotlin.jvm.functions.Function1
                                    public final Object invoke(Object obj3) {
                                        String str2 = (String) obj3;
                                        str2.getClass();
                                        a1b0Var.t0(str2);
                                        return Unit.a;
                                    }
                                }, null, 97664);
                            }
                            fo2 fo2Var3 = a1b0Var.D;
                            if (fo2Var3 != null) {
                                fo2Var3.dismiss();
                            }
                        }
                    } else {
                        if (i2 != 3) {
                            uhc.a();
                            return null;
                        }
                        fo2 fo2Var4 = a1b0Var.D;
                        if (fo2Var4 != null) {
                            fo2Var4.k(true);
                        }
                    }
                } else if (loadingState.getData() != null) {
                    fo2 fo2Var5 = a1b0Var.D;
                    if (fo2Var5 != null) {
                        fo2Var5.k(false);
                    }
                    List list = (List) ((HTTPResponse) loadingState.getData()).getData();
                    if ((list != null ? list.size() : 0) <= 0) {
                        Integer total = ((HTTPResponse) loadingState.getData()).getTotal();
                        if ((total != null ? total.intValue() : 0) <= 0 && (fo2Var = a1b0Var.D) != null && fo2Var.f().getChildCount() == 0) {
                            fo2 fo2Var6 = a1b0Var.D;
                            if (fo2Var6 != null) {
                                fo2Var6.l();
                            }
                            Context context = a1b0Var.getContext();
                            if (context != null && (fo2Var2 = a1b0Var.D) != null) {
                                fo2Var2.m(context.getColor(R.color.sg_color_12492f));
                            }
                        }
                    }
                    fo2 fo2Var7 = a1b0Var.D;
                    if (fo2Var7 != null) {
                        List list2 = (List) ((HTTPResponse) loadingState.getData()).getData();
                        Integer total2 = ((HTTPResponse) loadingState.getData()).getTotal();
                        PagingState pagingStateD = a1b0Var.u0().c.d();
                        int offset = pagingStateD != null ? pagingStateD.getOffset() : 0;
                        PagingState pagingStateD2 = a1b0Var.u0().c.d();
                        int limit = pagingStateD2 != null ? pagingStateD2.getLimit() : 0;
                        PagingState pagingStateD3 = a1b0Var.u0().c.d();
                        if (pagingStateD3 == null || (type = pagingStateD3.getType()) == null) {
                            type = PagingFetchType.VIEW_MORE;
                        }
                        ArrayList arrayList = fo2Var7.N;
                        type.getClass();
                        if (list2 != null) {
                            fo2Var7.B.addAll(list2);
                            arrayList.addAll(list2);
                        }
                        fo2Var7.K = offset;
                        fo2Var7.J = limit;
                        fo2Var7.h(type, total2, list2 != null ? list2.size() : 0);
                        if (list2 != null) {
                            RecyclerView.f adapter = fo2Var7.f().getAdapter();
                            adapter.getClass();
                            xp80 xp80Var = (xp80) adapter;
                            fo2.b bVar = fo2Var7.L;
                            fo2.b bVar2 = fo2.b.b;
                            boolean z = bVar == bVar2;
                            boolean z2 = fo2Var7.M == bVar2;
                            arrayList.getClass();
                            ej5.c(xp80Var.d, null, null, new kp2(arrayList, z, z2, xp80Var, null), 3);
                        }
                        RecyclerView.f adapter2 = fo2Var7.f().getAdapter();
                        if (adapter2 != null) {
                            adapter2.notifyDataSetChanged();
                        }
                    }
                }
                return Unit.a;
        }
    }
}
