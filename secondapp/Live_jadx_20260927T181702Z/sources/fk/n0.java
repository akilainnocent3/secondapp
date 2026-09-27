package fk;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import androidx.annotation.NonNull;
import com.google.android.gms.tasks.Tasks;
import java.util.Locale;
import java.util.Objects;
import java.util.UUID;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes4.dex */
public class n0 implements o0 {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int f84863g = 10000;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final String f84864h = "0.0";

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final String f84865i = "crashlytics.advertising.id";

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final String f84866j = "crashlytics.installation.id";

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final String f84867k = "firebase.installation.id";

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final String f84868l = "crashlytics.installation.id";

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final String f84870n = "SYN_";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p0 f84872a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Context f84873b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f84874c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final el.k f84875d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final i0 f84876e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public o0.a f84877f;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final Pattern f84869m = Pattern.compile("[^\\p{Alnum}]");

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final String f84871o = Pattern.quote(to.c.userBaseDel);

    public n0(Context context, String str, el.k kVar, i0 i0Var) {
        if (context == null) {
            throw new IllegalArgumentException("appContext must not be null");
        }
        if (str == null) {
            throw new IllegalArgumentException("appIdentifier must not be null");
        }
        this.f84873b = context;
        this.f84874c = str;
        this.f84875d = kVar;
        this.f84876e = i0Var;
        this.f84872a = new p0();
    }

    public static String c() {
        return f84870n + UUID.randomUUID().toString();
    }

    @NonNull
    public static String e(@NonNull String str) {
        return f84869m.matcher(str).replaceAll("").toLowerCase(Locale.US);
    }

    public static boolean k(String str) {
        return str != null && str.startsWith(f84870n);
    }

    @Override // fk.o0
    @NonNull
    public synchronized o0.a a() {
        if (!n()) {
            return this.f84877f;
        }
        ck.g.f().k("Determining Crashlytics installation ID...");
        SharedPreferences sharedPreferencesR = i.r(this.f84873b);
        String string = sharedPreferencesR.getString(f84867k, null);
        ck.g.f().k("Cached Firebase Installation ID: " + string);
        if (this.f84876e.d()) {
            m0 m0VarD = d(false);
            ck.g.f().k("Fetched Firebase Installation ID: " + m0VarD.f());
            if (m0VarD.f() == null) {
                m0VarD = new m0(string == null ? c() : string, null);
            }
            if (Objects.equals(m0VarD.f(), string)) {
                this.f84877f = o0.a.a(l(sharedPreferencesR), m0VarD);
            } else {
                this.f84877f = o0.a.a(b(m0VarD.f(), sharedPreferencesR), m0VarD);
            }
        } else if (k(string)) {
            this.f84877f = o0.a.b(l(sharedPreferencesR));
        } else {
            this.f84877f = o0.a.b(b(c(), sharedPreferencesR));
        }
        ck.g.f().k("Install IDs: " + this.f84877f);
        return this.f84877f;
    }

    @NonNull
    public final synchronized String b(String str, SharedPreferences sharedPreferences) {
        String strE;
        strE = e(UUID.randomUUID().toString());
        ck.g.f().k("Created new Crashlytics installation ID: " + strE + " for FID: " + str);
        sharedPreferences.edit().putString("crashlytics.installation.id", strE).putString(f84867k, str).apply();
        return strE;
    }

    @NonNull
    public m0 d(boolean z10) {
        String strB;
        gk.n.e();
        String str = null;
        if (z10) {
            try {
                strB = ((el.p) Tasks.await(this.f84875d.b(false), 10000L, TimeUnit.MILLISECONDS)).b();
            } catch (Exception e10) {
                ck.g.f().n("Error getting Firebase authentication token.", e10);
                strB = null;
            }
        } else {
            strB = null;
        }
        try {
            str = (String) Tasks.await(this.f84875d.getId(), 10000L, TimeUnit.MILLISECONDS);
        } catch (Exception e11) {
            ck.g.f().n("Error getting Firebase installation id.", e11);
        }
        return new m0(str, strB);
    }

    public String f() {
        return this.f84874c;
    }

    public String g() {
        return this.f84872a.a(this.f84873b);
    }

    public String h() {
        return String.format(Locale.US, "%s/%s", m(Build.MANUFACTURER), m(Build.MODEL));
    }

    public String i() {
        return m(Build.VERSION.INCREMENTAL);
    }

    public String j() {
        return m(Build.VERSION.RELEASE);
    }

    public final String l(SharedPreferences sharedPreferences) {
        return sharedPreferences.getString("crashlytics.installation.id", null);
    }

    public final String m(String str) {
        return str.replaceAll(f84871o, "");
    }

    public final boolean n() {
        o0.a aVar = this.f84877f;
        if (aVar != null) {
            return aVar.e() == null && this.f84876e.d();
        }
        return true;
    }
}
