package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.util.Log;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes4.dex */
public final class nsl0 extends jjl0 {
    public final /* synthetic */ IBinder b;
    public final /* synthetic */ mtl0 c;

    public nsl0(mtl0 mtl0Var, IBinder iBinder) {
        this.c = mtl0Var;
        this.b = iBinder;
    }

    @Override // defpackage.jjl0
    public final void a() {
        a1l0 kwk0Var;
        vtl0 vtl0Var = this.c.a;
        int i = azk0.a;
        IBinder iBinder = this.b;
        if (iBinder == null) {
            kwk0Var = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.play.core.appupdate.protocol.IAppUpdateService");
            kwk0Var = iInterfaceQueryLocalInterface instanceof a1l0 ? (a1l0) iInterfaceQueryLocalInterface : new kwk0(iBinder);
        }
        vtl0Var.m = kwk0Var;
        int i2 = 0;
        vtl0Var.b.a("linkToDeath", new Object[0]);
        try {
            vtl0Var.m.asBinder().linkToDeath(vtl0Var.j, 0);
        } catch (RemoteException e) {
            wgl0 wgl0Var = vtl0Var.b;
            Object[] objArr = new Object[0];
            wgl0Var.getClass();
            if (Log.isLoggable("PlayCore", 6)) {
                Log.e("PlayCore", wgl0.b(wgl0Var.a, "linkToDeath failed", objArr), e);
            }
        }
        vtl0Var.g = false;
        ArrayList arrayList = vtl0Var.d;
        int size = arrayList.size();
        while (i2 < size) {
            Object obj = arrayList.get(i2);
            i2++;
            ((Runnable) obj).run();
        }
        vtl0Var.d.clear();
    }
}
