package defpackage;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.widget.RemoteViews;
import com.sportybet.android.gp.tz.R;
import com.sportybet.android.home.MainActivity;
import kotlin.Pair;

/* JADX INFO: loaded from: classes4.dex */
public final class b5y {
    public static PendingIntent a(Context context, int i) {
        Uri uriB;
        Intent intent = new Intent(context, (Class<?>) MainActivity.class);
        if (i != 0) {
            uriB = null;
            if (i == 1) {
                uriB = o7d.b(wae.LIVE_HOST, null);
            } else if (i == 2) {
                uriB = o7d.b(wae.RESULTS, null);
            } else if (i == 3) {
                uriB = o7d.b(wae.HOME, null);
            } else if (i == 4) {
                uriB = o7d.b(wae.v, null);
            } else if (i == 5) {
                uriB = o7d.b(wae.OPEN_BETS_IN_MAIN_TAB, null);
            }
        } else {
            uriB = o7d.b(wae.EVENT_LIST_HOST, new Pair[]{new Pair("sportId", "sr:sport:1"), new Pair("timeline", "-1")});
        }
        intent.setData(uriB);
        PendingIntent activity = PendingIntent.getActivity(context, i, intent, Build.VERSION.SDK_INT >= 31 ? 201326592 : 134217728);
        activity.getClass();
        return activity;
    }

    public static final g1y b(Context context, String str) {
        context.getClass();
        g1y g1yVar = new g1y(context, str);
        g1yVar.w.icon = R.drawable.ic_notification;
        g1yVar.q = context.getColor(R.color.brand_primary);
        return g1yVar;
    }

    public static final RemoteViews c(int i, Context context, boolean z) {
        context.getClass();
        RemoteViews remoteViews = new RemoteViews(context.getPackageName(), (Build.VERSION.SDK_INT < 31 || z) ? R.layout.custom_notification : R.layout.custom_notification_small);
        String strValueOf = i > 99 ? "99+" : String.valueOf(i);
        int i2 = i > 99 ? 8 : 12;
        remoteViews.setTextViewText(R.id.open_bets_count, strValueOf);
        remoteViews.setTextViewTextSize(R.id.open_bets_count, 1, i2);
        remoteViews.setViewVisibility(R.id.open_bets_count, i > 0 ? 0 : 8);
        remoteViews.setOnClickPendingIntent(R.id.btn_home, a(context, 3));
        remoteViews.setOnClickPendingIntent(R.id.btn_az_menu, a(context, 4));
        remoteViews.setOnClickPendingIntent(R.id.btn_today, a(context, 0));
        remoteViews.setOnClickPendingIntent(R.id.btn_live, a(context, 1));
        remoteViews.setOnClickPendingIntent(R.id.btn_result, a(context, 2));
        remoteViews.setOnClickPendingIntent(R.id.btn_open_bets, a(context, 5));
        return remoteViews;
    }
}
