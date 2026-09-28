package defpackage;

import com.sporty.android.core.model.dispatcher.Dispatcher;
import com.sporty.android.core.model.dispatcher.SportyDispatchers;
import com.sporty.android.core.model.profile.UserInfoProperty;
import com.sportybet.model.KYCReminderState;
import java.util.Date;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.Unit;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"La230;", "Lj8i0;", "africa-bet-android"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class a230 extends j8i0 {
    public final ku90<lk50<Unit>> A;
    public final t340 B;
    public final wwd0 C;
    public final f1i D;
    public final wwd0 E;
    public final v340 F;
    public final ku90<oz20> G;
    public final t340 H;
    public final psm a;
    public final uo1 b;
    public final m2l c;
    public final gip d;
    public final lyz e;
    public final oyf f;
    public final odd i;
    public final rdd0 v;
    public final lq1 w;
    public final v340 y;
    public final wwd0 z;

    public a230(psm psmVar, uo1 uo1Var, m2l m2lVar, gip gipVar, lyz lyzVar, oyf oyfVar, @Dispatcher(sportyDispatcher = SportyDispatchers.IO) odd oddVar, rdd0 rdd0Var, lq1 lq1Var) {
        Object value;
        psmVar.getClass();
        uo1Var.getClass();
        m2lVar.getClass();
        lyzVar.getClass();
        oyfVar.getClass();
        rdd0Var.getClass();
        lq1Var.getClass();
        this.a = psmVar;
        this.b = uo1Var;
        this.c = m2lVar;
        this.d = gipVar;
        this.e = lyzVar;
        this.f = oyfVar;
        this.i = oddVar;
        this.v = rdd0Var;
        this.w = lq1Var;
        m2l m2lVar2 = uo1Var.a;
        m2lVar2.getClass();
        this.y = e1i.e(new n1i(m2lVar2.a.getIntFlow("key_loyalty_highest_tier", -1), m2lVar.a.getBooleanByFlow("key_avatar_new", true), new w130(3, null)), o8i0.d(this), q490.a.a, Boolean.FALSE);
        wwd0 wwd0VarA = xwd0.a(new j130(0));
        this.z = wwd0VarA;
        ku90<lk50<Unit>> ku90Var = new ku90<>();
        this.A = ku90Var;
        this.B = e1i.a(ku90Var);
        wwd0 wwd0VarA2 = xwd0.a(null);
        this.C = wwd0VarA2;
        this.D = new f1i(e1i.b(wwd0VarA2));
        wwd0 wwd0VarA3 = xwd0.a(KYCReminderState.Loading.INSTANCE);
        this.E = wwd0VarA3;
        this.F = e1i.b(wwd0VarA3);
        ku90<oz20> ku90Var2 = new ku90<>();
        this.G = ku90Var2;
        this.H = e1i.a(ku90Var2);
        do {
            value = wwd0VarA.getValue();
        } while (!wwd0VarA.g(value, j130.a((j130) value, null, null, null, false, null, false, true, false, null, 447)));
        kzh.d(new g1i(ozh.c(new yzh(r1i.b(bm50.f(lyzVar.a(new pu0.a(0))), bm50.f(bm50.a(lyzVar.E0())), bm50.f(bm50.a(oyfVar.f())), bm50.f(bm50.a(oyfVar.h())), new s130(this, null)), new t130(this, null)), this.i), new u130(this, null)), o8i0.d(this));
    }

    public final void x1(hz20 hz20Var) {
        wwd0 wwd0Var;
        Object value;
        hz20Var.getClass();
        if (hz20Var.equals(hz20.a.a)) {
            ej5.c(o8i0.d(this), null, null, new y130(this, null), 3);
            return;
        }
        if (hz20Var.equals(hz20.b.a)) {
            do {
                wwd0Var = this.z;
                value = wwd0Var.getValue();
            } while (!wwd0Var.g(value, j130.a((j130) value, null, null, null, false, null, false, false, false, null, 255)));
            Unit unit = Unit.a;
            return;
        }
        if (hz20Var.equals(hz20.c.a)) {
            ej5.c(o8i0.d(this), null, null, new z130(this, null), 3);
        } else {
            uhc.a();
        }
    }

    public final void y1(yve yveVar) {
        Object value;
        Object value2;
        yveVar.getClass();
        wwd0 wwd0Var = this.z;
        j130 j130Var = (j130) wwd0Var.getValue();
        if (yveVar.equals(yve.c.a)) {
            gwe gweVarA = gwe.a(j130Var.e, null, true, null, false, 13);
            do {
                value2 = wwd0Var.getValue();
            } while (!wwd0Var.g(value2, j130.a((j130) value2, null, null, null, false, gweVarA, false, false, false, null, 495)));
            return;
        }
        if (yveVar.equals(yve.d.a)) {
            this.G.a(oz20.b.a);
            return;
        }
        yve.a aVar = yve.a.a;
        if (yveVar.equals(aVar)) {
            gwe gweVarA2 = gwe.a(j130Var.e, null, false, null, false, 13);
            do {
                value = wwd0Var.getValue();
            } while (!wwd0Var.g(value, j130.a((j130) value, null, null, null, false, gweVarA2, false, false, false, null, 495)));
        } else {
            if (!(yveVar instanceof yve.b)) {
                uhc.a();
                return;
            }
            Long l = ((yve.b) yveVar).a;
            if (l != null) {
                long jLongValue = l.longValue();
                Date date = new Date(jLongValue);
                Locale locale = Locale.US;
                locale.getClass();
                String strL = bwf0.l(date, "yyyyMMdd", locale, 0, 0);
                kzh.d(new g1i(bm50.c(this.e.u0(UserInfoProperty.Birthday, strL), vch0.b), new v130(this, jLongValue, null)), o8i0.d(this));
                y1(aVar);
            }
        }
    }
}
