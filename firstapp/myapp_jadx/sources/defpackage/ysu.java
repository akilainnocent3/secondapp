package defpackage;

import java.util.Comparator;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public final class ysu<T> implements Comparator {
    public final /* synthetic */ vsu a;
    public final /* synthetic */ zsu b;
    public final /* synthetic */ int c;

    public ysu(vsu vsuVar, zsu zsuVar, int i) {
        this.a = vsuVar;
        this.b = zsuVar;
        this.c = i;
    }

    @Override // java.util.Comparator
    public final int compare(T t, T t2) {
        int iCompare = this.a.compare(t, t2);
        if (iCompare != 0) {
            return iCompare;
        }
        this.b.getClass();
        int i = this.c;
        return zsu.a(i, (List) t).compareTo(zsu.a(i, (List) t2));
    }
}
