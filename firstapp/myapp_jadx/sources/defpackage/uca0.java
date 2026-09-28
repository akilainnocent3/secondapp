package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.a;
import androidx.fragment.app.Fragment;
import androidx.navigation.fragment.NavHostFragment;
import com.sporty.android.core.model.account.AccountInfo;
import com.sporty.android.core.model.service.CountryCodeName;
import com.sportybet.android.social.domain.SocialRouter$PersonalSocial;
import com.sportybet.android.social.domain.SocialRouter$SocialNetworkSuggested;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Luca0;", "Landroidx/fragment/app/Fragment;", "Lk9j;", "<init>", "()V", "africa-bet-android"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class uca0 extends e3m implements k9j {
    public final q8i0 A;
    public yfx B;
    public azm f;
    public uqm i;
    public mgb0 v;
    public psm w;
    public iym y;
    public final q8i0 z;

    @c0d(c = "com.sportybet.android.event.Events$receiveEvent$1", f = "Events.kt", l = {24}, m = "invokeSuspend", v = 2)
    public static final class a extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public int a;
        public /* synthetic */ Object b;
        public final /* synthetic */ b c;

        /* JADX INFO: renamed from: uca0$a$a, reason: collision with other inner class name */
        public static final class C1171a<T> implements myh {
            public final /* synthetic */ v5b a;
            public final /* synthetic */ b b;

            public C1171a(b bVar, v5b v5bVar) {
                this.b = bVar;
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
        public a(b bVar, v1b v1bVar) {
            super(2, v1bVar);
            this.c = bVar;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            a aVar = new a(this.c, v1bVar);
            aVar.b = obj;
            return aVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) throws Throwable {
            ((a) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
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
            C1171a c1171a = new C1171a(this.c, v5bVar);
            this.b = null;
            this.a = 1;
            b390Var.collect(c1171a, this);
            return y5bVar;
        }
    }

    @c0d(c = "com.sportybet.android.social.presentation.network.SocialNetworkFragment$onViewCreated$1", f = "SocialNetworkFragment.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class b extends tje0 implements gaj<v5b, s8a0, v1b<? super Unit>, Object> {
        public b(v1b<? super b> v1bVar) {
            super(3, v1bVar);
        }

        @Override // defpackage.gaj
        public final Object invoke(v5b v5bVar, s8a0 s8a0Var, v1b<? super Unit> v1bVar) {
            return uca0.this.new b(v1bVar).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            y5b y5bVar = y5b.a;
            uj50.b(obj);
            uca0 uca0Var = uca0.this;
            if (rvi.b(uca0Var)) {
                return Unit.a;
            }
            wfa0 wfa0Var = (wfa0) uca0Var.z.getValue();
            ej5.c(o8i0.d(wfa0Var), null, null, new vfa0(wfa0Var, null), 3);
            x8a0 x8a0Var = (x8a0) uca0Var.A.getValue();
            ej5.c(o8i0.d(x8a0Var), null, null, new z8a0(x8a0Var, null), 3);
            return Unit.a;
        }
    }

    public static final class c extends qlr implements Function0<r8i0.c> {
        public final /* synthetic */ ttr b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(ttr ttrVar) {
            super(0);
            this.b = ttrVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public final r8i0.c invoke() {
            r8i0.c defaultViewModelProviderFactory;
            w8i0 w8i0Var = (w8i0) this.b.getValue();
            iel ielVar = w8i0Var instanceof iel ? (iel) w8i0Var : null;
            return (ielVar == null || (defaultViewModelProviderFactory = ielVar.getDefaultViewModelProviderFactory()) == null) ? uca0.this.getDefaultViewModelProviderFactory() : defaultViewModelProviderFactory;
        }
    }

    public static final class d extends qlr implements Function0<Fragment> {
        public d() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Fragment invoke() {
            return uca0.this;
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
            return (ielVar == null || (defaultViewModelProviderFactory = ielVar.getDefaultViewModelProviderFactory()) == null) ? uca0.this.getDefaultViewModelProviderFactory() : defaultViewModelProviderFactory;
        }
    }

    public static final class i extends qlr implements Function0<Fragment> {
        public i() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Fragment invoke() {
            return uca0.this;
        }
    }

    public static final class j extends qlr implements Function0<w8i0> {
        public final /* synthetic */ i a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(i iVar) {
            super(0);
            this.a = iVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public final w8i0 invoke() {
            return (w8i0) this.a.invoke();
        }
    }

    public static final class k extends qlr implements Function0<v8i0> {
        public final /* synthetic */ ttr a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k(ttr ttrVar) {
            super(0);
            this.a = ttrVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public final v8i0 invoke() {
            return ((w8i0) this.a.getValue()).getViewModelStore();
        }
    }

    public static final class l extends qlr implements Function0<cyb> {
        public final /* synthetic */ ttr a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public l(ttr ttrVar) {
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

    public uca0() {
        d dVar = new d();
        a1s a1sVar = a1s.c;
        ttr ttrVarA = hwr.a(a1sVar, new e(dVar));
        this.z = new q8i0(jq40.a(wfa0.class), new f(ttrVarA), new h(ttrVarA), new g(ttrVarA));
        ttr ttrVarA2 = hwr.a(a1sVar, new j(new i()));
        this.A = new q8i0(jq40.a(x8a0.class), new k(ttrVarA2), new c(ttrVarA2), new l(ttrVarA2));
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        layoutInflater.getClass();
        this.B = NavHostFragment.a.a(this);
        Context contextRequireContext = requireContext();
        contextRequireContext.getClass();
        return mla.a(contextRequireContext, new op8(1781316734, new Function2() { // from class: pca0
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                a aVar = (a) obj;
                int iIntValue = ((Integer) obj2).intValue();
                int i2 = 1;
                int i3 = 0;
                int i4 = 2;
                if (aVar.q(iIntValue & 1, (iIntValue & 3) != 2)) {
                    phx phxVarC = mr10.c(new vkx[0], aVar);
                    final uca0 uca0Var = this.a;
                    wfa0 wfa0Var = (wfa0) uca0Var.z.getValue();
                    x8a0 x8a0Var = (x8a0) uca0Var.A.getValue();
                    boolean zA = aVar.A(uca0Var);
                    Object objY = aVar.y();
                    a.C0041a.C0042a c0042a = a.C0041a.a;
                    if (zA || objY == c0042a) {
                        objY = new qca0(uca0Var, i3);
                        aVar.r(objY);
                    }
                    Function0 function0 = (Function0) objY;
                    boolean zA2 = aVar.A(uca0Var);
                    Object objY2 = aVar.y();
                    if (zA2 || objY2 == c0042a) {
                        objY2 = new oh5(uca0Var, i2);
                        aVar.r(objY2);
                    }
                    Function0 function1 = (Function0) objY2;
                    boolean zA3 = aVar.A(uca0Var);
                    Object objY3 = aVar.y();
                    if (zA3 || objY3 == c0042a) {
                        objY3 = new r1j(uca0Var, i2);
                        aVar.r(objY3);
                    }
                    Function0 function2 = (Function0) objY3;
                    boolean zA4 = aVar.A(uca0Var);
                    Object objY4 = aVar.y();
                    if (zA4 || objY4 == c0042a) {
                        objY4 = new s1j(uca0Var, i4);
                        aVar.r(objY4);
                    }
                    Function1 function3 = (Function1) objY4;
                    boolean zA5 = aVar.A(uca0Var);
                    Object objY5 = aVar.y();
                    if (zA5 || objY5 == c0042a) {
                        objY5 = new Function1() { // from class: rca0
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj3) {
                                xia0 xia0Var = (xia0) obj3;
                                xia0Var.getClass();
                                SocialRouter$SocialNetworkSuggested socialRouter$SocialNetworkSuggested = SocialRouter$SocialNetworkSuggested.a;
                                SocialRouter$SocialNetworkSuggested.Data data = new SocialRouter$SocialNetworkSuggested.Data(xia0Var);
                                socialRouter$SocialNetworkSuggested.getClass();
                                xnu xnuVarA = ej0.a(vj5.a(new Pair("args_social_network_suggested_data", data)));
                                yfx yfxVar = uca0Var.B;
                                if (yfxVar != null) {
                                    wix.a(yfxVar, socialRouter$SocialNetworkSuggested, xnuVarA);
                                    return Unit.a;
                                }
                                Intrinsics.n("navController");
                                throw null;
                            }
                        };
                        aVar.r(objY5);
                    }
                    Function1 function4 = (Function1) objY5;
                    boolean zA6 = aVar.A(uca0Var);
                    Object objY6 = aVar.y();
                    if (zA6 || objY6 == c0042a) {
                        objY6 = new b6e(uca0Var);
                        aVar.r(objY6);
                    }
                    Function2 function5 = (Function2) objY6;
                    boolean zA7 = aVar.A(uca0Var);
                    Object objY7 = aVar.y();
                    if (zA7 || objY7 == c0042a) {
                        objY7 = new Function2() { // from class: sca0
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj3, Object obj4) {
                                Boolean boolIsCreator;
                                String str = (String) obj3;
                                CountryCodeName countryCodeName = (CountryCodeName) obj4;
                                str.getClass();
                                SocialRouter$PersonalSocial socialRouter$PersonalSocial = SocialRouter$PersonalSocial.a;
                                uca0 uca0Var2 = uca0Var;
                                psm psmVar = uca0Var2.w;
                                if (psmVar == null) {
                                    Intrinsics.n("countryManager");
                                    throw null;
                                }
                                CountryCodeName countryCode = psmVar.getCountryCode();
                                mgb0 mgb0Var = uca0Var2.v;
                                if (mgb0Var == null) {
                                    Intrinsics.n("accountStorage");
                                    throw null;
                                }
                                AccountInfo accountInfoLastAccountInfo = mgb0Var.lastAccountInfo();
                                SocialRouter$PersonalSocial.Data data = new SocialRouter$PersonalSocial.Data(str, false, null, null, false, false, countryCodeName, countryCode, countryCodeName, null, 0, 0, false, null, (accountInfoLastAccountInfo == null || (boolIsCreator = accountInfoLastAccountInfo.isCreator()) == null) ? false : boolIsCreator.booleanValue(), null, 48702, null);
                                socialRouter$PersonalSocial.getClass();
                                xnu xnuVarA = ej0.a(SocialRouter$PersonalSocial.a(data));
                                yfx yfxVar = uca0Var2.B;
                                if (yfxVar != null) {
                                    wix.a(yfxVar, socialRouter$PersonalSocial, xnuVarA);
                                    return Unit.a;
                                }
                                Intrinsics.n("navController");
                                throw null;
                            }
                        };
                        aVar.r(objY7);
                    }
                    kda0.b(phxVarC, wfa0Var, x8a0Var, function0, function1, function2, function3, function4, function5, (Function2) objY7, aVar, 576);
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
        ej5.c(new dqg(this, s9s.a.ON_DESTROY), null, null, new a(new b(null), null), 3);
    }
}
