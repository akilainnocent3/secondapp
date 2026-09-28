package com.sportygames.sportysoccer.activities;

import android.app.Dialog;
import android.text.TextUtils;
import android.view.View;
import com.sportybet.android.gp.tz.R;
import com.sportygames.sportysoccer.model.OngoingGameSessionData;
import defpackage.qke;
import defpackage.su5;

/* JADX INFO: loaded from: classes8.dex */
public final class c extends a.C0449a<OngoingGameSessionData> {
    public final /* synthetic */ GameModeActivity e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(GameModeActivity gameModeActivity, a aVar) {
        super(aVar);
        this.e = gameModeActivity;
    }

    @Override // com.sportygames.sportysoccer.activities.a.C0449a, defpackage.y3l
    public final void p(su5 su5Var, Object obj) {
        OngoingGameSessionData ongoingGameSessionData = (OngoingGameSessionData) obj;
        GameModeActivity gameModeActivity = this.e;
        if (gameModeActivity.B) {
            return;
        }
        try {
            super.p(su5Var, ongoingGameSessionData);
            gameModeActivity.y1();
            if (TextUtils.isEmpty(ongoingGameSessionData.getId()) || gameModeActivity.getSupportFragmentManager().K) {
                return;
            }
            try {
                final Dialog dialog = new Dialog(gameModeActivity.A);
                View.OnClickListener onClickListener = new View.OnClickListener() { // from class: ylj
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        this.a.e.v.callOnClick();
                        dialog.dismiss();
                    }
                };
                View.OnClickListener onClickListener2 = new View.OnClickListener() { // from class: zlj
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        dialog.dismiss();
                    }
                };
                GameModeActivity gameModeActivity2 = gameModeActivity.A;
                qke.a(gameModeActivity2.getString(R.string.sg_common_functions_continue), gameModeActivity2.getString(R.string.sg_common_functions_close), gameModeActivity2.getString(R.string.sg_sporty_soccer_unfinished_game), gameModeActivity2.getString(R.string.sg_sporty_soccer_unfinished_game_msg, String.valueOf(14)), onClickListener, onClickListener2, true, dialog, R.drawable.sg_err_btn_bg, onClickListener2, 0);
            } catch (Exception unused) {
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
