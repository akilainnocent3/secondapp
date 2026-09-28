package defpackage;

import java.util.function.BiConsumer;

/* JADX INFO: loaded from: classes8.dex */
public interface m21 {
    static vw0 b(e21 e21Var, Object obj, e21 e21Var2, Object obj2) {
        if (e21Var == null || e21Var.getKey().isEmpty() || obj == null) {
            return c(e21Var2, obj2);
        }
        if (e21Var2 == null || e21Var2.getKey().isEmpty() || obj2 == null) {
            return c(e21Var, obj);
        }
        if (e21Var.getKey().equals(e21Var2.getKey())) {
            return c(e21Var2, obj2);
        }
        return e21Var.getKey().compareTo(e21Var2.getKey()) > 0 ? new vw0(new Object[]{e21Var2, obj2, e21Var, obj}) : new vw0(new Object[]{e21Var, obj, e21Var2, obj2});
    }

    static vw0 c(e21 e21Var, Object obj) {
        return (e21Var == null || e21Var.getKey().isEmpty() || obj == null) ? vw0.d : new vw0(new Object[]{e21Var, obj});
    }

    <T> T e(e21<T> e21Var);

    void forEach(BiConsumer<? super e21<?>, ? super Object> biConsumer);

    boolean isEmpty();

    int size();

    xw0 toBuilder();
}
