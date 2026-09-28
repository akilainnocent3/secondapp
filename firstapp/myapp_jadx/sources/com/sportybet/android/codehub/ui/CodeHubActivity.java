package com.sportybet.android.codehub.ui;

import android.accounts.Account;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import androidx.viewpager2.widget.ViewPager2;
import com.google.android.material.tabs.TabLayout;
import com.sporty.android.core.model.account.AccountInfo;
import com.sporty.android.core.model.config.bo.enums.BOConfigParam;
import com.sporty.android.core.model.tracking.AnalyticsEvent;
import com.sportybet.android.codehub.ui.CodeHubActivity;
import com.sportybet.android.codehub.ui.a;
import com.sportybet.android.gp.tz.R;
import com.sportybet.android.social.domain.SocialRouter$SocialEntry;
import com.sportybet.android.social.domain.entity.MySocialCreationSource;
import com.sportybet.android.social.presentation.SocialActivity;
import com.sportybet.android.social.presentation.creation.MySocialCreationActivity;
import com.sportybet.core.injection.opentelemetry.PageMeta;
import defpackage.bb40;
import defpackage.br3;
import defpackage.c0d;
import defpackage.cq40;
import defpackage.cyb;
import defpackage.ebs;
import defpackage.ex7;
import defpackage.ftg;
import defpackage.g1i;
import defpackage.gw7;
import defpackage.hp0;
import defpackage.hw7;
import defpackage.hwr;
import defpackage.hx7;
import defpackage.iw7;
import defpackage.iws;
import defpackage.iym;
import defpackage.iz7;
import defpackage.jq40;
import defpackage.jz7;
import defpackage.kzh;
import defpackage.l1f0;
import defpackage.lq1;
import defpackage.mmc;
import defpackage.mpe0;
import defpackage.n6i;
import defpackage.o7d;
import defpackage.oc;
import defpackage.ow7;
import defpackage.pw7;
import defpackage.q8i0;
import defpackage.qlr;
import defpackage.qq1;
import defpackage.r320;
import defpackage.r8i0;
import defpackage.rol;
import defpackage.sh8;
import defpackage.tit;
import defpackage.tje0;
import defpackage.uj50;
import defpackage.uv2;
import defpackage.v1b;
import defpackage.v8i0;
import defpackage.vym;
import defpackage.w8;
import defpackage.wae;
import defpackage.y5b;
import defpackage.yxi;
import defpackage.zi50;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003:\u0001\u0006B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lcom/sportybet/android/codehub/ui/CodeHubActivity;", "Lpy1;", "Lvym;", "Lbb40;", "<init>", "()V", "a", "africa-bet-android"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class CodeHubActivity extends rol implements vym, bb40 {
    public static final /* synthetic */ int v = 0;
    public iym c;
    public lq1 d;
    public final q8i0 b = new q8i0(jq40.a(ex7.class), new f(), new e(), new g());
    public final mpe0 e = hwr.b(new gw7(this, 0));
    public iz7 f = iz7.b;
    public final ArrayList i = new ArrayList();

    public static final class a extends yxi {
        public final ArrayList y;

        public a(androidx.fragment.app.e eVar, ArrayList arrayList) {
            super(eVar);
            this.y = arrayList;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.f
        public final int getItemCount() {
            return this.y.size();
        }

        @Override // defpackage.yxi
        public final Fragment k(int i) {
            return ((l1f0) this.y.get(i)).a;
        }
    }

    public static final class b implements View.OnClickListener {
        public final /* synthetic */ cq40 a;
        public final /* synthetic */ CodeHubActivity b;

        public b(cq40 cq40Var, CodeHubActivity codeHubActivity) {
            this.a = cq40Var;
            this.b = codeHubActivity;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            cq40 cq40Var = this.a;
            if (jCurrentTimeMillis - cq40Var.a < 1200) {
                return;
            }
            cq40Var.a = jCurrentTimeMillis;
            view.getClass();
            int i = CodeHubActivity.v;
            final CodeHubActivity codeHubActivity = this.b;
            oc ocVarB1 = codeHubActivity.B1();
            ocVarB1.i.K();
            ocVarB1.v.setVisibility(0);
            codeHubActivity.getAccountHelper().demandAccount(codeHubActivity, new tit() { // from class: lw7
                @Override // defpackage.tit
                public final void w(Account account, boolean z) {
                    int i2 = CodeHubActivity.v;
                    final CodeHubActivity codeHubActivity2 = codeHubActivity;
                    if (account == null || !codeHubActivity2.getAccountHelper().isLogin()) {
                        codeHubActivity2.z1();
                    } else {
                        codeHubActivity2.getAccountHelper().loadAccountInfo(new w8() { // from class: nw7
                            @Override // defpackage.w8
                            public final void a(AccountInfo accountInfo, String str, String str2) {
                                int i3 = CodeHubActivity.v;
                                CodeHubActivity codeHubActivity3 = codeHubActivity2;
                                codeHubActivity3.z1();
                                iym iymVar = codeHubActivity3.c;
                                if (iymVar == null) {
                                    Intrinsics.n("openTelemetryLogger");
                                    throw null;
                                }
                                iymVar.d(AnalyticsEvent.CODE_HUB_SPORTY_SOCIAL_CLICKED);
                                String lastNickName = codeHubActivity3.getAccountHelper().getLastNickName();
                                if (lastNickName == null) {
                                    lastNickName = "";
                                }
                                String str3 = lastNickName;
                                boolean nickNameVerified = codeHubActivity3.getAccountHelper().getNickNameVerified();
                                try {
                                    zi50.a aVar = zi50.b;
                                    boolean z2 = !nickNameVerified;
                                    Intent intent = new Intent(codeHubActivity3, (Class<?>) SocialActivity.class);
                                    SocialRouter$SocialEntry socialRouter$SocialEntry = SocialRouter$SocialEntry.a;
                                    SocialRouter$SocialEntry.Data data = new SocialRouter$SocialEntry.Data(str3, z2, null, false, false, null);
                                    socialRouter$SocialEntry.getClass();
                                    intent.putExtras(vj5.a(new Pair("arg_social_entry_data", data)));
                                    codeHubActivity3.startActivity(intent);
                                    Unit unit = Unit.a;
                                } catch (Throwable unused) {
                                    zi50.a aVar2 = zi50.b;
                                }
                            }
                        });
                    }
                }
            });
        }
    }

    public static final class c implements View.OnClickListener {
        public final /* synthetic */ cq40 a;
        public final /* synthetic */ CodeHubActivity b;

        public c(cq40 cq40Var, CodeHubActivity codeHubActivity) {
            this.a = cq40Var;
            this.b = codeHubActivity;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            cq40 cq40Var = this.a;
            if (jCurrentTimeMillis - cq40Var.a < 1200) {
                return;
            }
            cq40Var.a = jCurrentTimeMillis;
            view.getClass();
            int i = CodeHubActivity.v;
            final CodeHubActivity codeHubActivity = this.b;
            oc ocVarB1 = codeHubActivity.B1();
            ocVarB1.i.K();
            ocVarB1.v.setVisibility(0);
            codeHubActivity.getAccountHelper().demandAccount(codeHubActivity, new tit() { // from class: jw7
                @Override // defpackage.tit
                public final void w(Account account, boolean z) {
                    int i2 = CodeHubActivity.v;
                    final CodeHubActivity codeHubActivity2 = codeHubActivity;
                    if (account == null || !codeHubActivity2.getAccountHelper().isLogin()) {
                        codeHubActivity2.z1();
                    } else {
                        codeHubActivity2.getAccountHelper().loadAccountInfo(new w8() { // from class: mw7
                            @Override // defpackage.w8
                            public final void a(AccountInfo accountInfo, String str, String str2) {
                                int i3 = CodeHubActivity.v;
                                CodeHubActivity codeHubActivity3 = codeHubActivity2;
                                codeHubActivity3.z1();
                                if (!codeHubActivity3.getAccountHelper().getNickNameVerified()) {
                                    String lastNickName = codeHubActivity3.getAccountHelper().getLastNickName();
                                    if (lastNickName == null) {
                                        lastNickName = "";
                                    }
                                    MySocialCreationSource.CustomCodeCreation customCodeCreation = MySocialCreationSource.CustomCodeCreation.a;
                                    customCodeCreation.getClass();
                                    Intent intent = new Intent(codeHubActivity3, (Class<?>) MySocialCreationActivity.class);
                                    intent.putExtras(vj5.a(new Pair("KEY_MY_SOCIAL_CREATION_SOURCE", customCodeCreation), new Pair("KEY_MY_SOCIAL_CREATION_NAME", lastNickName)));
                                    codeHubActivity3.startActivity(intent);
                                    return;
                                }
                                String lastNickName2 = codeHubActivity3.getAccountHelper().getLastNickName();
                                lastNickName2.getClass();
                                boolean z2 = !codeHubActivity3.getAccountHelper().getNickNameVerified();
                                Intent intent2 = new Intent(codeHubActivity3, (Class<?>) SocialActivity.class);
                                SocialRouter$SocialEntry socialRouter$SocialEntry = SocialRouter$SocialEntry.a;
                                SocialRouter$SocialEntry.Data data = new SocialRouter$SocialEntry.Data(lastNickName2, z2, null, false, false, "CUSTOM_CODES");
                                socialRouter$SocialEntry.getClass();
                                intent2.putExtras(vj5.a(new Pair("arg_social_entry_data", data)));
                                codeHubActivity3.startActivity(intent2);
                            }
                        });
                    }
                }
            });
        }
    }

    @c0d(c = "com.sportybet.android.codehub.ui.CodeHubActivity$onCreate$1", f = "CodeHubActivity.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class d extends tje0 implements Function2<Boolean, v1b<? super Unit>, Object> {
        public /* synthetic */ boolean a;

        public d(v1b<? super d> v1bVar) {
            super(2, v1bVar);
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            d dVar = CodeHubActivity.this.new d(v1bVar);
            dVar.a = ((Boolean) obj).booleanValue();
            return dVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Boolean bool, v1b<? super Unit> v1bVar) {
            Boolean bool2 = bool;
            bool2.booleanValue();
            return ((d) create(bool2, v1bVar)).invokeSuspend(Unit.a);
        }

        /* JADX WARN: Code duplicated, block: B:49:0x00d0  */
        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            int color;
            Object bVar;
            String stringExtra;
            boolean z = this.a;
            y5b y5bVar = y5b.a;
            uj50.b(obj);
            int i = CodeHubActivity.v;
            final CodeHubActivity codeHubActivity = CodeHubActivity.this;
            oc ocVarB1 = codeHubActivity.B1();
            ImageView imageView = ocVarB1.B;
            if (z) {
                imageView.setVisibility(0);
                color = 0;
            } else {
                imageView.setVisibility(8);
                color = codeHubActivity.getColor(R.color.brand_primary);
            }
            ocVarB1.z.setBackgroundColor(color);
            ocVarB1.e.setBackgroundColor(color);
            ocVarB1.f.setBackgroundColor(color);
            ArrayList arrayList = codeHubActivity.i;
            try {
                zi50.a aVar = zi50.b;
                Intent intent = codeHubActivity.getIntent();
                if (intent == null || (stringExtra = intent.getStringExtra("tab_selection")) == null) {
                    stringExtra = "";
                }
                bVar = iz7.valueOf(stringExtra);
            } catch (Throwable th) {
                zi50.a aVar2 = zi50.b;
                bVar = new zi50.b(th);
            }
            if (bVar instanceof zi50.b) {
                bVar = null;
            }
            iz7 iz7VarA1 = (iz7) bVar;
            arrayList.clear();
            if (z) {
                arrayList.add(iz7.a);
            }
            lq1 lq1Var = codeHubActivity.d;
            if (lq1Var == null) {
                Intrinsics.n("boConfigSource");
                throw null;
            }
            if (qq1.a(lq1Var, BOConfigParam.CodehubFilterToggle, false)) {
                arrayList.add(iz7.b);
            }
            lq1 lq1Var2 = codeHubActivity.d;
            if (lq1Var2 == null) {
                Intrinsics.n("boConfigSource");
                throw null;
            }
            if (qq1.a(lq1Var2, BOConfigParam.IsEnableCodeHubLoadCode, false)) {
                arrayList.add(iz7.d);
            }
            arrayList.add(iz7.e);
            arrayList.add(iz7.c);
            lq1 lq1Var3 = codeHubActivity.d;
            if (lq1Var3 == null) {
                Intrinsics.n("boConfigSource");
                throw null;
            }
            codeHubActivity.B1().d.setVisibility(qq1.a(lq1Var3, BOConfigParam.EnableCodeHubCustomCodes, false) ? 0 : 8);
            if (arrayList.isEmpty()) {
                sh8.c().e(o7d.a(wae.HOME));
            }
            if (iz7VarA1 == null) {
                iz7VarA1 = CodeHubActivity.A1(arrayList);
            } else {
                if (!arrayList.contains(iz7VarA1)) {
                    iz7VarA1 = null;
                }
                if (iz7VarA1 == null) {
                    iz7VarA1 = CodeHubActivity.A1(arrayList);
                }
            }
            codeHubActivity.f = iz7VarA1;
            ArrayList arrayList2 = new ArrayList();
            int size = arrayList.size();
            int i2 = 0;
            while (i2 < size) {
                Object obj2 = arrayList.get(i2);
                i2++;
                int iOrdinal = ((iz7) obj2).ordinal();
                if (iOrdinal == 0) {
                    r320 r320Var = new r320();
                    Bundle bundle = new Bundle();
                    bundle.putSerializable("code_hub_type", jz7.c);
                    r320Var.setArguments(bundle);
                    arrayList2.add(new l1f0(r320Var, new com.sportybet.android.codehub.ui.a.c(codeHubActivity.getCMSString(R.string.page_code_hub__world_cup, new Object[0]))));
                } else if (iOrdinal == 1) {
                    r320 r320Var2 = new r320();
                    Bundle bundle2 = new Bundle();
                    bundle2.putSerializable("code_hub_type", jz7.a);
                    bundle2.putString("code_source", codeHubActivity.getIntent().getStringExtra("action_load_booking_code_from"));
                    r320Var2.setArguments(bundle2);
                    arrayList2.add(new l1f0(r320Var2, new com.sportybet.android.codehub.ui.a.c(codeHubActivity.getCMSString(R.string.page_code_hub__popular_codes, new Object[0]))));
                } else if (iOrdinal == 2) {
                    arrayList2.add(new l1f0(new n6i(), new com.sportybet.android.codehub.ui.a.c(codeHubActivity.getCMSString(R.string.personal_page__following, new Object[0]))));
                } else if (iOrdinal == 3) {
                    arrayList2.add(new l1f0(new iws(), new com.sportybet.android.codehub.ui.a.c(codeHubActivity.getCMSString(R.string.page_code_hub__load_code, new Object[0]))));
                } else if (iOrdinal == 5) {
                    r320 r320Var3 = new r320();
                    Bundle bundle3 = new Bundle();
                    bundle3.putSerializable("code_hub_type", jz7.b);
                    r320Var3.setArguments(bundle3);
                    arrayList2.add(new l1f0(r320Var3, new com.sportybet.android.codehub.ui.a.C0226a()));
                }
            }
            final a aVar3 = new a(codeHubActivity, arrayList2);
            ViewPager2 viewPager2 = codeHubActivity.B1().A;
            viewPager2.setUserInputEnabled(false);
            viewPager2.setAdapter(aVar3);
            viewPager2.c(new ow7(codeHubActivity));
            if (arrayList.size() > 1) {
                new com.google.android.material.tabs.c(codeHubActivity.B1().b, codeHubActivity.B1().A, false, false, new com.google.android.material.tabs.c.b() { // from class: kw7
                    @Override // com.google.android.material.tabs.c.b
                    public final void a(TabLayout.g gVar, int i3) {
                        int i4 = CodeHubActivity.v;
                        l1f0 l1f0Var = (l1f0) CollectionsKt.V(i3, aVar3.y);
                        Object cVar = l1f0Var != null ? l1f0Var.b : new a.c("");
                        CodeHubActivity codeHubActivity2 = codeHubActivity;
                        jrc0 jrc0VarA = jrc0.a(LayoutInflater.from(codeHubActivity2));
                        ImageView imageView2 = jrc0VarA.c;
                        TextView textView = jrc0VarA.d;
                        if (cVar instanceof a.C0226a) {
                            imageView2.setVisibility(0);
                            textView.setVisibility(8);
                            imageView2.setImageResource(R.drawable.ic_bet_builder_tab_logo_selected);
                        } else if (cVar instanceof a.c) {
                            textView.setVisibility(0);
                            imageView2.setVisibility(8);
                            textView.setText(((a.c) cVar).a);
                        } else if (!(cVar instanceof a.b)) {
                            uhc.a();
                            return;
                        } else {
                            textView.setVisibility(0);
                            imageView2.setVisibility(8);
                            textView.setText(codeHubActivity2.getString(0));
                        }
                        ConstraintLayout constraintLayout = jrc0VarA.a;
                        constraintLayout.getClass();
                        gVar.c(constraintLayout);
                        gVar.a = cVar;
                    }
                }).a();
                int iIndexOf = arrayList.indexOf(codeHubActivity.f);
                Integer numValueOf = Integer.valueOf(iIndexOf);
                if (iIndexOf < 0) {
                    numValueOf = null;
                }
                TabLayout.g gVarK = codeHubActivity.B1().b.k(numValueOf != null ? numValueOf.intValue() : 0);
                if (gVarK != null) {
                    gVarK.b();
                }
            } else {
                codeHubActivity.B1().b.setVisibility(8);
                codeHubActivity.B1().w.setVisibility(8);
            }
            kzh.d(new g1i(((ex7) codeHubActivity.b.getValue()).w, new pw7(codeHubActivity, null)), ebs.a(codeHubActivity.getLifecycle()));
            return Unit.a;
        }
    }

    public static final class e extends qlr implements Function0<r8i0.c> {
        public e() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final r8i0.c invoke() {
            return CodeHubActivity.this.getDefaultViewModelProviderFactory();
        }
    }

    public static final class f extends qlr implements Function0<v8i0> {
        public f() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final v8i0 invoke() {
            return CodeHubActivity.this.getViewModelStore();
        }
    }

    public static final class g extends qlr implements Function0<cyb> {
        public g() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final cyb invoke() {
            return CodeHubActivity.this.getDefaultViewModelCreationExtras();
        }
    }

    public static iz7 A1(ArrayList arrayList) {
        Object obj;
        Object obj2;
        int size = arrayList.size();
        int i = 0;
        int i2 = 0;
        do {
            obj = null;
            if (i2 >= size) {
                obj2 = null;
                break;
            }
            obj2 = arrayList.get(i2);
            i2++;
        } while (((iz7) obj2) != iz7.a);
        iz7 iz7Var = (iz7) obj2;
        if (iz7Var != null) {
            return iz7Var;
        }
        int size2 = arrayList.size();
        while (i < size2) {
            Object obj3 = arrayList.get(i);
            i++;
            if (((iz7) obj3) == iz7.b) {
                obj = obj3;
                break;
            }
        }
        iz7 iz7Var2 = (iz7) obj;
        if (iz7Var2 != null) {
            return iz7Var2;
        }
        iz7 iz7Var3 = (iz7) CollectionsKt.firstOrNull(arrayList);
        return iz7Var3 == null ? iz7.b : iz7Var3;
    }

    public final oc B1() {
        Object value = this.e.getValue();
        value.getClass();
        return (oc) value;
    }

    @Override // defpackage.py1, defpackage.i8
    public final void onAccountChange(final Account account) {
        if (account == null) {
            ftg.a(new hx7(null));
        } else {
            getAccountHelper().loadAccountInfo(new w8() { // from class: fw7
                @Override // defpackage.w8
                public final void a(AccountInfo accountInfo, String str, String str2) {
                    int i = CodeHubActivity.v;
                    ftg.a(new hx7(account));
                }
            });
        }
    }

    @Override // defpackage.py1, defpackage.r1k, defpackage.hrl, androidx.fragment.app.e, defpackage.rn8, defpackage.yn8, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(B1().a);
        int i = 0;
        if (getCountryManager().O()) {
            B1().z.setTitle(getCMSString(R.string.page_code_hub__new_code_hub_header_title__ZA, new Object[0]));
        }
        kzh.d(new g1i(((ex7) this.b.getValue()).y, new d(null)), ebs.a(getLifecycle()));
        B1().z.getBackBtn().setOnClickListener(new uv2(this, 1));
        B1().e.setOnClickListener(new hw7());
        B1().f.setOnClickListener(new b(new cq40(), this));
        B1().d.setOnClickListener(new c(new cq40(), this));
        B1().c.setOnClickedClose(new iw7(this, i));
        iym iymVar = this.c;
        if (iymVar == null) {
            Intrinsics.n("openTelemetryLogger");
            throw null;
        }
        PageMeta.INSTANCE.getClass();
        iymVar.f(AnalyticsEvent.CODE_HUB_VIEW, new PageMeta("codehub", null));
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0039  */
    @Override // defpackage.rn8, android.app.Activity
    public final void onNewIntent(Intent intent) {
        Object bVar;
        intent.getClass();
        super.onNewIntent(intent);
        try {
            zi50.a aVar = zi50.b;
            String stringExtra = intent.getStringExtra("tab_selection");
            if (stringExtra == null) {
                stringExtra = "";
            }
            bVar = iz7.valueOf(stringExtra);
        } catch (Throwable th) {
            zi50.a aVar2 = zi50.b;
            bVar = new zi50.b(th);
        }
        if (bVar instanceof zi50.b) {
            bVar = null;
        }
        iz7 iz7VarA1 = (iz7) bVar;
        ArrayList arrayList = this.i;
        if (iz7VarA1 == null) {
            iz7VarA1 = A1(arrayList);
        } else {
            if (!arrayList.contains(iz7VarA1)) {
                iz7VarA1 = null;
            }
            if (iz7VarA1 == null) {
                iz7VarA1 = A1(arrayList);
            }
        }
        this.f = iz7VarA1;
        if (arrayList.size() > 1) {
            int iIndexOf = arrayList.indexOf(this.f);
            Integer numValueOf = iIndexOf >= 0 ? Integer.valueOf(iIndexOf) : null;
            TabLayout.g gVarK = B1().b.k(numValueOf != null ? numValueOf.intValue() : 0);
            if (gVarK != null) {
                gVarK.b();
            }
        }
    }

    @Override // defpackage.py1, androidx.fragment.app.e, android.app.Activity
    public final void onPause() {
        super.onPause();
        ((br3) mmc.a(hp0.A, br3.class)).U().a(this, false);
    }

    @Override // defpackage.py1, androidx.fragment.app.e, android.app.Activity
    public final void onResume() {
        super.onResume();
        ((br3) mmc.a(hp0.A, br3.class)).U().a(this, true);
    }

    public final void z1() {
        oc ocVarB1 = B1();
        ocVarB1.i.E();
        ocVarB1.v.setVisibility(8);
    }
}
