package com.applovin.shadow.okio;

import dr.g1;
import java.io.File;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.nio.file.OpenOption;
import java.util.Arrays;
import kotlin.jvm.internal.m0;

/* JADX INFO: renamed from: com.applovin.shadow.okio.-DeprecatedOkio, reason: invalid class name */
/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes2.dex */
@dr.o(message = "changed in Okio 2.x")
public final class DeprecatedOkio {

    @oy.l
    public static final DeprecatedOkio INSTANCE = new DeprecatedOkio();

    private DeprecatedOkio() {
    }

    @oy.l
    @dr.o(level = dr.q.ERROR, message = "moved to extension function", replaceWith = @g1(expression = "file.appendingSink()", imports = {"com.applovin.shadow.okio.appendingSink"}))
    public final Sink appendingSink(@oy.l File file) {
        m0.p(file, "file");
        return Okio.appendingSink(file);
    }

    @oy.l
    @dr.o(level = dr.q.ERROR, message = "moved to extension function", replaceWith = @g1(expression = "blackholeSink()", imports = {"com.applovin.shadow.okio.blackholeSink"}))
    public final Sink blackhole() {
        return Okio.blackhole();
    }

    @oy.l
    @dr.o(level = dr.q.ERROR, message = "moved to extension function", replaceWith = @g1(expression = "sink.buffer()", imports = {"com.applovin.shadow.okio.buffer"}))
    public final BufferedSink buffer(@oy.l Sink sink) {
        m0.p(sink, "sink");
        return Okio.buffer(sink);
    }

    @oy.l
    @dr.o(level = dr.q.ERROR, message = "moved to extension function", replaceWith = @g1(expression = "file.sink()", imports = {"com.applovin.shadow.okio.sink"}))
    public final Sink sink(@oy.l File file) {
        m0.p(file, "file");
        return Okio__JvmOkioKt.sink$default(file, false, 1, null);
    }

    @oy.l
    @dr.o(level = dr.q.ERROR, message = "moved to extension function", replaceWith = @g1(expression = "file.source()", imports = {"com.applovin.shadow.okio.source"}))
    public final Source source(@oy.l File file) {
        m0.p(file, "file");
        return Okio.source(file);
    }

    @oy.l
    @dr.o(level = dr.q.ERROR, message = "moved to extension function", replaceWith = @g1(expression = "source.buffer()", imports = {"com.applovin.shadow.okio.buffer"}))
    public final BufferedSource buffer(@oy.l Source source) {
        m0.p(source, "source");
        return Okio.buffer(source);
    }

    @oy.l
    @dr.o(level = dr.q.ERROR, message = "moved to extension function", replaceWith = @g1(expression = "outputStream.sink()", imports = {"com.applovin.shadow.okio.sink"}))
    public final Sink sink(@oy.l OutputStream outputStream) {
        m0.p(outputStream, "outputStream");
        return Okio.sink(outputStream);
    }

    @oy.l
    @dr.o(level = dr.q.ERROR, message = "moved to extension function", replaceWith = @g1(expression = "inputStream.source()", imports = {"com.applovin.shadow.okio.source"}))
    public final Source source(@oy.l InputStream inputStream) {
        m0.p(inputStream, "inputStream");
        return Okio.source(inputStream);
    }

    @oy.l
    @dr.o(level = dr.q.ERROR, message = "moved to extension function", replaceWith = @g1(expression = "path.sink(*options)", imports = {"com.applovin.shadow.okio.sink"}))
    public final Sink sink(@oy.l java.nio.file.Path path, @oy.l OpenOption... options) {
        m0.p(path, "path");
        m0.p(options, "options");
        return Okio.sink(path, (OpenOption[]) Arrays.copyOf(options, options.length));
    }

    @oy.l
    @dr.o(level = dr.q.ERROR, message = "moved to extension function", replaceWith = @g1(expression = "path.source(*options)", imports = {"com.applovin.shadow.okio.source"}))
    public final Source source(@oy.l java.nio.file.Path path, @oy.l OpenOption... options) {
        m0.p(path, "path");
        m0.p(options, "options");
        return Okio.source(path, (OpenOption[]) Arrays.copyOf(options, options.length));
    }

    @oy.l
    @dr.o(level = dr.q.ERROR, message = "moved to extension function", replaceWith = @g1(expression = "socket.sink()", imports = {"com.applovin.shadow.okio.sink"}))
    public final Sink sink(@oy.l Socket socket) {
        m0.p(socket, "socket");
        return Okio.sink(socket);
    }

    @oy.l
    @dr.o(level = dr.q.ERROR, message = "moved to extension function", replaceWith = @g1(expression = "socket.source()", imports = {"com.applovin.shadow.okio.source"}))
    public final Source source(@oy.l Socket socket) {
        m0.p(socket, "socket");
        return Okio.source(socket);
    }
}
