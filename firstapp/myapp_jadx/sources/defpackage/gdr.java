package defpackage;

import androidx.compose.runtime.a;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes6.dex */
public final class gdr {
    public static final void a(ghx ghxVar, final Function0<Unit> function0, final Function1<? super jdr, Unit> function1) {
        jdr.b bVar = jdr.b.INSTANCE;
        Function1 function2 = new Function1() { // from class: ddr
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                ghx ghxVar2 = (ghx) obj;
                ghxVar2.getClass();
                final Function0 function3 = function0;
                final Function1 function4 = function1;
                op8 op8Var = new op8(2100310222, new gaj() { // from class: edr
                    @Override // defpackage.gaj
                    public final Object invoke(Object obj2, Object obj3, Object obj4) {
                        ((Integer) obj4).getClass();
                        ((ifx) obj2).getClass();
                        bdr.b(0, (a) obj3, function3, function4);
                        return Unit.a;
                    }
                }, true);
                o2g o2gVar = o2g.a;
                o2gVar.getClass();
                m2g m2gVar = m2g.a;
                hhx.c(ghxVar2, jq40.a(jdr.b.class), o2gVar, m2gVar, new yle(false, false, 7), op8Var);
                hhx.c(ghxVar2, jq40.a(jdr.c.class), o2gVar, m2gVar, new yle(39, false, false, false, false), new op8(736596229, new gaj() { // from class: fdr
                    @Override // defpackage.gaj
                    public final Object invoke(Object obj2, Object obj3, Object obj4) {
                        ifx ifxVar = (ifx) obj2;
                        ((Integer) obj4).getClass();
                        ifxVar.getClass();
                        jlr.a(0, (a) obj3, ((jdr.c) mfx.a(ifxVar, jq40.a(jdr.c.class))).a, function3);
                        return Unit.a;
                    }
                }, true));
                return Unit.a;
            }
        };
        o2g o2gVar = o2g.a;
        o2gVar.getClass();
        hhx.e(ghxVar, bVar, jq40.a(lcr.class), o2gVar, m2g.a, function2);
    }
}
