package defpackage;

import androidx.recyclerview.widget.RecyclerView;
import com.sportybet.plugin.webcontainer.caipiao.jsplugin.JsPluginCommon;
import com.sportygames.commons.utils.CasinoLogger;
import kotlin.Pair;

/* JADX INFO: loaded from: classes7.dex */
public final class rvg extends RecyclerView.s {
    public final /* synthetic */ svg a;

    public rvg(svg svgVar) {
        this.a = svgVar;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.s
    public final void a(RecyclerView recyclerView, int i) {
        float fComputeVerticalScrollOffset = (recyclerView.computeVerticalScrollOffset() * 100.0f) / (recyclerView.computeVerticalScrollRange() - recyclerView.computeVerticalScrollExtent());
        Float fValueOf = Float.valueOf(fComputeVerticalScrollOffset);
        svg svgVar = this.a;
        if (fValueOf.equals(Float.valueOf(svgVar.f))) {
            return;
        }
        svgVar.f = fComputeVerticalScrollOffset;
        wz.a("ScrollOnRecommendation", svgVar.e, String.valueOf(fComputeVerticalScrollOffset));
        CasinoLogger.INSTANCE.logEventToCasino("ScrollOnRecommendation", vj5.a(new Pair(JsPluginCommon.GAMES_BET_PLACED_GAME_NAME_ARGUMENT, svgVar.e), new Pair("Platform", "ANDROID")));
    }
}
