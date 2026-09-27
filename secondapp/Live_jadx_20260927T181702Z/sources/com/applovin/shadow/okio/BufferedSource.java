package com.applovin.shadow.okio;

import dr.g1;
import java.io.IOException;
import java.io.InputStream;
import java.nio.channels.ReadableByteChannel;
import java.nio.charset.Charset;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes2.dex */
public interface BufferedSource extends Source, ReadableByteChannel {
    @oy.l
    @dr.o(level = dr.q.WARNING, message = "moved to val: use getBuffer() instead", replaceWith = @g1(expression = "buffer", imports = {}))
    Buffer buffer();

    boolean exhausted() throws IOException;

    @oy.l
    Buffer getBuffer();

    long indexOf(byte b10) throws IOException;

    long indexOf(byte b10, long j10) throws IOException;

    long indexOf(byte b10, long j10, long j11) throws IOException;

    long indexOf(@oy.l ByteString byteString) throws IOException;

    long indexOf(@oy.l ByteString byteString, long j10) throws IOException;

    long indexOfElement(@oy.l ByteString byteString) throws IOException;

    long indexOfElement(@oy.l ByteString byteString, long j10) throws IOException;

    @oy.l
    InputStream inputStream();

    @oy.l
    BufferedSource peek();

    boolean rangeEquals(long j10, @oy.l ByteString byteString) throws IOException;

    boolean rangeEquals(long j10, @oy.l ByteString byteString, int i10, int i11) throws IOException;

    int read(@oy.l byte[] bArr) throws IOException;

    int read(@oy.l byte[] bArr, int i10, int i11) throws IOException;

    long readAll(@oy.l Sink sink) throws IOException;

    byte readByte() throws IOException;

    @oy.l
    byte[] readByteArray() throws IOException;

    @oy.l
    byte[] readByteArray(long j10) throws IOException;

    @oy.l
    ByteString readByteString() throws IOException;

    @oy.l
    ByteString readByteString(long j10) throws IOException;

    long readDecimalLong() throws IOException;

    void readFully(@oy.l Buffer buffer, long j10) throws IOException;

    void readFully(@oy.l byte[] bArr) throws IOException;

    long readHexadecimalUnsignedLong() throws IOException;

    int readInt() throws IOException;

    int readIntLe() throws IOException;

    long readLong() throws IOException;

    long readLongLe() throws IOException;

    short readShort() throws IOException;

    short readShortLe() throws IOException;

    @oy.l
    String readString(long j10, @oy.l Charset charset) throws IOException;

    @oy.l
    String readString(@oy.l Charset charset) throws IOException;

    @oy.l
    String readUtf8() throws IOException;

    @oy.l
    String readUtf8(long j10) throws IOException;

    int readUtf8CodePoint() throws IOException;

    @oy.m
    String readUtf8Line() throws IOException;

    @oy.l
    String readUtf8LineStrict() throws IOException;

    @oy.l
    String readUtf8LineStrict(long j10) throws IOException;

    boolean request(long j10) throws IOException;

    void require(long j10) throws IOException;

    int select(@oy.l Options options) throws IOException;

    void skip(long j10) throws IOException;
}
