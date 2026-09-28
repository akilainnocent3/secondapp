package defpackage;

import java.util.ArrayList;
import java.util.function.BiConsumer;

/* JADX INFO: loaded from: classes8.dex */
public final class xw0 implements n21 {
    public final ArrayList a;

    public xw0() {
        this.a = new ArrayList();
    }

    public final m21 a() {
        ArrayList arrayList = this.a;
        return (arrayList.size() != 2 || arrayList.get(0) == null) ? vw0.f(arrayList.toArray()) : new vw0(arrayList.toArray());
    }

    public final <T> n21 b(e21<T> e21Var, T t) {
        if (e21Var != null && !e21Var.getKey().isEmpty() && t != null) {
            ArrayList arrayList = this.a;
            arrayList.add(e21Var);
            arrayList.add(t);
        }
        return this;
    }

    public final n21 c(m21 m21Var) {
        if (m21Var == null) {
            return this;
        }
        m21Var.forEach(new BiConsumer() { // from class: ww0
            @Override // java.util.function.BiConsumer
            public final void accept(Object obj, Object obj2) {
                this.a.b((e21) obj, obj2);
            }
        });
        return this;
    }

    public xw0(ArrayList arrayList) {
        this.a = arrayList;
    }
}
