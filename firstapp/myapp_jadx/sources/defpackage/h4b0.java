package defpackage;

import java.util.Comparator;

/* JADX INFO: loaded from: classes5.dex */
public final class h4b0<T> implements Comparator {
    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Comparator
    public final int compare(T t, T t2) {
        return Integer.valueOf(((dzo) t).a).compareTo(Integer.valueOf(((dzo) t2).a));
    }
}
