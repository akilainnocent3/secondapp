package aa;

import androidx.annotation.NonNull;
import java.util.HashMap;
import java.util.Map;
import k.y0;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes2.dex */
public class z {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f4643c = 2;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f4644d = 1;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f4645e = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f4646a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Map<String, Integer> f4647b;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f4648a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Map<String, Integer> f4649b = new HashMap();

        public a(int i10) {
            this.f4648a = i10;
        }

        @NonNull
        public a c(@NonNull String str, int i10) {
            this.f4649b.put(str, Integer.valueOf(i10));
            return this;
        }

        @NonNull
        public z d() {
            return new z(this);
        }

        @NonNull
        @y0({y0.a.LIBRARY})
        public a e(@NonNull Map<String, Integer> map) {
            this.f4649b = map;
            return this;
        }
    }

    public z(@NonNull a aVar) {
        this.f4646a = aVar.f4648a;
        this.f4647b = aVar.f4649b;
    }

    public int a() {
        return this.f4646a;
    }

    @NonNull
    public Map<String, Integer> b() {
        return this.f4647b;
    }
}
