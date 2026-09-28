package defpackage;

import android.content.Context;
import android.os.SystemClock;
import com.google.android.gms.common.internal.MethodInvocation;
import com.google.android.gms.common.internal.TelemetryData;
import com.google.android.gms.tasks.OnFailureListener;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: loaded from: classes4.dex */
public final class q4l0 {
    public static q4l0 d;
    public final k8l0 a;
    public final yik0 b;
    public final AtomicLong c = new AtomicLong(-1);

    public q4l0(Context context, k8l0 k8l0Var) {
        this.b = new yik0(context, null, yik0.k, new mcf0("measurement:api"), u4l.a.c);
        this.a = k8l0Var;
    }

    public final synchronized void a(int i, int i2, long j, long j2) {
        this.a.k.getClass();
        final long jElapsedRealtime = SystemClock.elapsedRealtime();
        AtomicLong atomicLong = this.c;
        if (atomicLong.get() != -1 && jElapsedRealtime - atomicLong.get() <= 1800000) {
            return;
        }
        this.b.d(new TelemetryData(0, Arrays.asList(new MethodInvocation(36301, i, 0, j, j2, null, null, 0, i2)))).addOnFailureListener(new OnFailureListener() { // from class: o4l0
            @Override // com.google.android.gms.tasks.OnFailureListener
            public final /* synthetic */ void onFailure(Exception exc) {
                this.a.c.set(jElapsedRealtime);
            }
        });
    }
}
