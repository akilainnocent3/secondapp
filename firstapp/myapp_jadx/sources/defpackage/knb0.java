package defpackage;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import okhttp3.internal.ws.RealWebSocket;

/* JADX INFO: loaded from: classes5.dex */
public abstract class knb0 {
    public final long a;
    public long c;
    public boolean d = false;
    public final a e = new a(Looper.getMainLooper());
    public final long b = RealWebSocket.CANCEL_AFTER_CLOSE_MILLIS;

    public class a extends Handler {
        public a(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public final void handleMessage(Message message) {
            synchronized (knb0.this) {
                try {
                    knb0 knb0Var = knb0.this;
                    if (knb0Var.d) {
                        return;
                    }
                    long jElapsedRealtime = knb0Var.c - SystemClock.elapsedRealtime();
                    long j = 0;
                    if (jElapsedRealtime <= 0) {
                        knb0.this.a();
                    } else {
                        long jElapsedRealtime2 = SystemClock.elapsedRealtime();
                        knb0.this.b();
                        long jElapsedRealtime3 = SystemClock.elapsedRealtime() - jElapsedRealtime2;
                        long j2 = knb0.this.b;
                        if (jElapsedRealtime < j2) {
                            long j3 = jElapsedRealtime - jElapsedRealtime3;
                            if (j3 >= 0) {
                                j = j3;
                            }
                        } else {
                            long j4 = j2 - jElapsedRealtime3;
                            while (j4 < 0) {
                                j4 += knb0.this.b;
                            }
                            j = j4;
                        }
                        sendMessageDelayed(obtainMessage(1), j);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public knb0(long j) {
        this.a = j;
    }

    public abstract void a();

    public abstract void b();
}
