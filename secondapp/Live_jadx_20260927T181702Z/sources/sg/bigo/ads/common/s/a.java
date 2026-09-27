package sg.bigo.ads.common.s;

import android.content.Context;
import android.os.Parcel;
import androidx.annotation.NonNull;
import fw.b;
import sg.bigo.ads.common.f;
import sg.bigo.ads.common.utils.r;

/* JADX INFO: loaded from: classes7.dex */
public final class a implements f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final long f133294a = r.f133430c.a(1);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Context f133295b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f133296c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private double f133297d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private double f133298e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private String f133299f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private String f133300g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private String f133301h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private long f133302i;

    public a(@NonNull Context context) {
        this(context, (byte) 0);
    }

    @Override // sg.bigo.ads.common.f
    public final void a(@NonNull Parcel parcel) {
        parcel.writeDouble(this.f133297d);
        parcel.writeDouble(this.f133298e);
        parcel.writeString(this.f133299f);
        parcel.writeString(this.f133300g);
        parcel.writeString(this.f133301h);
        parcel.writeLong(this.f133302i);
    }

    @Override // sg.bigo.ads.common.f
    public final void b(@NonNull Parcel parcel) {
        this.f133297d = parcel.readDouble();
        this.f133298e = parcel.readDouble();
        this.f133299f = parcel.readString();
        this.f133300g = parcel.readString();
        this.f133301h = parcel.readString();
        this.f133302i = parcel.readLong();
    }

    public final String toString() {
        return "{longitude=" + this.f133297d + ", latitude=" + this.f133298e + ", countryCode='" + this.f133299f + "', state='" + this.f133300g + "', city='" + this.f133301h + "', updateTime='" + this.f133302i + '\'' + b.f85383j;
    }

    private a(@NonNull Context context, byte b10) {
        this.f133296c = false;
        this.f133295b = context;
        this.f133302i = 0L;
    }

    public a(@NonNull Context context, @NonNull Parcel parcel) {
        this.f133296c = false;
        this.f133295b = context;
        b(parcel);
    }
}
