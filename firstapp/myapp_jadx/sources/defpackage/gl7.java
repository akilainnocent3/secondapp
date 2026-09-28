package defpackage;

import com.sportygames.newcms.CMSRes;
import java.math.BigDecimal;
import java.util.Iterator;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;

/* JADX INFO: loaded from: classes7.dex */
public interface gl7 {
    /* JADX WARN: Multi-variable type inference failed */
    default CMSRes b(BigDecimal bigDecimal) {
        bigDecimal.getClass();
        if (k().isEmpty()) {
            return null;
        }
        Iterator<E> it = k().iterator();
        int i = 0;
        while (true) {
            if (!it.hasNext()) {
                i = -1;
                break;
            }
            if (((skd0) ((Pair) it.next()).a).a.compareTo(bigDecimal) > 0) {
                break;
            }
            i++;
        }
        if (i < 0) {
            Pair pair = (Pair) CollectionsKt.d0(k());
            if (pair != null) {
                return (CMSRes) pair.b;
            }
            return null;
        }
        Pair pair2 = (Pair) CollectionsKt.V(Math.max(i - 1, 0), k());
        if (pair2 != null) {
            return (CMSRes) pair2.b;
        }
        return null;
    }

    CMSRes e();

    CMSRes i();

    uf00 k();

    CMSRes q();

    CMSRes s();
}
