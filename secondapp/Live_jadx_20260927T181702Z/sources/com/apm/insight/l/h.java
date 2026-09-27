package com.apm.insight.l;

import com.ironsource.C4235d4;
import java.io.IOException;
import java.io.Writer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes2.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Writer f26111a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final List<a> f26112b = new ArrayList();

    /* JADX WARN: $VALUES field not found */
    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f26113a = new a("EMPTY_ARRAY", 0);

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final a f26114b = new a("NONEMPTY_ARRAY", 1);

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final a f26115c = new a("EMPTY_OBJECT", 2);

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final a f26116d = new a("DANGLING_KEY", 3);

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final a f26117e = new a("NONEMPTY_OBJECT", 4);

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final a f26118f = new a("NULL", 5);

        private a(String str, int i10) {
            super(str, i10);
        }
    }

    private h(Writer writer) {
        this.f26111a = writer;
    }

    private h a() throws JSONException, IOException {
        return a(a.f26113a, C4235d4.j.f61460d);
    }

    private h b() throws JSONException, IOException {
        a aVar = a.f26113a;
        a aVar2 = a.f26114b;
        return a(C4235d4.j.f61462e);
    }

    private h c() throws JSONException, IOException {
        return a(a.f26115c, "{");
    }

    private h d() throws JSONException, IOException {
        a aVar = a.f26115c;
        a aVar2 = a.f26117e;
        return a("}");
    }

    private a e() throws JSONException {
        List<a> list = this.f26112b;
        return list.get(list.size() - 1);
    }

    private void f() throws JSONException, IOException {
        if (this.f26112b.isEmpty()) {
            return;
        }
        a aVarE = e();
        if (aVarE == a.f26113a) {
            a(a.f26114b);
            return;
        }
        if (aVarE == a.f26114b) {
            this.f26111a.write(44);
        } else if (aVarE == a.f26116d) {
            this.f26111a.write(":");
            a(a.f26117e);
        } else if (aVarE != a.f26118f) {
            throw new JSONException("Nesting problem");
        }
    }

    public final String toString() {
        return "";
    }

    private h a(a aVar, String str) throws JSONException, IOException {
        f();
        this.f26112b.add(aVar);
        this.f26111a.write(str);
        return this;
    }

    private void b(String str) throws IOException {
        this.f26111a.write("\"");
        int length = str.length();
        for (int i10 = 0; i10 < length; i10++) {
            char cCharAt = str.charAt(i10);
            if (cCharAt == '\f') {
                this.f26111a.write("\\f");
            } else if (cCharAt != '\r') {
                if (cCharAt != '\"' && cCharAt != '/' && cCharAt != '\\') {
                    switch (cCharAt) {
                        case '\b':
                            this.f26111a.write("\\b");
                            continue;
                        case '\t':
                            this.f26111a.write("\\t");
                            continue;
                        case '\n':
                            this.f26111a.write("\\n");
                            continue;
                        default:
                            if (cCharAt <= 31) {
                                this.f26111a.write(String.format("\\u%04x", Integer.valueOf(cCharAt)));
                            }
                            break;
                    }
                } else {
                    this.f26111a.write(92);
                }
                this.f26111a.write(cCharAt);
            } else {
                this.f26111a.write("\\r");
            }
        }
        this.f26111a.write("\"");
    }

    private h c(String str) throws JSONException, IOException {
        a aVarE = e();
        if (aVarE == a.f26117e) {
            this.f26111a.write(44);
        } else if (aVarE != a.f26115c) {
            throw new JSONException("Nesting problem");
        }
        a(a.f26116d);
        b(str);
        return this;
    }

    private h a(String str) throws JSONException, IOException {
        e();
        List<a> list = this.f26112b;
        list.remove(list.size() - 1);
        this.f26111a.write(str);
        return this;
    }

    private void a(a aVar) {
        List<a> list = this.f26112b;
        list.set(list.size() - 1, aVar);
    }

    private h a(Object obj) throws JSONException, IOException {
        if (obj instanceof JSONArray) {
            a((JSONArray) obj);
            return this;
        }
        if (obj instanceof JSONObject) {
            a((JSONObject) obj);
            return this;
        }
        f();
        if (obj != null && obj != JSONObject.NULL) {
            if (obj instanceof Boolean) {
                this.f26111a.write(String.valueOf(obj));
                return this;
            }
            if (obj instanceof Number) {
                this.f26111a.write(JSONObject.numberToString((Number) obj));
                return this;
            }
            b(obj.toString());
            return this;
        }
        this.f26111a.write(fw.b.f85379f);
        return this;
    }

    public static void a(JSONObject jSONObject, Writer writer) throws Throwable {
        new h(writer).a(jSONObject);
        writer.flush();
    }

    public static void a(JSONArray jSONArray, Writer writer) throws Throwable {
        new h(writer).a(jSONArray);
        writer.flush();
    }

    private void a(JSONObject jSONObject) throws JSONException, IOException {
        c();
        Iterator<String> itKeys = jSONObject.keys();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            c(next).a(jSONObject.get(next));
        }
        d();
    }

    private void a(JSONArray jSONArray) throws JSONException, IOException {
        a();
        for (int i10 = 0; i10 < jSONArray.length(); i10++) {
            a(jSONArray.get(i10));
        }
        b();
    }
}
