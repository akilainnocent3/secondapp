package com.google.android.gms.common.api;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.mq0;
import defpackage.uif;
import defpackage.zuk0;
import java.util.Arrays;

/* JADX INFO: loaded from: classes4.dex */
public final class ComplianceOptions extends AbstractSafeParcelable {
    public static final Parcelable.Creator<ComplianceOptions> CREATOR;
    public final int a;
    public final int b;
    public final int c;
    public final boolean d;

    static {
        new ComplianceOptions(-1, -1, 0, true);
        CREATOR = new zuk0();
    }

    public ComplianceOptions(int i, int i2, int i3, boolean z) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = z;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof ComplianceOptions)) {
            return false;
        }
        ComplianceOptions complianceOptions = (ComplianceOptions) obj;
        return this.a == complianceOptions.a && this.b == complianceOptions.b && this.c == complianceOptions.c && this.d == complianceOptions.d;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.a), Integer.valueOf(this.b), Integer.valueOf(this.c), Boolean.valueOf(this.d)});
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ComplianceOptions{callerProductId=");
        sb.append(this.a);
        sb.append(", dataOwnerProductId=");
        sb.append(this.b);
        sb.append(", processingReason=");
        sb.append(this.c);
        sb.append(", isUserData=");
        return mq0.a(sb, this.d, "}");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iM = uif.m(parcel, 20293);
        uif.o(parcel, 1, 4);
        parcel.writeInt(this.a);
        uif.o(parcel, 2, 4);
        parcel.writeInt(this.b);
        uif.o(parcel, 3, 4);
        parcel.writeInt(this.c);
        uif.o(parcel, 4, 4);
        parcel.writeInt(this.d ? 1 : 0);
        uif.n(parcel, iM);
    }
}
