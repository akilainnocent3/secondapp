package yads;

import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class vj1 implements dj {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j31 f156998a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final nn1 f156999b;

    public vj1(j31 j31Var, nn1 nn1Var) {
        this.f156998a = j31Var;
        this.f156999b = nn1Var;
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0051  */
    @Override // yads.dj
    public final boolean a(Object obj) {
        boolean z10;
        boolean z11;
        on1 on1Var = (on1) obj;
        List list = on1Var.f153570c;
        oj1 oj1Var = on1Var.f153568a;
        if (list == null) {
            z10 = false;
        } else {
            if (!list.isEmpty()) {
                Iterator it = list.iterator();
                while (true) {
                    if (it.hasNext()) {
                        u41 u41Var = (u41) it.next();
                        j31 j31Var = this.f156998a;
                        j31Var.getClass();
                        String str = u41Var.f156268c;
                        if (str != null) {
                            j31Var.f150919a.getClass();
                            if (str.length() <= 0 || kotlin.jvm.internal.m0.g(fw.b.f85379f, str)) {
                            }
                        }
                        z10 = false;
                    }
                }
            }
            z10 = true;
        }
        if (oj1Var != null) {
            this.f156999b.getClass();
            if (oj1Var.f153511b > 0.0f) {
                z11 = true;
            } else {
                z11 = false;
            }
        } else {
            z11 = false;
        }
        if (list == null || oj1Var == null) {
            if (list != null) {
                return z10;
            }
            if (oj1Var != null) {
                return z11;
            }
        } else if (z11 && z10) {
            return true;
        }
        return false;
    }
}
