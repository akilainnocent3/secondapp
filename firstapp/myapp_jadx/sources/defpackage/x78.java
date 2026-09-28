package defpackage;

import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class x78 implements Function2 {
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        String str = (String) obj;
        CoroutineContext.Element element = (CoroutineContext.Element) obj2;
        str.getClass();
        element.getClass();
        if (str.length() == 0) {
            return element.toString();
        }
        return str + ", " + element;
    }
}
