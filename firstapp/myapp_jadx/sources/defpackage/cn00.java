package defpackage;

import android.accounts.Account;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.activity.result.ActivityResult;
import androidx.fragment.app.Fragment;
import androidx.navigation.fragment.NavHostFragment;
import com.sporty.android.core.model.account.AccountInfo;
import com.sporty.android.core.model.service.CountryCodeName;
import com.sportybet.android.bookingcode.data.dto.BookingData;
import com.sportybet.android.bookingcode.presentation.activity.HighLiabilityCodeActivity;
import com.sportybet.android.choosebet.presentation.ChooseBetActivity;
import com.sportybet.android.gp.tz.R;
import com.sportybet.android.multimaker.presentation.activity.MultiMakerActivity;
import com.sportybet.android.social.domain.SocialRouter$MySocialCreation;
import com.sportybet.android.social.domain.SocialRouter$PersonalSocial;
import com.sportybet.android.social.domain.SocialRouter$SocialNetwork;
import com.sportybet.android.social.domain.entity.SocialMineType;
import com.sportybet.android.user.avatar.ChangeAvatarActivity;
import com.sportybet.plugin.realsports.betslip.Selection;
import com.sportybet.plugin.realsports.betslip.widget.BetslipActivity;
import com.sportybet.plugin.realsports.data.Event;
import com.sportybet.plugin.realsports.data.Market;
import com.sportybet.plugin.realsports.data.Outcome;
import com.sportybet.plugin.realsports.data.Share;
import java.net.SocketTimeoutException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcn00;", "Landroidx/fragment/app/Fragment;", "Lk9j;", "<init>", "()V", "africa-bet-android"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class cn00 extends jzl implements k9j {
    public w8c A;
    public bnh0 B;
    public rdd0 C;
    public yfx D;
    public final q8i0 E;
    public final q8i0 F;
    public final q8i0 G;
    public final ee<Intent> H;
    public final ee<Intent> I;
    public final mpe0 J;
    public azm f;
    public t090 i;
    public uqm v;
    public mgb0 w;
    public psm y;
    public vg40 z;

    public static final /* synthetic */ class a extends saj implements Function0<Unit> {
        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            cn00 cn00Var = (cn00) this.receiver;
            cn00Var.m0().d(wae.HOME);
            androidx.fragment.app.e activity = cn00Var.getActivity();
            if (activity != null) {
                wc.a(activity);
            }
            return Unit.a;
        }
    }

    public static final class a0 extends qlr implements Function0<Fragment> {
        public a0() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Fragment invoke() {
            return cn00.this;
        }
    }

    /* JADX INFO: loaded from: classes5.dex */
    public static final /* synthetic */ class b extends saj implements Function1<z7a0.c, Unit> {
        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(z7a0.c cVar) {
            z7a0.c cVar2 = cVar;
            cVar2.getClass();
            cn00 cn00Var = (cn00) this.receiver;
            cn00Var.getClass();
            Integer num = cVar2.h;
            List<Event> list = cVar2.d;
            if (num != null && num.intValue() == 10000) {
                Intent intent = new Intent(cn00Var.requireContext(), (Class<?>) HighLiabilityCodeActivity.class);
                intent.putExtra("share_code", cVar2.a);
                intent.putExtra("code_hub_edit", true);
                intent.putExtra("action_load_booking_code_from", cVar2.c.name());
                intent.putExtra("is_smart_remix_available", cVar2.g);
                bew bewVar = bew.ADD_TO_BETSLIP_DIRECTLY;
                intent.putExtra("multi_maker_code_action", 3);
                String strH1 = iu2.a.j().h1(list != null ? list.size() : 0, false);
                Integer num2 = cVar2.e;
                Locale locale = Locale.getDefault();
                Double d = cVar2.f;
                intent.putExtra("summary", strH1 + " " + num2 + " x " + String.format(locale, "%.2f", Arrays.copyOf(new Object[]{Double.valueOf(d != null ? d.doubleValue() : 0.0d)}, 1)));
                list.getClass();
                intent.putParcelableArrayListExtra("booking_code_event", (ArrayList) list);
                cn00Var.startActivity(intent);
            } else {
                cn00Var.p0(null);
            }
            return Unit.a;
        }
    }

    public static final class b0 extends qlr implements Function0<w8i0> {
        public final /* synthetic */ a0 a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b0(a0 a0Var) {
            super(0);
            this.a = a0Var;
        }

        @Override // kotlin.jvm.functions.Function0
        public final w8i0 invoke() {
            return (w8i0) this.a.invoke();
        }
    }

    public static final /* synthetic */ class c extends saj implements Function1<jl00, Unit> {
        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(jl00 jl00Var) {
            jl00 jl00Var2 = jl00Var;
            jl00Var2.getClass();
            cn00 cn00Var = (cn00) this.receiver;
            cn00Var.getClass();
            String str = jl00Var2.a;
            String str2 = jl00Var2.l;
            if (str.length() != 0 && str2.length() != 0) {
                xyd0 xyd0VarA = xyd0.a.a(str, str2, false, null);
                androidx.fragment.app.e activity = cn00Var.getActivity();
                if (activity != null && !activity.isFinishing() && !activity.isDestroyed()) {
                    xyd0VarA.show(activity.getSupportFragmentManager(), "statisticsDialogFragment");
                    Unit unit = Unit.a;
                }
            }
            return Unit.a;
        }
    }

    public static final class c0 extends qlr implements Function0<v8i0> {
        public final /* synthetic */ ttr a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c0(ttr ttrVar) {
            super(0);
            this.a = ttrVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public final v8i0 invoke() {
            return ((w8i0) this.a.getValue()).getViewModelStore();
        }
    }

    public static final /* synthetic */ class d extends saj implements Function0<Unit> {
        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            final cn00 cn00Var = (cn00) this.receiver;
            rdd0 rdd0Var = cn00Var.C;
            if (rdd0Var == null) {
                Intrinsics.n("sportyTrackingUseCase");
                throw null;
            }
            rdd0Var.a(rbd0.a, k00.d);
            cn00Var.getAccountHelper().demandAccount(cn00Var.requireActivity(), new tit() { // from class: wm00
                @Override // defpackage.tit
                public final void w(Account account, boolean z) {
                    if (account != null) {
                        cn00 cn00Var2 = cn00Var;
                        if (cn00Var2.getAccountHelper().isLogin()) {
                            ee<Intent> eeVar = cn00Var2.H;
                            Intent intent = new Intent(cn00Var2.requireContext(), (Class<?>) ChooseBetActivity.class);
                            intent.putExtra("key_show_publish_action", true);
                            eeVar.b(intent);
                        }
                    }
                }
            });
            return Unit.a;
        }
    }

    public static final class d0 extends qlr implements Function0<cyb> {
        public final /* synthetic */ ttr a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d0(ttr ttrVar) {
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

    public static final /* synthetic */ class e extends saj implements Function0<Unit> {
        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            ((cn00) this.receiver).m0().d(wae.ME_SPORTS_BET_HISTORY_IN_MAIN_TAB);
            return Unit.a;
        }
    }

    public static final class e0 extends qlr implements Function0<r8i0.c> {
        public final /* synthetic */ ttr b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e0(ttr ttrVar) {
            super(0);
            this.b = ttrVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public final r8i0.c invoke() {
            r8i0.c defaultViewModelProviderFactory;
            w8i0 w8i0Var = (w8i0) this.b.getValue();
            iel ielVar = w8i0Var instanceof iel ? (iel) w8i0Var : null;
            return (ielVar == null || (defaultViewModelProviderFactory = ielVar.getDefaultViewModelProviderFactory()) == null) ? cn00.this.getDefaultViewModelProviderFactory() : defaultViewModelProviderFactory;
        }
    }

    public static final /* synthetic */ class f extends saj implements Function0<Unit> {
        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            cn00 cn00Var = (cn00) this.receiver;
            cn00Var.getClass();
            cn00Var.I.b(new Intent(cn00Var.requireContext(), (Class<?>) ChangeAvatarActivity.class));
            return Unit.a;
        }
    }

    public static final class f0 extends qlr implements Function0<Fragment> {
        public f0() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Fragment invoke() {
            return cn00.this;
        }
    }

    @c0d(c = "com.sportybet.android.social.presentation.personal.PersonalSocialFragment$onCreateView$1$1$18$1$1", f = "PersonalSocialFragment.kt", l = {191}, m = "invokeSuspend", v = 2)
    public static final class g extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ String c;
        public final /* synthetic */ z7a0.d d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(String str, z7a0.d dVar, v1b<? super g> v1bVar) {
            super(2, v1bVar);
            this.c = str;
            this.d = dVar;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            return cn00.this.new g(this.c, this.d, v1bVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
            return ((g) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            y5b y5bVar = y5b.a;
            int i = this.a;
            if (i == 0) {
                uj50.b(obj);
                this.a = 1;
                if (cn00.this.s0(this.c, this.d, this) == y5bVar) {
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

    public static final class g0 extends qlr implements Function0<w8i0> {
        public final /* synthetic */ f0 a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g0(f0 f0Var) {
            super(0);
            this.a = f0Var;
        }

        @Override // kotlin.jvm.functions.Function0
        public final w8i0 invoke() {
            return (w8i0) this.a.invoke();
        }
    }

    @c0d(c = "com.sportybet.android.social.presentation.personal.PersonalSocialFragment$onCreateView$1$1$19$1$1", f = "PersonalSocialFragment.kt", l = {202}, m = "invokeSuspend", v = 2)
    public static final class h extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ String c;
        public final /* synthetic */ String d;
        public final /* synthetic */ BookingData e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(String str, String str2, BookingData bookingData, v1b<? super h> v1bVar) {
            super(2, v1bVar);
            this.c = str;
            this.d = str2;
            this.e = bookingData;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            return cn00.this.new h(this.c, this.d, this.e, v1bVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
            return ((h) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            y5b y5bVar = y5b.a;
            int i = this.a;
            if (i == 0) {
                uj50.b(obj);
                this.a = 1;
                if (cn00.this.q0(this.c, this.d, this.e, this) == y5bVar) {
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

    public static final class h0 extends qlr implements Function0<v8i0> {
        public final /* synthetic */ ttr a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h0(ttr ttrVar) {
            super(0);
            this.a = ttrVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public final v8i0 invoke() {
            return ((w8i0) this.a.getValue()).getViewModelStore();
        }
    }

    public static final /* synthetic */ class i extends saj implements Function0<Unit> {
        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            ((cn00) this.receiver).m0().d(wae.SPORTS_MENU);
            return Unit.a;
        }
    }

    public static final class i0 extends qlr implements Function0<cyb> {
        public final /* synthetic */ ttr a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i0(ttr ttrVar) {
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

    public static final /* synthetic */ class j extends saj implements Function1<iz7, Unit> {
        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(iz7 iz7Var) {
            iz7 iz7Var2 = iz7Var;
            iz7Var2.getClass();
            cn00 cn00Var = (cn00) this.receiver;
            rdd0 rdd0Var = cn00Var.C;
            Bundle bundle = null;
            if (rdd0Var == null) {
                Intrinsics.n("sportyTrackingUseCase");
                throw null;
            }
            rdd0Var.a(lbd0.a, k00.d);
            if (cn00Var.getAccountHelper().isLogin()) {
                bundle = new Bundle();
                bundle.putString("tab_selection", iz7Var2.name());
            }
            cn00Var.m0().e(wae.CODE_HUB, bundle);
            return Unit.a;
        }
    }

    public static final /* synthetic */ class k extends saj implements Function0<Unit> {
        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            cn00 cn00Var = (cn00) this.receiver;
            rdd0 rdd0Var = cn00Var.C;
            if (rdd0Var == null) {
                Intrinsics.n("sportyTrackingUseCase");
                throw null;
            }
            rdd0Var.a(mbd0.a, k00.d);
            yfx yfxVar = cn00Var.D;
            if (yfxVar != null) {
                yfx.i(yfxVar, cha0.a.getUri(), null, 6);
                return Unit.a;
            }
            Intrinsics.n("navController");
            throw null;
        }
    }

    public static final /* synthetic */ class l extends saj implements Function1<bba0, Unit> {
        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(bba0 bba0Var) {
            final bba0 bba0Var2 = bba0Var;
            bba0Var2.getClass();
            final cn00 cn00Var = (cn00) this.receiver;
            cn00Var.getAccountHelper().demandAccount(cn00Var.requireActivity(), new tit() { // from class: vm00
                @Override // defpackage.tit
                public final void w(Account account, boolean z) {
                    if (account != null) {
                        cn00 cn00Var2 = cn00Var;
                        if (cn00Var2.getAccountHelper().isLogin()) {
                            cn00Var2.n0().G = new gzh(bba0Var2);
                        }
                    }
                }
            });
            return Unit.a;
        }
    }

    public static final /* synthetic */ class m extends saj implements Function1<String, Unit> {
        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(String str) {
            Boolean boolIsCreator;
            String str2 = str;
            str2.getClass();
            cn00 cn00Var = (cn00) this.receiver;
            cn00Var.getClass();
            SocialRouter$PersonalSocial socialRouter$PersonalSocial = SocialRouter$PersonalSocial.a;
            psm psmVar = cn00Var.y;
            if (psmVar == null) {
                Intrinsics.n("countryManager");
                throw null;
            }
            CountryCodeName countryCode = psmVar.getCountryCode();
            psm psmVar2 = cn00Var.y;
            if (psmVar2 == null) {
                Intrinsics.n("countryManager");
                throw null;
            }
            CountryCodeName countryCode2 = psmVar2.getCountryCode();
            psm psmVar3 = cn00Var.y;
            if (psmVar3 == null) {
                Intrinsics.n("countryManager");
                throw null;
            }
            CountryCodeName countryCode3 = psmVar3.getCountryCode();
            mgb0 mgb0Var = cn00Var.w;
            if (mgb0Var == null) {
                Intrinsics.n("accountStorage");
                throw null;
            }
            AccountInfo accountInfoLastAccountInfo = mgb0Var.lastAccountInfo();
            SocialRouter$PersonalSocial.Data data = new SocialRouter$PersonalSocial.Data(str2, false, null, null, false, false, countryCode, countryCode2, countryCode3, null, 0, 0, false, null, (accountInfoLastAccountInfo == null || (boolIsCreator = accountInfoLastAccountInfo.isCreator()) == null) ? false : boolIsCreator.booleanValue(), null, 48702, null);
            socialRouter$PersonalSocial.getClass();
            xnu xnuVarA = ej0.a(SocialRouter$PersonalSocial.a(data));
            yfx yfxVar = cn00Var.D;
            if (yfxVar != null) {
                wix.a(yfxVar, socialRouter$PersonalSocial, xnuVarA);
                return Unit.a;
            }
            Intrinsics.n("navController");
            throw null;
        }
    }

    public static final /* synthetic */ class n extends saj implements Function2<String, String, Unit> {
        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(String str, String str2) {
            String str3 = str;
            String str4 = str2;
            cn00 cn00Var = (cn00) this.receiver;
            cn00Var.getClass();
            SocialRouter$MySocialCreation socialRouter$MySocialCreation = SocialRouter$MySocialCreation.a;
            psm psmVar = cn00Var.y;
            if (psmVar == null) {
                Intrinsics.n("countryManager");
                throw null;
            }
            SocialRouter$MySocialCreation.Data data = new SocialRouter$MySocialCreation.Data(str3, psmVar.getCountryCode(), str4);
            socialRouter$MySocialCreation.getClass();
            xnu xnuVarA = ej0.a(SocialRouter$MySocialCreation.a(data));
            yfx yfxVar = cn00Var.D;
            if (yfxVar != null) {
                wix.a(yfxVar, socialRouter$MySocialCreation, xnuVarA);
                return Unit.a;
            }
            Intrinsics.n("navController");
            throw null;
        }
    }

    /* JADX INFO: loaded from: classes5.dex */
    public static final /* synthetic */ class o extends saj implements Function1<z7a0.b, Unit> {
        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(z7a0.b bVar) {
            z7a0.b bVar2 = bVar;
            bVar2.getClass();
            cn00 cn00Var = (cn00) this.receiver;
            cn00Var.getClass();
            Integer num = bVar2.e;
            if (num != null && num.intValue() == 10000) {
                Throwable th = bVar2.g;
                if (th != null) {
                    cn00Var.o0(th);
                } else {
                    List<Event> list = bVar2.d;
                    if (list != null) {
                        azm azmVarM0 = cn00Var.m0();
                        wae waeVar = wae.MULTI_MAKER;
                        int i = MultiMakerActivity.E;
                        ArrayList arrayListA = sd9.a(list);
                        String str = bVar2.a;
                        bew bewVar = bew.ADD_TO_BETSLIP_DIRECTLY;
                        azmVarM0.e(waeVar, MultiMakerActivity.a.b(true, bVar2.c.name(), 1, null, str, arrayListA, 145));
                    }
                }
            } else {
                cn00Var.p0(bVar2.f);
            }
            return Unit.a;
        }
    }

    /* JADX INFO: loaded from: classes5.dex */
    public static final /* synthetic */ class p extends saj implements Function1<z7a0.a, Unit> {
        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(z7a0.a aVar) {
            z7a0.a aVar2 = aVar;
            aVar2.getClass();
            cn00 cn00Var = (cn00) this.receiver;
            cn00Var.getClass();
            Integer num = aVar2.e;
            String str = aVar2.a;
            if (num != null && num.intValue() == 10000) {
                Throwable th = aVar2.g;
                if (th != null) {
                    cn00Var.o0(th);
                } else {
                    vg40 vg40Var = cn00Var.z;
                    if (vg40Var == null) {
                        Intrinsics.n("recentCodeRepo");
                        throw null;
                    }
                    vg40Var.e(str);
                    boolean zIsEmpty = ((ArrayList) iu2.d()).isEmpty();
                    List<Event> list = aVar2.d;
                    if (list != null) {
                        ArrayList<? extends Parcelable> arrayList = new ArrayList<>();
                        boolean zIsEmpty2 = ((ArrayList) iu2.d()).isEmpty();
                        for (Event event : list) {
                            List<Market> list2 = event.markets;
                            if (list2 != null) {
                                for (Market market : list2) {
                                    List<Outcome> list3 = market.outcomes;
                                    list3.getClass();
                                    for (Outcome outcome : list3) {
                                        if (zIsEmpty2) {
                                            iu2.t(event, market, outcome, true, false, null, 16368);
                                        } else {
                                            arrayList.add(new Selection(event, market, outcome));
                                        }
                                    }
                                }
                            }
                        }
                        Intent intent = new Intent(cn00Var.requireContext(), (Class<?>) BetslipActivity.class);
                        if (!zIsEmpty) {
                            intent.putExtra("extra_show_replace_dialog", true);
                            intent.putParcelableArrayListExtra("extra_selection_item", arrayList);
                        }
                        intent.putExtra("share_code", str);
                        bew bewVar = bew.ADD_TO_BETSLIP_DIRECTLY;
                        intent.putExtra("multi_maker_code_action", 2);
                        intent.putExtra("action_load_booking_code_from", aVar2.c.name());
                        cn00Var.startActivity(intent);
                    }
                }
            } else {
                cn00Var.p0(aVar2.f);
            }
            return Unit.a;
        }
    }

    @c0d(c = "com.sportybet.android.event.Events$receiveEvent$1", f = "Events.kt", l = {24}, m = "invokeSuspend", v = 2)
    public static final class q extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public int a;
        public /* synthetic */ Object b;
        public final /* synthetic */ s c;

        public static final class a<T> implements myh {
            public final /* synthetic */ v5b a;
            public final /* synthetic */ s b;

            public a(s sVar, v5b v5bVar) {
                this.b = sVar;
                this.a = v5bVar;
            }

            @Override // defpackage.myh
            public final Object emit(Object obj, v1b v1bVar) {
                T t = ((uhg) obj).a;
                if (!(t instanceof u8a0)) {
                    return Unit.a;
                }
                Object objInvoke = this.b.invoke(this.a, t, v1bVar);
                return objInvoke == y5b.a ? objInvoke : Unit.a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public q(s sVar, v1b v1bVar) {
            super(2, v1bVar);
            this.c = sVar;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            q qVar = new q(this.c, v1bVar);
            qVar.b = obj;
            return qVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) throws Throwable {
            ((q) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
            return y5b.a;
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) throws Throwable {
            v5b v5bVar = (v5b) this.b;
            y5b y5bVar = y5b.a;
            int i = this.a;
            if (i != 0) {
                if (i == 1) {
                    throw l80.a(obj);
                }
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            uj50.b(obj);
            b390 b390Var = ftg.a;
            a aVar = new a(this.c, v5bVar);
            this.b = null;
            this.a = 1;
            b390Var.collect(aVar, this);
            return y5bVar;
        }
    }

    @c0d(c = "com.sportybet.android.event.Events$receiveEvent$1", f = "Events.kt", l = {24}, m = "invokeSuspend", v = 2)
    public static final class r extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public int a;
        public /* synthetic */ Object b;
        public final /* synthetic */ t c;

        public static final class a<T> implements myh {
            public final /* synthetic */ v5b a;
            public final /* synthetic */ t b;

            public a(t tVar, v5b v5bVar) {
                this.b = tVar;
                this.a = v5bVar;
            }

            @Override // defpackage.myh
            public final Object emit(Object obj, v1b v1bVar) {
                T t = ((uhg) obj).a;
                if (!(t instanceof s8a0)) {
                    return Unit.a;
                }
                Object objInvoke = this.b.invoke(this.a, t, v1bVar);
                return objInvoke == y5b.a ? objInvoke : Unit.a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public r(t tVar, v1b v1bVar) {
            super(2, v1bVar);
            this.c = tVar;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            r rVar = new r(this.c, v1bVar);
            rVar.b = obj;
            return rVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) throws Throwable {
            ((r) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
            return y5b.a;
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) throws Throwable {
            v5b v5bVar = (v5b) this.b;
            y5b y5bVar = y5b.a;
            int i = this.a;
            if (i != 0) {
                if (i == 1) {
                    throw l80.a(obj);
                }
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            uj50.b(obj);
            b390 b390Var = ftg.a;
            a aVar = new a(this.c, v5bVar);
            this.b = null;
            this.a = 1;
            b390Var.collect(aVar, this);
            return y5bVar;
        }
    }

    @c0d(c = "com.sportybet.android.social.presentation.personal.PersonalSocialFragment$onViewCreated$1", f = "PersonalSocialFragment.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class s extends tje0 implements gaj<v5b, u8a0, v1b<? super Unit>, Object> {
        public s(v1b<? super s> v1bVar) {
            super(3, v1bVar);
        }

        @Override // defpackage.gaj
        public final Object invoke(v5b v5bVar, u8a0 u8a0Var, v1b<? super Unit> v1bVar) {
            return cn00.this.new s(v1bVar).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            y5b y5bVar = y5b.a;
            uj50.b(obj);
            cn00.this.n0().x1();
            return Unit.a;
        }
    }

    @c0d(c = "com.sportybet.android.social.presentation.personal.PersonalSocialFragment$onViewCreated$2", f = "PersonalSocialFragment.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class t extends tje0 implements gaj<v5b, s8a0, v1b<? super Unit>, Object> {
        public t(v1b<? super t> v1bVar) {
            super(3, v1bVar);
        }

        @Override // defpackage.gaj
        public final Object invoke(v5b v5bVar, s8a0 s8a0Var, v1b<? super Unit> v1bVar) {
            return cn00.this.new t(v1bVar).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            y5b y5bVar = y5b.a;
            uj50.b(obj);
            cn00 cn00Var = cn00.this;
            if (rvi.b(cn00Var)) {
                return Unit.a;
            }
            kq00 kq00VarN0 = cn00Var.n0();
            ej5.c(o8i0.d(kq00VarN0), null, null, new eq00(kq00VarN0, null), 3);
            return Unit.a;
        }
    }

    public static final class u extends qlr implements Function0<r8i0.c> {
        public final /* synthetic */ ttr b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public u(ttr ttrVar) {
            super(0);
            this.b = ttrVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public final r8i0.c invoke() {
            r8i0.c defaultViewModelProviderFactory;
            w8i0 w8i0Var = (w8i0) this.b.getValue();
            iel ielVar = w8i0Var instanceof iel ? (iel) w8i0Var : null;
            return (ielVar == null || (defaultViewModelProviderFactory = ielVar.getDefaultViewModelProviderFactory()) == null) ? cn00.this.getDefaultViewModelProviderFactory() : defaultViewModelProviderFactory;
        }
    }

    public static final class v extends qlr implements Function0<Fragment> {
        public v() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Fragment invoke() {
            return cn00.this;
        }
    }

    public static final class w extends qlr implements Function0<w8i0> {
        public final /* synthetic */ v a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public w(v vVar) {
            super(0);
            this.a = vVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public final w8i0 invoke() {
            return (w8i0) this.a.invoke();
        }
    }

    public static final class x extends qlr implements Function0<v8i0> {
        public final /* synthetic */ ttr a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public x(ttr ttrVar) {
            super(0);
            this.a = ttrVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public final v8i0 invoke() {
            return ((w8i0) this.a.getValue()).getViewModelStore();
        }
    }

    public static final class y extends qlr implements Function0<cyb> {
        public final /* synthetic */ ttr a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public y(ttr ttrVar) {
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

    public static final class z extends qlr implements Function0<r8i0.c> {
        public final /* synthetic */ ttr b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public z(ttr ttrVar) {
            super(0);
            this.b = ttrVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public final r8i0.c invoke() {
            r8i0.c defaultViewModelProviderFactory;
            w8i0 w8i0Var = (w8i0) this.b.getValue();
            iel ielVar = w8i0Var instanceof iel ? (iel) w8i0Var : null;
            return (ielVar == null || (defaultViewModelProviderFactory = ielVar.getDefaultViewModelProviderFactory()) == null) ? cn00.this.getDefaultViewModelProviderFactory() : defaultViewModelProviderFactory;
        }
    }

    public cn00() {
        a0 a0Var = new a0();
        a1s a1sVar = a1s.c;
        ttr ttrVarA = hwr.a(a1sVar, new b0(a0Var));
        this.E = new q8i0(jq40.a(kq00.class), new c0(ttrVarA), new e0(ttrVarA), new d0(ttrVarA));
        ttr ttrVarA2 = hwr.a(a1sVar, new g0(new f0()));
        this.F = new q8i0(jq40.a(el00.class), new h0(ttrVarA2), new u(ttrVarA2), new i0(ttrVarA2));
        ttr ttrVarA3 = hwr.a(a1sVar, new w(new v()));
        this.G = new q8i0(jq40.a(bsi.class), new x(ttrVarA3), new z(ttrVarA3), new y(ttrVarA3));
        ee<Intent> eeVarRegisterForActivityResult = registerForActivityResult(new ce(), new ud() { // from class: rm00
            @Override // defpackage.ud
            public final void a(Object obj) {
                ((ActivityResult) obj).getClass();
                this.a.n0().x1();
            }
        });
        eeVarRegisterForActivityResult.getClass();
        this.H = eeVarRegisterForActivityResult;
        ee<Intent> eeVarRegisterForActivityResult2 = registerForActivityResult(new ce(), new ud() { // from class: xm00
            @Override // defpackage.ud
            public final void a(Object obj) {
                ((ActivityResult) obj).getClass();
                this.a.n0().x1();
            }
        });
        eeVarRegisterForActivityResult2.getClass();
        this.I = eeVarRegisterForActivityResult2;
        this.J = hwr.b(new ym00(this, 0));
    }

    public final uqm getAccountHelper() {
        uqm uqmVar = this.v;
        if (uqmVar != null) {
            return uqmVar;
        }
        Intrinsics.n("accountHelper");
        throw null;
    }

    public final azm m0() {
        azm azmVar = this.f;
        if (azmVar != null) {
            return azmVar;
        }
        Intrinsics.n("router");
        throw null;
    }

    public final kq00 n0() {
        return (kq00) this.E.getValue();
    }

    public final void o0(Throwable th) {
        String strD;
        if (th instanceof SocketTimeoutException) {
            zyf0.b(R.string.page_load_code__request_time_out, 0);
            return;
        }
        String message = th.getMessage();
        if (message == null || message.length() == 0) {
            strD = sn5.d(this, R.string.common_feedback__the_code_was_not_loaded_successfully_tip, new Object[0]);
        } else {
            strD = th.getMessage();
            if (strD == null) {
                strD = "";
            }
        }
        zyf0.c(0, strD);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        layoutInflater.getClass();
        this.D = NavHostFragment.a.a(this);
        Context contextRequireContext = requireContext();
        contextRequireContext.getClass();
        return mla.a(contextRequireContext, new op8(-2060507972, new qmm(this, 1), true));
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        view.getClass();
        super.onViewCreated(view, bundle);
        b390 b390Var = ftg.a;
        s sVar = new s(null);
        s9s.a aVar = s9s.a.ON_DESTROY;
        ej5.c(new dqg(this, aVar), null, null, new q(sVar, null), 3);
        ej5.c(new dqg(this, aVar), null, null, new r(new t(null), null), 3);
    }

    public final void p0(String str) {
        if (str == null || str.length() == 0) {
            str = sn5.d(this, R.string.page_load_code__code_expired, new Object[0]);
        }
        zyf0.c(0, str);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x001b  */
    public final Object q0(String str, String str2, BookingData bookingData, x1b x1bVar) {
        dn00 dn00Var;
        String str3;
        String strA;
        ArrayList arrayList;
        List list;
        String str4 = str;
        BookingData bookingData2 = bookingData;
        if (x1bVar instanceof dn00) {
            dn00Var = (dn00) x1bVar;
            int i2 = dn00Var.v;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                dn00Var.v = i2 - Integer.MIN_VALUE;
            } else {
                dn00Var = new dn00(this, x1bVar);
            }
        } else {
            dn00Var = new dn00(this, x1bVar);
        }
        Object obj = dn00Var.f;
        y5b y5bVar = y5b.a;
        int i3 = dn00Var.v;
        if (i3 == 0) {
            uj50.b(obj);
            if (str4.length() == 0 || str2.length() == 0 || (str3 = bookingData2.shareCode) == null || str3.length() == 0) {
                return Unit.a;
            }
            List<Event> list2 = bookingData2.outcomes;
            if (list2 == null) {
                return Unit.a;
            }
            w8c w8cVar = this.A;
            if (w8cVar == null) {
                Intrinsics.n("customCodeJoiner");
                throw null;
            }
            strA = w8cVar.a(str4, str2);
            arrayList = new ArrayList(iu2.d());
            iu2.b();
            for (Event event : list2) {
                List<Market> list3 = event.markets;
                if (list3 != null) {
                    for (Market market : list3) {
                        List<Outcome> list4 = market.outcomes;
                        list4.getClass();
                        Iterator<T> it = list4.iterator();
                        while (it.hasNext()) {
                            iu2.t(event, market, (Outcome) it.next(), true, false, null, 16368);
                        }
                    }
                }
            }
            g93.b(new Share(bookingData2.shareCode, strA));
            List listA0 = CollectionsKt.A0(iu2.d());
            String lastNickName = getAccountHelper().getLastNickName();
            t090 t090Var = this.i;
            if (t090Var == null) {
                Intrinsics.n("shareImageProvider");
                throw null;
            }
            String str5 = bookingData2.shareCode;
            if (str5 == null) {
                str5 = "";
            }
            b190 b190Var = new b190(listA0, str4, lastNickName, str5);
            dn00Var.a = str4;
            dn00Var.b = bookingData2;
            dn00Var.c = strA;
            dn00Var.d = arrayList;
            dn00Var.e = listA0;
            dn00Var.v = 1;
            Object objA = t090Var.a(b190Var, dn00Var);
            if (objA == y5bVar) {
                return y5bVar;
            }
            obj = objA;
            list = listA0;
        } else {
            if (i3 != 1) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            list = dn00Var.e;
            ArrayList arrayList2 = dn00Var.d;
            String str6 = dn00Var.c;
            BookingData bookingData3 = dn00Var.b;
            String str7 = dn00Var.a;
            uj50.b(obj);
            arrayList = arrayList2;
            strA = str6;
            str4 = str7;
            bookingData2 = bookingData3;
        }
        c190 c190Var = (c190) obj;
        String str8 = c190Var.a;
        String str9 = c190Var.b;
        iu2.b();
        int size = arrayList.size();
        int i4 = 0;
        while (i4 < size) {
            Object obj2 = arrayList.get(i4);
            i4++;
            Selection selection = (Selection) obj2;
            iu2.t(selection.a, selection.b, selection.c, true, false, null, 16368);
        }
        String strA2 = o7d.a(wae.SHARE);
        String str10 = bookingData2.shareCode;
        boolean zX = g880.x(list);
        StringBuilder sbA = crh0.a(strA2, "?imageUri=", str8, "&imageWithUserUri=", str9);
        hxa.c(sbA, "&linkUrl=", strA, "&customCode=", str4);
        sbA.append("&shareCode=");
        sbA.append(str10);
        sbA.append("&isSingleBetBuilder=");
        sbA.append(zX);
        sbA.append("&source=custom_code");
        sh8.c().e(sbA.toString());
        return Unit.a;
    }

    public final void r0(String str, CountryCodeName countryCodeName, SocialMineType socialMineType, rfa0 rfa0Var) {
        SocialRouter$SocialNetwork socialRouter$SocialNetwork = SocialRouter$SocialNetwork.a;
        SocialRouter$SocialNetwork.Data data = new SocialRouter$SocialNetwork.Data(str, countryCodeName, socialMineType, rfa0Var);
        socialRouter$SocialNetwork.getClass();
        xnu xnuVarA = ej0.a(vj5.a(new Pair("arg_social_network_data", data)));
        yfx yfxVar = this.D;
        if (yfxVar != null) {
            wix.a(yfxVar, socialRouter$SocialNetwork, xnuVarA);
        } else {
            Intrinsics.n("navController");
            throw null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x001b  */
    public final Object s0(String str, z7a0.d dVar, x1b x1bVar) {
        en00 en00Var;
        String str2;
        Object obj;
        BookingData bookingData;
        List list;
        String str3;
        ArrayList arrayList;
        Integer num;
        z7a0.d dVar2 = dVar;
        if (x1bVar instanceof en00) {
            en00Var = (en00) x1bVar;
            int i2 = en00Var.v;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                en00Var.v = i2 - Integer.MIN_VALUE;
            } else {
                en00Var = new en00(this, x1bVar);
            }
        } else {
            en00Var = new en00(this, x1bVar);
        }
        Object obj2 = en00Var.f;
        y5b y5bVar = y5b.a;
        int i3 = en00Var.v;
        if (i3 == 0) {
            uj50.b(obj2);
            if (dVar2 != null && ((num = dVar2.d) == null || num.intValue() != 10000)) {
                p0(dVar2.e);
                return Unit.a;
            }
            if ((dVar2 != null ? dVar2.f : null) != null) {
                o0(dVar2.f);
                return Unit.a;
            }
            BookingData bookingData2 = dVar2 != null ? dVar2.c : null;
            if (bookingData2 == null || (str2 = bookingData2.shareCode) == null || str2.length() == 0 || str.length() <= 0) {
                if (str.length() > 0) {
                    Context contextRequireContext = requireContext();
                    contextRequireContext.getClass();
                    vp00.a(contextRequireContext, str);
                }
                return Unit.a;
            }
            List<Event> list2 = bookingData2.outcomes;
            if (list2 == null) {
                return Unit.a;
            }
            LinkedHashMap linkedHashMapA = apg.a(list2);
            bnh0 bnh0Var = this.B;
            if (bnh0Var == null) {
                Intrinsics.n("urlCreator");
                throw null;
            }
            String str4 = bookingData2.shareCode;
            str4.getClass();
            String strA = bnh0Var.a("https", new String[]{"player", str, "bookingcode", str4});
            ArrayList arrayList2 = new ArrayList(iu2.d());
            iu2.b();
            for (Event event : list2) {
                if (event.markets != null && !event.isBetBuilderChild()) {
                    for (Market market : event.markets) {
                        List<Outcome> list3 = market.outcomes;
                        if (list3 != null && market.status != 3) {
                            Iterator<Outcome> it = list3.iterator();
                            while (it.hasNext()) {
                                iu2.t(event, market, it.next(), true, false, (List) linkedHashMapA.get(market.id), 16336);
                            }
                        }
                    }
                }
            }
            g93.b(new Share(bookingData2.shareCode, strA));
            List listA0 = CollectionsKt.A0(iu2.d());
            String lastNickName = getAccountHelper().getLastNickName();
            t090 t090Var = this.i;
            if (t090Var == null) {
                Intrinsics.n("shareImageProvider");
                throw null;
            }
            String str5 = bookingData2.shareCode;
            if (str5 == null) {
                str5 = "";
            }
            b190 b190Var = new b190(listA0, null, lastNickName, str5);
            en00Var.a = dVar2;
            en00Var.b = bookingData2;
            en00Var.c = strA;
            en00Var.d = arrayList2;
            en00Var.e = listA0;
            en00Var.v = 1;
            Object objA = t090Var.a(b190Var, en00Var);
            if (objA == y5bVar) {
                return y5bVar;
            }
            obj = objA;
            bookingData = bookingData2;
            list = listA0;
            str3 = strA;
            arrayList = arrayList2;
        } else {
            if (i3 != 1) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            list = en00Var.e;
            arrayList = en00Var.d;
            String str6 = en00Var.c;
            bookingData = en00Var.b;
            z7a0.d dVar3 = en00Var.a;
            uj50.b(obj2);
            str3 = str6;
            dVar2 = dVar3;
            obj = obj2;
        }
        c190 c190Var = (c190) obj;
        String str7 = c190Var.a;
        String str8 = c190Var.b;
        iu2.b();
        int size = arrayList.size();
        int i4 = 0;
        while (i4 < size) {
            Object obj3 = arrayList.get(i4);
            i4++;
            Selection selection = (Selection) obj3;
            iu2.t(selection.a, selection.b, selection.c, true, false, selection.d, 16336);
        }
        Boolean boolValueOf = Boolean.valueOf(dVar2.b);
        Boolean bool = Boolean.FALSE;
        if ((29 & 2) != 0) {
            boolValueOf = bool;
        }
        String strA2 = o7d.a(wae.SHARE);
        String str9 = bookingData.shareCode;
        StringBuilder sbA = cwz.a("&enableSocialButton=", "&alreadyPublished=", "&hasLiveOrSettledEvent=", false, boolValueOf.booleanValue());
        mng.a("&username=", null, "&avatarUri=", sbA, false);
        sbA.append((String) null);
        String string = sbA.toString();
        boolean zX = g880.x(list);
        StringBuilder sbA2 = crh0.a(strA2, "?imageUri=", str7, "&imageWithUserUri=", str8);
        hxa.c(sbA2, "&linkUrl=", str3, "&shareCode=", str9);
        sh8.c().e(x9d.a(string, "&isSingleBetBuilder=", "&source=social_page", sbA2, zX));
        return Unit.a;
    }
}
