package defpackage;

import android.os.Parcel;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class q3l0 extends mtk0 implements u3l0 {
    @Override // defpackage.u3l0
    public final void x(List list) {
        Parcel parcelB = b();
        parcelB.writeTypedList(list);
        Z(parcelB);
    }
}
