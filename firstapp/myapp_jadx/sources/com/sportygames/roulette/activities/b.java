package com.sportygames.roulette.activities;

import android.media.MediaPlayer;
import com.sportybet.android.gp.tz.R;
import com.sportygames.commons.SportyGamesManager;
import com.sportygames.commons.tw_commons.data.BaseResponse;
import com.sportygames.roulette.data.BetResult;
import com.sportygames.roulette.widget.TableGrid;
import defpackage.bi50;
import defpackage.bp5;
import defpackage.gco;
import defpackage.gv5;
import defpackage.ipa0;
import defpackage.jfx;
import defpackage.jx50;
import defpackage.kv1;
import defpackage.kx50;
import defpackage.lv1;
import defpackage.lx50;
import defpackage.mx50;
import defpackage.nx50;
import defpackage.su5;
import defpackage.vw50;
import defpackage.vx50;
import defpackage.xae;
import defpackage.yl5;
import java.math.BigDecimal;
import okhttp3.Response;

/* JADX INFO: loaded from: classes6.dex */
public final class b implements gv5<BaseResponse<BetResult>> {
    public final /* synthetic */ RouletteActivity a;

    public class a implements Runnable {
        public final /* synthetic */ BaseResponse a;

        public a(BaseResponse baseResponse) {
            this.a = baseResponse;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.lang.Runnable
        public final void run() {
            MediaPlayer mediaPlayer;
            RouletteActivity rouletteActivity = b.this.a;
            if (rouletteActivity.isFinishing()) {
                return;
            }
            rouletteActivity.J1(false);
            ipa0 ipa0Var = rouletteActivity.u0;
            if (ipa0Var != null && (mediaPlayer = (MediaPlayer) ipa0Var.a.get(204)) != null) {
                mediaPlayer.setVolume(0.99f, 0.99f);
            }
            rouletteActivity.L.setVisibility(8);
            BaseResponse baseResponse = this.a;
            int i = ((BetResult) baseResponse.data).winningStatus;
            if (i == 2) {
                rouletteActivity.e0 = false;
                if (rouletteActivity.Y) {
                    rouletteActivity.y1(rouletteActivity.getString(R.string.sg_game_roulette__sorry_you_lost));
                } else {
                    rouletteActivity.f0 = true;
                }
            } else if (i == 1) {
                new BigDecimal(((BetResult) baseResponse.data).winningAmount).multiply(BigDecimal.valueOf(10000L)).longValue();
                String str = ((BetResult) baseResponse.data).winningAmount;
                rouletteActivity.d0 = str;
                rouletteActivity.e0 = true;
                if (rouletteActivity.Y) {
                    rouletteActivity.T1(str);
                } else {
                    rouletteActivity.f0 = true;
                }
            }
            rouletteActivity.I = 0L;
            rouletteActivity.K1();
            for (TableGrid tableGrid : rouletteActivity.c) {
                tableGrid.f = 0L;
                tableGrid.a.clear();
                tableGrid.b();
            }
        }
    }

    public b(RouletteActivity rouletteActivity) {
        this.a = rouletteActivity;
    }

    @Override // defpackage.gv5
    public final void onFailure(su5<BaseResponse<BetResult>> su5Var, Throwable th) {
        RouletteActivity rouletteActivity = this.a;
        if (rouletteActivity.isFinishing()) {
            return;
        }
        int[] iArr = RouletteActivity.A0;
        rouletteActivity.x1();
        if (rouletteActivity.isFinishing() || rouletteActivity.isDestroyed()) {
            return;
        }
        vx50 vx50Var = new vx50(rouletteActivity);
        vx50Var.b(rouletteActivity.getString(R.string.sg_common_feedback__something_went_wrong_tip), rouletteActivity.getString(R.string.sg_common_functions__ok), null, new mx50(), new nx50());
        vx50Var.a();
        rouletteActivity.v.setVisibility(8);
    }

    @Override // defpackage.gv5
    public final void onResponse(su5<BaseResponse<BetResult>> su5Var, bi50<BaseResponse<BetResult>> bi50Var) {
        Response response = bi50Var.a;
        RouletteActivity rouletteActivity = this.a;
        if (rouletteActivity.isFinishing()) {
            return;
        }
        rouletteActivity.v.setVisibility(8);
        rouletteActivity.x1();
        if (!response.getIsSuccessful()) {
            int iCode = response.code();
            if (iCode == 401 || iCode == 403) {
                SportyGamesManager.getInstance().gotoSportyBet(xae.a, null);
                return;
            } else {
                onFailure(su5Var, null);
                return;
            }
        }
        BaseResponse<BetResult> baseResponse = bi50Var.b;
        if (baseResponse != null) {
            int i = baseResponse.bizCode;
            int i2 = 2;
            if (i == 4200) {
                if (rouletteActivity.isFinishing() || rouletteActivity.isDestroyed()) {
                    return;
                }
                vx50 vx50Var = new vx50(rouletteActivity);
                vx50Var.b(rouletteActivity.getString(R.string.sg_rut_err_8009), rouletteActivity.g0.getString(R.string.label_dialog_add_money), rouletteActivity.g0.getString(R.string.sg_common_functions__cancel), new yl5(vx50Var, i2), new vw50());
                vx50Var.a();
                return;
            }
            if (i == 4220) {
                if (rouletteActivity.isFinishing() || rouletteActivity.isDestroyed()) {
                    return;
                }
                vx50 vx50Var2 = new vx50(rouletteActivity);
                vx50Var2.b(rouletteActivity.getString(R.string.sg_game_roulette__frozen, RouletteActivity.w1()), rouletteActivity.getString(R.string.sg_common_functions__ok), null, new jx50(), new kx50());
                vx50Var2.a();
                return;
            }
            if (i != 10000) {
                if (i != 19000) {
                    if (rouletteActivity.isFinishing() || rouletteActivity.isDestroyed()) {
                        return;
                    }
                    vx50 vx50Var3 = new vx50(rouletteActivity);
                    vx50Var3.b(baseResponse.message, rouletteActivity.getString(R.string.sg_common_functions__ok), null, new jfx(1), new bp5(2));
                    vx50Var3.a();
                    return;
                }
                if (rouletteActivity.isFinishing() || rouletteActivity.isDestroyed()) {
                    return;
                }
                vx50 vx50Var4 = new vx50(rouletteActivity);
                vx50Var4.b(baseResponse.message, rouletteActivity.getString(R.string.sg_common_functions__exit), null, new gco(this, i2), new lx50());
                vx50Var4.a();
                return;
            }
            BetResult betResult = baseResponse.data;
            if (betResult != null) {
                lv1 lv1Var = rouletteActivity.G;
                BetResult betResult2 = betResult;
                String str = betResult2.result;
                boolean z = betResult2.winningStatus == 1;
                lv1Var.getClass();
                kv1 kv1Var = new kv1();
                kv1Var.a = str;
                kv1Var.b = z;
                lv1Var.a.add(0, kv1Var);
                lv1Var.notifyItemInserted(0);
                rouletteActivity.H.H0(0);
                rouletteActivity.J.setVisibility(8);
                int i3 = Integer.parseInt(baseResponse.data.result);
                rouletteActivity.M.setVisibility(4);
                rouletteActivity.N.setVisibility(4);
                if (rouletteActivity.z0 != null) {
                    rouletteActivity.Q1(Math.max(rouletteActivity.z0.balance - rouletteActivity.I, 0L), SportyGamesManager.getInstance().getCountryCurrency());
                }
                rouletteActivity.U1(i3, new a(baseResponse));
            }
        }
    }
}
