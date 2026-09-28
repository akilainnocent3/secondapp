package defpackage;

import com.sporty.android.common_ui.uitext.ConcatUiText;
import com.sporty.android.common_ui.uitext.ResourceUiText;
import com.sporty.android.common_ui.uitext.StringUiText;
import com.sporty.android.common_ui.uitext.UiText;
import com.sportybet.android.gp.tz.R;
import com.sportybet.android.instantwin.newtork.model.response.simulation.NetworkSimulationBetHistory;
import com.sportybet.android.instantwin.newtork.model.response.simulation.detail.NetworkSimulationTicket;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import okhttp3.internal.ws.RealWebSocket;

/* JADX INFO: loaded from: classes5.dex */
public final class w250 {
    public static String a(long j) {
        if (j <= 0) {
            return "0D 0H";
        }
        long j2 = j / 86400000;
        long j3 = (j / 3600000) % 24;
        long j4 = (j / RealWebSocket.CANCEL_AFTER_CLOSE_MILLIS) % 60;
        if (j2 > 0) {
            return j2 + "D " + j3 + "H";
        }
        return j3 + "H " + j4 + "M";
    }

    public static ConcatUiText b(long j) {
        if (j <= 0) {
            StringUiText stringUiText = vch0.a;
            return new ConcatUiText(new UiText[]{new ResourceUiText(R.string.common_dates__minutes_abbr, ay0.S(new Object[]{0})), new ResourceUiText(R.string.common_dates__seconds_abbr, ay0.S(new Object[]{0}))}, new StringUiText(" "));
        }
        long j2 = j / 86400000;
        long j3 = (j / 3600000) % 24;
        long j4 = (j / RealWebSocket.CANCEL_AFTER_CLOSE_MILLIS) % 60;
        long j5 = (j / 1000) % 60;
        if (j2 > 0) {
            Object[] objArr = {Long.valueOf(j2)};
            StringUiText stringUiText2 = vch0.a;
            return new ConcatUiText(new UiText[]{new ResourceUiText(R.string.common_dates__days_abbr, ay0.S(objArr)), new ResourceUiText(R.string.common_dates__hours_abbr, ay0.S(new Object[]{Long.valueOf(j3)})), new ResourceUiText(R.string.common_dates__minutes_abbr, ay0.S(new Object[]{Long.valueOf(j4)})), new ResourceUiText(R.string.common_dates__seconds_abbr, ay0.S(new Object[]{Long.valueOf(j5)}))}, new StringUiText(" "));
        }
        if (j3 > 0) {
            Object[] objArr2 = {Long.valueOf(j3)};
            StringUiText stringUiText3 = vch0.a;
            return new ConcatUiText(new UiText[]{new ResourceUiText(R.string.common_dates__hours_abbr, ay0.S(objArr2)), new ResourceUiText(R.string.common_dates__minutes_abbr, ay0.S(new Object[]{Long.valueOf(j4)})), new ResourceUiText(R.string.common_dates__seconds_abbr, ay0.S(new Object[]{Long.valueOf(j5)}))}, new StringUiText(" "));
        }
        Object[] objArr3 = {Long.valueOf(j4)};
        StringUiText stringUiText4 = vch0.a;
        return new ConcatUiText(new UiText[]{new ResourceUiText(R.string.common_dates__minutes_abbr, ay0.S(objArr3)), new ResourceUiText(R.string.common_dates__seconds_abbr, ay0.S(new Object[]{Long.valueOf(j5)}))}, new StringUiText(" "));
    }

    public static final fl90 c(NetworkSimulationBetHistory networkSimulationBetHistory) {
        List arrayList;
        networkSimulationBetHistory.getClass();
        int total = networkSimulationBetHistory.getTotal();
        List<NetworkSimulationTicket> data = networkSimulationBetHistory.getData();
        if (data != null) {
            arrayList = new ArrayList(l48.r(data, 10));
            Iterator<T> it = data.iterator();
            while (it.hasNext()) {
                arrayList.add(kr.b((NetworkSimulationTicket) it.next()));
            }
        } else {
            arrayList = null;
        }
        if (arrayList == null) {
            arrayList = m2g.a;
        }
        return new fl90(total, arrayList);
    }
}
