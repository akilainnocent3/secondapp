package ft;

import java.util.Arrays;
import java.util.Set;
import kotlin.jvm.internal.m0;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
public interface p {
    @oy.m
    nt.u a(@oy.l wt.c cVar, boolean z10);

    @oy.m
    Set<String> b(@oy.l wt.c cVar);

    @oy.m
    nt.g c(@oy.l a aVar);

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @oy.l
        public final wt.b f85305a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @oy.m
        public final byte[] f85306b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @oy.m
        public final nt.g f85307c;

        public a(@oy.l wt.b classId, @oy.m byte[] bArr, @oy.m nt.g gVar) {
            m0.p(classId, "classId");
            this.f85305a = classId;
            this.f85306b = bArr;
            this.f85307c = gVar;
        }

        @oy.l
        public final wt.b a() {
            return this.f85305a;
        }

        public boolean equals(@oy.m Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return m0.g(this.f85305a, aVar.f85305a) && m0.g(this.f85306b, aVar.f85306b) && m0.g(this.f85307c, aVar.f85307c);
        }

        public int hashCode() {
            int iHashCode = this.f85305a.hashCode() * 31;
            byte[] bArr = this.f85306b;
            int iHashCode2 = (iHashCode + (bArr == null ? 0 : Arrays.hashCode(bArr))) * 31;
            nt.g gVar = this.f85307c;
            return iHashCode2 + (gVar != null ? gVar.hashCode() : 0);
        }

        @oy.l
        public String toString() {
            return "Request(classId=" + this.f85305a + ", previouslyFoundClassFileContent=" + Arrays.toString(this.f85306b) + ", outerClass=" + this.f85307c + ')';
        }

        public /* synthetic */ a(wt.b bVar, byte[] bArr, nt.g gVar, int i10, kotlin.jvm.internal.x xVar) {
            this(bVar, (i10 & 2) != 0 ? null : bArr, (i10 & 4) != 0 ? null : gVar);
        }
    }
}
