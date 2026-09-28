package defpackage;

import android.os.SystemClock;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.ConnectionTelemetryConfiguration;
import com.google.android.gms.common.internal.MethodInvocation;
import com.google.android.gms.common.internal.RootTelemetryConfiguration;
import com.google.android.gms.common.internal.zzk;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import okhttp3.internal.http.HttpStatusCodesKt;

/* JADX INFO: loaded from: classes4.dex */
public final class zgk0 implements OnCompleteListener {
    public final y4l a;
    public final int b;
    public final qn0 c;
    public final long d;
    public final long e;

    public zgk0(y4l y4lVar, int i, qn0 qn0Var, long j, long j2) {
        this.a = y4lVar;
        this.b = i;
        this.c = qn0Var;
        this.d = j;
        this.e = j2;
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0031 A[RETURN] */
    public static ConnectionTelemetryConfiguration a(kgk0 kgk0Var, r12 r12Var, int i) {
        zzk zzkVar = r12Var.v;
        ConnectionTelemetryConfiguration connectionTelemetryConfiguration = zzkVar == null ? null : zzkVar.d;
        if (connectionTelemetryConfiguration != null && connectionTelemetryConfiguration.b) {
            int[] iArr = connectionTelemetryConfiguration.d;
            int i2 = 0;
            if (iArr == null) {
                int[] iArr2 = connectionTelemetryConfiguration.f;
                if (iArr2 != null) {
                    while (i2 < iArr2.length) {
                        if (iArr2[i2] != i) {
                            i2++;
                        }
                    }
                    if (kgk0Var.p < connectionTelemetryConfiguration.e) {
                        return connectionTelemetryConfiguration;
                    }
                } else if (kgk0Var.p < connectionTelemetryConfiguration.e) {
                    return connectionTelemetryConfiguration;
                }
            } else {
                while (i2 < iArr.length) {
                    if (iArr[i2] != i) {
                        i2++;
                    } else if (kgk0Var.p < connectionTelemetryConfiguration.e) {
                        return connectionTelemetryConfiguration;
                    }
                }
            }
        }
        return null;
    }

    @Override // com.google.android.gms.tasks.OnCompleteListener
    public final void onComplete(Task task) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        long j;
        long j2;
        long j3 = this.d;
        y4l y4lVar = this.a;
        if (y4lVar.b()) {
            RootTelemetryConfiguration rootTelemetryConfiguration = gw50.a().a;
            if (rootTelemetryConfiguration == null || rootTelemetryConfiguration.b) {
                kgk0 kgk0Var = (kgk0) y4lVar.y.get(this.c);
                if (kgk0Var != null) {
                    Object obj = kgk0Var.b;
                    if (obj instanceof r12) {
                        r12 r12Var = (r12) obj;
                        int i6 = 0;
                        boolean z = j3 > 0;
                        int i7 = r12Var.q;
                        if (rootTelemetryConfiguration != null) {
                            z &= rootTelemetryConfiguration.c;
                            i = rootTelemetryConfiguration.d;
                            int i8 = rootTelemetryConfiguration.e;
                            int i9 = rootTelemetryConfiguration.a;
                            if (r12Var.v == null || r12Var.c()) {
                                i2 = i9;
                                i3 = i8;
                            } else {
                                ConnectionTelemetryConfiguration connectionTelemetryConfigurationA = a(kgk0Var, r12Var, this.b);
                                if (connectionTelemetryConfigurationA == null) {
                                    return;
                                }
                                boolean z2 = connectionTelemetryConfigurationA.c && j3 > 0;
                                i2 = i9;
                                i3 = connectionTelemetryConfigurationA.e;
                                z = z2;
                            }
                        } else {
                            i = 5000;
                            i2 = 0;
                            i3 = 100;
                        }
                        int i10 = i;
                        int iElapsedRealtime = -1;
                        if (task.isSuccessful()) {
                            i5 = 0;
                        } else if (task.isCanceled()) {
                            i6 = -1;
                            i5 = 100;
                        } else {
                            Exception exception = task.getException();
                            if (exception instanceof nm0) {
                                Status status = ((nm0) exception).getStatus();
                                i4 = status.a;
                                ConnectionResult connectionResult = status.d;
                                if (connectionResult != null) {
                                    i5 = i4;
                                    i6 = connectionResult.b;
                                }
                            } else {
                                i4 = HttpStatusCodesKt.HTTP_SWITCHING_PROTOCOLS;
                            }
                            i5 = i4;
                            i6 = -1;
                        }
                        if (z) {
                            long j4 = this.e;
                            long jCurrentTimeMillis = System.currentTimeMillis();
                            iElapsedRealtime = (int) (SystemClock.elapsedRealtime() - j4);
                            j2 = jCurrentTimeMillis;
                            j = j3;
                        } else {
                            j = 0;
                            j2 = 0;
                        }
                        ahk0 ahk0Var = new ahk0(new MethodInvocation(this.b, i5, i6, j, j2, null, null, i7, iElapsedRealtime), i2, i10, i3);
                        ljk0 ljk0Var = y4lVar.C;
                        ljk0Var.sendMessage(ljk0Var.obtainMessage(18, ahk0Var));
                    }
                }
            }
        }
    }
}
