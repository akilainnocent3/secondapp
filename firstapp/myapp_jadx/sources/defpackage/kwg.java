package defpackage;

import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.e;
import androidx.recyclerview.widget.RecyclerView;
import com.sporty.android.core.model.tracking.AnalyticsParam;
import com.sportybet.android.gp.tz.R;
import com.sportybet.plugin.webcontainer.caipiao.jsplugin.JsPluginCommon;
import com.sportygames.commons.utils.CasinoLogger;
import com.sportygames.commons.views.ExitDialogActivity;
import com.sportygames.commons.views.MainActivity;
import com.sportygames.lobby.remote.models.GameDetails;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Pair;
import kotlin.collections.b;

/* JADX INFO: loaded from: classes7.dex */
public final class kwg extends RecyclerView.f<mwg> {
    public final Integer a;
    public final String b;
    public final List<GameDetails> c;
    public final e d;
    public final l1z e;

    public kwg(Integer num, String str, List list, e eVar, l1z l1zVar) {
        list.getClass();
        l1zVar.getClass();
        this.a = num;
        this.b = str;
        this.c = list;
        this.d = eVar;
        this.e = l1zVar;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.f
    public final int getItemCount() {
        return this.c.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.f
    public final void onBindViewHolder(RecyclerView.d0 d0Var, final int i) {
        final mwg mwgVar = (mwg) d0Var;
        mwgVar.getClass();
        List<GameDetails> list = this.c;
        final GameDetails gameDetails = list.get(i);
        if (gameDetails != null) {
            jwg jwgVar = mwgVar.a;
            final e eVar = this.d;
            eVar.getClass();
            final l1z l1zVar = this.e;
            l1zVar.getClass();
            op5 op5Var = op5.a;
            AppCompatImageView appCompatImageView = jwgVar.c;
            TextView textView = jwgVar.d;
            ArrayList arrayListF = b.f(appCompatImageView);
            ArrayList arrayListF2 = b.f(gameDetails.getImageUrl());
            ArrayList arrayListF3 = b.f(eVar.getDrawable(R.drawable.placeholder));
            op5Var.getClass();
            op5.p(arrayListF, arrayListF2, arrayListF3, eVar);
            textView.setText(gameDetails.getName());
            textView.setSelected(true);
            op5.r(op5Var, b.f(textView), null, 4);
            CardView cardView = jwgVar.b;
            final Integer num = this.a;
            final String str = this.b;
            cardView.setOnClickListener(new View.OnClickListener() { // from class: lwg
                /* JADX WARN: Multi-variable type inference failed */
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    Activity activity = eVar;
                    if ((activity instanceof ExitDialogActivity) || (activity instanceof MainActivity)) {
                        ((nny) activity).getOnBackPressedDispatcher().d();
                    } else {
                        activity.finish();
                    }
                    GameDetails gameDetails2 = gameDetails;
                    wz.a("GameClickOnRecommendation", gameDetails2.getName(), String.valueOf(gameDetails2.getPosition()));
                    CasinoLogger casinoLogger = CasinoLogger.INSTANCE;
                    String str2 = str;
                    casinoLogger.logEventToCasino("GameClickOnRecommendation", vj5.a(new Pair(JsPluginCommon.GAMES_BET_PLACED_GAME_NAME_ARGUMENT, str2 == null ? "" : str2), new Pair("gameClicked", gameDetails2.getName()), new Pair("Platform", "ANDROID")));
                    Integer id = gameDetails2.getId();
                    String name = gameDetails2.getName();
                    l1z l1zVar2 = l1zVar;
                    l1zVar2.getClass();
                    int i2 = i + 1;
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    linkedHashMap.put("entrance", "exit_recommendation");
                    linkedHashMap.put(AnalyticsParam.EVENT_PARAM_GAME_ID, id);
                    linkedHashMap.put(AnalyticsParam.GAMES_RECOMMENDATION_GAME_NAME, name);
                    linkedHashMap.put("game_index", Integer.valueOf(i2));
                    hym.a(l1zVar2.a, "exit_recommendation__game__click", linkedHashMap, 12);
                    l1zVar2.h(num, str2);
                    yjj.c(mwgVar.b, gameDetails2, activity, null, 0, "All", null, 96);
                }
            });
            if (i == list.size() - 1) {
                ViewGroup.LayoutParams layoutParams = jwgVar.e.getLayoutParams();
                layoutParams.getClass();
                ((RecyclerView.LayoutParams) layoutParams).setMargins(0, 0, 20, 0);
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.f
    public final RecyclerView.d0 onCreateViewHolder(ViewGroup viewGroup, int i) {
        viewGroup.getClass();
        int i2 = mwg.c;
        View viewA = dzc.a(viewGroup, R.layout.exit_game_item, viewGroup, false);
        int i3 = R.id.card;
        CardView cardView = (CardView) h5e.a(R.id.card, viewA);
        if (cardView != null) {
            i3 = R.id.game_iv;
            AppCompatImageView appCompatImageView = (AppCompatImageView) h5e.a(R.id.game_iv, viewA);
            if (appCompatImageView != null) {
                i3 = R.id.game_name;
                TextView textView = (TextView) h5e.a(R.id.game_name, viewA);
                if (textView != null) {
                    i3 = R.id.layout;
                    if (((RelativeLayout) h5e.a(R.id.layout, viewA)) != null) {
                        ConstraintLayout constraintLayout = (ConstraintLayout) viewA;
                        return new mwg(new jwg(constraintLayout, cardView, appCompatImageView, textView, constraintLayout));
                    }
                }
            }
        }
        bmy.a("Missing required view with ID: ".concat(viewA.getResources().getResourceName(i3)));
        return null;
    }
}
