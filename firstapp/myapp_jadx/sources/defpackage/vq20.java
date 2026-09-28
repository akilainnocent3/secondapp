package defpackage;

import androidx.camera.view.PreviewView;
import androidx.camera.view.a;
import androidx.camera.view.c;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class vq20 implements c.a {
    public final /* synthetic */ PreviewView.a a;
    public final /* synthetic */ a b;
    public final /* synthetic */ n26 c;

    public /* synthetic */ vq20(PreviewView.a aVar, a aVar2, n26 n26Var) {
        this.a = aVar;
        this.b = aVar2;
        this.c = n26Var;
    }

    public final void a() {
        a aVar;
        AtomicReference<a> atomicReference = PreviewView.this.i;
        do {
            aVar = this.b;
            if (atomicReference.compareAndSet(aVar, null)) {
                aVar.b(PreviewView.f.a);
                break;
            }
        } while (atomicReference.get() == aVar);
        dbj dbjVar = aVar.e;
        if (dbjVar != null) {
            dbjVar.cancel(false);
            aVar.e = null;
        }
        this.c.b().b(aVar);
    }
}
