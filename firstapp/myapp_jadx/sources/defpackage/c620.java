package defpackage;

import java.util.Comparator;

/* JADX INFO: loaded from: classes4.dex */
public final class c620<T> implements Comparator {
    public final /* synthetic */ b620 a;

    public c620(b620 b620Var) {
        this.a = b620Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Comparator
    public final int compare(T t, T t2) {
        int iCompare = this.a.compare(t, t2);
        return iCompare != 0 ? iCompare : Long.valueOf(((m420) t).d).compareTo(Long.valueOf(((m420) t2).d));
    }
}
