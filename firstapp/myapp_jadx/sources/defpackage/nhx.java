package defpackage;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.a;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0017\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lnhx;", "Lvkx;", "Lfhx;", "navigation-common_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@vkx.a("navigation")
public class nhx extends vkx<fhx> {
    public final wkx c;

    public nhx(wkx wkxVar) {
        wkxVar.getClass();
        this.c = wkxVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [T, android.os.Bundle] */
    /* JADX WARN: Type inference failed for: r4v7, types: [T, android.os.Bundle] */
    @Override // defpackage.vkx
    public final void d(List list, zix zixVar) {
        list.getClass();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ifx ifxVar = (ifx) it.next();
            ygx ygxVar = ifxVar.b;
            ygxVar.getClass();
            fhx fhxVar = (fhx) ygxVar;
            dq40 dq40Var = new dq40();
            dq40Var.a = ifxVar.v.a();
            lhx lhxVar = fhxVar.i;
            int i = lhxVar.c;
            String str = lhxVar.e;
            if (i == 0 && str == null) {
                q1b.a("no start destination defined via app:startDestination for ".concat(fhxVar.h()));
                return;
            }
            ygx ygxVarC = str != null ? lhxVar.c(str, false) : (ygx) fsa0.a(lhxVar.b, i);
            if (ygxVarC == null) {
                String strValueOf = lhxVar.d;
                if (strValueOf == null) {
                    strValueOf = lhxVar.e;
                    if (strValueOf == null) {
                        strValueOf = String.valueOf(lhxVar.c);
                    }
                    lhxVar.d = strValueOf;
                }
                strValueOf.getClass();
                hb5.a(tug.a("navigation destination ", strValueOf, " is not a direct child of this NavGraph"));
                return;
            }
            dhx dhxVar = ygxVarC.b;
            if (str != null) {
                if (!str.equals(dhxVar.f)) {
                    ygx.b bVarA = dhxVar.a(str);
                    Bundle bundle = bVarA != null ? bVarA.b : null;
                    if (bundle != null && !bundle.isEmpty()) {
                        o2g.a.getClass();
                        ?? A = vj5.a((Pair[]) Arrays.copyOf(new Pair[0], 0));
                        A.putAll(bundle);
                        Bundle bundle2 = (Bundle) dq40Var.a;
                        if (bundle2 != null) {
                            A.putAll(bundle2);
                        }
                        dq40Var.a = A;
                    }
                }
                if (ygxVarC.f().isEmpty()) {
                    continue;
                } else {
                    ArrayList arrayListA = hfx.a(ygxVarC.f(), new mhx(0, dq40Var));
                    if (!arrayListA.isEmpty()) {
                        zkv.a("Cannot navigate to startDestination ", ygxVarC, ". Missing required arguments [", arrayListA, 93);
                        return;
                    }
                }
            }
            this.c.b(ygxVarC.a).d(a.c(b().a(ygxVarC, ygxVarC.c((Bundle) dq40Var.a))), zixVar);
        }
    }

    @Override // defpackage.vkx
    /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
    public fhx a() {
        return new fhx(this);
    }
}
