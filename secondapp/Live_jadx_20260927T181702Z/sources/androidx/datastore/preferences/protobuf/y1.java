package androidx.datastore.preferences.protobuf;

import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes.dex */
public class y1 extends IOException {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final long f10332d = -1616151763072450476L;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public v2 f10333b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f10334c;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static class a extends y1 {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final long f10335e = 3283890091615336259L;

        public a(String description) {
            super(description);
        }
    }

    public y1(String description) {
        super(description);
        this.f10333b = null;
    }

    public static y1 h() {
        return new y1("Protocol message end-group tag did not match expected tag.");
    }

    public static y1 i() {
        return new y1("Protocol message contained an invalid tag (zero).");
    }

    public static y1 j() {
        return new y1("Protocol message had invalid UTF-8.");
    }

    public static a k() {
        return new a("Protocol message tag had invalid wire type.");
    }

    public static y1 l() {
        return new y1("CodedInputStream encountered a malformed varint.");
    }

    public static y1 m() {
        return new y1("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
    }

    public static y1 n() {
        return new y1("Failed to parse the message.");
    }

    public static y1 o() {
        return new y1("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
    }

    public static y1 r() {
        return new y1("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit.");
    }

    public static y1 s() {
        return new y1("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    public boolean d() {
        return this.f10334c;
    }

    public v2 g() {
        return this.f10333b;
    }

    public void p() {
        this.f10334c = true;
    }

    public y1 q(v2 unfinishedMessage) {
        this.f10333b = unfinishedMessage;
        return this;
    }

    public IOException t() {
        return getCause() instanceof IOException ? (IOException) getCause() : this;
    }

    public y1(Exception e10) {
        super(e10.getMessage(), e10);
        this.f10333b = null;
    }

    public y1(String description, Exception e10) {
        super(description, e10);
        this.f10333b = null;
    }

    public y1(IOException e10) {
        super(e10.getMessage(), e10);
        this.f10333b = null;
    }

    public y1(String description, IOException e10) {
        super(description, e10);
        this.f10333b = null;
    }
}
