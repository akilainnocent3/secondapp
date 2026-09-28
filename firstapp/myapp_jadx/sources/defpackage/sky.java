package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.sporty.android.common_ui.uitext.UiText;
import com.sportybet.android.gp.tz.R;
import com.sportybet.android.multimaker.presentation.widget.view.MultiMakerOddsHeaderView;
import com.sportybet.android.multimaker.presentation.widget.view.MultiMakerOddsRangeSeekBarSelectionOdds;
import com.sportybet.android.multimaker.presentation.widget.view.MultiMakerOddsRangeSeekBarTotalOdds;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes4.dex */
public final class sky {
    public final int a;
    public final pid0 b;
    public final mpe0 c;
    public Function0<Unit> d;
    public gaj<? super mhw, ? super lhw, ? super UiText, Unit> e;
    public Function0<ohw> f;
    public final wwd0 g;

    public sky(Context context, int i) {
        this.a = i;
        int i2 = 0;
        View viewInflate = LayoutInflater.from(context).inflate(R.layout.spr_multi_maker_odds_range_popup_view, (ViewGroup) null, false);
        int i3 = R.id.apply;
        TextView textView = (TextView) h5e.a(R.id.apply, viewInflate);
        if (textView != null) {
            i3 = R.id.cancel;
            TextView textView2 = (TextView) h5e.a(R.id.cancel, viewInflate);
            if (textView2 != null) {
                i3 = R.id.multi_maker_odds_header;
                MultiMakerOddsHeaderView multiMakerOddsHeaderView = (MultiMakerOddsHeaderView) h5e.a(R.id.multi_maker_odds_header, viewInflate);
                if (multiMakerOddsHeaderView != null) {
                    i3 = R.id.select_odds_range_view;
                    MultiMakerOddsRangeSeekBarSelectionOdds multiMakerOddsRangeSeekBarSelectionOdds = (MultiMakerOddsRangeSeekBarSelectionOdds) h5e.a(R.id.select_odds_range_view, viewInflate);
                    if (multiMakerOddsRangeSeekBarSelectionOdds != null) {
                        i3 = R.id.total_odds_range_view;
                        MultiMakerOddsRangeSeekBarTotalOdds multiMakerOddsRangeSeekBarTotalOdds = (MultiMakerOddsRangeSeekBarTotalOdds) h5e.a(R.id.total_odds_range_view, viewInflate);
                        if (multiMakerOddsRangeSeekBarTotalOdds != null) {
                            this.b = new pid0((ConstraintLayout) viewInflate, textView, textView2, multiMakerOddsHeaderView, multiMakerOddsRangeSeekBarSelectionOdds, multiMakerOddsRangeSeekBarTotalOdds);
                            this.c = hwr.b(new pmf(this, 2));
                            this.d = new jky();
                            this.e = new kky();
                            this.f = new lky(i2);
                            this.g = xwd0.a(new ohw(0));
                            return;
                        }
                    }
                }
            }
        }
        bmy.a("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i3)));
        throw null;
    }

    public final mhw a() {
        return ((ohw) this.g.getValue()).b;
    }
}
