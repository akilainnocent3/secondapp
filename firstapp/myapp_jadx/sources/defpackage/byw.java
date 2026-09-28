package defpackage;

import com.sporty.android.common.network.data.BaseResponse;
import com.sportybet.plugin.realsports.data.MyFavoriteSport;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import okhttp3.Response;

/* JADX INFO: loaded from: classes6.dex */
public final class byw implements gv5<BaseResponse<List<? extends MyFavoriteSport>>> {
    public final /* synthetic */ cyw a;

    public byw(cyw cywVar) {
        this.a = cywVar;
    }

    @Override // defpackage.gv5
    public final void onFailure(su5<BaseResponse<List<? extends MyFavoriteSport>>> su5Var, Throwable th) {
        th.getClass();
        this.a.b.k(null, new kqc());
    }

    @Override // defpackage.gv5
    public final void onResponse(su5<BaseResponse<List<? extends MyFavoriteSport>>> su5Var, bi50<BaseResponse<List<? extends MyFavoriteSport>>> bi50Var) {
        Response response = bi50Var.a;
        if (!response.getIsSuccessful()) {
            onFailure(su5Var, new Exception(hce0.a(response.code(), "Error fetching sports: ")));
            return;
        }
        BaseResponse<List<? extends MyFavoriteSport>> baseResponse = bi50Var.b;
        if ((baseResponse != null ? baseResponse.data : null) == null) {
            onFailure(su5Var, new Exception("No sports data available"));
            return;
        }
        List<? extends MyFavoriteSport> list = baseResponse.data;
        ArrayList arrayListA = kw5.a(list);
        Iterator<T> it = list.iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            cyw cywVar = this.a;
            if (!zHasNext) {
                cywVar.c = arrayListA;
                cywVar.d = System.currentTimeMillis();
                cywVar.b.k(null, new nqc(cywVar.c));
                return;
            } else {
                Object next = it.next();
                if (cywVar.e.containsKey(((MyFavoriteSport) next).id)) {
                    arrayListA.add(next);
                }
            }
        }
    }
}
