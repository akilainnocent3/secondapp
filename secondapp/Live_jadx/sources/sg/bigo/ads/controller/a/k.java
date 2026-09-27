package sg.bigo.ads.controller.a;

import android.os.Parcel;
import androidx.annotation.NonNull;
import sg.bigo.ads.common.n;

/* JADX INFO: loaded from: classes7.dex */
public class k implements sg.bigo.ads.common.f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    String f133903a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f133904b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f133905c;

    public k() {
    }

    @Override // sg.bigo.ads.common.f
    @k.i
    public void a(@NonNull Parcel parcel) {
        parcel.writeString(this.f133905c);
        parcel.writeString(this.f133903a);
        n.a(parcel, this.f133904b);
    }

    @Override // sg.bigo.ads.common.f
    @k.i
    public void b(@NonNull Parcel parcel) {
        this.f133905c = n.a(parcel, "");
        this.f133903a = n.a(parcel, "");
        this.f133904b = n.b(parcel, false);
    }

    @NonNull
    public String toString() {
        return super.toString();
    }

    public k(String str, String str2, boolean z10) {
        this.f133905c = str;
        this.f133903a = str2;
        this.f133904b = z10;
    }
}
