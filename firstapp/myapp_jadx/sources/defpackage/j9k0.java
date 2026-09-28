package defpackage;

import com.sporty.android.common.network.data.SprThrowable;
import com.sporty.android.common_ui.uitext.ResourceUiText;
import com.sporty.android.common_ui.uitext.StringUiText;
import com.sportybet.android.gp.tz.R;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.b;
import kotlin.text.Regex;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lj9k0;", "Lj8i0;", "africa-bet-android"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class j9k0 extends j8i0 {
    public static final /* synthetic */ ohp<Object>[] C = {new otw(0, j9k0.class, "state", "getState()Lcom/sportybet/android/account/zaaccount/register/ZARegisterState;")};
    public final v340 A;
    public final vwd0 B;
    public final psm a;
    public final ou40 b;
    public final lyz c;
    public final rdd0 d;
    public final nsm e;
    public final edj f;
    public final Regex i;
    public final Regex v;
    public final List<px40.a> w;
    public final ku90<t8k0> y;
    public final ku90 z;

    public j9k0(psm psmVar, ou40 ou40Var, lyz lyzVar, rdd0 rdd0Var, nsm nsmVar, yi5 yi5Var) {
        psmVar.getClass();
        ou40Var.getClass();
        lyzVar.getClass();
        rdd0Var.getClass();
        nsmVar.getClass();
        yi5Var.getClass();
        this.a = psmVar;
        this.b = ou40Var;
        this.c = lyzVar;
        this.d = rdd0Var;
        this.e = nsmVar;
        this.f = new edj();
        this.i = new Regex("^0(6\\d|7\\d|8[1-4])\\d{7}$");
        this.v = new Regex("^(6\\d|7\\d|8[1-4])\\d{7}$");
        Set<String> set = px40.a;
        px40.a aVar = new px40.a(10, set);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator<T> it = set.iterator();
        while (it.hasNext()) {
            linkedHashSet.add("0" + ((String) it.next()));
        }
        this.w = b.k(aVar, new px40.a(11, linkedHashSet));
        ku90<t8k0> ku90Var = new ku90<>();
        this.y = ku90Var;
        this.z = ku90Var;
        vwd0 vwd0Var = new vwd0(new nak0(this.a.X(), this.a.c(), this.a.M(), yi5Var.b().j() ? new iej.b(false, false) : iej.a.a, 3704));
        this.A = vwd0Var.b;
        this.B = vwd0Var;
        this.d.a(new ts40.f0(this.a.getCountryCode().getCode()), k00.c);
        this.d.a(ts40.r.a, k00.d);
    }

    public final void A1(nak0 nak0Var) {
        this.B.b(this, C[0], nak0Var);
    }

    public final void B1() {
        boolean z = x1().i;
        boolean z2 = z1(x1().f.a.b) && !(x1().k instanceof sx40.a);
        A1(nak0.a(x1(), null, z2, false, (z && z2 && x1().l.f) ? uxs.ENABLE : uxs.DISABLE, null, null, 3519));
    }

    public final void C1() {
        if (x1().j != uxs.LOADING) {
            B1();
        }
    }

    @Override // defpackage.j8i0
    public final void onCleared() {
        this.d.a(ts40.t.a, k00.d);
        super.onCleared();
    }

    public final nak0 x1() {
        return (nak0) this.B.a(this, C[0]);
    }

    /* JADX WARN: Code duplicated, block: B:17:0x00ca  */
    public final void y1(Throwable th) {
        boolean z = th instanceof SprThrowable;
        psm psmVar = this.a;
        rdd0 rdd0Var = this.d;
        if (z) {
            SprThrowable sprThrowable = (SprThrowable) th;
            int d = sprThrowable.getD();
            if (d == 10110) {
                A1(nak0.a(x1(), null, false, false, null, new sx40.a(vch0.d(sprThrowable.getE())), null, 3071));
                rdd0Var.a(new ts40.b0("password", psmVar.getCountryCode().getCode()), k00.c);
            } else if (d == 11600) {
                A1(nak0.a(x1(), null, false, false, null, new sx40.a(vch0.d(sprThrowable.getE())), null, 3071));
                rdd0Var.a(new ts40.b0("mobile phone", psmVar.getCountryCode().getCode()), k00.c);
            } else if (d == 11603) {
                A1(nak0.a(x1(), null, false, false, null, new sx40.a(vch0.d(sprThrowable.getE())), null, 3071));
                rdd0Var.a(new ts40.b0("password", psmVar.getCountryCode().getCode()), k00.c);
            } else if (d == 11611) {
                A1(nak0.a(x1(), null, false, false, null, new sx40.a(vch0.d(sprThrowable.getE())), null, 3071));
                rdd0Var.a(new ts40.b0("mobile phone", psmVar.getCountryCode().getCode()), k00.c);
            } else if (d != 11612) {
                A1(nak0.a(x1(), null, false, false, null, new sx40.a(vch0.d(sprThrowable.getE())), null, 3071));
                rdd0Var.a(new ts40.b0("other", psmVar.getCountryCode().getCode()), k00.c);
            } else {
                A1(nak0.a(x1(), null, false, false, null, new sx40.a(vch0.d(sprThrowable.getE())), null, 3071));
                rdd0Var.a(new ts40.b0("password", psmVar.getCountryCode().getCode()), k00.c);
            }
        } else {
            nak0 nak0VarX1 = x1();
            StringUiText stringUiText = vch0.a;
            A1(nak0.a(nak0VarX1, null, false, false, null, new sx40.a(new ResourceUiText(R.string.common_feedback__something_went_wrong_tip)), null, 3071));
            rdd0Var.a(new ts40.b0("other", psmVar.getCountryCode().getCode()), k00.c);
        }
        B1();
    }

    public final boolean z1(String str) {
        if (StringsKt.U(str) || StringsKt.U(x1().f.a.b)) {
            return false;
        }
        Set<String> set = px40.a;
        return px40.a(str, b.k(this.i, this.v), this.w);
    }
}
