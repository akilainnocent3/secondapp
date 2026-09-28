package defpackage;

import com.sporty.android.core.model.dispatcher.Dispatcher;
import com.sporty.android.core.model.dispatcher.SportyDispatchers;
import kotlin.text.Regex;

/* JADX INFO: loaded from: classes4.dex */
public final class rih implements wnk0 {
    public final Object a;
    public final Object b;
    public final Object c;

    public rih(psm psmVar, @Dispatcher(sportyDispatcher = SportyDispatchers.IO) k5b k5bVar, ipx ipxVar) {
        psmVar.getClass();
        ipxVar.getClass();
        this.a = psmVar;
        this.b = k5bVar;
        this.c = ipxVar;
    }

    public static String a(String str) {
        return ld80.g(Regex.c(new Regex("\\d+"), str), "_", new unc(1), 30);
    }

    @Override // defpackage.wnk0
    public Object zza() {
        Object objZza = ((wnk0) this.a).zza();
        return new y2l0((zql0) objZza, ((qcl0) this.c).a.a);
    }

    public rih(wnk0 wnk0Var, wnk0 wnk0Var2, qcl0 qcl0Var) {
        this.a = wnk0Var;
        this.b = wnk0Var2;
        this.c = qcl0Var;
    }
}
