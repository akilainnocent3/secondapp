package defpackage;

import android.os.Parcel;
import com.google.android.gms.tasks.TaskCompletionSource;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class zc9 implements z550 {
    public static final op8 a = new op8(-1865511441, new yc9(), false);

    public static final boolean a(xvf0 xvf0Var, xvf0 xvf0Var2) {
        xvf0Var2.getClass();
        if (xvf0Var.b() && xvf0Var2.b()) {
            return true;
        }
        return Intrinsics.g(xvf0Var.b, xvf0Var2.b);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.z550
    public void accept(Object obj, Object obj2) {
        o5l0 o5l0Var = (o5l0) ((itl0) obj).v();
        pmk0 pmk0Var = new pmk0((TaskCompletionSource) obj2);
        Parcel parcelObtain = Parcel.obtain();
        parcelObtain.writeInterfaceToken("com.google.android.gms.auth.api.phone.internal.ISmsRetrieverApiService");
        parcelObtain.writeString(null);
        int i = juk0.a;
        parcelObtain.writeStrongBinder(pmk0Var);
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            o5l0Var.a.transact(2, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
        } finally {
            parcelObtain.recycle();
            parcelObtain2.recycle();
        }
    }
}
