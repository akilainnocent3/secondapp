package defpackage;

import java.util.Comparator;

/* JADX INFO: loaded from: classes5.dex */
public final class g4b0<T> implements Comparator {
    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Comparator
    public final int compare(T t, T t2) {
        return Integer.valueOf(((Number) t).intValue()).compareTo(Integer.valueOf(((Number) t2).intValue()));
    }
}
