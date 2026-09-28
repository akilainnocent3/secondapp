package defpackage;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes4.dex */
public abstract class yek0 extends eek0 implements zek0 {
    public yek0() {
        super("com.google.android.play.core.integrity.protocol.IRequestDialogCallback");
    }

    @Override // defpackage.eek0
    public final boolean a(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i != 2) {
            return false;
        }
        Parcelable.Creator creator = Bundle.CREATOR;
        Bundle bundle = (Bundle) jek0.a(parcel);
        jek0.b(parcel);
        b(bundle);
        return true;
    }
}
