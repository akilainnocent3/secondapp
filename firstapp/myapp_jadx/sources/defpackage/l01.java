package defpackage;

import java.util.Iterator;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final class l01 extends znz.d {
    public final /* synthetic */ j01<Object> d;

    public l01(j01<Object> j01Var) {
        this.d = j01Var;
    }

    @Override // znz.d
    public final void a(kxs kxsVar, hxs hxsVar) {
        hxsVar.getClass();
        Iterator it = this.d.i.iterator();
        while (it.hasNext()) {
            ((Function2) it.next()).invoke(kxsVar, hxsVar);
        }
    }
}
