package defpackage;

import android.content.Context;
import android.util.Log;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.concurrent.atomic.AtomicReference;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public final class fk80 {
    public final Context a;
    public final am80 b;
    public final wl80 c;
    public final it5 d;
    public final ufd e;
    public final toc f;
    public final AtomicReference<aj80> g;
    public final AtomicReference<TaskCompletionSource<aj80>> h;

    public fk80(Context context, am80 am80Var, ls6 ls6Var, wl80 wl80Var, it5 it5Var, ufd ufdVar, toc tocVar) {
        AtomicReference<aj80> atomicReference = new AtomicReference<>();
        this.g = atomicReference;
        this.h = new AtomicReference<>(new TaskCompletionSource());
        this.a = context;
        this.b = am80Var;
        this.c = wl80Var;
        this.d = it5Var;
        this.e = ufdVar;
        this.f = tocVar;
        atomicReference.set(tfd.b(ls6Var));
    }

    public static void c(String str, JSONObject jSONObject) {
        String str2 = str + jSONObject.toString();
        if (Log.isLoggable("FirebaseCrashlytics", 3)) {
            Log.d("FirebaseCrashlytics", str2, null);
        }
    }

    public final aj80 a(gj80 gj80Var) throws Throwable {
        aj80 aj80Var = null;
        try {
            if (!gj80.b.equals(gj80Var)) {
                JSONObject jSONObjectA = this.d.a();
                if (jSONObjectA != null) {
                    aj80 aj80VarA = this.c.a(jSONObjectA);
                    c("Loaded cached settings: ", jSONObjectA);
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    if (gj80.c.equals(gj80Var) || aj80VarA.c >= jCurrentTimeMillis) {
                        try {
                            if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                                Log.v("FirebaseCrashlytics", "Returning cached settings.", null);
                            }
                            return aj80VarA;
                        } catch (Exception e) {
                            aj80Var = aj80VarA;
                            e = e;
                            Log.e("FirebaseCrashlytics", "Failed to get cached settings", e);
                            return aj80Var;
                        }
                    }
                    if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                        Log.v("FirebaseCrashlytics", "Cached settings have expired.", null);
                        return null;
                    }
                } else if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                    Log.d("FirebaseCrashlytics", "No cached settings data found.", null);
                }
            }
            return null;
        } catch (Exception e2) {
            e = e2;
        }
    }

    public final aj80 b() {
        return this.g.get();
    }
}
