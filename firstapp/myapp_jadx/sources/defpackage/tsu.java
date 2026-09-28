package defpackage;

import com.sportybet.plugin.realsports.data.Market;
import java.util.Comparator;

/* JADX INFO: loaded from: classes7.dex */
public final class tsu<T> implements Comparator {
    public final /* synthetic */ qsu a;
    public final /* synthetic */ zsu b;

    public tsu(qsu qsuVar, zsu zsuVar) {
        this.a = qsuVar;
        this.b = zsuVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Comparator
    public final int compare(T t, T t2) {
        int iCompare = this.a.compare(t, t2);
        if (iCompare != 0) {
            return iCompare;
        }
        this.b.getClass();
        return vl8.b(zsu.b((Market) t), zsu.b((Market) t2));
    }
}
