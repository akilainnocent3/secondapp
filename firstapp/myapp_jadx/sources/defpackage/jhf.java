package defpackage;

import android.hardware.camera2.params.DynamicRangeProfiles;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class jhf implements ihf.a {
    public final DynamicRangeProfiles a;

    public jhf(Object obj) {
        this.a = (DynamicRangeProfiles) obj;
    }

    public static Set<dhf> d(Set<Long> set) {
        if (set.isEmpty()) {
            return Collections.EMPTY_SET;
        }
        HashSet hashSet = new HashSet(set.size());
        for (Long l : set) {
            long jLongValue = l.longValue();
            dhf dhfVar = (dhf) ehf.a.get(l);
            if (dhfVar == null) {
                pgt.i("DynamicRangesCompatApi33Impl", "Dynamic range profile cannot be converted to a DynamicRange object: " + jLongValue);
            }
            if (dhfVar != null) {
                hashSet.add(dhfVar);
            }
        }
        return Collections.unmodifiableSet(hashSet);
    }

    @Override // ihf.a
    public final Set<dhf> a() {
        return d(this.a.getSupportedProfiles());
    }

    @Override // ihf.a
    public final DynamicRangeProfiles b() {
        return this.a;
    }

    @Override // ihf.a
    public final Set<dhf> c(dhf dhfVar) {
        Long lA = ehf.a(dhfVar, this.a);
        km20.a("DynamicRange is not supported: " + dhfVar, lA != null);
        return d(this.a.getProfileCaptureRequestConstraints(lA.longValue()));
    }
}
