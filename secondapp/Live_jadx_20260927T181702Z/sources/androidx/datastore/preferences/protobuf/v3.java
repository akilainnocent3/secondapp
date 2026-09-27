package androidx.datastore.preferences.protobuf;

import java.util.logging.Logger;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes.dex */
public final class v3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final b f10298a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f10299b = 4;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f10300c = 28;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f10301d = 2;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final String f10302e = "";

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final b f10303f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int f10304g = 4;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final int f10305h = 28;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final int f10306i = 2;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final String f10307j = "";

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final String f10308k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final Logger f10309l;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class a extends RuntimeException {
        public a(String message) {
            super(message);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public enum b {
        GOOGLE_INTERNAL,
        PUBLIC
    }

    static {
        b bVar = b.PUBLIC;
        f10298a = bVar;
        f10303f = bVar;
        f10308k = d(4, 28, 2, "");
        f10309l = Logger.getLogger(v3.class.getName());
    }

    public static boolean a() {
        String str = System.getenv("TEMORARILY_DISABLE_PROTOBUF_VERSION_CHECK");
        return str != null && str.equals("true");
    }

    public static void b(b domain, int major, int minor, int patch, String suffix, String location) {
        if (a()) {
            return;
        }
        c(domain, major, minor, patch, suffix, location);
    }

    public static void c(b domain, int major, int minor, int patch, String suffix, String location) {
        if (a()) {
            return;
        }
        String strD = d(major, minor, patch, suffix);
        if (major < 0 || minor < 0 || patch < 0) {
            throw new a("Invalid gencode version: " + strD);
        }
        b bVar = f10303f;
        if (domain != bVar) {
            throw new a(String.format("Detected mismatched Protobuf Gencode/Runtime domains when loading %s: gencode %s, runtime %s. Cross-domain usage of Protobuf is not supported.", location, domain, bVar));
        }
        if (major != 4) {
            if (major != 3) {
                throw new a(String.format("Detected mismatched Protobuf Gencode/Runtime major versions when loading %s: gencode %s, runtime %s. Same major version is required.", location, strD, f10308k));
            }
            f10309l.warning(String.format(" Protobuf gencode version %s is exactly one major version older than the runtime version %s at %s. Please update the gencode to avoid compatibility violations in the next runtime release.", strD, f10308k, location));
        }
        if (28 < minor || (minor == 28 && 2 < patch)) {
            throw new a(String.format("Detected incompatible Protobuf Gencode/Runtime versions when loading %s: gencode %s, runtime %s. Runtime version cannot be older than the linked gencode version.", location, strD, f10308k));
        }
        if (28 > minor || 2 > patch) {
            f10309l.warning(String.format(" Protobuf gencode version %s is older than the runtime version %s at %s. Please avoid checked-in Protobuf gencode that can be obsolete.", strD, f10308k, location));
        }
        if (!suffix.equals("")) {
            throw new a(String.format("Detected mismatched Protobuf Gencode/Runtime version suffixes when loading %s: gencode %s, runtime %s. Version suffixes must be the same.", location, strD, f10308k));
        }
    }

    public static String d(int major, int minor, int patch, String suffix) {
        return String.format("%d.%d.%d%s", Integer.valueOf(major), Integer.valueOf(minor), Integer.valueOf(patch), suffix);
    }
}
