package com.google.android.exoplayer2.source.rtsp;

import ah.v;
import androidx.annotation.Nullable;
import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public interface a extends v {

    /* JADX INFO: renamed from: com.google.android.exoplayer2.source.rtsp.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public interface InterfaceC0450a {
        @Nullable
        InterfaceC0450a a();

        a b(int i10) throws IOException;
    }

    int c();

    String e();

    boolean f();

    @Nullable
    g.b h();
}
