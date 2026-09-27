package eh;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public class x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f81243a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f81244b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f81245c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f81246d;

    public x(int i10, int i11, float f10, long j10) {
        eh.a.b(i10 > 0, "width must be positive, but is: " + i10);
        eh.a.b(i11 > 0, "height must be positive, but is: " + i11);
        this.f81243a = i10;
        this.f81244b = i11;
        this.f81245c = f10;
        this.f81246d = j10;
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f81247a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f81248b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public float f81249c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public long f81250d;

        public b(int i10, int i11) {
            this.f81247a = i10;
            this.f81248b = i11;
            this.f81249c = 1.0f;
        }

        public x a() {
            return new x(this.f81247a, this.f81248b, this.f81249c, this.f81250d);
        }

        @qj.a
        public b b(int i10) {
            this.f81248b = i10;
            return this;
        }

        @qj.a
        public b c(long j10) {
            this.f81250d = j10;
            return this;
        }

        @qj.a
        public b d(float f10) {
            this.f81249c = f10;
            return this;
        }

        @qj.a
        public b e(int i10) {
            this.f81247a = i10;
            return this;
        }

        public b(x xVar) {
            this.f81247a = xVar.f81243a;
            this.f81248b = xVar.f81244b;
            this.f81249c = xVar.f81245c;
            this.f81250d = xVar.f81246d;
        }
    }
}
