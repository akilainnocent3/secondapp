package u1;

import android.os.Bundle;
import android.util.Size;
import android.util.SizeF;
import k.t0;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes.dex */
@t0(21)
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @oy.l
    public static final b f137532a = new b();

    @cs.o
    @k.t
    public static final void a(@oy.l Bundle bundle, @oy.l String str, @oy.m Size size) {
        bundle.putSize(str, size);
    }

    @cs.o
    @k.t
    public static final void b(@oy.l Bundle bundle, @oy.l String str, @oy.m SizeF sizeF) {
        bundle.putSizeF(str, sizeF);
    }
}
