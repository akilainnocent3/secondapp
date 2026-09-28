package defpackage;

import java.util.List;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes6.dex */
public final class jgq implements Function1<Integer, Object> {
    public final /* synthetic */ bgq a;
    public final /* synthetic */ List b;

    public jgq(bgq bgqVar, List list) {
        this.a = bgqVar;
        this.b = list;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Integer num) {
        return this.a.invoke(this.b.get(num.intValue()));
    }
}
