package ov;

import jv.j2;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes4.dex */
@j2
public interface r<T> extends nv.i<T> {

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class a {
        public static /* synthetic */ nv.i a(r rVar, or.j jVar, int i10, lv.j jVar2, int i11, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: fuse");
            }
            if ((i11 & 1) != 0) {
                jVar = or.l.f119535b;
            }
            if ((i11 & 2) != 0) {
                i10 = -3;
            }
            if ((i11 & 4) != 0) {
                jVar2 = lv.j.SUSPEND;
            }
            return rVar.b(jVar, i10, jVar2);
        }
    }

    @oy.l
    nv.i<T> b(@oy.l or.j jVar, int i10, @oy.l lv.j jVar2);
}
