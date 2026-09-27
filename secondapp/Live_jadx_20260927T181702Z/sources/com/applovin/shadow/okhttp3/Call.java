package com.applovin.shadow.okhttp3;

import com.applovin.shadow.okio.Timeout;
import java.io.IOException;
import oy.l;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes2.dex */
public interface Call extends Cloneable {

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public interface Factory {
        @l
        Call newCall(@l Request request);
    }

    void cancel();

    @l
    Call clone();

    void enqueue(@l Callback callback);

    @l
    Response execute() throws IOException;

    boolean isCanceled();

    boolean isExecuted();

    @l
    Request request();

    @l
    Timeout timeout();
}
