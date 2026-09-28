package defpackage;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class ym70 implements m730 {
    @Override // defpackage.m730
    public final Object get() {
        bxi0 bxi0Var = new bxi0();
        HashMap map = new HashMap();
        Set set = Collections.EMPTY_SET;
        if (set == null) {
            bmy.a("Null flags");
            return null;
        }
        map.put(kw20.a, new mk1(30000L, 86400000L, set));
        if (set == null) {
            bmy.a("Null flags");
            return null;
        }
        map.put(kw20.c, new mk1(1000L, 86400000L, set));
        if (set == null) {
            bmy.a("Null flags");
            return null;
        }
        Set setUnmodifiableSet = Collections.unmodifiableSet(new HashSet(Arrays.asList(sm70.b.b)));
        if (setUnmodifiableSet == null) {
            bmy.a("Null flags");
            return null;
        }
        map.put(kw20.b, new mk1(86400000L, 86400000L, setUnmodifiableSet));
        if (map.keySet().size() >= kw20.values().length) {
            new HashMap();
            return new lk1(bxi0Var, map);
        }
        ib5.a("Not all priorities have been configured");
        return null;
    }
}
