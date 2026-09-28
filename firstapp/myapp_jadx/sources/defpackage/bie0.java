package defpackage;

import android.view.Surface;
import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: classes.dex */
public final class bie0 implements cbj<Surface> {
    public final /* synthetic */ qis a;
    public final /* synthetic */ nv5.a b;
    public final /* synthetic */ String c;

    public bie0(qis qisVar, nv5.a aVar, String str) {
        this.a = qisVar;
        this.b = aVar;
        this.c = str;
    }

    @Override // defpackage.cbj
    public final void onFailure(Throwable th) {
        boolean z = th instanceof CancellationException;
        nv5.a aVar = this.b;
        if (z) {
            km20.g(null, aVar.d(new cie0.b(this.c.concat(" cancelled."), th)));
        } else {
            aVar.b(null);
        }
    }

    @Override // defpackage.cbj
    public final void onSuccess(Surface surface) {
        obj.e(this.a, this.b);
    }
}
