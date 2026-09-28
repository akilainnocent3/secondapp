package defpackage;

import com.sportybet.android.instantwin.presentation.model.BetSlipData;
import java.util.Collection;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class kdo implements jdo {
    public final fdo a;
    public final wwd0 b = xwd0.a(t3g.a);
    public final b390 c = d390.b(0, 1, pb5.b, 1);

    public kdo(fdo fdoVar) {
        this.a = fdoVar;
    }

    @Override // defpackage.jdo
    public final lyh<Integer> F(String str) {
        str.getClass();
        return this.a.c(str);
    }

    @Override // defpackage.jdo
    public final void I0(String str) {
        str.getClass();
        wwd0 wwd0Var = this.b;
        Set set = (Set) wwd0Var.getValue();
        Set setC = set;
        setC.getClass();
        if (setC.contains(str)) {
            setC = yi80.c(setC, str);
        }
        Set set2 = setC;
        if (set2.equals(set)) {
            return;
        }
        wwd0Var.k(null, set2);
        this.c.a(Unit.a);
    }

    @Override // defpackage.jdo
    public final void O(String str) {
        wwd0 wwd0Var = this.b;
        Set set = (Set) wwd0Var.getValue();
        Set setF = set;
        setF.getClass();
        if (!setF.contains(str)) {
            setF = yi80.f(setF, str);
        }
        Set set2 = setF;
        if (set2.equals(set)) {
            return;
        }
        wwd0Var.k(null, set2);
        this.c.a(Unit.a);
    }

    @Override // defpackage.jdo
    public final void R(String str, String str2, Collection<? extends BetSlipData> collection) {
        if (str == null || str.length() == 0 || str2 == null || str2.length() == 0) {
            itf0.a.n("cacheBetslipSelections: sportId or currentRoundId is null or empty", new Object[0]);
            return;
        }
        if (collection == null) {
            collection = m2g.a;
        }
        this.a.a(str, str2, collection);
    }

    @Override // defpackage.jdo
    public final void j0(int i, String str) {
        str.getClass();
        this.a.e(i, str);
    }

    @Override // defpackage.jdo
    public final Object l1(String str, String str2, b6v b6vVar) {
        if (str != null && str.length() != 0 && str2 != null && str2.length() != 0) {
            return this.a.b(str, str2, b6vVar);
        }
        itf0.a.n("restoreBetslipSelections: sportId or currentRoundId is null or empty", new Object[0]);
        return null;
    }

    @Override // defpackage.jdo
    public final void o() {
        wwd0 wwd0Var = this.b;
        Set set = (Set) wwd0Var.getValue();
        set.getClass();
        t3g t3gVar = t3g.a;
        if (Intrinsics.g(t3gVar, set)) {
            return;
        }
        wwd0Var.setValue(t3gVar);
        this.c.a(Unit.a);
    }

    @Override // defpackage.jdo
    public final void q0(String str) {
        if (str == null || str.length() == 0) {
            itf0.a.n("clearBetslipCache: sportId is null or empty", new Object[0]);
        } else {
            this.a.d(str);
        }
    }

    @Override // defpackage.jdo
    public final a390<Unit> v0() {
        return this.c;
    }

    @Override // defpackage.jdo
    public final uwd0<Set<String>> x() {
        return this.b;
    }
}
