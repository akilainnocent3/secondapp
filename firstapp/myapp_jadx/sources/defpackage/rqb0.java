package defpackage;

import java.util.List;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes7.dex */
public final class rqb0 implements Function1<Integer, Object> {
    public final /* synthetic */ vm7 a;
    public final /* synthetic */ List b;

    public rqb0(vm7 vm7Var, List list) {
        this.a = vm7Var;
        this.b = list;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Integer num) {
        return this.a.invoke(this.b.get(num.intValue()));
    }
}
