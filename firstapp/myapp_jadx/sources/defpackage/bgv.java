package defpackage;

import java.util.Comparator;

/* JADX INFO: loaded from: classes6.dex */
public final class bgv<T> implements Comparator {
    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Comparator
    public final int compare(T t, T t2) {
        return Integer.valueOf(((aev) t).a.ordinal()).compareTo(Integer.valueOf(((aev) t2).a.ordinal()));
    }
}
