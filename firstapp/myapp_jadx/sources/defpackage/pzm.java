package defpackage;

import android.os.Parcel;
import com.google.android.gms.common.api.Status;

/* JADX INFO: loaded from: classes4.dex */
public abstract class pzm extends agk0 {
    @Override // defpackage.agk0
    public final boolean Z(int i, Parcel parcel, Parcel parcel2) {
        if (i != 1) {
            return false;
        }
        Status status = (Status) ugk0.a(parcel, Status.CREATOR);
        ugk0.b(parcel);
        rxk0 rxk0Var = (rxk0) this;
        x5f0.a(status, rxk0Var.a, rxk0Var.b);
        return true;
    }
}
