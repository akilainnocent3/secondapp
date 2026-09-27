package com.cleveradssolutions.internal;

import com.ironsource.C4235d4;
import cv.k0;
import dr.w2;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.u1;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public final class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final StringBuilder f43572a = new StringBuilder();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f43573b = new ArrayList();

    public final int a() throws JSONException {
        if (this.f43573b.isEmpty()) {
            throw new JSONException("Nesting problem");
        }
        ArrayList arrayList = this.f43573b;
        Object obj = arrayList.get(arrayList.size() - 1);
        m0.o(obj, "get(...)");
        return ((Number) obj).intValue();
    }

    public final k b(String name) throws JSONException {
        m0.p(name, "name");
        int iA = a();
        if (iA == 5) {
            this.f43572a.append(fw.b.f85380g);
        } else if (iA != 3) {
            throw new JSONException("Nesting problem");
        }
        ArrayList arrayList = this.f43573b;
        arrayList.set(arrayList.size() - 1, 4);
        d(name);
        return this;
    }

    public final void c() throws JSONException {
        g(3, "{");
    }

    public final void d(String str) {
        this.f43572a.append("\"");
        int length = str.length();
        for (int i10 = 0; i10 < length; i10++) {
            char cCharAt = str.charAt(i10);
            if (cCharAt == '\f') {
                this.f43572a.append("\\f");
            } else if (cCharAt == '\r') {
                this.f43572a.append("\\r");
            } else if (cCharAt != '\"' && cCharAt != '\\') {
                switch (cCharAt) {
                    case '\b':
                        this.f43572a.append("\\b");
                        break;
                    case '\t':
                        this.f43572a.append("\\t");
                        break;
                    case '\n':
                        this.f43572a.append("\\n");
                        break;
                    default:
                        if (cCharAt <= 31) {
                            StringBuilder sb2 = this.f43572a;
                            u1 u1Var = u1.f102789a;
                            String str2 = String.format("\\u%04x", Arrays.copyOf(new Object[]{Integer.valueOf(cCharAt)}, 1));
                            m0.o(str2, "format(...)");
                            sb2.append(str2);
                        } else {
                            this.f43572a.append(cCharAt);
                        }
                        break;
                }
            } else {
                StringBuilder sb3 = this.f43572a;
                sb3.append('\\');
                sb3.append(cCharAt);
            }
        }
        this.f43572a.append("\"");
    }

    public final k e(String value) throws JSONException {
        m0.p(value, "value");
        if (this.f43573b.isEmpty()) {
            throw new JSONException("Nesting problem");
        }
        j();
        d(value);
        return this;
    }

    public final k f(int i10) throws JSONException {
        if (this.f43573b.isEmpty()) {
            throw new JSONException("Nesting problem");
        }
        j();
        this.f43572a.append(i10);
        return this;
    }

    public final k g(int i10, String str) throws JSONException {
        if (this.f43573b.isEmpty() && this.f43572a.length() > 0) {
            throw new JSONException("Nesting problem: multiple top-level roots");
        }
        j();
        this.f43573b.add(Integer.valueOf(i10));
        this.f43572a.append(str);
        return this;
    }

    public final k h(long j10) throws JSONException {
        if (this.f43573b.isEmpty()) {
            throw new JSONException("Nesting problem");
        }
        j();
        this.f43572a.append(j10);
        return this;
    }

    public final k i(String str, int i10, int i11) throws JSONException {
        int iA = a();
        if (iA != i11 && iA != i10) {
            throw new JSONException("Nesting problem");
        }
        ArrayList arrayList = this.f43573b;
        arrayList.remove(arrayList.size() - 1);
        this.f43572a.append(str);
        return this;
    }

    public final void j() throws JSONException {
        if (this.f43573b.isEmpty()) {
            return;
        }
        int iA = a();
        if (iA == 1) {
            ArrayList arrayList = this.f43573b;
            arrayList.set(arrayList.size() - 1, 2);
        } else {
            if (iA == 2) {
                this.f43572a.append(fw.b.f85380g);
                return;
            }
            if (iA != 4) {
                if (iA != 0) {
                    throw new JSONException("Nesting problem");
                }
            } else {
                this.f43572a.append(":");
                ArrayList arrayList2 = this.f43573b;
                arrayList2.set(arrayList2.size() - 1, 5);
            }
        }
    }

    public final void k(double d10) throws JSONException {
        if (this.f43573b.isEmpty()) {
            throw new JSONException("Nesting problem");
        }
        j();
        this.f43572a.append(JSONObject.numberToString(Double.valueOf(d10)));
    }

    public final void l(Object obj) throws JSONException {
        if (this.f43573b.isEmpty()) {
            throw new JSONException("Nesting problem");
        }
        if (obj == null || obj == JSONObject.NULL) {
            j();
            this.f43572a.append(obj);
            return;
        }
        if (obj instanceof JSONArray) {
            g(1, C4235d4.j.f61460d);
            JSONArray jSONArray = (JSONArray) obj;
            int length = jSONArray.length();
            for (int i10 = 0; i10 < length; i10++) {
                l(jSONArray.get(i10));
            }
            i(C4235d4.j.f61462e, 1, 2);
            return;
        }
        if (obj instanceof Collection) {
            g(1, C4235d4.j.f61460d);
            Iterator it = ((Collection) obj).iterator();
            while (it.hasNext()) {
                l(it.next());
            }
            i(C4235d4.j.f61462e, 1, 2);
            return;
        }
        if (obj instanceof JSONObject) {
            g(3, "{");
            JSONObject jSONObject = (JSONObject) obj;
            Iterator<String> itKeys = jSONObject.keys();
            m0.o(itKeys, "keys(...)");
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                m0.m(next);
                b(next).l(jSONObject.get(next));
            }
            i("}", 3, 5);
            return;
        }
        if (obj instanceof Boolean) {
            j();
            this.f43572a.append(((Boolean) obj).booleanValue());
            return;
        }
        if (obj instanceof Number) {
            j();
            this.f43572a.append(JSONObject.numberToString((Number) obj));
        } else if (!(obj instanceof k)) {
            j();
            d(obj.toString());
            w2 w2Var = w2.f79517a;
        } else {
            k kVar = (k) obj;
            if (!kVar.f43573b.isEmpty()) {
                throw new JSONException("Nesting problem: object not closed");
            }
            j();
            this.f43572a.append(kVar.f43572a.toString());
        }
    }

    public final void m(String source) throws JSONException {
        m0.p(source, "source");
        int iA = a();
        if (k0.J2(source, "{", false, 2, null)) {
            if (!k0.b2(source, "}", false, 2, null)) {
                throw new JSONException("Nesting problem: append not closed object: " + source);
            }
            if (iA == 1) {
                ArrayList arrayList = this.f43573b;
                arrayList.set(arrayList.size() - 1, 2);
            } else {
                if (iA != 2) {
                    throw new JSONException("Nesting problem: append not in array scope");
                }
                this.f43572a.append(fw.b.f85380g);
            }
        } else if (iA == 3) {
            ArrayList arrayList2 = this.f43573b;
            arrayList2.set(arrayList2.size() - 1, 5);
        } else {
            if (iA != 5) {
                throw new JSONException("Nesting problem: append not in object scope");
            }
            this.f43572a.append(fw.b.f85380g);
        }
        this.f43572a.append(source);
    }

    public final String toString() {
        String string = this.f43572a.toString();
        m0.o(string, "toString(...)");
        return string;
    }
}
