package defpackage;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes8.dex */
public interface ppv {
    public static final vw0 a;

    static {
        ArrayList arrayList = new ArrayList();
        kyo kyoVarA = kyo.a(g21.b, "otel.metric.overflow");
        Boolean bool = Boolean.TRUE;
        if (!kyoVarA.b.isEmpty()) {
            arrayList.add(kyoVarA);
            arrayList.add(bool);
        }
        a = (arrayList.size() != 2 || arrayList.get(0) == null) ? vw0.f(arrayList.toArray()) : new vw0(arrayList.toArray());
    }

    npv c();
}
