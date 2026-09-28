package defpackage;

import java.util.Comparator;

/* JADX INFO: loaded from: classes5.dex */
public final class c070<T> implements Comparator {
    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Comparator
    public final int compare(T t, T t2) {
        return Long.valueOf(((fk70) t2).i).compareTo(Long.valueOf(((fk70) t).i));
    }
}
