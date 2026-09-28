package defpackage;

import android.util.Size;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class pkl implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ pkl(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                List list = (List) ((rkl) obj).d.getValue();
                if (list.isEmpty()) {
                    list = null;
                }
                if (list == null) {
                    return null;
                }
                Iterator it = list.iterator();
                if (!it.hasNext()) {
                    lrh0.a();
                    return null;
                }
                Object next = it.next();
                if (it.hasNext()) {
                    int iA = kx90.a((Size) next);
                    do {
                        Object next2 = it.next();
                        int iA2 = kx90.a((Size) next2);
                        if (iA < iA2) {
                            next = next2;
                            iA = iA2;
                        }
                    } while (it.hasNext());
                }
                return (Size) next;
            default:
                ((Function0) obj).invoke();
                return Unit.a;
        }
    }
}
