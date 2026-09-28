package com.sportybet.android.social.presentation;

import android.accounts.Account;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentContainerView;
import androidx.navigation.fragment.NavHostFragment;
import com.sporty.android.core.model.account.AccountInfo;
import com.sporty.android.core.model.service.CountryCodeName;
import com.sportybet.android.gp.tz.R;
import com.sportybet.android.social.domain.SocialRouter$MySocialCreation;
import com.sportybet.android.social.domain.SocialRouter$PersonalSocial;
import com.sportybet.android.social.domain.SocialRouter$SocialEntry;
import com.sportybet.android.social.presentation.SocialActivity;
import com.sportybet.android.widget.LoadingView;
import defpackage.b390;
import defpackage.bb40;
import defpackage.bmy;
import defpackage.br3;
import defpackage.c0d;
import defpackage.cjx;
import defpackage.d3m;
import defpackage.dqg;
import defpackage.ej5;
import defpackage.ftg;
import defpackage.gaj;
import defpackage.ghx;
import defpackage.h5e;
import defpackage.hp0;
import defpackage.ib5;
import defpackage.ifx;
import defpackage.igx;
import defpackage.l80;
import defpackage.mmc;
import defpackage.myh;
import defpackage.s8a0;
import defpackage.s9s;
import defpackage.t8a0;
import defpackage.tje0;
import defpackage.u7a0;
import defpackage.uhg;
import defpackage.uj50;
import defpackage.v1b;
import defpackage.v5b;
import defpackage.vj5;
import defpackage.vym;
import defpackage.w8;
import defpackage.y5b;
import defpackage.yfx;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003:\u0001\u0006B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lcom/sportybet/android/social/presentation/SocialActivity;", "Lpy1;", "Lvym;", "Lbb40;", "<init>", "()V", "a", "africa-bet-android"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class SocialActivity extends d3m implements vym, bb40 {
    public static final /* synthetic */ int b = 0;

    /* JADX INFO: loaded from: classes5.dex */
    public static final class a {
        public static Intent a(Context context, String str, boolean z, String str2, boolean z2, boolean z3, String str3) {
            context.getClass();
            str.getClass();
            Intent intent = new Intent(context, (Class<?>) SocialActivity.class);
            SocialRouter$SocialEntry socialRouter$SocialEntry = SocialRouter$SocialEntry.a;
            SocialRouter$SocialEntry.Data data = new SocialRouter$SocialEntry.Data(str, z, str2, z2, z3, str3);
            socialRouter$SocialEntry.getClass();
            intent.putExtras(vj5.a(new Pair("arg_social_entry_data", data)));
            return intent;
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
                if (!(t instanceof t8a0)) {
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

    @c0d(c = "com.sportybet.android.social.presentation.SocialActivity$onCreate$2", f = "SocialActivity.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class c extends tje0 implements gaj<v5b, t8a0, v1b<? super Unit>, Object> {
        public /* synthetic */ t8a0 a;

        public c(v1b<? super c> v1bVar) {
            super(3, v1bVar);
        }

        @Override // defpackage.gaj
        public final Object invoke(v5b v5bVar, t8a0 t8a0Var, v1b<? super Unit> v1bVar) {
            c cVar = SocialActivity.this.new c(v1bVar);
            cVar.a = t8a0Var;
            return cVar.invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            t8a0 t8a0Var = this.a;
            y5b y5bVar = y5b.a;
            uj50.b(obj);
            ((br3) mmc.a(hp0.A, br3.class)).U().a(SocialActivity.this, t8a0Var.a);
            return Unit.a;
        }
    }

    @Override // defpackage.py1, defpackage.i8
    public final void onAccountChange(final Account account) {
        if (account == null) {
            ftg.a(new s8a0(null));
        } else {
            getAccountHelper().loadAccountInfo(new w8() { // from class: t7a0
                @Override // defpackage.w8
                public final void a(AccountInfo accountInfo, String str, String str2) {
                    int i = SocialActivity.b;
                    ftg.a(new s8a0(account));
                }
            });
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.py1, defpackage.r1k, defpackage.hrl, androidx.fragment.app.e, defpackage.rn8, defpackage.yn8, android.app.Activity
    public final void onCreate(Bundle bundle) {
        Pair pair;
        yfx yfxVarA;
        Boolean boolIsCreator;
        super.onCreate(bundle);
        boolean zBooleanValue = false;
        View viewInflate = getLayoutInflater().inflate(R.layout.activity_social, (ViewGroup) null, false);
        int i = R.id.fragment_container_social_nav_host;
        if (((FragmentContainerView) h5e.a(R.id.fragment_container_social_nav_host, viewInflate)) != null) {
            if (((LoadingView) h5e.a(R.id.social_loading_bar, viewInflate)) != null) {
                setContentView((ConstraintLayout) viewInflate);
                SocialRouter$SocialEntry socialRouter$SocialEntry = SocialRouter$SocialEntry.a;
                Bundle extras = getIntent().getExtras();
                socialRouter$SocialEntry.getClass();
                SocialRouter$SocialEntry.Data data = extras != null ? (SocialRouter$SocialEntry.Data) extras.getParcelable("arg_social_entry_data") : null;
                if (data == null) {
                    SocialRouter$SocialEntry.Data.INSTANCE.getClass();
                    data = SocialRouter$SocialEntry.Data.EMPTY;
                }
                if (data.getUsername().length() == 0 || data.isCreation()) {
                    SocialRouter$MySocialCreation socialRouter$MySocialCreation = SocialRouter$MySocialCreation.a;
                    SocialRouter$MySocialCreation.Data data2 = new SocialRouter$MySocialCreation.Data(data.getUsername(), getCountryManager().getCountryCode(), null, 4, null);
                    socialRouter$MySocialCreation.getClass();
                    pair = new Pair(socialRouter$MySocialCreation, SocialRouter$MySocialCreation.a(data2));
                } else {
                    SocialRouter$PersonalSocial socialRouter$PersonalSocial = SocialRouter$PersonalSocial.a;
                    String username = data.getUsername();
                    boolean zIsCreation = data.isCreation();
                    String bookingCode = data.getBookingCode();
                    boolean zIsCodeLive = data.isCodeLive();
                    boolean previewCode = data.getPreviewCode();
                    CountryCodeName countryCode = getCountryManager().getCountryCode();
                    CountryCodeName countryCode2 = getCountryManager().getCountryCode();
                    CountryCodeName countryCode3 = getCountryManager().getCountryCode();
                    AccountInfo accountInfoLastAccountInfo = getAccountManager().lastAccountInfo();
                    if (accountInfoLastAccountInfo != null && (boolIsCreator = accountInfoLastAccountInfo.isCreator()) != null) {
                        zBooleanValue = boolIsCreator.booleanValue();
                    }
                    SocialRouter$PersonalSocial.Data data3 = new SocialRouter$PersonalSocial.Data(username, zIsCreation, null, bookingCode, zIsCodeLive, previewCode, countryCode, countryCode2, countryCode3, null, 0, 0, false, null, zBooleanValue, data.getInitialTab(), 15876, null);
                    socialRouter$PersonalSocial.getClass();
                    pair = new Pair(socialRouter$PersonalSocial, SocialRouter$PersonalSocial.a(data3));
                }
                cjx cjxVar = (cjx) pair.a;
                Bundle bundle2 = (Bundle) pair.b;
                Fragment fragmentG = getSupportFragmentManager().G(R.id.fragment_container_social_nav_host);
                if (fragmentG != null && (yfxVarA = NavHostFragment.a.a(fragmentG)) != null) {
                    u7a0 u7a0Var = new u7a0();
                    cjxVar.getClass();
                    String uri = cjxVar.getUri();
                    igx igxVar = yfxVarA.b;
                    ghx ghxVar = new ghx(igxVar.t, uri, null);
                    u7a0Var.invoke(ghxVar);
                    igxVar.w(ghxVar.a(), bundle2);
                    ifx ifxVarH = igxVar.h();
                    if (ifxVarH != null) {
                        ifxVarH.a().e(bundle2, "nav_screen_props");
                    }
                }
                b390 b390Var = ftg.a;
                ej5.c(new dqg(this, s9s.a.ON_DESTROY), null, null, new b(new c(null), null), 3);
                return;
            }
            i = R.id.social_loading_bar;
        }
        bmy.a("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
    }
}
