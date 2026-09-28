package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.sportybet.android.gp.tz.R;
import com.sportybet.plugin.realsports.quickmarket.data.MarketGroupData;
import com.sportybet.plugin.realsports.quickmarket.data.MarketGroupDict;
import com.sportybet.plugin.realsports.quickmarket.data.MarketItemResourceData;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class di30 extends RecyclerView.f<RecyclerView.d0> {
    public final ri30 a;
    public final String b;
    public final MarketItemResourceData c;
    public List<MarketGroupData> d;

    public di30(ri30 ri30Var, String str, MarketItemResourceData marketItemResourceData) {
        str.getClass();
        marketItemResourceData.getClass();
        this.a = ri30Var;
        this.b = str;
        this.c = marketItemResourceData;
        this.d = m2g.a;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.f
    public final int getItemCount() {
        return this.d.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.f
    public final int getItemViewType(int i) {
        return this.d.get(i).getViewType();
    }

    public final void i(String str) {
        str.getClass();
        for (MarketGroupData marketGroupData : this.d) {
            MarketGroupDict marketGroupDict = marketGroupData.getMarketGroupDict();
            if (marketGroupDict != null) {
                MarketGroupDict marketGroupDict2 = marketGroupData.getMarketGroupDict();
                marketGroupDict.setSelected(Intrinsics.g(str, marketGroupDict2 != null ? marketGroupDict2.getMarketId() : null));
            }
        }
        notifyDataSetChanged();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.f
    public final void onBindViewHolder(RecyclerView.d0 d0Var, int i) {
        MarketGroupDict marketGroupDict;
        d0Var.getClass();
        int itemViewType = getItemViewType(i);
        MarketItemResourceData marketItemResourceData = this.c;
        if (itemViewType == 0) {
            String groupName = this.d.get(i).getGroupName();
            if (groupName != null) {
                int itemTitleColorRes = marketItemResourceData.getItemTitleColorRes();
                hi30 hi30Var = ((vi30) d0Var).a;
                hi30Var.b.setTextColor(hi30Var.a.getContext().getColor(itemTitleColorRes));
                hi30Var.b.setText(groupName);
                return;
            }
            return;
        }
        if (itemViewType == 1 && (marketGroupDict = this.d.get(i).getMarketGroupDict()) != null) {
            mi30 mi30Var = (mi30) d0Var;
            marketItemResourceData.getClass();
            ji30 ji30Var = mi30Var.a;
            mi30Var.itemView.setTag(marketGroupDict);
            ji30Var.b.setText(marketGroupDict.getName());
            AppCompatTextView appCompatTextView = ji30Var.b;
            appCompatTextView.setTextColor(marketGroupDict.isSelected() ? ((Number) mi30Var.d.getValue()).intValue() : ((Number) mi30Var.e.getValue()).intValue());
            appCompatTextView.setBackground(mi30Var.c.getDrawable(marketItemResourceData.getItemBgRes()));
            mi30Var.itemView.setSelected(marketGroupDict.isSelected());
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.f
    public final RecyclerView.d0 onCreateViewHolder(ViewGroup viewGroup, int i) {
        viewGroup.getClass();
        if (i == 0) {
            return new vi30(hi30.a(LayoutInflater.from(viewGroup.getContext()), viewGroup));
        }
        if (i != 1) {
            return new vi30(hi30.a(LayoutInflater.from(viewGroup.getContext()), viewGroup));
        }
        View viewA = dzc.a(viewGroup, R.layout.quick_market_holder_item, viewGroup, false);
        AppCompatTextView appCompatTextView = (AppCompatTextView) h5e.a(R.id.quick_market_name, viewA);
        if (appCompatTextView != null) {
            return new mi30(new ji30((ConstraintLayout) viewA, appCompatTextView), this.a);
        }
        bmy.a("Missing required view with ID: ".concat(viewA.getResources().getResourceName(R.id.quick_market_name)));
        return null;
    }
}
