package yads;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class kb {
    public static List a(y90 y90Var) {
        List listJ = fr.g0.j();
        listJ.add(v90.f156848a);
        listJ.add(new w90("Info"));
        if (y90Var.f() == c50.f147571c && y90Var.a() != null) {
            String strD = y90Var.d();
            listJ.add(new x90((strD == null || cv.p0.O3(strD)) ? a6.d.f3873g : y90Var.d(), y90Var.a()));
        }
        listJ.add(new x90("Type", y90Var.f().a()));
        List<d80> listE = y90Var.e();
        if (listE != null) {
            for (d80 d80Var : listE) {
                listJ.add(new x90(d80Var.a(), d80Var.b()));
            }
        }
        List listB = y90Var.b();
        if (listB != null && !listB.isEmpty()) {
            listJ.add(v90.f156848a);
            listJ.add(new w90("CPM floors"));
            String strD2 = y90Var.d();
            String str = (strD2 == null || cv.p0.O3(strD2)) ? "" : y90Var.d() + ": ";
            for (ha0 ha0Var : y90Var.b()) {
                listJ.add(new x90(str + ha0Var.b(), "cpm: " + ha0Var.a()));
            }
        }
        return fr.g0.b(listJ);
    }
}
