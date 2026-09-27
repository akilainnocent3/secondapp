package com.applovin.shadow.okhttp3.internal.http2;

import com.applovin.shadow.okio.BufferedSource;
import cs.g;
import java.io.IOException;
import java.util.List;
import kotlin.jvm.internal.m0;
import oy.l;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes2.dex */
public interface PushObserver {

    @l
    public static final Companion Companion = Companion.$$INSTANCE;

    @l
    @g
    public static final PushObserver CANCEL = new Companion.PushObserverCancel();

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
        public static final class PushObserverCancel implements PushObserver {
            @Override // com.applovin.shadow.okhttp3.internal.http2.PushObserver
            public boolean onData(int i10, @l BufferedSource source, int i11, boolean z10) throws IOException {
                m0.p(source, "source");
                source.skip(i11);
                return true;
            }

            @Override // com.applovin.shadow.okhttp3.internal.http2.PushObserver
            public boolean onHeaders(int i10, @l List<Header> responseHeaders, boolean z10) {
                m0.p(responseHeaders, "responseHeaders");
                return true;
            }

            @Override // com.applovin.shadow.okhttp3.internal.http2.PushObserver
            public boolean onRequest(int i10, @l List<Header> requestHeaders) {
                m0.p(requestHeaders, "requestHeaders");
                return true;
            }

            @Override // com.applovin.shadow.okhttp3.internal.http2.PushObserver
            public void onReset(int i10, @l ErrorCode errorCode) {
                m0.p(errorCode, "errorCode");
            }
        }

        private Companion() {
        }
    }

    boolean onData(int i10, @l BufferedSource bufferedSource, int i11, boolean z10) throws IOException;

    boolean onHeaders(int i10, @l List<Header> list, boolean z10);

    boolean onRequest(int i10, @l List<Header> list);

    void onReset(int i10, @l ErrorCode errorCode);
}
