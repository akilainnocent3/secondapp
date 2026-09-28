package com.sportybet.plugin.realsports.autobet.widget;

import android.content.Intent;
import android.os.Bundle;
import androidx.activity.result.ActivityResult;
import androidx.compose.runtime.a;
import com.sporty.android.common_ui.uitext.ResourceUiText;
import com.sporty.android.common_ui.uitext.StringUiText;
import com.sporty.android.core.model.OrderBetType;
import com.sportybet.android.gp.tz.R;
import com.sportybet.plugin.realsports.autobet.widget.AutoBetActivity;
import defpackage.aqe0;
import defpackage.ay0;
import defpackage.azm;
import defpackage.b5k;
import defpackage.c0d;
import defpackage.cb1;
import defpackage.ce;
import defpackage.cyb;
import defpackage.ebs;
import defpackage.ee;
import defpackage.ej5;
import defpackage.elf;
import defpackage.fb1;
import defpackage.g1i;
import defpackage.iu2;
import defpackage.jq40;
import defpackage.jrm;
import defpackage.kmn;
import defpackage.kzh;
import defpackage.l91;
import defpackage.m980;
import defpackage.o8i0;
import defpackage.op8;
import defpackage.q8i0;
import defpackage.qlr;
import defpackage.r8i0;
import defpackage.rlf;
import defpackage.t91;
import defpackage.tje0;
import defpackage.twb;
import defpackage.ud;
import defpackage.uhc;
import defpackage.uj50;
import defpackage.ukh0;
import defpackage.v1b;
import defpackage.v8i0;
import defpackage.vch0;
import defpackage.wwd0;
import defpackage.xll;
import defpackage.y5b;
import defpackage.zn8;
import defpackage.zpe0;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/sportybet/plugin/realsports/autobet/widget/AutoBetActivity;", "Lpy1;", "Lrlf;", "Liu2$a;", "<init>", "()V", "africa-bet-android"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class AutoBetActivity extends xll implements rlf, iu2.a {
    public static final /* synthetic */ int f = 0;
    public jrm b;
    public azm c;
    public final q8i0 d = new q8i0(jq40.a(fb1.class), new c(), new b(), new d());
    public final ee<Intent> e = registerForActivityResult(new ce(), new ud() { // from class: i51
        @Override // defpackage.ud
        public final void a(Object obj) {
            ActivityResult activityResult = (ActivityResult) obj;
            int i = AutoBetActivity.f;
            activityResult.getClass();
            if (activityResult.a == 2) {
                AutoBetActivity autoBetActivity = this.a;
                autoBetActivity.z1().X.setValue(t91.c.a);
                autoBetActivity.z1().A1(l91.Completed);
            }
        }
    });

    @c0d(c = "com.sportybet.plugin.realsports.autobet.widget.AutoBetActivity$onCreate$1", f = "AutoBetActivity.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class a extends tje0 implements Function2<Boolean, v1b<? super Unit>, Object> {
        public /* synthetic */ boolean a;

        public a(v1b<? super a> v1bVar) {
            super(2, v1bVar);
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            a aVar = AutoBetActivity.this.new a(v1bVar);
            aVar.a = ((Boolean) obj).booleanValue();
            return aVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Boolean bool, v1b<? super Unit> v1bVar) {
            Boolean bool2 = bool;
            bool2.booleanValue();
            return ((a) create(bool2, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            boolean z = this.a;
            y5b y5bVar = y5b.a;
            uj50.b(obj);
            AutoBetActivity autoBetActivity = AutoBetActivity.this;
            if (z) {
                jrm jrmVar = autoBetActivity.b;
                if (jrmVar == null) {
                    Intrinsics.n("betItem");
                    throw null;
                }
                jrmVar.m1(autoBetActivity);
            } else {
                if (z) {
                    uhc.a();
                    return null;
                }
                jrm jrmVar2 = autoBetActivity.b;
                if (jrmVar2 == null) {
                    Intrinsics.n("betItem");
                    throw null;
                }
                jrmVar2.j1(autoBetActivity);
            }
            return Unit.a;
        }
    }

    public static final class b extends qlr implements Function0<r8i0.c> {
        public b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final r8i0.c invoke() {
            return AutoBetActivity.this.getDefaultViewModelProviderFactory();
        }
    }

    public static final class c extends qlr implements Function0<v8i0> {
        public c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final v8i0 invoke() {
            return AutoBetActivity.this.getViewModelStore();
        }
    }

    public static final class d extends qlr implements Function0<cyb> {
        public d() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final cyb invoke() {
            return AutoBetActivity.this.getDefaultViewModelCreationExtras();
        }
    }

    /* JADX WARN: Code duplicated, block: B:66:0x016e  */
    /* JADX WARN: Code duplicated, block: B:67:0x0175  */
    @Override // iu2.a
    public final void C() {
        Object value;
        twb twbVarE1;
        kmn kmnVar;
        boolean z;
        ResourceUiText resourceUiText;
        ResourceUiText resourceUiText2;
        fb1 fb1VarZ1 = z1();
        wwd0 wwd0Var = fb1VarZ1.V;
        do {
            value = wwd0Var.getValue();
            twbVarE1 = (twb) value;
            if ((twbVarE1 instanceof twb.a) || (twbVarE1 instanceof twb.b)) {
                ukh0 ukh0Var = fb1VarZ1.f;
                OrderBetType orderBetType = fb1VarZ1.f0;
                if (orderBetType == null) {
                    orderBetType = OrderBetType.SINGLE;
                }
                OrderBetType orderBetType2 = orderBetType;
                ArrayList arrayListU = fb1VarZ1.b.U();
                int i = fb1VarZ1.H;
                String str = fb1VarZ1.O;
                double d2 = fb1VarZ1.L;
                ukh0Var.getClass();
                twbVarE1.getClass();
                orderBetType2.getClass();
                arrayListU.getClass();
                str.getClass();
                b5k b5kVar = ukh0Var.a;
                twb twbVarA = (b5k.a.a[orderBetType2.ordinal()] == 1 ? b5kVar.a : b5kVar.b).a(orderBetType2, arrayListU, i, str, d2);
                boolean z2 = twbVarE1 instanceof twb.a;
                if (z2) {
                    kmnVar = ((twb.a) twbVarE1).j;
                } else if (twbVarE1 instanceof twb.b) {
                    kmnVar = ((twb.b) twbVarE1).i;
                } else if (twbVarA instanceof twb.a) {
                    twbVarE1 = fb1.E1((twb.a) twbVarA);
                } else {
                    twbVarE1 = twbVarA;
                }
                kmn kmnVar2 = kmnVar;
                if (z2) {
                    z = ((twb.a) twbVarE1).l;
                } else {
                    if (!(twbVarE1 instanceof twb.b)) {
                        uhc.a();
                        return;
                    }
                    z = ((twb.b) twbVarE1).k;
                }
                boolean z3 = z;
                boolean z4 = twbVarA instanceof twb.a;
                if (z4 && z2) {
                    twb.a aVar = (twb.a) twbVarE1;
                    twb.a aVar2 = (twb.a) twbVarA;
                    m980 m980Var = aVar2.i;
                    String str2 = aVar2.f;
                    if (Intrinsics.g(m980Var, m980.a.a)) {
                        StringUiText stringUiText = vch0.a;
                        resourceUiText = new ResourceUiText(R.string.component_betslip__place_auto_bet);
                    } else if (Intrinsics.g(m980Var, m980.c.a) || Intrinsics.g(m980Var, m980.b.a)) {
                        StringUiText stringUiText2 = vch0.a;
                        resourceUiText = new ResourceUiText(R.string.component_betslip__the_selection_is_not_eligible);
                    } else {
                        if (Intrinsics.g(m980Var, m980.d.a)) {
                            Object[] objArr = {Integer.valueOf(i)};
                            StringUiText stringUiText3 = vch0.a;
                            resourceUiText2 = new ResourceUiText(R.string.component_betslip__auto_bet_exceed_max_days, ay0.S(objArr));
                        } else if (Intrinsics.g(m980Var, m980.f.a)) {
                            StringUiText stringUiText4 = vch0.a;
                            resourceUiText = new ResourceUiText(R.string.component_betslip__the_selection_is_suspended);
                        } else if (Intrinsics.g(m980Var, m980.g.a)) {
                            StringUiText stringUiText5 = vch0.a;
                            resourceUiText = new ResourceUiText(R.string.component_betslip__the_selection_is_unavailable);
                        } else if (!Intrinsics.g(m980Var, m980.e.a)) {
                            uhc.a();
                            return;
                        } else {
                            StringUiText stringUiText6 = vch0.a;
                            resourceUiText = new ResourceUiText(R.string.component_betslip__place_auto_bet);
                        }
                        twbVarA = twb.a.a(aVar, str2, null, m980Var, null, false, false, false, resourceUiText2, null, 57055);
                    }
                    resourceUiText2 = resourceUiText;
                    twbVarA = twb.a.a(aVar, str2, null, m980Var, null, false, false, false, resourceUiText2, null, 57055);
                } else if (z4) {
                    twbVarA = twb.a.a((twb.a) twbVarA, null, null, null, kmnVar2, false, z3, false, null, null, 62975);
                } else if (twbVarA instanceof twb.b) {
                    twbVarA = twb.b.a((twb.b) twbVarA, null, kmnVar2, false, z3, false, 62975);
                }
                if (twbVarA instanceof twb.a) {
                    twbVarE1 = fb1.E1((twb.a) twbVarA);
                } else {
                    twbVarE1 = twbVarA;
                }
            }
        } while (!wwd0Var.g(value, twbVarE1));
    }

    @Override // defpackage.py1, defpackage.r1k, defpackage.hrl, androidx.fragment.app.e, defpackage.rn8, defpackage.yn8, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        zpe0 zpe0Var = zpe0.a;
        elf.a(this, new aqe0(0, 0, 2, zpe0Var), new aqe0(0, 0, 2, zpe0Var));
        final boolean booleanExtra = getIntent().getBooleanExtra("extra_show_only_bet_list", true);
        final int intExtra = getIntent().getIntExtra("extra_tab_index", 1);
        int intExtra2 = getIntent().getIntExtra("extra_initial_filter", l91.Ongoing.a);
        z1().f0 = OrderBetType.INSTANCE.fromValue(OrderBetType.SINGLE.getValue());
        fb1 fb1VarZ1 = z1();
        ej5.c(o8i0.d(fb1VarZ1), fb1VarZ1.a, null, new cb1(fb1VarZ1, null), 2);
        fb1 fb1VarZ2 = z1();
        l91.d.getClass();
        fb1VarZ2.A1(l91.a.a(intExtra2));
        kzh.d(new g1i(z1().e0, new a(null)), ebs.a(getLifecycle()));
        zn8.a(this, new op8(2015791065, new Function2() { // from class: j51
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                a aVar = (a) obj;
                int iIntValue = ((Integer) obj2).intValue();
                int i = AutoBetActivity.f;
                if (aVar.q(iIntValue & 1, (iIntValue & 3) != 2)) {
                    final AutoBetActivity autoBetActivity = this.a;
                    final boolean z = booleanExtra;
                    final int i2 = intExtra;
                    o0z.a(null, null, null, null, null, pp8.b(1791623432, new Function2() { // from class: k51
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj3, Object obj4) {
                            a aVar2 = (a) obj3;
                            int iIntValue2 = ((Integer) obj4).intValue();
                            int i3 = AutoBetActivity.f;
                            int i4 = 0;
                            int i5 = 2;
                            if (aVar2.q(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                                AutoBetActivity autoBetActivity2 = autoBetActivity;
                                fb1 fb1VarZ3 = autoBetActivity2.z1();
                                boolean zA = aVar2.A(autoBetActivity2);
                                Object objY = aVar2.y();
                                a.C0041a.C0042a c0042a = a.C0041a.a;
                                if (zA || objY == c0042a) {
                                    objY = new l51(autoBetActivity2, i4);
                                    aVar2.r(objY);
                                }
                                Function0 function0 = (Function0) objY;
                                boolean zA2 = aVar2.A(autoBetActivity2);
                                Object objY2 = aVar2.y();
                                if (zA2 || objY2 == c0042a) {
                                    objY2 = new exe(autoBetActivity2, i5);
                                    aVar2.r(objY2);
                                }
                                Function0 function1 = (Function0) objY2;
                                boolean zA3 = aVar2.A(autoBetActivity2);
                                Object objY3 = aVar2.y();
                                if (zA3 || objY3 == c0042a) {
                                    objY3 = new m51(autoBetActivity2, i4);
                                    aVar2.r(objY3);
                                }
                                Function1 function2 = (Function1) objY3;
                                boolean zA4 = aVar2.A(autoBetActivity2);
                                Object objY4 = aVar2.y();
                                if (zA4 || objY4 == c0042a) {
                                    objY4 = new n51(autoBetActivity2, i4);
                                    aVar2.r(objY4);
                                }
                                Function0 function3 = (Function0) objY4;
                                boolean zA5 = aVar2.A(autoBetActivity2);
                                Object objY5 = aVar2.y();
                                if (zA5 || objY5 == c0042a) {
                                    objY5 = new o51(autoBetActivity2, i4);
                                    aVar2.r(objY5);
                                }
                                x61.b(fb1VarZ3, z, function0, function1, function2, function3, i2, (Function0) objY5, aVar2, 8);
                            } else {
                                aVar2.G();
                            }
                            return Unit.a;
                        }
                    }, aVar), aVar, 196608);
                } else {
                    aVar.G();
                }
                return Unit.a;
            }
        }, true));
    }

    @Override // defpackage.py1, defpackage.hrl, defpackage.fq0, androidx.fragment.app.e, android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        jrm jrmVar = this.b;
        if (jrmVar != null) {
            jrmVar.j1(this);
        } else {
            Intrinsics.n("betItem");
            throw null;
        }
    }

    @Override // defpackage.rn8, android.app.Activity
    public final void onNewIntent(Intent intent) {
        intent.getClass();
        super.onNewIntent(intent);
        int intExtra = intent.getIntExtra("extra_initial_filter", l91.Ongoing.a);
        z1().X.setValue(t91.c.a);
        fb1 fb1VarZ1 = z1();
        l91.d.getClass();
        fb1VarZ1.A1(l91.a.a(intExtra));
    }

    public final fb1 z1() {
        return (fb1) this.d.getValue();
    }
}
