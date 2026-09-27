package com.google.protobuf.kotlin;

import com.google.protobuf.ByteString;
import java.nio.ByteBuffer;
import kotlin.jvm.internal.m0;
import oy.l;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes4.dex */
public final class ByteStringsKt {
    public static final byte get(@l ByteString byteString, int i10) {
        m0.p(byteString, "<this>");
        return byteString.byteAt(i10);
    }

    public static final boolean isNotEmpty(@l ByteString byteString) {
        m0.p(byteString, "<this>");
        return !byteString.isEmpty();
    }

    @l
    public static final ByteString plus(@l ByteString byteString, @l ByteString other) {
        m0.p(byteString, "<this>");
        m0.p(other, "other");
        ByteString byteStringConcat = byteString.concat(other);
        m0.o(byteStringConcat, "concat(other)");
        return byteStringConcat;
    }

    @l
    public static final ByteString toByteString(@l byte[] bArr) {
        m0.p(bArr, "<this>");
        ByteString byteStringCopyFrom = ByteString.copyFrom(bArr);
        m0.o(byteStringCopyFrom, "copyFrom(this)");
        return byteStringCopyFrom;
    }

    @l
    public static final ByteString toByteStringUtf8(@l String str) {
        m0.p(str, "<this>");
        ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8(str);
        m0.o(byteStringCopyFromUtf8, "copyFromUtf8(this)");
        return byteStringCopyFromUtf8;
    }

    @l
    public static final ByteString toByteString(@l ByteBuffer byteBuffer) {
        m0.p(byteBuffer, "<this>");
        ByteString byteStringCopyFrom = ByteString.copyFrom(byteBuffer);
        m0.o(byteStringCopyFrom, "copyFrom(this)");
        return byteStringCopyFrom;
    }
}
