package defpackage;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.InputFilter;
import android.text.method.DigitsKeyListener;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.compose.ui.platform.ComposeView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import androidx.work.impl.eLa.LhMGMAwwhzjwfz;
import com.google.android.material.snackbar.BaseTransientBottomBar;
import com.google.android.material.snackbar.Snackbar;
import com.sporty.android.common.uievent.AlertDialogCallbackType;
import com.sporty.android.common_ui.uitext.ResourceUiText;
import com.sporty.android.common_ui.uitext.UiText;
import com.sporty.android.common_ui.widgets.AspectRatioImageView;
import com.sporty.android.common_ui.widgets.ClearEditText;
import com.sporty.android.common_ui.widgets.LoadingViewNew;
import com.sporty.android.core.model.MyLog;
import com.sporty.android.core.model.ads.Ads;
import com.sporty.android.core.model.pocket.common.PayHintData;
import com.sportybet.android.account.RegistrationKYCWebViewActivity;
import com.sportybet.android.account.confirm.activity.NameBvnActivity;
import com.sportybet.android.bvn.VerifyBvnWithdrawActivity;
import com.sportybet.android.gp.tz.R;
import com.sportybet.android.widget.HintView;
import com.sportybet.android.widget.SimpleDescriptionListView;
import com.sportybet.feature.kyc.confirmAccountInfo.ConfirmAccountInfoActivity;
import com.sportybet.feature.payment.impl.security.nameupdate.presentation.activity.NameMismatchCSActivity;
import com.sportybet.feature.payment.impl.transaction.presentation.activity.TxSuccessActivity;
import com.sportybet.feature.payment.impl.transaction.presentation.model.TxSuccessParams;
import com.sportybet.plugin.realsports.search.widget.searchprematchpanel.SEfl.gvQvkPPtA;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes6.dex */
public abstract class s62 extends jml {
    public d900 A;
    public q900 B;
    public final q8i0 C;
    public final q8i0 D;
    public final q8i0 E;
    public Snackbar F;
    public bc6 G;
    public bc6 H;
    public bc6 I;
    public bc6 J;
    public bc6 K;
    public ee L;
    public ee<s8d0> M;
    public ee<f0i0> N;
    public ee<f0i0> O;
    public ee<yv40> P;
    public ee<tt40> Q;
    public ee<rt40> R;
    public ee<yt40> S;
    public com.sporty.android.common.uievent.e f;
    public gbn i;
    public d0n v;
    public iym w;
    public azm y;
    public va00 z;

    public static final class a implements lyh<Unit> {
        public final /* synthetic */ lyh[] a;
        public final /* synthetic */ s62 b;

        /* JADX INFO: renamed from: s62$a$a, reason: collision with other inner class name */
        @c0d(c = "com.sportybet.feature.payment.impl.common.presentation.fragment.BaseTradingFragment$initTradingViewModel$$inlined$combine$1", f = "BaseTradingFragment.kt", l = {109}, m = "collect", v = 2)
        public static final class C1079a extends x1b {
            public /* synthetic */ Object a;
            public int b;

            public C1079a(v1b v1bVar) {
                super(v1bVar);
            }

            @Override // defpackage.pz1
            public final Object invokeSuspend(Object obj) {
                this.a = obj;
                this.b |= Integer.MIN_VALUE;
                return a.this.collect(null, this);
            }
        }

        public static final class b implements Function0<tzs[]> {
            public final /* synthetic */ lyh[] a;

            public b(lyh[] lyhVarArr) {
                this.a = lyhVarArr;
            }

            @Override // kotlin.jvm.functions.Function0
            public final tzs[] invoke() {
                return new tzs[this.a.length];
            }
        }

        @c0d(c = "com.sportybet.feature.payment.impl.common.presentation.fragment.BaseTradingFragment$initTradingViewModel$$inlined$combine$1$3", f = "BaseTradingFragment.kt", l = {234}, m = "invokeSuspend", v = 2)
        public static final class c extends tje0 implements gaj<myh<? super Unit>, tzs[], v1b<? super Unit>, Object> {
            public int a;
            public /* synthetic */ myh b;
            public /* synthetic */ Object[] c;
            public final /* synthetic */ s62 d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public c(s62 s62Var, v1b v1bVar) {
                super(3, v1bVar);
                this.d = s62Var;
            }

            @Override // defpackage.gaj
            public final Object invoke(myh<? super Unit> myhVar, tzs[] tzsVarArr, v1b<? super Unit> v1bVar) {
                c cVar = new c(this.d, v1bVar);
                cVar.b = myhVar;
                cVar.c = tzsVarArr;
                return cVar.invokeSuspend(Unit.a);
            }

            @Override // defpackage.pz1
            public final Object invokeSuspend(Object obj) {
                y5b y5bVar = y5b.a;
                int i = this.a;
                if (i == 0) {
                    uj50.b(obj);
                    myh myhVar = this.b;
                    tzs[] tzsVarArr = (tzs[]) this.c;
                    SwipeRefreshLayout swipeRefreshLayoutG0 = this.d.G0();
                    if (swipeRefreshLayoutG0 != null) {
                        boolean z = false;
                        for (tzs tzsVar : tzsVarArr) {
                            if (tzsVar instanceof tzs.b) {
                                z = true;
                                break;
                            }
                        }
                        swipeRefreshLayoutG0.setRefreshing(z);
                    }
                    Unit unit = Unit.a;
                    this.b = null;
                    this.c = null;
                    this.a = 1;
                    if (myhVar.emit(unit, this) == y5bVar) {
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

        public a(lyh[] lyhVarArr, s62 s62Var) {
            this.a = lyhVarArr;
            this.b = s62Var;
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        @Override // defpackage.lyh
        public final Object collect(myh<? super Unit> myhVar, v1b v1bVar) {
            C1079a c1079a;
            if (v1bVar instanceof C1079a) {
                c1079a = (C1079a) v1bVar;
                int i = c1079a.b;
                if ((i & Integer.MIN_VALUE) != 0) {
                    c1079a.b = i - Integer.MIN_VALUE;
                } else {
                    c1079a = new C1079a(v1bVar);
                }
            } else {
                c1079a = new C1079a(v1bVar);
            }
            Object obj = c1079a.a;
            y5b y5bVar = y5b.a;
            int i2 = c1079a.b;
            if (i2 == 0) {
                uj50.b(obj);
                lyh[] lyhVarArr = this.a;
                b bVar = new b(lyhVarArr);
                c cVar = new c(this.b, null);
                c1079a.b = 1;
                if (r78.a(c1079a, myhVar, cVar, bVar, lyhVarArr) == y5bVar) {
                    return y5bVar;
                }
            } else {
                if (i2 != 1) {
                    ib5.a("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                uj50.b(obj);
            }
            return Unit.a;
        }
    }

    @c0d(c = "com.sportybet.feature.payment.impl.common.presentation.fragment.BaseTradingFragment$initTradingViewModel$2$10", f = "BaseTradingFragment.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class b extends tje0 implements Function2<tng0, v1b<? super Unit>, Object> {
        public /* synthetic */ Object a;

        public b(v1b<? super b> v1bVar) {
            super(2, v1bVar);
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            b bVar = s62.this.new b(v1bVar);
            bVar.a = obj;
            return bVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(tng0 tng0Var, v1b<? super Unit> v1bVar) {
            return ((b) create(tng0Var, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            tng0 tng0Var = (tng0) this.a;
            y5b y5bVar = y5b.a;
            uj50.b(obj);
            boolean z = tng0Var instanceof tng0.h;
            int i = 0;
            s62 s62Var = s62.this;
            if (z) {
                FragmentManager childFragmentManager = s62Var.getChildFragmentManager();
                childFragmentManager.getClass();
                tng0.h hVar = (tng0.h) tng0Var;
                String str = hVar.a;
                String str2 = hVar.b;
                t62 t62Var = new t62(tng0Var, i);
                str.getClass();
                childFragmentManager.n0("REQUEST_KEY_TRADE_ADDITIONAL_SMS", s62Var, new ykc(t62Var, childFragmentManager));
                ing0 ing0Var = new ing0();
                ing0Var.setArguments(vj5.a(new Pair("ARG_TRADE_ID", str), new Pair("ARG_SMS_TOKEN", str2)));
                ing0Var.show(childFragmentManager, ing0.class.getName());
            } else if (tng0Var instanceof tng0.i) {
                FragmentManager childFragmentManager2 = s62Var.getChildFragmentManager();
                childFragmentManager2.getClass();
                tng0.i iVar = (tng0.i) tng0Var;
                String str3 = iVar.a;
                String str4 = iVar.b;
                String str5 = iVar.c;
                String str6 = iVar.d;
                u62 u62Var = new u62(tng0Var, i);
                str3.getClass();
                childFragmentManager2.n0("REQUEST_KEY_TRADE_ADDITIONAL_UPSTREAM_SMS", s62Var, new nt80(childFragmentManager2, u62Var));
                eog0 eog0Var = new eog0();
                eog0Var.setArguments(vj5.a(new Pair("ARG_TRADE_ID", str3), new Pair("ARG_SMS_TOKEN", str4), new Pair("ARG_TARGET_PHONE_NUMBER", str5), new Pair("ARG_SMS_CODE", str6)));
                eog0Var.show(childFragmentManager2, eog0.class.getName());
            } else if (tng0Var instanceof tng0.c) {
                final FragmentManager childFragmentManager3 = s62Var.getChildFragmentManager();
                childFragmentManager3.getClass();
                tng0.c cVar = (tng0.c) tng0Var;
                String str7 = cVar.a;
                String str8 = cVar.b;
                final v62 v62Var = new v62(tng0Var, i);
                str7.getClass();
                str8.getClass();
                childFragmentManager3.n0("REQUEST_KEY_TRADE_ADDITIONAL_DIAL_OTP", s62Var, new qxi() { // from class: alg0
                    @Override // defpackage.qxi
                    public final void a(String str9, Bundle bundle) {
                        blg0.a.a(v62Var, childFragmentManager3, str9, bundle);
                    }
                });
                blg0 blg0Var = new blg0();
                blg0Var.setArguments(vj5.a(new Pair("ARG_TRADE_ID", str7), new Pair("ARG_DISPLAY_MSG", str8)));
                blg0Var.show(childFragmentManager3, blg0.class.getName());
            } else if (tng0Var instanceof tng0.g) {
                final FragmentManager childFragmentManager4 = s62Var.getChildFragmentManager();
                childFragmentManager4.getClass();
                tng0.g gVar = (tng0.g) tng0Var;
                String str9 = gVar.a;
                String str10 = gVar.b;
                String str11 = gVar.c;
                String str12 = gVar.d;
                final w62 w62Var = new w62(tng0Var, i);
                str9.getClass();
                childFragmentManager4.n0("REQUEST_KEY_TRADE_ADDITIONAL_SECOND_OTP", s62Var, new qxi() { // from class: xmg0
                    @Override // defpackage.qxi
                    public final void a(String str13, Bundle bundle) {
                        ymg0.a.a(w62Var, childFragmentManager4, str13, bundle);
                    }
                });
                ymg0 ymg0Var = new ymg0();
                ymg0Var.setArguments(vj5.a(new Pair("ARG_TRADE_ID", str9), new Pair("ARG_COUNTER_ICON_URL", str10), new Pair("ARG_COUNTER_AUTHORITY", str11), new Pair("ARG_COUNTER_PART", str12)));
                ymg0Var.show(childFragmentManager4, ymg0.class.getName());
            } else if (tng0Var instanceof tng0.d) {
                final FragmentManager childFragmentManager5 = s62Var.getChildFragmentManager();
                childFragmentManager5.getClass();
                String str13 = ((tng0.d) tng0Var).a;
                final x62 x62Var = new x62(tng0Var, i);
                str13.getClass();
                childFragmentManager5.n0("REQUEST_KEY_TRADE_ADDITIONAL_OTP", s62Var, new qxi() { // from class: nlg0
                    @Override // defpackage.qxi
                    public final void a(String str14, Bundle bundle) {
                        olg0.a.a(x62Var, childFragmentManager5, str14, bundle);
                    }
                });
                olg0 olg0Var = new olg0();
                olg0Var.setArguments(vj5.a(new Pair("ARG_TRADE_ID", str13)));
                olg0Var.show(childFragmentManager5, olg0.class.getName());
            } else if (tng0Var instanceof tng0.f) {
                final FragmentManager childFragmentManager6 = s62Var.getChildFragmentManager();
                childFragmentManager6.getClass();
                String str14 = ((tng0.f) tng0Var).a;
                final y62 y62Var = new y62(tng0Var, i);
                str14.getClass();
                childFragmentManager6.n0("REQUEST_KEY_TRADE_ADDITIONAL_PIN", s62Var, new qxi() { // from class: lmg0
                    @Override // defpackage.qxi
                    public final void a(String str15, Bundle bundle) {
                        mmg0.a.a(y62Var, childFragmentManager6, str15, bundle);
                    }
                });
                mmg0 mmg0Var = new mmg0();
                mmg0Var.setArguments(vj5.a(new Pair("ARG_TRADE_ID", str14)));
                mmg0Var.show(childFragmentManager6, mmg0.class.getName());
            } else if (tng0Var instanceof tng0.e) {
                final FragmentManager childFragmentManager7 = s62Var.getChildFragmentManager();
                childFragmentManager7.getClass();
                String str15 = ((tng0.e) tng0Var).a;
                final z62 z62Var = new z62(tng0Var, i);
                str15.getClass();
                childFragmentManager7.n0("REQUEST_KEY_TRADE_ADDITIONAL_PHONE", s62Var, new qxi() { // from class: zlg0
                    @Override // defpackage.qxi
                    public final void a(String str16, Bundle bundle) {
                        amg0.a.a(z62Var, childFragmentManager7, str16, bundle);
                    }
                });
                amg0 amg0Var = new amg0();
                amg0Var.setArguments(vj5.a(new Pair("ARG_TRADE_ID", str15)));
                amg0Var.show(childFragmentManager7, amg0.class.getName());
            } else if (tng0Var instanceof tng0.a) {
                final FragmentManager childFragmentManager8 = s62Var.getChildFragmentManager();
                childFragmentManager8.getClass();
                String str16 = ((tng0.a) tng0Var).a;
                final a72 a72Var = new a72(tng0Var, i);
                str16.getClass();
                childFragmentManager8.n0("REQUEST_KEY_TRADE_ADDITIONAL_BIRTHDAY", s62Var, new qxi() { // from class: gkg0
                    @Override // defpackage.qxi
                    public final void a(String str17, Bundle bundle) {
                        hkg0.a.a(a72Var, childFragmentManager8, str17, bundle);
                    }
                });
                hkg0 hkg0Var = new hkg0();
                hkg0Var.setArguments(vj5.a(new Pair("ARG_TRADE_ID", str16)));
                hkg0Var.show(childFragmentManager8, hkg0.class.getName());
            } else {
                if (!(tng0Var instanceof tng0.b)) {
                    uhc.a();
                    return null;
                }
                final FragmentManager childFragmentManager9 = s62Var.getChildFragmentManager();
                childFragmentManager9.getClass();
                String str17 = ((tng0.b) tng0Var).a;
                final b72 b72Var = new b72(tng0Var, i);
                str17.getClass();
                childFragmentManager9.n0("REQUEST_KEY_TRADE_ADDITIONAL_CHECK_HOLDING", s62Var, new qxi() { // from class: pkg0
                    @Override // defpackage.qxi
                    public final void a(String str18, Bundle bundle) {
                        qkg0.a.a(b72Var, childFragmentManager9, str18, bundle);
                    }
                });
                qkg0 qkg0Var = new qkg0();
                qkg0Var.setArguments(vj5.a(new Pair("ARG_TRADE_ID", str17)));
                qkg0Var.show(childFragmentManager9, qkg0.class.getName());
            }
            return Unit.a;
        }
    }

    @c0d(c = "com.sportybet.feature.payment.impl.common.presentation.fragment.BaseTradingFragment$initTradingViewModel$2$11", f = "BaseTradingFragment.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class c extends tje0 implements Function2<wne0, v1b<? super Unit>, Object> {
        public /* synthetic */ Object a;

        public c(v1b<? super c> v1bVar) {
            super(2, v1bVar);
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            c cVar = s62.this.new c(v1bVar);
            cVar.a = obj;
            return cVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(wne0 wne0Var, v1b<? super Unit> v1bVar) {
            return ((c) create(wne0Var, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            Object next;
            wne0 wne0Var = (wne0) this.a;
            y5b y5bVar = y5b.a;
            uj50.b(obj);
            xne0 xne0VarH0 = s62.this.H0();
            wne0Var.getClass();
            wwd0 wwd0Var = xne0VarH0.b;
            wwd0Var.getClass();
            wwd0Var.k(null, wne0Var);
            Iterator<T> it = wne0Var.a.iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (!((aoe0) next).b());
            aoe0 aoe0Var = (aoe0) next;
            xne0VarH0.i = aoe0Var != null ? aoe0Var.getId() : null;
            return Unit.a;
        }
    }

    @c0d(c = "com.sportybet.feature.payment.impl.common.presentation.fragment.BaseTradingFragment$initTradingViewModel$2$12", f = "BaseTradingFragment.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class d extends tje0 implements Function2<Ads, v1b<? super Unit>, Object> {
        public /* synthetic */ Object a;

        public d(v1b<? super d> v1bVar) {
            super(2, v1bVar);
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            d dVar = s62.this.new d(v1bVar);
            dVar.a = obj;
            return dVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Ads ads, v1b<? super Unit> v1bVar) {
            return ((d) create(ads, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            String imgUrl;
            final Ads ads = (Ads) this.a;
            y5b y5bVar = y5b.a;
            uj50.b(obj);
            final s62 s62Var = s62.this;
            AspectRatioImageView aspectRatioImageViewR0 = s62Var.r0();
            if (aspectRatioImageViewR0 == null) {
                return Unit.a;
            }
            String linkUrl = ads.getLinkUrl();
            if (linkUrl == null || StringsKt.U(linkUrl) || (imgUrl = ads.getImgUrl()) == null || StringsKt.U(imgUrl)) {
                aspectRatioImageViewR0.setVisibility(8);
                return Unit.a;
            }
            aspectRatioImageViewR0.setVisibility(0);
            gbn gbnVar = s62Var.i;
            if (gbnVar == null) {
                Intrinsics.n("imageService");
                throw null;
            }
            gbnVar.a(ads.getImgUrl(), aspectRatioImageViewR0);
            aspectRatioImageViewR0.setOnClickListener(new View.OnClickListener() { // from class: c72
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    String linkUrl2 = ads.getLinkUrl();
                    if (linkUrl2 != null) {
                        azm.c(s62Var.F0(), linkUrl2, null, null, 6);
                    }
                }
            });
            return Unit.a;
        }
    }

    @c0d(c = "com.sportybet.feature.payment.impl.common.presentation.fragment.BaseTradingFragment$initTradingViewModel$2$13", f = "BaseTradingFragment.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class e extends tje0 implements Function2<pdd0, v1b<? super Unit>, Object> {
        public /* synthetic */ Object a;
        public final /* synthetic */ k72 c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(k72 k72Var, v1b<? super e> v1bVar) {
            super(2, v1bVar);
            this.c = k72Var;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            e eVar = s62.this.new e(this.c, v1bVar);
            eVar.a = obj;
            return eVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(pdd0 pdd0Var, v1b<? super Unit> v1bVar) {
            return ((e) create(pdd0Var, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            pdd0 pdd0Var = (pdd0) this.a;
            y5b y5bVar = y5b.a;
            uj50.b(obj);
            boolean z = pdd0Var instanceof ygj0;
            k72 k72Var = this.c;
            s62 s62Var = s62.this;
            if (z) {
                iym iymVar = s62Var.w;
                if (iymVar == null) {
                    Intrinsics.n("openTelemetryLogger");
                    throw null;
                }
                gym.a(iymVar, ygj0.e((ygj0) pdd0Var, tj5.b(s62Var), k72Var.B1().b()));
            } else if (pdd0Var instanceof qnd) {
                iym iymVar2 = s62Var.w;
                if (iymVar2 == null) {
                    Intrinsics.n("openTelemetryLogger");
                    throw null;
                }
                gym.a(iymVar2, qnd.e((qnd) pdd0Var, tj5.b(s62Var), k72Var.B1().b(), null, null, null, null, 16373));
            }
            return Unit.a;
        }
    }

    @c0d(c = "com.sportybet.feature.payment.impl.common.presentation.fragment.BaseTradingFragment$initTradingViewModel$2$1", f = "BaseTradingFragment.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class f extends tje0 implements Function2<wgn, v1b<? super Unit>, Object> {
        public /* synthetic */ Object a;

        public f(v1b<? super f> v1bVar) {
            super(2, v1bVar);
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            f fVar = s62.this.new f(v1bVar);
            fVar.a = obj;
            return fVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(wgn wgnVar, v1b<? super Unit> v1bVar) {
            return ((f) create(wgnVar, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            wgn wgnVar = (wgn) this.a;
            y5b y5bVar = y5b.a;
            uj50.b(obj);
            boolean zG = Intrinsics.g(wgnVar, wgn.c.a);
            s62 s62Var = s62.this;
            if (zG) {
                s62Var.v0().setVisibility(0);
                LoadingViewNew loadingViewNewU0 = s62Var.u0();
                if (loadingViewNewU0 != null) {
                    loadingViewNewU0.setVisibility(8);
                }
            } else if (Intrinsics.g(wgnVar, wgn.b.a)) {
                s62Var.v0().setVisibility(8);
                LoadingViewNew loadingViewNewU1 = s62Var.u0();
                if (loadingViewNewU1 != null) {
                    loadingViewNewU1.setVisibility(8);
                }
            } else {
                if (!(wgnVar instanceof wgn.a)) {
                    uhc.a();
                    return null;
                }
                s62Var.v0().setVisibility(8);
                LoadingViewNew loadingViewNewU2 = s62Var.u0();
                if (loadingViewNewU2 != null) {
                    UiText uiText = ((wgn.a) wgnVar).a;
                    Context contextRequireContext = s62Var.requireContext();
                    contextRequireContext.getClass();
                    loadingViewNewU2.c(uiText.e(contextRequireContext));
                }
            }
            return Unit.a;
        }
    }

    @c0d(c = "com.sportybet.feature.payment.impl.common.presentation.fragment.BaseTradingFragment$initTradingViewModel$2$2", f = "BaseTradingFragment.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class g extends tje0 implements Function2<tzs, v1b<? super Unit>, Object> {
        public /* synthetic */ Object a;

        public g(v1b<? super g> v1bVar) {
            super(2, v1bVar);
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            g gVar = s62.this.new g(v1bVar);
            gVar.a = obj;
            return gVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(tzs tzsVar, v1b<? super Unit> v1bVar) {
            return ((g) create(tzsVar, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            tzs tzsVar = (tzs) this.a;
            y5b y5bVar = y5b.a;
            uj50.b(obj);
            boolean zG = Intrinsics.g(tzsVar, tzs.b.a);
            s62 s62Var = s62.this;
            if (zG) {
                s62Var.w0().setVisibility(0);
            } else {
                if (!Intrinsics.g(tzsVar, tzs.a.a)) {
                    uhc.a();
                    return null;
                }
                s62Var.w0().setVisibility(8);
            }
            return Unit.a;
        }
    }

    @c0d(c = "com.sportybet.feature.payment.impl.common.presentation.fragment.BaseTradingFragment$initTradingViewModel$2$3", f = "BaseTradingFragment.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class h extends tje0 implements Function2<tzs, v1b<? super Unit>, Object> {
        public /* synthetic */ Object a;

        public h(v1b<? super h> v1bVar) {
            super(2, v1bVar);
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            h hVar = s62.this.new h(v1bVar);
            hVar.a = obj;
            return hVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(tzs tzsVar, v1b<? super Unit> v1bVar) {
            return ((h) create(tzsVar, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            tzs tzsVar = (tzs) this.a;
            y5b y5bVar = y5b.a;
            uj50.b(obj);
            boolean zG = Intrinsics.g(tzsVar, tzs.b.a);
            s62 s62Var = s62.this;
            if (zG) {
                s62Var.o0().setVisibility(0);
            } else {
                if (!Intrinsics.g(tzsVar, tzs.a.a)) {
                    uhc.a();
                    return null;
                }
                s62Var.o0().setVisibility(8);
            }
            return Unit.a;
        }
    }

    @c0d(c = "com.sportybet.feature.payment.impl.common.presentation.fragment.BaseTradingFragment$initTradingViewModel$2$4", f = "BaseTradingFragment.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class i extends tje0 implements Function2<BigDecimal, v1b<? super Unit>, Object> {
        public /* synthetic */ Object a;

        public i(v1b<? super i> v1bVar) {
            super(2, v1bVar);
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            i iVar = s62.this.new i(v1bVar);
            iVar.a = obj;
            return iVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(BigDecimal bigDecimal, v1b<? super Unit> v1bVar) {
            return ((i) create(bigDecimal, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            BigDecimal bigDecimal = (BigDecimal) this.a;
            y5b y5bVar = y5b.a;
            uj50.b(obj);
            s62 s62Var = s62.this;
            Iterator<T> it = s62Var.m0().iterator();
            while (it.hasNext()) {
                ((ClearEditText) it.next()).setHint(sn5.d(s62Var, R.string.page_payment__min_vnum, n4d.a(bigDecimal)));
            }
            return Unit.a;
        }
    }

    @c0d(c = "com.sportybet.feature.payment.impl.common.presentation.fragment.BaseTradingFragment$initTradingViewModel$2$5", f = "BaseTradingFragment.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class j extends tje0 implements Function2<xyx, v1b<? super Unit>, Object> {
        public /* synthetic */ Object a;

        public j(v1b<? super j> v1bVar) {
            super(2, v1bVar);
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            j jVar = s62.this.new j(v1bVar);
            jVar.a = obj;
            return jVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(xyx xyxVar, v1b<? super Unit> v1bVar) {
            return ((j) create(xyxVar, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            xyx xyxVar = (xyx) this.a;
            y5b y5bVar = y5b.a;
            uj50.b(obj);
            Iterator<T> it = s62.this.m0().iterator();
            while (it.hasNext()) {
                ow.b((ClearEditText) it.next(), xyxVar);
            }
            return Unit.a;
        }
    }

    @c0d(c = "com.sportybet.feature.payment.impl.common.presentation.fragment.BaseTradingFragment$initTradingViewModel$2$6", f = "BaseTradingFragment.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class k extends tje0 implements Function2<PayHintData, v1b<? super Unit>, Object> {
        public /* synthetic */ Object a;

        public k(v1b<? super k> v1bVar) {
            super(2, v1bVar);
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            k kVar = s62.this.new k(v1bVar);
            kVar.a = obj;
            return kVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(PayHintData payHintData, v1b<? super Unit> v1bVar) {
            return ((k) create(payHintData, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            PayHintData payHintData = (PayHintData) this.a;
            y5b y5bVar = y5b.a;
            uj50.b(obj);
            s62 s62Var = s62.this;
            if (!s62Var.P0().B1().a()) {
                String str = payHintData.alert;
                if (str == null || str.length() == 0) {
                    HintView hintViewD0 = s62Var.D0();
                    if (hintViewD0 != null) {
                        hintViewD0.setVisibility(8);
                    }
                } else {
                    HintView hintViewD1 = s62Var.D0();
                    if (hintViewD1 != null) {
                        hintViewD1.setVisibility(0);
                    }
                    HintView hintViewD2 = s62Var.D0();
                    if (hintViewD2 != null) {
                        hintViewD2.setHint(payHintData.alert);
                    }
                }
            }
            List<String> list = payHintData.descriptionLines;
            if (list == null || list.isEmpty()) {
                SimpleDescriptionListView simpleDescriptionListViewT0 = s62Var.t0();
                if (simpleDescriptionListViewT0 != null) {
                    simpleDescriptionListViewT0.setVisibility(8);
                }
            } else {
                SimpleDescriptionListView simpleDescriptionListViewT1 = s62Var.t0();
                if (simpleDescriptionListViewT1 != null) {
                    simpleDescriptionListViewT1.setDescriptionList(list);
                }
                SimpleDescriptionListView simpleDescriptionListViewT2 = s62Var.t0();
                if (simpleDescriptionListViewT2 != null) {
                    simpleDescriptionListViewT2.setVisibility(0);
                }
            }
            return Unit.a;
        }
    }

    @c0d(c = "com.sportybet.feature.payment.impl.common.presentation.fragment.BaseTradingFragment$initTradingViewModel$2$7", f = "BaseTradingFragment.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class l extends tje0 implements Function2<com.sporty.android.common.uievent.a, v1b<? super Unit>, Object> {
        public /* synthetic */ Object a;

        public static final class a extends BaseTransientBottomBar.f<Snackbar> {
            public final /* synthetic */ s62 a;
            public final /* synthetic */ com.sporty.android.common.uievent.a b;

            public a(s62 s62Var, com.sporty.android.common.uievent.a aVar) {
                this.a = s62Var;
                this.b = aVar;
            }

            @Override // com.google.android.material.snackbar.BaseTransientBottomBar.f
            public final void a(BaseTransientBottomBar baseTransientBottomBar, int i) {
                ArrayList arrayList;
                Snackbar snackbar = this.a.F;
                if (snackbar != null && (arrayList = snackbar.s) != null) {
                    arrayList.remove(this);
                }
                ((com.sporty.android.common.uievent.a.m) this.b).getClass();
            }
        }

        public l(v1b<? super l> v1bVar) {
            super(2, v1bVar);
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            l lVar = s62.this.new l(v1bVar);
            lVar.a = obj;
            return lVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(com.sporty.android.common.uievent.a aVar, v1b<? super Unit> v1bVar) {
            return ((l) create(aVar, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            com.sporty.android.common.uievent.a aVar = (com.sporty.android.common.uievent.a) this.a;
            y5b y5bVar = y5b.a;
            uj50.b(obj);
            boolean z = aVar instanceof com.sporty.android.common.uievent.a.m;
            s62 s62Var = s62.this;
            if (z) {
                Context context = s62Var.getContext();
                if (context != null) {
                    if (((Boolean) s62Var.H0().f.getValue()).booleanValue()) {
                        xne0 xne0VarH0 = s62Var.H0();
                        UiText uiText = ((com.sporty.android.common.uievent.a.m) aVar).a;
                        uiText.getClass();
                        xne0VarH0.d.a(new vne0.f(uiText));
                    } else {
                        Snackbar snackbar = s62Var.F;
                        if (snackbar != null) {
                            snackbar.b(3);
                        }
                        FrameLayout frameLayoutE0 = s62Var.E0();
                        if (frameLayoutE0 == null) {
                            return Unit.a;
                        }
                        h3a0 h3a0Var = new h3a0(frameLayoutE0);
                        com.sporty.android.common.uievent.a.m mVar = (com.sporty.android.common.uievent.a.m) aVar;
                        String string = mVar.a.e(context).toString();
                        string.getClass();
                        h3a0Var.b = string;
                        UiText uiText2 = mVar.b;
                        h3a0Var.c = uiText2 != null ? uiText2.e(context) : null;
                        h3a0Var.d = new d72(aVar, 0);
                        h3a0Var.f = mVar.d;
                        Snackbar snackbarB = h3a0Var.b(context, mVar.e, mVar.f);
                        s62Var.F = snackbarB;
                        if (snackbarB != null) {
                            a aVar2 = new a(s62Var, aVar);
                            ArrayList arrayList = snackbarB.s;
                            if (arrayList == null) {
                                arrayList = new ArrayList();
                                snackbarB.s = arrayList;
                            }
                            arrayList.add(aVar2);
                        }
                        Snackbar snackbar2 = s62Var.F;
                        if (snackbar2 != null) {
                            snackbar2.j();
                        }
                    }
                }
            } else {
                s62Var.s0().d(aVar, s62Var, s62Var.E0(), null);
            }
            return Unit.a;
        }
    }

    /* JADX INFO: loaded from: classes2.dex */
    @c0d(c = "com.sportybet.feature.payment.impl.common.presentation.fragment.BaseTradingFragment$initTradingViewModel$2$8", f = "BaseTradingFragment.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class m extends tje0 implements Function2<spg0, v1b<? super Unit>, Object> {
        public /* synthetic */ Object a;

        public m(v1b<? super m> v1bVar) {
            super(2, v1bVar);
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            m mVar = s62.this.new m(v1bVar);
            mVar.a = obj;
            return mVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(spg0 spg0Var, v1b<? super Unit> v1bVar) {
            return ((m) create(spg0Var, v1bVar)).invokeSuspend(Unit.a);
        }

        /* JADX WARN: Code duplicated, block: B:20:0x00b3  */
        /* JADX WARN: Code duplicated, block: B:25:0x00ca  */
        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            List<y200> list;
            androidx.fragment.app.e activity;
            String string;
            String string2;
            spg0 spg0Var = (spg0) this.a;
            y5b y5bVar = y5b.a;
            uj50.b(obj);
            boolean z = spg0Var instanceof spg0.l;
            s62 s62Var = s62.this;
            if (z) {
                FragmentManager childFragmentManager = s62Var.getChildFragmentManager();
                if (childFragmentManager != null) {
                    final spg0.l lVar = (spg0.l) spg0Var;
                    int i = vpg0.a;
                    lq70.a.a(childFragmentManager, s62Var, lVar.a, lVar.b, lVar.c, lVar.d, lVar.e, lVar.f, lVar.g, new Function1() { // from class: tpg0
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj2) {
                            AlertDialogCallbackType alertDialogCallbackType = (AlertDialogCallbackType) obj2;
                            alertDialogCallbackType.getClass();
                            Function1<AlertDialogCallbackType, Unit> function1 = lVar.h;
                            if (function1 != null) {
                                function1.invoke(alertDialogCallbackType);
                            }
                            return Unit.a;
                        }
                    });
                }
            } else if (spg0Var instanceof spg0.m) {
                boolean z2 = ((spg0.m) spg0Var).a;
                sne0 sne0Var = new sne0();
                sne0Var.setArguments(vj5.a(new Pair("is_expanded", Boolean.valueOf(z2))));
                sne0Var.show(s62Var.getChildFragmentManager(), sne0.class.getSimpleName());
            } else if (spg0Var instanceof spg0.a) {
                s62Var.H0().x1();
            } else {
                fag fagVar = null;
                if (spg0Var instanceof spg0.n) {
                    spg0.n nVar = (spg0.n) spg0Var;
                    hqx hqxVar = nVar.d;
                    ResourceUiText resourceUiText = nVar.a;
                    Context contextRequireContext = s62Var.requireContext();
                    contextRequireContext.getClass();
                    String string3 = resourceUiText.e(contextRequireContext).toString();
                    ResourceUiText resourceUiText2 = nVar.b;
                    Context contextRequireContext2 = s62Var.requireContext();
                    contextRequireContext2.getClass();
                    String string4 = resourceUiText2.e(contextRequireContext2).toString();
                    boolean z3 = nVar.c;
                    if (hqxVar != null) {
                        ResourceUiText resourceUiText3 = hqxVar.a;
                        Context contextRequireContext3 = s62Var.requireContext();
                        contextRequireContext3.getClass();
                        CharSequence charSequenceE = resourceUiText3.e(contextRequireContext3);
                        if (charSequenceE != null) {
                            string = charSequenceE.toString();
                        } else {
                            string = null;
                        }
                    } else {
                        string = null;
                    }
                    if (hqxVar != null) {
                        ResourceUiText resourceUiText4 = hqxVar.b;
                        Context contextRequireContext4 = s62Var.requireContext();
                        contextRequireContext4.getClass();
                        CharSequence charSequenceE2 = resourceUiText4.e(contextRequireContext4);
                        if (charSequenceE2 != null) {
                            string2 = charSequenceE2.toString();
                        } else {
                            string2 = null;
                        }
                    } else {
                        string2 = null;
                    }
                    String str = hqxVar != null ? "PREF_KEY_NEW_FEATURE_HINT_SET_DEFAULT" : null;
                    string3.getClass();
                    string4.getClass();
                    loe0 loe0Var = new loe0();
                    loe0Var.setArguments(vj5.a(new Pair("ARG_TITLE_TEXT_STRING", string3), new Pair("ARG_ADD_NEW_BTN_TEXT_STRING", string4), new Pair("ARG_ADD_NEW_BTN_ENABLED", Boolean.valueOf(z3)), new Pair("ARG_NEW_FEATURE_HINT_TITLE_TEXT_STRING", string), new Pair("ARG_NEW_FEATURE_HINT_CONTENT_TEXT_STRING", string2), new Pair("ARG_NEW_FEATURE_HINT_PREF_KEY", str)));
                    loe0Var.show(s62Var.getChildFragmentManager(), loe0.class.getSimpleName());
                } else if (spg0Var instanceof spg0.f) {
                    b900 b900VarZ0 = s62Var.z0();
                    Context contextRequireContext5 = s62Var.requireContext();
                    contextRequireContext5.getClass();
                    aqg0 aqg0Var = ((spg0.f) spg0Var).a;
                    int i2 = aqg0Var.a;
                    if (aqg0Var instanceof aqg0.e) {
                        fagVar = fag.D_PENDING_POPUP;
                    } else if (aqg0Var instanceof aqg0.j) {
                        fagVar = fag.W_PENDING_POPUP;
                    }
                    ((d900) b900VarZ0).f(contextRequireContext5, i2, fagVar);
                    androidx.fragment.app.e activity2 = s62Var.getActivity();
                    if (activity2 != null && !activity2.isFinishing() && (activity = s62Var.getActivity()) != null) {
                        activity.finish();
                    }
                } else {
                    boolean z4 = false;
                    z4 = false;
                    if (spg0Var instanceof spg0.g) {
                        androidx.fragment.app.e activity3 = s62Var.getActivity();
                        if (activity3 != null) {
                            int i3 = TxSuccessActivity.A;
                            TxSuccessParams txSuccessParams = ((spg0.g) spg0Var).a;
                            Intent intent = s62Var.requireActivity().getIntent();
                            if (intent != null && intent.getBooleanExtra("EXTRA_FROM_GAME", false)) {
                                z4 = true;
                            }
                            TxSuccessActivity.a.a(activity3, txSuccessParams, z4);
                        }
                    } else if (Intrinsics.g(spg0Var, spg0.j.a)) {
                        s62Var.i();
                    } else if (spg0Var instanceof spg0.k) {
                        b900 b900VarZ1 = s62Var.z0();
                        FragmentManager childFragmentManager2 = s62Var.getChildFragmentManager();
                        childFragmentManager2.getClass();
                        ((d900) b900VarZ1).h(childFragmentManager2, s62Var, ((spg0.k) spg0Var).a, new e72(spg0Var, z4 ? 1 : 0), null);
                    } else if (Intrinsics.g(spg0Var, spg0.b.a)) {
                        s62Var.F0().d(wae.HOME);
                    } else if (Intrinsics.g(spg0Var, spg0.c.a)) {
                        s62Var.F0().d(wae.ME);
                    } else if (spg0Var instanceof spg0.d) {
                        d0n d0nVar = s62Var.v;
                        if (d0nVar == null) {
                            Intrinsics.n("utils");
                            throw null;
                        }
                        androidx.fragment.app.e eVarRequireActivity = s62Var.requireActivity();
                        eVarRequireActivity.getClass();
                        d0nVar.b(eVarRequireActivity, snb0.ME);
                    } else if (Intrinsics.g(spg0Var, spg0.e.a)) {
                        z200 value = s62Var.y0().x1().getValue();
                        if (value != null && (list = value.a) != null) {
                            ArrayList arrayList = new ArrayList();
                            for (Object obj2 : list) {
                                if (obj2 instanceof a300.i) {
                                    arrayList.add(obj2);
                                }
                            }
                            a300.i iVar = (a300.i) CollectionsKt.firstOrNull(arrayList);
                            if (iVar != null) {
                                s62Var.y0().z1(iVar);
                            }
                        }
                    } else if (spg0Var instanceof spg0.h) {
                        Context contextRequireContext6 = s62Var.requireContext();
                        contextRequireContext6.getClass();
                        UiText uiText = ((spg0.h) spg0Var).a;
                        Context contextRequireContext7 = s62Var.requireContext();
                        contextRequireContext7.getClass();
                        vxo.b(contextRequireContext6, uiText.e(contextRequireContext7).toString());
                    } else {
                        if (!(spg0Var instanceof spg0.i)) {
                            uhc.a();
                            return null;
                        }
                        UiText uiText2 = ((spg0.i) spg0Var).a;
                        Context contextRequireContext8 = s62Var.requireContext();
                        contextRequireContext8.getClass();
                        String string5 = uiText2.e(contextRequireContext8).toString();
                        try {
                            s62Var.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(string5)));
                        } catch (Exception e) {
                            itf0.a aVar = itf0.a;
                            aVar.q(MyLog.TAG_COMMON);
                            aVar.p(e, gvQvkPPtA.Apk, string5);
                        }
                    }
                }
            }
            return Unit.a;
        }
    }

    @c0d(c = "com.sportybet.feature.payment.impl.common.presentation.fragment.BaseTradingFragment$initTradingViewModel$2$9", f = "BaseTradingFragment.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class n extends tje0 implements Function2<m480, v1b<? super Unit>, Object> {
        public /* synthetic */ Object a;

        public n(v1b<? super n> v1bVar) {
            super(2, v1bVar);
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            n nVar = s62.this.new n(v1bVar);
            nVar.a = obj;
            return nVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(m480 m480Var, v1b<? super Unit> v1bVar) {
            return ((n) create(m480Var, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            m480 m480Var = (m480) this.a;
            y5b y5bVar = y5b.a;
            uj50.b(obj);
            boolean z = m480Var instanceof m480.e;
            int i = 0;
            s62 s62Var = s62.this;
            if (z) {
                s62Var.G = ((m480.e) m480Var).a;
                s62Var.z0();
                FragmentManager childFragmentManager = s62Var.getChildFragmentManager();
                childFragmentManager.getClass();
                f72 f72Var = new f72(s62Var, i);
                if (childFragmentManager.H("SportyPinDialog") == null) {
                    a92.b bVar = new a92.b(R.string.page_withdraw__set_up_sporty_pin, R.string.page_withdraw__your_account_isnt_protected_by_a_sporty_pin_tip);
                    bVar.k = true;
                    bVar.j = true;
                    bVar.b = R.string.page_withdraw__set_up;
                    bVar.c = 0;
                    bVar.i = R.drawable.ic_security;
                    bVar.o = R.dimen.transfer_layout_height;
                    bVar.n = R.dimen.transfer_layout_width;
                    bVar.m = R.dimen.withdraw_set_up_icon;
                    bVar.l = R.dimen.withdraw_set_up_icon;
                    bVar.g = new j8d0(f72Var, null);
                    a92.j0(bVar).show(childFragmentManager, "SportyPinDialog");
                    iym iymVar = s62Var.w;
                    if (iymVar == null) {
                        Intrinsics.n("openTelemetryLogger");
                        throw null;
                    }
                    gym.a(iymVar, new xm80(0));
                    Unit unit = Unit.a;
                }
            } else if (m480Var instanceof m480.a) {
                ((d900) s62Var.z0()).e(((m480.a) m480Var).a);
            } else if (Intrinsics.g(m480Var, m480.b.a)) {
                s62Var.startActivity(new Intent(s62Var.getContext(), (Class<?>) NameMismatchCSActivity.class));
            } else if (m480Var instanceof m480.k) {
                m480.k kVar = (m480.k) m480Var;
                s62Var.H = kVar.b;
                ee<s8d0> eeVar = s62Var.M;
                if (eeVar == null) {
                    Intrinsics.n("verifySportyPinLauncher");
                    throw null;
                }
                eeVar.b(kVar.a);
            } else if (m480Var instanceof m480.l) {
                m480.l lVar = (m480.l) m480Var;
                s62Var.I = lVar.b;
                ee<f0i0> eeVar2 = s62Var.N;
                if (eeVar2 == null) {
                    Intrinsics.n("withdrawOtpLauncher");
                    throw null;
                }
                eeVar2.b(lVar.a);
            } else if (m480Var instanceof m480.i) {
                m480.i iVar = (m480.i) m480Var;
                s62Var.I = iVar.b;
                ee<f0i0> eeVar3 = s62Var.O;
                if (eeVar3 == null) {
                    Intrinsics.n("depositMomoPrimaryPhoneOtpLauncher");
                    throw null;
                }
                eeVar3.b(iVar.a);
            } else if (m480Var instanceof m480.f) {
                asx.a aVar = asx.b;
                final FragmentManager childFragmentManager2 = s62Var.getChildFragmentManager();
                childFragmentManager2.getClass();
                final g72 g72Var = new g72(m480Var);
                aVar.getClass();
                childFragmentManager2.n0("REQUEST_KEY_SHOW_NAME_BINDING_DIALOG", s62Var, new qxi() { // from class: zrx
                    @Override // defpackage.qxi
                    public final void a(String str, Bundle bundle) {
                        asx.a.a(g72Var, childFragmentManager2, str, bundle);
                    }
                });
                new asx().show(childFragmentManager2, asx.class.getName());
            } else if (m480Var instanceof m480.c) {
                m480.c cVar = (m480.c) m480Var;
                s62Var.J = cVar.c;
                lcx lcxVar = ((ncx) s62Var.P0().Y.a.getValue()).a;
                if (Intrinsics.g(lcxVar, lcx.e.a)) {
                    ee<yv40> eeVar4 = s62Var.P;
                    if (eeVar4 == null) {
                        Intrinsics.n("registerSimpleKycLauncher");
                        throw null;
                    }
                    String str = cVar.a;
                    ResourceUiText resourceUiText = cVar.b;
                    Context contextRequireContext = s62Var.requireContext();
                    contextRequireContext.getClass();
                    eeVar4.b(new yv40(str, resourceUiText.e(contextRequireContext).toString()));
                } else if (Intrinsics.g(lcxVar, lcx.a.a)) {
                    ee<rt40> eeVar5 = s62Var.R;
                    if (eeVar5 == null) {
                        Intrinsics.n("registerBvnLauncher");
                        throw null;
                    }
                    eeVar5.b(new rt40(0));
                } else if (Intrinsics.g(lcxVar, lcx.b.a)) {
                    ee<yt40> eeVar6 = s62Var.S;
                    if (eeVar6 == null) {
                        Intrinsics.n("registerNinLauncher");
                        throw null;
                    }
                    eeVar6.b(yt40.a);
                } else {
                    boolean zG = Intrinsics.g(lcxVar, lcx.d.a);
                    bc6 bc6Var = s62Var.J;
                    if (zG) {
                        if (bc6Var != null) {
                            if (bc6Var.p() instanceof bzx) {
                                zi50.a aVar2 = zi50.b;
                                bc6Var.resumeWith(mcx.c.a);
                            } else {
                                itf0.a aVar3 = itf0.a;
                                aVar3.q(MyLog.TAG_COMMON);
                                aVar3.n("Continuation not active, resume not perform.", new Object[0]);
                            }
                        }
                    } else if (bc6Var != null) {
                        if (bc6Var.p() instanceof bzx) {
                            zi50.a aVar4 = zi50.b;
                            bc6Var.resumeWith(mcx.a.a);
                        } else {
                            itf0.a aVar5 = itf0.a;
                            aVar5.q(MyLog.TAG_COMMON);
                            aVar5.n("Continuation not active, resume not perform.", new Object[0]);
                        }
                    }
                }
            } else if (m480Var instanceof m480.d) {
                m480.d dVar = (m480.d) m480Var;
                s62Var.K = dVar.b;
                ee<tt40> eeVar7 = s62Var.Q;
                if (eeVar7 == null) {
                    Intrinsics.n("registerBvnWithWithdrawTradeLauncher");
                    throw null;
                }
                eeVar7.b(dVar.a);
            } else if (m480Var instanceof m480.g) {
                b900 b900VarZ0 = s62Var.z0();
                androidx.fragment.app.e eVarRequireActivity = s62Var.requireActivity();
                eVarRequireActivity.getClass();
                ((d900) b900VarZ0).c(eVarRequireActivity, ((m480.g) m480Var).a);
            } else {
                if (!(m480Var instanceof m480.j)) {
                    uhc.a();
                    return null;
                }
                b900 b900VarZ1 = s62Var.z0();
                androidx.fragment.app.e eVarRequireActivity2 = s62Var.requireActivity();
                eVarRequireActivity2.getClass();
                ((d900) b900VarZ1).d(eVarRequireActivity2);
            }
            return Unit.a;
        }
    }

    public static final class o extends qlr implements Function0<v8i0> {
        public o() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final v8i0 invoke() {
            return s62.this.requireActivity().getViewModelStore();
        }
    }

    public static final class p extends qlr implements Function0<cyb> {
        public p() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final cyb invoke() {
            return s62.this.requireActivity().getDefaultViewModelCreationExtras();
        }
    }

    public static final class q extends qlr implements Function0<r8i0.c> {
        public q() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final r8i0.c invoke() {
            return s62.this.requireActivity().getDefaultViewModelProviderFactory();
        }
    }

    public static final class r extends qlr implements Function0<v8i0> {
        public r() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final v8i0 invoke() {
            return s62.this.requireActivity().getViewModelStore();
        }
    }

    public static final class s extends qlr implements Function0<cyb> {
        public s() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final cyb invoke() {
            return s62.this.requireActivity().getDefaultViewModelCreationExtras();
        }
    }

    public static final class t extends qlr implements Function0<r8i0.c> {
        public t() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final r8i0.c invoke() {
            return s62.this.requireActivity().getDefaultViewModelProviderFactory();
        }
    }

    public static final class u extends qlr implements Function0<Fragment> {
        public u() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Fragment invoke() {
            return s62.this;
        }
    }

    public static final class v extends qlr implements Function0<w8i0> {
        public final /* synthetic */ u a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public v(u uVar) {
            super(0);
            this.a = uVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public final w8i0 invoke() {
            return (w8i0) this.a.invoke();
        }
    }

    public static final class w extends qlr implements Function0<v8i0> {
        public final /* synthetic */ ttr a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public w(ttr ttrVar) {
            super(0);
            this.a = ttrVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public final v8i0 invoke() {
            return ((w8i0) this.a.getValue()).getViewModelStore();
        }
    }

    public static final class x extends qlr implements Function0<cyb> {
        public final /* synthetic */ ttr a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public x(ttr ttrVar) {
            super(0);
            this.a = ttrVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public final cyb invoke() {
            w8i0 w8i0Var = (w8i0) this.a.getValue();
            iel ielVar = w8i0Var instanceof iel ? (iel) w8i0Var : null;
            return ielVar != null ? ielVar.getDefaultViewModelCreationExtras() : cyb.a.b;
        }
    }

    public static final class y extends qlr implements Function0<r8i0.c> {
        public final /* synthetic */ ttr b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public y(ttr ttrVar) {
            super(0);
            this.b = ttrVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public final r8i0.c invoke() {
            r8i0.c defaultViewModelProviderFactory;
            w8i0 w8i0Var = (w8i0) this.b.getValue();
            iel ielVar = w8i0Var instanceof iel ? (iel) w8i0Var : null;
            return (ielVar == null || (defaultViewModelProviderFactory = ielVar.getDefaultViewModelProviderFactory()) == null) ? s62.this.getDefaultViewModelProviderFactory() : defaultViewModelProviderFactory;
        }
    }

    public s62(int i2) {
        super(i2);
        this.C = new q8i0(jq40.a(qpg0.class), new o(), new q(), new p());
        this.D = new q8i0(jq40.a(e400.class), new r(), new t(), new s());
        ttr ttrVarA = hwr.a(a1s.c, new v(new u()));
        this.E = new q8i0(jq40.a(xne0.class), new w(ttrVarA), new y(ttrVarA), new x(ttrVarA));
    }

    public final p900 C0() {
        q900 q900Var = this.B;
        if (q900Var != null) {
            return q900Var;
        }
        Intrinsics.n("paymentSecurityUtil");
        throw null;
    }

    public abstract HintView D0();

    public abstract FrameLayout E0();

    public final azm F0() {
        azm azmVar = this.y;
        if (azmVar != null) {
            return azmVar;
        }
        Intrinsics.n("router");
        throw null;
    }

    public abstract SwipeRefreshLayout G0();

    public final xne0 H0() {
        return (xne0) this.E.getValue();
    }

    public final qpg0 I0() {
        return (qpg0) this.C.getValue();
    }

    /* JADX INFO: renamed from: J0 */
    public abstract k72 P0();

    public void K0() {
        a aVar = new a(new lyh[]{P0().F, I0().v, y0().z}, this);
        s9s lifecycle = getLifecycle();
        lifecycle.getClass();
        s9s.b bVar = s9s.b.d;
        arr.a(aVar, lifecycle, bVar);
        k72 k72VarP0 = P0();
        g1i g1iVar = new g1i(k72VarP0.D, new f(null));
        s9s lifecycle2 = getLifecycle();
        lifecycle2.getClass();
        arr.a(g1iVar, lifecycle2, bVar);
        g1i g1iVar2 = new g1i(k72VarP0.J, new g(null));
        s9s lifecycle3 = getLifecycle();
        lifecycle3.getClass();
        arr.a(g1iVar2, lifecycle3, bVar);
        g1i g1iVar3 = new g1i(k72VarP0.H, new h(null));
        s9s lifecycle4 = getLifecycle();
        lifecycle4.getClass();
        arr.a(g1iVar3, lifecycle4, bVar);
        g1i g1iVar4 = new g1i(k72VarP0.y1(), new i(null));
        s9s lifecycle5 = getLifecycle();
        lifecycle5.getClass();
        arr.a(g1iVar4, lifecycle5, bVar);
        g1i g1iVar5 = new g1i(k72VarP0.T, new j(null));
        s9s lifecycle6 = getLifecycle();
        lifecycle6.getClass();
        arr.a(g1iVar5, lifecycle6, bVar);
        g1i g1iVar6 = new g1i(new f1i(k72VarP0.O), new k(null));
        s9s lifecycle7 = getLifecycle();
        lifecycle7.getClass();
        arr.a(g1iVar6, lifecycle7, bVar);
        g1i g1iVar7 = new g1i(k72VarP0.i, new l(null));
        s9s lifecycle8 = getLifecycle();
        lifecycle8.getClass();
        arr.a(g1iVar7, lifecycle8, bVar);
        g1i g1iVar8 = new g1i(k72VarP0.w, new m(null));
        s9s lifecycle9 = getLifecycle();
        lifecycle9.getClass();
        arr.a(g1iVar8, lifecycle9, bVar);
        g1i g1iVar9 = new g1i(k72VarP0.z, new n(null));
        s9s lifecycle10 = getLifecycle();
        lifecycle10.getClass();
        arr.a(g1iVar9, lifecycle10, bVar);
        g1i g1iVar10 = new g1i(k72VarP0.B, new b(null));
        s9s lifecycle11 = getLifecycle();
        lifecycle11.getClass();
        arr.a(g1iVar10, lifecycle11, bVar);
        g1i g1iVar11 = new g1i(k72VarP0.V, new c(null));
        s9s lifecycle12 = getLifecycle();
        lifecycle12.getClass();
        arr.a(g1iVar11, lifecycle12, bVar);
        g1i g1iVar12 = new g1i(k72VarP0.X, new d(null));
        s9s lifecycle13 = getLifecycle();
        lifecycle13.getClass();
        arr.a(g1iVar12, lifecycle13, bVar);
        g1i g1iVar13 = new g1i(k72VarP0.L, new e(k72VarP0, null));
        s9s lifecycle14 = getLifecycle();
        lifecycle14.getClass();
        arr.a(g1iVar13, lifecycle14, bVar);
    }

    public void L0() {
        v0().setOnClickListener(new e440());
        LoadingViewNew loadingViewNewU0 = u0();
        if (loadingViewNewU0 != null) {
            loadingViewNewU0.setOnClickListener(new View.OnClickListener() { // from class: p62
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.a.i();
                }
            });
        }
        SwipeRefreshLayout swipeRefreshLayoutG0 = G0();
        if (swipeRefreshLayoutG0 != null) {
            swipeRefreshLayoutG0.setOnRefreshListener(new SwipeRefreshLayout.f() { // from class: q62
                @Override // androidx.swiperefreshlayout.widget.SwipeRefreshLayout.f
                public final void i() {
                    this.a.i();
                }
            });
        }
        w0().setOnClickListener(new e440());
        o0().setOnClickListener(new e440());
        Iterator<T> it = p0().iterator();
        while (it.hasNext()) {
            ((TextView) it.next()).setText(sn5.d(this, R.string.common_functions__balance_label, P0().d.f()));
        }
        Iterator<T> it2 = n0().iterator();
        while (it2.hasNext()) {
            ((TextView) it2.next()).setText(sn5.d(this, R.string.common_functions__amount_label, P0().d.f()));
        }
        for (final ClearEditText clearEditText : m0()) {
            clearEditText.setTextChangedListener(new ClearEditText.b() { // from class: h62
                @Override // com.sporty.android.common_ui.widgets.ClearEditText.b
                public final void l(CharSequence charSequence) {
                    this.a.P0().x1(StringsKt.t0(charSequence.toString()).toString());
                    int length = charSequence.length();
                    ClearEditText clearEditText2 = clearEditText;
                    if (length == 0) {
                        clearEditText2.setTypeface(null, 0);
                    } else {
                        clearEditText2.setTypeface(null, 1);
                    }
                }
            });
            clearEditText.setKeyListener(DigitsKeyListener.getInstance(".0123456789"));
            clearEditText.setRawInputType(8194);
            clearEditText.setFilters(new InputFilter[]{new nqy(), new jdv()});
        }
        AspectRatioImageView aspectRatioImageViewR0 = r0();
        if (aspectRatioImageViewR0 != null) {
            aspectRatioImageViewR0.setAspectRatio(0.17777778f);
        }
    }

    public final void i() {
        P0().F1();
        qpg0 qpg0VarI0 = I0();
        ej5.c(o8i0.d(qpg0VarI0), null, null, new npg0(qpg0VarI0, null), 3);
        e400 e400VarY0 = y0();
        ej5.c(o8i0.d(e400VarY0), null, null, new b400(e400VarY0, null), 3);
    }

    public abstract List<ClearEditText> m0();

    public abstract List<TextView> n0();

    public abstract FrameLayout o0();

    @Override // androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        C0();
        ee<s8d0> eeVarRegisterForActivityResult = registerForActivityResult(new s1i0(), new ud() { // from class: g62
            @Override // defpackage.ud
            public final void a(Object obj) {
                v1i0 v1i0Var = (v1i0) obj;
                v1i0Var.getClass();
                bc6 bc6Var = this.a.H;
                if (bc6Var != null) {
                    if (bc6Var.p() instanceof bzx) {
                        zi50.a aVar = zi50.b;
                        bc6Var.resumeWith(v1i0Var);
                    } else {
                        itf0.a aVar2 = itf0.a;
                        aVar2.q(MyLog.TAG_COMMON);
                        aVar2.n("Continuation not active, resume not perform.", new Object[0]);
                    }
                }
            }
        });
        eeVarRegisterForActivityResult.getClass();
        this.M = eeVarRegisterForActivityResult;
        C0();
        ee eeVarRegisterForActivityResult2 = registerForActivityResult(new ni80(), new ud() { // from class: i62
            @Override // defpackage.ud
            public final void a(Object obj) {
                oi80 oi80Var = (oi80) obj;
                oi80Var.getClass();
                bc6 bc6Var = this.a.G;
                if (bc6Var != null) {
                    if (bc6Var.p() instanceof bzx) {
                        zi50.a aVar = zi50.b;
                        bc6Var.resumeWith(oi80Var);
                    } else {
                        itf0.a aVar2 = itf0.a;
                        aVar2.q(MyLog.TAG_COMMON);
                        aVar2.n("Continuation not active, resume not perform.", new Object[0]);
                    }
                }
            }
        });
        eeVarRegisterForActivityResult2.getClass();
        this.L = eeVarRegisterForActivityResult2;
        ee<f0i0> eeVarRegisterForActivityResult3 = registerForActivityResult(((q900) C0()).b(p900.a.c.a), new ud() { // from class: j62
            @Override // defpackage.ud
            public final void a(Object obj) {
                l800 l800Var = (l800) obj;
                l800Var.getClass();
                bc6 bc6Var = this.a.I;
                if (bc6Var != null) {
                    if (bc6Var.p() instanceof bzx) {
                        zi50.a aVar = zi50.b;
                        bc6Var.resumeWith(l800Var);
                    } else {
                        itf0.a aVar2 = itf0.a;
                        aVar2.q(MyLog.TAG_COMMON);
                        aVar2.n("Continuation not active, resume not perform.", new Object[0]);
                    }
                }
            }
        });
        eeVarRegisterForActivityResult3.getClass();
        this.N = eeVarRegisterForActivityResult3;
        ee<f0i0> eeVarRegisterForActivityResult4 = registerForActivityResult(((q900) C0()).b(p900.a.b.a), new ud() { // from class: k62
            @Override // defpackage.ud
            public final void a(Object obj) {
                l800 l800Var = (l800) obj;
                l800Var.getClass();
                bc6 bc6Var = this.a.I;
                if (bc6Var != null) {
                    if (bc6Var.p() instanceof bzx) {
                        zi50.a aVar = zi50.b;
                        bc6Var.resumeWith(l800Var);
                    } else {
                        itf0.a aVar2 = itf0.a;
                        aVar2.q(MyLog.TAG_COMMON);
                        aVar2.n("Continuation not active, resume not perform.", new Object[0]);
                    }
                }
            }
        });
        eeVarRegisterForActivityResult4.getClass();
        this.O = eeVarRegisterForActivityResult4;
        C0();
        RegistrationKYCWebViewActivity.y.getClass();
        ee<yv40> eeVarRegisterForActivityResult5 = registerForActivityResult(RegistrationKYCWebViewActivity.z, new ud() { // from class: l62
            @Override // defpackage.ud
            public final void a(Object obj) {
                Object obj2;
                zv40 zv40Var = (zv40) obj;
                zv40Var.getClass();
                bc6 bc6Var = this.a.J;
                if (bc6Var != null) {
                    if (zv40Var instanceof zv40.b) {
                        obj2 = mcx.b.a;
                    } else {
                        if (!(zv40Var instanceof zv40.a)) {
                            uhc.a();
                            return;
                        }
                        obj2 = mcx.a.a;
                    }
                    if (bc6Var.p() instanceof bzx) {
                        zi50.a aVar = zi50.b;
                        bc6Var.resumeWith(obj2);
                    } else {
                        itf0.a aVar2 = itf0.a;
                        aVar2.q(MyLog.TAG_COMMON);
                        aVar2.n("Continuation not active, resume not perform.", new Object[0]);
                    }
                }
            }
        });
        eeVarRegisterForActivityResult5.getClass();
        this.P = eeVarRegisterForActivityResult5;
        C0();
        VerifyBvnWithdrawActivity.a aVar = VerifyBvnWithdrawActivity.D;
        aVar.getClass();
        ee<tt40> eeVarRegisterForActivityResult6 = registerForActivityResult(aVar, new ud() { // from class: m62
            @Override // defpackage.ud
            public final void a(Object obj) {
                ut40 ut40Var = (ut40) obj;
                ut40Var.getClass();
                bc6 bc6Var = this.a.K;
                if (bc6Var != null) {
                    if (bc6Var.p() instanceof bzx) {
                        zi50.a aVar2 = zi50.b;
                        bc6Var.resumeWith(ut40Var);
                    } else {
                        itf0.a aVar3 = itf0.a;
                        aVar3.q(MyLog.TAG_COMMON);
                        aVar3.n(LhMGMAwwhzjwfz.aZmzwLXaDRj, new Object[0]);
                    }
                }
            }
        });
        eeVarRegisterForActivityResult6.getClass();
        this.Q = eeVarRegisterForActivityResult6;
        C0();
        NameBvnActivity.a aVar2 = NameBvnActivity.D;
        aVar2.getClass();
        ee<rt40> eeVarRegisterForActivityResult7 = registerForActivityResult(aVar2, new ud() { // from class: n62
            @Override // defpackage.ud
            public final void a(Object obj) {
                ((st40) obj).getClass();
                bc6 bc6Var = this.a.J;
                if (bc6Var != null) {
                    if (bc6Var.p() instanceof bzx) {
                        zi50.a aVar3 = zi50.b;
                        bc6Var.resumeWith(mcx.a.a);
                    } else {
                        itf0.a aVar4 = itf0.a;
                        aVar4.q(MyLog.TAG_COMMON);
                        aVar4.n("Continuation not active, resume not perform.", new Object[0]);
                    }
                }
            }
        });
        eeVarRegisterForActivityResult7.getClass();
        this.R = eeVarRegisterForActivityResult7;
        C0();
        ee<yt40> eeVarRegisterForActivityResult8 = registerForActivityResult(ConfirmAccountInfoActivity.d, new ud() { // from class: o62
            @Override // defpackage.ud
            public final void a(Object obj) {
                ((zt40) obj).getClass();
                bc6 bc6Var = this.a.J;
                if (bc6Var != null) {
                    if (bc6Var.p() instanceof bzx) {
                        zi50.a aVar3 = zi50.b;
                        bc6Var.resumeWith(mcx.a.a);
                    } else {
                        itf0.a aVar4 = itf0.a;
                        aVar4.q(MyLog.TAG_COMMON);
                        aVar4.n("Continuation not active, resume not perform.", new Object[0]);
                    }
                }
            }
        });
        eeVarRegisterForActivityResult8.getClass();
        this.S = eeVarRegisterForActivityResult8;
        H0().v = tj5.b(this);
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        s0().a();
        super.onDestroy();
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        view.getClass();
        super.onViewCreated(view, bundle);
        L0();
        K0();
        g1i g1iVar = new g1i(I0().y, new r62(this, null));
        s9s lifecycle = getLifecycle();
        lifecycle.getClass();
        arr.a(g1iVar, lifecycle, s9s.b.d);
    }

    public abstract List<TextView> p0();

    public abstract List<TextView> q0();

    public AspectRatioImageView r0() {
        return null;
    }

    public final com.sporty.android.common.uievent.e s0() {
        com.sporty.android.common.uievent.e eVar = this.f;
        if (eVar != null) {
            return eVar;
        }
        Intrinsics.n("commonUiEventProcessor");
        throw null;
    }

    public abstract SimpleDescriptionListView t0();

    public abstract LoadingViewNew u0();

    public abstract ComposeView v0();

    public abstract LoadingViewNew w0();

    public final e400 y0() {
        return (e400) this.D.getValue();
    }

    public final b900 z0() {
        d900 d900Var = this.A;
        if (d900Var != null) {
            return d900Var;
        }
        Intrinsics.n("paymentRouter");
        throw null;
    }
}
