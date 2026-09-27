package sg.bigo.ads.api.core;

import android.os.Parcel;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes7.dex */
public final class l implements sg.bigo.ads.api.a.j, sg.bigo.ads.common.f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f132806a = 0;

    @Override // sg.bigo.ads.common.f
    public final void a(@NonNull Parcel parcel) {
        parcel.writeLong(this.f132806a);
    }

    @Override // sg.bigo.ads.common.f
    public final void b(@NonNull Parcel parcel) {
        this.f132806a = parcel.readLong();
    }

    public final String toString() {
        return "{value=" + this.f132806a + fw.b.f85383j;
    }

    @Override // sg.bigo.ads.api.a.j
    public final boolean a(int i10) {
        return (this.f132806a & (1 << i10)) != 0;
    }
}
