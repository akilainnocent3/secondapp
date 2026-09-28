package defpackage;

import android.content.Context;
import android.view.View;
import androidx.fragment.app.e;
import com.sportybet.android.gp.tz.R;
import com.sportygames.commons.models.PagingState;
import com.sportygames.commons.models.enums.PagingFetchType;
import com.sportygames.commons.remote.model.HTTPResponse;
import com.sportygames.commons.remote.model.LoadingState;
import com.sportygames.evenodd.remote.models.BetHistoryItem;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class ceg implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ ceg(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        PagingFetchType type;
        fo2 fo2Var;
        fo2 fo2Var2;
        Context context;
        int i = this.a;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                final fgg fggVar = (fgg) obj2;
                LoadingState loadingState = (LoadingState) obj;
                int i2 = fgg.a.a[loadingState.getStatus().ordinal()];
                int i3 = 0;
                if (i2 != 1) {
                    if (i2 == 2) {
                        fo2 fo2Var3 = fggVar.D;
                        if (fo2Var3 != null) {
                            fo2Var3.k(true);
                        }
                    } else {
                        if (i2 != 3) {
                            uhc.a();
                            return null;
                        }
                        xbg xbgVar = fggVar.z;
                        if (xbgVar == null) {
                            Intrinsics.n("errorDialog");
                            throw null;
                        }
                        if (!xbgVar.isShowing() && (context = fggVar.getContext()) != null) {
                            fdg fdgVar = fdg.e;
                            e eVarRequireActivity = fggVar.requireActivity();
                            eVarRequireActivity.getClass();
                            fggVar.D0();
                            jcg.d(fdgVar, eVarRequireActivity, "Even-Odd", loadingState.getError(), new Function0() { // from class: ueg
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    fggVar.s0();
                                    return Unit.a;
                                }
                            }, new veg(fggVar, i3), null, 0, context.getColor(R.color.try_again_color), null, null, null, new Function1() { // from class: weg
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj3) {
                                    String str = (String) obj3;
                                    str.getClass();
                                    fggVar.t0(str);
                                    return Unit.a;
                                }
                            }, null, 97728);
                        }
                    }
                } else if (loadingState.getData() != null) {
                    fo2 fo2Var4 = fggVar.D;
                    if (fo2Var4 != null) {
                        fo2Var4.k(false);
                    }
                    List list = (List) ((HTTPResponse) loadingState.getData()).getData();
                    if ((list != null ? list.size() : 0) <= 0) {
                        Integer total = ((HTTPResponse) loadingState.getData()).getTotal();
                        if ((total != null ? total.intValue() : 0) <= 0 && (fo2Var = fggVar.D) != null && fo2Var.f().getChildCount() == 0 && (fo2Var2 = fggVar.D) != null) {
                            fo2Var2.l();
                        }
                    }
                    fo2 fo2Var5 = fggVar.D;
                    if (fo2Var5 != null) {
                        List<BetHistoryItem> list2 = (List) ((HTTPResponse) loadingState.getData()).getData();
                        Integer total2 = ((HTTPResponse) loadingState.getData()).getTotal();
                        PagingState pagingStateD = fggVar.u0().c.d();
                        int offset = pagingStateD != null ? pagingStateD.getOffset() : 0;
                        PagingState pagingStateD2 = fggVar.u0().c.d();
                        int limit = pagingStateD2 != null ? pagingStateD2.getLimit() : 0;
                        PagingState pagingStateD3 = fggVar.u0().c.d();
                        if (pagingStateD3 == null || (type = pagingStateD3.getType()) == null) {
                            type = PagingFetchType.VIEW_MORE;
                        }
                        fo2Var5.a(list2, total2, offset, limit, type);
                    }
                }
                return Unit.a;
            default:
                ((View) obj).getClass();
                ((Function0) obj2).invoke();
                return Unit.a;
        }
    }
}
