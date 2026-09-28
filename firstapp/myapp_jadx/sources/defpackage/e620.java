package defpackage;

import java.util.Comparator;

/* JADX INFO: loaded from: classes4.dex */
public final class e620<T> implements Comparator {
    public final /* synthetic */ d620 a;

    public e620(d620 d620Var) {
        this.a = d620Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Comparator
    public final int compare(T t, T t2) {
        int iCompare = this.a.compare(t, t2);
        return iCompare != 0 ? iCompare : Long.valueOf(((m420) t).d).compareTo(Long.valueOf(((m420) t2).d));
    }
}
