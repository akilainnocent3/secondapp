package defpackage;

import com.sportybet.plugin.realsports.data.Market;
import java.util.Comparator;

/* JADX INFO: loaded from: classes7.dex */
public final class rsu<T> implements Comparator {
    public final /* synthetic */ zsu a;

    public rsu(zsu zsuVar) {
        this.a = zsuVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Comparator
    public final int compare(T t, T t2) {
        this.a.getClass();
        return vl8.b(zsu.b((Market) t), zsu.b((Market) t2));
    }
}
