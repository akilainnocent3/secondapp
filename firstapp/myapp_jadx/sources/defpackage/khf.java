package defpackage;

import android.hardware.camera2.params.DynamicRangeProfiles;
import java.util.Collections;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class khf implements ihf.a {
    public static final ihf a = new ihf(new khf());
    public static final Set<dhf> b = Collections.singleton(dhf.d);

    @Override // ihf.a
    public final Set<dhf> a() {
        return b;
    }

    @Override // ihf.a
    public final DynamicRangeProfiles b() {
        return null;
    }

    @Override // ihf.a
    public final Set<dhf> c(dhf dhfVar) {
        km20.a("DynamicRange is not supported: " + dhfVar, dhf.d.equals(dhfVar));
        return b;
    }
}
