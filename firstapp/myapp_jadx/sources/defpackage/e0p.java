package defpackage;

import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public class e0p extends IOException {
    public boolean a;

    public static class a extends e0p {
    }

    public static e0p a() {
        return new e0p("Protocol message had invalid UTF-8.");
    }

    public static a b() {
        return new a("Protocol message tag had invalid wire type.");
    }

    public static e0p c() {
        return new e0p("CodedInputStream encountered a malformed varint.");
    }

    public static e0p d() {
        return new e0p("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
    }

    public static e0p e() {
        return new e0p("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }
}
