package defpackage;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class bsw {
    public final CopyOnWriteArrayList<Function1<y78, Unit>> a = new CopyOnWriteArrayList<>();
    public final wwd0 b;
    public final v340 c;

    public bsw() {
        wwd0 wwd0VarA = xwd0.a(null);
        this.b = wwd0VarA;
        this.c = e1i.b(wwd0VarA);
    }

    public static hxs a(hxs hxsVar, hxs hxsVar2, hxs hxsVar3, hxs hxsVar4) {
        if (hxsVar4 == null) {
            return hxsVar3;
        }
        if (hxsVar instanceof hxs.b) {
            return (((hxsVar2 instanceof hxs.c) && (hxsVar4 instanceof hxs.c)) || (hxsVar4 instanceof hxs.a)) ? hxsVar4 : hxsVar;
        }
        return hxsVar4;
    }

    public static y78 b(y78 y78Var, jxs jxsVar, jxs jxsVar2) {
        hxs hxsVar;
        hxs hxsVar2;
        hxs hxsVar3;
        hxs hxsVar4 = hxs.c.c;
        if (y78Var == null || (hxsVar = y78Var.a) == null) {
            hxsVar = hxsVar4;
        }
        hxs hxsVar5 = jxsVar.a;
        hxs hxsVarA = a(hxsVar, hxsVar5, hxsVar5, jxsVar2 != null ? jxsVar2.a : null);
        if (y78Var == null || (hxsVar2 = y78Var.b) == null) {
            hxsVar2 = hxsVar4;
        }
        hxs hxsVarA2 = a(hxsVar2, hxsVar5, jxsVar.b, jxsVar2 != null ? jxsVar2.b : null);
        if (y78Var != null && (hxsVar3 = y78Var.c) != null) {
            hxsVar4 = hxsVar3;
        }
        return new y78(hxsVarA, hxsVarA2, a(hxsVar4, hxsVar5, jxsVar.c, jxsVar2 != null ? jxsVar2.c : null), jxsVar, jxsVar2);
    }

    public final void c(Function1<? super y78, y78> function1) {
        wwd0 wwd0Var;
        Object value;
        y78 y78VarInvoke;
        do {
            wwd0Var = this.b;
            value = wwd0Var.getValue();
            y78 y78Var = (y78) value;
            y78VarInvoke = function1.invoke(y78Var);
            if (Intrinsics.g(y78Var, y78VarInvoke)) {
                return;
            }
        } while (!wwd0Var.g(value, y78VarInvoke));
        if (y78VarInvoke != null) {
            Iterator<Function1<y78, Unit>> it = this.a.iterator();
            while (it.hasNext()) {
                it.next().invoke(y78VarInvoke);
            }
        }
    }
}
