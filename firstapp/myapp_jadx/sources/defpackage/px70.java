package defpackage;

import java.util.Comparator;

/* JADX INFO: loaded from: classes6.dex */
public final class px70<T> implements Comparator {
    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Comparator
    public final int compare(T t, T t2) {
        return Long.valueOf(((hsq) t).l).compareTo(Long.valueOf(((hsq) t2).l));
    }
}
