package defpackage;

import java.util.List;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes5.dex */
public final class huk implements Function1<Integer, Object> {
    public final /* synthetic */ mtk a;
    public final /* synthetic */ List b;

    public huk(mtk mtkVar, List list) {
        this.a = mtkVar;
        this.b = list;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Integer num) {
        int iIntValue = num.intValue();
        return this.a.invoke(Integer.valueOf(iIntValue), this.b.get(iIntValue));
    }
}
