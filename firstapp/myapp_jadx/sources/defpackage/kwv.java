package defpackage;

import com.sporty.android.common_ui.uitext.UiText;
import com.sportybet.plugin.realsports.home.featuredsection.lAly.lTGEJfVytU;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class kwv {
    public final int a;
    public final String b;
    public final String c;
    public final List<cuv> d;
    public final String e;
    public final String f;
    public final UiText g;
    public final UiText h;
    public final boolean i;
    public final boolean j;
    public final uxs k;
    public final wwv l;
    public final String m;
    public final UiText n;
    public final List<yuv> o;
    public final dtv p;
    public final UiText q;
    public final wae r;
    public final boolean s;
    public final boolean t;
    public final boolean u;
    public final List<r5f0> v;
    public final boolean w;
    public final qrv x;

    public kwv(int i, String str, String str2, List<cuv> list, String str3, String str4, UiText uiText, UiText uiText2, boolean z, boolean z2, uxs uxsVar, wwv wwvVar, String str5, UiText uiText3, List<yuv> list2, dtv dtvVar, UiText uiText4, wae waeVar, boolean z3, boolean z4, boolean z5, List<r5f0> list3, boolean z6, qrv qrvVar) {
        str.getClass();
        str2.getClass();
        list.getClass();
        str3.getClass();
        str4.getClass();
        uiText.getClass();
        uiText2.getClass();
        uxsVar.getClass();
        wwvVar.getClass();
        str5.getClass();
        uiText3.getClass();
        list2.getClass();
        uiText4.getClass();
        waeVar.getClass();
        list3.getClass();
        qrvVar.getClass();
        this.a = i;
        this.b = str;
        this.c = str2;
        this.d = list;
        this.e = str3;
        this.f = str4;
        this.g = uiText;
        this.h = uiText2;
        this.i = z;
        this.j = z2;
        this.k = uxsVar;
        this.l = wwvVar;
        this.m = str5;
        this.n = uiText3;
        this.o = list2;
        this.p = dtvVar;
        this.q = uiText4;
        this.r = waeVar;
        this.s = z3;
        this.t = z4;
        this.u = z5;
        this.v = list3;
        this.w = z6;
        this.x = qrvVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kwv)) {
            return false;
        }
        kwv kwvVar = (kwv) obj;
        return this.a == kwvVar.a && Intrinsics.g(this.b, kwvVar.b) && Intrinsics.g(this.c, kwvVar.c) && Intrinsics.g(this.d, kwvVar.d) && Intrinsics.g(this.e, kwvVar.e) && Intrinsics.g(this.f, kwvVar.f) && Intrinsics.g(this.g, kwvVar.g) && Intrinsics.g(this.h, kwvVar.h) && this.i == kwvVar.i && this.j == kwvVar.j && this.k == kwvVar.k && this.l == kwvVar.l && Intrinsics.g(this.m, kwvVar.m) && Intrinsics.g(this.n, kwvVar.n) && Intrinsics.g(this.o, kwvVar.o) && Intrinsics.g(this.p, kwvVar.p) && Intrinsics.g(this.q, kwvVar.q) && this.r == kwvVar.r && this.s == kwvVar.s && this.t == kwvVar.t && this.u == kwvVar.u && Intrinsics.g(this.v, kwvVar.v) && this.w == kwvVar.w && Intrinsics.g(this.x, kwvVar.x);
    }

    public final int hashCode() {
        int iA = ai50.a(yvf.a(gmf0.a((this.l.hashCode() + y45.a(this.k, mtg0.a(mtg0.a(yvf.a(yvf.a(gmf0.a(gmf0.a(ai50.a(gmf0.a(gmf0.a(Integer.hashCode(this.a) * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, this.f), 31, this.g), 31, this.h), 31, this.i), 31, this.j), 31)) * 31, 31, this.m), 31, this.n), 31, this.o);
        dtv dtvVar = this.p;
        return this.x.hashCode() + mtg0.a(ai50.a(mtg0.a(mtg0.a(mtg0.a((this.r.hashCode() + yvf.a((iA + (dtvVar == null ? 0 : dtvVar.hashCode())) * 31, 31, this.q)) * 31, 31, this.s), 31, this.t), 31, this.u), 31, this.v), 31, this.w);
    }

    public final String toString() {
        StringBuilder sbA = uqe0.a(this.a, "MissionUiData(id=", ", title=", this.b, ", description=");
        kya0.b(this.c, ", rewards=", ", sportBettingUrl=", sbA, this.d);
        hxa.c(sbA, this.e, ", lastAcceptanceTime=", this.f, ", endTimeDetails=");
        vh8.a(sbA, this.g, ", expiryDisplay=", this.h, ", isOngoing=");
        nng.a(", isCompleted=", ", buttonStatus=", sbA, this.i, this.j);
        sbA.append(this.k);
        sbA.append(", missionUiStatus=");
        sbA.append(this.l);
        sbA.append(", startTime=");
        sbA.append(this.m);
        sbA.append(", buttonText=");
        sbA.append(this.n);
        sbA.append(", rules=");
        sbA.append(this.o);
        sbA.append(lTGEJfVytU.AtKKbHwcHLLweKE);
        sbA.append(this.p);
        sbA.append(", missionCompleteDesc=");
        sbA.append(this.q);
        sbA.append(", completedDestination=");
        sbA.append(this.r);
        sbA.append(", isWorldCupPass=");
        nng.a(", isInteractive=", ", containBetslipThemeReward=", sbA, this.s, this.t);
        sbA.append(this.u);
        sbA.append(", tasks=");
        sbA.append(this.v);
        sbA.append(", showRulesToggle=");
        sbA.append(this.w);
        sbA.append(", cancelState=");
        sbA.append(this.x);
        sbA.append(")");
        return sbA.toString();
    }
}
