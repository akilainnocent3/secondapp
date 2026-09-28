package defpackage;

import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.logging.Logger;
import java.util.stream.Collectors;

/* JADX INFO: loaded from: classes8.dex */
public final class mv5 {
    public final List<xs70> a;
    public final List<bj1> b;

    static {
        Logger.getLogger(mv5.class.getName());
    }

    public mv5(List list, iso isoVar) {
        new AtomicBoolean(false);
        new p040(0.08333333333333333d, 5.0d);
        new p040(0.016666666666666666d, 1.0d);
        this.a = list;
        List<bj1> list2 = (List) list.stream().map(new kv5()).collect(Collectors.toList());
        this.b = list2;
        if (list2.size() != 0) {
            list.stream().flatMap(new lv5()).findAny().isPresent();
        } else {
            ib5.a("Callback with no instruments is not allowed");
            throw null;
        }
    }

    public final String toString() {
        return ng1.a(new StringBuilder("CallbackRegistration{instrumentDescriptors="), this.b, "}");
    }
}
