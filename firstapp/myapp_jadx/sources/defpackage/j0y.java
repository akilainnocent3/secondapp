package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.viewpager.widget.ViewPager;
import com.sportybet.android.gp.tz.R;
import com.sportygames.commons.SportyGamesManager;
import com.sportygames.lobby.remote.models.GameDetails;
import com.sportygames.lobby.remote.models.NotificationResponse;
import java.util.HashMap;
import java.util.List;
import kotlin.collections.b;

/* JADX INFO: loaded from: classes7.dex */
public final class j0y extends loz {
    public final List<NotificationResponse> b;
    public final Context c;

    public j0y(Context context, List list) {
        this.b = list;
        this.c = context;
    }

    @Override // defpackage.loz
    public final void a(ViewPager viewPager, int i, Object obj) {
        viewPager.getClass();
        obj.getClass();
        viewPager.removeView((View) obj);
    }

    @Override // defpackage.loz
    public final int c() {
        List<NotificationResponse> list = this.b;
        if (list != null) {
            return list.size();
        }
        return 0;
    }

    @Override // defpackage.loz
    public final Object f(ViewPager viewPager, final int i) {
        String winAmount;
        String winAmount2;
        Context context = this.c;
        Double dValueOf = null;
        try {
            LayoutInflater layoutInflaterFrom = LayoutInflater.from(context);
            layoutInflaterFrom.getClass();
            View viewInflate = layoutInflaterFrom.inflate(R.layout.lobby_notification_item_dark, (ViewGroup) viewPager, false);
            viewInflate.getClass();
            View viewFindViewById = viewInflate.findViewById(R.id.notication_number);
            viewFindViewById.getClass();
            TextView textView = (TextView) viewFindViewById;
            View viewFindViewById2 = viewInflate.findViewById(R.id.notification_play);
            viewFindViewById2.getClass();
            TextView textView2 = (TextView) viewFindViewById2;
            op5 op5Var = op5.a;
            op5.r(op5Var, b.f(textView2), null, 4);
            textView2.setOnClickListener(new View.OnClickListener() { // from class: i0y
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    j0y j0yVar;
                    List<NotificationResponse> list;
                    NotificationResponse notificationResponse;
                    int i2 = i;
                    if (i2 < 0 || (list = (j0yVar = this).b) == null || (notificationResponse = list.get(i2)) == null) {
                        return;
                    }
                    yjj.c(new yjj(), new GameDetails(null, null, null, notificationResponse.getGameName(), null, null, null, notificationResponse.getNativeSupportVersion(), notificationResponse.getLaunchUrl(), null, notificationResponse.getLaunchTrigger(), null, null, null, null, null, notificationResponse.getMetaInfo(), null, null, null, null, false, false, null, 16710263, null), j0yVar.c, null, i2, "", null, 96);
                }
            });
            List<NotificationResponse> list = this.b;
            NotificationResponse notificationResponse = list != null ? list.get(i) : null;
            String nickName = notificationResponse != null ? notificationResponse.getNickName() : null;
            String string = context.getString(R.string.won);
            String currency = notificationResponse != null ? notificationResponse.getCurrency() : null;
            if (notificationResponse != null && (winAmount2 = notificationResponse.getWinAmount()) != null) {
                dValueOf = Double.valueOf(Double.parseDouble(winAmount2));
            }
            NotificationResponse notificationResponse2 = notificationResponse;
            textView.setText(nickName + " " + string + " " + currency + " " + qw.c(dValueOf, 12, true, context) + " in " + (notificationResponse2 != null ? notificationResponse2.getGameName() : null));
            HashMap map = new HashMap();
            map.put("{user}", String.valueOf(notificationResponse2 != null ? notificationResponse2.getNickName() : null));
            Integer numValueOf = Integer.valueOf(context.getColor(R.color.notification_money_color_dark));
            map.put("{currency}", "<b><font color=" + numValueOf + ">" + op5.i(String.valueOf(notificationResponse2 != null ? notificationResponse2.getCurrency() : null)) + "</font></b>");
            Integer numValueOf2 = Integer.valueOf(context.getColor(R.color.notification_money_color_dark));
            map.put("{amount}", "<b><font color=" + numValueOf2 + ">" + qw.c((notificationResponse2 == null || (winAmount = notificationResponse2.getWinAmount()) == null) ? null : Double.valueOf(Double.parseDouble(winAmount)), 12, true, context) + "</font></b>");
            map.put("{game}", String.valueOf(notificationResponse2 != null ? notificationResponse2.getGameName() : null));
            op5.r(op5Var, b.f(textView), map, 4);
            viewPager.addView(viewInflate);
            return viewInflate;
        } catch (Exception unused) {
            if (i == 0 && SportyGamesManager.getInstance().isSideLoading(context)) {
                SportyGamesManager.getInstance().gotoSportyBet(xae.D, null);
            }
            return new View(context);
        }
    }

    @Override // defpackage.loz
    public final boolean g(View view, Object obj) {
        view.getClass();
        obj.getClass();
        return view == obj;
    }
}
