package defpackage;

import java.util.Comparator;

/* JADX INFO: loaded from: classes4.dex */
public final class d620<T> implements Comparator {
    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Comparator
    public final int compare(T t, T t2) {
        return Integer.valueOf(((m420) t2).a.a).compareTo(Integer.valueOf(((m420) t).a.a));
    }
}
