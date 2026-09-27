package ft;

import java.util.EnumMap;
import kotlin.jvm.internal.m0;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
public final class y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @oy.l
    public final EnumMap<b, r> f85336a;

    public y(@oy.l EnumMap<b, r> defaultQualifiers) {
        m0.p(defaultQualifiers, "defaultQualifiers");
        this.f85336a = defaultQualifiers;
    }

    @oy.m
    public final r a(@oy.m b bVar) {
        return this.f85336a.get(bVar);
    }

    @oy.l
    public final EnumMap<b, r> b() {
        return this.f85336a;
    }
}
