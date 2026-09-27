package et;

import kotlin.jvm.internal.m0;
import oy.l;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
public interface c {

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class a implements c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @l
        public static final a f81594a = new a();

        @Override // et.c
        public void a(@l String filePath, @l e position, @l String scopeFqName, @l f scopeKind, @l String name) {
            m0.p(filePath, "filePath");
            m0.p(position, "position");
            m0.p(scopeFqName, "scopeFqName");
            m0.p(scopeKind, "scopeKind");
            m0.p(name, "name");
        }

        @Override // et.c
        public boolean b() {
            return false;
        }
    }

    void a(@l String str, @l e eVar, @l String str2, @l f fVar, @l String str3);

    boolean b();
}
