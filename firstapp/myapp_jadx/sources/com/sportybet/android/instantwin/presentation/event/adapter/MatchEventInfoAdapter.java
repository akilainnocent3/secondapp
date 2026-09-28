package com.sportybet.android.instantwin.presentation.event.adapter;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.compose.ui.platform.ComposeView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.chad.library.adapter.base.BaseNodeAdapter;
import com.chad.library.adapter.base.entity.node.BaseNode;
import com.chad.library.adapter.base.provider.BaseNodeProvider;
import com.chad.library.adapter.base.viewholder.BaseViewHolder;
import com.sportybet.android.gp.tz.R;
import com.sportybet.android.instantwin.presentation.event.adapter.viewholder.MatchEventInfoEventViewHolder;
import com.sportybet.android.instantwin.presentation.event.adapter.viewholder.MatchEventLeagueViewHolder;
import defpackage.a5p;
import defpackage.bmy;
import defpackage.dzc;
import defpackage.h5e;
import defpackage.mpg;
import defpackage.p2s;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u001e\u0010\t\u001a\u00020\n2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f2\u0006\u0010\u000e\u001a\u00020\nH\u0014R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000Ê\u0001\f\b\u0010\u0012\b\b\u0011\u0012\u0004\b\u0003\u0010\u0000¨\u0006\u000f"}, d2 = {"Lcom/sportybet/android/instantwin/presentation/event/adapter/MatchEventInfoAdapter;", "Lcom/chad/library/adapter/base/BaseNodeAdapter;", "showMarketGuideButton", "", "onMarketGuideClick", "Lkotlin/Function0;", "", "<init>", "(ZLkotlin/jvm/functions/Function0;)V", "getItemType", "", "data", "", "Lcom/chad/library/adapter/base/entity/node/BaseNode;", "position", "instantWin", "Landroidx/compose/runtime/internal/StabilityInferred;", "parameters"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class MatchEventInfoAdapter extends BaseNodeAdapter {
    public static final int $stable = 8;
    private final Function0<Unit> onMarketGuideClick;
    private final boolean showMarketGuideButton;

    public static final class a extends BaseNodeProvider {
        public a() {
        }

        @Override // com.chad.library.adapter.base.provider.BaseItemProvider
        public final void convert(BaseViewHolder baseViewHolder, BaseNode baseNode) {
            BaseNode baseNode2 = baseNode;
            baseViewHolder.getClass();
            baseNode2.getClass();
            if (baseNode2 instanceof p2s) {
                MatchEventLeagueViewHolder matchEventLeagueViewHolder = baseViewHolder instanceof MatchEventLeagueViewHolder ? (MatchEventLeagueViewHolder) baseViewHolder : null;
                if (matchEventLeagueViewHolder != null) {
                    matchEventLeagueViewHolder.bind((p2s) baseNode2, MatchEventInfoAdapter.this.onMarketGuideClick);
                }
            }
        }

        @Override // com.chad.library.adapter.base.provider.BaseItemProvider
        public final int getItemViewType() {
            return 0;
        }

        @Override // com.chad.library.adapter.base.provider.BaseItemProvider
        public final int getLayoutId() {
            return 0;
        }

        @Override // com.chad.library.adapter.base.provider.BaseItemProvider
        public final BaseViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
            viewGroup.getClass();
            MatchEventLeagueViewHolder.Companion companion = MatchEventLeagueViewHolder.INSTANCE;
            boolean z = MatchEventInfoAdapter.this.showMarketGuideButton;
            companion.getClass();
            return MatchEventLeagueViewHolder.Companion.a(viewGroup, z);
        }
    }

    public static final class b extends BaseNodeProvider {
        @Override // com.chad.library.adapter.base.provider.BaseItemProvider
        public final void convert(BaseViewHolder baseViewHolder, BaseNode baseNode) {
            BaseNode baseNode2 = baseNode;
            baseViewHolder.getClass();
            baseNode2.getClass();
            if (baseNode2 instanceof mpg) {
                MatchEventInfoEventViewHolder matchEventInfoEventViewHolder = baseViewHolder instanceof MatchEventInfoEventViewHolder ? (MatchEventInfoEventViewHolder) baseViewHolder : null;
                if (matchEventInfoEventViewHolder != null) {
                    matchEventInfoEventViewHolder.bind((mpg) baseNode2);
                }
            }
        }

        @Override // com.chad.library.adapter.base.provider.BaseItemProvider
        public final int getItemViewType() {
            return 1;
        }

        @Override // com.chad.library.adapter.base.provider.BaseItemProvider
        public final int getLayoutId() {
            return 0;
        }

        @Override // com.chad.library.adapter.base.provider.BaseItemProvider
        public final BaseViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
            viewGroup.getClass();
            MatchEventInfoEventViewHolder.INSTANCE.getClass();
            View viewA = dzc.a(viewGroup, R.layout.iwqk_layout_match_event_list_item, viewGroup, false);
            int i2 = R.id.composeview_away_team_rating;
            ComposeView composeView = (ComposeView) h5e.a(R.id.composeview_away_team_rating, viewA);
            if (composeView != null) {
                i2 = R.id.composeview_home_team_rating;
                ComposeView composeView2 = (ComposeView) h5e.a(R.id.composeview_home_team_rating, viewA);
                if (composeView2 != null) {
                    i2 = R.id.imageview_away_team_logo;
                    ImageView imageView = (ImageView) h5e.a(R.id.imageview_away_team_logo, viewA);
                    if (imageView != null) {
                        i2 = R.id.imageview_head_to_head_stats_icon;
                        ImageView imageView2 = (ImageView) h5e.a(R.id.imageview_head_to_head_stats_icon, viewA);
                        if (imageView2 != null) {
                            i2 = R.id.imageview_home_team_logo;
                            ImageView imageView3 = (ImageView) h5e.a(R.id.imageview_home_team_logo, viewA);
                            if (imageView3 != null) {
                                i2 = R.id.textview_away_team_name;
                                TextView textView = (TextView) h5e.a(R.id.textview_away_team_name, viewA);
                                if (textView != null) {
                                    i2 = R.id.textview_home_team_name;
                                    TextView textView2 = (TextView) h5e.a(R.id.textview_home_team_name, viewA);
                                    if (textView2 != null) {
                                        i2 = R.id.textview_market_count;
                                        TextView textView3 = (TextView) h5e.a(R.id.textview_market_count, viewA);
                                        if (textView3 != null) {
                                            i2 = R.id.textview_versus;
                                            if (((TextView) h5e.a(R.id.textview_versus, viewA)) != null) {
                                                return new MatchEventInfoEventViewHolder(new a5p((ConstraintLayout) viewA, composeView, composeView2, imageView, imageView2, imageView3, textView, textView2, textView3));
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
            bmy.a("Missing required view with ID: ".concat(viewA.getResources().getResourceName(i2)));
            return null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MatchEventInfoAdapter(boolean z, Function0<Unit> function0) {
        super(null, 1, null);
        function0.getClass();
        this.showMarketGuideButton = z;
        this.onMarketGuideClick = function0;
        addNodeProvider(new a());
        addNodeProvider(new b());
    }

    @Override // com.chad.library.adapter.base.BaseProviderMultiAdapter
    public int getItemType(List<? extends BaseNode> data, int position) {
        data.getClass();
        BaseNode baseNode = data.get(position);
        if (baseNode instanceof p2s) {
            return 0;
        }
        return baseNode instanceof mpg ? 1 : -1;
    }
}
