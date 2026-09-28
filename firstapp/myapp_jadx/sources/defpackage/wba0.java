package defpackage;

import java.util.List;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes6.dex */
public final class wba0 implements Function1<Integer, Object> {
    public final /* synthetic */ sba0 a;
    public final /* synthetic */ List b;

    public wba0(sba0 sba0Var, List list) {
        this.a = sba0Var;
        this.b = list;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Integer num) {
        return this.a.invoke(this.b.get(num.intValue()));
    }
}
