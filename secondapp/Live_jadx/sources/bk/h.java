package bk;

import androidx.annotation.NonNull;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes4.dex */
public class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Map<String, String> f21766a;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Map<String, String> f21767a = new HashMap();

        @NonNull
        public h b() {
            return new h(this);
        }

        @NonNull
        public a c(@NonNull String str, boolean z10) {
            this.f21767a.put(str, Boolean.toString(z10));
            return this;
        }

        @NonNull
        public a d(@NonNull String str, double d10) {
            this.f21767a.put(str, Double.toString(d10));
            return this;
        }

        @NonNull
        public a e(@NonNull String str, float f10) {
            this.f21767a.put(str, Float.toString(f10));
            return this;
        }

        @NonNull
        public a f(@NonNull String str, int i10) {
            this.f21767a.put(str, Integer.toString(i10));
            return this;
        }

        @NonNull
        public a g(@NonNull String str, long j10) {
            this.f21767a.put(str, Long.toString(j10));
            return this;
        }

        @NonNull
        public a h(@NonNull String str, @NonNull String str2) {
            this.f21767a.put(str, str2);
            return this;
        }
    }

    public h(@NonNull a aVar) {
        this.f21766a = aVar.f21767a;
    }
}
