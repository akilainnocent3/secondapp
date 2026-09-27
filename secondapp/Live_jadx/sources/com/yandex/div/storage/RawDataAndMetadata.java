package com.yandex.div.storage;

import org.json.JSONObject;
import oy.l;
import oy.m;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
public interface RawDataAndMetadata {

    @l
    public static final Companion Companion = Companion.$$INSTANCE;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }

        public static /* synthetic */ RawDataAndMetadata invoke$default(Companion companion, String str, JSONObject jSONObject, JSONObject jSONObject2, int i10, Object obj) {
            if ((i10 & 4) != 0) {
                jSONObject2 = null;
            }
            return companion.invoke(str, jSONObject, jSONObject2);
        }

        @l
        public final RawDataAndMetadata invoke(@l String str, @l JSONObject jSONObject, @m JSONObject jSONObject2) {
            return new Ready(str, jSONObject, jSONObject2);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class Ready implements RawDataAndMetadata {

        @l
        private final JSONObject divData;

        /* JADX INFO: renamed from: id, reason: collision with root package name */
        @l
        private final String f76733id;

        @m
        private final JSONObject metadata;

        public Ready(@l String str, @l JSONObject jSONObject, @m JSONObject jSONObject2) {
            this.f76733id = str;
            this.divData = jSONObject;
            this.metadata = jSONObject2;
        }

        @Override // com.yandex.div.storage.RawDataAndMetadata
        @l
        public JSONObject getDivData() {
            return this.divData;
        }

        @Override // com.yandex.div.storage.RawDataAndMetadata
        @l
        public String getId() {
            return this.f76733id;
        }

        @Override // com.yandex.div.storage.RawDataAndMetadata
        @m
        public JSONObject getMetadata() {
            return this.metadata;
        }
    }

    @l
    JSONObject getDivData();

    @l
    String getId();

    @m
    JSONObject getMetadata();
}
