package yads;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class pj0 implements Parcelable {
    public static final Parcelable.Creator<pj0> CREATOR = new oj0();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f153947b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Uri f153948c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f153949d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final List f153950e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final byte[] f153951f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f153952g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final byte[] f153953h;

    public pj0(Parcel parcel) {
        this.f153947b = (String) ib3.a((Object) parcel.readString());
        this.f153948c = Uri.parse((String) ib3.a((Object) parcel.readString()));
        this.f153949d = parcel.readString();
        int i10 = parcel.readInt();
        ArrayList arrayList = new ArrayList(i10);
        for (int i11 = 0; i11 < i10; i11++) {
            arrayList.add((v33) parcel.readParcelable(v33.class.getClassLoader()));
        }
        this.f153950e = Collections.unmodifiableList(arrayList);
        this.f153951f = parcel.createByteArray();
        this.f153952g = parcel.readString();
        this.f153953h = (byte[]) ib3.a((Object) parcel.createByteArray());
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof pj0)) {
            return false;
        }
        pj0 pj0Var = (pj0) obj;
        return this.f153947b.equals(pj0Var.f153947b) && this.f153948c.equals(pj0Var.f153948c) && ib3.a(this.f153949d, pj0Var.f153949d) && this.f153950e.equals(pj0Var.f153950e) && Arrays.equals(this.f153951f, pj0Var.f153951f) && ib3.a(this.f153952g, pj0Var.f153952g) && Arrays.equals(this.f153953h, pj0Var.f153953h);
    }

    public final int hashCode() {
        int iHashCode = (this.f153948c.hashCode() + (this.f153947b.hashCode() * 961)) * 31;
        String str = this.f153949d;
        int iHashCode2 = (Arrays.hashCode(this.f153951f) + ((this.f153950e.hashCode() + ((iHashCode + (str != null ? str.hashCode() : 0)) * 31)) * 31)) * 31;
        String str2 = this.f153952g;
        return Arrays.hashCode(this.f153953h) + ((iHashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31);
    }

    public final String toString() {
        return this.f153949d + ":" + this.f153947b;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f153947b);
        parcel.writeString(this.f153948c.toString());
        parcel.writeString(this.f153949d);
        parcel.writeInt(this.f153950e.size());
        for (int i11 = 0; i11 < this.f153950e.size(); i11++) {
            parcel.writeParcelable((Parcelable) this.f153950e.get(i11), 0);
        }
        parcel.writeByteArray(this.f153951f);
        parcel.writeString(this.f153952g);
        parcel.writeByteArray(this.f153953h);
    }

    public pj0(String str, Uri uri, String str2, List list, byte[] bArr, String str3, byte[] bArr2) {
        int iA = ib3.a(uri, str2);
        if (iA == 0 || iA == 2 || iA == 1) {
            ni.a("customCacheKey must be null for type: " + iA, str3 == null);
        }
        this.f153947b = str;
        this.f153948c = uri;
        this.f153949d = str2;
        ArrayList arrayList = new ArrayList(list);
        Collections.sort(arrayList);
        this.f153950e = Collections.unmodifiableList(arrayList);
        this.f153951f = bArr != null ? Arrays.copyOf(bArr, bArr.length) : null;
        this.f153952g = str3;
        this.f153953h = bArr2 != null ? Arrays.copyOf(bArr2, bArr2.length) : ib3.f150521f;
    }
}
