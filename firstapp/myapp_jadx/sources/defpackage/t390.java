package defpackage;

import android.content.SharedPreferences;
import android.text.TextUtils;
import android.util.Log;
import java.util.ArrayDeque;
import java.util.concurrent.ScheduledThreadPoolExecutor;

/* JADX INFO: loaded from: classes4.dex */
public final class t390 {
    public final SharedPreferences a;
    public final ArrayDeque<String> b = new ArrayDeque<>();
    public final ScheduledThreadPoolExecutor c;

    public t390(SharedPreferences sharedPreferences, ScheduledThreadPoolExecutor scheduledThreadPoolExecutor) {
        this.a = sharedPreferences;
        this.c = scheduledThreadPoolExecutor;
    }

    public static t390 a(SharedPreferences sharedPreferences, ScheduledThreadPoolExecutor scheduledThreadPoolExecutor) {
        t390 t390Var = new t390(sharedPreferences, scheduledThreadPoolExecutor);
        synchronized (t390Var.b) {
            try {
                t390Var.b.clear();
                String string = t390Var.a.getString("topic_operation_queue", "");
                if (!TextUtils.isEmpty(string) && string.contains(",")) {
                    String[] strArrSplit = string.split(",", -1);
                    if (strArrSplit.length == 0) {
                        Log.e("FirebaseMessaging", "Corrupted queue. Please check the queue contents and item separator provided");
                    }
                    for (String str : strArrSplit) {
                        if (!TextUtils.isEmpty(str)) {
                            t390Var.b.add(str);
                        }
                    }
                    return t390Var;
                }
                return t390Var;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
