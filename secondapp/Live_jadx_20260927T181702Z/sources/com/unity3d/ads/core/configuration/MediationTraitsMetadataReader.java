package com.unity3d.ads.core.configuration;

import com.unity3d.services.core.misc.JsonStorage;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.s1;
import kotlin.jvm.internal.x;
import org.json.JSONObject;
import oy.l;
import oy.m;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
@s1({"SMAP\nMediationTraitsMetadataReader.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MediationTraitsMetadataReader.kt\ncom/unity3d/ads/core/configuration/MediationTraitsMetadataReader\n+ 2 MetadataReader.kt\ncom/unity3d/ads/core/configuration/MetadataReader\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,23:1\n7#2,7:24\n7#2,7:32\n1#3:31\n*S KotlinDebug\n*F\n+ 1 MediationTraitsMetadataReader.kt\ncom/unity3d/ads/core/configuration/MediationTraitsMetadataReader\n*L\n11#1:24,7\n15#1:32,7\n*E\n"})
public final class MediationTraitsMetadataReader extends MetadataReader<JSONObject> {

    @l
    public static final String BOLD_SDK_ENABLED = "boldSdkEnabled";

    @l
    public static final Companion Companion = new Companion(null);

    @l
    public static final String MEDIATION_TRAITS = "mediation.traits.value";

    @l
    public static final String USE_HTTP_CLIENT = "useHttpClient";

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class Companion {
        public /* synthetic */ Companion(x xVar) {
            this();
        }

        private Companion() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MediationTraitsMetadataReader(@l JsonStorage jsonStorage) {
        super(jsonStorage, MEDIATION_TRAITS);
        m0.p(jsonStorage, "jsonStorage");
    }

    /* JADX WARN: Code duplicated, block: B:9:0x0021  */
    @m
    public final Boolean getBooleanTrait(@l String key) {
        m0.p(key, "key");
        Object obj = getJsonStorage().get(getKey());
        if (obj != null) {
            m0.o(obj, "get(key)");
            if (!(obj instanceof JSONObject)) {
                obj = null;
            }
            if (obj == null) {
                obj = null;
            }
        } else {
            obj = null;
        }
        JSONObject jSONObject = (JSONObject) obj;
        if (jSONObject != null) {
            if (!jSONObject.has(key)) {
                jSONObject = null;
            }
            if (jSONObject != null) {
                return Boolean.valueOf(jSONObject.optBoolean(key));
            }
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:9:0x0021  */
    @m
    public final String getStringTrait(@l String key) {
        m0.p(key, "key");
        Object obj = getJsonStorage().get(getKey());
        if (obj != null) {
            m0.o(obj, "get(key)");
            if (!(obj instanceof JSONObject)) {
                obj = null;
            }
            if (obj == null) {
                obj = null;
            }
        } else {
            obj = null;
        }
        JSONObject jSONObject = (JSONObject) obj;
        if (jSONObject != null) {
            if (!jSONObject.has(key)) {
                jSONObject = null;
            }
            if (jSONObject != null) {
                return jSONObject.optString(key);
            }
        }
        return null;
    }
}
