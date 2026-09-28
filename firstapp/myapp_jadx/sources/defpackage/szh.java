package defpackage;

import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class szh {
    public static final /* synthetic */ int a = 0;

    public static final lyh a(lyh lyhVar, final long j) {
        if (j >= 0) {
            return j == 0 ? lyhVar : new oyh(new qzh(null, lyhVar, new Function1() { // from class: pzh
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return Long.valueOf(j);
                }
            }));
        }
        hb5.a("Debounce timeout should not be negative");
        return null;
    }
}
