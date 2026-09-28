package defpackage;

import java.util.Comparator;

/* JADX INFO: loaded from: classes5.dex */
public final class xe70<T> implements Comparator {
    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Comparator
    public final int compare(T t, T t2) {
        return Long.valueOf(((q470) t).b).compareTo(Long.valueOf(((q470) t2).b));
    }
}
