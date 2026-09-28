package defpackage;

import java.util.Comparator;

/* JADX INFO: loaded from: classes6.dex */
public final class q520<T> implements Comparator {
    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Comparator
    public final int compare(T t, T t2) {
        return Integer.valueOf(((h620) t2).a).compareTo(Integer.valueOf(((h620) t).a));
    }
}
