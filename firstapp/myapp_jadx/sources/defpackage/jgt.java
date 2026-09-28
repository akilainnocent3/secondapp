package defpackage;

import android.util.Log;

/* JADX INFO: loaded from: classes.dex */
public abstract class jgt {
    public static final Object a = new Object();
    public static volatile a b;

    public static class a extends jgt {
        public final int c;

        public a(int i) {
            this.c = i;
        }

        @Override // defpackage.jgt
        public final void a(String str, String str2) {
            if (this.c <= 3) {
                Log.d(str, str2);
            }
        }

        @Override // defpackage.jgt
        public final void b(String str, String str2, Throwable th) {
            if (this.c <= 3) {
                Log.d(str, str2, th);
            }
        }

        @Override // defpackage.jgt
        public final void c(String str, String str2) {
            if (this.c <= 6) {
                Log.e(str, str2);
            }
        }

        @Override // defpackage.jgt
        public final void d(String str, String str2, Throwable th) {
            if (this.c <= 6) {
                Log.e(str, str2, th);
            }
        }

        @Override // defpackage.jgt
        public final void f(String str, String str2) {
            if (this.c <= 4) {
                Log.i(str, str2);
            }
        }

        @Override // defpackage.jgt
        public final void h(String str, String str2) {
            if (this.c <= 5) {
                Log.w(str, str2);
            }
        }
    }

    public static jgt e() {
        a aVar;
        synchronized (a) {
            try {
                if (b == null) {
                    b = new a(3);
                }
                aVar = b;
            } catch (Throwable th) {
                throw th;
            }
        }
        return aVar;
    }

    public static String g(String str) {
        int length = str.length();
        StringBuilder sb = new StringBuilder(23);
        sb.append("WM-");
        if (length >= 20) {
            sb.append(str.substring(0, 20));
        } else {
            sb.append(str);
        }
        return sb.toString();
    }

    public abstract void a(String str, String str2);

    public abstract void b(String str, String str2, Throwable th);

    public abstract void c(String str, String str2);

    public abstract void d(String str, String str2, Throwable th);

    public abstract void f(String str, String str2);

    public abstract void h(String str, String str2);
}
