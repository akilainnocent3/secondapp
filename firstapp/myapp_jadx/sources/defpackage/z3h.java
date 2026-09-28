package defpackage;

import java.util.Comparator;

/* JADX INFO: loaded from: classes.dex */
public final class z3h<T> implements Comparator {
    public final /* synthetic */ x6w a;

    public z3h(x6w x6wVar) {
        this.a = x6wVar;
    }

    @Override // java.util.Comparator
    public final int compare(T t, T t2) {
        x6w x6wVar = this.a;
        return ((Comparable) x6wVar.invoke(t)).compareTo((Comparable) x6wVar.invoke(t2));
    }
}
