package defpackage;

import java.util.List;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes8.dex */
public final class snr implements Function1<Integer, Object> {
    public final /* synthetic */ g79 a;
    public final /* synthetic */ List b;

    public snr(g79 g79Var, List list) {
        this.a = g79Var;
        this.b = list;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Integer num) {
        int iIntValue = num.intValue();
        return this.a.invoke(Integer.valueOf(iIntValue), this.b.get(iIntValue));
    }
}
