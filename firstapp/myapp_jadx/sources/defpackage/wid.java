package defpackage;

import java.util.Collections;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: loaded from: classes4.dex */
public final class wid implements boh0 {
    public final String a;
    public final p1l b;

    public wid(Set<o9s> set, p1l p1lVar) {
        this.a = b(set);
        this.b = p1lVar;
    }

    public static String b(Set<o9s> set) {
        StringBuilder sb = new StringBuilder();
        Iterator<o9s> it = set.iterator();
        while (it.hasNext()) {
            o9s next = it.next();
            sb.append(next.a());
            sb.append('/');
            sb.append(next.b());
            if (it.hasNext()) {
                sb.append(' ');
            }
        }
        return sb.toString();
    }

    @Override // defpackage.boh0
    public final String a() {
        Set setUnmodifiableSet;
        Set setUnmodifiableSet2;
        p1l p1lVar = this.b;
        synchronized (p1lVar.a) {
            setUnmodifiableSet = Collections.unmodifiableSet(p1lVar.a);
        }
        boolean zIsEmpty = setUnmodifiableSet.isEmpty();
        String str = this.a;
        if (zIsEmpty) {
            return str;
        }
        StringBuilder sb = new StringBuilder(str);
        sb.append(' ');
        synchronized (p1lVar.a) {
            setUnmodifiableSet2 = Collections.unmodifiableSet(p1lVar.a);
        }
        sb.append(b(setUnmodifiableSet2));
        return sb.toString();
    }
}
