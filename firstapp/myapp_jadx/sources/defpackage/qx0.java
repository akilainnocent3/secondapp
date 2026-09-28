package defpackage;

import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes8.dex */
public final class qx0 {
    public static final int a;

    static {
        Object bVar;
        try {
            zi50.a aVar = zi50.b;
            String property = System.getProperty("kotlinx.serialization.json.pool.size");
            bVar = property != null ? StringsKt.toIntOrNull(property) : null;
        } catch (Throwable th) {
            zi50.a aVar2 = zi50.b;
            bVar = new zi50.b(th);
        }
        Integer num = (Integer) (bVar instanceof zi50.b ? null : bVar);
        a = num != null ? num.intValue() : 2097152;
    }
}
