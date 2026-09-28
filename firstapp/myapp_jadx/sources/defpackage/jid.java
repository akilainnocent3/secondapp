package defpackage;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class jid implements Comparator {
    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        List list = (List) obj;
        List list2 = (List) obj2;
        return rl8.a.f(pid.i.c((pid.i) Collections.max(list, new rid()), (pid.i) Collections.max(list2, new rid()))).a(list.size(), list2.size()).b((pid.i) Collections.max(list, new sid()), (pid.i) Collections.max(list2, new sid()), new sid()).e();
    }
}
