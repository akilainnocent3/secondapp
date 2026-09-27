package com.inmobi.media;

import java.io.IOException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
public final class Ba extends AbstractC4045ui {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final JSONObject f54394a;

    public Ba(JSONObject jsonObject) {
        kotlin.jvm.internal.m0.p(jsonObject, "jsonObject");
        this.f54394a = jsonObject;
    }

    @Override // com.inmobi.media.AbstractC4045ui
    public final void a(fx.m bufferedSink) throws IOException {
        kotlin.jvm.internal.m0.p(bufferedSink, "bufferedSink");
        String string = this.f54394a.toString();
        kotlin.jvm.internal.m0.o(string, "toString(...)");
        bufferedSink.writeUtf8(string);
    }

    @Override // com.inmobi.media.AbstractC4045ui
    public final String a() {
        return "application/json";
    }
}
