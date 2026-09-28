package defpackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

/* JADX INFO: loaded from: classes8.dex */
public final class vw0 extends ncn<e21<?>, Object> implements m21 {
    public static final Comparator<e21<?>> c = Comparator.comparing(new uw0());
    public static final vw0 d;

    static {
        ArrayList arrayList = new ArrayList();
        d = (arrayList.size() != 2 || arrayList.get(0) == null) ? f(arrayList.toArray()) : new vw0(arrayList.toArray());
    }

    public static vw0 f(Object... objArr) {
        for (int i = 0; i < objArr.length; i += 2) {
            e21 e21Var = (e21) objArr[i];
            if (e21Var != null && e21Var.getKey().isEmpty()) {
                objArr[i] = null;
            }
        }
        return new vw0(objArr, c);
    }

    @Override // defpackage.m21
    public final <T> T e(e21<T> e21Var) {
        if (e21Var == null) {
            return null;
        }
        int i = 0;
        while (true) {
            Object[] objArr = this.a;
            if (i >= objArr.length) {
                return null;
            }
            if (e21Var.equals(objArr[i])) {
                return (T) objArr[i + 1];
            }
            i += 2;
        }
    }

    @Override // defpackage.m21
    public final xw0 toBuilder() {
        return new xw0(new ArrayList(Arrays.asList(this.a)));
    }
}
