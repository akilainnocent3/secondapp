package defpackage;

import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class yv60 implements Function1 {
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        obj.getClass();
        List list = (List) obj;
        Object obj2 = list.get(0);
        Function1<Object, Object> function1 = kx60.i.b;
        Boolean bool = Boolean.FALSE;
        ora0 ora0Var = null;
        ora0 ora0Var2 = (Intrinsics.g(obj2, bool) || obj2 == null) ? null : (ora0) function1.invoke(obj2);
        Object obj3 = list.get(1);
        ora0 ora0Var3 = (Intrinsics.g(obj3, bool) || obj3 == null) ? null : (ora0) function1.invoke(obj3);
        Object obj4 = list.get(2);
        ora0 ora0Var4 = (Intrinsics.g(obj4, bool) || obj4 == null) ? null : (ora0) function1.invoke(obj4);
        Object obj5 = list.get(3);
        if (!Intrinsics.g(obj5, bool) && obj5 != null) {
            ora0Var = (ora0) function1.invoke(obj5);
        }
        return new jlf0(ora0Var2, ora0Var3, ora0Var4, ora0Var);
    }
}
