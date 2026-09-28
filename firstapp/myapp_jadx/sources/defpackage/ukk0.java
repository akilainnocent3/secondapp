package defpackage;

import android.os.Parcel;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.api.Status;
import okhttp3.internal.http.HttpStatusCodesKt;

/* JADX INFO: loaded from: classes4.dex */
public final class ukk0 extends vkk0 {
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.common.api.internal.a
    public final void h(sl0.b bVar) {
        nkk0 nkk0Var = (nkk0) bVar;
        elk0 elk0Var = (elk0) nkk0Var.v();
        skk0 skk0Var = new skk0(this);
        GoogleSignInOptions googleSignInOptions = nkk0Var.B;
        Parcel parcelObtain = Parcel.obtain();
        parcelObtain.writeInterfaceToken(elk0Var.b);
        int i = ikk0.a;
        parcelObtain.writeStrongBinder(skk0Var);
        if (googleSignInOptions == null) {
            parcelObtain.writeInt(0);
        } else {
            parcelObtain.writeInt(1);
            googleSignInOptions.writeToParcel(parcelObtain, 0);
        }
        elk0Var.a(parcelObtain, HttpStatusCodesKt.HTTP_EARLY_HINTS);
    }

    @Override // com.google.android.gms.common.api.internal.BasePendingResult
    public final /* bridge */ /* synthetic */ bj50 b(Status status) {
        return status;
    }
}
