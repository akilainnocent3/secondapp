package androidx.camera.camera2;

import defpackage.d46;
import defpackage.ftw;
import defpackage.fz5;
import defpackage.gz5;
import defpackage.hz5;
import defpackage.w2z;
import defpackage.wg1;

/* JADX INFO: loaded from: classes.dex */
public final class Camera2Config$DefaultProvider implements d46.b {
    @Override // d46.b
    public d46 getCameraXConfig() {
        fz5 fz5Var = new fz5();
        gz5 gz5Var = new gz5();
        hz5 hz5Var = new hz5();
        d46.a aVar = new d46.a();
        wg1 wg1Var = d46.O;
        ftw ftwVar = aVar.a;
        ftwVar.Y(wg1Var, fz5Var);
        ftwVar.Y(d46.P, gz5Var);
        ftwVar.Y(d46.Q, hz5Var);
        ftwVar.Y(d46.Y, 0);
        ftwVar.Y(d46.Z, Boolean.TRUE);
        return new d46(w2z.U(ftwVar));
    }
}
