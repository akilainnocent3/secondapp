package defpackage;

import java.util.List;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes6.dex */
public final class tba0 implements Function1<Integer, Object> {
    public final /* synthetic */ qba0 a;
    public final /* synthetic */ List b;

    public tba0(qba0 qba0Var, List list) {
        this.a = qba0Var;
        this.b = list;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Integer num) {
        return this.a.invoke(this.b.get(num.intValue()));
    }
}
