package defpackage;

import com.google.android.material.tabs.TabLayout;
import com.sportybet.plugin.myfavorite.fragment.MyFavoriteTabBaseFragment;
import com.sportybet.plugin.myfavorite.util.MyFavoriteTypeEnum;
import com.sportybet.plugin.realsports.data.MyFavoriteSport;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes6.dex */
public final class uyw implements TabLayout.d {
    public final /* synthetic */ MyFavoriteTabBaseFragment a;

    public uyw(MyFavoriteTabBaseFragment myFavoriteTabBaseFragment) {
        this.a = myFavoriteTabBaseFragment;
    }

    @Override // com.google.android.material.tabs.TabLayout.c
    public final void G(TabLayout.g gVar) {
        int i = gVar.e;
        MyFavoriteTabBaseFragment myFavoriteTabBaseFragment = this.a;
        myFavoriteTabBaseFragment.F = i;
        myFavoriteTabBaseFragment.B.setCurrentItem(i);
        MyFavoriteTypeEnum myFavoriteTypeEnum = myFavoriteTabBaseFragment.y;
        if (myFavoriteTypeEnum == MyFavoriteTypeEnum.MARKET) {
            ArrayList arrayList = myFavoriteTabBaseFragment.E;
            if (arrayList == null || arrayList.size() <= 0 || myFavoriteTabBaseFragment.F >= myFavoriteTabBaseFragment.E.size()) {
                return;
            }
            myFavoriteTabBaseFragment.C.B1(new pvw(((MyFavoriteSport) myFavoriteTabBaseFragment.E.get(myFavoriteTabBaseFragment.F)).id, 5));
            return;
        }
        if (myFavoriteTypeEnum == MyFavoriteTypeEnum.LEAGUE) {
            iww iwwVar = myFavoriteTabBaseFragment.C;
            int i2 = myFavoriteTabBaseFragment.F;
            if (i2 == -1) {
                iwwVar.getClass();
            } else {
                iwwVar.c.m(Integer.valueOf(i2));
            }
        }
    }

    @Override // com.google.android.material.tabs.TabLayout.c
    public final void A0(TabLayout.g gVar) {
    }

    @Override // com.google.android.material.tabs.TabLayout.c
    public final void g0(TabLayout.g gVar) {
    }
}
