package defpackage;

import android.location.Location;
import android.os.Build;
import android.os.WorkSource;
import com.google.android.gms.internal.identity.zzee;
import com.google.android.gms.location.CurrentLocationRequest;
import com.google.android.gms.location.LocationRequest;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import com.sportygames.commons.models.GPSData;
import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
public final class kej {
    public final uy1 a;
    public final lej b = new lej();
    public final htk0 c;

    public kej(uy1 uy1Var) {
        this.a = uy1Var;
        int i = ret.a;
        this.c = new htk0(uy1Var, uy1Var, htk0.k, sl0.d.g, u4l.a.c);
    }

    public final GPSData a() {
        try {
            htk0 htk0Var = this.c;
            fdv.c(100);
            final CurrentLocationRequest currentLocationRequest = new CurrentLocationRequest(10000L, 0, 100, Long.MAX_VALUE, false, 0, new WorkSource(null), null);
            o5f0.a aVarA = o5f0.a();
            aVarA.a = new z550() { // from class: utk0
                @Override // defpackage.z550
                public final void accept(Object obj, Object obj2) {
                    int i;
                    final TaskCompletionSource taskCompletionSource = (TaskCompletionSource) obj2;
                    wyk0 wyk0Var = (wyk0) obj;
                    sl0 sl0Var = htk0.k;
                    CurrentLocationRequest currentLocationRequest2 = currentLocationRequest;
                    wyk0Var.getClass();
                    if (wyk0Var.D(oll0.b)) {
                        ((ctl0) wyk0Var.v()).y(currentLocationRequest2, new zzee(4, null, new uxk0(taskCompletionSource), null, null));
                        return;
                    }
                    if (wyk0Var.D(oll0.a)) {
                        ((ctl0) wyk0Var.v()).B(currentLocationRequest2, new uxk0(taskCompletionSource));
                        return;
                    }
                    yis yisVar = new yis(new lxk0(wyk0Var, taskCompletionSource));
                    Objects.requireNonNull(yisVar.c);
                    oxk0 oxk0Var = new oxk0(yisVar, taskCompletionSource);
                    TaskCompletionSource taskCompletionSource2 = new TaskCompletionSource();
                    LocationRequest.a aVar = new LocationRequest.a(currentLocationRequest2.c, 0L);
                    aVar.c = 0L;
                    long j = currentLocationRequest2.d;
                    boolean z = false;
                    hm20.a("durationMillis must be greater than 0", j > 0);
                    aVar.e = j;
                    aVar.b(currentLocationRequest2.b);
                    aVar.c(currentLocationRequest2.a);
                    aVar.l = currentLocationRequest2.e;
                    int i2 = currentLocationRequest2.f;
                    if (i2 != 0 && i2 != 1) {
                        i = 2;
                        if (i2 != 2) {
                            i = i2;
                        }
                        hm20.c(z, "throttle behavior %d must be a ThrottleBehavior.THROTTLE_* constant", Integer.valueOf(i));
                        aVar.k = i2;
                        aVar.h = true;
                        aVar.m = currentLocationRequest2.i;
                        wyk0Var.E(oxk0Var, aVar.a(), taskCompletionSource2);
                        taskCompletionSource2.getTask().addOnCompleteListener(new OnCompleteListener() { // from class: ozk0
                            @Override // com.google.android.gms.tasks.OnCompleteListener
                            public final /* synthetic */ void onComplete(Task task) {
                                if (task.isSuccessful()) {
                                    return;
                                }
                                Exception exception = task.getException();
                                Objects.requireNonNull(exception);
                                taskCompletionSource.trySetException(exception);
                            }
                        });
                    }
                    i = i2;
                    z = true;
                    hm20.c(z, "throttle behavior %d must be a ThrottleBehavior.THROTTLE_* constant", Integer.valueOf(i));
                    aVar.k = i2;
                    aVar.h = true;
                    aVar.m = currentLocationRequest2.i;
                    wyk0Var.E(oxk0Var, aVar.a(), taskCompletionSource2);
                    taskCompletionSource2.getTask().addOnCompleteListener(new OnCompleteListener() { // from class: ozk0
                        @Override // com.google.android.gms.tasks.OnCompleteListener
                        public final /* synthetic */ void onComplete(Task task) {
                            if (task.isSuccessful()) {
                                return;
                            }
                            Exception exception = task.getException();
                            Objects.requireNonNull(exception);
                            taskCompletionSource.trySetException(exception);
                        }
                    });
                }
            };
            aVarA.d = 2415;
            Location location = (Location) Tasks.await(htk0Var.c(0, aVarA.a()));
            if (location != null) {
                if (!(Build.VERSION.SDK_INT >= 31 ? location.isMock() : location.isFromMockProvider())) {
                    try {
                        return this.b.a(this.a, location.getLatitude(), location.getLongitude());
                    } catch (Exception e) {
                        e.printStackTrace();
                        return null;
                    }
                }
            }
        } catch (Exception unused) {
        }
        return null;
    }
}
