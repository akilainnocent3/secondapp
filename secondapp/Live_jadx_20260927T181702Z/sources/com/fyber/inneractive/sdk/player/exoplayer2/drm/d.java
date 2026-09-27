package com.fyber.inneractive.sdk.player.exoplayer2.drm;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.Comparator;
import java.util.UUID;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public final class d implements Comparator, Parcelable {
    public static final Parcelable.Creator<d> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c[] f45725a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f45726b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f45727c;

    public d(boolean z10, c... cVarArr) {
        cVarArr = z10 ? (c[]) cVarArr.clone() : cVarArr;
        Arrays.sort(cVarArr, this);
        for (int i10 = 1; i10 < cVarArr.length; i10++) {
            if (cVarArr[i10 - 1].f45721b.equals(cVarArr[i10].f45721b)) {
                throw new IllegalArgumentException("Duplicate data for uuid: " + cVarArr[i10].f45721b);
            }
        }
        this.f45725a = cVarArr;
        this.f45727c = cVarArr.length;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        c cVar = (c) obj;
        c cVar2 = (c) obj2;
        UUID uuid = com.fyber.inneractive.sdk.player.exoplayer2.b.f45700b;
        if (uuid.equals(cVar.f45721b)) {
            return uuid.equals(cVar2.f45721b) ? 0 : 1;
        }
        return cVar.f45721b.compareTo(cVar2.f45721b);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // java.util.Comparator
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || d.class != obj.getClass()) {
            return false;
        }
        return Arrays.equals(this.f45725a, ((d) obj).f45725a);
    }

    public final int hashCode() {
        if (this.f45726b == 0) {
            this.f45726b = Arrays.hashCode(this.f45725a);
        }
        return this.f45726b;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeTypedArray(this.f45725a, 0);
    }

    public d(Parcel parcel) {
        c[] cVarArr = (c[]) parcel.createTypedArray(c.CREATOR);
        this.f45725a = cVarArr;
        this.f45727c = cVarArr.length;
    }
}
