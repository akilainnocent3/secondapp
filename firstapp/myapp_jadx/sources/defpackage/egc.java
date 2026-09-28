package defpackage;

import androidx.camera.core.d;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class egc implements nm20, jan.a {
    public final /* synthetic */ Object a;

    @Override // jan.a
    public void a(jan janVar) {
        d dVar = (d) this.a;
        synchronized (dVar.a) {
            dVar.c++;
        }
        dVar.l(janVar);
    }

    @Override // defpackage.nm20
    public boolean test(Object obj) {
        cgc cgcVar = (cgc) this.a;
        obj.getClass();
        return ((Boolean) cgcVar.invoke(obj)).booleanValue();
    }
}
