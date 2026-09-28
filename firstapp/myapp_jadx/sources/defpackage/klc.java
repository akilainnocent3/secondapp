package defpackage;

import java.util.ListIterator;
import kotlin.Unit;
import kotlin.collections.a;
import kotlin.text.c;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class klc {
    public static final void a(vp60 vp60Var) {
        vp60Var.getClass();
        ngs ngsVarB = a.b();
        hq60 hq60VarH1 = vp60Var.H1("SELECT name FROM sqlite_master WHERE type = 'trigger'");
        while (hq60VarH1.D1()) {
            try {
                ngsVarB.add(hq60VarH1.k1(0));
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    vc1.a(hq60VarH1, th);
                    throw th2;
                }
            }
        }
        Unit unit = Unit.a;
        vc1.a(hq60VarH1, null);
        ListIterator listIterator = a.a(ngsVarB).listIterator(0);
        while (true) {
            ngs.c cVar = (ngs.c) listIterator;
            if (!cVar.hasNext()) {
                return;
            }
            String str = (String) cVar.next();
            if (c.u(str, "room_fts_content_sync_", false)) {
                up60.a(vp60Var, "DROP TRIGGER IF EXISTS ".concat(str));
            }
        }
    }
}
