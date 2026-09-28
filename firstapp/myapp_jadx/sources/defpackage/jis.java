package defpackage;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final class jis {
    public static final /* synthetic */ int a = 0;

    public static final uv60 a(Function1 function1, final Function2 function2) {
        Function2 function3 = new Function2() { // from class: iis
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                wv60 wv60Var = (wv60) obj;
                List list = (List) function2.invoke(wv60Var, obj2);
                int size = list.size();
                for (int i = 0; i < size; i++) {
                    Object obj3 = list.get(i);
                    if (obj3 != null && !wv60Var.a(obj3)) {
                        throw new IllegalArgumentException(("item at index " + i + " can't be saved: " + obj3).toString());
                    }
                }
                if (list.isEmpty()) {
                    return null;
                }
                return new ArrayList(list);
            }
        };
        function1.getClass();
        y8h0.d(1, function1);
        return new uv60(function1, function3);
    }
}
