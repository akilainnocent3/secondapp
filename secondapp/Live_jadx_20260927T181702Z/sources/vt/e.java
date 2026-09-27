package vt;

import java.util.Arrays;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.x;
import oy.l;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
public final class e extends tt.a {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @l
    public static final a f141578h = new a(null);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @l
    @cs.g
    public static final e f141579i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @l
    @cs.g
    public static final e f141580j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @l
    @cs.g
    public static final e f141581k;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f141582g;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class a {
        public /* synthetic */ a(x xVar) {
            this();
        }

        public a() {
        }
    }

    static {
        e eVar = new e(1, 8, 0);
        f141579i = eVar;
        f141580j = eVar.m();
        f141581k = new e(new int[0]);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(@l int[] versionArray, boolean z10) {
        super(Arrays.copyOf(versionArray, versionArray.length));
        m0.p(versionArray, "versionArray");
        this.f141582g = z10;
    }

    public final boolean h(@l e metadataVersionFromLanguageVersion) {
        m0.p(metadataVersionFromLanguageVersion, "metadataVersionFromLanguageVersion");
        if (a() == 2 && b() == 0) {
            e eVar = f141579i;
            if (eVar.a() == 1 && eVar.b() == 8) {
                return true;
            }
        }
        return i(metadataVersionFromLanguageVersion.k(this.f141582g));
    }

    public final boolean i(e eVar) {
        if ((a() == 1 && b() == 0) || a() == 0) {
            return false;
        }
        return !l(eVar);
    }

    public final boolean j() {
        return this.f141582g;
    }

    @l
    public final e k(boolean z10) {
        e eVar = z10 ? f141579i : f141580j;
        return eVar.l(this) ? eVar : this;
    }

    public final boolean l(e eVar) {
        if (a() > eVar.a()) {
            return true;
        }
        return a() >= eVar.a() && b() > eVar.b();
    }

    @l
    public final e m() {
        return (a() == 1 && b() == 9) ? new e(2, 0, 0) : new e(a(), b() + 1, 0);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public e(@l int... numbers) {
        this(numbers, false);
        m0.p(numbers, "numbers");
    }
}
