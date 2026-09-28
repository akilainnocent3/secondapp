package defpackage;

import java.util.ArrayList;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes6.dex */
public final class s9l implements Function1<Integer, Object> {
    public final /* synthetic */ ArrayList a;

    public s9l(r9l r9lVar, ArrayList arrayList) {
        this.a = arrayList;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Integer num) {
        Integer num2 = (Integer) this.a.get(num.intValue());
        num2.intValue();
        return num2;
    }
}
