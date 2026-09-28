package defpackage;

import java.util.Map;
import kotlin.jvm.functions.Function1;
import kotlin.text.b;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class m53 implements Function1 {
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        String str;
        Map.Entry entry = (Map.Entry) obj;
        entry.getClass();
        imn imnVar = (imn) entry.getValue();
        if (imnVar == null || (str = imnVar.a) == null) {
            return null;
        }
        return b.h(str);
    }
}
