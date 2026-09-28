package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.util.Log;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes4.dex */
public final class lnl0 extends dal0 {
    public final /* synthetic */ IBinder b;
    public final /* synthetic */ brl0 c;

    public lnl0(brl0 brl0Var, IBinder iBinder) {
        this.b = iBinder;
        this.c = brl0Var;
    }

    @Override // defpackage.dal0
    public final void a() {
        c1l0 lwk0Var;
        esl0 esl0Var = this.c.a;
        int i = bzk0.a;
        IBinder iBinder = this.b;
        if (iBinder == null) {
            lwk0Var = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.play.core.inappreview.protocol.IInAppReviewService");
            lwk0Var = iInterfaceQueryLocalInterface instanceof c1l0 ? (c1l0) iInterfaceQueryLocalInterface : new lwk0(iBinder);
        }
        esl0Var.m = lwk0Var;
        v7l0 v7l0Var = esl0Var.b;
        int i2 = 0;
        v7l0Var.a("linkToDeath", new Object[0]);
        try {
            esl0Var.m.asBinder().linkToDeath(esl0Var.j, 0);
        } catch (RemoteException e) {
            Object[] objArr = new Object[0];
            v7l0Var.getClass();
            if (Log.isLoggable("PlayCore", 6)) {
                Log.e("PlayCore", v7l0.c(v7l0Var.a, "linkToDeath failed", objArr), e);
            }
        }
        esl0Var.g = false;
        ArrayList arrayList = esl0Var.d;
        int size = arrayList.size();
        while (i2 < size) {
            Object obj = arrayList.get(i2);
            i2++;
            ((Runnable) obj).run();
        }
        esl0Var.d.clear();
    }
}
