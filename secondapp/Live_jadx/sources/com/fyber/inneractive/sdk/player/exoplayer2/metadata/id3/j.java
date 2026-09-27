package com.fyber.inneractive.sdk.player.exoplayer2.metadata.id3;

import android.os.Parcel;
import android.os.Parcelable;
import com.fyber.inneractive.sdk.player.exoplayer2.util.z;
import com.ironsource.mediationsdk.logger.IronSourceError;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public final class j extends o {
    public static final Parcelable.Creator<j> CREATOR = new i();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f46765b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f46766c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f46767d;

    public j(String str, String str2, String str3) {
        super("COMM");
        this.f46765b = str;
        this.f46766c = str2;
        this.f46767d = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && j.class == obj.getClass()) {
            j jVar = (j) obj;
            if (z.a(this.f46766c, jVar.f46766c) && z.a(this.f46765b, jVar.f46765b) && z.a(this.f46767d, jVar.f46767d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.f46765b;
        int iHashCode = ((str != null ? str.hashCode() : 0) + IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31;
        String str2 = this.f46766c;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f46767d;
        return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f46777a);
        parcel.writeString(this.f46765b);
        parcel.writeString(this.f46767d);
    }

    public j(Parcel parcel) {
        super("COMM");
        this.f46765b = parcel.readString();
        this.f46766c = parcel.readString();
        this.f46767d = parcel.readString();
    }
}
