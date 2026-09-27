package sg.bigo.ads.controller.a.a;

import android.os.Parcel;
import androidx.annotation.NonNull;
import sg.bigo.ads.common.n;

/* JADX INFO: loaded from: classes7.dex */
public final class h implements sg.bigo.ads.common.f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f133800a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f133801b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f133802c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f133803d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f133804e;

    @Override // sg.bigo.ads.common.f
    public final void a(@NonNull Parcel parcel) {
        synchronized (this) {
            parcel.writeLong(this.f133800a);
            parcel.writeLong(this.f133801b);
            parcel.writeLong(this.f133802c);
            parcel.writeLong(this.f133803d);
            parcel.writeLong(this.f133804e);
        }
    }

    @Override // sg.bigo.ads.common.f
    public final void b(@NonNull Parcel parcel) {
        synchronized (this) {
            this.f133800a = n.a(parcel, 0L);
            this.f133801b = n.a(parcel, 0L);
            this.f133802c = n.a(parcel, 0L);
            this.f133803d = n.a(parcel, 0L);
            this.f133804e = n.a(parcel, 0L);
        }
    }

    @NonNull
    public final String toString() {
        return super.toString();
    }
}
