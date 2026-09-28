package defpackage;

import com.sportybet.android.gp.tz.R;
import com.sportybet.plugin.myfavorite.util.MyFavoriteTypeEnum;

/* JADX INFO: loaded from: classes6.dex */
public final class c2x implements lfy<hqc> {
    public final /* synthetic */ d2x a;

    public c2x(d2x d2xVar) {
        this.a = d2xVar;
    }

    @Override // defpackage.lfy
    public final void u1(hqc hqcVar) {
        hqc hqcVar2 = hqcVar;
        if (!(hqcVar2 instanceof nqc)) {
            if (hqcVar2 instanceof kqc) {
                zyf0.a(R.string.common_feedback__something_went_wrong_please_try_again_later_thank_you);
            }
        } else {
            d2x.a aVar = this.a.A;
            if (aVar != null) {
                aVar.b(MyFavoriteTypeEnum.ACTION_BAR_SEARCH_TEAM);
            }
        }
    }
}
