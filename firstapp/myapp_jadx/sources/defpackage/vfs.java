package defpackage;

import kotlin.Unit;

/* JADX INFO: loaded from: classes.dex */
public final class vfs<T> implements myh {
    public final /* synthetic */ etw<xxo> a;
    public final /* synthetic */ wfs b;

    public vfs(etw<xxo> etwVar, wfs wfsVar) {
        this.a = etwVar;
        this.b = wfsVar;
    }

    @Override // defpackage.myh
    public final Object emit(Object obj, v1b v1bVar) {
        xxo xxoVar = (xxo) obj;
        boolean z = xxoVar instanceof vkm;
        etw<xxo> etwVar = this.a;
        if (z || (xxoVar instanceof c4i) || (xxoVar instanceof mp20.b)) {
            etwVar.g(xxoVar);
        } else if (xxoVar instanceof wkm) {
            etwVar.j(((wkm) xxoVar).a);
        } else if (xxoVar instanceof d4i) {
            etwVar.j(((d4i) xxoVar).a);
        } else if (xxoVar instanceof mp20.c) {
            etwVar.j(((mp20.c) xxoVar).a);
        } else if (xxoVar instanceof mp20.a) {
            etwVar.j(((mp20.a) xxoVar).a);
        }
        Object[] objArr = etwVar.a;
        int i = etwVar.b;
        int i2 = 0;
        int i3 = 0;
        while (true) {
            wfs wfsVar = this.b;
            if (i2 >= i) {
                ((u5a0) wfsVar.b).k(i3);
                return Unit.a;
            }
            xxo xxoVar2 = (xxo) objArr[i2];
            if (xxoVar2 instanceof vkm) {
                wfsVar.getClass();
                i3 |= 2;
            } else if (xxoVar2 instanceof c4i) {
                wfsVar.getClass();
                i3 |= 1;
            } else if (xxoVar2 instanceof mp20.b) {
                wfsVar.getClass();
                i3 |= 4;
            }
            i2++;
        }
    }
}
