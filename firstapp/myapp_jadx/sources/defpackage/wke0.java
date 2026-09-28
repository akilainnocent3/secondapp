package defpackage;

import android.graphics.drawable.Drawable;
import com.sporty.android.common_ui.widgets.LoadingViewNew;
import com.sporty.android.core.model.MyLog;
import com.sportybet.android.gp.tz.R;
import com.sportybet.plugin.realsports.data.SwipeBetOddsFilter;
import com.sportybet.plugin.realsports.data.SwipeBetOptions;
import com.sportybet.plugin.realsports.data.SwipeBetPreference;
import com.sportybet.plugin.swipebet.activities.SwipeBetSettingActivity;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public final class wke0 implements lfy<hqc> {
    public final /* synthetic */ SwipeBetSettingActivity a;

    public wke0(SwipeBetSettingActivity swipeBetSettingActivity) {
        this.a = swipeBetSettingActivity;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.lfy
    public final void u1(hqc hqcVar) {
        hqc hqcVar2 = hqcVar;
        boolean z = hqcVar2 instanceof lqc;
        SwipeBetSettingActivity swipeBetSettingActivity = this.a;
        if (z) {
            swipeBetSettingActivity.B.d();
            return;
        }
        int i = 0;
        if (hqcVar2 instanceof kqc) {
            LoadingViewNew loadingViewNew = swipeBetSettingActivity.B;
            loadingViewNew.setVisibility(0);
            loadingViewNew.b.setVisibility(8);
            loadingViewNew.a.setVisibility(8);
            loadingViewNew.c.setVisibility(0);
            loadingViewNew.c.setText(sn5.c(loadingViewNew, R.string.common_feedback__no_items_available_for_purchase, new Object[0]));
            loadingViewNew.c.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, gr0.a(loadingViewNew.getContext(), R.drawable.no_data), (Drawable) null, (Drawable) null);
            return;
        }
        if (hqcVar2 instanceof nqc) {
            swipeBetSettingActivity.B.a();
            SwipeBetPreference swipeBetPreference = (SwipeBetPreference) ((nqc) hqcVar2).a;
            List<SwipeBetOptions> list = swipeBetPreference.leagueOptions;
            itf0.a aVar = itf0.a;
            aVar.q(MyLog.TAG_SWIPE_BET);
            aVar.a("leagueOption size = %s", Integer.valueOf(list.size()));
            ArrayList arrayList = new ArrayList();
            int size = list.size();
            int i2 = size / 5;
            if (size % 5 != 0) {
                i2++;
            }
            int i3 = 0;
            while (i3 < i2) {
                int i4 = 5 * i3;
                i3++;
                List<SwipeBetOptions> listSubList = list.subList(i4, Math.min(5 * i3, size));
                t2s t2sVar = new t2s();
                t2sVar.a = listSubList;
                arrayList.add(t2sVar);
            }
            List<SwipeBetOptions> list2 = swipeBetPreference.marketOptions;
            itf0.a aVar2 = itf0.a;
            aVar2.q(MyLog.TAG_SWIPE_BET);
            aVar2.a("marketOptions size = %s", Integer.valueOf(list2.size()));
            ArrayList arrayList2 = new ArrayList();
            int size2 = list2.size();
            int i5 = size2 / 2;
            if (size2 % 2 != 0) {
                i5++;
            }
            while (i < i5) {
                int i6 = 2 * i;
                i++;
                List<SwipeBetOptions> listSubList2 = list2.subList(i6, Math.min(2 * i, size2));
                dru druVar = new dru();
                druVar.a = listSubList2;
                arrayList2.add(druVar);
            }
            s2s s2sVar = swipeBetSettingActivity.i;
            s2sVar.b.addAll(arrayList);
            s2sVar.notifyDataSetChanged();
            cru cruVar = swipeBetSettingActivity.v;
            cruVar.b.addAll(arrayList2);
            cruVar.notifyDataSetChanged();
            SwipeBetOddsFilter swipeBetOddsFilter = swipeBetPreference.oddsFilter;
            if (swipeBetOddsFilter != null) {
                DecimalFormat decimalFormat = swipeBetSettingActivity.C;
                String[] strArr = SwipeBetSettingActivity.D;
                try {
                    itf0.a aVar3 = itf0.a;
                    aVar3.q(MyLog.TAG_SWIPE_BET);
                    aVar3.a("min = %s", Float.valueOf(swipeBetOddsFilter.min));
                    aVar3.q(MyLog.TAG_SWIPE_BET);
                    aVar3.a("max = %s", Float.valueOf(swipeBetOddsFilter.max));
                    if (swipeBetOddsFilter.max > 100.0f) {
                        swipeBetSettingActivity.d = 100.0f;
                    } else {
                        swipeBetSettingActivity.d = SwipeBetSettingActivity.A1(Arrays.asList(strArr).indexOf(decimalFormat.format(swipeBetOddsFilter.max)));
                    }
                    float fA1 = SwipeBetSettingActivity.A1(Arrays.asList(strArr).indexOf(decimalFormat.format(swipeBetOddsFilter.min)));
                    swipeBetSettingActivity.c = fA1;
                    swipeBetSettingActivity.a.setProgress(fA1, swipeBetSettingActivity.d);
                } catch (Exception unused) {
                    swipeBetSettingActivity.a.setProgress(0.0f, 100.0f);
                }
            }
        }
    }
}
