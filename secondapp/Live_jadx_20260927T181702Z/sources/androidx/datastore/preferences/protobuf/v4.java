package androidx.datastore.preferences.protobuf;

import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes.dex */
public class v4 extends RuntimeException {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final long f10313c = -7466929953374883507L;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List<String> f10314b;

    public v4(final v2 message) {
        super("Message was missing required fields.  (Lite runtime could not determine which fields were missing).");
        this.f10314b = null;
    }

    public static String e(final List<String> missingFields) {
        StringBuilder sb2 = new StringBuilder("Message missing required fields: ");
        boolean z10 = true;
        for (String str : missingFields) {
            if (z10) {
                z10 = false;
            } else {
                sb2.append(", ");
            }
            sb2.append(str);
        }
        return sb2.toString();
    }

    public y1 d() {
        return new y1(getMessage());
    }

    public List<String> g() {
        return Collections.unmodifiableList(this.f10314b);
    }

    public v4(final List<String> missingFields) {
        super(e(missingFields));
        this.f10314b = missingFields;
    }
}
