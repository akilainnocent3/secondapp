package defpackage;

import android.widget.ImageView;
import android.widget.TextView;
import com.bumptech.glide.a;
import com.sportybet.android.gp.tz.R;
import com.sportygames.commons.SportyGamesManager;
import com.sportygames.commons.tw_commons.data.BaseResponse;
import com.sportygames.roulette.activities.RouletteActivity;
import com.sportygames.roulette.data.UserInfo;
import okhttp3.Response;

/* JADX INFO: loaded from: classes7.dex */
public final class rx50 implements gv5<BaseResponse<UserInfo>> {
    public final /* synthetic */ RouletteActivity a;

    public rx50(RouletteActivity rouletteActivity) {
        this.a = rouletteActivity;
    }

    @Override // defpackage.gv5
    public final void onFailure(su5<BaseResponse<UserInfo>> su5Var, Throwable th) {
        RouletteActivity rouletteActivity = this.a;
        rouletteActivity.n0.O(100);
        rouletteActivity.E1();
    }

    @Override // defpackage.gv5
    public final void onResponse(su5<BaseResponse<UserInfo>> su5Var, bi50<BaseResponse<UserInfo>> bi50Var) {
        Response response = bi50Var.a;
        boolean isSuccessful = response.getIsSuccessful();
        RouletteActivity rouletteActivity = this.a;
        if (!isSuccessful) {
            rouletteActivity.n0.O(100);
            int iCode = response.code();
            if (iCode == 401 || iCode == 403) {
                SportyGamesManager.getInstance().gotoSportyBet(xae.a, null);
                return;
            } else {
                onFailure(su5Var, null);
                return;
            }
        }
        BaseResponse<UserInfo> baseResponse = bi50Var.b;
        int i = baseResponse.bizCode;
        if (i == 4220) {
            if (rouletteActivity.isFinishing() || rouletteActivity.isDestroyed()) {
                return;
            }
            int[] iArr = RouletteActivity.A0;
            vx50 vx50Var = new vx50(rouletteActivity);
            vx50Var.b(rouletteActivity.getString(R.string.sg_game_roulette__frozen, RouletteActivity.w1()), rouletteActivity.getString(R.string.sg_common_functions__ok), null, new n3a(this, 4), new px50());
            vx50Var.a();
            return;
        }
        if (i != 10000) {
            if (i != 19000) {
                int[] iArr2 = RouletteActivity.A0;
                rouletteActivity.W1();
                return;
            } else {
                if (rouletteActivity.isFinishing() || rouletteActivity.isDestroyed()) {
                    return;
                }
                int[] iArr3 = RouletteActivity.A0;
                vx50 vx50Var2 = new vx50(rouletteActivity);
                vx50Var2.b(baseResponse.message, rouletteActivity.getString(R.string.sg_common_functions__exit), null, new t4j(this, 2), new qx50());
                vx50Var2.a();
                return;
            }
        }
        int[] iArr4 = RouletteActivity.A0;
        rouletteActivity.W1();
        UserInfo userInfo = baseResponse.data;
        if (userInfo != null) {
            UserInfo userInfo2 = userInfo;
            ((TextView) rouletteActivity.s0.findViewById(R.id.game_title)).setText("Roulette");
            ImageView imageView = (ImageView) rouletteActivity.s0.findViewById(R.id.account_icon);
            TextView textView = (TextView) rouletteActivity.s0.findViewById(R.id.user_name);
            imageView.setImageResource(2131232279);
            String str = userInfo2.name;
            if (str == null || str.isEmpty()) {
                textView.setText(rouletteActivity.g0.getString(R.string.guest_username));
            } else {
                textView.setText(userInfo2.name);
            }
            String str2 = userInfo2.avatar;
            if (str2 == null || str2.isEmpty()) {
                imageView.setImageResource(2131232710);
            } else {
                hb50 hb50VarQ = ((hb50) new hb50().z(x6f.b, new wn7())).o(2131232710).h(2131232710).e(hre.a).q(lw20.b);
                try {
                    if (RouletteActivity.B1(rouletteActivity.g0)) {
                        a.d(rouletteActivity.g0).p(userInfo2.avatar).a(hb50VarQ).M(imageView);
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
        rouletteActivity.z1(false);
    }
}
