package defpackage;

import java.util.Comparator;

/* JADX INFO: loaded from: classes5.dex */
public final class cvc0<T> implements Comparator {
    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Comparator
    public final int compare(T t, T t2) {
        return Long.valueOf(((n5d0) t2).h).compareTo(Long.valueOf(((n5d0) t).h));
    }
}
