package defpackage;

import java.util.List;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class xhf0 implements Function1 {
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        List list = (List) obj;
        Object obj2 = list.get(1);
        obj2.getClass();
        i3z i3zVar = ((Boolean) obj2).booleanValue() ? i3z.a : i3z.b;
        Object obj3 = list.get(0);
        obj3.getClass();
        return new yhf0(i3zVar, ((Float) obj3).floatValue());
    }
}
