package defpackage;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.view.View;
import com.google.android.gms.common.internal.zax;

/* JADX INFO: loaded from: classes4.dex */
public final class pjk0 extends n650 {
    public static final pjk0 b = new pjk0();

    public static View c(Context context, int i, int i2) throws n650.a {
        pjk0 pjk0Var = b;
        try {
            zax zaxVar = new zax(1, i, i2, null);
            return (View) rcy.d(((sik0) pjk0Var.b(context)).a(new rcy(context), zaxVar));
        } catch (Exception e) {
            throw new n650.a(whs.b(i, i2, "Could not get button with size ", " and color "), e);
        }
    }

    @Override // defpackage.n650
    public final sik0 a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.ISignInButtonCreator");
        return iInterfaceQueryLocalInterface instanceof sik0 ? (sik0) iInterfaceQueryLocalInterface : new sik0(iBinder, "com.google.android.gms.common.internal.ISignInButtonCreator");
    }
}
