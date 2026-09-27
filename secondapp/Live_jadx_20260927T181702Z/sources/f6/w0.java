package f6;

import androidx.annotation.Nullable;
import com.ironsource.C4235d4;
import x4.m1;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes2.dex */
@m1
public interface w0 {

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final x0 f83658a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final x0 f83659b;

        public a(x0 x0Var) {
            this(x0Var, x0Var);
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && a.class == obj.getClass()) {
                a aVar = (a) obj;
                if (this.f83658a.equals(aVar.f83658a) && this.f83659b.equals(aVar.f83659b)) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            return (this.f83658a.hashCode() * 31) + this.f83659b.hashCode();
        }

        public String toString() {
            String str;
            StringBuilder sb2 = new StringBuilder();
            sb2.append(C4235d4.j.f61460d);
            sb2.append(this.f83658a);
            if (this.f83658a.equals(this.f83659b)) {
                str = "";
            } else {
                str = ", " + this.f83659b;
            }
            sb2.append(str);
            sb2.append(C4235d4.j.f61462e);
            return sb2.toString();
        }

        public a(x0 x0Var, x0 x0Var2) {
            this.f83658a = (x0) zi.l0.E(x0Var);
            this.f83659b = (x0) zi.l0.E(x0Var2);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static class b implements w0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final long f83660a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final a f83661b;

        public b(long j10) {
            this(j10, 0L);
        }

        @Override // f6.w0
        public /* synthetic */ boolean e() {
            return v0.a(this);
        }

        @Override // f6.w0
        public long getDurationUs() {
            return this.f83660a;
        }

        @Override // f6.w0
        public a getSeekPoints(long j10) {
            return this.f83661b;
        }

        @Override // f6.w0
        public boolean isSeekable() {
            return false;
        }

        public b(long j10, long j11) {
            this.f83660a = j10;
            this.f83661b = new a(j11 == 0 ? x0.f83662c : new x0(0L, j11));
        }
    }

    boolean e();

    long getDurationUs();

    a getSeekPoints(long j10);

    boolean isSeekable();
}
