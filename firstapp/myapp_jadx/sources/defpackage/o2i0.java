package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.SparseIntArray;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes.dex */
public final class o2i0 extends n2i0 {
    public final SparseIntArray d;
    public final Parcel e;
    public final int f;
    public final int g;
    public final String h;
    public int i;
    public int j;
    public int k;

    public o2i0(Parcel parcel) {
        this(parcel, parcel.dataPosition(), parcel.dataSize(), "", new ox0(), new ox0(), new ox0());
    }

    @Override // defpackage.n2i0
    public final o2i0 a() {
        Parcel parcel = this.e;
        int iDataPosition = parcel.dataPosition();
        int i = this.j;
        if (i == this.f) {
            i = this.g;
        }
        return new o2i0(parcel, iDataPosition, i, uf80.a(new StringBuilder(), this.h, "  "), this.a, this.b, this.c);
    }

    @Override // defpackage.n2i0
    public final boolean e() {
        return this.e.readInt() != 0;
    }

    @Override // defpackage.n2i0
    public final byte[] f() {
        Parcel parcel = this.e;
        int i = parcel.readInt();
        if (i < 0) {
            return null;
        }
        byte[] bArr = new byte[i];
        parcel.readByteArray(bArr);
        return bArr;
    }

    @Override // defpackage.n2i0
    public final CharSequence g() {
        return (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(this.e);
    }

    @Override // defpackage.n2i0
    public final boolean h(int i) {
        while (true) {
            int i2 = this.j;
            int i3 = this.k;
            if (i2 >= this.g) {
                return i3 == i;
            }
            if (i3 == i) {
                return true;
            }
            if (String.valueOf(i3).compareTo(String.valueOf(i)) > 0) {
                return false;
            }
            int i4 = this.j;
            Parcel parcel = this.e;
            parcel.setDataPosition(i4);
            int i5 = parcel.readInt();
            this.k = parcel.readInt();
            this.j += i5;
        }
    }

    @Override // defpackage.n2i0
    public final int i() {
        return this.e.readInt();
    }

    @Override // defpackage.n2i0
    public final <T extends Parcelable> T j() {
        return (T) this.e.readParcelable(o2i0.class.getClassLoader());
    }

    @Override // defpackage.n2i0
    public final String k() {
        return this.e.readString();
    }

    @Override // defpackage.n2i0
    public final void m(int i) {
        u();
        this.i = i;
        this.d.put(i, this.e.dataPosition());
        q(0);
        q(i);
    }

    @Override // defpackage.n2i0
    public final void n(boolean z) {
        this.e.writeInt(z ? 1 : 0);
    }

    @Override // defpackage.n2i0
    public final void o(byte[] bArr) {
        Parcel parcel = this.e;
        if (bArr == null) {
            parcel.writeInt(-1);
        } else {
            parcel.writeInt(bArr.length);
            parcel.writeByteArray(bArr);
        }
    }

    @Override // defpackage.n2i0
    public final void p(CharSequence charSequence) {
        TextUtils.writeToParcel(charSequence, this.e, 0);
    }

    @Override // defpackage.n2i0
    public final void q(int i) {
        this.e.writeInt(i);
    }

    @Override // defpackage.n2i0
    public final void r(Parcelable parcelable) {
        this.e.writeParcelable(parcelable, 0);
    }

    @Override // defpackage.n2i0
    public final void s(String str) {
        this.e.writeString(str);
    }

    public final void u() {
        int i = this.i;
        if (i >= 0) {
            int i2 = this.d.get(i);
            Parcel parcel = this.e;
            int iDataPosition = parcel.dataPosition();
            parcel.setDataPosition(i2);
            parcel.writeInt(iDataPosition - i2);
            parcel.setDataPosition(iDataPosition);
        }
    }

    public o2i0(Parcel parcel, int i, int i2, String str, ox0<String, Method> ox0Var, ox0<String, Method> ox0Var2, ox0<String, Class> ox0Var3) {
        super(ox0Var, ox0Var2, ox0Var3);
        this.d = new SparseIntArray();
        this.i = -1;
        this.k = -1;
        this.e = parcel;
        this.f = i;
        this.g = i2;
        this.j = i;
        this.h = str;
    }
}
