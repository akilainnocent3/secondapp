package defpackage;

import java.util.Comparator;

/* JADX INFO: loaded from: classes.dex */
public final class d840<T> implements Comparator {
    @Override // java.util.Comparator
    public final int compare(T t, T t2) {
        return Integer.valueOf(((vih) t2).priority()).compareTo(Integer.valueOf(((vih) t).priority()));
    }
}
