package defpackage;

import android.os.BadParcelableException;
import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.recaptchabase.ExecuteResult;
import com.google.android.gms.recaptchabase.InitResult;

/* JADX INFO: loaded from: classes4.dex */
public class krk0 extends Binder implements IInterface {
    @Override // android.os.Binder
    public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i <= 16777215) {
            parcel.enforceInterface(getInterfaceDescriptor());
        } else if (super.onTransact(i, parcel, parcel2, i2)) {
            return true;
        }
        fwk0 fwk0Var = (fwk0) this;
        if (i == 1) {
            Status status = (Status) nuk0.a(parcel, Status.CREATOR);
            InitResult initResult = (InitResult) nuk0.a(parcel, InitResult.CREATOR);
            int iDataAvail = parcel.dataAvail();
            if (iDataAvail > 0) {
                throw new BadParcelableException(hce0.a(iDataAvail, "Parcel data not fully consumed, unread size: "));
            }
            fwk0Var.u(status, initResult);
            return true;
        }
        if (i != 2) {
            return false;
        }
        Status status2 = (Status) nuk0.a(parcel, Status.CREATOR);
        ExecuteResult executeResult = (ExecuteResult) nuk0.a(parcel, ExecuteResult.CREATOR);
        int iDataAvail2 = parcel.dataAvail();
        if (iDataAvail2 > 0) {
            throw new BadParcelableException(hce0.a(iDataAvail2, "Parcel data not fully consumed, unread size: "));
        }
        fwk0Var.o(status2, executeResult);
        return true;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this;
    }
}
