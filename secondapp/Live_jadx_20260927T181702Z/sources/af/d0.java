package af;

import androidx.annotation.Nullable;
import com.ironsource.C4235d4;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public interface d0 {

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final e0 f4897a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final e0 f4898b;

        public a(e0 e0Var) {
            this(e0Var, e0Var);
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && a.class == obj.getClass()) {
                a aVar = (a) obj;
                if (this.f4897a.equals(aVar.f4897a) && this.f4898b.equals(aVar.f4898b)) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            return (this.f4897a.hashCode() * 31) + this.f4898b.hashCode();
        }

        public String toString() {
            String str;
            StringBuilder sb2 = new StringBuilder();
            sb2.append(C4235d4.j.f61460d);
            sb2.append(this.f4897a);
            if (this.f4897a.equals(this.f4898b)) {
                str = "";
            } else {
                str = ", " + this.f4898b;
            }
            sb2.append(str);
            sb2.append(C4235d4.j.f61462e);
            return sb2.toString();
        }

        public a(e0 e0Var, e0 e0Var2) {
            this.f4897a = (e0) eh.a.g(e0Var);
            this.f4898b = (e0) eh.a.g(e0Var2);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static class b implements d0 {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final long f4899d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final a f4900e;

        public b(long j10) {
            this(j10, 0L);
        }

        @Override // af.d0
        public long getDurationUs() {
            return this.f4899d;
        }

        @Override // af.d0
        public a getSeekPoints(long j10) {
            return this.f4900e;
        }

        @Override // af.d0
        public boolean isSeekable() {
            return false;
        }

        public b(long j10, long j11) {
            this.f4899d = j10;
            this.f4900e = new a(j11 == 0 ? e0.f4907c : new e0(0L, j11));
        }
    }

    long getDurationUs();

    a getSeekPoints(long j10);

    boolean isSeekable();
}
