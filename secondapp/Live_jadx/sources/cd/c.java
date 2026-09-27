package cd;

import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public enum c {
    FAILED_INIT_ENCRYPTION("failed to init encryption"),
    FAILED_EXTRACT_ENCRYPTED_DATA("failed to extract encrypted data"),
    FAILED_STORE_ENCRYPTED_DATA("failed to store encrypted data"),
    IGNITE_SERVICE_UNAVAILABLE("Ignite service unavailable"),
    IGNITE_SERVICE_INVALID_SESSION("Invalid session token"),
    ONE_DT_EMPTY_ENTITY("received empty one dt from the service"),
    ONE_DT_AUTHENTICATOR_DESTROYED("authenticator already destroyed");


    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final Map<String, c> f22986j = new HashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f22988b;

    static {
        for (c cVar : values()) {
            f22986j.put(cVar.f22988b, cVar);
        }
    }

    c(String str) {
        this.f22988b = str;
    }

    public final String d() {
        return this.f22988b;
    }
}
