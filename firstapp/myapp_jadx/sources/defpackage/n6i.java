package defpackage;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.a;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.e;
import com.sporty.android.core.model.tracking.AnalyticsEvent;
import com.sportybet.android.bookingcode.data.dto.BookingData;
import com.sportybet.android.gp.tz.R;
import com.sportybet.android.multimaker.presentation.activity.MultiMakerActivity;
import com.sportybet.android.social.presentation.SocialActivity;
import com.sportybet.core.injection.opentelemetry.PageMeta;
import com.sportybet.plugin.realsports.betslip.Selection;
import com.sportybet.plugin.realsports.betslip.widget.BetslipActivity;
import com.sportybet.plugin.realsports.data.Event;
import com.sportybet.plugin.realsports.data.Market;
import com.sportybet.plugin.realsports.data.Outcome;
import com.sportybet.plugin.realsports.data.Share;
import java.net.SocketTimeoutException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import n6i.a;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Ln6i;", "Landroidx/fragment/app/Fragment;", "<init>", "()V", "africa-bet-android"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class n6i extends zql {
    public final q8i0 A;
    public azm f;
    public uqm i;
    public t090 v;
    public iym w;
    public vg40 y;
    public bnh0 z;

    @c0d(c = "com.sportybet.android.codehub.ui.FollowCodeFragment$onCreateView$1$3$1$1", f = "FollowCodeFragment.kt", l = {100}, m = "invokeSuspend", v = 2)
    public static final class a extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ String c;
        public final /* synthetic */ b6i.e d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String str, b6i.e eVar, v1b<? super a> v1bVar) {
            super(2, v1bVar);
            this.c = str;
            this.d = eVar;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            return n6i.this.new a(this.c, this.d, v1bVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
            return ((a) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            y5b y5bVar = y5b.a;
            int i = this.a;
            if (i == 0) {
                uj50.b(obj);
                this.a = 1;
                if (n6i.this.o0(this.c, this.d, this) == y5bVar) {
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

    @c0d(c = "com.sportybet.android.event.Events$receiveEvent$1", f = "Events.kt", l = {24}, m = "invokeSuspend", v = 2)
    public static final class b extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public int a;
        public /* synthetic */ Object b;
        public final /* synthetic */ c c;

        public static final class a<T> implements myh {
            public final /* synthetic */ v5b a;
            public final /* synthetic */ c b;

            public a(c cVar, v5b v5bVar) {
                this.b = cVar;
                this.a = v5bVar;
            }

            @Override // defpackage.myh
            public final Object emit(Object obj, v1b v1bVar) {
                T t = ((uhg) obj).a;
                if (!(t instanceof hx7)) {
                    return Unit.a;
                }
                Object objInvoke = this.b.invoke(this.a, t, v1bVar);
                return objInvoke == y5b.a ? objInvoke : Unit.a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(c cVar, v1b v1bVar) {
            super(2, v1bVar);
            this.c = cVar;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            b bVar = new b(this.c, v1bVar);
            bVar.b = obj;
            return bVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) throws Throwable {
            ((b) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
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

    @c0d(c = "com.sportybet.android.codehub.ui.FollowCodeFragment$onViewCreated$1", f = "FollowCodeFragment.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class c extends tje0 implements gaj<v5b, hx7, v1b<? super Unit>, Object> {
        public c(v1b<? super c> v1bVar) {
            super(3, v1bVar);
        }

        @Override // defpackage.gaj
        public final Object invoke(v5b v5bVar, hx7 hx7Var, v1b<? super Unit> v1bVar) {
            return n6i.this.new c(v1bVar).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            y5b y5bVar = y5b.a;
            uj50.b(obj);
            n6i n6iVar = n6i.this;
            if (rvi.b(n6iVar)) {
                return Unit.a;
            }
            u7i u7iVar = (u7i) n6iVar.A.getValue();
            u7iVar.x1(true);
            kzh.d(new g1i(u7iVar.w, new v7i(u7iVar, null)), o8i0.d(u7iVar));
            return Unit.a;
        }
    }

    public static final class d extends qlr implements Function0<Fragment> {
        public d() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Fragment invoke() {
            return n6i.this;
        }
    }

    public static final class e extends qlr implements Function0<w8i0> {
        public final /* synthetic */ d a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(d dVar) {
            super(0);
            this.a = dVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public final w8i0 invoke() {
            return (w8i0) this.a.invoke();
        }
    }

    public static final class f extends qlr implements Function0<v8i0> {
        public final /* synthetic */ ttr a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(ttr ttrVar) {
            super(0);
            this.a = ttrVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public final v8i0 invoke() {
            return ((w8i0) this.a.getValue()).getViewModelStore();
        }
    }

    public static final class g extends qlr implements Function0<cyb> {
        public final /* synthetic */ ttr a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(ttr ttrVar) {
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

    public static final class h extends qlr implements Function0<r8i0.c> {
        public final /* synthetic */ ttr b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(ttr ttrVar) {
            super(0);
            this.b = ttrVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public final r8i0.c invoke() {
            r8i0.c defaultViewModelProviderFactory;
            w8i0 w8i0Var = (w8i0) this.b.getValue();
            iel ielVar = w8i0Var instanceof iel ? (iel) w8i0Var : null;
            return (ielVar == null || (defaultViewModelProviderFactory = ielVar.getDefaultViewModelProviderFactory()) == null) ? n6i.this.getDefaultViewModelProviderFactory() : defaultViewModelProviderFactory;
        }
    }

    public n6i() {
        ttr ttrVarA = hwr.a(a1s.c, new e(new d()));
        this.A = new q8i0(jq40.a(u7i.class), new f(ttrVarA), new h(ttrVarA), new g(ttrVarA));
    }

    public final uqm getAccountHelper() {
        uqm uqmVar = this.i;
        if (uqmVar != null) {
            return uqmVar;
        }
        Intrinsics.n("accountHelper");
        throw null;
    }

    public final void m0(Throwable th) {
        String strD;
        if (th instanceof SocketTimeoutException) {
            zyf0.c(0, sn5.d(this, R.string.page_load_code__request_time_out, new Object[0]));
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

    public final void n0(String str) {
        if (str == null || str.length() == 0) {
            str = sn5.d(this, R.string.page_load_code__code_expired, new Object[0]);
        }
        zyf0.c(0, str);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x001b  */
    public final Object o0(String str, b6i.e eVar, x1b x1bVar) {
        m6i m6iVar;
        String str2;
        Object obj;
        BookingData bookingData;
        List list;
        String str3;
        ArrayList arrayList;
        b6i.e eVar2 = eVar;
        if (x1bVar instanceof m6i) {
            m6iVar = (m6i) x1bVar;
            int i = m6iVar.v;
            if ((i & Integer.MIN_VALUE) != 0) {
                m6iVar.v = i - Integer.MIN_VALUE;
            } else {
                m6iVar = new m6i(this, x1bVar);
            }
        } else {
            m6iVar = new m6i(this, x1bVar);
        }
        Object obj2 = m6iVar.f;
        y5b y5bVar = y5b.a;
        int i2 = m6iVar.v;
        if (i2 == 0) {
            uj50.b(obj2);
            Integer num = eVar2.e;
            if (num == null || num.intValue() != 10000) {
                n0(eVar2.f);
                return Unit.a;
            }
            Throwable th = eVar2.g;
            if (th != null) {
                m0(th);
                return Unit.a;
            }
            BookingData bookingData2 = eVar2.d;
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
            bnh0 bnh0Var = this.z;
            if (bnh0Var == null) {
                Intrinsics.n("urlCreator");
                throw null;
            }
            String strA = bnh0Var.a("https", new String[]{lx5.a("/player/", str, "/bookingcode/", bookingData2.shareCode)});
            ArrayList arrayList2 = new ArrayList(iu2.d());
            iu2.b();
            for (Event event : list2) {
                List<Market> list3 = event.markets;
                if (list3 != null) {
                    for (Market market : list3) {
                        Iterator<Outcome> it = market.outcomes.iterator();
                        while (it.hasNext()) {
                            iu2.t(event, market, it.next(), true, false, null, 16368);
                        }
                    }
                }
            }
            g93.b(new Share(bookingData2.shareCode, strA));
            uqm uqmVar = this.i;
            if (uqmVar == null) {
                Intrinsics.n("accountHelper");
                throw null;
            }
            String lastNickName = uqmVar.getLastNickName();
            List listA0 = CollectionsKt.A0(iu2.d());
            t090 t090Var = this.v;
            if (t090Var == null) {
                Intrinsics.n("shareImageProvider");
                throw null;
            }
            String str4 = bookingData2.shareCode;
            if (str4 == null) {
                str4 = "";
            }
            b190 b190Var = new b190(listA0, null, lastNickName, str4);
            m6iVar.a = eVar2;
            m6iVar.b = bookingData2;
            m6iVar.c = strA;
            m6iVar.d = arrayList2;
            m6iVar.e = listA0;
            m6iVar.v = 1;
            Object objA = t090Var.a(b190Var, m6iVar);
            if (objA == y5bVar) {
                return y5bVar;
            }
            obj = objA;
            bookingData = bookingData2;
            list = listA0;
            str3 = strA;
            arrayList = arrayList2;
        } else {
            if (i2 != 1) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            list = m6iVar.e;
            arrayList = m6iVar.d;
            String str5 = m6iVar.c;
            bookingData = m6iVar.b;
            b6i.e eVar3 = m6iVar.a;
            uj50.b(obj2);
            str3 = str5;
            eVar2 = eVar3;
            obj = obj2;
        }
        c190 c190Var = (c190) obj;
        String str6 = c190Var.a;
        String str7 = c190Var.b;
        iu2.b();
        int size = arrayList.size();
        int i3 = 0;
        while (i3 < size) {
            Object obj3 = arrayList.get(i3);
            i3++;
            Selection selection = (Selection) obj3;
            iu2.t(selection.a, selection.b, selection.c, true, false, null, 16368);
        }
        Boolean boolValueOf = Boolean.valueOf(eVar2.c);
        Boolean bool = Boolean.FALSE;
        if ((29 & 2) != 0) {
            boolValueOf = bool;
        }
        String strA2 = o7d.a(wae.SHARE);
        boolean zX = g880.x(list);
        String str8 = bookingData.shareCode;
        StringBuilder sbA = cwz.a("&enableSocialButton=", "&alreadyPublished=", "&hasLiveOrSettledEvent=", false, boolValueOf.booleanValue());
        mng.a("&username=", null, "&avatarUri=", sbA, false);
        sbA.append((String) null);
        String string = sbA.toString();
        StringBuilder sbA2 = crh0.a(strA2, "?imageUri=", str6, "&imageWithUserUri=", str7);
        sbA2.append("&linkUrl=");
        sbA2.append(str3);
        sbA2.append("&isSingleBetBuilder=");
        sbA2.append(zX);
        sh8.c().e(kwi.a(sbA2, "&shareCode=", str8, string, "&source=code_hub_following"));
        return Unit.a;
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        layoutInflater.getClass();
        Context contextRequireContext = requireContext();
        contextRequireContext.getClass();
        return mla.a(contextRequireContext, new op8(1491882997, new Function2() { // from class: c6i
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                a aVar = (a) obj;
                int iIntValue = ((Integer) obj2).intValue();
                int i = 0;
                if (aVar.q(iIntValue & 1, (iIntValue & 3) != 2)) {
                    final n6i n6iVar = this.a;
                    u7i u7iVar = (u7i) n6iVar.A.getValue();
                    boolean zA = aVar.A(n6iVar);
                    Object objY = aVar.y();
                    a.C0041a.C0042a c0042a = a.C0041a.a;
                    if (zA || objY == c0042a) {
                        objY = new d6i(n6iVar, i);
                        aVar.r(objY);
                    }
                    Function0 function0 = (Function0) objY;
                    boolean zA2 = aVar.A(n6iVar);
                    Object objY2 = aVar.y();
                    if (zA2 || objY2 == c0042a) {
                        objY2 = new e6i(n6iVar, i);
                        aVar.r(objY2);
                    }
                    Function0 function1 = (Function0) objY2;
                    boolean zA3 = aVar.A(n6iVar);
                    Object objY3 = aVar.y();
                    if (zA3 || objY3 == c0042a) {
                        objY3 = new Function2() { // from class: f6i
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj3, Object obj4) {
                                String str = (String) obj3;
                                b6i.e eVar = (b6i.e) obj4;
                                str.getClass();
                                eVar.getClass();
                                n6i n6iVar2 = n6iVar;
                                ej5.c(ebs.a(n6iVar2.getLifecycle()), null, null, n6iVar2.new a(str, eVar, null), 3);
                                return Unit.a;
                            }
                        };
                        aVar.r(objY3);
                    }
                    Function2 function2 = (Function2) objY3;
                    boolean zA4 = aVar.A(n6iVar);
                    Object objY4 = aVar.y();
                    if (zA4 || objY4 == c0042a) {
                        objY4 = new Function1() { // from class: g6i
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj3) {
                                b6i.c cVar = (b6i.c) obj3;
                                cVar.getClass();
                                Integer num = cVar.d;
                                n6i n6iVar2 = n6iVar;
                                if (num != null && num.intValue() == 10000) {
                                    Throwable th = cVar.f;
                                    if (th != null) {
                                        n6iVar2.m0(th);
                                    } else {
                                        List<Event> list = cVar.c;
                                        if (list != null) {
                                            azm azmVar = n6iVar2.f;
                                            if (azmVar == null) {
                                                Intrinsics.n("router");
                                                throw null;
                                            }
                                            wae waeVar = wae.MULTI_MAKER;
                                            int i2 = MultiMakerActivity.E;
                                            ArrayList arrayListA = sd9.a(list);
                                            String str = cVar.a;
                                            bew bewVar = bew.ADD_TO_BETSLIP_DIRECTLY;
                                            azmVar.e(waeVar, MultiMakerActivity.a.b(true, "FOLLOWING_AT_CODEHUB", 1, null, str, arrayListA, 145));
                                        }
                                    }
                                } else {
                                    n6iVar2.n0(cVar.e);
                                }
                                return Unit.a;
                            }
                        };
                        aVar.r(objY4);
                    }
                    Function1 function3 = (Function1) objY4;
                    boolean zA5 = aVar.A(n6iVar);
                    Object objY5 = aVar.y();
                    if (zA5 || objY5 == c0042a) {
                        objY5 = new Function1() { // from class: h6i
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj3) {
                                b6i.a aVar2 = (b6i.a) obj3;
                                aVar2.getClass();
                                Integer num = aVar2.d;
                                String str = aVar2.a;
                                n6i n6iVar2 = n6iVar;
                                if (num != null && num.intValue() == 10000) {
                                    Throwable th = aVar2.f;
                                    if (th != null) {
                                        n6iVar2.m0(th);
                                    } else {
                                        iym iymVar = n6iVar2.w;
                                        if (iymVar == null) {
                                            Intrinsics.n("openTelemetryLogger");
                                            throw null;
                                        }
                                        PageMeta.INSTANCE.getClass();
                                        iymVar.f(AnalyticsEvent.CODE_HUB_FOLLOWING_ADD_TO_BETSLIP, new PageMeta("codehub", null));
                                        vg40 vg40Var = n6iVar2.y;
                                        if (vg40Var == null) {
                                            Intrinsics.n("recentCodeRepo");
                                            throw null;
                                        }
                                        vg40Var.e(str);
                                        boolean zIsEmpty = ((ArrayList) iu2.d()).isEmpty();
                                        List<Event> list = aVar2.c;
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
                                                                arrayList.add(g880.z(new Selection(event, market, outcome)));
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                            Intent intent = new Intent(n6iVar2.requireContext(), (Class<?>) BetslipActivity.class);
                                            if (!zIsEmpty) {
                                                intent.putExtra("extra_show_replace_dialog", true);
                                                intent.putParcelableArrayListExtra("extra_selection_item", arrayList);
                                            }
                                            intent.putExtra("share_code", str);
                                            bew bewVar = bew.ADD_TO_BETSLIP_DIRECTLY;
                                            intent.putExtra("multi_maker_code_action", 2);
                                            intent.putExtra("action_load_booking_code_from", "FOLLOWING_AT_CODEHUB");
                                            Integer num2 = aVar2.g;
                                            if (num2 != null) {
                                                intent.putExtra("extra_booking_code_order_type", num2.intValue());
                                            }
                                            n6iVar2.startActivity(intent);
                                        }
                                    }
                                } else {
                                    n6iVar2.n0(aVar2.e);
                                }
                                return Unit.a;
                            }
                        };
                        aVar.r(objY5);
                    }
                    Function1 function4 = (Function1) objY5;
                    boolean zA6 = aVar.A(n6iVar);
                    Object objY6 = aVar.y();
                    if (zA6 || objY6 == c0042a) {
                        objY6 = new i6i(n6iVar, i);
                        aVar.r(objY6);
                    }
                    Function1 function5 = (Function1) objY6;
                    boolean zA7 = aVar.A(n6iVar);
                    Object objY7 = aVar.y();
                    if (zA7 || objY7 == c0042a) {
                        objY7 = new Function2() { // from class: j6i
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj3, Object obj4) {
                                String str = (String) obj3;
                                String str2 = (String) obj4;
                                str.getClass();
                                str2.getClass();
                                if (str.length() != 0 && str2.length() != 0) {
                                    xyd0 xyd0VarA = xyd0.a.a(str, str2, false, null);
                                    e activity = n6iVar.getActivity();
                                    if (activity != null && !activity.isFinishing() && !activity.isDestroyed()) {
                                        xyd0VarA.show(activity.getSupportFragmentManager(), "statisticsDialogFragment");
                                        Unit unit = Unit.a;
                                    }
                                }
                                return Unit.a;
                            }
                        };
                        aVar.r(objY7);
                    }
                    Function2 function6 = (Function2) objY7;
                    boolean zA8 = aVar.A(n6iVar);
                    Object objY8 = aVar.y();
                    if (zA8 || objY8 == c0042a) {
                        objY8 = new Function1() { // from class: k6i
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj3) {
                                String str = (String) obj3;
                                str.getClass();
                                e activity = n6iVar.getActivity();
                                if (activity != null && !activity.isFinishing() && !activity.isDestroyed()) {
                                    int i2 = SocialActivity.b;
                                    activity.startActivity(SocialActivity.a.a(activity, str, false, null, false, false, null));
                                    Unit unit = Unit.a;
                                }
                                return Unit.a;
                            }
                        };
                        aVar.r(objY8);
                    }
                    r7i.c(u7iVar, function0, function1, function2, function3, function4, function5, function6, (Function1) objY8, aVar, 8);
                } else {
                    aVar.G();
                }
                return Unit.a;
            }
        }, true));
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        view.getClass();
        super.onViewCreated(view, bundle);
        b390 b390Var = ftg.a;
        ej5.c(new dqg(this, s9s.a.ON_DESTROY), null, null, new b(new c(null), null), 3);
    }
}
