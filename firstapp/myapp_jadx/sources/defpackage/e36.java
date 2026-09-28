package defpackage;

import android.os.SystemClock;

/* JADX INFO: loaded from: classes.dex */
public final class e36 {
    public final int a;
    public final long b;
    public final Throwable c;

    public e36(long j, Exception exc) {
        this.b = SystemClock.elapsedRealtime() - j;
        if (exc instanceof x36.b) {
            this.a = 2;
            this.c = exc;
            return;
        }
        if (!(exc instanceof uhn)) {
            this.a = 0;
            this.c = exc;
            return;
        }
        Throwable cause = exc.getCause();
        exc = cause != null ? cause : exc;
        this.c = exc;
        if (exc instanceof r36) {
            this.a = 2;
        } else if (exc instanceof IllegalArgumentException) {
            this.a = 1;
        } else {
            this.a = 0;
        }
    }
}
