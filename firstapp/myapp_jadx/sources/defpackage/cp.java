package defpackage;

import java.util.Comparator;

/* JADX INFO: loaded from: classes5.dex */
public final class cp<T> implements Comparator {
    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Comparator
    public final int compare(T t, T t2) {
        return Long.valueOf(((nq) t2).h).compareTo(Long.valueOf(((nq) t).h));
    }
}
