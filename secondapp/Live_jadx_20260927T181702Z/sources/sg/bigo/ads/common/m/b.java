package sg.bigo.ads.common.m;

import android.content.Context;
import android.content.SharedPreferences;
import androidx.annotation.NonNull;
import com.vungle.ads.internal.model.Cookie;
import sg.bigo.ads.common.utils.q;

/* JADX INFO: loaded from: classes7.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static String f133149a = "";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static int f133150b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static String f133151c = "";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static String f133152d = "";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static boolean f133153e = true;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static SharedPreferences.OnSharedPreferenceChangeListener f133154f = new SharedPreferences.OnSharedPreferenceChangeListener() { // from class: sg.bigo.ads.common.m.b.1
        @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
        public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
            if (q.a((CharSequence) str)) {
                return;
            }
            byte b10 = 0;
            sg.bigo.ads.common.t.a.a(0, 3, "GdprManager", "Listener SharedPreferenceChanged, key: ".concat(String.valueOf(str)));
            str.getClass();
            switch (str.hashCode()) {
                case -2004976699:
                    if (!str.equals("IABTCF_PurposeConsents")) {
                        b10 = -1;
                    }
                    break;
                case -464306296:
                    b10 = !str.equals("IABTCF_PurposeLegitimateInterests") ? (byte) -1 : (byte) 1;
                    break;
                case 83641339:
                    b10 = !str.equals(Cookie.IABTCF_GDPR_APPLIES) ? (byte) -1 : (byte) 2;
                    break;
                case 1218895378:
                    b10 = !str.equals("IABTCF_TCString") ? (byte) -1 : (byte) 3;
                    break;
                default:
                    b10 = -1;
                    break;
            }
            switch (b10) {
                case 0:
                    b.a(sharedPreferences);
                    break;
                case 1:
                    b.c(sharedPreferences);
                    break;
                case 2:
                    b.b(sharedPreferences);
                    break;
                case 3:
                    b.d(sharedPreferences);
                    break;
                default:
                    return;
            }
            b.h();
        }
    };

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static Context f133155g;

    public static void a(@NonNull Context context) {
        f133155g = context;
        sg.bigo.ads.common.x.a.a(context.getPackageName(), f133154f);
    }

    public static String b() {
        if (q.a((CharSequence) f133149a) && a()) {
            f133149a = sg.bigo.ads.common.x.a.e(f133155g.getPackageName());
        }
        return f133149a;
    }

    public static int c() {
        if (f133155g == null || !sg.bigo.ads.common.x.b.a()) {
            return f133150b;
        }
        f133150b = e(f133155g) ? sg.bigo.ads.common.x.a.g(f133155g.getPackageName()) : -1;
        return f133150b;
    }

    public static String d() {
        if (q.a((CharSequence) f133151c) && a()) {
            f133151c = sg.bigo.ads.common.x.a.h(f133155g.getPackageName());
        }
        return f133151c;
    }

    public static String e() {
        if (q.a((CharSequence) f133152d) && a()) {
            f133152d = sg.bigo.ads.common.x.a.f(f133155g.getPackageName());
        }
        return f133152d;
    }

    public static boolean f() {
        return f133153e;
    }

    public static void g() {
        f133153e = false;
    }

    public static /* synthetic */ boolean h() {
        f133153e = true;
        return true;
    }

    public static void a(SharedPreferences sharedPreferences) {
        if (sharedPreferences == null) {
            return;
        }
        try {
            f133149a = sharedPreferences.getString("IABTCF_PurposeConsents", "");
        } catch (Exception unused) {
            f133149a = "";
        }
    }

    public static String b(Context context) {
        return (context == null || !sg.bigo.ads.common.x.b.a()) ? f133149a : sg.bigo.ads.common.x.a.e(context.getPackageName());
    }

    public static int c(Context context) {
        return (context == null || !sg.bigo.ads.common.x.b.a()) ? f133150b : sg.bigo.ads.common.x.a.g(context.getPackageName());
    }

    public static String d(Context context) {
        return (context == null || !sg.bigo.ads.common.x.b.a()) ? f133151c : sg.bigo.ads.common.x.a.h(context.getPackageName());
    }

    public static boolean e(Context context) {
        if (context == null || !sg.bigo.ads.common.x.b.a()) {
            return false;
        }
        return sg.bigo.ads.common.x.a.a(context.getPackageName() + "_preferences", Cookie.IABTCF_GDPR_APPLIES);
    }

    public static boolean a() {
        return f133155g != null;
    }

    public static void b(SharedPreferences sharedPreferences) {
        int iIntValue;
        if (sharedPreferences == null || sharedPreferences.getAll() == null) {
            return;
        }
        Object obj = sharedPreferences.getAll().get(Cookie.IABTCF_GDPR_APPLIES);
        if (obj instanceof Integer) {
            iIntValue = ((Integer) obj).intValue();
        } else {
            if (!(obj instanceof String)) {
                return;
            }
            try {
                f133150b = Integer.parseInt((String) obj);
                return;
            } catch (Exception unused) {
                iIntValue = 0;
            }
        }
        f133150b = iIntValue;
    }

    public static void c(SharedPreferences sharedPreferences) {
        if (sharedPreferences == null) {
            return;
        }
        try {
            f133151c = sharedPreferences.getString("IABTCF_PurposeLegitimateInterests", "");
        } catch (Exception unused) {
            f133151c = "";
        }
    }

    public static void d(SharedPreferences sharedPreferences) {
        if (sharedPreferences == null) {
            return;
        }
        try {
            f133152d = sharedPreferences.getString("IABTCF_TCString", "");
        } catch (Exception unused) {
            f133152d = "";
        }
    }
}
