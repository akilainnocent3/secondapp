package defpackage;

import java.util.List;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes6.dex */
public final class ewg implements Function1<Integer, Object> {
    public final /* synthetic */ uvg a;
    public final /* synthetic */ List b;

    public ewg(uvg uvgVar, List list) {
        this.a = uvgVar;
        this.b = list;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Integer num) {
        int iIntValue = num.intValue();
        return this.a.invoke(Integer.valueOf(iIntValue), this.b.get(iIntValue));
    }
}
