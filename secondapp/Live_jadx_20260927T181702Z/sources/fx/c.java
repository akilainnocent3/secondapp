package fx;

import java.io.File;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.nio.file.OpenOption;
import java.nio.file.Path;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
@dr.o(message = "changed in Okio 2.x")
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @oy.l
    public static final c f85563a = new c();

    @oy.l
    @dr.o(level = dr.q.ERROR, message = "moved to extension function", replaceWith = @dr.g1(expression = "file.appendingSink()", imports = {"okio.appendingSink"}))
    public final b1 a(@oy.l File file) {
        kotlin.jvm.internal.m0.p(file, "file");
        return n0.a(file);
    }

    @oy.l
    @dr.o(level = dr.q.ERROR, message = "moved to extension function", replaceWith = @dr.g1(expression = "blackholeSink()", imports = {"okio.blackholeSink"}))
    public final b1 b() {
        return n0.c();
    }

    @oy.l
    @dr.o(level = dr.q.ERROR, message = "moved to extension function", replaceWith = @dr.g1(expression = "sink.buffer()", imports = {"okio.buffer"}))
    public final m c(@oy.l b1 sink) {
        kotlin.jvm.internal.m0.p(sink, "sink");
        return n0.d(sink);
    }

    @oy.l
    @dr.o(level = dr.q.ERROR, message = "moved to extension function", replaceWith = @dr.g1(expression = "source.buffer()", imports = {"okio.buffer"}))
    public final n d(@oy.l d1 source) {
        kotlin.jvm.internal.m0.p(source, "source");
        return n0.e(source);
    }

    @oy.l
    @dr.o(level = dr.q.ERROR, message = "moved to extension function", replaceWith = @dr.g1(expression = "file.sink()", imports = {"okio.sink"}))
    public final b1 e(@oy.l File file) {
        kotlin.jvm.internal.m0.p(file, "file");
        return o0.o(file, false, 1, null);
    }

    @oy.l
    @dr.o(level = dr.q.ERROR, message = "moved to extension function", replaceWith = @dr.g1(expression = "outputStream.sink()", imports = {"okio.sink"}))
    public final b1 f(@oy.l OutputStream outputStream) {
        kotlin.jvm.internal.m0.p(outputStream, "outputStream");
        return n0.p(outputStream);
    }

    @oy.l
    @dr.o(level = dr.q.ERROR, message = "moved to extension function", replaceWith = @dr.g1(expression = "socket.sink()", imports = {"okio.sink"}))
    public final b1 g(@oy.l Socket socket) {
        kotlin.jvm.internal.m0.p(socket, "socket");
        return n0.q(socket);
    }

    @oy.l
    @dr.o(level = dr.q.ERROR, message = "moved to extension function", replaceWith = @dr.g1(expression = "path.sink(*options)", imports = {"okio.sink"}))
    public final b1 h(@oy.l Path path, @oy.l OpenOption... options) {
        kotlin.jvm.internal.m0.p(path, "path");
        kotlin.jvm.internal.m0.p(options, "options");
        return n0.r(path, (OpenOption[]) Arrays.copyOf(options, options.length));
    }

    @oy.l
    @dr.o(level = dr.q.ERROR, message = "moved to extension function", replaceWith = @dr.g1(expression = "file.source()", imports = {"okio.source"}))
    public final d1 i(@oy.l File file) {
        kotlin.jvm.internal.m0.p(file, "file");
        return n0.u(file);
    }

    @oy.l
    @dr.o(level = dr.q.ERROR, message = "moved to extension function", replaceWith = @dr.g1(expression = "inputStream.source()", imports = {"okio.source"}))
    public final d1 j(@oy.l InputStream inputStream) {
        kotlin.jvm.internal.m0.p(inputStream, "inputStream");
        return n0.v(inputStream);
    }

    @oy.l
    @dr.o(level = dr.q.ERROR, message = "moved to extension function", replaceWith = @dr.g1(expression = "socket.source()", imports = {"okio.source"}))
    public final d1 k(@oy.l Socket socket) {
        kotlin.jvm.internal.m0.p(socket, "socket");
        return n0.w(socket);
    }

    @oy.l
    @dr.o(level = dr.q.ERROR, message = "moved to extension function", replaceWith = @dr.g1(expression = "path.source(*options)", imports = {"okio.source"}))
    public final d1 l(@oy.l Path path, @oy.l OpenOption... options) {
        kotlin.jvm.internal.m0.p(path, "path");
        kotlin.jvm.internal.m0.p(options, "options");
        return n0.x(path, (OpenOption[]) Arrays.copyOf(options, options.length));
    }
}
