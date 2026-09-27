package sg.bigo.ads.controller.b;

import android.os.Parcel;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes7.dex */
final class a implements sg.bigo.ads.api.a.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    long f133906a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    String f133907b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    String f133908c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    String f133909d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    String f133910e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    String f133911f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    String f133912g;

    @Override // sg.bigo.ads.common.f
    public final void a(@NonNull Parcel parcel) {
        parcel.writeLong(this.f133906a);
        parcel.writeString(this.f133907b);
        parcel.writeString(this.f133908c);
        parcel.writeString(this.f133909d);
        parcel.writeString(this.f133910e);
        parcel.writeString(this.f133911f);
        parcel.writeString(this.f133912g);
    }

    @Override // sg.bigo.ads.common.f
    public final void b(@NonNull Parcel parcel) {
        this.f133906a = parcel.readLong();
        this.f133907b = parcel.readString();
        this.f133908c = parcel.readString();
        this.f133909d = parcel.readString();
        this.f133910e = parcel.readString();
        this.f133911f = parcel.readString();
        this.f133912g = parcel.readString();
    }

    @NonNull
    public final String toString() {
        return "{expressId=" + this.f133906a + ", name='" + this.f133907b + "', url='" + this.f133908c + "', md5='" + this.f133909d + "', style='" + this.f133910e + "', adTypes='" + this.f133911f + "', fileId='" + this.f133912g + '\'' + fw.b.f85383j;
    }
}
