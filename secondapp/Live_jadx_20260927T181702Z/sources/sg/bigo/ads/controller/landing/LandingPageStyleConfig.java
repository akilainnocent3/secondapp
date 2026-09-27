package sg.bigo.ads.controller.landing;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes7.dex */
public class LandingPageStyleConfig implements Parcelable {
    public static final Parcelable.Creator<LandingPageStyleConfig> CREATOR = new Parcelable.Creator<LandingPageStyleConfig>() { // from class: sg.bigo.ads.controller.landing.LandingPageStyleConfig.1
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ LandingPageStyleConfig createFromParcel(Parcel parcel) {
            return new LandingPageStyleConfig(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ LandingPageStyleConfig[] newArray(int i10) {
            return new LandingPageStyleConfig[i10];
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f134331a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f134332b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f134333c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f134334d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f134335e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final float f134336f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Class<? extends d> f134337g;

    public LandingPageStyleConfig(Parcel parcel) {
        this.f134337g = (Class) parcel.readSerializable();
        this.f134333c = parcel.readInt();
        this.f134331a = parcel.readInt();
        this.f134332b = parcel.readInt();
        this.f134334d = parcel.readInt();
        this.f134335e = parcel.readInt();
        this.f134336f = parcel.readFloat();
    }

    public final boolean a() {
        return this.f134337g != null && this.f134334d > 0;
    }

    public final boolean b() {
        int i10 = this.f134331a;
        return i10 == 0 || i10 == 7 || i10 == 8;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeSerializable(this.f134337g);
        parcel.writeInt(this.f134333c);
        parcel.writeInt(this.f134331a);
        parcel.writeInt(this.f134332b);
        parcel.writeInt(this.f134334d);
        parcel.writeInt(this.f134335e);
        parcel.writeFloat(this.f134336f);
    }

    public LandingPageStyleConfig(Class<? extends d> cls, int i10, int i11, int i12, int i13, int i14, float f10) {
        this.f134337g = cls;
        this.f134333c = i10;
        this.f134331a = i11;
        this.f134332b = i12;
        this.f134334d = i13;
        this.f134335e = i14;
        this.f134336f = f10;
    }
}
