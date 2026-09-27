package yads;

import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class hm3 implements fp2 {
    @Override // yads.fp2
    public final eo2 a(Object obj) {
        Map mapA = a((em3) obj);
        co2 co2Var = co2.f147817c;
        return new eo2("vmap_request", fr.n1.J0(mapA), null);
    }

    @Override // yads.fp2
    public final eo2 a(vp2 vp2Var, int i10, Object obj) {
        Map mapJ0 = fr.n1.J0(a((em3) obj));
        if (i10 != -1) {
            mapJ0.put(gp.e.f87280s, Integer.valueOf(i10));
        }
        co2 co2Var = co2.f147817c;
        return new eo2("vmap_response", fr.n1.J0(mapJ0), null);
    }

    public static Map a(em3 em3Var) {
        rs3 rs3Var = (rs3) em3Var;
        dr.z0 z0VarA = dr.v1.a("page_id", rs3Var.f155141a.getPageId());
        dr.z0 z0VarA2 = dr.v1.a("category_id", rs3Var.f155141a.getCategoryId());
        d00 d00Var = e00.f148431c;
        return fr.n1.W(z0VarA, z0VarA2, dr.v1.a("ad_type", "instream"), dr.v1.a("instream_loader_type", rs3Var.f155142b.f149496b));
    }
}
