package sg.bigo.ads.controller.b;

import android.os.Parcel;
import androidx.annotation.NonNull;
import sg.bigo.ads.api.a.k;
import sg.bigo.ads.common.n;

/* JADX INFO: loaded from: classes7.dex */
public final class g implements k, sg.bigo.ads.common.f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    boolean f133973a = true;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    boolean f133974b = false;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    int f133975c = 0;

    @Override // sg.bigo.ads.common.f
    public final void a(@NonNull Parcel parcel) {
        n.a(parcel, this.f133973a);
        n.a(parcel, this.f133974b);
        parcel.writeInt(this.f133975c);
    }

    @Override // sg.bigo.ads.common.f
    public final void b(@NonNull Parcel parcel) {
        this.f133973a = n.b(parcel, true);
        this.f133973a = n.b(parcel, false);
        this.f133975c = n.a(parcel, 0);
    }

    @Override // sg.bigo.ads.api.a.k
    public final int c() {
        return this.f133975c;
    }

    @NonNull
    public final String toString() {
        return "{isNativeVideoClickable=" + this.f133973a + ", isNativeVideoClickable=" + this.f133973a + ", clickTriggerType=" + this.f133975c + fw.b.f85383j;
    }

    @Override // sg.bigo.ads.api.a.k
    public final boolean a() {
        return this.f133973a;
    }

    @Override // sg.bigo.ads.api.a.k
    public final boolean b() {
        return this.f133974b;
    }
}
