package com.google.android.gms.common.api;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.sporty.android.core.model.tracking.AnalyticsParam;
import com.sportybet.plugin.realsports.search.widget.searchprematchpanel.SEfl.gvQvkPPtA;
import defpackage.bj50;
import defpackage.ezk0;
import defpackage.hce0;
import defpackage.scy;
import defpackage.uif;
import java.util.Arrays;

/* JADX INFO: loaded from: classes4.dex */
public final class Status extends AbstractSafeParcelable implements bj50, ReflectedParcelable {
    public static final Parcelable.Creator<Status> CREATOR;
    public static final Status e;
    public static final Status f;
    public static final Status i;
    public static final Status v;
    public static final Status w;
    public final int a;
    public final String b;
    public final PendingIntent c;
    public final ConnectionResult d;

    static {
        new Status(-1, null, null, null);
        e = new Status(0, null, null, null);
        f = new Status(14, null, null, null);
        i = new Status(8, null, null, null);
        v = new Status(15, null, null, null);
        w = new Status(16, null, null, null);
        new Status(17, null, null, null);
        new Status(18, null, null, null);
        CREATOR = new ezk0();
    }

    public Status(int i2, String str, PendingIntent pendingIntent, ConnectionResult connectionResult) {
        this.a = i2;
        this.b = str;
        this.c = pendingIntent;
        this.d = connectionResult;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof Status)) {
            return false;
        }
        Status status = (Status) obj;
        return this.a == status.a && scy.a(this.b, status.b) && scy.a(this.c, status.c) && scy.a(this.d, status.d);
    }

    @Override // defpackage.bj50
    public final Status getStatus() {
        return this;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.a), this.b, this.c, this.d});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        int iM = uif.m(parcel, 20293);
        uif.o(parcel, 1, 4);
        parcel.writeInt(this.a);
        uif.i(parcel, 2, this.b, false);
        uif.h(parcel, 3, this.c, i2, false);
        uif.h(parcel, 4, this.d, i2, false);
        uif.n(parcel, iM);
    }

    public final String toString() {
        scy.a aVar = new scy.a(this);
        String strA = this.b;
        if (strA == null) {
            int i2 = this.a;
            switch (i2) {
                case -1:
                    strA = "SUCCESS_CACHE";
                    break;
                case 0:
                    strA = "SUCCESS";
                    break;
                case 1:
                case 9:
                case 11:
                case 12:
                default:
                    strA = hce0.a(i2, "unknown status code: ");
                    break;
                case 2:
                    strA = "SERVICE_VERSION_UPDATE_REQUIRED";
                    break;
                case 3:
                    strA = gvQvkPPtA.gnnfjR;
                    break;
                case 4:
                    strA = "SIGN_IN_REQUIRED";
                    break;
                case 5:
                    strA = "INVALID_ACCOUNT";
                    break;
                case 6:
                    strA = "RESOLUTION_REQUIRED";
                    break;
                case 7:
                    strA = "NETWORK_ERROR";
                    break;
                case 8:
                    strA = "INTERNAL_ERROR";
                    break;
                case 10:
                    strA = "DEVELOPER_ERROR";
                    break;
                case 13:
                    strA = "ERROR";
                    break;
                case 14:
                    strA = "INTERRUPTED";
                    break;
                case 15:
                    strA = "TIMEOUT";
                    break;
                case 16:
                    strA = "CANCELED";
                    break;
                case 17:
                    strA = "API_NOT_CONNECTED";
                    break;
                case 18:
                    strA = "DEAD_CLIENT";
                    break;
                case 19:
                    strA = "REMOTE_EXCEPTION";
                    break;
                case 20:
                    strA = "CONNECTION_SUSPENDED_DURING_CALL";
                    break;
                case 21:
                    strA = "RECONNECTION_TIMED_OUT_DURING_UPDATE";
                    break;
                case 22:
                    strA = "RECONNECTION_TIMED_OUT";
                    break;
            }
        }
        aVar.a(strA, "statusCode");
        aVar.a(this.c, AnalyticsParam.EVENT_PARAM_RESOLUTION);
        return aVar.toString();
    }
}
