package defpackage;

import androidx.recyclerview.widget.RecyclerView;
import com.sportybet.plugin.webcontainer.caipiao.jsplugin.JsPluginCommon;
import com.sportygames.commons.utils.CasinoLogger;
import com.sportygames.commons.views.ExitDialogActivity;
import kotlin.Pair;

/* JADX INFO: loaded from: classes7.dex */
public final class ovg extends RecyclerView.s {
    public final /* synthetic */ ExitDialogActivity a;

    public ovg(ExitDialogActivity exitDialogActivity) {
        this.a = exitDialogActivity;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.s
    public final void a(RecyclerView recyclerView, int i) {
        float fComputeVerticalScrollOffset = (recyclerView.computeVerticalScrollOffset() * 100.0f) / (recyclerView.computeVerticalScrollRange() - recyclerView.computeVerticalScrollExtent());
        Float fValueOf = Float.valueOf(fComputeVerticalScrollOffset);
        ExitDialogActivity exitDialogActivity = this.a;
        if (fValueOf.equals(Float.valueOf(exitDialogActivity.i))) {
            return;
        }
        exitDialogActivity.i = fComputeVerticalScrollOffset;
        wz.a("ScrollOnRecommendation", exitDialogActivity.d, String.valueOf(fComputeVerticalScrollOffset));
        CasinoLogger.INSTANCE.logEventToCasino("ScrollOnRecommendation", vj5.a(new Pair(JsPluginCommon.GAMES_BET_PLACED_GAME_NAME_ARGUMENT, exitDialogActivity.d), new Pair("Platform", "ANDROID")));
    }
}
