package defpackage;

import java.util.ArrayList;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes7.dex */
public final class nog implements Function1<Integer, Object> {
    public final /* synthetic */ aog a;
    public final /* synthetic */ ArrayList b;

    public nog(aog aogVar, ArrayList arrayList) {
        this.a = aogVar;
        this.b = arrayList;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Integer num) {
        int iIntValue = num.intValue();
        return this.a.invoke(Integer.valueOf(iIntValue), this.b.get(iIntValue));
    }
}
