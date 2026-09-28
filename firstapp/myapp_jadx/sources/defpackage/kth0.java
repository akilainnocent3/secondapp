package defpackage;

import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class kth0 extends saj implements Function0<Boolean> {
    @Override // kotlin.jvm.functions.Function0
    public final Boolean invoke() {
        ((ith0) this.receiver).getClass();
        List<String> list = gth0.a;
        boolean z = false;
        if (list == null || !list.isEmpty()) {
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                if (System.getenv((String) it.next()) != null) {
                    z = true;
                    break;
                }
            }
        }
        return Boolean.valueOf(z);
    }
}
