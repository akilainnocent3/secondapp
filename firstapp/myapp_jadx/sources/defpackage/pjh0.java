package defpackage;

import com.sporty.android.core.model.dispatcher.Dispatcher;
import com.sporty.android.core.model.dispatcher.SportyDispatchers;
import com.sportybet.plugin.realsports.betslip.Selection;
import java.util.ArrayList;
import kotlin.collections.b;

/* JADX INFO: loaded from: classes7.dex */
public final class pjh0 {
    public final mgb0 a;
    public final jrm b;
    public final k5b c;

    public pjh0(mgb0 mgb0Var, jrm jrmVar, @Dispatcher(sportyDispatcher = SportyDispatchers.IO) k5b k5bVar) {
        mgb0Var.getClass();
        jrmVar.getClass();
        this.a = mgb0Var;
        this.b = jrmVar;
        this.c = k5bVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(x1b x1bVar) {
        njh0 njh0Var;
        if (x1bVar instanceof njh0) {
            njh0Var = (njh0) x1bVar;
            int i = njh0Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                njh0Var.c = i - Integer.MIN_VALUE;
            } else {
                njh0Var = new njh0(this, x1bVar);
            }
        } else {
            njh0Var = new njh0(this, x1bVar);
        }
        Object objD = njh0Var.a;
        y5b y5bVar = y5b.a;
        int i2 = njh0Var.c;
        if (i2 == 0) {
            uj50.b(objD);
            ojh0 ojh0Var = new ojh0(this, null);
            njh0Var.c = 1;
            objD = ej5.d(this.c, ojh0Var, njh0Var);
            if (objD == y5bVar) {
                return y5bVar;
            }
        } else {
            if (i2 != 1) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            uj50.b(objD);
        }
        objD.getClass();
        return objD;
    }

    public final v03.q b(v03.q qVar) {
        qVar.getClass();
        jrm jrmVar = this.b;
        boolean zA0 = jrmVar.a0();
        String str = jrmVar.W() ? "real" : "sim";
        String strValueOf = String.valueOf(zA0 ? 1 : 0);
        int size = jrmVar.U().size();
        ArrayList arrayListU = jrmVar.U();
        int i = 0;
        if (arrayListU == null || !arrayListU.isEmpty()) {
            int size2 = arrayListU.size();
            int i2 = 0;
            while (i2 < size2) {
                Object obj = arrayListU.get(i2);
                i2++;
                if (qz3.i((Selection) obj) && (i = i + 1) < 0) {
                    b.p();
                    throw null;
                }
            }
        }
        return v03.q.a(qVar, null, null, strValueOf, str, Integer.valueOf(size), null, Integer.valueOf(i), null, null, null, jrmVar.X(), jrmVar.o(), jrmVar.Q0(), jrmVar.k(), jrmVar.Y(), null, null, null, null, jrmVar.n(), null, 0, jrmVar.z(), 3638179);
    }
}
