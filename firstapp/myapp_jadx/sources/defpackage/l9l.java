package defpackage;

import java.util.List;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes6.dex */
public final class l9l implements Function1<Integer, Object> {
    public final /* synthetic */ j9l a;
    public final /* synthetic */ List b;

    public l9l(j9l j9lVar, List list) {
        this.a = j9lVar;
        this.b = list;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Integer num) {
        return this.a.invoke(this.b.get(num.intValue()));
    }
}
