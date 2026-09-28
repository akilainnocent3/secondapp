package defpackage;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.location.ActivityRecognitionResult;
import com.google.android.gms.location.DetectedActivity;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes4.dex */
public final class gwk0 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int iV = tr60.v(parcel);
        ArrayList arrayListJ = null;
        boolean z = false;
        Bundle bundleB = null;
        int iP = 0;
        long jR = 0;
        long jR2 = 0;
        while (parcel.dataPosition() < iV) {
            int i = parcel.readInt();
            char c = (char) i;
            if (c == 1) {
                arrayListJ = tr60.j(parcel, i, DetectedActivity.CREATOR);
            } else if (c == 2) {
                jR = tr60.r(parcel, i);
            } else if (c == 3) {
                jR2 = tr60.r(parcel, i);
            } else if (c == 4) {
                iP = tr60.p(parcel, i);
            } else if (c != 5) {
                tr60.u(parcel, i);
            } else {
                bundleB = tr60.b(parcel, i);
            }
        }
        tr60.k(parcel, iV);
        ActivityRecognitionResult activityRecognitionResult = new ActivityRecognitionResult();
        hm20.a("Must have at least 1 detected activity", (arrayListJ == null || arrayListJ.isEmpty()) ? false : true);
        if (jR > 0 && jR2 > 0) {
            z = true;
        }
        hm20.a("Must set times", z);
        activityRecognitionResult.a = arrayListJ;
        activityRecognitionResult.b = jR;
        activityRecognitionResult.c = jR2;
        activityRecognitionResult.d = iP;
        activityRecognitionResult.e = bundleB;
        return activityRecognitionResult;
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new ActivityRecognitionResult[i];
    }
}
