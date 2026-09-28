package com.sportybet.plugin.myfavorite.fragment;

import com.google.android.material.tabs.TabLayout;
import com.sportybet.plugin.myfavorite.util.MyFavoriteTypeEnum;

/* JADX INFO: loaded from: classes6.dex */
public final class a implements TabLayout.d {
    public final /* synthetic */ MyStakeFragment a;

    public a(MyStakeFragment myStakeFragment) {
        this.a = myStakeFragment;
    }

    @Override // com.google.android.material.tabs.TabLayout.c
    public final void A0(TabLayout.g gVar) {
    }

    @Override // com.google.android.material.tabs.TabLayout.c
    public final void G(TabLayout.g gVar) {
        MyFavoriteTypeEnum myFavoriteTypeEnum;
        int i = gVar.e;
        MyStakeFragment myStakeFragment = this.a;
        if (i == 0) {
            myFavoriteTypeEnum = MyFavoriteTypeEnum.DEFAULT_STAKE;
            myStakeFragment.D = myFavoriteTypeEnum;
        } else {
            myFavoriteTypeEnum = MyFavoriteTypeEnum.QUICK_ADD_STAKE;
            myStakeFragment.D = myFavoriteTypeEnum;
        }
        MyStakeFragment.b bVar = myStakeFragment.C;
        if (bVar != null) {
            bVar.n(myFavoriteTypeEnum);
        }
        myStakeFragment.n0();
    }

    @Override // com.google.android.material.tabs.TabLayout.c
    public final void g0(TabLayout.g gVar) {
    }
}
