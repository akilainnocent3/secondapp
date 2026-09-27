package yads;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class t23 extends j23 {
    public static final Parcelable.Creator<t23> CREATOR = new q23();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f155680b;

    public t23(Parcel parcel) {
        int i10 = parcel.readInt();
        ArrayList arrayList = new ArrayList(i10);
        for (int i11 = 0; i11 < i10; i11++) {
            arrayList.add(s23.a(parcel));
        }
        this.f155680b = Collections.unmodifiableList(arrayList);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int size = this.f155680b.size();
        parcel.writeInt(size);
        for (int i11 = 0; i11 < size; i11++) {
            s23 s23Var = (s23) this.f155680b.get(i11);
            parcel.writeLong(s23Var.f155235a);
            parcel.writeByte(s23Var.f155236b ? (byte) 1 : (byte) 0);
            parcel.writeByte(s23Var.f155237c ? (byte) 1 : (byte) 0);
            parcel.writeByte(s23Var.f155238d ? (byte) 1 : (byte) 0);
            int size2 = s23Var.f155240f.size();
            parcel.writeInt(size2);
            for (int i12 = 0; i12 < size2; i12++) {
                r23 r23Var = (r23) s23Var.f155240f.get(i12);
                parcel.writeInt(r23Var.f154724a);
                parcel.writeLong(r23Var.f154725b);
            }
            parcel.writeLong(s23Var.f155239e);
            parcel.writeByte(s23Var.f155241g ? (byte) 1 : (byte) 0);
            parcel.writeLong(s23Var.f155242h);
            parcel.writeInt(s23Var.f155243i);
            parcel.writeInt(s23Var.f155244j);
            parcel.writeInt(s23Var.f155245k);
        }
    }

    public t23(ArrayList arrayList) {
        this.f155680b = Collections.unmodifiableList(arrayList);
    }
}
