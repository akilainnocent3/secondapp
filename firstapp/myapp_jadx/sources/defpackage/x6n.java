package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.util.Log;
import com.google.android.gms.tasks.Tasks;
import com.sportybet.android.limits.reached.Cw.rarBonoqWB;
import java.util.Locale;
import java.util.Objects;
import java.util.UUID;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes4.dex */
public final class x6n {
    public static final Pattern g = Pattern.compile("[^\\p{Alnum}]");
    public static final String h = Pattern.quote("/");
    public final tnn a;
    public final Context b;
    public final String c;
    public final sph d;
    public final toc e;
    public yi1 f;

    public x6n(Context context, String str, sph sphVar, toc tocVar) {
        if (context == null) {
            hb5.a("appContext must not be null");
            throw null;
        }
        if (str == null) {
            hb5.a("appIdentifier must not be null");
            throw null;
        }
        this.b = context;
        this.c = str;
        this.d = sphVar;
        this.e = tocVar;
        this.a = new tnn();
    }

    public final lph b(boolean z) {
        String strA;
        mub.a aVar = mub.d;
        aVar.getClass();
        String str = null;
        if (!((Boolean) new lub(0, aVar, mub.a.class, "isNotMainThread", "isNotMainThread()Z", 0).invoke()).booleanValue()) {
            String str2 = "Must not be called on a main thread, was called on " + mub.a.a() + '.';
            if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                Log.d("FirebaseCrashlytics", str2, null);
            }
        }
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        sph sphVar = this.d;
        if (z) {
            try {
                strA = ((snn) Tasks.await(sphVar.getToken(), 10000L, timeUnit)).a();
            } catch (Exception e) {
                Log.w("FirebaseCrashlytics", "Error getting Firebase authentication token.", e);
                strA = null;
            }
        } else {
            strA = null;
        }
        try {
            str = (String) Tasks.await(sphVar.getId(), 10000L, timeUnit);
        } catch (Exception e2) {
            Log.w("FirebaseCrashlytics", "Error getting Firebase installation id.", e2);
        }
        return new lph(str, strA);
    }

    public final synchronized yi1 c() {
        String str;
        yi1 yi1Var = this.f;
        if (yi1Var != null && (yi1Var.b != null || !this.e.a())) {
            return this.f;
        }
        ngt ngtVar = ngt.a;
        ngtVar.c("Determining Crashlytics installation ID...");
        SharedPreferences sharedPreferences = this.b.getSharedPreferences("com.google.firebase.crashlytics", 0);
        String string = sharedPreferences.getString("firebase.installation.id", null);
        ngtVar.c("Cached Firebase Installation ID: " + string);
        if (this.e.a()) {
            lph lphVarB = b(false);
            ngtVar.c("Fetched Firebase Installation ID: " + lphVarB.a);
            if (lphVarB.a == null) {
                if (string == null) {
                    str = "SYN_" + UUID.randomUUID().toString();
                } else {
                    str = string;
                }
                lphVarB = new lph(str, null);
            }
            if (Objects.equals(lphVarB.a, string)) {
                this.f = new yi1(sharedPreferences.getString("crashlytics.installation.id", null), lphVarB.a, lphVarB.b);
            } else {
                this.f = new yi1(a(sharedPreferences, lphVarB.a), lphVarB.a, lphVarB.b);
            }
        } else if (string == null || !string.startsWith("SYN_")) {
            this.f = new yi1(a(sharedPreferences, "SYN_" + UUID.randomUUID().toString()), null, null);
        } else {
            this.f = new yi1(sharedPreferences.getString("crashlytics.installation.id", null), null, null);
        }
        ngtVar.c("Install IDs: " + this.f);
        return this.f;
    }

    public final String d() {
        String str;
        tnn tnnVar = this.a;
        Context context = this.b;
        synchronized (tnnVar) {
            try {
                String str2 = (String) tnnVar.a;
                if (str2 == null) {
                    String installerPackageName = context.getPackageManager().getInstallerPackageName(context.getPackageName());
                    if (installerPackageName == null) {
                        installerPackageName = "";
                    }
                    str2 = installerPackageName;
                    tnnVar.a = str2;
                }
                str = "".equals(str2) ? null : (String) tnnVar.a;
            } catch (Throwable th) {
                throw th;
            }
        }
        return str;
    }

    public final synchronized String a(SharedPreferences sharedPreferences, String str) {
        String lowerCase;
        lowerCase = g.matcher(UUID.randomUUID().toString()).replaceAll("").toLowerCase(Locale.US);
        String str2 = "Created new Crashlytics installation ID: " + lowerCase + " for FID: " + str;
        if (Log.isLoggable("FirebaseCrashlytics", 2)) {
            Log.v("FirebaseCrashlytics", str2, null);
        }
        sharedPreferences.edit().putString(rarBonoqWB.TtH, lowerCase).putString("firebase.installation.id", str).apply();
        return lowerCase;
    }
}
