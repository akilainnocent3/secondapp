package defpackage;

import android.graphics.Bitmap;

/* JADX INFO: loaded from: classes.dex */
public final class uhk extends ldf<thk> {
    @Override // defpackage.qg50
    public final int a() {
        xhk xhkVar = ((thk) this.a).a.a;
        nvd0 nvd0Var = xhkVar.a;
        return (nvd0Var.j.length * 4) + nvd0Var.d.limit() + nvd0Var.i.length + xhkVar.o;
    }

    @Override // defpackage.ldf, defpackage.thn
    public final void b() {
        ((thk) this.a).a.a.l.prepareToDraw();
    }

    @Override // defpackage.qg50
    public final void c() {
        px0 px0Var;
        px0 px0Var2;
        px0 px0Var3;
        thk thkVar = (thk) this.a;
        thkVar.stop();
        thkVar.d = true;
        xhk xhkVar = thkVar.a.a;
        xa50 xa50Var = xhkVar.d;
        xhkVar.c.clear();
        Bitmap bitmap = xhkVar.l;
        if (bitmap != null) {
            xhkVar.e.d(bitmap);
            xhkVar.l = null;
        }
        xhkVar.f = false;
        xhk.a aVar = xhkVar.i;
        if (aVar != null) {
            xa50Var.n(aVar);
            xhkVar.i = null;
        }
        xhk.a aVar2 = xhkVar.k;
        if (aVar2 != null) {
            xa50Var.n(aVar2);
            xhkVar.k = null;
        }
        xhk.a aVar3 = xhkVar.n;
        if (aVar3 != null) {
            xa50Var.n(aVar3);
            xhkVar.n = null;
        }
        nvd0 nvd0Var = xhkVar.a;
        rhk.a aVar4 = nvd0Var.c;
        nvd0Var.l = null;
        byte[] bArr = nvd0Var.i;
        if (bArr != null && (px0Var3 = ((phk) aVar4).b) != null) {
            px0Var3.put(bArr);
        }
        int[] iArr = nvd0Var.j;
        if (iArr != null && (px0Var2 = ((phk) aVar4).b) != null) {
            px0Var2.put(iArr);
        }
        Bitmap bitmap2 = nvd0Var.m;
        if (bitmap2 != null) {
            ((phk) aVar4).a.d(bitmap2);
        }
        nvd0Var.m = null;
        nvd0Var.d = null;
        nvd0Var.s = null;
        byte[] bArr2 = nvd0Var.e;
        if (bArr2 != null && (px0Var = ((phk) aVar4).b) != null) {
            px0Var.put(bArr2);
        }
        xhkVar.j = true;
    }

    @Override // defpackage.qg50
    public final Class<thk> d() {
        return thk.class;
    }
}
