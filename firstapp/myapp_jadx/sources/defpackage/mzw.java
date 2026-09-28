package defpackage;

import android.content.Context;
import com.sporty.android.core.model.dispatcher.Dispatcher;
import com.sporty.android.core.model.dispatcher.SportyDispatchers;
import kotlin.Unit;

/* JADX INFO: loaded from: classes6.dex */
public final class mzw {
    public final Context a;
    public final k5b b;

    public mzw(Context context, @Dispatcher(sportyDispatcher = SportyDispatchers.IO) k5b k5bVar) {
        this.a = context;
        this.b = k5bVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(x1b x1bVar) {
        jzw jzwVar;
        if (x1bVar instanceof jzw) {
            jzwVar = (jzw) x1bVar;
            int i = jzwVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                jzwVar.c = i - Integer.MIN_VALUE;
            } else {
                jzwVar = new jzw(this, x1bVar);
            }
        } else {
            jzwVar = new jzw(this, x1bVar);
        }
        Object obj = jzwVar.a;
        y5b y5bVar = y5b.a;
        int i2 = jzwVar.c;
        if (i2 == 0) {
            uj50.b(obj);
            sqc<zn20> sqcVarA = nzw.b.a(this.a, nzw.a[0]);
            kzw kzwVar = new kzw(2, null);
            jzwVar.c = 1;
            if (do20.a(sqcVarA, kzwVar, jzwVar) == y5bVar) {
                return y5bVar;
            }
        } else {
            if (i2 != 1) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            uj50.b(obj);
        }
        return Unit.a;
    }
}
