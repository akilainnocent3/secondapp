package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import com.sportybet.android.gp.tz.R;
import com.sportybet.plugin.realsports.activities.PreMatchEventActivity;
import com.sportybet.plugin.realsports.data.Event;
import com.sportybet.plugin.realsports.data.Sport;
import com.sportybet.plugin.realsports.event.PreMatchEventAdapter;
import com.sportybet.plugin.realsports.event.viewholder.NoVisibleMarketsViewHolder;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class pd20 implements NoVisibleMarketsViewHolder.a {
    public final /* synthetic */ PreMatchEventActivity a;

    public pd20(PreMatchEventActivity preMatchEventActivity) {
        this.a = preMatchEventActivity;
    }

    @Override // com.sportybet.plugin.realsports.event.viewholder.NoVisibleMarketsViewHolder.a
    public final boolean a() {
        PreMatchEventAdapter preMatchEventAdapter;
        int i = PreMatchEventActivity.a2;
        PreMatchEventActivity preMatchEventActivity = this.a;
        return ((preMatchEventActivity.L1() && preMatchEventActivity.y1.length() == 0) || (preMatchEventAdapter = preMatchEventActivity.A0) == null || preMatchEventAdapter.hasVisibleMarkets()) ? false : true;
    }

    @Override // com.sportybet.plugin.realsports.event.viewholder.NoVisibleMarketsViewHolder.a
    public final String b(Context context) {
        context.getClass();
        PreMatchEventActivity preMatchEventActivity = this.a;
        if (preMatchEventActivity.x0 == 0 && preMatchEventActivity.O0 > 0) {
            return preMatchEventActivity.getCMSString(R.string.live__no_favourite, new Object[0]);
        }
        if (preMatchEventActivity.L1()) {
            return hhy.b(preMatchEventActivity.z1) ? preMatchEventActivity.getCMSString(R.string.common_feedback__sorry_no_market_search_filter_result, new Object[0]) : preMatchEventActivity.getCMSString(R.string.common_feedback__sorry_no_market_search_result, new Object[0]);
        }
        return preMatchEventActivity.getCMSString(R.string.live__empty3, new Object[0]);
    }

    @Override // com.sportybet.plugin.realsports.event.viewholder.NoVisibleMarketsViewHolder.a
    public final Drawable c(Context context) {
        context.getClass();
        PreMatchEventActivity preMatchEventActivity = this.a;
        if (preMatchEventActivity.x0 == 0) {
            return gr0.a(preMatchEventActivity, R.drawable.spr_fav_prematch_tip);
        }
        if (preMatchEventActivity.L1()) {
            return gr0.a(preMatchEventActivity, R.drawable.ic_info_error);
        }
        return null;
    }

    @Override // com.sportybet.plugin.realsports.event.viewholder.NoVisibleMarketsViewHolder.a
    public final boolean d() {
        Sport sport;
        Event event = this.a.S;
        return Intrinsics.g((event == null || (sport = event.sport) == null) ? null : sport.id, "sr:sport:202120001");
    }
}
