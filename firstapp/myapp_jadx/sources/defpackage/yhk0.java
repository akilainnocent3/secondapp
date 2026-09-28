package defpackage;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.auth.api.signin.internal.GoogleSignInOptionsExtensionParcelable;
import com.google.android.gms.common.api.Scope;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes4.dex */
public final class yhk0 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int iV = tr60.v(parcel);
        ArrayList arrayListJ = null;
        ArrayList arrayListJ2 = null;
        Account account = null;
        String strF = null;
        String strF2 = null;
        String strF3 = null;
        int iP = 0;
        boolean zL = false;
        boolean zL2 = false;
        boolean zL3 = false;
        while (parcel.dataPosition() < iV) {
            int i = parcel.readInt();
            switch ((char) i) {
                case 1:
                    iP = tr60.p(parcel, i);
                    break;
                case 2:
                    arrayListJ2 = tr60.j(parcel, i, Scope.CREATOR);
                    break;
                case 3:
                    account = (Account) tr60.e(parcel, i, Account.CREATOR);
                    break;
                case 4:
                    zL = tr60.l(parcel, i);
                    break;
                case 5:
                    zL2 = tr60.l(parcel, i);
                    break;
                case 6:
                    zL3 = tr60.l(parcel, i);
                    break;
                case 7:
                    strF = tr60.f(parcel, i);
                    break;
                case '\b':
                    strF2 = tr60.f(parcel, i);
                    break;
                case '\t':
                    arrayListJ = tr60.j(parcel, i, GoogleSignInOptionsExtensionParcelable.CREATOR);
                    break;
                case '\n':
                    strF3 = tr60.f(parcel, i);
                    break;
                default:
                    tr60.u(parcel, i);
                    break;
            }
        }
        tr60.k(parcel, iV);
        return new GoogleSignInOptions(iP, arrayListJ2, account, zL, zL2, zL3, strF, strF2, GoogleSignInOptions.K0(arrayListJ), strF3);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new GoogleSignInOptions[i];
    }
}
