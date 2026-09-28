package defpackage;

import android.content.Context;
import android.os.SystemClock;
import android.util.Log;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.MethodInvocation;
import com.google.android.gms.common.internal.TelemetryData;
import com.google.android.gms.tasks.OnFailureListener;
import j$.time.Duration;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: loaded from: classes4.dex */
public final class xwk0 {
    public static volatile xwk0 c;
    public static final Object d = new Object();
    public static final Duration e = Duration.ofMinutes(30);
    public final yik0 a;
    public final AtomicLong b = new AtomicLong(-1);

    public xwk0(Context context) {
        this.a = new yik0(context, null, yik0.k, new mcf0("ads_identifier:api"), u4l.a.c);
    }

    public final synchronized void a(int i, int i2, long j, long j2) {
        AtomicLong atomicLong = this.b;
        final long jElapsedRealtime = SystemClock.elapsedRealtime();
        Log.i("AdvertisingIdClient", "shouldSendLog " + atomicLong.get());
        if (this.b.get() != -1 && jElapsedRealtime - this.b.get() <= e.toMillis()) {
            return;
        }
        this.a.d(new TelemetryData(0, Arrays.asList(new MethodInvocation(35401, i, 0, j, j2, null, null, 0, i2)))).addOnFailureListener(new OnFailureListener() { // from class: fvk0
            @Override // com.google.android.gms.tasks.OnFailureListener
            public final void onFailure(Exception exc) {
                ConnectionResult connectionResult;
                Log.i("AdvertisingIdClient", "getting error as ".concat(String.valueOf(exc.getMessage())));
                if ((exc instanceof nm0) && (connectionResult = ((nm0) exc).getStatus().d) != null && connectionResult.b == 24) {
                    this.a.b.set(jElapsedRealtime);
                }
            }
        });
    }
}
