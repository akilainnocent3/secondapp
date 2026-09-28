package defpackage;

import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;
import com.sportybet.plugin.realsports.data.FeaturedMatch;
import com.sportybet.plugin.realsports.data.FeaturedTab;
import com.sportybet.plugin.realsports.home.featuredsection.FeaturedContainer;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public final class sdh extends ViewPager2.g {
    public final /* synthetic */ ydh a;
    public final /* synthetic */ FeaturedContainer b;

    public sdh(ydh ydhVar, FeaturedContainer featuredContainer) {
        this.a = ydhVar;
        this.b = featuredContainer;
    }

    @Override // androidx.viewpager2.widget.ViewPager2.g
    public final void b(float f, int i, int i2) {
        List<T> list;
        FeaturedMatch featuredMatch;
        String id;
        ogh tabAdapter;
        Collection collection;
        Object next;
        String id2;
        if (i2 != 0) {
            return;
        }
        ydh ydhVar = this.a;
        ViewPager2 viewPager2 = ydhVar.v;
        ViewPager2 viewPager3 = ydhVar.v;
        RecyclerView.f adapter = viewPager2.getAdapter();
        if (adapter == null) {
            return;
        }
        if (i == 0) {
            viewPager3.setCurrentItem(adapter.getItemCount() - 2, false);
            return;
        }
        if (i == adapter.getItemCount() - 1) {
            viewPager3.setCurrentItem(1, false);
            return;
        }
        FeaturedContainer featuredContainer = this.b;
        int i3 = featuredContainer.S;
        if (i3 == -1 || i == i3) {
            featuredContainer.S = -1;
            weh matchAdapter = featuredContainer.getMatchAdapter();
            if (matchAdapter == null || (list = matchAdapter.a.f) == 0 || (featuredMatch = (FeaturedMatch) list.get(i)) == null || (id = featuredMatch.getId()) == null || (tabAdapter = featuredContainer.getTabAdapter()) == null || (collection = tabAdapter.a.f) == null) {
                return;
            }
            Iterator it = collection.iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (!((FeaturedTab) next).isSelected());
            FeaturedTab featuredTab = (FeaturedTab) next;
            if (featuredTab == null || (id2 = featuredTab.getId()) == null || id.equals(id2)) {
                return;
            }
            featuredContainer.U(id);
        }
    }
}
