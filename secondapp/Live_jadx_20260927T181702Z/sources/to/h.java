package to;

import android.R;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.provider.Settings;
import android.util.Log;
import android.widget.Toast;
import androidx.core.app.NotificationCompat;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @oy.l
    public static final h f137116a = new h();

    public static final void d(Context context, DialogInterface dialogInterface, int i10) {
        try {
            Intent intent = new Intent("android.settings.APPLICATION_DEVELOPMENT_SETTINGS");
            if (intent.resolveActivity(context.getPackageManager()) != null) {
                context.startActivity(intent);
            } else {
                Toast.makeText(context, "Developer options not available on this device", 0).show();
            }
        } catch (Exception e10) {
            Log.d("Exception", NotificationCompat.CATEGORY_MESSAGE + e10.getMessage());
        }
    }

    public final boolean b(@oy.m Context context) {
        if (Settings.Secure.getInt(context != null ? context.getContentResolver() : null, "adb_enabled", 0) != 1) {
            return false;
        }
        c(context);
        return true;
    }

    public final void c(final Context context) {
        if (context != null) {
            try {
                new androidx.appcompat.app.c.a(context).e(R.drawable.ic_dialog_alert).setTitle("Error!").b(false).l(context.getString(com.sports.live.football.tv.a.m.F0)).y("Goto Disable", new DialogInterface.OnClickListener() { // from class: to.g
                    @Override // android.content.DialogInterface.OnClickListener
                    public final void onClick(DialogInterface dialogInterface, int i10) {
                        h.d(context, dialogInterface, i10);
                    }
                }).I();
            } catch (Exception e10) {
                Log.d("Exception", NotificationCompat.CATEGORY_MESSAGE + e10.getMessage());
            }
        }
    }
}
