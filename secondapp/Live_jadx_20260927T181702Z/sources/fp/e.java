package fp;

import android.text.TextUtils;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
public class e extends ep.c {

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static class a extends ep.c.a {
        public a(String eventName, String eventId) {
            super(eventName, eventId);
        }

        public final void h(String key, Object value) {
            try {
                this.f81497a.put(key, value);
            } catch (Throwable unused) {
            }
        }

        @Override // ep.c.a
        /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
        public e g() {
            return new e(this.f81498b, this.f81497a, this.f81499c);
        }

        public a j(String contentId) {
            if (!TextUtils.isEmpty(contentId)) {
                e("content_id", contentId);
            }
            return this;
        }

        public a k(String contentType) {
            if (!TextUtils.isEmpty(contentType)) {
                e("content_type", contentType);
            }
            return this;
        }

        public a l(d... contents) {
            if (contents != null) {
                JSONArray jSONArray = new JSONArray();
                for (d dVar : contents) {
                    if (dVar != null) {
                        jSONArray.put(dVar.j());
                    }
                }
                d(f.c.f85054f, jSONArray);
            }
            return this;
        }

        public a m(f.b currency) {
            if (currency != null) {
                d("currency", currency);
            }
            return this;
        }

        public a n(String description) {
            if (!TextUtils.isEmpty(description)) {
                e("description", description);
            }
            return this;
        }

        public a o(double value) {
            h("value", Double.valueOf(value));
            return this;
        }
    }

    public e(String eventName, JSONObject properties, String eventId) {
        super(eventName, properties, eventId);
    }
}
