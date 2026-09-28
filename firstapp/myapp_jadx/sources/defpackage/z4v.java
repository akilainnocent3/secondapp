package defpackage;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.e;
import com.sportybet.android.instantwin.newtork.model.response.MarketType;
import java.util.List;
import kotlin.Pair;

/* JADX INFO: loaded from: classes5.dex */
public final class z4v extends yxi {
    public final List<MarketType> y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z4v(e eVar, List<MarketType> list) {
        super(eVar);
        list.getClass();
        this.y = list;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.f
    public final int getItemCount() {
        return this.y.size();
    }

    @Override // defpackage.yxi
    public final Fragment k(int i) {
        MarketType marketType = this.y.get(i);
        marketType.getClass();
        y4v y4vVar = new y4v();
        y4vVar.setArguments(vj5.a(new Pair("ARG_MARKET_TYPE", marketType)));
        return y4vVar;
    }
}
