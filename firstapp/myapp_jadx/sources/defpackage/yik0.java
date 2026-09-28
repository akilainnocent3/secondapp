package defpackage;

import android.os.Parcel;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.internal.TelemetryData;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;

/* JADX INFO: loaded from: classes4.dex */
public final class yik0 extends u4l {
    public static final sl0 k = new sl0("ClientTelemetry.API", new wik0(), new sl0.g());

    public final Task<Void> d(final TelemetryData telemetryData) {
        o5f0.a aVarA = o5f0.a();
        aVarA.c = new Feature[]{bik0.a};
        aVarA.b = false;
        aVarA.a = new z550() { // from class: tik0
            /* JADX WARN: Multi-variable type inference failed */
            @Override // defpackage.z550
            public final void accept(Object obj, Object obj2) {
                TaskCompletionSource taskCompletionSource = (TaskCompletionSource) obj2;
                sl0 sl0Var = yik0.k;
                mik0 mik0Var = (mik0) ((djk0) obj).v();
                Parcel parcelObtain = Parcel.obtain();
                parcelObtain.writeInterfaceToken(mik0Var.b);
                int i = ugk0.a;
                TelemetryData telemetryData2 = telemetryData;
                if (telemetryData2 == null) {
                    parcelObtain.writeInt(0);
                } else {
                    parcelObtain.writeInt(1);
                    telemetryData2.writeToParcel(parcelObtain, 0);
                }
                try {
                    mik0Var.a.transact(1, parcelObtain, null, 1);
                    parcelObtain.recycle();
                    taskCompletionSource.setResult(null);
                } catch (Throwable th) {
                    parcelObtain.recycle();
                    throw th;
                }
            }
        };
        return c(2, aVarA.a());
    }
}
