package defpackage;

import com.google.android.gms.location.LocationRequest;
import com.google.android.gms.tasks.TaskCompletionSource;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class ztk0 implements z550 {
    public final /* synthetic */ btk0 a;
    public final /* synthetic */ LocationRequest b;

    public /* synthetic */ ztk0(btk0 btk0Var, LocationRequest locationRequest) {
        this.a = btk0Var;
        this.b = locationRequest;
    }

    @Override // defpackage.z550
    public final /* synthetic */ void accept(Object obj, Object obj2) {
        sl0 sl0Var = htk0.k;
        ((wyk0) obj).E(this.a, this.b, (TaskCompletionSource) obj2);
    }
}
