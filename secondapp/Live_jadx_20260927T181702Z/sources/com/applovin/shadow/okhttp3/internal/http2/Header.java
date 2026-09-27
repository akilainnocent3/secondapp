package com.applovin.shadow.okhttp3.internal.http2;

import com.applovin.shadow.okio.ByteString;
import cs.g;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.x;
import oy.l;
import oy.m;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes2.dex */
public final class Header {

    @l
    public static final Companion Companion = new Companion(null);

    @l
    @g
    public static final ByteString PSEUDO_PREFIX;

    @l
    @g
    public static final ByteString RESPONSE_STATUS;

    @l
    public static final String RESPONSE_STATUS_UTF8 = ":status";

    @l
    @g
    public static final ByteString TARGET_AUTHORITY;

    @l
    public static final String TARGET_AUTHORITY_UTF8 = ":authority";

    @l
    @g
    public static final ByteString TARGET_METHOD;

    @l
    public static final String TARGET_METHOD_UTF8 = ":method";

    @l
    @g
    public static final ByteString TARGET_PATH;

    @l
    public static final String TARGET_PATH_UTF8 = ":path";

    @l
    @g
    public static final ByteString TARGET_SCHEME;

    @l
    public static final String TARGET_SCHEME_UTF8 = ":scheme";

    @g
    public final int hpackSize;

    @l
    @g
    public final ByteString name;

    @l
    @g
    public final ByteString value;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class Companion {
        public /* synthetic */ Companion(x xVar) {
            this();
        }

        private Companion() {
        }
    }

    static {
        ByteString.Companion companion = ByteString.Companion;
        PSEUDO_PREFIX = companion.encodeUtf8(":");
        RESPONSE_STATUS = companion.encodeUtf8(":status");
        TARGET_METHOD = companion.encodeUtf8(":method");
        TARGET_PATH = companion.encodeUtf8(":path");
        TARGET_SCHEME = companion.encodeUtf8(":scheme");
        TARGET_AUTHORITY = companion.encodeUtf8(":authority");
    }

    public Header(@l ByteString name, @l ByteString value) {
        m0.p(name, "name");
        m0.p(value, "value");
        this.name = name;
        this.value = value;
        this.hpackSize = name.size() + 32 + value.size();
    }

    public static /* synthetic */ Header copy$default(Header header, ByteString byteString, ByteString byteString2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            byteString = header.name;
        }
        if ((i10 & 2) != 0) {
            byteString2 = header.value;
        }
        return header.copy(byteString, byteString2);
    }

    @l
    public final ByteString component1() {
        return this.name;
    }

    @l
    public final ByteString component2() {
        return this.value;
    }

    @l
    public final Header copy(@l ByteString name, @l ByteString value) {
        m0.p(name, "name");
        m0.p(value, "value");
        return new Header(name, value);
    }

    public boolean equals(@m Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Header)) {
            return false;
        }
        Header header = (Header) obj;
        return m0.g(this.name, header.name) && m0.g(this.value, header.value);
    }

    public int hashCode() {
        return (this.name.hashCode() * 31) + this.value.hashCode();
    }

    @l
    public String toString() {
        return this.name.utf8() + ": " + this.value.utf8();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public Header(@l String name, @l String value) {
        m0.p(name, "name");
        m0.p(value, "value");
        ByteString.Companion companion = ByteString.Companion;
        this(companion.encodeUtf8(name), companion.encodeUtf8(value));
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public Header(@l ByteString name, @l String value) {
        this(name, ByteString.Companion.encodeUtf8(value));
        m0.p(name, "name");
        m0.p(value, "value");
    }
}
