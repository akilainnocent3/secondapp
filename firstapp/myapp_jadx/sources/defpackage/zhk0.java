package defpackage;

import android.database.CursorWindow;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.data.DataHolder;

/* JADX INFO: loaded from: classes4.dex */
public final class zhk0 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int iV = tr60.v(parcel);
        String[] strArrG = null;
        CursorWindow[] cursorWindowArr = null;
        Bundle bundleB = null;
        int iP = 0;
        int iP2 = 0;
        while (parcel.dataPosition() < iV) {
            int i = parcel.readInt();
            char c = (char) i;
            if (c == 1) {
                strArrG = tr60.g(parcel, i);
            } else if (c == 2) {
                cursorWindowArr = (CursorWindow[]) tr60.i(parcel, i, CursorWindow.CREATOR);
            } else if (c == 3) {
                iP2 = tr60.p(parcel, i);
            } else if (c == 4) {
                bundleB = tr60.b(parcel, i);
            } else if (c != 1000) {
                tr60.u(parcel, i);
            } else {
                iP = tr60.p(parcel, i);
            }
        }
        tr60.k(parcel, iV);
        DataHolder dataHolder = new DataHolder(iP, strArrG, cursorWindowArr, iP2, bundleB);
        dataHolder.c = new Bundle();
        int i2 = 0;
        while (true) {
            String[] strArr = dataHolder.b;
            if (i2 >= strArr.length) {
                break;
            }
            dataHolder.c.putInt(strArr[i2], i2);
            i2++;
        }
        CursorWindow[] cursorWindowArr2 = dataHolder.d;
        dataHolder.i = new int[cursorWindowArr2.length];
        int numRows = 0;
        for (int i3 = 0; i3 < cursorWindowArr2.length; i3++) {
            dataHolder.i[i3] = numRows;
            numRows += cursorWindowArr2[i3].getNumRows() - (numRows - cursorWindowArr2[i3].getStartPosition());
        }
        return dataHolder;
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new DataHolder[i];
    }
}
