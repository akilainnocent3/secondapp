package defpackage;

import androidx.compose.ui.c;
import androidx.compose.ui.d;

/* JADX INFO: loaded from: classes4.dex */
public final class r3l {
    public static final /* synthetic */ int a = 0;

    public static d a(d dVar, zp70 zp70Var, long j, umz umzVar) {
        i3z i3zVar = i3z.a;
        float f = zp70Var.f.c() ? 0.8f : 0.0f;
        gzg0 gzg0VarE = yi0.e(zp70Var.f.c() ? 150 : 500, zp70Var.f.c() ? 0 : 1500, null, 4);
        dVar.getClass();
        zp70Var.getClass();
        return c.a(dVar, gnn.a, new cq70(f, gzg0VarE, zp70Var, umzVar, 4.0f, j));
    }

    public static d b(d dVar, zp70 zp70Var, boolean z, wo70 wo70Var, int i) {
        zp70 zp70Var2;
        float fFloatValue;
        sfd sfdVar = zp70Var.f;
        if ((i & 4) != 0) {
            z = true;
        }
        dVar.getClass();
        if (z) {
            i3z i3zVar = i3z.a;
            float f = wo70Var.a;
            long j = wo70Var.b;
            Float f2 = wo70Var.c;
            if (f2 != null) {
                fFloatValue = f2.floatValue();
            } else {
                fFloatValue = sfdVar.c() ? 0.8f : 0.0f;
            }
            float f3 = fFloatValue;
            gzg0 gzg0VarE = yi0.e(sfdVar.c() ? 150 : 500, sfdVar.c() ? 0 : 1500, null, 4);
            tmz tmzVar = wo70Var.d;
            tmzVar.getClass();
            zp70Var2 = zp70Var;
            dVar = c.a(dVar, gnn.a, new cq70(f3, gzg0VarE, zp70Var2, tmzVar, f, j));
        } else {
            zp70Var2 = zp70Var;
        }
        return op70.b(dVar, zp70Var2, false, true, true);
    }
}
