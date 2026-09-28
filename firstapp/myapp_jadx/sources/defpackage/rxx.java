package defpackage;

import com.sporty.android.core.model.dispatcher.Dispatcher;
import com.sporty.android.core.model.dispatcher.SportyDispatchers;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;

/* JADX INFO: loaded from: classes5.dex */
public final class rxx {
    public final vq40 a;
    public final w1j0 b;
    public final j1b c;
    public final tuw d;
    public jvd0 e;

    public rxx(vq40 vq40Var, w1j0 w1j0Var, mgb0 mgb0Var, @Dispatcher(sportyDispatcher = SportyDispatchers.IO) odd oddVar) {
        w1j0Var.getClass();
        mgb0Var.getClass();
        this.a = vq40Var;
        this.b = w1j0Var;
        j1b j1bVarA = w5b.a(CoroutineContext.Element.a.d(lfe0.a(), oddVar).plus(new nxx(l5b.a.a)));
        this.c = j1bVarA;
        this.d = uuw.a();
        ej5.c(j1bVarA, null, null, new mxx(mgb0Var, this, null), 3);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(x1b x1bVar) throws Throwable {
        oxx oxxVar;
        quw quwVar;
        quw quwVar2;
        if (x1bVar instanceof oxx) {
            oxxVar = (oxx) x1bVar;
            int i = oxxVar.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                oxxVar.d = i - Integer.MIN_VALUE;
            } else {
                oxxVar = new oxx(this, x1bVar);
            }
        } else {
            oxxVar = new oxx(this, x1bVar);
        }
        Object obj = oxxVar.b;
        y5b y5bVar = y5b.a;
        int i2 = oxxVar.d;
        try {
            if (i2 == 0) {
                uj50.b(obj);
                quwVar = this.d;
                oxxVar.a = quwVar;
                oxxVar.d = 1;
                if (quwVar.d(oxxVar) != y5bVar) {
                }
                return y5bVar;
            }
            if (i2 != 1) {
                if (i2 != 2) {
                    ib5.a("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                quwVar2 = oxxVar.a;
                try {
                    uj50.b(obj);
                    this.e = ej5.c(this.c, null, null, new pxx(this, null), 3);
                    Unit unit = Unit.a;
                    quwVar2.f(null);
                    return unit;
                } catch (Throwable th) {
                    th = th;
                    quwVar2.f(null);
                    throw th;
                }
            }
            quw quwVar3 = oxxVar.a;
            uj50.b(obj);
            quwVar = quwVar3;
            jvd0 jvd0Var = this.e;
            if (jvd0Var != null) {
                oxxVar.a = quwVar;
                oxxVar.d = 2;
                Object objC = i9p.c(jvd0Var, oxxVar);
                if (objC != y5bVar) {
                    quwVar2 = quwVar;
                    obj = objC;
                }
                return y5bVar;
            }
            quwVar2 = quwVar;
            this.e = ej5.c(this.c, null, null, new pxx(this, null), 3);
            Unit unit2 = Unit.a;
            quwVar2.f(null);
            return unit2;
        } catch (Throwable th2) {
            th = th2;
            quwVar2 = quwVar;
            quwVar2.f(null);
            throw th;
        }
    }
}
