package zl;

import kotlin.jvm.internal.m0;
import oy.l;
import oy.m;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes4.dex */
public interface c {

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public enum a {
        CRASHLYTICS,
        PERFORMANCE,
        MATT_SAYS_HI;


        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final /* synthetic */ sr.a f162014f = sr.c.c(d());

        @l
        public static sr.a<a> g() {
            return f162014f;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @l
        public final String f162015a;

        public b(@l String sessionId) {
            m0.p(sessionId, "sessionId");
            this.f162015a = sessionId;
        }

        public static /* synthetic */ b c(b bVar, String str, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = bVar.f162015a;
            }
            return bVar.b(str);
        }

        @l
        public final String a() {
            return this.f162015a;
        }

        @l
        public final b b(@l String sessionId) {
            m0.p(sessionId, "sessionId");
            return new b(sessionId);
        }

        @l
        public final String d() {
            return this.f162015a;
        }

        public boolean equals(@m Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && m0.g(this.f162015a, ((b) obj).f162015a);
        }

        public int hashCode() {
            return this.f162015a.hashCode();
        }

        @l
        public String toString() {
            return "SessionDetails(sessionId=" + this.f162015a + ')';
        }
    }

    boolean a();

    @l
    a b();

    void c(@l b bVar);
}
