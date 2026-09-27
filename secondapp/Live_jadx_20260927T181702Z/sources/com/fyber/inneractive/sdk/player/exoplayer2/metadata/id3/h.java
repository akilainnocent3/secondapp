package com.fyber.inneractive.sdk.player.exoplayer2.metadata.id3;

import android.os.Parcel;
import android.os.Parcelable;
import com.fyber.inneractive.sdk.player.exoplayer2.util.z;
import com.ironsource.mediationsdk.logger.IronSourceError;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public final class h extends o {
    public static final Parcelable.Creator<h> CREATOR = new g();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f46760b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f46761c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f46762d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String[] f46763e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final o[] f46764f;

    public h(String str, boolean z10, boolean z11, String[] strArr, o[] oVarArr) {
        super("CTOC");
        this.f46760b = str;
        this.f46761c = z10;
        this.f46762d = z11;
        this.f46763e = strArr;
        this.f46764f = oVarArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && h.class == obj.getClass()) {
            h hVar = (h) obj;
            if (this.f46761c == hVar.f46761c && this.f46762d == hVar.f46762d && z.a(this.f46760b, hVar.f46760b) && Arrays.equals(this.f46763e, hVar.f46763e) && Arrays.equals(this.f46764f, hVar.f46764f)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i10 = ((((this.f46761c ? 1 : 0) + IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31) + (this.f46762d ? 1 : 0)) * 31;
        String str = this.f46760b;
        return i10 + (str != null ? str.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f46760b);
        parcel.writeByte(this.f46761c ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f46762d ? (byte) 1 : (byte) 0);
        parcel.writeStringArray(this.f46763e);
        parcel.writeInt(this.f46764f.length);
        int i11 = 0;
        while (true) {
            o[] oVarArr = this.f46764f;
            if (i11 >= oVarArr.length) {
                return;
            }
            parcel.writeParcelable(oVarArr[i11], 0);
            i11++;
        }
    }

    public h(Parcel parcel) {
        super("CTOC");
        this.f46760b = parcel.readString();
        this.f46761c = parcel.readByte() != 0;
        this.f46762d = parcel.readByte() != 0;
        this.f46763e = parcel.createStringArray();
        int i10 = parcel.readInt();
        this.f46764f = new o[i10];
        for (int i11 = 0; i11 < i10; i11++) {
            this.f46764f[i11] = (o) parcel.readParcelable(o.class.getClassLoader());
        }
    }
}
