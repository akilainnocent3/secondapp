package defpackage;

import java.util.Comparator;

/* JADX INFO: loaded from: classes5.dex */
public final class vc2<T> implements Comparator {
    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Comparator
    public final int compare(T t, T t2) {
        return Long.valueOf(((eon) t2).h).compareTo(Long.valueOf(((eon) t).h));
    }
}
