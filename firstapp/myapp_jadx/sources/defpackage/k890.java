package defpackage;

import java.util.List;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes5.dex */
public final class k890 implements Function1<Integer, Object> {
    public final /* synthetic */ q79 a;
    public final /* synthetic */ List b;

    public k890(q79 q79Var, List list) {
        this.a = q79Var;
        this.b = list;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Integer num) {
        int iIntValue = num.intValue();
        return this.a.invoke(Integer.valueOf(iIntValue), this.b.get(iIntValue));
    }
}
