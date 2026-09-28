package defpackage;

import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class j5b implements Function1 {
    public final /* synthetic */ int a;

    public /* synthetic */ j5b(int i) {
        this.a = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.a) {
            case 0:
                CoroutineContext.Element element = (CoroutineContext.Element) obj;
                if (element instanceof k5b) {
                    return (k5b) element;
                }
                return null;
            default:
                return Boolean.valueOf(((g7k.a) obj) != null);
        }
    }
}
