package com.sportybet.feature.payment.impl.common.presentation.activity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.activity.result.ActivityResult;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.compose.runtime.a;
import androidx.compose.ui.platform.ComposeView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import androidx.viewpager2.widget.ViewPager2;
import com.google.android.material.tabs.TabLayout;
import com.sporty.android.core.model.MyLog;
import com.sportybet.android.gp.tz.R;
import com.sportybet.feature.payment.impl.common.presentation.activity.TradingActivity;
import com.sportybet.feature.payment.impl.common.presentation.widget.PayTabLayout;
import com.sportybet.plugin.webcontainer.utils.WebViewActivityUtils;
import defpackage.a300;
import defpackage.apg0;
import defpackage.arr;
import defpackage.azd;
import defpackage.azm;
import defpackage.b1f0;
import defpackage.bag;
import defpackage.bb40;
import defpackage.bmy;
import defpackage.bpg0;
import defpackage.c0e;
import defpackage.ce;
import defpackage.cyb;
import defpackage.d900;
import defpackage.dnj0;
import defpackage.dq40;
import defpackage.drj0;
import defpackage.dzd;
import defpackage.e400;
import defpackage.ebs;
import defpackage.ee;
import defpackage.ej5;
import defpackage.f1i;
import defpackage.f4e;
import defpackage.f5e;
import defpackage.fq0;
import defpackage.fqd;
import defpackage.g1i;
import defpackage.gag;
import defpackage.grj0;
import defpackage.gyd;
import defpackage.h5e;
import defpackage.hqj0;
import defpackage.hwr;
import defpackage.ijj0;
import defpackage.irj0;
import defpackage.itf0;
import defpackage.iyd;
import defpackage.iym;
import defpackage.jq40;
import defpackage.jqd;
import defpackage.k7l;
import defpackage.log0;
import defpackage.lyh;
import defpackage.m1e;
import defpackage.mjj0;
import defpackage.mla;
import defpackage.mnj0;
import defpackage.mpe0;
import defpackage.nod;
import defpackage.o8i0;
import defpackage.op8;
import defpackage.opj0;
import defpackage.p5e;
import defpackage.p5m;
import defpackage.psm;
import defpackage.pwx;
import defpackage.q8i0;
import defpackage.q900;
import defpackage.qdd0;
import defpackage.qlr;
import defpackage.qpg0;
import defpackage.r2e;
import defpackage.r8i0;
import defpackage.rrr;
import defpackage.ryd;
import defpackage.s5e;
import defpackage.s9s;
import defpackage.sj5;
import defpackage.snj0;
import defpackage.sog0;
import defpackage.tj5;
import defpackage.tmj0;
import defpackage.to20;
import defpackage.tog0;
import defpackage.tud;
import defpackage.tyd;
import defpackage.ud;
import defpackage.uhc;
import defpackage.uog0;
import defpackage.usd;
import defpackage.v5e;
import defpackage.v8i0;
import defpackage.va00;
import defpackage.vog0;
import defpackage.vyd;
import defpackage.wae;
import defpackage.wfc0;
import defpackage.wh7;
import defpackage.wog0;
import defpackage.x5e;
import defpackage.xyd;
import defpackage.xym;
import defpackage.y200;
import defpackage.y300;
import defpackage.ye;
import defpackage.yog0;
import defpackage.yxd;
import defpackage.yxi;
import defpackage.z200;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import javax.net.ssl.SSLContext;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u00052\u00020\u0006:\u0002\t\nB\u0007¢\u0006\u0004\b\u0007\u0010\b¨\u0006\u000b"}, d2 = {"Lcom/sportybet/feature/payment/impl/common/presentation/activity/TradingActivity;", "Lpy1;", "Lpwx;", "Lxym;", "Lcom/google/android/material/tabs/TabLayout$d;", "Lto20;", "Lbb40;", "<init>", "()V", "a", "b", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class TradingActivity extends p5m implements pwx, xym, TabLayout.d, to20, bb40 {
    public static final /* synthetic */ int X = 0;
    public k7l A;
    public log0 b;
    public bag c;
    public ye d;
    public azm f;
    public d900 i;
    public q900 v;
    public va00 w;
    public iym y;
    public c0e z;
    public final mpe0 e = hwr.b(new wfc0(1));
    public final q8i0 B = new q8i0(jq40.a(e400.class), new x(), new m(), new i0());
    public final q8i0 C = new q8i0(jq40.a(qpg0.class), new e1(), new t0(), new g1());
    public final q8i0 D = new q8i0(jq40.a(irj0.class), new i1(), new h1(), new j1());
    public final q8i0 E = new q8i0(jq40.a(dnj0.class), new d(), new c(), new e());
    public final q8i0 F = new q8i0(jq40.a(mjj0.class), new g(), new f(), new h());
    public final q8i0 G = new q8i0(jq40.a(snj0.class), new j(), new i(), new k());
    public final q8i0 H = new q8i0(jq40.a(hqj0.class), new n(), new l(), new o());
    public final q8i0 I = new q8i0(jq40.a(r2e.class), new q(), new p(), new r());
    public final q8i0 J = new q8i0(jq40.a(x5e.class), new t(), new s(), new u());
    public final q8i0 K = new q8i0(jq40.a(tud.class), new w(), new v(), new y());
    public final q8i0 L = new q8i0(jq40.a(s5e.class), new a0(), new z(), new b0());
    public final q8i0 M = new q8i0(jq40.a(iyd.class), new d0(), new c0(), new e0());
    public final q8i0 N = new q8i0(jq40.a(tyd.class), new g0(), new f0(), new h0());
    public final q8i0 O = new q8i0(jq40.a(xyd.class), new k0(), new j0(), new l0());
    public final q8i0 P = new q8i0(jq40.a(dzd.class), new n0(), new m0(), new o0());
    public final q8i0 Q = new q8i0(jq40.a(jqd.class), new q0(), new p0(), new r0());
    public final q8i0 R = new q8i0(jq40.a(fqd.class), new u0(), new s0(), new v0());
    public final q8i0 S = new q8i0(jq40.a(f5e.class), new x0(), new w0(), new y0());
    public final q8i0 T = new q8i0(jq40.a(yxd.class), new a1(), new z0(), new b1());
    public final q8i0 U = new q8i0(jq40.a(qdd0.class), new d1(), new c1(), new f1());
    public final ee<Intent> V = registerForActivityResult(new ce(), new ud() { // from class: pog0
        @Override // defpackage.ud
        public final void a(Object obj) {
            int i2 = TradingActivity.X;
            ((ActivityResult) obj).getClass();
            qpg0 qpg0VarA1 = this.a.A1();
            ej5.c(o8i0.d(qpg0VarA1), null, null, new npg0(qpg0VarA1, null), 3);
        }
    });
    public final ee<Intent> W = registerForActivityResult(new ce(), new ud() { // from class: qog0
        @Override // defpackage.ud
        public final void a(Object obj) {
            int i2 = TradingActivity.X;
            ((ActivityResult) obj).getClass();
            qpg0 qpg0VarA1 = this.a.A1();
            ej5.c(o8i0.d(qpg0VarA1), null, null, new opg0(qpg0VarA1, null), 3);
        }
    });

    /* JADX INFO: loaded from: classes5.dex */
    public static final class a {
        public static Intent a(Context context, log0 log0Var) {
            Intent intent = new Intent(context, (Class<?>) TradingActivity.class);
            intent.putExtra("EXTRA_TRADE_TYPE", log0Var);
            return intent;
        }

        public static void b(Context context, Bundle bundle) {
            bundle.getClass();
            Intent intentA = a(context, log0.a);
            intentA.putExtras(bundle);
            Unit unit = Unit.a;
            context.startActivity(intentA);
        }
    }

    public static final class a0 extends qlr implements Function0<v8i0> {
        public a0() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final v8i0 invoke() {
            return TradingActivity.this.getViewModelStore();
        }
    }

    public static final class a1 extends qlr implements Function0<v8i0> {
        public a1() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final v8i0 invoke() {
            return TradingActivity.this.getViewModelStore();
        }
    }

    public static final class b extends yxi {
        public final List<y200> y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public b(fq0 fq0Var, List<? extends y200> list) {
            super(fq0Var);
            list.getClass();
            this.y = list;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.f
        public final int getItemCount() {
            return this.y.size();
        }

        @Override // defpackage.yxi
        public final Fragment k(int i) {
            y200 y200Var = this.y.get(i);
            if (y200Var instanceof y300) {
                y300 y300Var = (y300) y200Var;
                if (y300Var instanceof y300.b) {
                    return new tmj0();
                }
                if (y300Var instanceof y300.a) {
                    return new ijj0();
                }
                if (y300Var instanceof y300.c) {
                    return new mnj0();
                }
                if (y300Var instanceof y300.d) {
                    return new opj0();
                }
                uhc.a();
                return null;
            }
            if (!(y200Var instanceof a300)) {
                uhc.a();
                return null;
            }
            a300 a300Var = (a300) y200Var;
            if (a300Var instanceof a300.f) {
                return new m1e();
            }
            if (a300Var instanceof a300.i) {
                return new v5e();
            }
            if (a300Var instanceof a300.b) {
                return new usd();
            }
            if (a300Var instanceof a300.h) {
                return new p5e();
            }
            if (a300Var instanceof a300.d) {
                return new gyd();
            }
            if (a300Var instanceof a300.a) {
                return new nod();
            }
            if (a300Var instanceof a300.g) {
                return new f4e();
            }
            if (!(a300Var instanceof a300.e)) {
                uhc.a();
                return null;
            }
            a300.e eVar = (a300.e) y200Var;
            if (eVar instanceof a300.e.a) {
                return new ryd();
            }
            if (eVar instanceof a300.e.b) {
                return new vyd();
            }
            if (eVar instanceof a300.e.c) {
                return new azd();
            }
            uhc.a();
            return null;
        }
    }

    public static final class b0 extends qlr implements Function0<cyb> {
        public b0() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final cyb invoke() {
            return TradingActivity.this.getDefaultViewModelCreationExtras();
        }
    }

    public static final class b1 extends qlr implements Function0<cyb> {
        public b1() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final cyb invoke() {
            return TradingActivity.this.getDefaultViewModelCreationExtras();
        }
    }

    public static final class c extends qlr implements Function0<r8i0.c> {
        public c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final r8i0.c invoke() {
            return TradingActivity.this.getDefaultViewModelProviderFactory();
        }
    }

    public static final class c0 extends qlr implements Function0<r8i0.c> {
        public c0() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final r8i0.c invoke() {
            return TradingActivity.this.getDefaultViewModelProviderFactory();
        }
    }

    public static final class c1 extends qlr implements Function0<r8i0.c> {
        public c1() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final r8i0.c invoke() {
            return TradingActivity.this.getDefaultViewModelProviderFactory();
        }
    }

    public static final class d extends qlr implements Function0<v8i0> {
        public d() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final v8i0 invoke() {
            return TradingActivity.this.getViewModelStore();
        }
    }

    public static final class d0 extends qlr implements Function0<v8i0> {
        public d0() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final v8i0 invoke() {
            return TradingActivity.this.getViewModelStore();
        }
    }

    public static final class d1 extends qlr implements Function0<v8i0> {
        public d1() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final v8i0 invoke() {
            return TradingActivity.this.getViewModelStore();
        }
    }

    public static final class e extends qlr implements Function0<cyb> {
        public e() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final cyb invoke() {
            return TradingActivity.this.getDefaultViewModelCreationExtras();
        }
    }

    public static final class e0 extends qlr implements Function0<cyb> {
        public e0() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final cyb invoke() {
            return TradingActivity.this.getDefaultViewModelCreationExtras();
        }
    }

    public static final class e1 extends qlr implements Function0<v8i0> {
        public e1() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final v8i0 invoke() {
            return TradingActivity.this.getViewModelStore();
        }
    }

    public static final class f extends qlr implements Function0<r8i0.c> {
        public f() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final r8i0.c invoke() {
            return TradingActivity.this.getDefaultViewModelProviderFactory();
        }
    }

    public static final class f0 extends qlr implements Function0<r8i0.c> {
        public f0() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final r8i0.c invoke() {
            return TradingActivity.this.getDefaultViewModelProviderFactory();
        }
    }

    public static final class f1 extends qlr implements Function0<cyb> {
        public f1() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final cyb invoke() {
            return TradingActivity.this.getDefaultViewModelCreationExtras();
        }
    }

    public static final class g extends qlr implements Function0<v8i0> {
        public g() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final v8i0 invoke() {
            return TradingActivity.this.getViewModelStore();
        }
    }

    public static final class g0 extends qlr implements Function0<v8i0> {
        public g0() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final v8i0 invoke() {
            return TradingActivity.this.getViewModelStore();
        }
    }

    public static final class g1 extends qlr implements Function0<cyb> {
        public g1() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final cyb invoke() {
            return TradingActivity.this.getDefaultViewModelCreationExtras();
        }
    }

    public static final class h extends qlr implements Function0<cyb> {
        public h() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final cyb invoke() {
            return TradingActivity.this.getDefaultViewModelCreationExtras();
        }
    }

    public static final class h0 extends qlr implements Function0<cyb> {
        public h0() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final cyb invoke() {
            return TradingActivity.this.getDefaultViewModelCreationExtras();
        }
    }

    public static final class h1 extends qlr implements Function0<r8i0.c> {
        public h1() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final r8i0.c invoke() {
            return TradingActivity.this.getDefaultViewModelProviderFactory();
        }
    }

    public static final class i extends qlr implements Function0<r8i0.c> {
        public i() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final r8i0.c invoke() {
            return TradingActivity.this.getDefaultViewModelProviderFactory();
        }
    }

    public static final class i0 extends qlr implements Function0<cyb> {
        public i0() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final cyb invoke() {
            return TradingActivity.this.getDefaultViewModelCreationExtras();
        }
    }

    public static final class i1 extends qlr implements Function0<v8i0> {
        public i1() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final v8i0 invoke() {
            return TradingActivity.this.getViewModelStore();
        }
    }

    public static final class j extends qlr implements Function0<v8i0> {
        public j() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final v8i0 invoke() {
            return TradingActivity.this.getViewModelStore();
        }
    }

    public static final class j0 extends qlr implements Function0<r8i0.c> {
        public j0() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final r8i0.c invoke() {
            return TradingActivity.this.getDefaultViewModelProviderFactory();
        }
    }

    public static final class j1 extends qlr implements Function0<cyb> {
        public j1() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final cyb invoke() {
            return TradingActivity.this.getDefaultViewModelCreationExtras();
        }
    }

    public static final class k extends qlr implements Function0<cyb> {
        public k() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final cyb invoke() {
            return TradingActivity.this.getDefaultViewModelCreationExtras();
        }
    }

    public static final class k0 extends qlr implements Function0<v8i0> {
        public k0() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final v8i0 invoke() {
            return TradingActivity.this.getViewModelStore();
        }
    }

    public static final class l extends qlr implements Function0<r8i0.c> {
        public l() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final r8i0.c invoke() {
            return TradingActivity.this.getDefaultViewModelProviderFactory();
        }
    }

    public static final class l0 extends qlr implements Function0<cyb> {
        public l0() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final cyb invoke() {
            return TradingActivity.this.getDefaultViewModelCreationExtras();
        }
    }

    public static final class m extends qlr implements Function0<r8i0.c> {
        public m() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final r8i0.c invoke() {
            return TradingActivity.this.getDefaultViewModelProviderFactory();
        }
    }

    public static final class m0 extends qlr implements Function0<r8i0.c> {
        public m0() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final r8i0.c invoke() {
            return TradingActivity.this.getDefaultViewModelProviderFactory();
        }
    }

    public static final class n extends qlr implements Function0<v8i0> {
        public n() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final v8i0 invoke() {
            return TradingActivity.this.getViewModelStore();
        }
    }

    public static final class n0 extends qlr implements Function0<v8i0> {
        public n0() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final v8i0 invoke() {
            return TradingActivity.this.getViewModelStore();
        }
    }

    public static final class o extends qlr implements Function0<cyb> {
        public o() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final cyb invoke() {
            return TradingActivity.this.getDefaultViewModelCreationExtras();
        }
    }

    public static final class o0 extends qlr implements Function0<cyb> {
        public o0() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final cyb invoke() {
            return TradingActivity.this.getDefaultViewModelCreationExtras();
        }
    }

    public static final class p extends qlr implements Function0<r8i0.c> {
        public p() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final r8i0.c invoke() {
            return TradingActivity.this.getDefaultViewModelProviderFactory();
        }
    }

    public static final class p0 extends qlr implements Function0<r8i0.c> {
        public p0() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final r8i0.c invoke() {
            return TradingActivity.this.getDefaultViewModelProviderFactory();
        }
    }

    public static final class q extends qlr implements Function0<v8i0> {
        public q() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final v8i0 invoke() {
            return TradingActivity.this.getViewModelStore();
        }
    }

    public static final class q0 extends qlr implements Function0<v8i0> {
        public q0() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final v8i0 invoke() {
            return TradingActivity.this.getViewModelStore();
        }
    }

    public static final class r extends qlr implements Function0<cyb> {
        public r() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final cyb invoke() {
            return TradingActivity.this.getDefaultViewModelCreationExtras();
        }
    }

    public static final class r0 extends qlr implements Function0<cyb> {
        public r0() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final cyb invoke() {
            return TradingActivity.this.getDefaultViewModelCreationExtras();
        }
    }

    public static final class s extends qlr implements Function0<r8i0.c> {
        public s() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final r8i0.c invoke() {
            return TradingActivity.this.getDefaultViewModelProviderFactory();
        }
    }

    public static final class s0 extends qlr implements Function0<r8i0.c> {
        public s0() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final r8i0.c invoke() {
            return TradingActivity.this.getDefaultViewModelProviderFactory();
        }
    }

    public static final class t extends qlr implements Function0<v8i0> {
        public t() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final v8i0 invoke() {
            return TradingActivity.this.getViewModelStore();
        }
    }

    public static final class t0 extends qlr implements Function0<r8i0.c> {
        public t0() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final r8i0.c invoke() {
            return TradingActivity.this.getDefaultViewModelProviderFactory();
        }
    }

    public static final class u extends qlr implements Function0<cyb> {
        public u() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final cyb invoke() {
            return TradingActivity.this.getDefaultViewModelCreationExtras();
        }
    }

    public static final class u0 extends qlr implements Function0<v8i0> {
        public u0() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final v8i0 invoke() {
            return TradingActivity.this.getViewModelStore();
        }
    }

    public static final class v extends qlr implements Function0<r8i0.c> {
        public v() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final r8i0.c invoke() {
            return TradingActivity.this.getDefaultViewModelProviderFactory();
        }
    }

    public static final class v0 extends qlr implements Function0<cyb> {
        public v0() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final cyb invoke() {
            return TradingActivity.this.getDefaultViewModelCreationExtras();
        }
    }

    public static final class w extends qlr implements Function0<v8i0> {
        public w() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final v8i0 invoke() {
            return TradingActivity.this.getViewModelStore();
        }
    }

    public static final class w0 extends qlr implements Function0<r8i0.c> {
        public w0() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final r8i0.c invoke() {
            return TradingActivity.this.getDefaultViewModelProviderFactory();
        }
    }

    public static final class x extends qlr implements Function0<v8i0> {
        public x() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final v8i0 invoke() {
            return TradingActivity.this.getViewModelStore();
        }
    }

    public static final class x0 extends qlr implements Function0<v8i0> {
        public x0() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final v8i0 invoke() {
            return TradingActivity.this.getViewModelStore();
        }
    }

    public static final class y extends qlr implements Function0<cyb> {
        public y() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final cyb invoke() {
            return TradingActivity.this.getDefaultViewModelCreationExtras();
        }
    }

    public static final class y0 extends qlr implements Function0<cyb> {
        public y0() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final cyb invoke() {
            return TradingActivity.this.getDefaultViewModelCreationExtras();
        }
    }

    public static final class z extends qlr implements Function0<r8i0.c> {
        public z() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final r8i0.c invoke() {
            return TradingActivity.this.getDefaultViewModelProviderFactory();
        }
    }

    public static final class z0 extends qlr implements Function0<r8i0.c> {
        public z0() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final r8i0.c invoke() {
            return TradingActivity.this.getDefaultViewModelProviderFactory();
        }
    }

    @Override // com.google.android.material.tabs.TabLayout.c
    public final void A0(TabLayout.g gVar) {
    }

    public final qpg0 A1() {
        return (qpg0) this.C.getValue();
    }

    @Override // com.google.android.material.tabs.TabLayout.c
    public final void G(TabLayout.g gVar) {
        List<y200> list;
        y200 y200Var;
        if (gVar == null) {
            return;
        }
        ye yeVar = this.d;
        if (yeVar == null) {
            Intrinsics.n("binding");
            throw null;
        }
        TabLayout.g gVarK = yeVar.w.G.k(gVar.e);
        TabLayout.TabView tabView = gVarK != null ? gVarK.h : null;
        View childAt = tabView != null ? tabView.getChildAt(1) : null;
        TextView textView = childAt instanceof TextView ? (TextView) childAt : null;
        if (textView != null) {
            textView.setTypeface(textView.getTypeface(), 1);
        }
        z200 value = z1().x1().getValue();
        if (value == null || (list = value.a) == null || (y200Var = list.get(gVar.e)) == null) {
            return;
        }
        z1().z1(y200Var);
    }

    @Override // com.google.android.material.tabs.TabLayout.c
    public final void g0(TabLayout.g gVar) {
        if (gVar == null) {
            return;
        }
        ye yeVar = this.d;
        if (yeVar == null) {
            Intrinsics.n("binding");
            throw null;
        }
        TabLayout.g gVarK = yeVar.w.G.k(gVar.e);
        TabLayout.TabView tabView = gVarK != null ? gVarK.h : null;
        View childAt = tabView != null ? tabView.getChildAt(1) : null;
        TextView textView = childAt instanceof TextView ? (TextView) childAt : null;
        if (textView != null) {
            textView.setTypeface(textView.getTypeface(), 0);
        }
    }

    @Override // defpackage.r1k
    public final boolean onBackPressedCompat() {
        if (tj5.c(this)) {
            azm azmVar = this.f;
            if (azmVar == null) {
                Intrinsics.n("router");
                throw null;
            }
            azmVar.d(wae.ME);
        }
        finish();
        return true;
    }

    @Override // defpackage.py1, defpackage.r1k, defpackage.hrl, androidx.fragment.app.e, defpackage.rn8, defpackage.yn8, android.app.Activity
    public final void onCreate(Bundle bundle) throws Throwable {
        log0 log0Var;
        bag bagVarA;
        String cMSString;
        Intent intent;
        super.onCreate(bundle);
        Bundle extras = getIntent().getExtras();
        if (extras == null || (log0Var = (log0) sj5.b(extras, "EXTRA_TRADE_TYPE", log0.class)) == null) {
            throw new Throwable("No tradeType is not expected");
        }
        this.b = log0Var;
        View viewInflate = getLayoutInflater().inflate(R.layout.activity_trading, (ViewGroup) null, false);
        int i2 = R.id.back;
        ImageButton imageButton = (ImageButton) h5e.a(R.id.back, viewInflate);
        if (imageButton != null) {
            i2 = R.id.back_title;
            TextView textView = (TextView) h5e.a(R.id.back_title, viewInflate);
            if (textView != null) {
                i2 = R.id.coming_soon_container;
                View viewA = h5e.a(R.id.coming_soon_container, viewInflate);
                if (viewA != null) {
                    int i3 = R.id.coming_soon_content;
                    if (((TextView) h5e.a(R.id.coming_soon_content, viewA)) != null) {
                        i3 = R.id.coming_soon_icon;
                        if (((AppCompatImageView) h5e.a(R.id.coming_soon_icon, viewA)) != null) {
                            i3 = R.id.coming_soon_title;
                            if (((TextView) h5e.a(R.id.coming_soon_title, viewA)) != null) {
                                rrr rrrVar = new rrr((ConstraintLayout) viewA);
                                i2 = R.id.divider;
                                View viewA2 = h5e.a(R.id.divider, viewInflate);
                                if (viewA2 != null) {
                                    i2 = R.id.gray_list_hint_view;
                                    View viewA3 = h5e.a(R.id.gray_list_hint_view, viewInflate);
                                    if (viewA3 != null) {
                                        wh7 wh7VarA = wh7.a(viewA3);
                                        i2 = R.id.help_btn;
                                        ImageButton imageButton2 = (ImageButton) h5e.a(R.id.help_btn, viewInflate);
                                        if (imageButton2 != null) {
                                            i2 = R.id.home;
                                            ImageButton imageButton3 = (ImageButton) h5e.a(R.id.home, viewInflate);
                                            if (imageButton3 != null) {
                                                i2 = R.id.tab_container;
                                                PayTabLayout payTabLayout = (PayTabLayout) h5e.a(R.id.tab_container, viewInflate);
                                                if (payTabLayout != null) {
                                                    i2 = R.id.title_bar;
                                                    if (((RelativeLayout) h5e.a(R.id.title_bar, viewInflate)) != null) {
                                                        i2 = R.id.view_pager;
                                                        ViewPager2 viewPager2 = (ViewPager2) h5e.a(R.id.view_pager, viewInflate);
                                                        if (viewPager2 != null) {
                                                            i2 = R.id.withdraw_nin_dialog_compose_view;
                                                            ComposeView composeView = (ComposeView) h5e.a(R.id.withdraw_nin_dialog_compose_view, viewInflate);
                                                            if (composeView != null) {
                                                                ConstraintLayout constraintLayout = (ConstraintLayout) viewInflate;
                                                                this.d = new ye(constraintLayout, imageButton, textView, rrrVar, viewA2, wh7VarA, imageButton2, imageButton3, payTabLayout, viewPager2, composeView);
                                                                setContentView(constraintLayout);
                                                                log0 log0Var2 = this.b;
                                                                if (log0Var2 == null) {
                                                                    Intrinsics.n("tradeType");
                                                                    throw null;
                                                                }
                                                                int iOrdinal = log0Var2.ordinal();
                                                                if (iOrdinal == 0) {
                                                                    bagVarA = tj5.a(getIntent());
                                                                } else {
                                                                    if (iOrdinal != 1) {
                                                                        uhc.a();
                                                                        return;
                                                                    }
                                                                    bagVarA = gag.ME;
                                                                }
                                                                this.c = bagVarA;
                                                                if (bagVarA != null && (intent = getIntent()) != null) {
                                                                    intent.putExtra("EXTRA_ENTRANCE", bagVarA);
                                                                }
                                                                log0 log0Var3 = this.b;
                                                                if (log0Var3 == null) {
                                                                    Intrinsics.n("tradeType");
                                                                    throw null;
                                                                }
                                                                if (log0Var3 == log0.a) {
                                                                    c0e c0eVar = this.z;
                                                                    if (c0eVar == null) {
                                                                        Intrinsics.n("depositFlowStartHandler");
                                                                        throw null;
                                                                    }
                                                                    c0eVar.b();
                                                                }
                                                                ye yeVar = this.d;
                                                                if (yeVar == null) {
                                                                    Intrinsics.n("binding");
                                                                    throw null;
                                                                }
                                                                TextView textView2 = yeVar.c;
                                                                log0 log0Var4 = this.b;
                                                                if (log0Var4 == null) {
                                                                    Intrinsics.n("tradeType");
                                                                    throw null;
                                                                }
                                                                int iOrdinal2 = log0Var4.ordinal();
                                                                if (iOrdinal2 == 0) {
                                                                    cMSString = getCMSString(R.string.common_functions__deposit, new Object[0]);
                                                                } else {
                                                                    if (iOrdinal2 != 1) {
                                                                        uhc.a();
                                                                        return;
                                                                    }
                                                                    cMSString = getCMSString(R.string.common_functions__withdraw, new Object[0]);
                                                                }
                                                                textView2.setText(cMSString);
                                                                yeVar.w.G.a(this);
                                                                yeVar.y.c(new sog0(this));
                                                                yeVar.b.setOnClickListener(new View.OnClickListener() { // from class: mog0
                                                                    @Override // android.view.View.OnClickListener
                                                                    public final void onClick(View view) {
                                                                        int i4 = TradingActivity.X;
                                                                        TradingActivity tradingActivity = this.a;
                                                                        if (tj5.c(tradingActivity)) {
                                                                            azm azmVar = tradingActivity.f;
                                                                            if (azmVar == null) {
                                                                                Intrinsics.n("router");
                                                                                throw null;
                                                                            }
                                                                            azmVar.d(wae.ME);
                                                                        }
                                                                        tradingActivity.finish();
                                                                    }
                                                                });
                                                                yeVar.v.setOnClickListener(new View.OnClickListener() { // from class: nog0
                                                                    @Override // android.view.View.OnClickListener
                                                                    public final void onClick(View view) {
                                                                        int i4 = TradingActivity.X;
                                                                        azm azmVar = this.a.f;
                                                                        if (azmVar != null) {
                                                                            azmVar.d(wae.HOME);
                                                                        } else {
                                                                            Intrinsics.n("router");
                                                                            throw null;
                                                                        }
                                                                    }
                                                                });
                                                                yeVar.i.setOnClickListener(new View.OnClickListener() { // from class: oog0
                                                                    @Override // android.view.View.OnClickListener
                                                                    public final void onClick(View view) {
                                                                        TradingActivity tradingActivity = this.a;
                                                                        log0 log0Var5 = tradingActivity.b;
                                                                        if (log0Var5 == null) {
                                                                            Intrinsics.n("tradeType");
                                                                            throw null;
                                                                        }
                                                                        int iOrdinal3 = log0Var5.ordinal();
                                                                        if (iOrdinal3 == 0) {
                                                                            d900 d900Var = tradingActivity.i;
                                                                            if (d900Var != null) {
                                                                                azm.c(d900Var.b, bjb0.S(WebViewActivityUtils.URL_HOW_TO_PLAY_DEPOSIT), null, null, 6);
                                                                                return;
                                                                            } else {
                                                                                Intrinsics.n("paymentRouter");
                                                                                throw null;
                                                                            }
                                                                        }
                                                                        if (iOrdinal3 != 1) {
                                                                            uhc.a();
                                                                            return;
                                                                        }
                                                                        d900 d900Var2 = tradingActivity.i;
                                                                        if (d900Var2 != null) {
                                                                            azm.c(d900Var2.b, bjb0.S("/m/help#/how-to-play/others/how-to-withdraw"), null, null, 6);
                                                                        } else {
                                                                            Intrinsics.n("paymentRouter");
                                                                            throw null;
                                                                        }
                                                                    }
                                                                });
                                                                ye yeVar2 = this.d;
                                                                if (yeVar2 == null) {
                                                                    Intrinsics.n("binding");
                                                                    throw null;
                                                                }
                                                                mla.i(yeVar2.z, new op8(1228611971, new Function2() { // from class: rog0
                                                                    @Override // kotlin.jvm.functions.Function2
                                                                    public final Object invoke(Object obj, Object obj2) {
                                                                        a aVar = (a) obj;
                                                                        int iIntValue = ((Integer) obj2).intValue();
                                                                        int i4 = TradingActivity.X;
                                                                        int i5 = 1;
                                                                        int i6 = 2;
                                                                        if (aVar.q(iIntValue & 1, (iIntValue & 3) != 2)) {
                                                                            TradingActivity tradingActivity = this.a;
                                                                            irj0 irj0Var = (irj0) tradingActivity.D.getValue();
                                                                            boolean zA = aVar.A(tradingActivity);
                                                                            Object objY = aVar.y();
                                                                            a.C0041a.C0042a c0042a = a.C0041a.a;
                                                                            if (zA || objY == c0042a) {
                                                                                objY = new mhh(tradingActivity, i6);
                                                                                aVar.r(objY);
                                                                            }
                                                                            Function0 function0 = (Function0) objY;
                                                                            boolean zA2 = aVar.A(tradingActivity);
                                                                            Object objY2 = aVar.y();
                                                                            if (zA2 || objY2 == c0042a) {
                                                                                objY2 = new sxv(tradingActivity, i5);
                                                                                aVar.r(objY2);
                                                                            }
                                                                            Function0 function1 = (Function0) objY2;
                                                                            boolean zA3 = aVar.A(tradingActivity);
                                                                            Object objY3 = aVar.y();
                                                                            if (zA3 || objY3 == c0042a) {
                                                                                objY3 = new ohh(tradingActivity, 3);
                                                                                aVar.r(objY3);
                                                                            }
                                                                            Function0 function2 = (Function0) objY3;
                                                                            boolean zA4 = aVar.A(tradingActivity);
                                                                            Object objY4 = aVar.y();
                                                                            if (zA4 || objY4 == c0042a) {
                                                                                objY4 = new hhh(tradingActivity, i5);
                                                                                aVar.r(objY4);
                                                                            }
                                                                            noj0.c(null, function0, function1, function2, (Function0) objY4, irj0Var, aVar, 262144);
                                                                        } else {
                                                                            aVar.G();
                                                                        }
                                                                        return Unit.a;
                                                                    }
                                                                }, true));
                                                                e400 e400VarZ1 = z1();
                                                                log0 log0Var5 = this.b;
                                                                if (log0Var5 == null) {
                                                                    Intrinsics.n("tradeType");
                                                                    throw null;
                                                                }
                                                                e400VarZ1.e = log0Var5;
                                                                e400VarZ1.y1();
                                                                dq40 dq40Var = new dq40();
                                                                g1i g1iVar = new g1i(new uog0(new f1i(z1().x1()), dq40Var), new com.sportybet.feature.payment.impl.common.presentation.activity.a(this, dq40Var, null));
                                                                s9s lifecycle = getLifecycle();
                                                                lifecycle.getClass();
                                                                s9s.b bVar = s9s.b.d;
                                                                arr.a(g1iVar, lifecycle, bVar);
                                                                g1i g1iVar2 = new g1i(z1().v, new vog0(this, null));
                                                                s9s lifecycle2 = getLifecycle();
                                                                lifecycle2.getClass();
                                                                arr.a(g1iVar2, lifecycle2, bVar);
                                                                g1i g1iVar3 = new g1i((lyh) z1().w.getValue(), new wog0(this, null));
                                                                s9s lifecycle3 = getLifecycle();
                                                                lifecycle3.getClass();
                                                                arr.a(g1iVar3, lifecycle3, bVar);
                                                                g1i g1iVar4 = new g1i(new tog0(A1().C, this), new yog0(this, null));
                                                                s9s lifecycle4 = getLifecycle();
                                                                lifecycle4.getClass();
                                                                arr.a(g1iVar4, lifecycle4, bVar);
                                                                g1i g1iVar5 = new g1i(A1().E, new apg0(this, null));
                                                                s9s lifecycle5 = getLifecycle();
                                                                lifecycle5.getClass();
                                                                arr.a(g1iVar5, lifecycle5, bVar);
                                                                ej5.c(ebs.a(getLifecycle()), null, null, new bpg0(this, null), 3);
                                                                qpg0 qpg0VarA1 = A1();
                                                                log0 log0Var6 = this.b;
                                                                if (log0Var6 == null) {
                                                                    Intrinsics.n("tradeType");
                                                                    throw null;
                                                                }
                                                                qpg0VarA1.f = log0Var6;
                                                                qpg0VarA1.x1();
                                                                irj0 irj0Var = (irj0) this.D.getValue();
                                                                ej5.c(o8i0.d(irj0Var), null, null, new grj0(irj0Var, new drj0(), null), 3);
                                                                if (this.w == null) {
                                                                    Intrinsics.n("paymentUtils");
                                                                    throw null;
                                                                }
                                                                psm psmVar = b1f0.a;
                                                                ArrayList arrayList = new ArrayList();
                                                                try {
                                                                    arrayList.addAll(Arrays.asList(SSLContext.getDefault().getDefaultSSLParameters().getProtocols()));
                                                                } catch (NoSuchAlgorithmException e2) {
                                                                    itf0.a aVar = itf0.a;
                                                                    aVar.q(MyLog.TAG_COMMON);
                                                                    aVar.o(e2);
                                                                }
                                                                if (arrayList.contains("TLSv1.2") || !b1f0.a.x()) {
                                                                    return;
                                                                }
                                                                androidx.appcompat.app.b.a aVar2 = new androidx.appcompat.app.b.a(this);
                                                                aVar2.a(R.string.app_common__update_os_version_alert);
                                                                androidx.appcompat.app.b bVarCreate = aVar2.setPositiveButton(R.string.common_functions__ok, null).create();
                                                                bVarCreate.setCanceledOnTouchOutside(false);
                                                                bVarCreate.show();
                                                                return;
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                    bmy.a("Missing required view with ID: ".concat(viewA.getResources().getResourceName(i3)));
                    return;
                }
            }
        }
        bmy.a("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i2)));
    }

    @Override // defpackage.py1, defpackage.hrl, defpackage.fq0, androidx.fragment.app.e, android.app.Activity
    public final void onDestroy() {
        c0e c0eVar = this.z;
        if (c0eVar == null) {
            Intrinsics.n("depositFlowStartHandler");
            throw null;
        }
        c0eVar.a = 0L;
        super.onDestroy();
    }

    public final e400 z1() {
        return (e400) this.B.getValue();
    }
}
