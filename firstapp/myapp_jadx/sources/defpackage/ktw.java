package defpackage;

import java.util.HashMap;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes4.dex */
public final class ktw {
    public static final ktw b = new ktw();
    public final AtomicReference<ew20> a = new AtomicReference<>(new ew20(new ew20.a()));

    public final synchronized void a(yv20 yv20Var) {
        ew20.a aVar = new ew20.a(this.a.get());
        HashMap map = aVar.a;
        ew20.b bVar = new ew20.b(yv20Var.a, sn7.class);
        if (map.containsKey(bVar)) {
            zv20 zv20Var = (zv20) map.get(bVar);
            if (!zv20Var.equals(yv20Var) || yv20Var != zv20Var) {
                npp.a(bVar, "Attempt to register non-equal PrimitiveConstructor object for already existing object of type: ");
            }
        } else {
            map.put(bVar, yv20Var);
        }
        this.a.set(new ew20(aVar));
    }
}
