package defpackage;

import android.text.TextUtils;
import android.util.Log;

/* JADX INFO: loaded from: classes4.dex */
public final class y4l0 extends xal0 {
    public char c;
    public long d;
    public String e;
    public final u4l0 f;
    public final u4l0 g;
    public final u4l0 h;
    public final u4l0 i;
    public final u4l0 j;
    public final u4l0 k;
    public final u4l0 l;
    public final u4l0 m;
    public final u4l0 n;

    public y4l0(k8l0 k8l0Var) {
        super(k8l0Var);
        this.c = (char) 0;
        this.d = -1L;
        this.f = new u4l0(this, 6, false, false);
        this.g = new u4l0(this, 6, true, false);
        this.h = new u4l0(this, 6, false, true);
        this.i = new u4l0(this, 5, false, false);
        this.j = new u4l0(this, 5, true, false);
        this.k = new u4l0(this, 5, false, true);
        this.l = new u4l0(this, 4, false, false);
        this.m = new u4l0(this, 3, false, false);
        this.n = new u4l0(this, 2, false, false);
    }

    public static w4l0 k(String str) {
        if (str == null) {
            return null;
        }
        return new w4l0(str);
    }

    public static String n(boolean z, String str, Object obj, Object obj2, Object obj3) {
        String strO = o(obj, z);
        String strO2 = o(obj2, z);
        String strO3 = o(obj3, z);
        StringBuilder sb = new StringBuilder();
        String str2 = "";
        if (str == null) {
            str = "";
        }
        if (!TextUtils.isEmpty(str)) {
            sb.append(str);
            str2 = ": ";
        }
        String str3 = ", ";
        if (!TextUtils.isEmpty(strO)) {
            sb.append(str2);
            sb.append(strO);
            str2 = ", ";
        }
        if (TextUtils.isEmpty(strO2)) {
            str3 = str2;
        } else {
            sb.append(str2);
            sb.append(strO2);
        }
        if (!TextUtils.isEmpty(strO3)) {
            sb.append(str3);
            sb.append(strO3);
        }
        return sb.toString();
    }

    public static String o(Object obj, boolean z) {
        int iLastIndexOf;
        String className;
        int iLastIndexOf2;
        if (obj == null) {
            return "";
        }
        if (obj instanceof Integer) {
            obj = Long.valueOf(((Integer) obj).intValue());
        }
        if (obj instanceof Long) {
            if (!z) {
                return obj.toString();
            }
            Long l = (Long) obj;
            if (Math.abs(l.longValue()) < 100) {
                return obj.toString();
            }
            char cCharAt = obj.toString().charAt(0);
            String strValueOf = String.valueOf(Math.abs(l.longValue()));
            long jRound = Math.round(Math.pow(10.0d, strValueOf.length() - 1));
            long jRound2 = Math.round(Math.pow(10.0d, strValueOf.length()) - 1.0d);
            int length = String.valueOf(jRound).length();
            String str = cCharAt == '-' ? "-" : "";
            StringBuilder sb = new StringBuilder(str.length() + str.length() + length + 3 + String.valueOf(jRound2).length());
            g41.a(jRound, str, "...", sb);
            sb.append(str);
            sb.append(jRound2);
            return sb.toString();
        }
        if (obj instanceof Boolean) {
            return obj.toString();
        }
        if (!(obj instanceof Throwable)) {
            if (obj instanceof w4l0) {
                return ((w4l0) obj).a;
            }
            return z ? "-" : obj.toString();
        }
        Throwable th = (Throwable) obj;
        StringBuilder sb2 = new StringBuilder(z ? th.getClass().getName() : th.toString());
        String canonicalName = k8l0.class.getCanonicalName();
        String strSubstring = (TextUtils.isEmpty(canonicalName) || (iLastIndexOf = canonicalName.lastIndexOf(46)) == -1) ? "" : canonicalName.substring(0, iLastIndexOf);
        for (StackTraceElement stackTraceElement : th.getStackTrace()) {
            if (!stackTraceElement.isNativeMethod() && (className = stackTraceElement.getClassName()) != null) {
                if (((TextUtils.isEmpty(className) || (iLastIndexOf2 = className.lastIndexOf(46)) == -1) ? "" : className.substring(0, iLastIndexOf2)).equals(strSubstring)) {
                    sb2.append(": ");
                    sb2.append(stackTraceElement);
                    break;
                }
            }
        }
        return sb2.toString();
    }

    @Override // defpackage.xal0
    public final boolean h() {
        return false;
    }

    public final void l(int i, boolean z, boolean z2, String str, Object obj, Object obj2, Object obj3) {
        if (!z && Log.isLoggable(m(), i)) {
            Log.println(i, m(), n(false, str, obj, obj2, obj3));
        }
        if (z2 || i < 5) {
            return;
        }
        hm20.h(str);
        p7l0 p7l0Var = this.a.g;
        if (p7l0Var == null) {
            Log.println(6, m(), "Scheduler not set. Not logging error/warn");
        } else {
            if (!p7l0Var.b) {
                Log.println(6, m(), "Scheduler not initialized. Not logging error/warn");
                return;
            }
            if (i >= 9) {
                i = 8;
            }
            p7l0Var.p(new s4l0(this, i, str, obj, obj2, obj3));
        }
    }

    public final String m() {
        String str;
        synchronized (this) {
            try {
                str = this.e;
                if (str == null) {
                    this.a.d.a.getClass();
                    str = "FA";
                    this.e = "FA";
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return str;
    }
}
