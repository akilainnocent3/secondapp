package com.yandex.div.storage.rawjson;

import kotlin.jvm.internal.m0;
import org.json.JSONObject;
import oy.l;
import oy.m;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
public interface RawJson {

    @l
    public static final Companion Companion = Companion.$$INSTANCE;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }

        @l
        public final RawJson invoke(@l String str, @l JSONObject jSONObject) {
            return new Ready(str, jSONObject);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class Ready implements RawJson {

        @l
        private final JSONObject data;

        /* JADX INFO: renamed from: id, reason: collision with root package name */
        @l
        private final String f76742id;

        public Ready(@l String str, @l JSONObject jSONObject) {
            this.f76742id = str;
            this.data = jSONObject;
        }

        public static /* synthetic */ Ready copy$default(Ready ready, String str, JSONObject jSONObject, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = ready.f76742id;
            }
            if ((i10 & 2) != 0) {
                jSONObject = ready.data;
            }
            return ready.copy(str, jSONObject);
        }

        @l
        public final String component1() {
            return this.f76742id;
        }

        @l
        public final JSONObject component2() {
            return this.data;
        }

        @l
        public final Ready copy(@l String str, @l JSONObject jSONObject) {
            return new Ready(str, jSONObject);
        }

        public boolean equals(@m Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Ready)) {
                return false;
            }
            Ready ready = (Ready) obj;
            return m0.g(this.f76742id, ready.f76742id) && m0.g(this.data, ready.data);
        }

        @Override // com.yandex.div.storage.rawjson.RawJson
        @l
        public JSONObject getData() {
            return this.data;
        }

        @Override // com.yandex.div.storage.rawjson.RawJson
        @l
        public String getId() {
            return this.f76742id;
        }

        public int hashCode() {
            return (this.f76742id.hashCode() * 31) + this.data.hashCode();
        }

        @l
        public String toString() {
            return "Ready(id=" + this.f76742id + ", data=" + this.data + ')';
        }
    }

    @l
    JSONObject getData();

    @l
    String getId();
}
