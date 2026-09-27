package sw;

import java.io.IOException;
import kotlin.jvm.internal.m0;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
public final class a0 extends IOException {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @oy.l
    @cs.g
    public final b f135611b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a0(@oy.l b errorCode) {
        super("stream was reset: " + errorCode);
        m0.p(errorCode, "errorCode");
        this.f135611b = errorCode;
    }
}
