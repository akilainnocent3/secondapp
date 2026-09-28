package defpackage;

import java.util.Comparator;

/* JADX INFO: loaded from: classes7.dex */
public final class cl4<T> implements Comparator {
    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Comparator
    public final int compare(T t, T t2) {
        return Long.valueOf(((vj4) t).a).compareTo(Long.valueOf(((vj4) t2).a));
    }
}
