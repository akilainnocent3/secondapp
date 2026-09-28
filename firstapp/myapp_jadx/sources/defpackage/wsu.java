package defpackage;

import java.util.Comparator;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public final class wsu<T> implements Comparator {
    public final /* synthetic */ zsu a;
    public final /* synthetic */ int b;

    public wsu(zsu zsuVar, int i) {
        this.a = zsuVar;
        this.b = i;
    }

    @Override // java.util.Comparator
    public final int compare(T t, T t2) {
        this.a.getClass();
        int i = this.b;
        return zsu.a(i, (List) t).compareTo(zsu.a(i, (List) t2));
    }
}
