package com.sportybet.feature.loyalty.impl.notifications.presentation.worldcuppass;

import com.sporty.android.common_ui.uitext.ResourceUiText;
import com.sporty.android.common_ui.uitext.StringUiText;
import com.sportybet.android.gp.tz.R;
import defpackage.ay0;
import defpackage.c0d;
import defpackage.e1i;
import defpackage.ej5;
import defpackage.ib5;
import defpackage.j8i0;
import defpackage.k00;
import defpackage.ku90;
import defpackage.o8i0;
import defpackage.pdd0;
import defpackage.psm;
import defpackage.rdd0;
import defpackage.s1k0;
import defpackage.s2k0;
import defpackage.s5y;
import defpackage.t1k0;
import defpackage.t340;
import defpackage.tje0;
import defpackage.u1k0;
import defpackage.uhc;
import defpackage.uj50;
import defpackage.uti;
import defpackage.v1b;
import defpackage.v340;
import defpackage.v5b;
import defpackage.vch0;
import defpackage.vu60;
import defpackage.wwd0;
import defpackage.x1b;
import defpackage.xwd0;
import defpackage.y5b;
import defpackage.zi50;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/sportybet/feature/loyalty/impl/notifications/presentation/worldcuppass/c;", "Lj8i0;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class c extends j8i0 {
    public final uti a;
    public final psm b;
    public final rdd0 c;
    public final t1k0 d;
    public final Long e;
    public final wwd0 f;
    public final v340 i;
    public final ku90<com.sportybet.feature.loyalty.impl.notifications.presentation.worldcuppass.b> v;
    public final t340 w;

    @c0d(c = "com.sportybet.feature.loyalty.impl.notifications.presentation.worldcuppass.WorldCupPassAnnouncementViewModel$1", f = "WorldCupPassAnnouncementViewModel.kt", l = {54}, m = "invokeSuspend", v = 2)
    public static final class a extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public wwd0 a;
        public c b;
        public t1k0 c;
        public int d;

        public a(v1b<? super a> v1bVar) {
            super(2, v1bVar);
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            return c.this.new a(v1bVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
            return ((a) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            c cVar;
            wwd0 wwd0Var;
            t1k0 t1k0Var;
            s1k0 s1k0Var;
            y5b y5bVar = y5b.a;
            int i = this.d;
            if (i == 0) {
                uj50.b(obj);
                cVar = c.this;
                wwd0 wwd0Var2 = cVar.f;
                t1k0 t1k0Var2 = cVar.d;
                this.a = wwd0Var2;
                this.b = cVar;
                this.c = t1k0Var2;
                this.d = 1;
                Object objY1 = cVar.y1(this);
                if (objY1 == y5bVar) {
                    return y5bVar;
                }
                obj = objY1;
                wwd0Var = wwd0Var2;
                t1k0Var = t1k0Var2;
            } else {
                if (i != 1) {
                    ib5.a("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                t1k0Var = this.c;
                cVar = this.b;
                wwd0Var = this.a;
                uj50.b(obj);
            }
            String str = (String) obj;
            cVar.getClass();
            int iOrdinal = t1k0Var.ordinal();
            if (iOrdinal == 0) {
                StringUiText stringUiText = vch0.a;
                s1k0Var = new s1k0(new ResourceUiText(R.string.page_loyalty__wc_pass_popup_invite_title), StringsKt.U(str) ? new ResourceUiText(R.string.world_cup_mission__wc_pass_bundle_tv_sub) : new ResourceUiText(R.string.page_loyalty__wc_pass_popup_invite_content, ay0.S(new Object[]{str})), StringsKt.U(str) ? new ResourceUiText(R.string.world_cup_mission__wc_pass_banner_cta_aria_pre_purchase) : new ResourceUiText(R.string.page_loyalty__wc_pass_popup_invite_cta, ay0.S(new Object[]{str})), false, 8);
            } else {
                if (iOrdinal != 1) {
                    uhc.a();
                    return null;
                }
                StringUiText stringUiText2 = vch0.a;
                s1k0Var = new s1k0(new ResourceUiText(R.string.page_loyalty__wc_pass_popup_complete_title), new ResourceUiText(R.string.page_loyalty__wc_pass_popup_complete_content), new ResourceUiText(R.string.page_loyalty__wc_pass_popup_complete_cta), true, 8);
            }
            wwd0Var.setValue(s1k0Var);
            return Unit.a;
        }
    }

    @c0d(c = "com.sportybet.feature.loyalty.impl.notifications.presentation.worldcuppass.WorldCupPassAnnouncementViewModel$emit$1", f = "WorldCupPassAnnouncementViewModel.kt", l = {143}, m = "invokeSuspend", v = 2)
    public static final class b extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ com.sportybet.feature.loyalty.impl.notifications.presentation.worldcuppass.b c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(com.sportybet.feature.loyalty.impl.notifications.presentation.worldcuppass.b bVar, v1b<? super b> v1bVar) {
            super(2, v1bVar);
            this.c = bVar;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            return c.this.new b(this.c, v1bVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
            return ((b) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            y5b y5bVar = y5b.a;
            int i = this.a;
            if (i == 0) {
                uj50.b(obj);
                ku90<com.sportybet.feature.loyalty.impl.notifications.presentation.worldcuppass.b> ku90Var = c.this.v;
                this.a = 1;
                if (ku90Var.a.emit(this.c, this) == y5bVar) {
                    return y5bVar;
                }
            } else {
                if (i != 1) {
                    ib5.a("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                uj50.b(obj);
            }
            return Unit.a;
        }
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0039  */
    public c(uti utiVar, psm psmVar, rdd0 rdd0Var, vu60 vu60Var) {
        Object bVar;
        t1k0 t1k0Var;
        pdd0 pdd0Var;
        psmVar.getClass();
        rdd0Var.getClass();
        vu60Var.getClass();
        this.a = utiVar;
        this.b = psmVar;
        this.c = rdd0Var;
        String str = (String) vu60Var.b("variant");
        if (str != null) {
            try {
                zi50.a aVar = zi50.b;
                bVar = t1k0.valueOf(str);
            } catch (Throwable th) {
                zi50.a aVar2 = zi50.b;
                bVar = new zi50.b(th);
            }
            t1k0Var = (t1k0) (bVar instanceof zi50.b ? null : bVar);
            t1k0Var = t1k0Var == null ? t1k0.b : t1k0Var;
        }
        this.d = t1k0Var;
        Long l = (Long) vu60Var.b("purchase_pay_total");
        this.e = (l == null || l.longValue() <= 0) ? null : l;
        wwd0 wwd0VarA = xwd0.a(new s1k0(null, null, null, false, 31));
        this.f = wwd0VarA;
        this.i = e1i.b(wwd0VarA);
        ku90<com.sportybet.feature.loyalty.impl.notifications.presentation.worldcuppass.b> ku90Var = new ku90<>();
        this.v = ku90Var;
        this.w = e1i.a(ku90Var);
        rdd0 rdd0Var2 = this.c;
        int iOrdinal = t1k0Var.ordinal();
        if (iOrdinal == 0) {
            pdd0Var = s2k0.h.a;
        } else {
            if (iOrdinal != 1) {
                uhc.a();
                throw null;
            }
            pdd0Var = s2k0.n.a;
        }
        rdd0Var2.a(pdd0Var, k00.d);
        ej5.c(o8i0.d(this), null, null, new a(null), 3);
    }

    public final void x1(com.sportybet.feature.loyalty.impl.notifications.presentation.worldcuppass.b bVar) {
        ej5.c(o8i0.d(this), null, null, new b(bVar, null), 3);
    }

    /* JADX WARN: Code duplicated, block: B:21:0x005a A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:23:0x005d A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object y1(x1b x1bVar) {
        u1k0 u1k0Var;
        if (x1bVar instanceof u1k0) {
            u1k0Var = (u1k0) x1bVar;
            int i = u1k0Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                u1k0Var.c = i - Integer.MIN_VALUE;
            } else {
                u1k0Var = new u1k0(this, x1bVar);
            }
        } else {
            u1k0Var = new u1k0(this, x1bVar);
        }
        Object objF = u1k0Var.a;
        y5b y5bVar = y5b.a;
        int i2 = u1k0Var.c;
        String str = null;
        if (i2 == 0) {
            uj50.b(objF);
            Long l = this.e;
            if (l != null) {
                String strE = s5y.e(new Long(l.longValue()));
                String strB = this.b.B();
                uti.a[] aVarArr = uti.a.a;
                u1k0Var.c = 1;
                objF = uti.f(this.a, strE, strB, u1k0Var);
                if (objF == y5bVar) {
                    return y5bVar;
                }
            }
            if (str == null) {
                return "";
            }
            return str;
        }
        if (i2 != 1) {
            ib5.a("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        uj50.b(objF);
        str = (String) objF;
        if (str == null) {
            return "";
        }
        return str;
    }

    public final void z1(com.sportybet.feature.loyalty.impl.notifications.presentation.worldcuppass.a aVar) {
        pdd0 pdd0Var;
        aVar.getClass();
        if (!aVar.equals(com.sportybet.feature.loyalty.impl.notifications.presentation.worldcuppass.a.C0397a.a)) {
            if (aVar.equals(com.sportybet.feature.loyalty.impl.notifications.presentation.worldcuppass.a.b.a)) {
                x1(com.sportybet.feature.loyalty.impl.notifications.presentation.worldcuppass.b.a.a);
                return;
            } else {
                uhc.a();
                return;
            }
        }
        t1k0 t1k0Var = this.d;
        int iOrdinal = t1k0Var.ordinal();
        if (iOrdinal == 0) {
            pdd0Var = s2k0.g.a;
        } else {
            if (iOrdinal != 1) {
                uhc.a();
                return;
            }
            pdd0Var = s2k0.m.a;
        }
        this.c.a(pdd0Var, k00.d);
        int iOrdinal2 = t1k0Var.ordinal();
        if (iOrdinal2 == 0) {
            x1(com.sportybet.feature.loyalty.impl.notifications.presentation.worldcuppass.b.c.a);
        } else if (iOrdinal2 == 1) {
            x1(com.sportybet.feature.loyalty.impl.notifications.presentation.worldcuppass.b.C0398b.a);
        } else {
            uhc.a();
        }
    }
}
