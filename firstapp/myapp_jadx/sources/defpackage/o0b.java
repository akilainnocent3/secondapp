package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.ColorStateList;
import android.os.Build;
import android.os.Handler;
import android.os.Process;
import android.text.TextUtils;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public class o0b {

    public static class a {
        public static Intent a(Context context, BroadcastReceiver broadcastReceiver, IntentFilter intentFilter) {
            return context.registerReceiver(broadcastReceiver, intentFilter, null, null, 0);
        }

        public static void b(Context context, Intent intent) {
            context.startForegroundService(intent);
        }
    }

    public static class b {
        public static Executor a(Context context) {
            return context.getMainExecutor();
        }
    }

    public static class c {
        public static Intent a(Context context, BroadcastReceiver broadcastReceiver, IntentFilter intentFilter) {
            return context.registerReceiver(broadcastReceiver, intentFilter, null, null, 2);
        }
    }

    public static int a(Context context, String str) {
        if (str == null) {
            bmy.a("permission must be non-null");
            return 0;
        }
        if (Build.VERSION.SDK_INT >= 33 || !TextUtils.equals("android.permission.POST_NOTIFICATIONS", str)) {
            return context.checkPermission(str, Process.myPid(), Process.myUid());
        }
        return new t2y(context).b.areNotificationsEnabled() ? 0 : -1;
    }

    public static ColorStateList b(Context context, int i) {
        return th50.a(i, context.getTheme(), context.getResources());
    }

    public static Executor c(Context context) {
        return Build.VERSION.SDK_INT >= 28 ? b.a(context) : new ytg(new Handler(context.getMainLooper()));
    }

    public static void d(Context context, BroadcastReceiver broadcastReceiver, IntentFilter intentFilter) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 33) {
            c.a(context, broadcastReceiver, intentFilter);
        } else if (i >= 26) {
            a.a(context, broadcastReceiver, intentFilter);
        } else {
            context.registerReceiver(broadcastReceiver, intentFilter, null, null);
        }
    }
}
