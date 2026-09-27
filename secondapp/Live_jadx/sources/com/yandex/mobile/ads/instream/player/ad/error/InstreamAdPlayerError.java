package com.yandex.mobile.ads.instream.player.ad.error;

import oy.l;
import sr.a;
import sr.c;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
public final class InstreamAdPlayerError {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Reason f76908a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Throwable f76909b;

    /* JADX WARN: Enum visitor error
    jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v18 com.yandex.mobile.ads.instream.player.ad.error.InstreamAdPlayerError$Reason[], still in use, count: 1, list:
      (r0v18 com.yandex.mobile.ads.instream.player.ad.error.InstreamAdPlayerError$Reason[]) from 0x01e0: INVOKE (r0v18 com.yandex.mobile.ads.instream.player.ad.error.InstreamAdPlayerError$Reason[]) STATIC call: sr.c.c(java.lang.Enum[]):sr.a A[MD:<E extends java.lang.Enum<E>>:(E extends java.lang.Enum<E>[]):sr.a<E extends java.lang.Enum<E>> (m), WRAPPED] (LINE:481)
    	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
    	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
    	at jadx.core.utils.InsnRemover.lambda$unbindInsns$1(InsnRemover.java:101)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
    	at jadx.core.utils.InsnRemover.unbindInsns(InsnRemover.java:100)
    	at jadx.core.utils.InsnRemover.removeAllAndUnbind(InsnRemover.java:257)
    	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:187)
    	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
     */
    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class Reason {
        RENDERER_FAILED_DEQUEUE_OUTPUT_BUFFER,
        RENDERER_FAILED_DEQUEUE_INPUT_BUFFER,
        RENDERER_FAILED_STOP,
        RENDERER_FAILED_SET_SURFACE,
        RENDERER_FAILED_RELEASE_OUTPUT_BUFFER,
        RENDERER_FAILED_QUEUE_SECURE_INPUT_BUFFER,
        RENDERER_MEDIA_CODEC_UNKNOWN,
        TIMEOUT,
        ILLEGAL_SEEK_POSITION,
        DECODER_QUERY_ERROR,
        DECODER_INITIALIZATION_ERROR,
        DECODER_UNKNOWN_ERROR,
        BEHIND_LIVE_WINDOW_ERROR,
        DRM_KEYS_EXPIRED,
        DRM_MEDIA_RESOURCE_BUSY,
        DRM_SESSION_ERROR,
        HTTP_CLEARTEXT_NOT_PERMITTED,
        HTTP_CODE_UNAUTHORIZED,
        HTTP_CODE_FORBIDDEN,
        HTTP_CODE_NOT_FOUND,
        HTTP_CODE_UNKNOWN,
        SSL_HANDSHAKE_ERROR,
        NETWORK_UNAVAILABLE,
        CONTENT_PARSER_ERROR,
        LOADER_UNEXPECTED_ERROR,
        AUDIO_ERROR,
        SUBTITLE_ERROR,
        CACHE_ERROR,
        UNKNOWN,
        GENERAL_VPAID_ERROR;


        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static final /* synthetic */ a f76911c;

        static {
            f76911c = c.c(reasonArr);
        }

        private Reason() {
            super(str, i);
        }

        @l
        public static a<Reason> getEntries() {
            return f76911c;
        }

        public static Reason valueOf(String str) {
            return (Reason) Enum.valueOf(Reason.class, str);
        }

        public static Reason[] values() {
            return (Reason[]) f76910b.clone();
        }
    }

    public InstreamAdPlayerError(@l Reason reason, @l Throwable th2) {
        this.f76908a = reason;
        this.f76909b = th2;
    }

    @l
    public final Reason getReason() {
        return this.f76908a;
    }

    @l
    public final Throwable getUnderlyingError() {
        return this.f76909b;
    }
}
