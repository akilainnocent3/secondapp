package defpackage;

import java.util.Iterator;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Ls7f0;", "Lj8i0;", "dedicated-team-page"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class s7f0 extends j8i0 {
    public final wwd0 A;
    public final wwd0 B;
    public final wwd0 C;
    public final wwd0 D;
    public final wwd0 E;
    public final v340 F;
    public final lfk a;
    public final nfk b;
    public final uck c;
    public final m6k d;
    public final org e;
    public final zgh f;
    public final ong i;
    public final ivs v;
    public final rdd0 w;
    public final String y;
    public final int z;

    @c0d(c = "com.sportybet.feature.dedicatedteampage.team.presentation.viewmodel.TeamOverviewViewModel$uiState$1", f = "TeamOverviewViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class a extends tje0 implements kaj<q7f0, Boolean, Boolean, String, String, v1b<? super c8f0>, Object> {
        public /* synthetic */ q7f0 a;
        public /* synthetic */ boolean b;
        public /* synthetic */ boolean c;
        public /* synthetic */ String d;
        public /* synthetic */ String e;

        public a(v1b<? super a> v1bVar) {
            super(6, v1bVar);
        }

        @Override // defpackage.kaj
        public final Object f(q7f0 q7f0Var, Boolean bool, Boolean bool2, String str, String str2, v1b<? super c8f0> v1bVar) {
            boolean zBooleanValue = bool.booleanValue();
            boolean zBooleanValue2 = bool2.booleanValue();
            a aVar = s7f0.this.new a(v1bVar);
            aVar.a = q7f0Var;
            aVar.b = zBooleanValue;
            aVar.c = zBooleanValue2;
            aVar.d = str;
            aVar.e = str2;
            return aVar.invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            s7f0 s7f0Var = s7f0.this;
            int i = s7f0Var.z;
            ivs ivsVar = s7f0Var.v;
            q7f0 q7f0Var = this.a;
            boolean z = this.b;
            boolean z2 = this.c;
            String str = this.d;
            String str2 = this.e;
            y5b y5bVar = y5b.a;
            uj50.b(obj);
            if (z2) {
                return c8f0.b.a;
            }
            if (q7f0Var == null) {
                return z ? new c8f0.c() : c8f0.d.a;
            }
            String strX1 = s7f0Var.x1(str);
            ivsVar.getClass();
            return new c8f0.a(q7f0Var, str, str2, ivsVar.c(ivs.a(i, strX1), kpu.f(new Pair("teamInfo", "true"), new Pair("locale", ivsVar.c.getLanguageCode()))), ivsVar.b(i, s7f0Var.x1(str2)));
        }
    }

    public s7f0(vu60 vu60Var, lfk lfkVar, nfk nfkVar, uck uckVar, m6k m6kVar, org orgVar, zgh zghVar, ong ongVar, ivs ivsVar, rdd0 rdd0Var) {
        vu60Var.getClass();
        rdd0Var.getClass();
        this.a = lfkVar;
        this.b = nfkVar;
        this.c = uckVar;
        this.d = m6kVar;
        this.e = orgVar;
        this.f = zghVar;
        this.i = ongVar;
        this.v = ivsVar;
        this.w = rdd0Var;
        String str = (String) vu60Var.b("team_id");
        str = str == null ? "" : str;
        this.y = str;
        Integer intOrNull = StringsKt.toIntOrNull(StringsKt.m0(str, ":", str));
        this.z = intOrNull != null ? intOrNull.intValue() : 0;
        wwd0 wwd0VarA = xwd0.a(null);
        this.A = wwd0VarA;
        Boolean bool = Boolean.FALSE;
        wwd0 wwd0VarA2 = xwd0.a(bool);
        this.B = wwd0VarA2;
        wwd0 wwd0VarA3 = xwd0.a(bool);
        this.C = wwd0VarA3;
        wwd0 wwd0VarA4 = xwd0.a("");
        this.D = wwd0VarA4;
        wwd0 wwd0VarA5 = xwd0.a("");
        this.E = wwd0VarA5;
        this.F = e1i.e(r1i.c(wwd0VarA, wwd0VarA2, wwd0VarA3, wwd0VarA4, wwd0VarA5, new a(null)), o8i0.d(this), new mwd0(5000L, Long.MAX_VALUE), c8f0.d.a);
        ej5.c(o8i0.d(this), null, null, new r7f0(this, null), 3);
    }

    public final String x1(String str) {
        uf00<a4g0> uf00Var;
        a4g0 next;
        q7f0 q7f0Var = (q7f0) this.A.getValue();
        String str2 = null;
        if (q7f0Var != null && (uf00Var = q7f0Var.d) != null) {
            Iterator<a4g0> it = uf00Var.iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (!Intrinsics.g(next.a, str));
            a4g0 a4g0Var = next;
            if (a4g0Var != null) {
                str2 = a4g0Var.b;
            }
        }
        return str2 == null ? "" : str2;
    }
}
