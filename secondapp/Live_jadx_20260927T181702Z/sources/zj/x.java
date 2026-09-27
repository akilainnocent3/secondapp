package zj;

import java.util.Arrays;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes4.dex */
public class x extends y {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List<g<?>> f161993b;

    public x(List<g<?>> list) {
        super("Dependency cycle detected: " + Arrays.toString(list.toArray()));
        this.f161993b = list;
    }

    public List<g<?>> d() {
        return this.f161993b;
    }
}
