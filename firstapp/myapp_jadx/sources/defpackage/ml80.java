package defpackage;

import android.content.Intent;
import androidx.fragment.app.e;
import com.sporty.android.common.network.data.BaseResponse;
import com.sportybet.android.gp.tz.R;
import com.sportybet.plugin.myfavorite.activities.MyFavoriteTutorialActivity;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public final class ml80 implements gv5<BaseResponse<List<? extends String>>> {
    public final /* synthetic */ e a;
    public final /* synthetic */ hl80 b;

    public ml80(hl80 hl80Var, e eVar) {
        this.a = eVar;
        this.b = hl80Var;
    }

    @Override // defpackage.gv5
    public final void onFailure(su5<BaseResponse<List<? extends String>>> su5Var, Throwable th) {
        th.getClass();
        zyf0.b(R.string.common_feedback__sorry_something_went_wrong, 0);
    }

    @Override // defpackage.gv5
    public final void onResponse(su5<BaseResponse<List<? extends String>>> su5Var, bi50<BaseResponse<List<? extends String>>> bi50Var) {
        if (!bi50Var.a.getIsSuccessful()) {
            zyf0.b(R.string.common_feedback__sorry_something_went_wrong, 0);
            return;
        }
        BaseResponse<List<? extends String>> baseResponse = bi50Var.b;
        if (baseResponse != null && baseResponse.hasData()) {
            List<? extends String> list = baseResponse.data;
            list.getClass();
            if (!list.isEmpty()) {
                izw.c(null);
                return;
            }
        }
        String strD = sn5.d(this.b, R.string.my_favourites_settings__my_favourites_settings, new Object[0]);
        xxw xxwVar = izw.a;
        int i = MyFavoriteTutorialActivity.i;
        e eVar = this.a;
        Intent intent = new Intent(eVar, (Class<?>) MyFavoriteTutorialActivity.class);
        intent.putExtra("from", strD);
        eVar.startActivity(intent);
    }
}
