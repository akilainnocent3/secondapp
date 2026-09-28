package defpackage;

import android.accounts.Account;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.GetServiceRequest;

/* JADX INFO: loaded from: classes4.dex */
public final class ejl0 implements Parcelable.Creator {
    public static void a(GetServiceRequest getServiceRequest, Parcel parcel, int i) {
        int iM = uif.m(parcel, 20293);
        int i2 = getServiceRequest.a;
        uif.o(parcel, 1, 4);
        parcel.writeInt(i2);
        int i3 = getServiceRequest.b;
        uif.o(parcel, 2, 4);
        parcel.writeInt(i3);
        int i4 = getServiceRequest.c;
        uif.o(parcel, 3, 4);
        parcel.writeInt(i4);
        uif.i(parcel, 4, getServiceRequest.d, false);
        uif.d(parcel, 5, getServiceRequest.e);
        uif.k(parcel, 6, getServiceRequest.f, i);
        uif.a(parcel, 7, getServiceRequest.i);
        uif.h(parcel, 8, getServiceRequest.v, i, false);
        uif.k(parcel, 10, getServiceRequest.w, i);
        uif.k(parcel, 11, getServiceRequest.y, i);
        boolean z = getServiceRequest.z;
        uif.o(parcel, 12, 4);
        parcel.writeInt(z ? 1 : 0);
        int i5 = getServiceRequest.A;
        uif.o(parcel, 13, 4);
        parcel.writeInt(i5);
        boolean z2 = getServiceRequest.B;
        uif.o(parcel, 14, 4);
        parcel.writeInt(z2 ? 1 : 0);
        uif.i(parcel, 15, getServiceRequest.C, false);
        uif.n(parcel, iM);
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int iV = tr60.v(parcel);
        Bundle bundle = new Bundle();
        Scope[] scopeArr = GetServiceRequest.D;
        String strF = null;
        IBinder iBinderO = null;
        Account account = null;
        String strF2 = null;
        int iP = 0;
        int iP2 = 0;
        int iP3 = 0;
        boolean zL = false;
        int iP4 = 0;
        boolean zL2 = false;
        Feature[] featureArr = GetServiceRequest.E;
        Feature[] featureArr2 = featureArr;
        while (parcel.dataPosition() < iV) {
            int i = parcel.readInt();
            switch ((char) i) {
                case 1:
                    iP = tr60.p(parcel, i);
                    break;
                case 2:
                    iP2 = tr60.p(parcel, i);
                    break;
                case 3:
                    iP3 = tr60.p(parcel, i);
                    break;
                case 4:
                    strF = tr60.f(parcel, i);
                    break;
                case 5:
                    iBinderO = tr60.o(parcel, i);
                    break;
                case 6:
                    scopeArr = (Scope[]) tr60.i(parcel, i, Scope.CREATOR);
                    break;
                case 7:
                    bundle = tr60.b(parcel, i);
                    break;
                case '\b':
                    account = (Account) tr60.e(parcel, i, Account.CREATOR);
                    break;
                case '\t':
                default:
                    tr60.u(parcel, i);
                    break;
                case '\n':
                    featureArr = (Feature[]) tr60.i(parcel, i, Feature.CREATOR);
                    break;
                case 11:
                    featureArr2 = (Feature[]) tr60.i(parcel, i, Feature.CREATOR);
                    break;
                case '\f':
                    zL = tr60.l(parcel, i);
                    break;
                case '\r':
                    iP4 = tr60.p(parcel, i);
                    break;
                case 14:
                    zL2 = tr60.l(parcel, i);
                    break;
                case 15:
                    strF2 = tr60.f(parcel, i);
                    break;
            }
        }
        tr60.k(parcel, iV);
        return new GetServiceRequest(iP, iP2, iP3, strF, iBinderO, scopeArr, bundle, account, featureArr, featureArr2, zL, iP4, zL2, strF2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new GetServiceRequest[i];
    }
}
