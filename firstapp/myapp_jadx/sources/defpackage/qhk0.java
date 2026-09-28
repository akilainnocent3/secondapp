package defpackage;

import android.os.Parcel;
import com.google.android.gms.signin.internal.zak;

/* JADX INFO: loaded from: classes4.dex */
public abstract class qhk0 extends agk0 {
    @Override // defpackage.agk0
    public final boolean Z(int i, Parcel parcel, Parcel parcel2) {
        switch (i) {
            case 3:
                ugk0.b(parcel);
                break;
            case 4:
                ugk0.b(parcel);
                break;
            case 5:
            default:
                return false;
            case 6:
                ugk0.b(parcel);
                break;
            case 7:
                ugk0.b(parcel);
                break;
            case 8:
                zak zakVar = (zak) ugk0.a(parcel, zak.CREATOR);
                ugk0.b(parcel);
                ihk0 ihk0Var = (ihk0) this;
                ihk0Var.b.post(new hhk0(ihk0Var, zakVar));
                break;
            case 9:
                ugk0.b(parcel);
                break;
        }
        parcel2.writeNoException();
        return true;
    }
}
