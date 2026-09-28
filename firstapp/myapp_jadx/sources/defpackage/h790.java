package defpackage;

import com.sporty.android.core.model.json.JsonSerializeService;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import kotlin.coroutines.CoroutineContext;

/* JADX INFO: loaded from: classes7.dex */
public final class h790 implements b790 {
    public final m2l a;
    public final JsonSerializeService b;
    public final j1b c;
    public final Set<x590> d;

    public h790(k5b k5bVar, m2l m2lVar, JsonSerializeService jsonSerializeService, psm psmVar) {
        this.a = m2lVar;
        this.b = jsonSerializeService;
        this.c = w5b.a(CoroutineContext.Element.a.d(lfe0.a(), k5bVar));
        this.d = psmVar.O() ? ay0.V(new x590[]{x590.Jackpot, x590.Virtuals}) : t3g.a;
    }

    @Override // defpackage.b790
    public final yzh a() {
        return new yzh(new d790(new c790((zed.d0) this.a.getStringByFlow("key_shortcuts_id", ""), this, new f790().getType())), new e790(3, null));
    }

    @Override // defpackage.b790
    public final void b(uf00 uf00Var, d890 d890Var) {
        uf00Var.getClass();
        ArrayList arrayList = new ArrayList(l48.r(uf00Var, 10));
        Iterator<E> it = uf00Var.iterator();
        while (it.hasNext()) {
            arrayList.add(Integer.valueOf(((x590) it.next()).a));
        }
        String json = this.b.toJson(arrayList);
        json.getClass();
        this.a.a.h("key_shortcuts_id", json, new g790(d890Var), this.c);
    }
}
