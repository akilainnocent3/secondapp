package defpackage;

import com.sporty.android.core.model.dispatcher.Dispatcher;
import com.sporty.android.core.model.dispatcher.SportyDispatchers;

/* JADX INFO: loaded from: classes5.dex */
public final class oh80 {
    public final tue a;
    public final odd b;

    public oh80(tue tueVar, @Dispatcher(sportyDispatcher = SportyDispatchers.IO) odd oddVar) {
        this.a = tueVar;
        this.b = oddVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(String str, String str2, x1b x1bVar) {
        mh80 mh80Var;
        if (x1bVar instanceof mh80) {
            mh80Var = (mh80) x1bVar;
            int i = mh80Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                mh80Var.c = i - Integer.MIN_VALUE;
            } else {
                mh80Var = new mh80(this, x1bVar);
            }
        } else {
            mh80Var = new mh80(this, x1bVar);
        }
        Object objD = mh80Var.a;
        y5b y5bVar = y5b.a;
        int i2 = mh80Var.c;
        if (i2 == 0) {
            uj50.b(objD);
            nh80 nh80Var = new nh80(this, str, str2, null);
            mh80Var.c = 1;
            objD = ej5.d(this.b, nh80Var, mh80Var);
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
        return ((zi50) objD).a;
    }
}
