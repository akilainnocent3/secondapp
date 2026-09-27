package ep;

import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
public class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public JSONObject f81494a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f81495b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f81496c;

    public c(String eventName, JSONObject properties, String eventId) {
        this.f81495b = eventName;
        this.f81494a = properties;
        this.f81496c = eventId;
    }

    public static a a(String eventName) {
        return new a(eventName);
    }

    public static a b(String eventName, String eventId) {
        return new a(eventName, eventId);
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public JSONObject f81497a = new JSONObject();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public String f81498b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public String f81499c;

        public a(String eventName) {
            this.f81498b = eventName;
        }

        private void h(String key, Object value) {
            try {
                this.f81497a.put(key, value);
            } catch (JSONException e10) {
                throw new RuntimeException(e10);
            }
        }

        public a a(String key, double value) {
            h(key, Double.valueOf(value));
            return this;
        }

        public a b(String key, int value) {
            h(key, Integer.valueOf(value));
            return this;
        }

        public a c(String key, long value) {
            h(key, Long.valueOf(value));
            return this;
        }

        public a d(String key, Object value) {
            h(key, value);
            return this;
        }

        public a e(String key, String value) {
            h(key, value);
            return this;
        }

        public a f(String key, boolean value) {
            h(key, Boolean.valueOf(value));
            return this;
        }

        public c g() {
            return new c(this.f81498b, this.f81497a, this.f81499c);
        }

        public a(String eventName, String eventId) {
            this.f81498b = eventName;
            this.f81499c = eventId;
        }
    }
}
