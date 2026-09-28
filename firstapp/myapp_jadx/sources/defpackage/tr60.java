package defpackage;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes4.dex */
public final class tr60 {

    public static class a extends RuntimeException {
        public a(String str, Parcel parcel) {
            super(str + " Parcel: pos=" + parcel.dataPosition() + " size=" + parcel.dataSize());
        }
    }

    public static BigDecimal a(Parcel parcel, int i) {
        int iT = t(parcel, i);
        int iDataPosition = parcel.dataPosition();
        if (iT == 0) {
            return null;
        }
        byte[] bArrCreateByteArray = parcel.createByteArray();
        int i2 = parcel.readInt();
        parcel.setDataPosition(iDataPosition + iT);
        return new BigDecimal(new BigInteger(bArrCreateByteArray), i2);
    }

    public static Bundle b(Parcel parcel, int i) {
        int iT = t(parcel, i);
        int iDataPosition = parcel.dataPosition();
        if (iT == 0) {
            return null;
        }
        Bundle bundle = parcel.readBundle();
        parcel.setDataPosition(iDataPosition + iT);
        return bundle;
    }

    public static byte[] c(Parcel parcel, int i) {
        int iT = t(parcel, i);
        int iDataPosition = parcel.dataPosition();
        if (iT == 0) {
            return null;
        }
        byte[] bArrCreateByteArray = parcel.createByteArray();
        parcel.setDataPosition(iDataPosition + iT);
        return bArrCreateByteArray;
    }

    public static int[] d(Parcel parcel, int i) {
        int iT = t(parcel, i);
        int iDataPosition = parcel.dataPosition();
        if (iT == 0) {
            return null;
        }
        int[] iArrCreateIntArray = parcel.createIntArray();
        parcel.setDataPosition(iDataPosition + iT);
        return iArrCreateIntArray;
    }

    public static <T extends Parcelable> T e(Parcel parcel, int i, Parcelable.Creator<T> creator) {
        int iT = t(parcel, i);
        int iDataPosition = parcel.dataPosition();
        if (iT == 0) {
            return null;
        }
        T tCreateFromParcel = creator.createFromParcel(parcel);
        parcel.setDataPosition(iDataPosition + iT);
        return tCreateFromParcel;
    }

    public static String f(Parcel parcel, int i) {
        int iT = t(parcel, i);
        int iDataPosition = parcel.dataPosition();
        if (iT == 0) {
            return null;
        }
        String string = parcel.readString();
        parcel.setDataPosition(iDataPosition + iT);
        return string;
    }

    public static String[] g(Parcel parcel, int i) {
        int iT = t(parcel, i);
        int iDataPosition = parcel.dataPosition();
        if (iT == 0) {
            return null;
        }
        String[] strArrCreateStringArray = parcel.createStringArray();
        parcel.setDataPosition(iDataPosition + iT);
        return strArrCreateStringArray;
    }

    public static ArrayList<String> h(Parcel parcel, int i) {
        int iT = t(parcel, i);
        int iDataPosition = parcel.dataPosition();
        if (iT == 0) {
            return null;
        }
        ArrayList<String> arrayListCreateStringArrayList = parcel.createStringArrayList();
        parcel.setDataPosition(iDataPosition + iT);
        return arrayListCreateStringArrayList;
    }

    public static <T> T[] i(Parcel parcel, int i, Parcelable.Creator<T> creator) {
        int iT = t(parcel, i);
        int iDataPosition = parcel.dataPosition();
        if (iT == 0) {
            return null;
        }
        T[] tArr = (T[]) parcel.createTypedArray(creator);
        parcel.setDataPosition(iDataPosition + iT);
        return tArr;
    }

    public static <T> ArrayList<T> j(Parcel parcel, int i, Parcelable.Creator<T> creator) {
        int iT = t(parcel, i);
        int iDataPosition = parcel.dataPosition();
        if (iT == 0) {
            return null;
        }
        ArrayList<T> arrayListCreateTypedArrayList = parcel.createTypedArrayList(creator);
        parcel.setDataPosition(iDataPosition + iT);
        return arrayListCreateTypedArrayList;
    }

    public static void k(Parcel parcel, int i) {
        if (parcel.dataPosition() != i) {
            throw new a(hce0.a(i, "Overread allowed size end="), parcel);
        }
    }

    public static boolean l(Parcel parcel, int i) {
        x(parcel, i, 4);
        return parcel.readInt() != 0;
    }

    public static Double m(Parcel parcel, int i) {
        int iT = t(parcel, i);
        if (iT == 0) {
            return null;
        }
        w(parcel, iT, 8);
        return Double.valueOf(parcel.readDouble());
    }

    public static float n(Parcel parcel, int i) {
        x(parcel, i, 4);
        return parcel.readFloat();
    }

    public static IBinder o(Parcel parcel, int i) {
        int iT = t(parcel, i);
        int iDataPosition = parcel.dataPosition();
        if (iT == 0) {
            return null;
        }
        IBinder strongBinder = parcel.readStrongBinder();
        parcel.setDataPosition(iDataPosition + iT);
        return strongBinder;
    }

    public static int p(Parcel parcel, int i) {
        x(parcel, i, 4);
        return parcel.readInt();
    }

    public static Integer q(Parcel parcel, int i) {
        int iT = t(parcel, i);
        if (iT == 0) {
            return null;
        }
        w(parcel, iT, 4);
        return Integer.valueOf(parcel.readInt());
    }

    public static long r(Parcel parcel, int i) {
        x(parcel, i, 8);
        return parcel.readLong();
    }

    public static Long s(Parcel parcel, int i) {
        int iT = t(parcel, i);
        if (iT == 0) {
            return null;
        }
        w(parcel, iT, 8);
        return Long.valueOf(parcel.readLong());
    }

    public static int t(Parcel parcel, int i) {
        return (i & (-65536)) != -65536 ? (char) (i >> 16) : parcel.readInt();
    }

    public static void u(Parcel parcel, int i) {
        parcel.setDataPosition(parcel.dataPosition() + t(parcel, i));
    }

    public static int v(Parcel parcel) {
        int i = parcel.readInt();
        int iT = t(parcel, i);
        char c = (char) i;
        int iDataPosition = parcel.dataPosition();
        if (c != 20293) {
            throw new a("Expected object header. Got 0x".concat(String.valueOf(Integer.toHexString(i))), parcel);
        }
        int i2 = iT + iDataPosition;
        if (i2 < iDataPosition || i2 > parcel.dataSize()) {
            throw new a(whs.b(iDataPosition, i2, "Size read is invalid start=", " end="), parcel);
        }
        return i2;
    }

    public static void w(Parcel parcel, int i, int i2) {
        if (i == i2) {
            return;
        }
        throw new a(uf80.a(dy5.a("Expected size ", i2, i, " got ", " (0x"), Integer.toHexString(i), ")"), parcel);
    }

    public static void x(Parcel parcel, int i, int i2) {
        int iT = t(parcel, i);
        if (iT == i2) {
            return;
        }
        throw new a(uf80.a(dy5.a("Expected size ", i2, iT, " got ", " (0x"), Integer.toHexString(iT), ")"), parcel);
    }
}
