package defpackage;

import android.accounts.Account;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.identity.AuthorizationRequest;
import com.google.android.gms.common.api.Scope;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes4.dex */
public final class ujk0 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int iV = tr60.v(parcel);
        boolean zL = false;
        boolean zL2 = false;
        boolean zL3 = false;
        boolean zL4 = false;
        ArrayList arrayListJ = null;
        String strF = null;
        Account account = null;
        String strF2 = null;
        String strF3 = null;
        Bundle bundleB = null;
        while (parcel.dataPosition() < iV) {
            int i = parcel.readInt();
            switch ((char) i) {
                case 1:
                    arrayListJ = tr60.j(parcel, i, Scope.CREATOR);
                    break;
                case 2:
                    strF = tr60.f(parcel, i);
                    break;
                case 3:
                    zL = tr60.l(parcel, i);
                    break;
                case 4:
                    zL2 = tr60.l(parcel, i);
                    break;
                case 5:
                    account = (Account) tr60.e(parcel, i, Account.CREATOR);
                    break;
                case 6:
                    strF2 = tr60.f(parcel, i);
                    break;
                case 7:
                    strF3 = tr60.f(parcel, i);
                    break;
                case '\b':
                    zL3 = tr60.l(parcel, i);
                    break;
                case '\t':
                    bundleB = tr60.b(parcel, i);
                    break;
                case '\n':
                    zL4 = tr60.l(parcel, i);
                    break;
                default:
                    tr60.u(parcel, i);
                    break;
            }
        }
        tr60.k(parcel, iV);
        return new AuthorizationRequest(arrayListJ, strF, zL, zL2, account, strF2, strF3, zL3, bundleB, zL4);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new AuthorizationRequest[i];
    }
}
