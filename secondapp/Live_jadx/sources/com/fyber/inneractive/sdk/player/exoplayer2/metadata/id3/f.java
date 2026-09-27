package com.fyber.inneractive.sdk.player.exoplayer2.metadata.id3;

import android.os.Parcel;
import android.os.Parcelable;
import com.fyber.inneractive.sdk.player.exoplayer2.util.z;
import com.ironsource.mediationsdk.logger.IronSourceError;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public final class f extends o {
    public static final Parcelable.Creator<f> CREATOR = new e();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f46754b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f46755c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f46756d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f46757e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f46758f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final o[] f46759g;

    public f(String str, int i10, int i11, long j10, long j11, o[] oVarArr) {
        super("CHAP");
        this.f46754b = str;
        this.f46755c = i10;
        this.f46756d = i11;
        this.f46757e = j10;
        this.f46758f = j11;
        this.f46759g = oVarArr;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.metadata.id3.o, android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && f.class == obj.getClass()) {
            f fVar = (f) obj;
            if (this.f46755c == fVar.f46755c && this.f46756d == fVar.f46756d && this.f46757e == fVar.f46757e && this.f46758f == fVar.f46758f && z.a(this.f46754b, fVar.f46754b) && Arrays.equals(this.f46759g, fVar.f46759g)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i10 = (((((((this.f46755c + IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31) + this.f46756d) * 31) + ((int) this.f46757e)) * 31) + ((int) this.f46758f)) * 31;
        String str = this.f46754b;
        return i10 + (str != null ? str.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f46754b);
        parcel.writeInt(this.f46755c);
        parcel.writeInt(this.f46756d);
        parcel.writeLong(this.f46757e);
        parcel.writeLong(this.f46758f);
        parcel.writeInt(this.f46759g.length);
        for (o oVar : this.f46759g) {
            parcel.writeParcelable(oVar, 0);
        }
    }

    public f(Parcel parcel) {
        super("CHAP");
        this.f46754b = parcel.readString();
        this.f46755c = parcel.readInt();
        this.f46756d = parcel.readInt();
        this.f46757e = parcel.readLong();
        this.f46758f = parcel.readLong();
        int i10 = parcel.readInt();
        this.f46759g = new o[i10];
        for (int i11 = 0; i11 < i10; i11++) {
            this.f46759g[i11] = (o) parcel.readParcelable(o.class.getClassLoader());
        }
    }
}
