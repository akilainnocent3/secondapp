package kp;

import android.util.Log;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
public class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dp.c.e f102864a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f102865b;

    public h(String tag, dp.c.e logLevel) {
        this.f102865b = tag;
        this.f102864a = logLevel;
    }

    public void a(String format, Object... extra) {
        if (e(dp.c.e.DEBUG)) {
            String strD = d(format, extra);
            if (strD.length() <= 1000) {
                Log.d(this.f102865b, strD);
            } else {
                Log.d(this.f102865b, strD.substring(0, 1000));
                a(strD.substring(1000), new Object[0]);
            }
        }
    }

    public void b(Throwable error, String format, Object... extra) {
        if (e(dp.c.e.INFO)) {
            Log.e(this.f102865b, d(format, extra), error);
        }
    }

    public void c(String format, Object... extra) {
        if (e(dp.c.e.INFO)) {
            String strD = d(format, extra);
            if (strD.length() <= 1000) {
                Log.i(this.f102865b, strD);
            } else {
                Log.i(this.f102865b, strD.substring(0, 1000));
                c(strD.substring(1000), new Object[0]);
            }
        }
    }

    public final String d(String format, Object... extra) {
        if (format == null) {
            return fw.b.f85379f;
        }
        return extra.length == 0 ? format : String.format(format, extra);
    }

    public final boolean e(dp.c.e level) {
        return this.f102864a.ordinal() >= level.ordinal();
    }

    public void f(String format, Object... extra) {
        if (e(dp.c.e.WARN)) {
            Log.w(this.f102865b, d(format, extra));
        }
    }
}
