package yads;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class b51 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final nu0 f147072a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final kj f147073b;

    public /* synthetic */ b51() {
        this(new nu0(), new kj());
    }

    public final Set a(List list) {
        Object next;
        List listJ;
        m0 m0Var;
        List listJ2;
        gi0 gi0Var;
        List list2;
        Object next2;
        this.f147073b.getClass();
        Set setE6 = fr.r0.e6(kj.a(list));
        Iterator it = list.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!kotlin.jvm.internal.m0.g(((oi) next).f153501a, "feedback"));
        oi oiVar = (oi) next;
        this.f147072a.getClass();
        if ((oiVar != null ? oiVar.f153503c : null) instanceof qu0) {
            List listR = fr.h0.R(((qu0) oiVar.f153503c).f154604a);
            if1 if1Var = oiVar.f153504d;
            if (if1Var == null || (list2 = if1Var.f150589a) == null) {
                m0Var = null;
            } else {
                Iterator it2 = list2.iterator();
                do {
                    if (!it2.hasNext()) {
                        next2 = null;
                        break;
                    }
                    next2 = it2.next();
                } while (!kotlin.jvm.internal.m0.g(((m0) next2).a(), "divkit_adtune"));
                m0Var = (m0) next2;
            }
            rh0 rh0Var = m0Var instanceof rh0 ? (rh0) m0Var : null;
            if (rh0Var == null || (gi0Var = rh0Var.f154963b) == null || (listJ2 = gi0Var.f149622d) == null) {
                listJ2 = fr.h0.J();
            }
            listJ = fr.r0.I4(listR, listJ2);
        } else {
            listJ = fr.h0.J();
        }
        setE6.addAll(listJ);
        return setE6;
    }

    public b51(nu0 nu0Var, kj kjVar) {
        this.f147072a = nu0Var;
        this.f147073b = kjVar;
    }
}
