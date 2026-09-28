package defpackage;

import android.view.View;
import com.sportybet.plugin.webcontainer.caipiao.jsplugin.JsPluginCommon;
import com.sportygames.commons.utils.CasinoLogger;
import com.sportygames.commons.views.ExitDialogActivity;
import kotlin.Pair;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class mvg implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ mvg(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                ExitDialogActivity exitDialogActivity = (ExitDialogActivity) obj;
                wz.a("ExitOnRecommendation", exitDialogActivity.d, new String[0]);
                CasinoLogger.INSTANCE.logEventToCasino("ExitOnRecommendation", vj5.a(new Pair(JsPluginCommon.GAMES_BET_PLACED_GAME_NAME_ARGUMENT, exitDialogActivity.d), new Pair("Platform", "ANDROID")));
                ((l1z) exitDialogActivity.c.getValue()).h(exitDialogActivity.e, exitDialogActivity.d);
                exitDialogActivity.setResult(-1, exitDialogActivity.getIntent());
                exitDialogActivity.finish();
                break;
            default:
                yrh0.e((String) obj);
                break;
        }
    }
}
