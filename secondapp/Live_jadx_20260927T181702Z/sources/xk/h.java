package xk;

import androidx.annotation.NonNull;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes4.dex */
public class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Map<Class<?>, tk.e<?>> f145326a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Map<Class<?>, tk.g<?>> f145327b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final tk.e<Object> f145328c;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class a implements vk.b<a> {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final tk.e<Object> f145329d = new tk.e() { // from class: xk.g
            @Override // tk.b
            public final void a(Object obj, tk.f fVar) {
                h.a.c(obj, fVar);
            }
        };

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Map<Class<?>, tk.e<?>> f145330a = new HashMap();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Map<Class<?>, tk.g<?>> f145331b = new HashMap();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public tk.e<Object> f145332c = f145329d;

        public static /* synthetic */ void c(Object obj, tk.f fVar) {
            throw new tk.c("Couldn't find encoder for type " + obj.getClass().getCanonicalName());
        }

        public h d() {
            return new h(new HashMap(this.f145330a), new HashMap(this.f145331b), this.f145332c);
        }

        @NonNull
        public a e(@NonNull vk.a aVar) {
            aVar.a(this);
            return this;
        }

        @Override // vk.b
        @NonNull
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public <U> a a(@NonNull Class<U> cls, @NonNull tk.e<? super U> eVar) {
            this.f145330a.put(cls, eVar);
            this.f145331b.remove(cls);
            return this;
        }

        @Override // vk.b
        @NonNull
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public <U> a b(@NonNull Class<U> cls, @NonNull tk.g<? super U> gVar) {
            this.f145331b.put(cls, gVar);
            this.f145330a.remove(cls);
            return this;
        }

        @NonNull
        public a h(@NonNull tk.e<Object> eVar) {
            this.f145332c = eVar;
            return this;
        }
    }

    public h(Map<Class<?>, tk.e<?>> map, Map<Class<?>, tk.g<?>> map2, tk.e<Object> eVar) {
        this.f145326a = map;
        this.f145327b = map2;
        this.f145328c = eVar;
    }

    public static a a() {
        return new a();
    }

    public void b(@NonNull Object obj, @NonNull OutputStream outputStream) throws IOException {
        new f(outputStream, this.f145326a, this.f145327b, this.f145328c).C(obj);
    }

    @NonNull
    public byte[] c(@NonNull Object obj) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            b(obj, byteArrayOutputStream);
        } catch (IOException unused) {
        }
        return byteArrayOutputStream.toByteArray();
    }
}
