package ac;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import k.h1;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes2.dex */
public final class k implements i {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Map<String, List<j>> f4727c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public volatile Map<String, String> f4728d;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class a {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final String f4729d = "User-Agent";

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final String f4730e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final Map<String, List<j>> f4731f;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public boolean f4732a = true;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Map<String, List<j>> f4733b = f4731f;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public boolean f4734c = true;

        static {
            String strG = g();
            f4730e = strG;
            HashMap map = new HashMap(2);
            if (!TextUtils.isEmpty(strG)) {
                map.put("User-Agent", Collections.singletonList(new b(strG)));
            }
            f4731f = Collections.unmodifiableMap(map);
        }

        @h1
        public static String g() {
            String property = System.getProperty("http.agent");
            if (TextUtils.isEmpty(property)) {
                return property;
            }
            int length = property.length();
            StringBuilder sb2 = new StringBuilder(property.length());
            for (int i10 = 0; i10 < length; i10++) {
                char cCharAt = property.charAt(i10);
                if ((cCharAt > 31 || cCharAt == '\t') && cCharAt < 127) {
                    sb2.append(cCharAt);
                } else {
                    sb2.append('?');
                }
            }
            return sb2.toString();
        }

        public a a(@NonNull String str, @NonNull j jVar) {
            if (this.f4734c && "User-Agent".equalsIgnoreCase(str)) {
                return h(str, jVar);
            }
            e();
            f(str).add(jVar);
            return this;
        }

        public a b(@NonNull String str, @NonNull String str2) {
            return a(str, new b(str2));
        }

        public k c() {
            this.f4732a = true;
            return new k(this.f4733b);
        }

        public final Map<String, List<j>> d() {
            HashMap map = new HashMap(this.f4733b.size());
            for (Map.Entry<String, List<j>> entry : this.f4733b.entrySet()) {
                map.put(entry.getKey(), new ArrayList(entry.getValue()));
            }
            return map;
        }

        public final void e() {
            if (this.f4732a) {
                this.f4732a = false;
                this.f4733b = d();
            }
        }

        public final List<j> f(String str) {
            List<j> list = this.f4733b.get(str);
            if (list != null) {
                return list;
            }
            ArrayList arrayList = new ArrayList();
            this.f4733b.put(str, arrayList);
            return arrayList;
        }

        public a h(@NonNull String str, @Nullable j jVar) {
            e();
            if (jVar == null) {
                this.f4733b.remove(str);
            } else {
                List<j> listF = f(str);
                listF.clear();
                listF.add(jVar);
            }
            if (this.f4734c && "User-Agent".equalsIgnoreCase(str)) {
                this.f4734c = false;
            }
            return this;
        }

        public a i(@NonNull String str, @Nullable String str2) {
            return h(str, str2 == null ? null : new b(str2));
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class b implements j {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NonNull
        public final String f4735a;

        public b(@NonNull String str) {
            this.f4735a = str;
        }

        @Override // ac.j
        public String a() {
            return this.f4735a;
        }

        public boolean equals(Object obj) {
            if (obj instanceof b) {
                return this.f4735a.equals(((b) obj).f4735a);
            }
            return false;
        }

        public int hashCode() {
            return this.f4735a.hashCode();
        }

        public String toString() {
            return "StringHeaderFactory{value='" + this.f4735a + '\'' + fw.b.f85383j;
        }
    }

    public k(Map<String, List<j>> map) {
        this.f4727c = Collections.unmodifiableMap(map);
    }

    @Override // ac.i
    public Map<String, String> a() {
        if (this.f4728d == null) {
            synchronized (this) {
                try {
                    if (this.f4728d == null) {
                        this.f4728d = Collections.unmodifiableMap(c());
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return this.f4728d;
    }

    @NonNull
    public final String b(@NonNull List<j> list) {
        StringBuilder sb2 = new StringBuilder();
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            String strA = list.get(i10).a();
            if (!TextUtils.isEmpty(strA)) {
                sb2.append(strA);
                if (i10 != list.size() - 1) {
                    sb2.append(fw.b.f85380g);
                }
            }
        }
        return sb2.toString();
    }

    public final Map<String, String> c() {
        HashMap map = new HashMap();
        for (Map.Entry<String, List<j>> entry : this.f4727c.entrySet()) {
            String strB = b(entry.getValue());
            if (!TextUtils.isEmpty(strB)) {
                map.put(entry.getKey(), strB);
            }
        }
        return map;
    }

    public boolean equals(Object obj) {
        if (obj instanceof k) {
            return this.f4727c.equals(((k) obj).f4727c);
        }
        return false;
    }

    public int hashCode() {
        return this.f4727c.hashCode();
    }

    public String toString() {
        return "LazyHeaders{headers=" + this.f4727c + fw.b.f85383j;
    }
}
