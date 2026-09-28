package defpackage;

import java.util.Comparator;

/* JADX INFO: loaded from: classes6.dex */
public final class i7q<T> implements Comparator {
    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Comparator
    public final int compare(T t, T t2) {
        return Long.valueOf(((g7q.b) t2).b).compareTo(Long.valueOf(((g7q.b) t).b));
    }
}
