package defpackage;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class uif {
    public static final /* synthetic */ int a = 0;

    public static void a(Parcel parcel, int i, Bundle bundle) {
        if (bundle == null) {
            return;
        }
        int iM = m(parcel, i);
        parcel.writeBundle(bundle);
        n(parcel, iM);
    }

    public static void b(Parcel parcel, int i, byte[] bArr, boolean z) {
        if (bArr == null) {
            if (z) {
                o(parcel, i, 0);
            }
        } else {
            int iM = m(parcel, i);
            parcel.writeByteArray(bArr);
            n(parcel, iM);
        }
    }

    public static void c(Parcel parcel, int i, Double d) {
        if (d == null) {
            return;
        }
        o(parcel, i, 8);
        parcel.writeDouble(d.doubleValue());
    }

    public static void d(Parcel parcel, int i, IBinder iBinder) {
        if (iBinder == null) {
            return;
        }
        int iM = m(parcel, i);
        parcel.writeStrongBinder(iBinder);
        n(parcel, iM);
    }

    public static void e(Parcel parcel, int i, int[] iArr) {
        if (iArr == null) {
            return;
        }
        int iM = m(parcel, i);
        parcel.writeIntArray(iArr);
        n(parcel, iM);
    }

    public static void f(Parcel parcel, int i, Integer num) {
        if (num == null) {
            return;
        }
        o(parcel, i, 4);
        parcel.writeInt(num.intValue());
    }

    public static void g(Parcel parcel, int i, Long l) {
        if (l == null) {
            return;
        }
        o(parcel, i, 8);
        parcel.writeLong(l.longValue());
    }

    public static void h(Parcel parcel, int i, Parcelable parcelable, int i2, boolean z) {
        if (parcelable == null) {
            if (z) {
                o(parcel, i, 0);
            }
        } else {
            int iM = m(parcel, i);
            parcelable.writeToParcel(parcel, i2);
            n(parcel, iM);
        }
    }

    public static void i(Parcel parcel, int i, String str, boolean z) {
        if (str == null) {
            if (z) {
                o(parcel, i, 0);
            }
        } else {
            int iM = m(parcel, i);
            parcel.writeString(str);
            n(parcel, iM);
        }
    }

    public static void j(Parcel parcel, int i, List list) {
        if (list == null) {
            return;
        }
        int iM = m(parcel, i);
        parcel.writeStringList(list);
        n(parcel, iM);
    }

    public static void k(Parcel parcel, int i, Parcelable[] parcelableArr, int i2) {
        if (parcelableArr == null) {
            return;
        }
        int iM = m(parcel, i);
        parcel.writeInt(parcelableArr.length);
        for (Parcelable parcelable : parcelableArr) {
            if (parcelable == null) {
                parcel.writeInt(0);
            } else {
                int iDataPosition = parcel.dataPosition();
                parcel.writeInt(1);
                int iDataPosition2 = parcel.dataPosition();
                parcelable.writeToParcel(parcel, i2);
                int iDataPosition3 = parcel.dataPosition();
                parcel.setDataPosition(iDataPosition);
                parcel.writeInt(iDataPosition3 - iDataPosition2);
                parcel.setDataPosition(iDataPosition3);
            }
        }
        n(parcel, iM);
    }

    public static void l(Parcel parcel, int i, List list, boolean z) {
        if (list == null) {
            if (z) {
                o(parcel, i, 0);
                return;
            }
            return;
        }
        int iM = m(parcel, i);
        int size = list.size();
        parcel.writeInt(size);
        for (int i2 = 0; i2 < size; i2++) {
            Parcelable parcelable = (Parcelable) list.get(i2);
            if (parcelable == null) {
                parcel.writeInt(0);
            } else {
                int iDataPosition = parcel.dataPosition();
                parcel.writeInt(1);
                int iDataPosition2 = parcel.dataPosition();
                parcelable.writeToParcel(parcel, 0);
                int iDataPosition3 = parcel.dataPosition();
                parcel.setDataPosition(iDataPosition);
                parcel.writeInt(iDataPosition3 - iDataPosition2);
                parcel.setDataPosition(iDataPosition3);
            }
        }
        n(parcel, iM);
    }

    public static int m(Parcel parcel, int i) {
        parcel.writeInt(i | (-65536));
        parcel.writeInt(0);
        return parcel.dataPosition();
    }

    public static void n(Parcel parcel, int i) {
        int iDataPosition = parcel.dataPosition();
        parcel.setDataPosition(i - 4);
        parcel.writeInt(iDataPosition - i);
        parcel.setDataPosition(iDataPosition);
    }

    public static void o(Parcel parcel, int i, int i2) {
        parcel.writeInt(i | (i2 << 16));
    }
}
