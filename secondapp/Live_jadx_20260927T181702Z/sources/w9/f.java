package w9;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.SparseIntArray;
import java.lang.reflect.Method;
import k.y0;
import vb.q;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes2.dex */
@y0({y0.a.LIBRARY})
public class f extends e {
    public static final boolean B = false;
    public static final String C = "VersionedParcelParcel";
    public int A;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final SparseIntArray f142534t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final Parcel f142535u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final int f142536v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final int f142537w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final String f142538x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f142539y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public int f142540z;

    public f(Parcel parcel) {
        this(parcel, parcel.dataPosition(), parcel.dataSize(), "", new f0.a(), new f0.a(), new f0.a());
    }

    @Override // w9.e
    public void C0(double d10) {
        this.f142535u.writeDouble(d10);
    }

    @Override // w9.e
    public boolean F(int i10) {
        while (this.f142540z < this.f142537w) {
            int i11 = this.A;
            if (i11 == i10) {
                return true;
            }
            if (String.valueOf(i11).compareTo(String.valueOf(i10)) > 0) {
                return false;
            }
            this.f142535u.setDataPosition(this.f142540z);
            int i12 = this.f142535u.readInt();
            this.A = this.f142535u.readInt();
            this.f142540z += i12;
        }
        return this.A == i10;
    }

    @Override // w9.e
    public float G() {
        return this.f142535u.readFloat();
    }

    @Override // w9.e
    public void H0(float f10) {
        this.f142535u.writeFloat(f10);
    }

    @Override // w9.e
    public int L() {
        return this.f142535u.readInt();
    }

    @Override // w9.e
    public void L0(int i10) {
        this.f142535u.writeInt(i10);
    }

    @Override // w9.e
    public long Q() {
        return this.f142535u.readLong();
    }

    @Override // w9.e
    public void Q0(long j10) {
        this.f142535u.writeLong(j10);
    }

    @Override // w9.e
    public <T extends Parcelable> T V() {
        return (T) this.f142535u.readParcelable(getClass().getClassLoader());
    }

    @Override // w9.e
    public void W0(Parcelable parcelable) {
        this.f142535u.writeParcelable(parcelable, 0);
    }

    @Override // w9.e
    public void a() {
        int i10 = this.f142539y;
        if (i10 >= 0) {
            int i11 = this.f142534t.get(i10);
            int iDataPosition = this.f142535u.dataPosition();
            this.f142535u.setDataPosition(i11);
            this.f142535u.writeInt(iDataPosition - i11);
            this.f142535u.setDataPosition(iDataPosition);
        }
    }

    @Override // w9.e
    public e c() {
        Parcel parcel = this.f142535u;
        int iDataPosition = parcel.dataPosition();
        int i10 = this.f142540z;
        if (i10 == this.f142536v) {
            i10 = this.f142537w;
        }
        return new f(parcel, iDataPosition, i10, this.f142538x + q.a.f140822e, this.f142530a, this.f142531b, this.f142532c);
    }

    @Override // w9.e
    public String c0() {
        return this.f142535u.readString();
    }

    @Override // w9.e
    public IBinder e0() {
        return this.f142535u.readStrongBinder();
    }

    @Override // w9.e
    public void e1(String str) {
        this.f142535u.writeString(str);
    }

    @Override // w9.e
    public void g1(IBinder iBinder) {
        this.f142535u.writeStrongBinder(iBinder);
    }

    @Override // w9.e
    public void i0(int i10) {
        a();
        this.f142539y = i10;
        this.f142534t.put(i10, this.f142535u.dataPosition());
        L0(0);
        L0(i10);
    }

    @Override // w9.e
    public void i1(IInterface iInterface) {
        this.f142535u.writeStrongInterface(iInterface);
    }

    @Override // w9.e
    public boolean l() {
        return this.f142535u.readInt() != 0;
    }

    @Override // w9.e
    public void m0(boolean z10) {
        this.f142535u.writeInt(z10 ? 1 : 0);
    }

    @Override // w9.e
    public Bundle p() {
        return this.f142535u.readBundle(getClass().getClassLoader());
    }

    @Override // w9.e
    public void q0(Bundle bundle) {
        this.f142535u.writeBundle(bundle);
    }

    @Override // w9.e
    public byte[] s() {
        int i10 = this.f142535u.readInt();
        if (i10 < 0) {
            return null;
        }
        byte[] bArr = new byte[i10];
        this.f142535u.readByteArray(bArr);
        return bArr;
    }

    @Override // w9.e
    public void t0(byte[] bArr) {
        if (bArr == null) {
            this.f142535u.writeInt(-1);
        } else {
            this.f142535u.writeInt(bArr.length);
            this.f142535u.writeByteArray(bArr);
        }
    }

    @Override // w9.e
    public CharSequence v() {
        return (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(this.f142535u);
    }

    @Override // w9.e
    public void v0(byte[] bArr, int i10, int i11) {
        if (bArr == null) {
            this.f142535u.writeInt(-1);
        } else {
            this.f142535u.writeInt(bArr.length);
            this.f142535u.writeByteArray(bArr, i10, i11);
        }
    }

    @Override // w9.e
    public double y() {
        return this.f142535u.readDouble();
    }

    @Override // w9.e
    public void y0(CharSequence charSequence) {
        TextUtils.writeToParcel(charSequence, this.f142535u, 0);
    }

    public f(Parcel parcel, int i10, int i11, String str, f0.a<String, Method> aVar, f0.a<String, Method> aVar2, f0.a<String, Class> aVar3) {
        super(aVar, aVar2, aVar3);
        this.f142534t = new SparseIntArray();
        this.f142539y = -1;
        this.A = -1;
        this.f142535u = parcel;
        this.f142536v = i10;
        this.f142537w = i11;
        this.f142540z = i10;
        this.f142538x = str;
    }
}
