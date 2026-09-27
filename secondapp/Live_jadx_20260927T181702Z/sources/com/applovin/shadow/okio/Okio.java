package com.applovin.shadow.okio;

import java.io.Closeable;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.nio.file.OpenOption;
import java.security.MessageDigest;
import javax.crypto.Cipher;
import javax.crypto.Mac;

/* JADX INFO: loaded from: classes2.dex */
public final class Okio {
    @oy.l
    public static final Sink appendingSink(@oy.l File file) throws FileNotFoundException {
        return Okio__JvmOkioKt.appendingSink(file);
    }

    @oy.l
    public static final FileSystem asResourceFileSystem(@oy.l ClassLoader classLoader) {
        return Okio__JvmOkioKt.asResourceFileSystem(classLoader);
    }

    @cs.j(name = "blackhole")
    @oy.l
    public static final Sink blackhole() {
        return Okio__OkioKt.blackhole();
    }

    @oy.l
    public static final BufferedSink buffer(@oy.l Sink sink) {
        return Okio__OkioKt.buffer(sink);
    }

    @oy.l
    public static final CipherSink cipherSink(@oy.l Sink sink, @oy.l Cipher cipher) {
        return Okio__JvmOkioKt.cipherSink(sink, cipher);
    }

    @oy.l
    public static final CipherSource cipherSource(@oy.l Source source, @oy.l Cipher cipher) {
        return Okio__JvmOkioKt.cipherSource(source, cipher);
    }

    @oy.l
    public static final HashingSink hashingSink(@oy.l Sink sink, @oy.l MessageDigest messageDigest) {
        return Okio__JvmOkioKt.hashingSink(sink, messageDigest);
    }

    @oy.l
    public static final HashingSource hashingSource(@oy.l Source source, @oy.l MessageDigest messageDigest) {
        return Okio__JvmOkioKt.hashingSource(source, messageDigest);
    }

    public static final boolean isAndroidGetsocknameError(@oy.l AssertionError assertionError) {
        return Okio__JvmOkioKt.isAndroidGetsocknameError(assertionError);
    }

    @oy.l
    public static final FileSystem openZip(@oy.l FileSystem fileSystem, @oy.l Path path) throws IOException {
        return Okio__JvmOkioKt.openZip(fileSystem, path);
    }

    @oy.l
    @cs.k
    public static final Sink sink(@oy.l File file) throws FileNotFoundException {
        return Okio__JvmOkioKt.sink(file);
    }

    @oy.l
    public static final Source source(@oy.l File file) throws FileNotFoundException {
        return Okio__JvmOkioKt.source(file);
    }

    public static final <T extends Closeable, R> R use(T t10, @oy.l ds.l<? super T, ? extends R> lVar) {
        return (R) Okio__OkioKt.use(t10, lVar);
    }

    @oy.l
    public static final BufferedSource buffer(@oy.l Source source) {
        return Okio__OkioKt.buffer(source);
    }

    @oy.l
    public static final HashingSink hashingSink(@oy.l Sink sink, @oy.l Mac mac) {
        return Okio__JvmOkioKt.hashingSink(sink, mac);
    }

    @oy.l
    public static final HashingSource hashingSource(@oy.l Source source, @oy.l Mac mac) {
        return Okio__JvmOkioKt.hashingSource(source, mac);
    }

    @oy.l
    @cs.k
    public static final Sink sink(@oy.l File file, boolean z10) throws FileNotFoundException {
        return Okio__JvmOkioKt.sink(file, z10);
    }

    @oy.l
    public static final Source source(@oy.l InputStream inputStream) {
        return Okio__JvmOkioKt.source(inputStream);
    }

    @oy.l
    public static final Sink sink(@oy.l OutputStream outputStream) {
        return Okio__JvmOkioKt.sink(outputStream);
    }

    @oy.l
    public static final Source source(@oy.l Socket socket) throws IOException {
        return Okio__JvmOkioKt.source(socket);
    }

    @oy.l
    public static final Sink sink(@oy.l Socket socket) throws IOException {
        return Okio__JvmOkioKt.sink(socket);
    }

    @oy.l
    public static final Source source(@oy.l java.nio.file.Path path, @oy.l OpenOption... openOptionArr) throws IOException {
        return Okio__JvmOkioKt.source(path, openOptionArr);
    }

    @oy.l
    public static final Sink sink(@oy.l java.nio.file.Path path, @oy.l OpenOption... openOptionArr) throws IOException {
        return Okio__JvmOkioKt.sink(path, openOptionArr);
    }
}
