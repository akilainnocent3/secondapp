package defpackage;

import java.util.List;
import java.util.Map;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class hhx {
    public static final void a(ghx ghxVar, dq7 dq7Var, Map map, m2g m2gVar, Function1 function1, Function1 function2, Function1 function3, Function1 function4, iaj iajVar) {
        wkx wkxVar = ghxVar.i;
        wkxVar.getClass();
        tga tgaVar = new tga((sga) wkxVar.b(wkx.a.a(sga.class)), dq7Var, map, iajVar);
        m2gVar.getClass();
        l2g.a.getClass();
        tgaVar.k = function1;
        tgaVar.l = function2;
        tgaVar.m = function3;
        tgaVar.n = function4;
        ghxVar.m.add(tgaVar.a());
    }

    public static void b(ghx ghxVar, String str, List list, op8 op8Var, int i) {
        if ((i & 2) != 0) {
            list = m2g.a;
        }
        m2g m2gVar = m2g.a;
        wkx wkxVar = ghxVar.i;
        wkxVar.getClass();
        tga tgaVar = new tga((sga) wkxVar.b(wkx.a.a(sga.class)), str, op8Var);
        for (nex nexVar : list) {
            String str2 = nexVar.a;
            ffx ffxVar = nexVar.b;
            str2.getClass();
            tgaVar.f.put(str2, ffxVar);
        }
        m2gVar.getClass();
        l2g.a.getClass();
        tgaVar.k = null;
        tgaVar.l = null;
        tgaVar.m = null;
        tgaVar.n = null;
        ghxVar.m.add(tgaVar.a());
    }

    public static final void c(ghx ghxVar, dq7 dq7Var, o2g o2gVar, m2g m2gVar, yle yleVar, op8 op8Var) {
        wkx wkxVar = ghxVar.i;
        wkxVar.getClass();
        wle wleVar = new wle((vle) wkxVar.b(wkx.a.a(vle.class)), dq7Var, o2gVar, yleVar, op8Var);
        m2gVar.getClass();
        l2g.a.getClass();
        ghxVar.m.add(wleVar.a());
    }

    public static void d(ghx ghxVar, String str, op8 op8Var) {
        m2g m2gVar = m2g.a;
        yle yleVar = new yle(false, false, 7);
        wkx wkxVar = ghxVar.i;
        wkxVar.getClass();
        wle wleVar = new wle((vle) wkxVar.b(wkx.a.a(vle.class)), str, yleVar, op8Var);
        m2gVar.getClass();
        l2g l2gVar = l2g.a;
        l2gVar.getClass();
        m2gVar.getClass();
        l2gVar.getClass();
        ghxVar.m.add(wleVar.a());
    }

    public static final void e(ghx ghxVar, Object obj, dq7 dq7Var, o2g o2gVar, m2g m2gVar, Function1 function1) {
        ghx ghxVar2 = new ghx(ghxVar.i, obj, dq7Var, o2gVar);
        function1.invoke(ghxVar2);
        fhx fhxVarA = ghxVar2.a();
        m2gVar.getClass();
        l2g.a.getClass();
        ghxVar.m.add(fhxVarA);
    }
}
