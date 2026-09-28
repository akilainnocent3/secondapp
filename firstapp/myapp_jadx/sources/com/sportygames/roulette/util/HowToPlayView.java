package com.sportygames.roulette.util;

import android.util.SparseArray;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ScrollView;
import android.widget.TextView;
import com.sporty.android.core.model.tracking.AnalyticsParam;
import com.sportybet.android.gp.tz.R;
import com.sportygames.commons.SportyGamesManager;
import com.sportygames.roulette.activities.RouletteActivity;
import com.sportygames.roulette.data.Market;
import com.sportygames.roulette.util.HowToPlayView;
import defpackage.b3;
import defpackage.fbn;
import defpackage.th8;

/* JADX INFO: loaded from: classes6.dex */
public class HowToPlayView extends FrameLayout {
    public static final /* synthetic */ int b = 0;
    public ScrollView a;

    public HowToPlayView(RouletteActivity rouletteActivity) {
        super(rouletteActivity);
        setBackgroundColor(rouletteActivity.getColor(R.color.black_05));
        View.inflate(getContext(), R.layout.sg_rut_guide, this);
        setupHowToPlayView(rouletteActivity);
    }

    private void setupHowToPlayView(RouletteActivity rouletteActivity) {
        SparseArray<Market> sparseArray;
        int i;
        Market market;
        fbn fbnVarA = th8.a();
        fbnVarA.b("https://s.sporty.net/ke/main/res/387e50312bbfd7efdb522635471a8d4a.png", (ImageView) findViewById(R.id.img_step_1));
        fbnVarA.b("https://s.sporty.net/ke/main/res/c7cf485b157a2c1d78297492dc5bfd55.png", (ImageView) findViewById(R.id.img_step_2));
        fbnVarA.b("https://s.sporty.net/ke/main/res/d4c54d23e4c3fec5c867785aef63d781.png", (ImageView) findViewById(R.id.img_step_3));
        String countryCurrency = SportyGamesManager.getInstance().getCountryCurrency();
        ((TextView) findViewById(R.id.guide_xx)).setText(rouletteActivity.getResources().getString(R.string.sg_game_roulette__guide_1, countryCurrency));
        ((TextView) findViewById(R.id.guide_yy)).setText(rouletteActivity.getResources().getString(R.string.sg_game_roulette__rut_guide_4, countryCurrency));
        int[] iArr = {R.id.market_11, R.id.market_22, R.id.market_33, R.id.market_44, R.id.market_55};
        int[] iArr2 = {R.string.sg_game_roulette__market_1, R.string.sg_game_roulette__market_2, R.string.sg_game_roulette__market_3, R.string.sg_game_roulette__market_4, R.string.sg_game_roulette__market_5};
        int i2 = 0;
        while (i2 < 5 && (sparseArray = rouletteActivity.D) != null && (market = sparseArray.get((i = i2 + 1))) != null) {
            ((TextView) findViewById(iArr[i2])).setText(rouletteActivity.getResources().getString(iArr2[i2], SportyGamesManager.getInstance().getCountryCurrency(), b3.V(market.minBetStake), b3.V(market.maxBetStake)));
            i2 = i;
        }
        findViewById(R.id.close).setOnClickListener(new View.OnClickListener() { // from class: umm
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i3 = HowToPlayView.b;
                wz.a("popup_action", "Roulette", "how to play", AnalyticsParam.STORY_SKIP_REASON_CLOSE);
                HowToPlayView howToPlayView = this.a;
                howToPlayView.animate().translationY(howToPlayView.getHeight()).setListener(new vmm(howToPlayView));
            }
        });
        this.a = (ScrollView) findViewById(R.id.scroll_guide);
    }
}
