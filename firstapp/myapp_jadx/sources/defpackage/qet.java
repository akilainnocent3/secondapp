package defpackage;

import android.location.Location;
import android.os.Build;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public final class qet {
    public final py1 a;
    public final sl b;
    public final z1d c;
    public final psm d;
    public qoy e;
    public ooy f;
    public ioy g;
    public ymy h;
    public f990 i;
    public final String[] j;
    public final htk0 k;
    public final ee<String[]> l;

    public qet(py1 py1Var, sl slVar, z1d z1dVar, psm psmVar) {
        psmVar.getClass();
        this.a = py1Var;
        this.b = slVar;
        this.c = z1dVar;
        this.d = psmVar;
        this.j = new String[]{"android.permission.ACCESS_FINE_LOCATION", "android.permission.ACCESS_COARSE_LOCATION"};
        int i = ret.a;
        this.k = new htk0(py1Var, py1Var, htk0.k, sl0.d.g, u4l.a.c);
        this.l = py1Var.registerForActivityResult(new ae(), new ud() { // from class: net
            @Override // defpackage.ud
            public final void a(Object obj) {
                Map map = (Map) obj;
                map.getClass();
                boolean zIsEmpty = map.isEmpty();
                qet qetVar = this.a;
                if (!zIsEmpty) {
                    Iterator it = map.entrySet().iterator();
                    while (it.hasNext()) {
                        if (!((Boolean) ((Map.Entry) it.next()).getValue()).booleanValue()) {
                            ooy ooyVar = qetVar.f;
                            if (ooyVar != null) {
                                ooyVar.a();
                                return;
                            }
                            return;
                        }
                    }
                }
                qoy qoyVar = qetVar.e;
                if (qoyVar != null) {
                    qoyVar.a();
                }
            }
        });
    }

    public static boolean a(Location location) {
        return Build.VERSION.SDK_INT >= 31 ? location.isMock() : location.isFromMockProvider();
    }

    public final void b(boolean z) {
        py1 py1Var;
        String[] strArr = this.j;
        try {
            int length = strArr.length;
            boolean z2 = false;
            int i = 0;
            while (true) {
                py1Var = this.a;
                if (i >= length) {
                    z2 = true;
                    break;
                } else if (o0b.a(py1Var, strArr[i]) != 0) {
                    break;
                } else {
                    i++;
                }
            }
            if (z2) {
                ej5.c(ebs.a(py1Var.getLifecycle()), null, null, new pet(z, this, null), 3);
            } else {
                this.l.b(strArr);
            }
        } catch (SecurityException e) {
            e.printStackTrace();
        }
    }
}
