package defpackage;

import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.util.Log;

/* JADX INFO: loaded from: classes4.dex */
public final class s4l0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ String b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ y4l0 f;

    public s4l0(y4l0 y4l0Var, int i, String str, Object obj, Object obj2, Object obj3) {
        this.a = i;
        this.b = str;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
        this.f = y4l0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        y4l0 y4l0Var = this.f;
        j6l0 j6l0Var = y4l0Var.a.e;
        k8l0.k(j6l0Var);
        if (!j6l0Var.b) {
            Log.println(6, y4l0Var.m(), "Persisted config not initialized. Not logging error/warn");
            return;
        }
        if (y4l0Var.c == 0) {
            wok0 wok0Var = y4l0Var.a.d;
            if (wok0Var.e == null) {
                synchronized (wok0Var) {
                    try {
                        if (wok0Var.e == null) {
                            k8l0 k8l0Var = wok0Var.a;
                            ApplicationInfo applicationInfo = k8l0Var.a.getApplicationInfo();
                            String strA = zx20.a();
                            if (applicationInfo != null) {
                                String str = applicationInfo.processName;
                                wok0Var.e = Boolean.valueOf(str != null && str.equals(strA));
                            }
                            if (wok0Var.e == null) {
                                wok0Var.e = Boolean.TRUE;
                                y4l0 y4l0Var2 = k8l0Var.f;
                                k8l0.m(y4l0Var2);
                                y4l0Var2.f.a("My process not in the list of running processes");
                            }
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
            if (wok0Var.e.booleanValue()) {
                y4l0Var.c = 'C';
            } else {
                y4l0Var.c = 'c';
            }
        }
        long j = y4l0Var.d;
        if (j < 0) {
            y4l0Var.a.d.l();
            j = 133005;
            y4l0Var.d = 133005L;
        }
        int i = this.a;
        char c = y4l0Var.c;
        String str2 = this.b;
        Object obj = this.c;
        Object obj2 = this.d;
        Object obj3 = this.e;
        char cCharAt = "01VDIWEA?".charAt(i);
        String strN = y4l0.n(true, str2, obj, obj2, obj3);
        StringBuilder sb = new StringBuilder(String.valueOf(cCharAt).length() + 1 + String.valueOf(c).length() + String.valueOf(j).length() + 1 + strN.length());
        sb.append("2");
        sb.append(cCharAt);
        sb.append(c);
        sb.append(j);
        sb.append(":");
        sb.append(strN);
        String string = sb.toString();
        if (string.length() > 1024) {
            string = str2.substring(0, 1024);
        }
        f6l0 f6l0Var = j6l0Var.e;
        if (f6l0Var != null) {
            j6l0 j6l0Var2 = f6l0Var.b;
            j6l0Var2.g();
            if (f6l0Var.b.k().getLong("health_monitor:start", 0L) == 0) {
                f6l0Var.a();
            }
            long j2 = j6l0Var2.k().getLong("health_monitor:count", 0L);
            if (j2 <= 0) {
                SharedPreferences.Editor editorEdit = j6l0Var2.k().edit();
                editorEdit.putString("health_monitor:value", string);
                editorEdit.putLong("health_monitor:count", 1L);
                editorEdit.apply();
                return;
            }
            yol0 yol0Var = j6l0Var2.a.i;
            k8l0.k(yol0Var);
            long jNextLong = yol0Var.e0().nextLong() & Long.MAX_VALUE;
            long j3 = j2 + 1;
            long j4 = Long.MAX_VALUE / j3;
            SharedPreferences.Editor editorEdit2 = j6l0Var2.k().edit();
            if (jNextLong < j4) {
                editorEdit2.putString("health_monitor:value", string);
            }
            editorEdit2.putLong("health_monitor:count", j3);
            editorEdit2.apply();
        }
    }
}
