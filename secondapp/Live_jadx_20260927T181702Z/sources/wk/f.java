package wk;

import android.util.Base64;
import android.util.JsonWriter;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.io.IOException;
import java.io.Writer;
import java.util.Collection;
import java.util.Date;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes4.dex */
public final class f implements tk.f, tk.h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public f f143398a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f143399b = true;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final JsonWriter f143400c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Map<Class<?>, tk.e<?>> f143401d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Map<Class<?>, tk.g<?>> f143402e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final tk.e<Object> f143403f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f143404g;

    public f(@NonNull Writer writer, @NonNull Map<Class<?>, tk.e<?>> map, @NonNull Map<Class<?>, tk.g<?>> map2, tk.e<Object> eVar, boolean z10) {
        this.f143400c = new JsonWriter(writer);
        this.f143401d = map;
        this.f143402e = map2;
        this.f143403f = eVar;
        this.f143404g = z10;
    }

    @Override // tk.f
    @NonNull
    /* JADX INFO: renamed from: A, reason: merged with bridge method [inline-methods] */
    public f d(@NonNull String str, @Nullable Object obj) throws IOException {
        return this.f143404g ? I(str, obj) : H(str, obj);
    }

    @Override // tk.f
    @NonNull
    /* JADX INFO: renamed from: B, reason: merged with bridge method [inline-methods] */
    public f k(@NonNull String str, boolean z10) throws IOException {
        J();
        this.f143400c.name(str);
        return c(z10);
    }

    @Override // tk.h
    @NonNull
    /* JADX INFO: renamed from: C, reason: merged with bridge method [inline-methods] */
    public f c(boolean z10) throws IOException {
        J();
        this.f143400c.value(z10);
        return this;
    }

    @Override // tk.h
    @NonNull
    /* JADX INFO: renamed from: D, reason: merged with bridge method [inline-methods] */
    public f add(@Nullable byte[] bArr) throws IOException {
        J();
        if (bArr == null) {
            this.f143400c.nullValue();
            return this;
        }
        this.f143400c.value(Base64.encodeToString(bArr, 2));
        return this;
    }

    public final boolean E(Object obj) {
        return obj == null || obj.getClass().isArray() || (obj instanceof Collection) || (obj instanceof Date) || (obj instanceof Enum) || (obj instanceof Number);
    }

    public void F() throws IOException {
        J();
        this.f143400c.flush();
    }

    public f G(tk.e<Object> eVar, Object obj, boolean z10) throws IOException {
        if (!z10) {
            this.f143400c.beginObject();
        }
        eVar.a(obj, this);
        if (!z10) {
            this.f143400c.endObject();
        }
        return this;
    }

    public final f H(@NonNull String str, @Nullable Object obj) throws IOException, tk.c {
        J();
        this.f143400c.name(str);
        if (obj != null) {
            return v(obj, false);
        }
        this.f143400c.nullValue();
        return this;
    }

    public final f I(@NonNull String str, @Nullable Object obj) throws IOException, tk.c {
        if (obj == null) {
            return this;
        }
        J();
        this.f143400c.name(str);
        return v(obj, false);
    }

    public final void J() throws IOException {
        if (!this.f143399b) {
            throw new IllegalStateException("Parent context used since this context was created. Cannot use this context anymore.");
        }
        f fVar = this.f143398a;
        if (fVar != null) {
            fVar.J();
            this.f143398a.f143399b = false;
            this.f143398a = null;
            this.f143400c.endObject();
        }
    }

    @Override // tk.f
    @NonNull
    public tk.f a(@NonNull tk.d dVar, @Nullable Object obj) throws IOException {
        return d(dVar.b(), obj);
    }

    @Override // tk.f
    @NonNull
    public tk.f e(@NonNull tk.d dVar, boolean z10) throws IOException {
        return k(dVar.b(), z10);
    }

    @Override // tk.f
    @NonNull
    public tk.f g(@NonNull tk.d dVar, float f10) throws IOException {
        return l(dVar.b(), f10);
    }

    @Override // tk.f
    @NonNull
    public tk.f h(@NonNull tk.d dVar, int i10) throws IOException {
        return n(dVar.b(), i10);
    }

    @Override // tk.f
    @NonNull
    public tk.f i(@NonNull tk.d dVar, long j10) throws IOException {
        return m(dVar.b(), j10);
    }

    @Override // tk.f
    @NonNull
    public tk.f j(@NonNull tk.d dVar, double d10) throws IOException {
        return l(dVar.b(), d10);
    }

    @Override // tk.f
    @NonNull
    public tk.f o(@NonNull tk.d dVar) throws IOException {
        return q(dVar.b());
    }

    @Override // tk.f
    @NonNull
    public tk.f p(@Nullable Object obj) throws IOException {
        return v(obj, true);
    }

    @Override // tk.f
    @NonNull
    public tk.f q(@NonNull String str) throws IOException {
        J();
        this.f143398a = new f(this);
        this.f143400c.name(str);
        this.f143400c.beginObject();
        return this.f143398a;
    }

    @Override // tk.h
    @NonNull
    /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
    public f add(double d10) throws IOException {
        J();
        this.f143400c.value(d10);
        return this;
    }

    @Override // tk.h
    @NonNull
    /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
    public f f(float f10) throws IOException {
        J();
        this.f143400c.value(f10);
        return this;
    }

    @Override // tk.h
    @NonNull
    /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
    public f add(int i10) throws IOException {
        J();
        this.f143400c.value(i10);
        return this;
    }

    @Override // tk.h
    @NonNull
    /* JADX INFO: renamed from: u, reason: merged with bridge method [inline-methods] */
    public f add(long j10) throws IOException {
        J();
        this.f143400c.value(j10);
        return this;
    }

    @NonNull
    public f v(@Nullable Object obj, boolean z10) throws IOException {
        int i10 = 0;
        if (z10 && E(obj)) {
            throw new tk.c(String.format("%s cannot be encoded inline", obj == null ? null : obj.getClass()));
        }
        if (obj == null) {
            this.f143400c.nullValue();
            return this;
        }
        if (obj instanceof Number) {
            this.f143400c.value((Number) obj);
            return this;
        }
        if (!obj.getClass().isArray()) {
            if (obj instanceof Collection) {
                this.f143400c.beginArray();
                Iterator it = ((Collection) obj).iterator();
                while (it.hasNext()) {
                    v(it.next(), false);
                }
                this.f143400c.endArray();
                return this;
            }
            if (obj instanceof Map) {
                this.f143400c.beginObject();
                for (Map.Entry entry : ((Map) obj).entrySet()) {
                    Object key = entry.getKey();
                    try {
                        d((String) key, entry.getValue());
                    } catch (ClassCastException e10) {
                        throw new tk.c(String.format("Only String keys are currently supported in maps, got %s of type %s instead.", key, key.getClass()), e10);
                    }
                }
                this.f143400c.endObject();
                return this;
            }
            tk.e<?> eVar = this.f143401d.get(obj.getClass());
            if (eVar != null) {
                return G(eVar, obj, z10);
            }
            tk.g<?> gVar = this.f143402e.get(obj.getClass());
            if (gVar != null) {
                gVar.a(obj, this);
                return this;
            }
            if (!(obj instanceof Enum)) {
                return G(this.f143403f, obj, z10);
            }
            if (obj instanceof g) {
                add(((g) obj).getNumber());
                return this;
            }
            b(((Enum) obj).name());
            return this;
        }
        if (obj instanceof byte[]) {
            return add((byte[]) obj);
        }
        this.f143400c.beginArray();
        if (obj instanceof int[]) {
            int[] iArr = (int[]) obj;
            int length = iArr.length;
            while (i10 < length) {
                this.f143400c.value(iArr[i10]);
                i10++;
            }
        } else if (obj instanceof long[]) {
            long[] jArr = (long[]) obj;
            int length2 = jArr.length;
            while (i10 < length2) {
                add(jArr[i10]);
                i10++;
            }
        } else if (obj instanceof double[]) {
            double[] dArr = (double[]) obj;
            int length3 = dArr.length;
            while (i10 < length3) {
                this.f143400c.value(dArr[i10]);
                i10++;
            }
        } else if (obj instanceof boolean[]) {
            boolean[] zArr = (boolean[]) obj;
            int length4 = zArr.length;
            while (i10 < length4) {
                this.f143400c.value(zArr[i10]);
                i10++;
            }
        } else if (obj instanceof Number[]) {
            for (Number number : (Number[]) obj) {
                v(number, false);
            }
        } else {
            for (Object obj2 : (Object[]) obj) {
                v(obj2, false);
            }
        }
        this.f143400c.endArray();
        return this;
    }

    @Override // tk.h
    @NonNull
    /* JADX INFO: renamed from: w, reason: merged with bridge method [inline-methods] */
    public f b(@Nullable String str) throws IOException {
        J();
        this.f143400c.value(str);
        return this;
    }

    @Override // tk.f
    @NonNull
    /* JADX INFO: renamed from: x, reason: merged with bridge method [inline-methods] */
    public f l(@NonNull String str, double d10) throws IOException {
        J();
        this.f143400c.name(str);
        return add(d10);
    }

    @Override // tk.f
    @NonNull
    /* JADX INFO: renamed from: y, reason: merged with bridge method [inline-methods] */
    public f n(@NonNull String str, int i10) throws IOException {
        J();
        this.f143400c.name(str);
        return add(i10);
    }

    @Override // tk.f
    @NonNull
    /* JADX INFO: renamed from: z, reason: merged with bridge method [inline-methods] */
    public f m(@NonNull String str, long j10) throws IOException {
        J();
        this.f143400c.name(str);
        return add(j10);
    }

    public f(f fVar) {
        this.f143400c = fVar.f143400c;
        this.f143401d = fVar.f143401d;
        this.f143402e = fVar.f143402e;
        this.f143403f = fVar.f143403f;
        this.f143404g = fVar.f143404g;
    }
}
