package yads;

import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class cp {
    public static fo2 a(dp dpVar) {
        e00 e00Var;
        fo2 fo2Var = new fo2((Map) null, 3);
        fo2Var.a((dpVar == null || (e00Var = dpVar.f148303a) == null) ? null : e00Var.f148441b, "ad_type");
        fo2Var.a(dpVar != null ? dpVar.f148305c : null, dk.d.f79375c);
        a03 a03Var = dpVar != null ? dpVar.f148304b : null;
        if (a03Var != null) {
            fo2Var.b(a03Var.b().f159117b, "size_type");
            fo2Var.b(Integer.valueOf(a03Var.getWidth()), "width");
            fo2Var.b(Integer.valueOf(a03Var.getHeight()), "height");
        }
        return fo2Var;
    }
}
