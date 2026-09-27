package androidx.media3.session.legacy;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;
import k.y0;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes2.dex */
@y0({y0.a.LIBRARY})
public final class c {
    public static <T extends Parcelable, U extends Parcelable> T a(U u10, Parcelable.Creator<T> creator) {
        if (u10 == null) {
            return null;
        }
        Parcel parcelObtain = Parcel.obtain();
        try {
            u10.writeToParcel(parcelObtain, 0);
            parcelObtain.setDataPosition(0);
            return creator.createFromParcel(parcelObtain);
        } finally {
            parcelObtain.recycle();
        }
    }

    public static <T extends Parcelable, U extends Parcelable> ArrayList<T> b(List<U> list, Parcelable.Creator<T> creator) {
        if (list == null) {
            return null;
        }
        su.a aVar = (ArrayList<T>) new ArrayList();
        for (int i10 = 0; i10 < list.size(); i10++) {
            aVar.add(a(list.get(i10), creator));
        }
        return aVar;
    }
}
