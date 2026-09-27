package com.unity3d.ads.core.data.datasource;

import com.unity3d.services.core.misc.JsonStorage;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.x;
import oy.l;
import oy.m;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
public final class AndroidMediationDataSource implements MediationDataSource {

    @l
    public static final Companion Companion = new Companion(null);

    @l
    private static final String MEDIATION_NAME = "name";

    @l
    public static final String MEDIATION_NAME_KEY = "mediation.name.value";

    @l
    private static final String MEDIATION_STORAGE_NAME = "mediation";

    @l
    private static final String MEDIATION_VALUE = "value";

    @l
    private static final String MEDIATION_VERSION = "version";

    @l
    public static final String MEDIATION_VERSION_KEY = "mediation.version.value";

    @l
    private final JsonStorage storage;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class Companion {
        public /* synthetic */ Companion(x xVar) {
            this();
        }

        private Companion() {
        }
    }

    public AndroidMediationDataSource(@l JsonStorage storage) {
        m0.p(storage, "storage");
        this.storage = storage;
    }

    @Override // com.unity3d.ads.core.data.datasource.MediationDataSource
    @m
    public String getName() {
        return (String) this.storage.get(MEDIATION_NAME_KEY);
    }

    @Override // com.unity3d.ads.core.data.datasource.MediationDataSource
    @m
    public String getVersion() {
        return (String) this.storage.get(MEDIATION_VERSION_KEY);
    }
}
