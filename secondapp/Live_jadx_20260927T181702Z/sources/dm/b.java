package dm;

import com.google.firebase.components.ComponentRegistrar;
import java.util.ArrayList;
import java.util.List;
import zj.g;
import zj.i;
import zj.l;
import zj.n;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes4.dex */
public class b implements n {
    public static /* synthetic */ Object b(String str, g gVar, i iVar) {
        try {
            c.b(str);
            return gVar.k().a(iVar);
        } finally {
            c.a();
        }
    }

    @Override // zj.n
    public List<g<?>> a(ComponentRegistrar componentRegistrar) {
        ArrayList arrayList = new ArrayList();
        for (final g<?> gVarZ : componentRegistrar.getComponents()) {
            final String strL = gVarZ.l();
            if (strL != null) {
                gVarZ = gVarZ.z(new l() { // from class: dm.a
                    @Override // zj.l
                    public final Object a(i iVar) {
                        return b.b(strL, gVarZ, iVar);
                    }
                });
            }
            arrayList.add(gVarZ);
        }
        return arrayList;
    }
}
