package androidx.lifecycle;

import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes.dex */
@k.y0({k.y0.a.LIBRARY_GROUP_PREFIX})
public class k0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @oy.l
    public final Map<String, Integer> f13391a = new HashMap();

    @k.y0({k.y0.a.LIBRARY_GROUP_PREFIX})
    public boolean a(@oy.l String name, int i10) {
        kotlin.jvm.internal.m0.p(name, "name");
        Integer num = this.f13391a.get(name);
        int iIntValue = num != null ? num.intValue() : 0;
        boolean z10 = (iIntValue & i10) != 0;
        this.f13391a.put(name, Integer.valueOf(i10 | iIntValue));
        return !z10;
    }
}
