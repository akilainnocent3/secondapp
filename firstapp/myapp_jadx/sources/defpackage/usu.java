package defpackage;

import com.sportybet.plugin.realsports.data.Event;
import java.util.Comparator;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public final class usu<T> implements Comparator {
    public final /* synthetic */ zsu a;
    public final /* synthetic */ Event b;

    public usu(zsu zsuVar, Event event) {
        this.a = zsuVar;
        this.b = event;
    }

    @Override // java.util.Comparator
    public final int compare(T t, T t2) {
        Integer num = 1;
        this.a.getClass();
        Event event = this.b;
        return (zsu.e(event, (List) t) ? 0 : num).compareTo(zsu.e(event, (List) t2) ? 0 : 1);
    }
}
