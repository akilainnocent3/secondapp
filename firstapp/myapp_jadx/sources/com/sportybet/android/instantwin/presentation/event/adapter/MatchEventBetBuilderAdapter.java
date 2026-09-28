package com.sportybet.android.instantwin.presentation.event.adapter;

import android.content.Context;
import android.view.ViewGroup;
import androidx.compose.ui.platform.ComposeView;
import com.chad.library.adapter.base.BaseNodeAdapter;
import com.chad.library.adapter.base.entity.node.BaseNode;
import com.chad.library.adapter.base.provider.BaseNodeProvider;
import com.chad.library.adapter.base.viewholder.BaseViewHolder;
import com.sportybet.android.instantwin.newtork.model.response.BetBuilderConfig;
import com.sportybet.android.instantwin.presentation.event.adapter.viewholder.MatchEventBetBuilderViewHolder;
import com.sportybet.android.instantwin.presentation.event.adapter.viewholder.MatchEventLeagueViewHolder;
import defpackage.mpg;
import defpackage.p2s;
import java.util.List;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u001e\u0010\u0006\u001a\u00020\u00072\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u0006\u0010\u000b\u001a\u00020\u0007H\u0014R\u0010\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0082\u0004¢\u0006\u0002\n\u0000Ê\u0001\f\b\r\u0012\b\b\u000e\u0012\u0004\b\u0003\u0010\u0000¨\u0006\f"}, d2 = {"Lcom/sportybet/android/instantwin/presentation/event/adapter/MatchEventBetBuilderAdapter;", "Lcom/chad/library/adapter/base/BaseNodeAdapter;", "config", "Lcom/sportybet/android/instantwin/newtork/model/response/BetBuilderConfig;", "<init>", "(Lcom/sportybet/android/instantwin/newtork/model/response/BetBuilderConfig;)V", "getItemType", "", "data", "", "Lcom/chad/library/adapter/base/entity/node/BaseNode;", "position", "instantWin", "Landroidx/compose/runtime/internal/StabilityInferred;", "parameters"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class MatchEventBetBuilderAdapter extends BaseNodeAdapter {
    public static final int $stable = 8;
    private final BetBuilderConfig config;

    public static final class a extends BaseNodeProvider {
        @Override // com.chad.library.adapter.base.provider.BaseItemProvider
        public final void convert(BaseViewHolder baseViewHolder, BaseNode baseNode) {
            BaseNode baseNode2 = baseNode;
            baseViewHolder.getClass();
            baseNode2.getClass();
            if (baseNode2 instanceof p2s) {
                MatchEventLeagueViewHolder matchEventLeagueViewHolder = baseViewHolder instanceof MatchEventLeagueViewHolder ? (MatchEventLeagueViewHolder) baseViewHolder : null;
                if (matchEventLeagueViewHolder != null) {
                    MatchEventLeagueViewHolder.bind$default(matchEventLeagueViewHolder, (p2s) baseNode2, null, 2, null);
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
            MatchEventLeagueViewHolder.INSTANCE.getClass();
            return MatchEventLeagueViewHolder.Companion.a(viewGroup, false);
        }
    }

    public static final class b extends BaseNodeProvider {
        public b() {
        }

        @Override // com.chad.library.adapter.base.provider.BaseItemProvider
        public final void convert(BaseViewHolder baseViewHolder, BaseNode baseNode) {
            BaseNode baseNode2 = baseNode;
            baseViewHolder.getClass();
            baseNode2.getClass();
            if (baseNode2 instanceof mpg) {
                MatchEventBetBuilderViewHolder matchEventBetBuilderViewHolder = baseViewHolder instanceof MatchEventBetBuilderViewHolder ? (MatchEventBetBuilderViewHolder) baseViewHolder : null;
                if (matchEventBetBuilderViewHolder != null) {
                    matchEventBetBuilderViewHolder.bind((mpg) baseNode2, MatchEventBetBuilderAdapter.this.config);
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
            MatchEventBetBuilderViewHolder.INSTANCE.getClass();
            Context context = viewGroup.getContext();
            context.getClass();
            return new MatchEventBetBuilderViewHolder(new ComposeView(context, null, 6, 0));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public MatchEventBetBuilderAdapter(BetBuilderConfig betBuilderConfig) {
        super(null, 1, 0 == true ? 1 : 0);
        this.config = betBuilderConfig;
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
