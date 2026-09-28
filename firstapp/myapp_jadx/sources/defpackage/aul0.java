package defpackage;

import android.location.Location;
import android.os.Parcel;
import com.google.android.gms.common.api.Status;

/* JADX INFO: loaded from: classes4.dex */
public abstract class aul0 extends irk0 {
    @Override // defpackage.irk0
    public final boolean a(Parcel parcel, int i) {
        if (i != 1) {
            return false;
        }
        Status status = (Status) luk0.a(parcel, Status.CREATOR);
        Location location = (Location) luk0.a(parcel, Location.CREATOR);
        luk0.b(parcel);
        x5f0.a(status, location, ((uxk0) this).a);
        return true;
    }
}
