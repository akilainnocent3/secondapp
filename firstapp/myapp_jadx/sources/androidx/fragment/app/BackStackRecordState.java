package androidx.fragment.app;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Log;
import defpackage.ib5;
import defpackage.s9s;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
final class BackStackRecordState implements Parcelable {
    public static final Parcelable.Creator<BackStackRecordState> CREATOR = new a();
    public final ArrayList<String> A;
    public final ArrayList<String> B;
    public final boolean C;
    public final int[] a;
    public final ArrayList<String> b;
    public final int[] c;
    public final int[] d;
    public final int e;
    public final String f;
    public final int i;
    public final int v;
    public final CharSequence w;
    public final int y;
    public final CharSequence z;

    public class a implements Parcelable.Creator<BackStackRecordState> {
        @Override // android.os.Parcelable.Creator
        public final BackStackRecordState createFromParcel(Parcel parcel) {
            return new BackStackRecordState(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final BackStackRecordState[] newArray(int i) {
            return new BackStackRecordState[i];
        }
    }

    public BackStackRecordState(androidx.fragment.app.a aVar) {
        int size = aVar.c.size();
        this.a = new int[size * 6];
        if (!aVar.i) {
            ib5.a("Not on back stack");
            throw null;
        }
        this.b = new ArrayList<>(size);
        this.c = new int[size];
        this.d = new int[size];
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            n.a aVar2 = aVar.c.get(i2);
            int i3 = i + 1;
            this.a[i] = aVar2.a;
            ArrayList<String> arrayList = this.b;
            Fragment fragment = aVar2.b;
            arrayList.add(fragment != null ? fragment.mWho : null);
            int[] iArr = this.a;
            iArr[i3] = aVar2.c ? 1 : 0;
            iArr[i + 2] = aVar2.d;
            iArr[i + 3] = aVar2.e;
            int i4 = i + 5;
            iArr[i + 4] = aVar2.f;
            i += 6;
            iArr[i4] = aVar2.g;
            this.c[i2] = aVar2.h.ordinal();
            this.d[i2] = aVar2.i.ordinal();
        }
        this.e = aVar.h;
        this.f = aVar.k;
        this.i = aVar.v;
        this.v = aVar.l;
        this.w = aVar.m;
        this.y = aVar.n;
        this.z = aVar.o;
        this.A = aVar.p;
        this.B = aVar.q;
        this.C = aVar.r;
    }

    public final void a(androidx.fragment.app.a aVar) {
        int i = 0;
        int i2 = 0;
        while (true) {
            int[] iArr = this.a;
            boolean z = true;
            if (i >= iArr.length) {
                aVar.h = this.e;
                aVar.k = this.f;
                aVar.i = true;
                aVar.l = this.v;
                aVar.m = this.w;
                aVar.n = this.y;
                aVar.o = this.z;
                aVar.p = this.A;
                aVar.q = this.B;
                aVar.r = this.C;
                return;
            }
            n.a aVar2 = new n.a();
            int i3 = i + 1;
            aVar2.a = iArr[i];
            if (FragmentManager.R(2)) {
                Log.v("FragmentManager", "Instantiate " + aVar + " op #" + i2 + " base fragment #" + iArr[i3]);
            }
            aVar2.h = s9s.b.values()[this.c[i2]];
            aVar2.i = s9s.b.values()[this.d[i2]];
            int i4 = i + 2;
            if (iArr[i3] == 0) {
                z = false;
            }
            aVar2.c = z;
            int i5 = iArr[i4];
            aVar2.d = i5;
            int i6 = iArr[i + 3];
            aVar2.e = i6;
            int i7 = i + 5;
            int i8 = iArr[i + 4];
            aVar2.f = i8;
            i += 6;
            int i9 = iArr[i7];
            aVar2.g = i9;
            aVar.d = i5;
            aVar.e = i6;
            aVar.f = i8;
            aVar.g = i9;
            aVar.b(aVar2);
            i2++;
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeIntArray(this.a);
        parcel.writeStringList(this.b);
        parcel.writeIntArray(this.c);
        parcel.writeIntArray(this.d);
        parcel.writeInt(this.e);
        parcel.writeString(this.f);
        parcel.writeInt(this.i);
        parcel.writeInt(this.v);
        TextUtils.writeToParcel(this.w, parcel, 0);
        parcel.writeInt(this.y);
        TextUtils.writeToParcel(this.z, parcel, 0);
        parcel.writeStringList(this.A);
        parcel.writeStringList(this.B);
        parcel.writeInt(this.C ? 1 : 0);
    }

    public BackStackRecordState(Parcel parcel) {
        this.a = parcel.createIntArray();
        this.b = parcel.createStringArrayList();
        this.c = parcel.createIntArray();
        this.d = parcel.createIntArray();
        this.e = parcel.readInt();
        this.f = parcel.readString();
        this.i = parcel.readInt();
        this.v = parcel.readInt();
        Parcelable.Creator creator = TextUtils.CHAR_SEQUENCE_CREATOR;
        this.w = (CharSequence) creator.createFromParcel(parcel);
        this.y = parcel.readInt();
        this.z = (CharSequence) creator.createFromParcel(parcel);
        this.A = parcel.createStringArrayList();
        this.B = parcel.createStringArrayList();
        this.C = parcel.readInt() != 0;
    }
}
