package defpackage;

import androidx.compose.runtime.a;
import androidx.compose.ui.c;
import androidx.compose.ui.d;
import com.sporty.android.core.model.tracking.AnalyticsEvent;

/* JADX INFO: loaded from: classes4.dex */
public final class c9j {
    public static final d a(d dVar, boolean z, String str) {
        dVar.getClass();
        if (!z) {
            return dVar;
        }
        return c.a(dVar, gnn.a, new tge(str, 1));
    }

    public static final m9j b(a aVar) {
        aVar.N(271402461);
        if (((Boolean) aVar.O(hnn.a)).booleanValue()) {
            aVar.H();
            return null;
        }
        w8i0 w8i0VarA = zdt.a(aVar);
        if (w8i0VarA == null) {
            ib5.a("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
            return null;
        }
        m9j m9jVar = (m9j) p8i0.a(jq40.a(m9j.class), w8i0VarA, null, cll.a(w8i0VarA, aVar), w8i0VarA instanceof iel ? ((iel) w8i0VarA).getDefaultViewModelCreationExtras() : cyb.a.b, aVar);
        aVar.H();
        return m9jVar;
    }

    public static final d c(d dVar, final String str, final String str2) {
        dVar.getClass();
        str2.getClass();
        return c.a(dVar, gnn.a, new gaj() { // from class: a9j
            @Override // defpackage.gaj
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                d dVar2 = (d) obj;
                a aVar = (a) obj2;
                ((Integer) obj3).getClass();
                dVar2.getClass();
                aVar.N(-1638198097);
                m9j m9jVarB = c9j.b(aVar);
                if (m9jVarB == null) {
                    aVar.H();
                    return dVar2;
                }
                boolean zM = aVar.M(m9jVarB);
                String str3 = str;
                boolean zM2 = zM | aVar.M(str3);
                String str4 = str2;
                boolean zM3 = zM2 | aVar.M(str4);
                Object objY = aVar.y();
                if (zM3 || objY == a.C0041a.a) {
                    objY = m9jVarB.Q(str3, str4);
                    aVar.r(objY);
                }
                d dVarN = dVar2.n((d) objY);
                aVar.H();
                return dVarN;
            }
        });
    }

    public static final d d(d dVar, String str) {
        dVar.getClass();
        str.getClass();
        return c(dVar, AnalyticsEvent.FS_ATTRIBUTE_DATA_OP, str);
    }

    public static final d e(d dVar) {
        dVar.getClass();
        return c.a(dVar, gnn.a, new b9j());
    }
}
