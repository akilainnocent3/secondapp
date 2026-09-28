package defpackage;

import java.security.GeneralSecurityException;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class tn7 implements iw20<sn7, sn7> {
    public static final tn7 a = new tn7();

    public static class a implements sn7 {
    }

    @Override // defpackage.iw20
    public final Class<sn7> a() {
        return sn7.class;
    }

    @Override // defpackage.iw20
    public final Class<sn7> b() {
        return sn7.class;
    }

    @Override // defpackage.iw20
    public final sn7 c(hw20<sn7> hw20Var) throws GeneralSecurityException {
        if (hw20Var.b == null) {
            opp.a("no primary in primitive set");
            return null;
        }
        Iterator<List<hw20.b<sn7>>> it = hw20Var.a.values().iterator();
        while (it.hasNext()) {
            Iterator<hw20.b<sn7>> it2 = it.next().iterator();
            while (it2.hasNext()) {
                sn7 sn7Var = it2.next().a;
            }
        }
        return new a();
    }
}
