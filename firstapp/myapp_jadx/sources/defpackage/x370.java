package defpackage;

import com.sporty.android.core.model.dispatcher.Dispatcher;
import com.sporty.android.core.model.dispatcher.SportyDispatchers;
import kotlin.time.b;
import kotlin.time.c;

/* JADX INFO: loaded from: classes5.dex */
public final class x370 {
    public final yqm a;
    public final odd b;
    public jvd0 c;

    public x370(yqm yqmVar, @Dispatcher(sportyDispatcher = SportyDispatchers.IO) odd oddVar) {
        yqmVar.getClass();
        this.a = yqmVar;
        this.b = oddVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(x1b x1bVar) {
        v370 v370Var;
        if (x1bVar instanceof v370) {
            v370Var = (v370) x1bVar;
            int i = v370Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                v370Var.c = i - Integer.MIN_VALUE;
            } else {
                v370Var = new v370(this, x1bVar);
            }
        } else {
            v370Var = new v370(this, x1bVar);
        }
        Object objD = v370Var.a;
        y5b y5bVar = y5b.a;
        int i2 = v370Var.c;
        if (i2 == 0) {
            uj50.b(objD);
            b.a aVar = b.b;
            long jH = c.h(5, rgf.SECONDS);
            w370 w370Var = new w370(this, null);
            v370Var.c = 1;
            objD = vxf0.d(jH, w370Var, v370Var);
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
        Boolean bool = (Boolean) objD;
        return Boolean.valueOf(bool != null ? bool.booleanValue() : false);
    }
}
