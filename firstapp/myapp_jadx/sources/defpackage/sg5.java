package defpackage;

import com.sportybet.android.instantwin.presentation.buildandgo.d;
import com.sportygames.commons.models.PagingState;
import com.sportygames.commons.models.enums.PagingFetchType;
import com.sportygames.commons.remote.model.HTTPResponse;
import com.sportygames.commons.remote.model.LoadingState;
import com.sportygames.fruithunt.network.models.FHBetHistoryItem;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class sg5 implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ sg5(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    /* JADX WARN: Code duplicated, block: B:35:0x0081  */
    /* JADX WARN: Code duplicated, block: B:37:0x0085  */
    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        fo2 fo2Var;
        fo2 fo2Var2;
        fo2 fo2Var3;
        int i = this.a;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                Function1 function1 = (Function1) obj;
                if (!(((ni5) obj2).f instanceof jh10.d)) {
                    function1.invoke(d.a.C0261a.a);
                    function1.invoke(d.f.a);
                }
                break;
            default:
                n2j n2jVar = (n2j) obj2;
                LoadingState loadingState = (LoadingState) obj;
                fo2 fo2Var4 = n2jVar.W;
                if (fo2Var4 != null) {
                    fo2Var4.k(false);
                }
                HTTPResponse hTTPResponse = (HTTPResponse) loadingState.getData();
                Unit unit = null;
                List<FHBetHistoryItem> list = hTTPResponse != null ? (List) hTTPResponse.getData() : null;
                HTTPResponse hTTPResponse2 = (HTTPResponse) loadingState.getData();
                Integer total = hTTPResponse2 != null ? hTTPResponse2.getTotal() : null;
                if (list != null && total != null) {
                    if (list.isEmpty() && total.intValue() <= 0 && (fo2Var2 = n2jVar.W) != null && fo2Var2.f().getChildCount() == 0 && (fo2Var3 = n2jVar.W) != null) {
                        fo2Var3.l();
                    }
                    PagingState pagingStateD = n2jVar.t0().S.d();
                    if (pagingStateD == null) {
                        fo2Var = n2jVar.W;
                        if (fo2Var != null) {
                            fo2Var.j(list, total, 0, 0, PagingFetchType.VIEW_MORE);
                        }
                    } else {
                        fo2 fo2Var5 = n2jVar.W;
                        if (fo2Var5 != null) {
                            fo2Var5.j(list, total, pagingStateD.getOffset(), pagingStateD.getLimit(), pagingStateD.getType());
                            unit = Unit.a;
                        }
                        if (unit == null) {
                            fo2Var = n2jVar.W;
                            if (fo2Var != null) {
                                fo2Var.j(list, total, 0, 0, PagingFetchType.VIEW_MORE);
                            }
                        }
                    }
                }
                break;
        }
        return Unit.a;
    }
}
