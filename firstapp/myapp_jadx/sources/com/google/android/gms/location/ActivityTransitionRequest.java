package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.hm20;
import defpackage.hxa;
import defpackage.i3l0;
import defpackage.scy;
import defpackage.t5l0;
import defpackage.uif;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.TreeSet;

/* JADX INFO: loaded from: classes4.dex */
public class ActivityTransitionRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator<ActivityTransitionRequest> CREATOR = new t5l0();
    public static final i3l0 e = new i3l0();
    public final List a;
    public final String b;
    public final List c;
    public final String d;

    public ActivityTransitionRequest(ArrayList arrayList, String str, ArrayList arrayList2, String str2) {
        hm20.i(arrayList, "transitions can't be null");
        hm20.a("transitions can't be empty.", !arrayList.isEmpty());
        TreeSet treeSet = new TreeSet(e);
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            ActivityTransition activityTransition = (ActivityTransition) obj;
            hm20.a(String.format("Found duplicated transition: %s.", activityTransition), treeSet.add(activityTransition));
        }
        this.a = Collections.unmodifiableList(arrayList);
        this.b = str;
        this.c = arrayList2 == null ? Collections.EMPTY_LIST : Collections.unmodifiableList(arrayList2);
        this.d = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            ActivityTransitionRequest activityTransitionRequest = (ActivityTransitionRequest) obj;
            if (scy.a(this.a, activityTransitionRequest.a) && scy.a(this.b, activityTransitionRequest.b) && scy.a(this.d, activityTransitionRequest.d) && scy.a(this.c, activityTransitionRequest.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        String str = this.b;
        int iHashCode2 = (iHashCode + (str != null ? str.hashCode() : 0)) * 31;
        List list = this.c;
        int iHashCode3 = (iHashCode2 + (list != null ? list.hashCode() : 0)) * 31;
        String str2 = this.d;
        return iHashCode3 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        String strValueOf = String.valueOf(this.a);
        String strValueOf2 = String.valueOf(this.c);
        int length = strValueOf.length();
        String str = this.b;
        int length2 = String.valueOf(str).length();
        int length3 = strValueOf2.length();
        String str2 = this.d;
        StringBuilder sb = new StringBuilder(length + 48 + length2 + 12 + length3 + 18 + String.valueOf(str2).length() + 1);
        hxa.c(sb, "ActivityTransitionRequest [mTransitions=", strValueOf, ", mTag='", str);
        hxa.c(sb, "', mClients=", strValueOf2, ", mAttributionTag=", str2);
        sb.append("]");
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        hm20.h(parcel);
        int iM = uif.m(parcel, 20293);
        uif.l(parcel, 1, this.a, false);
        uif.i(parcel, 2, this.b, false);
        uif.l(parcel, 3, this.c, false);
        uif.i(parcel, 4, this.d, false);
        uif.n(parcel, iM);
    }
}
