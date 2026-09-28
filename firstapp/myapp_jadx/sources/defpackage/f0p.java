package defpackage;

import java.io.IOException;

/* JADX INFO: loaded from: classes4.dex */
public class f0p extends IOException {
    public boolean a;

    public static class a extends f0p {
    }

    public static f0p a() {
        return new f0p("Protocol message contained an invalid tag (zero).");
    }

    public static f0p b() {
        return new f0p("Protocol message had invalid UTF-8.");
    }

    public static a c() {
        return new a("Protocol message tag had invalid wire type.");
    }

    public static f0p d() {
        return new f0p("CodedInputStream encountered a malformed varint.");
    }

    public static f0p e() {
        return new f0p("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
    }

    public static f0p f() {
        return new f0p("Failed to parse the message.");
    }

    public static f0p g() {
        return new f0p("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }
}
