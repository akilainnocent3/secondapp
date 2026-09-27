package yads;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class n23 extends j23 {
    public static final Parcelable.Creator<n23> CREATOR = new l23();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f152852b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f152853c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f152854d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f152855e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f152856f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final long f152857g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final long f152858h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final List f152859i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final boolean f152860j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final long f152861k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final int f152862l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final int f152863m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final int f152864n;

    public n23(long j10, boolean z10, boolean z11, boolean z12, boolean z13, long j11, long j12, List list, boolean z14, long j13, int i10, int i11, int i12) {
        this.f152852b = j10;
        this.f152853c = z10;
        this.f152854d = z11;
        this.f152855e = z12;
        this.f152856f = z13;
        this.f152857g = j11;
        this.f152858h = j12;
        this.f152859i = Collections.unmodifiableList(list);
        this.f152860j = z14;
        this.f152861k = j13;
        this.f152862l = i10;
        this.f152863m = i11;
        this.f152864n = i12;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeLong(this.f152852b);
        parcel.writeByte(this.f152853c ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f152854d ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f152855e ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f152856f ? (byte) 1 : (byte) 0);
        parcel.writeLong(this.f152857g);
        parcel.writeLong(this.f152858h);
        int size = this.f152859i.size();
        parcel.writeInt(size);
        for (int i11 = 0; i11 < size; i11++) {
            m23 m23Var = (m23) this.f152859i.get(i11);
            parcel.writeInt(m23Var.f152284a);
            parcel.writeLong(m23Var.f152285b);
            parcel.writeLong(m23Var.f152286c);
        }
        parcel.writeByte(this.f152860j ? (byte) 1 : (byte) 0);
        parcel.writeLong(this.f152861k);
        parcel.writeInt(this.f152862l);
        parcel.writeInt(this.f152863m);
        parcel.writeInt(this.f152864n);
    }

    public n23(Parcel parcel) {
        this.f152852b = parcel.readLong();
        this.f152853c = parcel.readByte() == 1;
        this.f152854d = parcel.readByte() == 1;
        this.f152855e = parcel.readByte() == 1;
        this.f152856f = parcel.readByte() == 1;
        this.f152857g = parcel.readLong();
        this.f152858h = parcel.readLong();
        int i10 = parcel.readInt();
        ArrayList arrayList = new ArrayList(i10);
        for (int i11 = 0; i11 < i10; i11++) {
            arrayList.add(m23.a(parcel));
        }
        this.f152859i = Collections.unmodifiableList(arrayList);
        this.f152860j = parcel.readByte() == 1;
        this.f152861k = parcel.readLong();
        this.f152862l = parcel.readInt();
        this.f152863m = parcel.readInt();
        this.f152864n = parcel.readInt();
    }
}
