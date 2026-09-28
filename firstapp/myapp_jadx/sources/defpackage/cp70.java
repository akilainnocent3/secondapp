package defpackage;

import java.util.List;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final class cp70 {
    public static final void a(bb80 bb80Var, int i, xo70 xo70Var) {
        duw duwVar = new duw(new bb80[16]);
        List listI = bb80Var.i(false, false);
        while (true) {
            duwVar.d(duwVar.c, listI);
            while (true) {
                int i2 = duwVar.c;
                if (i2 == 0) {
                    return;
                }
                bb80 bb80Var2 = (bb80) duwVar.k(i2 - 1);
                boolean zD = gb80.d(bb80Var2);
                sa80 sa80Var = bb80Var2.d;
                if (!zD) {
                    if (sa80Var.a.b(hb80.i)) {
                        continue;
                    } else {
                        ywx ywxVarD = bb80Var2.d();
                        if (ywxVarD == null) {
                            throw w20.a("Expected semantics node to have a coordinator.");
                        }
                        owo owoVarD = pwo.d(eb9.b(ywxVarD));
                        if (owoVarD.a < owoVarD.c && owoVarD.b < owoVarD.d) {
                            Function2 function2 = (Function2) ta80.a(sa80Var, ra80.e);
                            vo70 vo70Var = (vo70) ta80.a(sa80Var, hb80.u);
                            if (function2 == null || vo70Var == null || vo70Var.b.invoke().floatValue() <= 0.0f) {
                                listI = bb80Var2.i(false, false);
                            } else {
                                int i3 = i + 1;
                                xo70Var.invoke(new bp70(bb80Var2, i3, owoVarD, ywxVarD));
                                a(bb80Var2, i3, xo70Var);
                            }
                        }
                    }
                }
            }
        }
    }
}
