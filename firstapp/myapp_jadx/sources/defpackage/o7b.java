package defpackage;

import java.util.Comparator;

/* JADX INFO: loaded from: classes6.dex */
public final class o7b<T> implements Comparator {
    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Comparator
    public final int compare(T t, T t2) {
        return Integer.valueOf(((s4q) t).c).compareTo(Integer.valueOf(((s4q) t2).c));
    }
}
