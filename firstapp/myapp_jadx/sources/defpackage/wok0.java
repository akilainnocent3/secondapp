package defpackage;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.text.TextUtils;
import java.lang.reflect.InvocationTargetException;

/* JADX INFO: loaded from: classes4.dex */
public final class wok0 extends val0 {
    public Boolean b;
    public String c;
    public tok0 d;
    public Boolean e;

    public final boolean h(String str) {
        return "1".equals(this.d.f(str, "gaia_collection_enabled"));
    }

    public final boolean i(String str) {
        return "1".equals(this.d.f(str, "measurement.event_sampling_enabled"));
    }

    public final boolean j() {
        Boolean boolS = this.b;
        if (boolS == null) {
            boolS = s("app_measurement_lite");
            this.b = boolS;
            if (boolS == null) {
                boolS = Boolean.FALSE;
                this.b = boolS;
            }
        }
        return boolS.booleanValue() || !this.a.b;
    }

    public final String k(String str) {
        k8l0 k8l0Var = this.a;
        try {
            String str2 = (String) Class.forName("android.os.SystemProperties").getMethod("get", String.class, String.class).invoke(null, str, "");
            hm20.h(str2);
            return str2;
        } catch (ClassNotFoundException e) {
            y4l0 y4l0Var = k8l0Var.f;
            k8l0.m(y4l0Var);
            y4l0Var.f.b(e, "Could not find SystemProperties class");
            return "";
        } catch (IllegalAccessException e2) {
            y4l0 y4l0Var2 = k8l0Var.f;
            k8l0.m(y4l0Var2);
            y4l0Var2.f.b(e2, "Could not access SystemProperties.get()");
            return "";
        } catch (NoSuchMethodException e3) {
            y4l0 y4l0Var3 = k8l0Var.f;
            k8l0.m(y4l0Var3);
            y4l0Var3.f.b(e3, "Could not find SystemProperties.get() method");
            return "";
        } catch (InvocationTargetException e4) {
            y4l0 y4l0Var4 = k8l0Var.f;
            k8l0.m(y4l0Var4);
            y4l0Var4.f.b(e4, "SystemProperties.get() threw an exception");
            return "";
        }
    }

    public final void l() {
        this.a.getClass();
    }

    public final String m(String str, t2l0 t2l0Var) {
        return TextUtils.isEmpty(str) ? (String) t2l0Var.a(null) : (String) t2l0Var.a(this.d.f(str, t2l0Var.a));
    }

    public final long n(String str, t2l0 t2l0Var) {
        if (TextUtils.isEmpty(str)) {
            return ((Long) t2l0Var.a(null)).longValue();
        }
        String strF = this.d.f(str, t2l0Var.a);
        if (TextUtils.isEmpty(strF)) {
            return ((Long) t2l0Var.a(null)).longValue();
        }
        try {
            return ((Long) t2l0Var.a(Long.valueOf(Long.parseLong(strF)))).longValue();
        } catch (NumberFormatException unused) {
            return ((Long) t2l0Var.a(null)).longValue();
        }
    }

    public final int o(String str, t2l0 t2l0Var) {
        if (TextUtils.isEmpty(str)) {
            return ((Integer) t2l0Var.a(null)).intValue();
        }
        String strF = this.d.f(str, t2l0Var.a);
        if (TextUtils.isEmpty(strF)) {
            return ((Integer) t2l0Var.a(null)).intValue();
        }
        try {
            return ((Integer) t2l0Var.a(Integer.valueOf(Integer.parseInt(strF)))).intValue();
        } catch (NumberFormatException unused) {
            return ((Integer) t2l0Var.a(null)).intValue();
        }
    }

    public final double p(String str, t2l0 t2l0Var) {
        if (TextUtils.isEmpty(str)) {
            return ((Double) t2l0Var.a(null)).doubleValue();
        }
        String strF = this.d.f(str, t2l0Var.a);
        if (TextUtils.isEmpty(strF)) {
            return ((Double) t2l0Var.a(null)).doubleValue();
        }
        try {
            return ((Double) t2l0Var.a(Double.valueOf(Double.parseDouble(strF)))).doubleValue();
        } catch (NumberFormatException unused) {
            return ((Double) t2l0Var.a(null)).doubleValue();
        }
    }

    public final boolean q(String str, t2l0 t2l0Var) {
        if (TextUtils.isEmpty(str)) {
            return ((Boolean) t2l0Var.a(null)).booleanValue();
        }
        String strF = this.d.f(str, t2l0Var.a);
        return TextUtils.isEmpty(strF) ? ((Boolean) t2l0Var.a(null)).booleanValue() : ((Boolean) t2l0Var.a(Boolean.valueOf("1".equals(strF)))).booleanValue();
    }

    public final Bundle r() {
        k8l0 k8l0Var = this.a;
        try {
            Context context = k8l0Var.a;
            Context context2 = k8l0Var.a;
            y4l0 y4l0Var = k8l0Var.f;
            if (context.getPackageManager() == null) {
                k8l0.m(y4l0Var);
                y4l0Var.f.a("Failed to load metadata: PackageManager is null");
                return null;
            }
            ApplicationInfo applicationInfoA = r7k0.a(context2).a(128, context2.getPackageName());
            if (applicationInfoA != null) {
                return applicationInfoA.metaData;
            }
            k8l0.m(y4l0Var);
            y4l0Var.f.a("Failed to load metadata: ApplicationInfo is null");
            return null;
        } catch (PackageManager.NameNotFoundException e) {
            y4l0 y4l0Var2 = k8l0Var.f;
            k8l0.m(y4l0Var2);
            y4l0Var2.f.b(e, "Failed to load metadata: Package name not found");
            return null;
        }
    }

    public final Boolean s(String str) {
        hm20.e(str);
        Bundle bundleR = r();
        if (bundleR != null) {
            if (bundleR.containsKey(str)) {
                return Boolean.valueOf(bundleR.getBoolean(str));
            }
            return null;
        }
        y4l0 y4l0Var = this.a.f;
        k8l0.m(y4l0Var);
        y4l0Var.f.a("Failed to load metadata: Metadata bundle is null");
        return null;
    }

    public final boolean t() {
        this.a.getClass();
        Boolean boolS = s("firebase_analytics_collection_deactivated");
        return boolS != null && boolS.booleanValue();
    }

    public final boolean u() {
        Boolean boolS = s("google_analytics_automatic_screen_reporting_enabled");
        return boolS == null || boolS.booleanValue();
    }

    public final dbl0 v(String str, boolean z) {
        Object obj;
        hm20.e(str);
        Bundle bundleR = r();
        k8l0 k8l0Var = this.a;
        if (bundleR == null) {
            y4l0 y4l0Var = k8l0Var.f;
            k8l0.m(y4l0Var);
            y4l0Var.f.a("Failed to load metadata: Metadata bundle is null");
            obj = null;
        } else {
            obj = bundleR.get(str);
        }
        dbl0 dbl0Var = dbl0.UNINITIALIZED;
        if (obj == null) {
            return dbl0Var;
        }
        if (Boolean.TRUE.equals(obj)) {
            return dbl0.GRANTED;
        }
        if (Boolean.FALSE.equals(obj)) {
            return dbl0.DENIED;
        }
        if (z && "eu_consent_policy".equals(obj)) {
            return dbl0.POLICY;
        }
        y4l0 y4l0Var2 = k8l0Var.f;
        k8l0.m(y4l0Var2);
        y4l0Var2.i.b(str, "Invalid manifest metadata for");
        return dbl0Var;
    }
}
