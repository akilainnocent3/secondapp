package com.sportybet.plugin.myfavorite.fragment;

import com.sportybet.android.gp.tz.R;
import com.sportybet.plugin.myfavorite.util.MyFavoriteTypeEnum;
import defpackage.hqc;
import defpackage.jqc;
import defpackage.kqc;
import defpackage.lfy;
import defpackage.lqc;
import defpackage.nqc;
import defpackage.pvw;
import defpackage.zyf0;

/* JADX INFO: loaded from: classes6.dex */
public final class b implements lfy<hqc> {
    public final /* synthetic */ MyTeamFragment a;

    public b(MyTeamFragment myTeamFragment) {
        this.a = myTeamFragment;
    }

    @Override // defpackage.lfy
    public final void u1(hqc hqcVar) {
        hqc hqcVar2 = hqcVar;
        boolean z = hqcVar2 instanceof nqc;
        MyTeamFragment myTeamFragment = this.a;
        if (z) {
            myTeamFragment.D.a();
            myTeamFragment.H = false;
            myTeamFragment.C.B1(new pvw(null, 7));
            MyTeamFragment.a aVar = myTeamFragment.G;
            if (aVar != null) {
                aVar.b(MyFavoriteTypeEnum.TEAM);
                return;
            }
            return;
        }
        if (hqcVar2 instanceof jqc) {
            myTeamFragment.D.a();
            myTeamFragment.H = false;
        } else if (hqcVar2 instanceof kqc) {
            myTeamFragment.D.a();
            myTeamFragment.H = false;
            zyf0.a(R.string.common_feedback__something_went_wrong_please_try_again_later_thank_you);
        } else if (hqcVar2 instanceof lqc) {
            myTeamFragment.D.d();
            myTeamFragment.H = true;
        }
    }
}
