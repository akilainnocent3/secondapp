package defpackage;

import com.sporty.android.core.model.account.themes.ThemeConfig;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.internal.http2.Http2;

/* JADX INFO: loaded from: classes6.dex */
public final class cgv {
    public final boolean a;
    public final List<aev> b;
    public final so1 c;
    public final cil d;
    public final gv1 e;
    public final hfv f;
    public final int g;
    public final int h;
    public final pfv i;
    public final sev j;
    public final tev k;
    public final String l;
    public final boolean m;
    public final boolean n;
    public final ezj0 o;

    public cgv(gv1 gv1Var, wev wevVar, int i) {
        this(false, m2g.a, so1.c.a, new cil(false, true, null, so1.c.a, ThemeConfig.THEME_CONFIG_NOT_SET), (i & 32) != 0 ? new gv1(63) : gv1Var, new hfv(31), 0, 0, null, null, (i & 4096) != 0 ? null : wevVar, null, false, false, null);
    }

    public static cgv a(cgv cgvVar, boolean z, List list, so1 so1Var, cil cilVar, gv1 gv1Var, hfv hfvVar, int i, int i2, pfv pfvVar, sev sevVar, String str, boolean z2, boolean z3, ezj0 ezj0Var, int i3) {
        cgvVar.getClass();
        boolean z4 = (i3 & 2) != 0 ? cgvVar.a : z;
        List list2 = (i3 & 4) != 0 ? cgvVar.b : list;
        so1 so1Var2 = (i3 & 8) != 0 ? cgvVar.c : so1Var;
        cil cilVar2 = (i3 & 16) != 0 ? cgvVar.d : cilVar;
        gv1 gv1Var2 = (i3 & 32) != 0 ? cgvVar.e : gv1Var;
        hfv hfvVar2 = (i3 & 64) != 0 ? cgvVar.f : hfvVar;
        cgvVar.getClass();
        int i4 = (i3 & 256) != 0 ? cgvVar.g : i;
        int i5 = (i3 & 512) != 0 ? cgvVar.h : i2;
        pfv pfvVar2 = (i3 & 1024) != 0 ? cgvVar.i : pfvVar;
        sev sevVar2 = (i3 & 2048) != 0 ? cgvVar.j : sevVar;
        tev tevVar = cgvVar.k;
        String str2 = (i3 & 8192) != 0 ? cgvVar.l : str;
        boolean z5 = (i3 & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? cgvVar.m : z2;
        boolean z6 = (32768 & i3) != 0 ? cgvVar.n : z3;
        ezj0 ezj0Var2 = (i3 & 65536) != 0 ? cgvVar.o : ezj0Var;
        cgvVar.getClass();
        list2.getClass();
        so1Var2.getClass();
        cilVar2.getClass();
        gv1Var2.getClass();
        hfvVar2.getClass();
        return new cgv(z4, list2, so1Var2, cilVar2, gv1Var2, hfvVar2, i4, i5, pfvVar2, sevVar2, tevVar, str2, z5, z6, ezj0Var2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cgv)) {
            return false;
        }
        cgv cgvVar = (cgv) obj;
        return this.a == cgvVar.a && Intrinsics.g(this.b, cgvVar.b) && Intrinsics.g(this.c, cgvVar.c) && Intrinsics.g(this.d, cgvVar.d) && Intrinsics.g(this.e, cgvVar.e) && Intrinsics.g(this.f, cgvVar.f) && this.g == cgvVar.g && this.h == cgvVar.h && this.i == cgvVar.i && this.j == cgvVar.j && Intrinsics.g(this.k, cgvVar.k) && Intrinsics.g(this.l, cgvVar.l) && this.m == cgvVar.m && this.n == cgvVar.n && Intrinsics.g(this.o, cgvVar.o);
    }

    public final int hashCode() {
        int iA = gpp.a(this.h, gpp.a(this.g, (this.f.hashCode() + ((this.e.hashCode() + ((this.d.hashCode() + ((this.c.hashCode() + ai50.a(mtg0.a(Boolean.hashCode(false) * 31, 31, this.a), 31, this.b)) * 31)) * 31)) * 31)) * 961, 31), 31);
        pfv pfvVar = this.i;
        int iHashCode = (iA + (pfvVar == null ? 0 : pfvVar.hashCode())) * 31;
        sev sevVar = this.j;
        int iHashCode2 = (iHashCode + (sevVar == null ? 0 : sevVar.hashCode())) * 31;
        tev tevVar = this.k;
        int iHashCode3 = (iHashCode2 + (tevVar == null ? 0 : tevVar.hashCode())) * 31;
        String str = this.l;
        int iA2 = mtg0.a(mtg0.a((iHashCode3 + (str == null ? 0 : str.hashCode())) * 31, 31, this.m), 31, this.n);
        ezj0 ezj0Var = this.o;
        return iA2 + (ezj0Var != null ? ezj0Var.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MeScreenState(isShowingErrorDialog=false, isRefreshing=");
        sb.append(this.a);
        sb.append(", rows=");
        sb.append(this.b);
        sb.append(", avatarState=");
        sb.append(this.c);
        sb.append(", headerState=");
        sb.append(this.d);
        sb.append(", balanceState=");
        sb.append(this.e);
        sb.append(", meScreenLoyaltyState=");
        sb.append(this.f);
        sb.append(", meBackground=null, giftsCount=");
        d5d.a(sb, this.g, ", ticketsCount=", this.h, ", popup=");
        sb.append(this.i);
        sb.append(", dialog=");
        sb.append(this.j);
        sb.append(", dialogProvider=");
        sb.append(this.k);
        sb.append(", deploymentCountry=");
        sb.append(this.l);
        sb.append(", shouldShowUnlockRewardLabel=");
        nng.a(", showLogoutButton=", ", worldCupBannerUiState=", sb, this.m, this.n);
        sb.append(this.o);
        sb.append(")");
        return sb.toString();
    }

    public cgv(boolean z, List list, so1 so1Var, cil cilVar, gv1 gv1Var, hfv hfvVar, int i, int i2, pfv pfvVar, sev sevVar, tev tevVar, String str, boolean z2, boolean z3, ezj0 ezj0Var) {
        list.getClass();
        so1Var.getClass();
        gv1Var.getClass();
        this.a = z;
        this.b = list;
        this.c = so1Var;
        this.d = cilVar;
        this.e = gv1Var;
        this.f = hfvVar;
        this.g = i;
        this.h = i2;
        this.i = pfvVar;
        this.j = sevVar;
        this.k = tevVar;
        this.l = str;
        this.m = z2;
        this.n = z3;
        this.o = ezj0Var;
    }

    public cgv() {
        this(null, null, 131071);
    }
}
