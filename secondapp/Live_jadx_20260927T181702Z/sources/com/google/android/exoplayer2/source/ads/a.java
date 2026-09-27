package com.google.android.exoplayer2.source.ads;

import ah.d0;
import androidx.annotation.Nullable;
import java.io.IOException;
import re.l4;
import re.x2;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public interface a {

    /* JADX INFO: renamed from: com.google.android.exoplayer2.source.ads.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public interface InterfaceC0443a {
        void a(AdPlaybackState adPlaybackState);

        void b(com.google.android.exoplayer2.source.ads.b.a aVar, d0 d0Var);

        void onAdClicked();

        void onAdTapped();
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public interface b {
        @Nullable
        a a(x2.b bVar);
    }

    void handlePrepareComplete(com.google.android.exoplayer2.source.ads.b bVar, int i10, int i11);

    void handlePrepareError(com.google.android.exoplayer2.source.ads.b bVar, int i10, int i11, IOException iOException);

    void release();

    void setPlayer(@Nullable l4 l4Var);

    void setSupportedContentTypes(int... iArr);

    void start(com.google.android.exoplayer2.source.ads.b bVar, d0 d0Var, Object obj, zg.c cVar, InterfaceC0443a interfaceC0443a);

    void stop(com.google.android.exoplayer2.source.ads.b bVar, InterfaceC0443a interfaceC0443a);
}
