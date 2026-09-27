package yt;

import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
public class k extends IOException {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public q f159922b;

    public k(String str) {
        super(str);
        this.f159922b = null;
    }

    public static k g() {
        return new k("Protocol message end-group tag did not match expected tag.");
    }

    public static k h() {
        return new k("Protocol message contained an invalid tag (zero).");
    }

    public static k i() {
        return new k("Protocol message had invalid UTF-8.");
    }

    public static k j() {
        return new k("Protocol message tag had invalid wire type.");
    }

    public static k k() {
        return new k("CodedInputStream encountered a malformed varint.");
    }

    public static k l() {
        return new k("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
    }

    public static k m() {
        return new k("Protocol message had too many levels of nesting.  May be malicious.  Use CodedInputStream.setRecursionLimit() to increase the depth limit.");
    }

    public static k o() {
        return new k("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit.");
    }

    public static k p() {
        return new k("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either than the input has been truncated or that an embedded message misreported its own length.");
    }

    public q d() {
        return this.f159922b;
    }

    public k n(q qVar) {
        this.f159922b = qVar;
        return this;
    }
}
