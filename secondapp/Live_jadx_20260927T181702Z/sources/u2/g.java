package u2;

import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes.dex */
public final class g extends IOException {
    public /* synthetic */ g(String str, Throwable th2, int i10, kotlin.jvm.internal.x xVar) {
        this(str, (i10 & 2) != 0 ? null : th2);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(@oy.l String message, @oy.m Throwable th2) {
        super(message, th2);
        kotlin.jvm.internal.m0.p(message, "message");
    }
}
