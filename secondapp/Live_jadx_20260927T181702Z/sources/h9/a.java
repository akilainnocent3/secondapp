package h9;

import java.util.Arrays;
import k.y0;
import kotlin.jvm.internal.m0;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes2.dex */
@y0({y0.a.LIBRARY_GROUP_PREFIX})
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @oy.l
    @cs.g
    public final byte[] f87926a;

    public a(@oy.l byte[] array) {
        m0.p(array, "array");
        this.f87926a = array;
    }

    public boolean equals(@oy.m Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof a) {
            return Arrays.equals(this.f87926a, ((a) obj).f87926a);
        }
        return false;
    }

    public int hashCode() {
        return Arrays.hashCode(this.f87926a);
    }
}
