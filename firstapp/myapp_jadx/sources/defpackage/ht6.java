package defpackage;

import java.util.Iterator;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ht6 implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ ht6(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        Object next;
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                ((Function0) obj).invoke();
                return Unit.a;
            default:
                nay.a aVar = nay.j0;
                String str = (String) ((nay) obj).f0.getValue();
                str.getClass();
                Iterator<T> it = c100.z.iterator();
                while (it.hasNext()) {
                    next = it.next();
                    if (Intrinsics.g(((c100) next).d, str)) {
                        return (c100) next;
                    }
                }
                next = null;
                return (c100) next;
        }
    }
}
