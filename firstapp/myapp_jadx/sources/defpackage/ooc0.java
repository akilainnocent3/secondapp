package defpackage;

import java.util.Comparator;

/* JADX INFO: loaded from: classes.dex */
public final class ooc0<T> implements Comparator {
    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Comparator
    public final int compare(T t, T t2) {
        return Integer.valueOf(((a1f) t).a).compareTo(Integer.valueOf(((a1f) t2).a));
    }
}
