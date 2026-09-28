package com.sportygames.sportysoccer.activities;

import android.content.Intent;
import android.text.TextUtils;
import com.sportygames.sportysoccer.model.OngoingGameSessionData;
import com.sportygames.sportysoccer.model.TutorialStatus;
import defpackage.i0;
import defpackage.su5;

/* JADX INFO: loaded from: classes8.dex */
public final class b extends a.C0449a<TutorialStatus> {
    public final /* synthetic */ GameModeActivity e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(GameModeActivity gameModeActivity, a aVar) {
        super(aVar);
        this.e = gameModeActivity;
    }

    @Override // com.sportygames.sportysoccer.activities.a.C0449a, defpackage.y3l
    public final void p(su5 su5Var, Object obj) {
        TutorialStatus tutorialStatus = (TutorialStatus) obj;
        GameModeActivity gameModeActivity = this.e;
        if (gameModeActivity.B) {
            return;
        }
        try {
            super.p(su5Var, tutorialStatus);
            if (!tutorialStatus.isPass()) {
                gameModeActivity.startActivity(new Intent("action_from_entrance", null, gameModeActivity, TutorialActivity.class));
                gameModeActivity.finish();
            } else if (TextUtils.equals(gameModeActivity.y, "action_continue_game")) {
                gameModeActivity.y1();
                gameModeActivity.v.callOnClick();
            } else {
                su5<OngoingGameSessionData> su5VarR = gameModeActivity.b.r();
                c cVar = new c(gameModeActivity, gameModeActivity);
                gameModeActivity.v1(0);
                i0.a(su5VarR, 2, cVar);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
