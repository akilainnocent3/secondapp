package io.appmetrica.analytics.impl;

import android.os.Parcel;
import android.os.Parcelable;
import io.appmetrica.analytics.coreapi.internal.identifiers.IdentifierStatus;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
public final class W9 implements Parcelable {

    @oy.l
    public static final V9 CREATOR = new V9();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Boolean f96671a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final IdentifierStatus f96672b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f96673c;

    public W9(Boolean bool, IdentifierStatus identifierStatus, String str) {
        this.f96671a = bool;
        this.f96672b = identifierStatus;
        this.f96673c = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof W9)) {
            return false;
        }
        W9 w10 = (W9) obj;
        return kotlin.jvm.internal.m0.g(this.f96671a, w10.f96671a) && this.f96672b == w10.f96672b && kotlin.jvm.internal.m0.g(this.f96673c, w10.f96673c);
    }

    public final int hashCode() {
        Boolean bool = this.f96671a;
        int iHashCode = (this.f96672b.hashCode() + ((bool == null ? 0 : bool.hashCode()) * 31)) * 31;
        String str = this.f96673c;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        return "FeaturesInternal(sslPinning=" + this.f96671a + ", status=" + this.f96672b + ", errorExplanation=" + this.f96673c + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeValue(this.f96671a);
        parcel.writeString(this.f96672b.getValue());
        parcel.writeString(this.f96673c);
    }

    public W9() {
        this(null, IdentifierStatus.UNKNOWN, null);
    }
}
