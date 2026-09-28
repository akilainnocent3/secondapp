package defpackage;

import com.sportybet.plugin.realsports.data.Event;
import com.sportybet.plugin.realsports.data.Market;
import java.util.Comparator;

/* JADX INFO: loaded from: classes7.dex */
public final class psu<T> implements Comparator {
    public final /* synthetic */ zsu a;
    public final /* synthetic */ Event b;

    public psu(zsu zsuVar, Event event) {
        this.a = zsuVar;
        this.b = event;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Comparator
    public final int compare(T t, T t2) {
        Integer num = 1;
        this.a.getClass();
        Event event = this.b;
        return (zsu.d(event, (Market) t) ? 0 : num).compareTo(zsu.d(event, (Market) t2) ? 0 : 1);
    }
}
