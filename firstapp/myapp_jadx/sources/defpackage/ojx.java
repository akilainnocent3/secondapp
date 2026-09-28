package defpackage;

import com.sportygames.commons.models.PagingState;
import com.sportygames.commons.models.enums.PagingFetchType;
import com.sportygames.commons.remote.model.HTTPResponse;
import com.sportygames.commons.remote.model.LoadingState;
import com.sportygames.commons.views.NavigationActivity;
import com.sportygames.evenodd.remote.models.BetHistoryItem;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class ojx implements Function1 {
    public final /* synthetic */ NavigationActivity a;

    public /* synthetic */ ojx(NavigationActivity navigationActivity) {
        this.a = navigationActivity;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        PagingFetchType type;
        fo2 fo2Var;
        fo2 fo2Var2;
        LoadingState loadingState = (LoadingState) obj;
        int i = NavigationActivity.y;
        int i2 = NavigationActivity.a.a[loadingState.getStatus().ordinal()];
        NavigationActivity navigationActivity = this.a;
        if (i2 != 1) {
            if (i2 == 2) {
                fo2 fo2Var3 = navigationActivity.i;
                if (fo2Var3 != null) {
                    fo2Var3.k(true);
                }
            } else if (i2 != 3) {
                uhc.a();
                return null;
            }
        } else if (loadingState.getData() != null) {
            fo2 fo2Var4 = navigationActivity.i;
            if (fo2Var4 != null) {
                fo2Var4.k(false);
            }
            List list = (List) ((HTTPResponse) loadingState.getData()).getData();
            if ((list != null ? list.size() : 0) <= 0) {
                Integer total = ((HTTPResponse) loadingState.getData()).getTotal();
                if ((total != null ? total.intValue() : 0) <= 0 && (fo2Var = navigationActivity.i) != null && fo2Var.f().getChildCount() == 0 && (fo2Var2 = navigationActivity.i) != null) {
                    fo2Var2.l();
                }
            }
            fo2 fo2Var5 = navigationActivity.i;
            if (fo2Var5 != null) {
                List<BetHistoryItem> list2 = (List) ((HTTPResponse) loadingState.getData()).getData();
                Integer total2 = ((HTTPResponse) loadingState.getData()).getTotal();
                PagingState pagingStateD = navigationActivity.z1().c.d();
                int offset = pagingStateD != null ? pagingStateD.getOffset() : 0;
                PagingState pagingStateD2 = navigationActivity.z1().c.d();
                int limit = pagingStateD2 != null ? pagingStateD2.getLimit() : 0;
                PagingState pagingStateD3 = navigationActivity.z1().c.d();
                if (pagingStateD3 == null || (type = pagingStateD3.getType()) == null) {
                    type = PagingFetchType.VIEW_MORE;
                }
                fo2Var5.a(list2, total2, offset, limit, type);
            }
        }
        return Unit.a;
    }
}
