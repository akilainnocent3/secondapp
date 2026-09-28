package defpackage;

import java.util.List;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes6.dex */
public final class m17 implements Function1<Integer, Object> {
    public final /* synthetic */ d17 a;
    public final /* synthetic */ List b;

    public m17(d17 d17Var, List list) {
        this.a = d17Var;
        this.b = list;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Integer num) {
        return this.a.invoke(this.b.get(num.intValue()));
    }
}
