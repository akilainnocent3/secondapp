package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes4.dex */
public final class ldk0 extends bfk0 {
    public final /* synthetic */ IBinder i;
    public final /* synthetic */ ndk0 v;

    public ldk0(ndk0 ndk0Var, IBinder iBinder) {
        this.i = iBinder;
        this.v = ndk0Var;
    }

    @Override // defpackage.bfk0
    public final void b() {
        odk0 odk0Var = this.v.a;
        hfk0 hfk0Var = odk0Var.i;
        ArrayList arrayList = odk0Var.d;
        odk0Var.n = (IInterface) hfk0Var.a(this.i);
        afk0 afk0Var = odk0Var.b;
        int i = 0;
        afk0Var.c("linkToDeath", new Object[0]);
        try {
            odk0Var.n.asBinder().linkToDeath(odk0Var.k, 0);
        } catch (RemoteException e) {
            afk0Var.b(e, "linkToDeath failed", new Object[0]);
        }
        odk0Var.g = false;
        int size = arrayList.size();
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            ((Runnable) obj).run();
        }
        arrayList.clear();
    }
}
