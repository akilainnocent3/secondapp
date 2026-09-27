package yads;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class av {
    public static String a(yu yuVar) {
        if (yuVar instanceof uu) {
            String str = ((uu) yuVar).f156593a.f155422h;
            return str == null ? "unknown" : str;
        }
        if (yuVar instanceof vu) {
            return "default";
        }
        if (yuVar instanceof tu) {
            return "custom";
        }
        if (yuVar instanceof wu) {
            return "empty";
        }
        if (yuVar instanceof xu) {
            return "error";
        }
        throw new dr.o0();
    }
}
