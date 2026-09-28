package defpackage;

import java.util.Arrays;
import java.util.Collection;
import java.util.LinkedHashMap;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class cin {
    public final LinkedHashMap a = new LinkedHashMap();

    public final void a(dq7 dq7Var, Function1 function1) {
        function1.getClass();
        LinkedHashMap linkedHashMap = this.a;
        if (linkedHashMap.containsKey(dq7Var)) {
            hqm.a(dq7Var.i(), "A `initializer` with the same `clazz` has already been added: ", 46);
        } else {
            linkedHashMap.put(dq7Var, new n8i0(dq7Var, function1));
        }
    }

    public final bin b() {
        Collection collectionValues = this.a.values();
        collectionValues.getClass();
        n8i0[] n8i0VarArr = (n8i0[]) collectionValues.toArray(new n8i0[0]);
        return new bin((n8i0[]) Arrays.copyOf(n8i0VarArr, n8i0VarArr.length));
    }
}
