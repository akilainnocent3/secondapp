package defpackage;

import android.R;
import android.app.Activity;
import android.app.AlertDialog;
import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.Resources;
import android.os.Bundle;
import android.util.Log;
import android.util.TypedValue;
import androidx.core.graphics.drawable.IconCompat;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.e;
import com.google.android.gms.common.api.GoogleApiActivity;
import com.google.errorprone.annotations.RestrictedInheritance;
import com.google.errorprone.annotations.ResultIgnorabilityUnspecified;

/* JADX INFO: loaded from: classes4.dex */
@RestrictedInheritance(allowedOnPath = ".*java.*/com/google/android/gms.*", allowlistAnnotations = {ohk0.class, whk0.class}, explanation = "Sub classing of GMS Core's APIs are restricted to GMS Core client libs and testing fakes.", link = "go/gmscore-restrictedinheritance")
public class v4l extends w4l {
    public static final Object c = new Object();
    public static final v4l d = new v4l();

    public static AlertDialog e(Activity activity, int i, fik0 fik0Var, DialogInterface.OnCancelListener onCancelListener) {
        String string;
        if (i == 0) {
            return null;
        }
        TypedValue typedValue = new TypedValue();
        activity.getTheme().resolveAttribute(R.attr.alertDialogTheme, typedValue, true);
        AlertDialog.Builder builder = "Theme.Dialog.Alert".equals(activity.getResources().getResourceEntryName(typedValue.resourceId)) ? new AlertDialog.Builder(activity, 5) : null;
        if (builder == null) {
            builder = new AlertDialog.Builder(activity);
        }
        builder.setMessage(sgk0.b(activity, i));
        if (onCancelListener != null) {
            builder.setOnCancelListener(onCancelListener);
        }
        Resources resources = activity.getResources();
        if (i == 1) {
            string = resources.getString(com.sportybet.android.gp.tz.R.string.common_google_play_services_install_button);
        } else if (i != 2) {
            string = i != 3 ? resources.getString(R.string.ok) : resources.getString(com.sportybet.android.gp.tz.R.string.common_google_play_services_enable_button);
        } else {
            string = resources.getString(com.sportybet.android.gp.tz.R.string.common_google_play_services_update_button);
        }
        if (string != null) {
            if (fik0Var == null) {
                fik0Var = null;
            }
            builder.setPositiveButton(string, fik0Var);
        }
        String strC = sgk0.c(activity, i);
        if (strC != null) {
            builder.setTitle(strC);
        }
        Log.w("GoogleApiAvailability", hce0.a(i, "Creating dialog for Google Play services availability issue. ConnectionResult="), new IllegalArgumentException());
        return builder.create();
    }

    public static void f(Activity activity, AlertDialog alertDialog, String str, DialogInterface.OnCancelListener onCancelListener) {
        try {
            if (activity instanceof e) {
                FragmentManager supportFragmentManager = ((e) activity).getSupportFragmentManager();
                qfe0 qfe0Var = new qfe0();
                hm20.i(alertDialog, "Cannot display null dialog");
                alertDialog.setOnCancelListener(null);
                alertDialog.setOnDismissListener(null);
                qfe0Var.a = alertDialog;
                if (onCancelListener != null) {
                    qfe0Var.b = onCancelListener;
                }
                qfe0Var.show(supportFragmentManager, str);
                return;
            }
        } catch (NoClassDefFoundError unused) {
        }
        android.app.FragmentManager fragmentManager = activity.getFragmentManager();
        ybg ybgVar = new ybg();
        hm20.i(alertDialog, "Cannot display null dialog");
        alertDialog.setOnCancelListener(null);
        alertDialog.setOnDismissListener(null);
        ybgVar.a = alertDialog;
        if (onCancelListener != null) {
            ybgVar.b = onCancelListener;
        }
        ybgVar.show(fragmentManager, str);
    }

    @Override // defpackage.w4l
    @ResultIgnorabilityUnspecified
    public final int b(Context context) {
        return c(context, w4l.a);
    }

    @ResultIgnorabilityUnspecified
    public final void d(GoogleApiActivity googleApiActivity, int i, GoogleApiActivity googleApiActivity2) {
        AlertDialog alertDialogE = e(googleApiActivity, i, fik0.b(googleApiActivity, super.a(i, googleApiActivity, "d"), 2), googleApiActivity2);
        if (alertDialogE == null) {
            return;
        }
        f(googleApiActivity, alertDialogE, "GooglePlayServicesErrorDialog", googleApiActivity2);
    }

    public final void g(Context context, int i, PendingIntent pendingIntent) {
        int i2;
        Log.w("GoogleApiAvailability", pe4.b(i, "GMS core API Availability. ConnectionResult=", ", tag=null"), new IllegalArgumentException());
        if (i == 18) {
            new rhk0(this, context).sendEmptyMessageDelayed(1, 120000L);
            return;
        }
        if (pendingIntent == null) {
            if (i == 6) {
                Log.w("GoogleApiAvailability", "Missing resolution for ConnectionResult.RESOLUTION_REQUIRED. Call GoogleApiAvailability#showErrorNotification(Context, ConnectionResult) instead.");
                return;
            }
            return;
        }
        String strE = i == 6 ? sgk0.e(context, "common_google_play_services_resolution_required_title") : sgk0.c(context, i);
        if (strE == null) {
            strE = context.getResources().getString(com.sportybet.android.gp.tz.R.string.common_google_play_services_notification_ticker);
        }
        String strD = (i == 6 || i == 19) ? sgk0.d(context, "common_google_play_services_resolution_required_text", sgk0.a(context)) : sgk0.b(context, i);
        Resources resources = context.getResources();
        Object systemService = context.getSystemService("notification");
        hm20.h(systemService);
        NotificationManager notificationManager = (NotificationManager) systemService;
        g1y g1yVar = new g1y(context, null);
        g1yVar.o = true;
        g1yVar.d(16, true);
        g1yVar.e = g1y.b(strE);
        f1y f1yVar = new f1y();
        f1yVar.e = g1y.b(strD);
        g1yVar.f(f1yVar);
        if (the.a(context)) {
            g1yVar.w.icon = context.getApplicationInfo().icon;
            g1yVar.j = 2;
            if (the.b(context)) {
                g1yVar.b.add(new d1y(IconCompat.b(null, "", 2131231372), resources.getString(com.sportybet.android.gp.tz.R.string.common_open_on_phone), pendingIntent, new Bundle(), null, true, true));
            } else {
                g1yVar.g = pendingIntent;
            }
        } else {
            g1yVar.w.icon = R.drawable.stat_sys_warning;
            g1yVar.w.tickerText = g1y.b(resources.getString(com.sportybet.android.gp.tz.R.string.common_google_play_services_notification_ticker));
            g1yVar.w.when = System.currentTimeMillis();
            g1yVar.g = pendingIntent;
            g1yVar.f = g1y.b(strD);
        }
        if (bl10.a()) {
            if (!bl10.a()) {
                fm20.a();
                return;
            }
            synchronized (c) {
            }
            NotificationChannel notificationChannel = notificationManager.getNotificationChannel("com.google.android.gms.availability");
            String string = context.getResources().getString(com.sportybet.android.gp.tz.R.string.common_google_play_services_notification_channel_name);
            if (notificationChannel == null) {
                notificationManager.createNotificationChannel(new NotificationChannel("com.google.android.gms.availability", string, 4));
            } else if (!string.contentEquals(notificationChannel.getName())) {
                notificationChannel.setName(string);
                notificationManager.createNotificationChannel(notificationChannel);
            }
            g1yVar.u = "com.google.android.gms.availability";
        }
        Notification notificationA = g1yVar.a();
        if (i == 1 || i == 2 || i == 3) {
            m5l.a.set(false);
            i2 = 10436;
        } else {
            i2 = 39789;
        }
        notificationManager.notify(i2, notificationA);
    }

    @ResultIgnorabilityUnspecified
    public final void h(Activity activity, dbs dbsVar, int i, DialogInterface.OnCancelListener onCancelListener) {
        AlertDialog alertDialogE = e(activity, i, fik0.c(dbsVar, super.a(i, activity, "d"), 2), onCancelListener);
        if (alertDialogE == null) {
            return;
        }
        f(activity, alertDialogE, "GooglePlayServicesErrorDialog", onCancelListener);
    }
}
