package defpackage;

import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.widget.RemoteViews;
import com.sporty.android.core.model.service.CountryCodeName;
import com.sportybet.android.gp.tz.R;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes5.dex */
public final class vbe0 implements tbe0 {
    public final zdd0 a;
    public final AtomicInteger b = new AtomicInteger((int) System.currentTimeMillis());
    public final j1b c;

    public vbe0(zdd0 zdd0Var) {
        this.a = zdd0Var;
        pfd pfdVar = fse.a;
        this.c = w5b.a(odd.b);
    }

    @Override // defpackage.tbe0
    public final void a(Context context, ox0 ox0Var, CountryCodeName countryCodeName, String str) {
        context.getClass();
        countryCodeName.getClass();
        ej5.c(this.c, null, null, new ube0(this, context, ox0Var, countryCodeName, str, null), 3);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void b(Context context, ox0 ox0Var, CountryCodeName countryCodeName, String str) {
        String str2 = (String) ox0Var.get("title");
        if (str2 == null) {
            str2 = "";
        }
        String str3 = (String) ox0Var.get("templateType");
        String str4 = str3 != null ? str3 : "";
        ncf0[] ncf0VarArr = ncf0.a;
        if (str4.equals("1000")) {
            int iIncrementAndGet = this.b.incrementAndGet();
            Uri uriBuild = Uri.parse(str).buildUpon().path(countryCodeName.getCode() + "/applink/tv-streams").appendQueryParameter("from", "notification").build();
            uriBuild.getClass();
            int i = Build.VERSION.SDK_INT;
            if (i >= 26) {
                Object systemService = context.getSystemService("notification");
                systemService.getClass();
                yo50.a();
                ((NotificationManager) systemService).createNotificationChannel(new NotificationChannel("sporty_tv_channel", sn5.b(context, R.string.sporty_tv__sporty_tv, new Object[0]), 4));
            }
            g1y g1yVar = new g1y(context, "sporty_tv_channel");
            g1yVar.w.icon = R.drawable.ic_notification;
            RemoteViews remoteViews = new RemoteViews(context.getPackageName(), R.layout.spm_tv_favorite_notification);
            remoteViews.setTextViewText(R.id.push_content, str2);
            g1yVar.s = remoteViews;
            g1yVar.c(-1);
            g1yVar.q = context.getColor(R.color.brand_primary);
            Intent intent = new Intent();
            intent.setPackage(context.getPackageName());
            intent.setAction(context.getPackageName() + ".ACTION_ROUTE_FROM_HOME");
            intent.addFlags(268435456);
            intent.setData(uriBuild);
            PendingIntent activity = PendingIntent.getActivity(context, iIncrementAndGet, intent, i >= 31 ? 201326592 : 134217728);
            activity.getClass();
            g1yVar.g = activity;
            g1yVar.j = 1;
            g1yVar.c(-1);
            g1yVar.d(16, true);
            if (i >= 31) {
                g1yVar.f(new i1y());
            }
            new t2y(context).a(iIncrementAndGet, g1yVar.a());
        }
    }
}
