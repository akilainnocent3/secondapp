package com.sportybet.android.share.presentation.activity;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.drawable.GradientDrawable;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.CompoundButton;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.activity.result.ActivityResult;
import androidx.appcompat.widget.SwitchCompat;
import androidx.compose.runtime.a;
import androidx.compose.ui.platform.ComposeView;
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.gms.common.annotation.LjLk.llGRV;
import com.sporty.android.common.network.data.BaseResponse;
import com.sporty.android.common_ui.uitext.ResourceUiText;
import com.sporty.android.common_ui.uitext.StringUiText;
import com.sporty.android.common_ui.uitext.UiText;
import com.sporty.android.common_ui.widgets.CircleImageView;
import com.sporty.android.common_ui.widgets.LoadingViewNew;
import com.sporty.android.core.model.account.AccountInfo;
import com.sporty.android.core.model.config.bo.enums.BOConfigParam;
import com.sporty.android.core.model.gift.GiftGroup;
import com.sporty.android.core.model.tracking.AnalyticsEvent;
import com.sporty.android.core.model.tracking.AnalyticsParam;
import com.sportybet.android.bookingcode.presentation.activity.CustomCodeComposeUtil;
import com.sportybet.android.gp.tz.R;
import com.sportybet.android.share.presentation.activity.ShareCodeActivity;
import com.sportybet.android.social.domain.SocialRouter$SocialEntry;
import com.sportybet.android.social.presentation.SocialActivity;
import com.sportybet.android.widget.BubbleView;
import com.sportybet.android.widget.ProgressButton;
import defpackage.a090;
import defpackage.ab90;
import defpackage.aga0;
import defpackage.bb40;
import defpackage.bb90;
import defpackage.bmy;
import defpackage.bnh0;
import defpackage.bwf0;
import defpackage.c090;
import defpackage.ce;
import defpackage.cyb;
import defpackage.dvc;
import defpackage.e0y;
import defpackage.ee;
import defpackage.ej5;
import defpackage.eja0;
import defpackage.f00;
import defpackage.f190;
import defpackage.fbh0;
import defpackage.fkl;
import defpackage.g08;
import defpackage.g9i0;
import defpackage.gbn;
import defpackage.gm40;
import defpackage.h5e;
import defpackage.haj;
import defpackage.i2i;
import defpackage.itf0;
import defpackage.j190;
import defpackage.jp00;
import defpackage.jpu;
import defpackage.jq40;
import defpackage.jrm;
import defpackage.jz80;
import defpackage.k00;
import defpackage.k9j;
import defpackage.kb5;
import defpackage.kz80;
import defpackage.l48;
import defpackage.lfy;
import defpackage.lq1;
import defpackage.lvm;
import defpackage.mll0;
import defpackage.n8j0;
import defpackage.nir;
import defpackage.o8i0;
import defpackage.op8;
import defpackage.paj;
import defpackage.q190;
import defpackage.q8i0;
import defpackage.qia0;
import defpackage.qlr;
import defpackage.qoa0;
import defpackage.qq1;
import defpackage.r0b;
import defpackage.r490;
import defpackage.r6i0;
import defpackage.r8i0;
import defpackage.rdd0;
import defpackage.ria0;
import defpackage.rlf;
import defpackage.rws;
import defpackage.saj;
import defpackage.sia0;
import defpackage.sn20;
import defpackage.szx;
import defpackage.tia0;
import defpackage.tlf;
import defpackage.u6i0;
import defpackage.ud;
import defpackage.v8i0;
import defpackage.vgb0;
import defpackage.via0;
import defpackage.vj5;
import defpackage.w430;
import defpackage.x190;
import defpackage.x2m;
import defpackage.x3w;
import defpackage.xl40;
import defpackage.yrh0;
import defpackage.zi50;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.b;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlin.text.StringsKt__StringsKt;
import okhttp3.HttpUrl;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u0005B\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/sportybet/android/share/presentation/activity/ShareCodeActivity;", "Lpy1;", "Landroid/view/View$OnClickListener;", "Lk9j;", "Lbb40;", "Lrlf;", "<init>", "()V", "Landroid/view/View;", "view", "", "onClick", "(Landroid/view/View;)V", "africa-bet-android"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class ShareCodeActivity extends x2m implements View.OnClickListener, k9j, bb40, rlf {
    public static final /* synthetic */ int j0 = 0;
    public Uri E;
    public Uri F;
    public Uri G;
    public Uri H;
    public Uri I;
    public String J;
    public String K;
    public String L;
    public String N;
    public String O;
    public String P;
    public String Q;
    public String R;
    public String S;
    public String T;
    public String U;
    public String V;
    public Bitmap W;
    public boolean X;
    public boolean Y;
    public boolean Z;
    public boolean a0;
    public lq1 b;
    public boolean b0;
    public rdd0 c;
    public com.sporty.android.common.uievent.e d;
    public boolean d0;
    public f190 e;
    public bnh0 f;
    public fbh0 i;
    public jrm v;
    public gbn w;
    public r490 y;
    public final q8i0 z = new q8i0(jq40.a(rws.class), new k(), new j(), new l());
    public final q8i0 A = new q8i0(jq40.a(sn20.class), new n(), new m(), new o());
    public final q8i0 B = new q8i0(jq40.a(eja0.class), new q(), new p(), new r());
    public final q8i0 C = new q8i0(jq40.a(via0.class), new e(), new d(), new f());
    public final q8i0 D = new q8i0(jq40.a(bb90.class), new h(), new g(), new i());
    public String M = "";
    public q190 c0 = q190.a;
    public final ArrayList e0 = new ArrayList();
    public final long f0 = System.currentTimeMillis();
    public final a g0 = new a();
    public final ee<fkl.a> h0 = registerForActivityResult(new fkl(), new ud() { // from class: gz80
        @Override // defpackage.ud
        public final void a(Object obj) {
            fkl.b bVar = (fkl.b) obj;
            int i2 = ShareCodeActivity.j0;
            bVar.getClass();
            boolean z = bVar instanceof fkl.b.a;
            ShareCodeActivity shareCodeActivity = this.a;
            if (z) {
                shareCodeActivity.setResult(3);
            } else {
                if (!(bVar instanceof fkl.b.C0571b)) {
                    uhc.a();
                    return;
                }
                shareCodeActivity.setResult(2);
            }
            shareCodeActivity.finish();
        }
    });
    public final ee<Intent> i0 = registerForActivityResult(new ce(), new ud() { // from class: hz80
        @Override // defpackage.ud
        public final void a(Object obj) {
            ActivityResult activityResult = (ActivityResult) obj;
            int i2 = ShareCodeActivity.j0;
            activityResult.getClass();
            if (activityResult.a == -1) {
                ShareCodeActivity shareCodeActivity = this.a;
                String str = shareCodeActivity.O;
                if (str != null) {
                    via0 via0VarA1 = shareCodeActivity.A1();
                    lyh<BaseResponse<List<GiftGroup>>> lyhVarR = via0VarA1.a.r(str);
                    StringUiText stringUiText = vch0.a;
                    kzh.d(new pia0(bm50.b(lyhVarR, new ResourceUiText(R.string.common_feedback__something_went_wrong_please_try_again))), o8i0.d(via0VarA1));
                }
                shareCodeActivity.finish();
            }
        }
    });

    public static final class a extends CountDownTimer {
        public a() {
            super(2000L, 1000L);
        }

        @Override // android.os.CountDownTimer
        public final void onFinish() {
            ShareCodeActivity.this.d0 = false;
        }

        @Override // android.os.CountDownTimer
        public final void onTick(long j) {
        }
    }

    public static final /* synthetic */ class b implements j190, paj {
        public b() {
        }

        @Override // defpackage.paj
        public final haj<?> c() {
            return new saj(1, ShareCodeActivity.this, ShareCodeActivity.class, "handlePreviewImage", "handlePreviewImage(Lcom/sportybet/android/share/domain/model/SharePreviewImageData;)V", 0);
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof j190) && (obj instanceof paj)) {
                return Intrinsics.g(c(), ((paj) obj).c());
            }
            return false;
        }

        public final int hashCode() {
            return c().hashCode();
        }
    }

    public static final class c implements lfy, paj {
        public final /* synthetic */ Function1 a;

        public c(Function1 function1) {
            this.a = function1;
        }

        @Override // defpackage.paj
        public final haj<?> c() {
            return this.a;
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof lfy) && (obj instanceof paj)) {
                return Intrinsics.g(c(), ((paj) obj).c());
            }
            return false;
        }

        public final int hashCode() {
            return c().hashCode();
        }

        @Override // defpackage.lfy
        public final /* synthetic */ void u1(Object obj) {
            this.a.invoke(obj);
        }
    }

    public static final class d extends qlr implements Function0<r8i0.c> {
        public d() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final r8i0.c invoke() {
            return ShareCodeActivity.this.getDefaultViewModelProviderFactory();
        }
    }

    public static final class e extends qlr implements Function0<v8i0> {
        public e() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final v8i0 invoke() {
            return ShareCodeActivity.this.getViewModelStore();
        }
    }

    public static final class f extends qlr implements Function0<cyb> {
        public f() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final cyb invoke() {
            return ShareCodeActivity.this.getDefaultViewModelCreationExtras();
        }
    }

    public static final class g extends qlr implements Function0<r8i0.c> {
        public g() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final r8i0.c invoke() {
            return ShareCodeActivity.this.getDefaultViewModelProviderFactory();
        }
    }

    public static final class h extends qlr implements Function0<v8i0> {
        public h() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final v8i0 invoke() {
            return ShareCodeActivity.this.getViewModelStore();
        }
    }

    public static final class i extends qlr implements Function0<cyb> {
        public i() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final cyb invoke() {
            return ShareCodeActivity.this.getDefaultViewModelCreationExtras();
        }
    }

    public static final class j extends qlr implements Function0<r8i0.c> {
        public j() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final r8i0.c invoke() {
            return ShareCodeActivity.this.getDefaultViewModelProviderFactory();
        }
    }

    public static final class k extends qlr implements Function0<v8i0> {
        public k() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final v8i0 invoke() {
            return ShareCodeActivity.this.getViewModelStore();
        }
    }

    public static final class l extends qlr implements Function0<cyb> {
        public l() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final cyb invoke() {
            return ShareCodeActivity.this.getDefaultViewModelCreationExtras();
        }
    }

    public static final class m extends qlr implements Function0<r8i0.c> {
        public m() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final r8i0.c invoke() {
            return ShareCodeActivity.this.getDefaultViewModelProviderFactory();
        }
    }

    public static final class n extends qlr implements Function0<v8i0> {
        public n() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final v8i0 invoke() {
            return ShareCodeActivity.this.getViewModelStore();
        }
    }

    public static final class o extends qlr implements Function0<cyb> {
        public o() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final cyb invoke() {
            return ShareCodeActivity.this.getDefaultViewModelCreationExtras();
        }
    }

    public static final class p extends qlr implements Function0<r8i0.c> {
        public p() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final r8i0.c invoke() {
            return ShareCodeActivity.this.getDefaultViewModelProviderFactory();
        }
    }

    public static final class q extends qlr implements Function0<v8i0> {
        public q() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final v8i0 invoke() {
            return ShareCodeActivity.this.getViewModelStore();
        }
    }

    public static final class r extends qlr implements Function0<cyb> {
        public r() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final cyb invoke() {
            return ShareCodeActivity.this.getDefaultViewModelCreationExtras();
        }
    }

    public final via0 A1() {
        return (via0) this.C.getValue();
    }

    public final rdd0 B1() {
        rdd0 rdd0Var = this.c;
        if (rdd0Var != null) {
            return rdd0Var;
        }
        Intrinsics.n("sportyTrackingUseCase");
        throw null;
    }

    public final void C1() {
        r490 r490Var = this.y;
        if (r490Var == null) {
            Intrinsics.n("binding");
            throw null;
        }
        r490Var.b0.setVisibility(8);
        r490 r490Var2 = this.y;
        if (r490Var2 == null) {
            Intrinsics.n("binding");
            throw null;
        }
        r490Var2.d.setVisibility(8);
        r490 r490Var3 = this.y;
        if (r490Var3 != null) {
            r490Var3.V.setVisibility(8);
        } else {
            Intrinsics.n("binding");
            throw null;
        }
    }

    public final void D1() {
        C1();
        r490 r490Var = this.y;
        if (r490Var == null) {
            Intrinsics.n("binding");
            throw null;
        }
        r490Var.w.setVisibility(8);
        r490 r490Var2 = this.y;
        if (r490Var2 != null) {
            r490Var2.g0.setVisibility(8);
        } else {
            Intrinsics.n("binding");
            throw null;
        }
    }

    public final void E1(final String str, final String str2) {
        r490 r490Var = this.y;
        if (r490Var == null) {
            Intrinsics.n("binding");
            throw null;
        }
        ComposeView composeView = r490Var.U;
        final b bVar = new b();
        composeView.setViewCompositionStrategy(u6i0.c.a);
        composeView.setContent(new op8(1920615274, new Function2() { // from class: k190
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                a aVar = (a) obj;
                int iIntValue = ((Integer) obj2).intValue();
                int i2 = 1;
                if (aVar.q(iIntValue & 1, (iIntValue & 3) != 2)) {
                    String str3 = str;
                    boolean zM = aVar.M(str3);
                    String str4 = str2;
                    boolean zM2 = zM | aVar.M(str4);
                    Object objY = aVar.y();
                    a.C0041a.C0042a c0042a = a.C0041a.a;
                    if (zM2 || objY == c0042a) {
                        StringUiText stringUiText = vch0.a;
                        ResourceUiText resourceUiText = new ResourceUiText(R.string.common_functions__won_pop_up);
                        long jCurrentTimeMillis = System.currentTimeMillis();
                        bwf0 bwf0Var = bwf0.a;
                        objY = b.k(new h190(str3, resourceUiText, bwf0Var.g(jCurrentTimeMillis), i190.a), new h190(str4, new ResourceUiText(R.string.common_functions__ticket_snap), bwf0Var.g(System.currentTimeMillis()), i190.b));
                        aVar.r(objY);
                    }
                    List list = (List) objY;
                    ShareCodeActivity.b bVar2 = bVar;
                    boolean zA = aVar.A(bVar2);
                    Object objY2 = aVar.y();
                    if (zA || objY2 == c0042a) {
                        objY2 = new njr(bVar2, i2);
                        aVar.r(objY2);
                    }
                    p190.b(list, (Function1) objY2, aVar, 0);
                } else {
                    aVar.G();
                }
                return Unit.a;
            }
        }, true));
    }

    public final void F1(View view, w430.h hVar, aga0 aga0Var) {
        J1(view, hVar);
        via0 via0VarA1 = A1();
        r490 r490Var = this.y;
        if (r490Var == null) {
            Intrinsics.n("binding");
            throw null;
        }
        ej5.c(o8i0.d(via0VarA1), null, null, new tia0(via0VarA1, aga0Var, this.f0, r490Var.D.isChecked(), null), 3);
    }

    public final void G1() {
        AccountInfo accountInfo = getAccountHelper().getAccountInfo();
        boolean nicknameVerified = accountInfo != null ? accountInfo.getNicknameVerified() : false;
        String lastNickName = getAccountHelper().getLastNickName();
        if (lastNickName == null) {
            lastNickName = "";
        }
        String str = lastNickName;
        boolean z = !nicknameVerified;
        String str2 = this.K;
        boolean z2 = this.X;
        boolean z3 = z2 && this.Y;
        String str3 = z2 ? "BOOKING_CODES" : null;
        Intent intent = new Intent(this, (Class<?>) SocialActivity.class);
        SocialRouter$SocialEntry socialRouter$SocialEntry = SocialRouter$SocialEntry.a;
        SocialRouter$SocialEntry.Data data = new SocialRouter$SocialEntry.Data(str, z, str2, z3, false, str3);
        socialRouter$SocialEntry.getClass();
        intent.putExtras(vj5.a(new Pair("arg_social_entry_data", data)));
        startActivity(intent);
        finish();
    }

    public final void H1(boolean z) {
        String str = this.K;
        if (str == null) {
            return;
        }
        bnh0 bnh0Var = this.f;
        if (bnh0Var == null) {
            Intrinsics.n("urlCreator");
            throw null;
        }
        String strA = bnh0Var.a("https", new String[0]);
        String str2 = z ? "customCode" : "shareCode";
        HttpUrl httpUrl = HttpUrl.INSTANCE.parse(strA);
        if (httpUrl == null) {
            kb5.a("Invalid share base URL: ".concat(strA));
            return;
        }
        String string = httpUrl.newBuilder().addQueryParameter(str2, str).build().getI();
        this.J = string;
        if (string != null) {
            via0 via0VarA1 = A1();
            x190 x190Var = via0VarA1.w;
            via0VarA1.w = x190Var != null ? x190.a(x190Var, string, null, null, null, false, 32766) : null;
        }
    }

    public final void I1(String str) {
        if (Intrinsics.g(this.M, "share-loyalty-reward")) {
            f00 f00Var = vgb0.a;
            Bundle bundleA = mll0.a("data", str);
            Unit unit = Unit.a;
            vgb0.b(AnalyticsEvent.SOCIAL_BTN_SHOWED, bundleA);
        }
    }

    public final void J1(View view, w430.h hVar) {
        String str = this.J;
        if (str == null || !StringsKt.M(str, "promotions", false)) {
            return;
        }
        getFullStoryCommonManager().c(view, "promos_page__share_via_".concat(hVar.a));
    }

    public final void K1(int i2) {
        String str = this.P;
        if (str == null) {
            return;
        }
        rdd0 rdd0VarB1 = B1();
        String str2 = this.K;
        long jCurrentTimeMillis = System.currentTimeMillis();
        String str3 = this.N;
        if (str3 == null) {
            str3 = "";
        }
        rdd0VarB1.a(new a090(i2, this.f0, jCurrentTimeMillis, str2, str, str3), k00.d);
    }

    public final void L1() {
        r490 r490Var = this.y;
        if (r490Var == null) {
            Intrinsics.n("binding");
            throw null;
        }
        ImageView imageView = r490Var.E;
        TextView textView = r490Var.G;
        LinearLayout linearLayout = r490Var.B;
        TextView textView2 = r490Var.f;
        TextView textView3 = r490Var.W;
        ImageView imageView2 = r490Var.A;
        TextView textView4 = r490Var.i;
        String str = this.K;
        if (str == null || str.length() == 0) {
            D1();
            return;
        }
        textView4.setVisibility(0);
        textView3.setVisibility(0);
        textView2.setVisibility(0);
        imageView2.setVisibility(0);
        String str2 = this.L;
        if (str2 == null || str2.length() == 0) {
            if (getAccountHelper().hasPersonalPage()) {
                linearLayout.setVisibility(0);
            } else {
                textView.setVisibility(0);
                imageView.setVisibility(0);
            }
            imageView2.setOnClickListener(new View.OnClickListener() { // from class: pz80
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    int i2 = ShareCodeActivity.j0;
                    ShareCodeActivity shareCodeActivity = this.a;
                    shareCodeActivity.K1(9);
                    yrh0.e(shareCodeActivity.K);
                }
            });
            textView4.setText(this.K);
        } else {
            textView2.setText(getCMSString(R.string.page_custom_codes__share_booking_code_title, new Object[0]));
            linearLayout.setVisibility(8);
            textView.setVisibility(8);
            imageView.setVisibility(8);
            imageView2.setOnClickListener(new lvm(this, 1));
            textView4.setText(this.L);
            D1();
        }
        textView3.setText(bwf0.a.g(System.currentTimeMillis()));
    }

    public final void M1() {
        r490 r490Var = this.y;
        if (r490Var == null) {
            Intrinsics.n("binding");
            throw null;
        }
        r490Var.w.setVisibility(8);
        r490 r490Var2 = this.y;
        if (r490Var2 == null) {
            Intrinsics.n("binding");
            throw null;
        }
        r490Var2.g0.setVisibility(8);
        r490 r490Var3 = this.y;
        if (r490Var3 == null) {
            Intrinsics.n("binding");
            throw null;
        }
        r490Var3.b0.setVisibility(0);
        r490 r490Var4 = this.y;
        if (r490Var4 == null) {
            Intrinsics.n("binding");
            throw null;
        }
        r490Var4.d.setVisibility(0);
        r490 r490Var5 = this.y;
        if (r490Var5 == null) {
            Intrinsics.n("binding");
            throw null;
        }
        r490Var5.V.setVisibility(0);
        gbn gbnVar = this.w;
        if (gbnVar == null) {
            Intrinsics.n("imageService");
            throw null;
        }
        String avatarUrl = getAccountHelper().getAvatarUrl();
        r490 r490Var6 = this.y;
        if (r490Var6 != null) {
            gbnVar.e(avatarUrl, r490Var6.c, R.drawable.default_avatar, R.drawable.default_avatar);
        } else {
            Intrinsics.n("binding");
            throw null;
        }
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final void N1() {
        r490 r490Var = this.y;
        if (r490Var == null) {
            Intrinsics.n("binding");
            throw null;
        }
        SwitchCompat switchCompat = r490Var.Q;
        TextView textView = r490Var.R;
        ComposeView composeView = r490Var.N;
        String str = this.Q;
        if (str == null || str.length() == 0) {
            textView.setVisibility(8);
            switchCompat.setVisibility(8);
            composeView.setPadding(0, 0, r0b.a(this, 12), 0);
            composeView.setBackground(null);
            return;
        }
        textView.setVisibility(0);
        switchCompat.setVisibility(0);
        int iA = r0b.a(this, 16);
        int iA2 = r0b.a(this, 4);
        composeView.setPadding(iA, iA2, iA, iA2);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setColor(getColor(R.color.bg_primary_d_lighter));
        gradientDrawable.setStroke(r0b.a(this, 1), getColor(R.color.border_primary));
        gradientDrawable.setCornerRadius(r0b.a(this, 2));
        composeView.setBackground(gradientDrawable);
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        view.getClass();
        if (this.d0) {
            return;
        }
        this.d0 = true;
        this.g0.start();
        r490 r490Var = this.y;
        if (r490Var == null) {
            Intrinsics.n("binding");
            throw null;
        }
        if (view.equals(r490Var.f0)) {
            F1(view, w430.h.WHATSAPP, aga0.c);
            return;
        }
        r490 r490Var2 = this.y;
        if (r490Var2 == null) {
            Intrinsics.n("binding");
            throw null;
        }
        if (view.equals(r490Var2.e0)) {
            F1(view, w430.h.X, aga0.d);
            return;
        }
        r490 r490Var3 = this.y;
        if (r490Var3 == null) {
            Intrinsics.n("binding");
            throw null;
        }
        if (view.equals(r490Var3.Y)) {
            F1(view, w430.h.FACEBOOK, aga0.a);
            return;
        }
        r490 r490Var4 = this.y;
        if (r490Var4 == null) {
            Intrinsics.n("binding");
            throw null;
        }
        if (view.equals(r490Var4.c0)) {
            F1(view, w430.h.TELEGRAM, aga0.b);
            return;
        }
        r490 r490Var5 = this.y;
        if (r490Var5 == null) {
            Intrinsics.n("binding");
            throw null;
        }
        boolean zEquals = view.equals(r490Var5.X);
        long j2 = this.f0;
        if (!zEquals) {
            r490 r490Var6 = this.y;
            if (r490Var6 == null) {
                Intrinsics.n("binding");
                throw null;
            }
            if (!view.equals(r490Var6.K)) {
                r490 r490Var7 = this.y;
                if (r490Var7 == null) {
                    Intrinsics.n("binding");
                    throw null;
                }
                if (view.equals(r490Var7.a0)) {
                    via0 via0VarA1 = A1();
                    ej5.c(o8i0.d(via0VarA1), null, null, new sia0(via0VarA1, j2, null), 3);
                    return;
                }
                r490 r490Var8 = this.y;
                if (r490Var8 == null) {
                    Intrinsics.n("binding");
                    throw null;
                }
                if (view.equals(r490Var8.Z)) {
                    via0 via0VarA2 = A1();
                    ej5.c(o8i0.d(via0VarA2), null, null, new ria0(via0VarA2, j2, null), 3);
                    return;
                }
                r490 r490Var9 = this.y;
                if (r490Var9 == null) {
                    Intrinsics.n("binding");
                    throw null;
                }
                if (!view.equals(r490Var9.F)) {
                    r490 r490Var10 = this.y;
                    if (r490Var10 == null) {
                        Intrinsics.n("binding");
                        throw null;
                    }
                    if (!view.equals(r490Var10.y)) {
                        r490 r490Var11 = this.y;
                        if (r490Var11 == null) {
                            Intrinsics.n("binding");
                            throw null;
                        }
                        boolean zEquals2 = view.equals(r490Var11.b);
                        r490 r490Var12 = this.y;
                        if (zEquals2) {
                            if (r490Var12 == null) {
                                Intrinsics.n("binding");
                                throw null;
                            }
                            CustomCodeComposeUtil customCodeComposeUtil = r490Var12.z;
                            customCodeComposeUtil.setVisibility(0);
                            String str = this.K;
                            if (str != null) {
                                customCodeComposeUtil.setOnCurrentCode(str);
                            }
                            customCodeComposeUtil.A();
                            return;
                        }
                        if (r490Var12 == null) {
                            Intrinsics.n("binding");
                            throw null;
                        }
                        if (!view.equals(r490Var12.G)) {
                            r490 r490Var13 = this.y;
                            if (r490Var13 == null) {
                                Intrinsics.n("binding");
                                throw null;
                            }
                            if (!view.equals(r490Var13.E)) {
                                r490 r490Var14 = this.y;
                                if (r490Var14 == null) {
                                    Intrinsics.n("binding");
                                    throw null;
                                }
                                if (!view.equals(r490Var14.H)) {
                                    r490 r490Var15 = this.y;
                                    if (r490Var15 == null) {
                                        Intrinsics.n("binding");
                                        throw null;
                                    }
                                    if (view.equals(r490Var15.S)) {
                                        finish();
                                        return;
                                    }
                                    return;
                                }
                            }
                        }
                        K1(8);
                        rws.y1((rws) this.z.getValue(), this.K, g08.SHARE_BOOKING_CODE_LOAD_CODE, null, 28);
                        return;
                    }
                }
                f190 f190Var = this.e;
                if (f190Var == null) {
                    Intrinsics.n("shareNavigator");
                    throw null;
                }
                Uri uri = this.G;
                String string = uri != null ? uri.toString() : null;
                if (string == null) {
                    string = "";
                }
                String str2 = this.K;
                String str3 = str2 != null ? str2 : "";
                String str4 = this.L;
                f190Var.b(string, str3, !(str4 == null || str4.length() == 0));
                return;
            }
        }
        J1(view, w430.h.COPY_LINK);
        via0 via0VarA3 = A1();
        ej5.c(o8i0.d(via0VarA3), null, null, new qia0(via0VarA3, j2, null), 3);
    }

    /* JADX WARN: Code duplicated, block: B:129:0x03a5  */
    /* JADX WARN: Code duplicated, block: B:138:0x03bf  */
    /* JADX WARN: Code duplicated, block: B:147:0x03d5  */
    /* JADX WARN: Code duplicated, block: B:451:0x0943  */
    /* JADX WARN: Code duplicated, block: B:468:0x09a2  */
    /* JADX WARN: Code duplicated, block: B:477:0x09b8  */
    /* JADX WARN: Code duplicated, block: B:499:0x0a14  */
    @Override // defpackage.py1, defpackage.r1k, defpackage.hrl, androidx.fragment.app.e, defpackage.rn8, defpackage.yn8, android.app.Activity
    public final void onCreate(Bundle bundle) throws Throwable {
        q190 q190VarValueOf;
        Uri uri;
        Uri uri2;
        Uri uri3;
        Uri uri4;
        String str;
        List listSplit$default;
        Object bVar;
        n8j0.g cVar;
        super.onCreate(bundle);
        View viewInflate = getLayoutInflater().inflate(R.layout.she_activity_share, (ViewGroup) null, false);
        int i2 = R.id.assign_custom_code;
        TextView textView = (TextView) h5e.a(R.id.assign_custom_code, viewInflate);
        if (textView != null) {
            i2 = R.id.avatar;
            CircleImageView circleImageView = (CircleImageView) h5e.a(R.id.avatar, viewInflate);
            if (circleImageView != null) {
                i2 = R.id.avatar_bar;
                RelativeLayout relativeLayout = (RelativeLayout) h5e.a(R.id.avatar_bar, viewInflate);
                if (relativeLayout != null) {
                    i2 = R.id.betSlip_divider;
                    View viewA = h5e.a(R.id.betSlip_divider, viewInflate);
                    if (viewA != null) {
                        i2 = R.id.betslip_title;
                        TextView textView2 = (TextView) h5e.a(R.id.betslip_title, viewInflate);
                        if (textView2 != null) {
                            i2 = R.id.book_code;
                            TextView textView3 = (TextView) h5e.a(R.id.book_code, viewInflate);
                            if (textView3 != null) {
                                i2 = R.id.book_code_container;
                                LinearLayout linearLayout = (LinearLayout) h5e.a(R.id.book_code_container, viewInflate);
                                if (linearLayout != null) {
                                    i2 = R.id.btn_social_share;
                                    ProgressButton progressButton = (ProgressButton) h5e.a(R.id.btn_social_share, viewInflate);
                                    if (progressButton != null) {
                                        i2 = R.id.btn_zoom;
                                        ImageView imageView = (ImageView) h5e.a(R.id.btn_zoom, viewInflate);
                                        if (imageView != null) {
                                            i2 = R.id.compose_custom_code_sheet;
                                            CustomCodeComposeUtil customCodeComposeUtil = (CustomCodeComposeUtil) h5e.a(R.id.compose_custom_code_sheet, viewInflate);
                                            if (customCodeComposeUtil != null) {
                                                i2 = R.id.copy_code;
                                                ImageView imageView2 = (ImageView) h5e.a(R.id.copy_code, viewInflate);
                                                if (imageView2 != null) {
                                                    i2 = R.id.custom_code_container;
                                                    LinearLayout linearLayout2 = (LinearLayout) h5e.a(R.id.custom_code_container, viewInflate);
                                                    if (linearLayout2 != null) {
                                                        i2 = R.id.display_user_name;
                                                        LinearLayout linearLayout3 = (LinearLayout) h5e.a(R.id.display_user_name, viewInflate);
                                                        if (linearLayout3 != null) {
                                                            i2 = R.id.display_user_name_switch;
                                                            SwitchCompat switchCompat = (SwitchCompat) h5e.a(R.id.display_user_name_switch, viewInflate);
                                                            if (switchCompat != null) {
                                                                i2 = R.id.ic_load_code;
                                                                ImageView imageView3 = (ImageView) h5e.a(R.id.ic_load_code, viewInflate);
                                                                if (imageView3 != null) {
                                                                    i2 = R.id.img_preview;
                                                                    ImageView imageView4 = (ImageView) h5e.a(R.id.img_preview, viewInflate);
                                                                    if (imageView4 != null) {
                                                                        i2 = R.id.load_code;
                                                                        TextView textView4 = (TextView) h5e.a(R.id.load_code, viewInflate);
                                                                        if (textView4 != null) {
                                                                            i2 = R.id.load_code_betslip;
                                                                            TextView textView5 = (TextView) h5e.a(R.id.load_code_betslip, viewInflate);
                                                                            if (textView5 != null) {
                                                                                i2 = R.id.load_code_loading;
                                                                                LoadingViewNew loadingViewNew = (LoadingViewNew) h5e.a(R.id.load_code_loading, viewInflate);
                                                                                if (loadingViewNew != null) {
                                                                                    i2 = R.id.loyalty_reward_share_container;
                                                                                    ConstraintLayout constraintLayout = (ConstraintLayout) h5e.a(R.id.loyalty_reward_share_container, viewInflate);
                                                                                    if (constraintLayout != null) {
                                                                                        i2 = R.id.loyalty_reward_share_copylink;
                                                                                        TextView textView6 = (TextView) h5e.a(R.id.loyalty_reward_share_copylink, viewInflate);
                                                                                        if (textView6 != null) {
                                                                                            i2 = R.id.loyalty_reward_share_divider;
                                                                                            View viewA2 = h5e.a(R.id.loyalty_reward_share_divider, viewInflate);
                                                                                            if (viewA2 != null) {
                                                                                                i2 = R.id.loyalty_reward_share_title;
                                                                                                if (((TextView) h5e.a(R.id.loyalty_reward_share_title, viewInflate)) != null) {
                                                                                                    i2 = R.id.newFeatureAlertView;
                                                                                                    BubbleView bubbleView = (BubbleView) h5e.a(R.id.newFeatureAlertView, viewInflate);
                                                                                                    if (bubbleView != null) {
                                                                                                        i2 = R.id.note_on_bet_view;
                                                                                                        ComposeView composeView = (ComposeView) h5e.a(R.id.note_on_bet_view, viewInflate);
                                                                                                        if (composeView != null) {
                                                                                                            i2 = R.id.preview_container;
                                                                                                            if (((ConstraintLayout) h5e.a(R.id.preview_container, viewInflate)) != null) {
                                                                                                                i2 = R.id.preview_scroll;
                                                                                                                ScrollView scrollView = (ScrollView) h5e.a(R.id.preview_scroll, viewInflate);
                                                                                                                if (scrollView != null) {
                                                                                                                    i2 = R.id.publish_with_note;
                                                                                                                    ConstraintLayout constraintLayout2 = (ConstraintLayout) h5e.a(R.id.publish_with_note, viewInflate);
                                                                                                                    if (constraintLayout2 != null) {
                                                                                                                        i2 = R.id.publish_with_note_switch;
                                                                                                                        SwitchCompat switchCompat2 = (SwitchCompat) h5e.a(R.id.publish_with_note_switch, viewInflate);
                                                                                                                        if (switchCompat2 != null) {
                                                                                                                            i2 = R.id.publish_with_note_switch_label;
                                                                                                                            TextView textView7 = (TextView) h5e.a(R.id.publish_with_note_switch_label, viewInflate);
                                                                                                                            if (textView7 != null) {
                                                                                                                                ConstraintLayout constraintLayout3 = (ConstraintLayout) viewInflate;
                                                                                                                                i2 = R.id.separator;
                                                                                                                                if (((TextView) h5e.a(R.id.separator, viewInflate)) != null) {
                                                                                                                                    i2 = R.id.share_barrier;
                                                                                                                                    if (((Barrier) h5e.a(R.id.share_barrier, viewInflate)) != null) {
                                                                                                                                        i2 = R.id.share_container;
                                                                                                                                        HorizontalScrollView horizontalScrollView = (HorizontalScrollView) h5e.a(R.id.share_container, viewInflate);
                                                                                                                                        if (horizontalScrollView != null) {
                                                                                                                                            i2 = R.id.share_preview_compose;
                                                                                                                                            ComposeView composeView2 = (ComposeView) h5e.a(R.id.share_preview_compose, viewInflate);
                                                                                                                                            if (composeView2 != null) {
                                                                                                                                                i2 = R.id.social_divider_line;
                                                                                                                                                View viewA3 = h5e.a(R.id.social_divider_line, viewInflate);
                                                                                                                                                if (viewA3 != null) {
                                                                                                                                                    i2 = R.id.time;
                                                                                                                                                    TextView textView8 = (TextView) h5e.a(R.id.time, viewInflate);
                                                                                                                                                    if (textView8 != null) {
                                                                                                                                                        i2 = R.id.tv_copylink;
                                                                                                                                                        TextView textView9 = (TextView) h5e.a(R.id.tv_copylink, viewInflate);
                                                                                                                                                        if (textView9 != null) {
                                                                                                                                                            i2 = R.id.tv_display_user_name;
                                                                                                                                                            if (((TextView) h5e.a(R.id.tv_display_user_name, viewInflate)) != null) {
                                                                                                                                                                i2 = R.id.tv_facebook;
                                                                                                                                                                TextView textView10 = (TextView) h5e.a(R.id.tv_facebook, viewInflate);
                                                                                                                                                                if (textView10 != null) {
                                                                                                                                                                    i2 = R.id.tv_more;
                                                                                                                                                                    TextView textView11 = (TextView) h5e.a(R.id.tv_more, viewInflate);
                                                                                                                                                                    if (textView11 != null) {
                                                                                                                                                                        i2 = R.id.tv_save;
                                                                                                                                                                        TextView textView12 = (TextView) h5e.a(R.id.tv_save, viewInflate);
                                                                                                                                                                        if (textView12 != null) {
                                                                                                                                                                            i2 = R.id.tv_social_share_title;
                                                                                                                                                                            TextView textView13 = (TextView) h5e.a(R.id.tv_social_share_title, viewInflate);
                                                                                                                                                                            if (textView13 != null) {
                                                                                                                                                                                i2 = R.id.tv_social_view;
                                                                                                                                                                                if (((TextView) h5e.a(R.id.tv_social_view, viewInflate)) != null) {
                                                                                                                                                                                    i2 = R.id.tv_telegram;
                                                                                                                                                                                    TextView textView14 = (TextView) h5e.a(R.id.tv_telegram, viewInflate);
                                                                                                                                                                                    if (textView14 != null) {
                                                                                                                                                                                        i2 = R.id.tv_title;
                                                                                                                                                                                        TextView textView15 = (TextView) h5e.a(R.id.tv_title, viewInflate);
                                                                                                                                                                                        if (textView15 != null) {
                                                                                                                                                                                            i2 = R.id.tv_twitter;
                                                                                                                                                                                            TextView textView16 = (TextView) h5e.a(R.id.tv_twitter, viewInflate);
                                                                                                                                                                                            if (textView16 != null) {
                                                                                                                                                                                                i2 = R.id.tv_whatsapp;
                                                                                                                                                                                                TextView textView17 = (TextView) h5e.a(R.id.tv_whatsapp, viewInflate);
                                                                                                                                                                                                if (textView17 != null) {
                                                                                                                                                                                                    i2 = R.id.txt_social_hint;
                                                                                                                                                                                                    TextView textView18 = (TextView) h5e.a(R.id.txt_social_hint, viewInflate);
                                                                                                                                                                                                    if (textView18 != null) {
                                                                                                                                                                                                        this.y = new r490(constraintLayout3, textView, circleImageView, relativeLayout, viewA, textView2, textView3, linearLayout, progressButton, imageView, customCodeComposeUtil, imageView2, linearLayout2, linearLayout3, switchCompat, imageView3, imageView4, textView4, textView5, loadingViewNew, constraintLayout, textView6, viewA2, bubbleView, composeView, scrollView, constraintLayout2, switchCompat2, textView7, constraintLayout3, horizontalScrollView, composeView2, viewA3, textView8, textView9, textView10, textView11, textView12, textView13, textView14, textView15, textView16, textView17, textView18);
                                                                                                                                                                                                        setContentView(constraintLayout3);
                                                                                                                                                                                                        boolean z = true;
                                                                                                                                                                                                        char c2 = 1;
                                                                                                                                                                                                        if (Build.VERSION.SDK_INT >= 35) {
                                                                                                                                                                                                            Window window = getWindow();
                                                                                                                                                                                                            qoa0 qoa0Var = new qoa0(window.getDecorView());
                                                                                                                                                                                                            int i3 = Build.VERSION.SDK_INT;
                                                                                                                                                                                                            if (i3 >= 35) {
                                                                                                                                                                                                                cVar = new n8j0.f(window, qoa0Var);
                                                                                                                                                                                                            } else if (i3 >= 30) {
                                                                                                                                                                                                                cVar = new n8j0.d(window, qoa0Var);
                                                                                                                                                                                                            } else {
                                                                                                                                                                                                                cVar = i3 >= 26 ? new n8j0.c(window, qoa0Var) : new n8j0.b(window, qoa0Var);
                                                                                                                                                                                                            }
                                                                                                                                                                                                            cVar.d(true);
                                                                                                                                                                                                            cVar.c(true);
                                                                                                                                                                                                            View viewFindViewById = findViewById(android.R.id.content);
                                                                                                                                                                                                            tlf tlfVar = new tlf(viewFindViewById, z);
                                                                                                                                                                                                            WeakHashMap<View, g9i0> weakHashMap = r6i0.a;
                                                                                                                                                                                                            r6i0.d.n(viewFindViewById, tlfVar);
                                                                                                                                                                                                        } else {
                                                                                                                                                                                                            Window window2 = getWindow();
                                                                                                                                                                                                            window2.addFlags(Integer.MIN_VALUE);
                                                                                                                                                                                                            window2.clearFlags(67108864);
                                                                                                                                                                                                            window2.setStatusBarColor(0);
                                                                                                                                                                                                        }
                                                                                                                                                                                                        Intent intent = getIntent();
                                                                                                                                                                                                        intent.getClass();
                                                                                                                                                                                                        String stringExtra = intent.getStringExtra("imageUri");
                                                                                                                                                                                                        String stringExtra2 = intent.getStringExtra("imageWithUserUri");
                                                                                                                                                                                                        String stringExtra3 = intent.getStringExtra("ticketDetailImageUri");
                                                                                                                                                                                                        if (stringExtra3 == null) {
                                                                                                                                                                                                            stringExtra3 = "";
                                                                                                                                                                                                        }
                                                                                                                                                                                                        String stringExtra4 = intent.getStringExtra("winPopupImageUri");
                                                                                                                                                                                                        if (stringExtra4 == null) {
                                                                                                                                                                                                            stringExtra4 = "";
                                                                                                                                                                                                        }
                                                                                                                                                                                                        String stringExtra5 = intent.getStringExtra("linkUrl");
                                                                                                                                                                                                        String stringExtra6 = intent.getStringExtra("quote");
                                                                                                                                                                                                        String stringExtra7 = intent.getStringExtra("hashtag");
                                                                                                                                                                                                        String stringExtra8 = intent.getStringExtra("description");
                                                                                                                                                                                                        String stringExtra9 = intent.getStringExtra("shareCode");
                                                                                                                                                                                                        String stringExtra10 = intent.getStringExtra("customCode");
                                                                                                                                                                                                        intent.getStringExtra("type");
                                                                                                                                                                                                        intent.getStringExtra("username");
                                                                                                                                                                                                        intent.getStringExtra("avatarUri");
                                                                                                                                                                                                        String stringExtra11 = intent.getStringExtra("userNote");
                                                                                                                                                                                                        String stringExtra12 = intent.getStringExtra("orderId");
                                                                                                                                                                                                        String str2 = stringExtra;
                                                                                                                                                                                                        String str3 = stringExtra2;
                                                                                                                                                                                                        boolean booleanExtra = intent.getBooleanExtra("hideCopy", false);
                                                                                                                                                                                                        boolean booleanExtra2 = intent.getBooleanExtra("alreadyPublished", false);
                                                                                                                                                                                                        boolean booleanExtra3 = intent.getBooleanExtra("hasLiveOrSettledEvent", false);
                                                                                                                                                                                                        boolean booleanExtra4 = intent.getBooleanExtra("isSingleBetBuilder", false);
                                                                                                                                                                                                        String stringExtra13 = intent.getStringExtra("startDestination");
                                                                                                                                                                                                        if (stringExtra13 == null) {
                                                                                                                                                                                                            stringExtra13 = "";
                                                                                                                                                                                                        }
                                                                                                                                                                                                        String stringExtra14 = intent.getStringExtra("source");
                                                                                                                                                                                                        String stringExtra15 = intent.getStringExtra("title");
                                                                                                                                                                                                        int intExtra = intent.getIntExtra("titleStyle", R.style.B2_B);
                                                                                                                                                                                                        int intExtra2 = intent.getIntExtra("titleBottomPadding", 0);
                                                                                                                                                                                                        String stringExtra16 = intent.getStringExtra("showOffType");
                                                                                                                                                                                                        if (stringExtra16 != null) {
                                                                                                                                                                                                            try {
                                                                                                                                                                                                                q190VarValueOf = q190.valueOf(stringExtra16);
                                                                                                                                                                                                            } catch (IllegalArgumentException unused) {
                                                                                                                                                                                                                q190VarValueOf = q190.a;
                                                                                                                                                                                                            }
                                                                                                                                                                                                            if (q190VarValueOf == null) {
                                                                                                                                                                                                                q190VarValueOf = q190.a;
                                                                                                                                                                                                            }
                                                                                                                                                                                                        } else {
                                                                                                                                                                                                            q190VarValueOf = q190.a;
                                                                                                                                                                                                        }
                                                                                                                                                                                                        intent.getStringExtra("platforms");
                                                                                                                                                                                                        if (str2 == null) {
                                                                                                                                                                                                            uri = null;
                                                                                                                                                                                                        } else {
                                                                                                                                                                                                            if (str2.length() <= 0) {
                                                                                                                                                                                                                str2 = null;
                                                                                                                                                                                                            }
                                                                                                                                                                                                            if (str2 != null) {
                                                                                                                                                                                                                uri = Uri.parse(str2);
                                                                                                                                                                                                            } else {
                                                                                                                                                                                                                uri = null;
                                                                                                                                                                                                            }
                                                                                                                                                                                                        }
                                                                                                                                                                                                        this.E = uri;
                                                                                                                                                                                                        if (str3 == null) {
                                                                                                                                                                                                            uri2 = null;
                                                                                                                                                                                                        } else {
                                                                                                                                                                                                            if (str3.length() <= 0) {
                                                                                                                                                                                                                str3 = null;
                                                                                                                                                                                                            }
                                                                                                                                                                                                            if (str3 != null) {
                                                                                                                                                                                                                uri2 = Uri.parse(str3);
                                                                                                                                                                                                            } else {
                                                                                                                                                                                                                uri2 = null;
                                                                                                                                                                                                            }
                                                                                                                                                                                                        }
                                                                                                                                                                                                        this.F = uri2;
                                                                                                                                                                                                        this.U = stringExtra3;
                                                                                                                                                                                                        this.V = stringExtra4;
                                                                                                                                                                                                        this.J = stringExtra5;
                                                                                                                                                                                                        this.N = stringExtra12;
                                                                                                                                                                                                        this.K = stringExtra9;
                                                                                                                                                                                                        this.L = stringExtra10;
                                                                                                                                                                                                        this.X = booleanExtra2;
                                                                                                                                                                                                        this.Y = booleanExtra3;
                                                                                                                                                                                                        this.M = stringExtra13;
                                                                                                                                                                                                        this.P = stringExtra14;
                                                                                                                                                                                                        this.b0 = booleanExtra4;
                                                                                                                                                                                                        this.Q = stringExtra11;
                                                                                                                                                                                                        this.a0 = (stringExtra11 == null || stringExtra11.length() == 0 || this.X) ? false : true;
                                                                                                                                                                                                        this.R = stringExtra8;
                                                                                                                                                                                                        this.S = stringExtra7;
                                                                                                                                                                                                        this.T = stringExtra6;
                                                                                                                                                                                                        this.c0 = q190VarValueOf;
                                                                                                                                                                                                        if (this.X) {
                                                                                                                                                                                                            String str4 = this.L;
                                                                                                                                                                                                            H1(!(str4 == null || str4.length() == 0));
                                                                                                                                                                                                        }
                                                                                                                                                                                                        final r490 r490Var = this.y;
                                                                                                                                                                                                        if (r490Var == null) {
                                                                                                                                                                                                            Intrinsics.n("binding");
                                                                                                                                                                                                            throw null;
                                                                                                                                                                                                        }
                                                                                                                                                                                                        CustomCodeComposeUtil customCodeComposeUtil2 = r490Var.z;
                                                                                                                                                                                                        customCodeComposeUtil2.setOnCodeConfirmedListener(new CustomCodeComposeUtil.a() { // from class: iz80
                                                                                                                                                                                                            @Override // com.sportybet.android.bookingcode.presentation.activity.CustomCodeComposeUtil.a
                                                                                                                                                                                                            public final void a(String str5) {
                                                                                                                                                                                                                int i4 = ShareCodeActivity.j0;
                                                                                                                                                                                                                str5.getClass();
                                                                                                                                                                                                                ShareCodeActivity shareCodeActivity = this;
                                                                                                                                                                                                                shareCodeActivity.L = str5;
                                                                                                                                                                                                                shareCodeActivity.K = str5;
                                                                                                                                                                                                                via0 via0VarA1 = shareCodeActivity.A1();
                                                                                                                                                                                                                x190 x190Var = via0VarA1.w;
                                                                                                                                                                                                                via0VarA1.w = x190Var != null ? x190.a(x190Var, null, str5, null, null, false, 32763) : null;
                                                                                                                                                                                                                shareCodeActivity.L1();
                                                                                                                                                                                                                shareCodeActivity.H1(true);
                                                                                                                                                                                                                r490Var.z.setVisibility(8);
                                                                                                                                                                                                            }
                                                                                                                                                                                                        });
                                                                                                                                                                                                        customCodeComposeUtil2.setOnLoadBetSlip(new jz80());
                                                                                                                                                                                                        r490Var.O.setOnTouchListener(new kz80());
                                                                                                                                                                                                        ImageView imageView5 = r490Var.F;
                                                                                                                                                                                                        ImageView imageView6 = r490Var.y;
                                                                                                                                                                                                        TextView textView19 = r490Var.f0;
                                                                                                                                                                                                        TextView textView20 = r490Var.e0;
                                                                                                                                                                                                        TextView textView21 = r490Var.Y;
                                                                                                                                                                                                        TextView textView22 = r490Var.c0;
                                                                                                                                                                                                        TextView textView23 = r490Var.X;
                                                                                                                                                                                                        TextView textView24 = r490Var.K;
                                                                                                                                                                                                        TextView textView25 = r490Var.a0;
                                                                                                                                                                                                        TextView textView26 = r490Var.Z;
                                                                                                                                                                                                        TextView textView27 = r490Var.G;
                                                                                                                                                                                                        TextView textView28 = r490Var.b;
                                                                                                                                                                                                        TextView textView29 = r490Var.H;
                                                                                                                                                                                                        ImageView imageView7 = r490Var.E;
                                                                                                                                                                                                        ConstraintLayout constraintLayout4 = r490Var.S;
                                                                                                                                                                                                        constraintLayout4.getClass();
                                                                                                                                                                                                        Iterator it = kotlin.collections.b.k(imageView5, imageView6, textView19, textView20, textView21, textView22, textView23, textView24, textView25, textView26, textView27, textView28, textView29, imageView7, constraintLayout4).iterator();
                                                                                                                                                                                                        while (it.hasNext()) {
                                                                                                                                                                                                            ((View) it.next()).setOnClickListener(this);
                                                                                                                                                                                                        }
                                                                                                                                                                                                        r490Var.M.setOnClickedClose(new Function0() { // from class: lz80
                                                                                                                                                                                                            @Override // kotlin.jvm.functions.Function0
                                                                                                                                                                                                            public final Object invoke() {
                                                                                                                                                                                                                int i4 = ShareCodeActivity.j0;
                                                                                                                                                                                                                r490Var.M.setVisibility(8);
                                                                                                                                                                                                                ((sn20) this.A.getValue()).a.b("show_load_code_icon");
                                                                                                                                                                                                                return Unit.a;
                                                                                                                                                                                                            }
                                                                                                                                                                                                        });
                                                                                                                                                                                                        r490Var.D.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: mz80
                                                                                                                                                                                                            @Override // android.widget.CompoundButton.OnCheckedChangeListener
                                                                                                                                                                                                            public final void onCheckedChanged(CompoundButton compoundButton, boolean z2) throws Throwable {
                                                                                                                                                                                                                int i4 = ShareCodeActivity.j0;
                                                                                                                                                                                                                compoundButton.getClass();
                                                                                                                                                                                                                ShareCodeActivity shareCodeActivity = this.a;
                                                                                                                                                                                                                shareCodeActivity.G = z2 ? shareCodeActivity.F : shareCodeActivity.E;
                                                                                                                                                                                                                via0 via0VarA1 = shareCodeActivity.A1();
                                                                                                                                                                                                                Uri uri5 = shareCodeActivity.G;
                                                                                                                                                                                                                x190 x190Var = via0VarA1.w;
                                                                                                                                                                                                                via0VarA1.w = x190Var != null ? x190.a(x190Var, null, null, uri5, null, false, 32735) : null;
                                                                                                                                                                                                                Uri uri6 = shareCodeActivity.G;
                                                                                                                                                                                                                shareCodeActivity.z1();
                                                                                                                                                                                                                if (uri6 == null) {
                                                                                                                                                                                                                    return;
                                                                                                                                                                                                                }
                                                                                                                                                                                                                Bitmap bitmapN = yrh0.n(shareCodeActivity, uri6);
                                                                                                                                                                                                                shareCodeActivity.W = bitmapN;
                                                                                                                                                                                                                r490 r490Var2 = shareCodeActivity.y;
                                                                                                                                                                                                                if (r490Var2 != null) {
                                                                                                                                                                                                                    r490Var2.F.setImageBitmap(bitmapN);
                                                                                                                                                                                                                } else {
                                                                                                                                                                                                                    Intrinsics.n("binding");
                                                                                                                                                                                                                    throw null;
                                                                                                                                                                                                                }
                                                                                                                                                                                                            }
                                                                                                                                                                                                        });
                                                                                                                                                                                                        r490Var.w.setOnClickListener(new View.OnClickListener() { // from class: nz80
                                                                                                                                                                                                            @Override // android.view.View.OnClickListener
                                                                                                                                                                                                            public final void onClick(View view) {
                                                                                                                                                                                                                int i4 = ShareCodeActivity.j0;
                                                                                                                                                                                                                ShareCodeActivity shareCodeActivity = this.a;
                                                                                                                                                                                                                String str5 = shareCodeActivity.K;
                                                                                                                                                                                                                if (str5 == null) {
                                                                                                                                                                                                                    return;
                                                                                                                                                                                                                }
                                                                                                                                                                                                                if (!shareCodeActivity.getAccountHelper().hasPersonalPage() || shareCodeActivity.X) {
                                                                                                                                                                                                                    if (shareCodeActivity.getAccountHelper().hasPersonalPage() || !shareCodeActivity.getAccountHelper().isLogin()) {
                                                                                                                                                                                                                        return;
                                                                                                                                                                                                                    }
                                                                                                                                                                                                                    shareCodeActivity.G1();
                                                                                                                                                                                                                    return;
                                                                                                                                                                                                                }
                                                                                                                                                                                                                r490 r490Var2 = shareCodeActivity.y;
                                                                                                                                                                                                                String str6 = null;
                                                                                                                                                                                                                if (r490Var2 == null) {
                                                                                                                                                                                                                    Intrinsics.n("binding");
                                                                                                                                                                                                                    throw null;
                                                                                                                                                                                                                }
                                                                                                                                                                                                                r490Var2.w.setLoading(true);
                                                                                                                                                                                                                r490 r490Var3 = shareCodeActivity.y;
                                                                                                                                                                                                                if (r490Var3 == null) {
                                                                                                                                                                                                                    Intrinsics.n("binding");
                                                                                                                                                                                                                    throw null;
                                                                                                                                                                                                                }
                                                                                                                                                                                                                r490Var3.w.setClickable(false);
                                                                                                                                                                                                                shareCodeActivity.K1(7);
                                                                                                                                                                                                                String str7 = shareCodeActivity.P;
                                                                                                                                                                                                                if (str7 != null) {
                                                                                                                                                                                                                    r490 r490Var4 = shareCodeActivity.y;
                                                                                                                                                                                                                    if (r490Var4 == null) {
                                                                                                                                                                                                                        Intrinsics.n("binding");
                                                                                                                                                                                                                        throw null;
                                                                                                                                                                                                                    }
                                                                                                                                                                                                                    Map<String, ? extends Object> mapF = kpu.f(new Pair(AnalyticsParam.EVENT_PARAM_WITH_USERNAMES, Boolean.valueOf(r490Var4.D.isChecked())), new Pair(AnalyticsParam.EVENT_PARAM_WITH_NOTE, Boolean.valueOf(shareCodeActivity.a0)), new Pair("source", str7));
                                                                                                                                                                                                                    rdd0 rdd0VarB1 = shareCodeActivity.B1();
                                                                                                                                                                                                                    r490 r490Var5 = shareCodeActivity.y;
                                                                                                                                                                                                                    if (r490Var5 == null) {
                                                                                                                                                                                                                        Intrinsics.n("binding");
                                                                                                                                                                                                                        throw null;
                                                                                                                                                                                                                    }
                                                                                                                                                                                                                    rdd0VarB1.a(new b090(r490Var5.D.isChecked(), shareCodeActivity.a0, str7), k00.d);
                                                                                                                                                                                                                    shareCodeActivity.getFullStoryCommonManager().f(AnalyticsEvent.SOCIAL_PUBLISH_TO_SPORTY_SOCIAL_CLICK, mapF);
                                                                                                                                                                                                                }
                                                                                                                                                                                                                eja0 eja0Var = (eja0) shareCodeActivity.B.getValue();
                                                                                                                                                                                                                String str8 = shareCodeActivity.N;
                                                                                                                                                                                                                if (str8 != null && shareCodeActivity.a0 && !StringsKt.U(str8)) {
                                                                                                                                                                                                                    str6 = str8;
                                                                                                                                                                                                                }
                                                                                                                                                                                                                eja0Var.y1(str5, str6);
                                                                                                                                                                                                            }
                                                                                                                                                                                                        });
                                                                                                                                                                                                        r490Var.c.setOnClickListener(new View.OnClickListener() { // from class: oz80
                                                                                                                                                                                                            @Override // android.view.View.OnClickListener
                                                                                                                                                                                                            public final void onClick(View view) {
                                                                                                                                                                                                                int i4 = ShareCodeActivity.j0;
                                                                                                                                                                                                                this.a.G1();
                                                                                                                                                                                                            }
                                                                                                                                                                                                        });
                                                                                                                                                                                                        if (stringExtra15 != null) {
                                                                                                                                                                                                            r490 r490Var2 = this.y;
                                                                                                                                                                                                            if (r490Var2 == null) {
                                                                                                                                                                                                                Intrinsics.n("binding");
                                                                                                                                                                                                                throw null;
                                                                                                                                                                                                            }
                                                                                                                                                                                                            r490Var2.d0.setText(stringExtra15);
                                                                                                                                                                                                        }
                                                                                                                                                                                                        r490 r490Var3 = this.y;
                                                                                                                                                                                                        if (r490Var3 == null) {
                                                                                                                                                                                                            Intrinsics.n("binding");
                                                                                                                                                                                                            throw null;
                                                                                                                                                                                                        }
                                                                                                                                                                                                        r490Var3.d0.setTextAppearance(intExtra);
                                                                                                                                                                                                        int i4 = (int) ((intExtra2 * getResources().getDisplayMetrics().density) + 0.5f);
                                                                                                                                                                                                        r490 r490Var4 = this.y;
                                                                                                                                                                                                        if (r490Var4 == null) {
                                                                                                                                                                                                            Intrinsics.n("binding");
                                                                                                                                                                                                            throw null;
                                                                                                                                                                                                        }
                                                                                                                                                                                                        r490Var4.d0.setPadding(0, 0, 0, i4);
                                                                                                                                                                                                        r490 r490Var5 = this.y;
                                                                                                                                                                                                        if (r490Var5 == null) {
                                                                                                                                                                                                            Intrinsics.n("binding");
                                                                                                                                                                                                            throw null;
                                                                                                                                                                                                        }
                                                                                                                                                                                                        View view = r490Var5.e;
                                                                                                                                                                                                        TextView textView30 = r490Var5.d0;
                                                                                                                                                                                                        ImageView imageView8 = r490Var5.y;
                                                                                                                                                                                                        TextView textView31 = r490Var5.a0;
                                                                                                                                                                                                        ScrollView scrollView2 = r490Var5.O;
                                                                                                                                                                                                        Uri uri5 = this.E;
                                                                                                                                                                                                        if (uri5 != null) {
                                                                                                                                                                                                            this.G = uri5;
                                                                                                                                                                                                            scrollView2.setVisibility(0);
                                                                                                                                                                                                            textView31.setVisibility(0);
                                                                                                                                                                                                            imageView8.setVisibility(0);
                                                                                                                                                                                                            Uri uri6 = this.E;
                                                                                                                                                                                                            z1();
                                                                                                                                                                                                            if (uri6 != null) {
                                                                                                                                                                                                                Bitmap bitmapN = yrh0.n(this, uri6);
                                                                                                                                                                                                                this.W = bitmapN;
                                                                                                                                                                                                                r490 r490Var6 = this.y;
                                                                                                                                                                                                                if (r490Var6 == null) {
                                                                                                                                                                                                                    Intrinsics.n("binding");
                                                                                                                                                                                                                    throw null;
                                                                                                                                                                                                                }
                                                                                                                                                                                                                r490Var6.F.setImageBitmap(bitmapN);
                                                                                                                                                                                                            }
                                                                                                                                                                                                            textView30.setVisibility(8);
                                                                                                                                                                                                            view.setVisibility(0);
                                                                                                                                                                                                        } else {
                                                                                                                                                                                                            this.G = null;
                                                                                                                                                                                                            scrollView2.setVisibility(8);
                                                                                                                                                                                                            r490Var5.F.setVisibility(8);
                                                                                                                                                                                                            imageView8.setVisibility(8);
                                                                                                                                                                                                            textView31.setVisibility(8);
                                                                                                                                                                                                            textView30.setVisibility(0);
                                                                                                                                                                                                            view.setVisibility(8);
                                                                                                                                                                                                            r490Var5.M.setVisibility(8);
                                                                                                                                                                                                        }
                                                                                                                                                                                                        boolean z2 = (this.F == null || this.E == null) ? false : true;
                                                                                                                                                                                                        r490 r490Var7 = this.y;
                                                                                                                                                                                                        if (r490Var7 == null) {
                                                                                                                                                                                                            Intrinsics.n("binding");
                                                                                                                                                                                                            throw null;
                                                                                                                                                                                                        }
                                                                                                                                                                                                        r490Var7.C.setVisibility(z2 ? 0 : 8);
                                                                                                                                                                                                        r490 r490Var8 = this.y;
                                                                                                                                                                                                        if (r490Var8 == null) {
                                                                                                                                                                                                            Intrinsics.n("binding");
                                                                                                                                                                                                            throw null;
                                                                                                                                                                                                        }
                                                                                                                                                                                                        r490Var8.D.setEnabled(z2);
                                                                                                                                                                                                        r490 r490Var9 = this.y;
                                                                                                                                                                                                        if (r490Var9 == null) {
                                                                                                                                                                                                            Intrinsics.n("binding");
                                                                                                                                                                                                            throw null;
                                                                                                                                                                                                        }
                                                                                                                                                                                                        r490Var9.D.setChecked(false);
                                                                                                                                                                                                        r490 r490Var10 = this.y;
                                                                                                                                                                                                        if (r490Var10 == null) {
                                                                                                                                                                                                            Intrinsics.n("binding");
                                                                                                                                                                                                            throw null;
                                                                                                                                                                                                        }
                                                                                                                                                                                                        TextView textView32 = r490Var10.X;
                                                                                                                                                                                                        textView32.setVisibility((this.J == null || booleanExtra) ? 8 : 0);
                                                                                                                                                                                                        String str5 = this.N;
                                                                                                                                                                                                        if (str5 != null && str5.length() != 0) {
                                                                                                                                                                                                            textView32.setVisibility(8);
                                                                                                                                                                                                            r490Var10.f0.setVisibility(0);
                                                                                                                                                                                                            r490Var10.a0.setVisibility(8);
                                                                                                                                                                                                        }
                                                                                                                                                                                                        if (Intrinsics.g(this.M, "share-loyalty-reward")) {
                                                                                                                                                                                                            r490 r490Var11 = this.y;
                                                                                                                                                                                                            if (r490Var11 == null) {
                                                                                                                                                                                                                Intrinsics.n("binding");
                                                                                                                                                                                                                throw null;
                                                                                                                                                                                                            }
                                                                                                                                                                                                            r490Var11.X.setVisibility(8);
                                                                                                                                                                                                            r490 r490Var12 = this.y;
                                                                                                                                                                                                            if (r490Var12 == null) {
                                                                                                                                                                                                                Intrinsics.n("binding");
                                                                                                                                                                                                                throw null;
                                                                                                                                                                                                            }
                                                                                                                                                                                                            r490Var12.J.setVisibility(0);
                                                                                                                                                                                                            r490 r490Var13 = this.y;
                                                                                                                                                                                                            if (r490Var13 == null) {
                                                                                                                                                                                                                Intrinsics.n("binding");
                                                                                                                                                                                                                throw null;
                                                                                                                                                                                                            }
                                                                                                                                                                                                            r490Var13.d0.setVisibility(8);
                                                                                                                                                                                                        }
                                                                                                                                                                                                        lq1 lq1Var = this.b;
                                                                                                                                                                                                        if (lq1Var == null) {
                                                                                                                                                                                                            Intrinsics.n("boConfigSource");
                                                                                                                                                                                                            throw null;
                                                                                                                                                                                                        }
                                                                                                                                                                                                        this.Z = qq1.a(lq1Var, BOConfigParam.IsEnableCreateSocialPage, false);
                                                                                                                                                                                                        if (getAccountHelper().hasPersonalPage()) {
                                                                                                                                                                                                            if (this.X) {
                                                                                                                                                                                                                M1();
                                                                                                                                                                                                            } else {
                                                                                                                                                                                                                C1();
                                                                                                                                                                                                                if (this.Z) {
                                                                                                                                                                                                                    r490 r490Var14 = this.y;
                                                                                                                                                                                                                    if (r490Var14 == null) {
                                                                                                                                                                                                                        Intrinsics.n("binding");
                                                                                                                                                                                                                        throw null;
                                                                                                                                                                                                                    }
                                                                                                                                                                                                                    r490Var14.w.setVisibility(0);
                                                                                                                                                                                                                    r490 r490Var15 = this.y;
                                                                                                                                                                                                                    if (r490Var15 == null) {
                                                                                                                                                                                                                        Intrinsics.n("binding");
                                                                                                                                                                                                                        throw null;
                                                                                                                                                                                                                    }
                                                                                                                                                                                                                    r490Var15.g0.setVisibility(0);
                                                                                                                                                                                                                    r490 r490Var16 = this.y;
                                                                                                                                                                                                                    if (r490Var16 == null) {
                                                                                                                                                                                                                        Intrinsics.n("binding");
                                                                                                                                                                                                                        throw null;
                                                                                                                                                                                                                    }
                                                                                                                                                                                                                    r490Var16.w.setButtonText(R.string.personal_page__publish_to_sportysocial);
                                                                                                                                                                                                                    r490 r490Var17 = this.y;
                                                                                                                                                                                                                    if (r490Var17 == null) {
                                                                                                                                                                                                                        Intrinsics.n("binding");
                                                                                                                                                                                                                        throw null;
                                                                                                                                                                                                                    }
                                                                                                                                                                                                                    r490Var17.g0.setText(getCMSString(R.string.personal_page__share_your_upcoming_code_on_sportysocial, new Object[0]));
                                                                                                                                                                                                                }
                                                                                                                                                                                                            }
                                                                                                                                                                                                            if (this.Y) {
                                                                                                                                                                                                                r490 r490Var18 = this.y;
                                                                                                                                                                                                                if (r490Var18 == null) {
                                                                                                                                                                                                                    Intrinsics.n("binding");
                                                                                                                                                                                                                    throw null;
                                                                                                                                                                                                                }
                                                                                                                                                                                                                r490Var18.w.setButtonText(R.string.personal_page__publish_to_sportysocial);
                                                                                                                                                                                                                r490 r490Var19 = this.y;
                                                                                                                                                                                                                if (r490Var19 == null) {
                                                                                                                                                                                                                    Intrinsics.n("binding");
                                                                                                                                                                                                                    throw null;
                                                                                                                                                                                                                }
                                                                                                                                                                                                                r490Var19.g0.setText(getCMSString(R.string.personal_page__share_your_upcoming_code_on_sportysocial, new Object[0]));
                                                                                                                                                                                                            }
                                                                                                                                                                                                        } else {
                                                                                                                                                                                                            D1();
                                                                                                                                                                                                            if (getAccountHelper().isLogin() && this.Z) {
                                                                                                                                                                                                                r490 r490Var20 = this.y;
                                                                                                                                                                                                                if (r490Var20 == null) {
                                                                                                                                                                                                                    Intrinsics.n("binding");
                                                                                                                                                                                                                    throw null;
                                                                                                                                                                                                                }
                                                                                                                                                                                                                r490Var20.w.setButtonText(R.string.personal_page__create_my_sportysocial);
                                                                                                                                                                                                                r490 r490Var21 = this.y;
                                                                                                                                                                                                                if (r490Var21 == null) {
                                                                                                                                                                                                                    Intrinsics.n("binding");
                                                                                                                                                                                                                    throw null;
                                                                                                                                                                                                                }
                                                                                                                                                                                                                r490Var21.g0.setText(getCMSString(R.string.personal_page__click_to_create_and_share_to_your_sportysocial, new Object[0]));
                                                                                                                                                                                                                r490 r490Var22 = this.y;
                                                                                                                                                                                                                if (r490Var22 == null) {
                                                                                                                                                                                                                    Intrinsics.n("binding");
                                                                                                                                                                                                                    throw null;
                                                                                                                                                                                                                }
                                                                                                                                                                                                                r490Var22.w.setVisibility(0);
                                                                                                                                                                                                                r490 r490Var23 = this.y;
                                                                                                                                                                                                                if (r490Var23 == null) {
                                                                                                                                                                                                                    Intrinsics.n("binding");
                                                                                                                                                                                                                    throw null;
                                                                                                                                                                                                                }
                                                                                                                                                                                                                r490Var23.g0.setVisibility(0);
                                                                                                                                                                                                            }
                                                                                                                                                                                                        }
                                                                                                                                                                                                        String str6 = this.N;
                                                                                                                                                                                                        if (str6 != null) {
                                                                                                                                                                                                            if (StringsKt.U(str6)) {
                                                                                                                                                                                                                str6 = null;
                                                                                                                                                                                                            }
                                                                                                                                                                                                            if (str6 != null) {
                                                                                                                                                                                                                r490 r490Var24 = this.y;
                                                                                                                                                                                                                if (r490Var24 == null) {
                                                                                                                                                                                                                    Intrinsics.n("binding");
                                                                                                                                                                                                                    throw null;
                                                                                                                                                                                                                }
                                                                                                                                                                                                                r490Var24.P.setVisibility(0);
                                                                                                                                                                                                                r490 r490Var25 = this.y;
                                                                                                                                                                                                                if (r490Var25 == null) {
                                                                                                                                                                                                                    Intrinsics.n("binding");
                                                                                                                                                                                                                    throw null;
                                                                                                                                                                                                                }
                                                                                                                                                                                                                szx.b(r490Var25.N, this.Q, str6, e0y.ShareBet, new dvc(this, c2 == true ? 1 : 0));
                                                                                                                                                                                                                r490 r490Var26 = this.y;
                                                                                                                                                                                                                if (r490Var26 == null) {
                                                                                                                                                                                                                    Intrinsics.n("binding");
                                                                                                                                                                                                                    throw null;
                                                                                                                                                                                                                }
                                                                                                                                                                                                                r490Var26.Q.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: fz80
                                                                                                                                                                                                                    @Override // android.widget.CompoundButton.OnCheckedChangeListener
                                                                                                                                                                                                                    public final void onCheckedChanged(CompoundButton compoundButton, boolean z3) {
                                                                                                                                                                                                                        boolean z4;
                                                                                                                                                                                                                        x190 x190VarA;
                                                                                                                                                                                                                        String str7;
                                                                                                                                                                                                                        int i5 = ShareCodeActivity.j0;
                                                                                                                                                                                                                        compoundButton.getClass();
                                                                                                                                                                                                                        ShareCodeActivity shareCodeActivity = this.a;
                                                                                                                                                                                                                        shareCodeActivity.a0 = z3;
                                                                                                                                                                                                                        via0 via0VarA1 = shareCodeActivity.A1();
                                                                                                                                                                                                                        x190 x190Var = via0VarA1.w;
                                                                                                                                                                                                                        if (x190Var != null) {
                                                                                                                                                                                                                            z4 = z3;
                                                                                                                                                                                                                            x190VarA = x190.a(x190Var, null, null, null, null, z4, 32255);
                                                                                                                                                                                                                        } else {
                                                                                                                                                                                                                            z4 = z3;
                                                                                                                                                                                                                            x190VarA = null;
                                                                                                                                                                                                                        }
                                                                                                                                                                                                                        via0VarA1.w = x190VarA;
                                                                                                                                                                                                                        r490 r490Var27 = shareCodeActivity.y;
                                                                                                                                                                                                                        if (r490Var27 != null) {
                                                                                                                                                                                                                            r490Var27.N.setVisibility((z4 || (str7 = shareCodeActivity.Q) == null || str7.length() == 0) ? 0 : 8);
                                                                                                                                                                                                                        } else {
                                                                                                                                                                                                                            Intrinsics.n("binding");
                                                                                                                                                                                                                            throw null;
                                                                                                                                                                                                                        }
                                                                                                                                                                                                                    }
                                                                                                                                                                                                                });
                                                                                                                                                                                                                String str7 = this.Q;
                                                                                                                                                                                                                if (str7 == null || str7.length() == 0) {
                                                                                                                                                                                                                    r490 r490Var27 = this.y;
                                                                                                                                                                                                                    if (r490Var27 == null) {
                                                                                                                                                                                                                        Intrinsics.n("binding");
                                                                                                                                                                                                                        throw null;
                                                                                                                                                                                                                    }
                                                                                                                                                                                                                    r490Var27.N.setVisibility(0);
                                                                                                                                                                                                                } else {
                                                                                                                                                                                                                    r490 r490Var28 = this.y;
                                                                                                                                                                                                                    if (r490Var28 == null) {
                                                                                                                                                                                                                        Intrinsics.n("binding");
                                                                                                                                                                                                                        throw null;
                                                                                                                                                                                                                    }
                                                                                                                                                                                                                    r490Var28.Q.setChecked(this.a0);
                                                                                                                                                                                                                }
                                                                                                                                                                                                                N1();
                                                                                                                                                                                                            }
                                                                                                                                                                                                        }
                                                                                                                                                                                                        L1();
                                                                                                                                                                                                        String stringExtra17 = getIntent().getStringExtra("platforms");
                                                                                                                                                                                                        ArrayList arrayList = this.e0;
                                                                                                                                                                                                        if (stringExtra17 != null && (listSplit$default = StringsKt__StringsKt.split$default(stringExtra17, new String[]{","}, false, 0, 6, null)) != null) {
                                                                                                                                                                                                            ArrayList arrayList2 = new ArrayList(l48.r(listSplit$default, 10));
                                                                                                                                                                                                            Iterator it2 = listSplit$default.iterator();
                                                                                                                                                                                                            while (it2.hasNext()) {
                                                                                                                                                                                                                arrayList2.add(StringsKt.t0((String) it2.next()).toString());
                                                                                                                                                                                                            }
                                                                                                                                                                                                            int size = arrayList2.size();
                                                                                                                                                                                                            int i5 = 0;
                                                                                                                                                                                                            while (i5 < size) {
                                                                                                                                                                                                                int i6 = i5 + 1;
                                                                                                                                                                                                                String str8 = (String) arrayList2.get(i5);
                                                                                                                                                                                                                try {
                                                                                                                                                                                                                    zi50.a aVar = zi50.b;
                                                                                                                                                                                                                    bVar = aga0.valueOf(str8);
                                                                                                                                                                                                                } catch (Throwable th) {
                                                                                                                                                                                                                    zi50.a aVar2 = zi50.b;
                                                                                                                                                                                                                    bVar = new zi50.b(th);
                                                                                                                                                                                                                }
                                                                                                                                                                                                                if (!(bVar instanceof zi50.b)) {
                                                                                                                                                                                                                    arrayList.add((aga0) bVar);
                                                                                                                                                                                                                }
                                                                                                                                                                                                                if (zi50.a(bVar) != null) {
                                                                                                                                                                                                                    itf0.a.d("Invalid platform: %s", str8);
                                                                                                                                                                                                                }
                                                                                                                                                                                                                i5 = i6;
                                                                                                                                                                                                            }
                                                                                                                                                                                                        }
                                                                                                                                                                                                        if (!arrayList.isEmpty()) {
                                                                                                                                                                                                            r490 r490Var29 = this.y;
                                                                                                                                                                                                            if (r490Var29 == null) {
                                                                                                                                                                                                                Intrinsics.n("binding");
                                                                                                                                                                                                                throw null;
                                                                                                                                                                                                            }
                                                                                                                                                                                                            r490Var29.f0.setVisibility(arrayList.contains(aga0.c) ? 0 : 8);
                                                                                                                                                                                                            r490 r490Var30 = this.y;
                                                                                                                                                                                                            if (r490Var30 == null) {
                                                                                                                                                                                                                Intrinsics.n("binding");
                                                                                                                                                                                                                throw null;
                                                                                                                                                                                                            }
                                                                                                                                                                                                            if (r490Var30.f0.getVisibility() == 0) {
                                                                                                                                                                                                                I1("sporty_loyalty_whatsApp");
                                                                                                                                                                                                            }
                                                                                                                                                                                                            r490 r490Var31 = this.y;
                                                                                                                                                                                                            if (r490Var31 == null) {
                                                                                                                                                                                                                Intrinsics.n("binding");
                                                                                                                                                                                                                throw null;
                                                                                                                                                                                                            }
                                                                                                                                                                                                            r490Var31.e0.setVisibility(arrayList.contains(aga0.d) ? 0 : 8);
                                                                                                                                                                                                            r490 r490Var32 = this.y;
                                                                                                                                                                                                            if (r490Var32 == null) {
                                                                                                                                                                                                                Intrinsics.n("binding");
                                                                                                                                                                                                                throw null;
                                                                                                                                                                                                            }
                                                                                                                                                                                                            if (r490Var32.e0.getVisibility() == 0) {
                                                                                                                                                                                                                I1("sporty_loyalty_x");
                                                                                                                                                                                                            }
                                                                                                                                                                                                            r490 r490Var33 = this.y;
                                                                                                                                                                                                            if (r490Var33 == null) {
                                                                                                                                                                                                                Intrinsics.n("binding");
                                                                                                                                                                                                                throw null;
                                                                                                                                                                                                            }
                                                                                                                                                                                                            r490Var33.Y.setVisibility(arrayList.contains(aga0.a) ? 0 : 8);
                                                                                                                                                                                                            r490 r490Var34 = this.y;
                                                                                                                                                                                                            if (r490Var34 == null) {
                                                                                                                                                                                                                Intrinsics.n("binding");
                                                                                                                                                                                                                throw null;
                                                                                                                                                                                                            }
                                                                                                                                                                                                            if (r490Var34.Y.getVisibility() == 0) {
                                                                                                                                                                                                                I1("sporty_loyalty_fb");
                                                                                                                                                                                                            }
                                                                                                                                                                                                            r490 r490Var35 = this.y;
                                                                                                                                                                                                            if (r490Var35 == null) {
                                                                                                                                                                                                                Intrinsics.n("binding");
                                                                                                                                                                                                                throw null;
                                                                                                                                                                                                            }
                                                                                                                                                                                                            r490Var35.c0.setVisibility(arrayList.contains(aga0.b) ? 0 : 8);
                                                                                                                                                                                                            r490 r490Var36 = this.y;
                                                                                                                                                                                                            if (r490Var36 == null) {
                                                                                                                                                                                                                Intrinsics.n("binding");
                                                                                                                                                                                                                throw null;
                                                                                                                                                                                                            }
                                                                                                                                                                                                            if (r490Var36.c0.getVisibility() == 0) {
                                                                                                                                                                                                                I1("sporty_loyalty_telegram");
                                                                                                                                                                                                            }
                                                                                                                                                                                                            r490 r490Var37 = this.y;
                                                                                                                                                                                                            if (r490Var37 == null) {
                                                                                                                                                                                                                Intrinsics.n("binding");
                                                                                                                                                                                                                throw null;
                                                                                                                                                                                                            }
                                                                                                                                                                                                            if (r490Var37.X.getVisibility() == 0) {
                                                                                                                                                                                                                I1("sporty_loyalty_copyLink");
                                                                                                                                                                                                            }
                                                                                                                                                                                                        }
                                                                                                                                                                                                        if (arrayList.isEmpty() && Intrinsics.g(this.M, "share-loyalty-reward")) {
                                                                                                                                                                                                            r490 r490Var38 = this.y;
                                                                                                                                                                                                            if (r490Var38 == null) {
                                                                                                                                                                                                                Intrinsics.n("binding");
                                                                                                                                                                                                                throw null;
                                                                                                                                                                                                            }
                                                                                                                                                                                                            r490Var38.T.setVisibility(8);
                                                                                                                                                                                                        }
                                                                                                                                                                                                        if (!((sn20) this.A.getValue()).a.a("show_load_code_icon")) {
                                                                                                                                                                                                            r490 r490Var39 = this.y;
                                                                                                                                                                                                            if (r490Var39 == null) {
                                                                                                                                                                                                                Intrinsics.n("binding");
                                                                                                                                                                                                                throw null;
                                                                                                                                                                                                            }
                                                                                                                                                                                                            if (r490Var39.F.getVisibility() == 0) {
                                                                                                                                                                                                                r490 r490Var40 = this.y;
                                                                                                                                                                                                                if (r490Var40 == null) {
                                                                                                                                                                                                                    Intrinsics.n("binding");
                                                                                                                                                                                                                    throw null;
                                                                                                                                                                                                                }
                                                                                                                                                                                                                if (r490Var40.E.getVisibility() == 0) {
                                                                                                                                                                                                                    r490 r490Var41 = this.y;
                                                                                                                                                                                                                    if (r490Var41 == null) {
                                                                                                                                                                                                                        Intrinsics.n("binding");
                                                                                                                                                                                                                        throw null;
                                                                                                                                                                                                                    }
                                                                                                                                                                                                                    r490Var41.M.setVisibility(0);
                                                                                                                                                                                                                }
                                                                                                                                                                                                            }
                                                                                                                                                                                                        }
                                                                                                                                                                                                        if (this.c0 == q190.b) {
                                                                                                                                                                                                            r490 r490Var42 = this.y;
                                                                                                                                                                                                            if (r490Var42 == null) {
                                                                                                                                                                                                                Intrinsics.n("binding");
                                                                                                                                                                                                                throw null;
                                                                                                                                                                                                            }
                                                                                                                                                                                                            r490Var42.f.setVisibility(8);
                                                                                                                                                                                                            r490Var42.v.setVisibility(8);
                                                                                                                                                                                                            r490Var42.B.setVisibility(8);
                                                                                                                                                                                                            r490Var42.C.setVisibility(8);
                                                                                                                                                                                                            r490Var42.w.setVisibility(8);
                                                                                                                                                                                                            r490Var42.g0.setVisibility(8);
                                                                                                                                                                                                            r490Var42.a0.setVisibility(0);
                                                                                                                                                                                                            r490Var42.d0.setVisibility(8);
                                                                                                                                                                                                            r490Var42.e.setVisibility(0);
                                                                                                                                                                                                            r490Var42.X.setVisibility(0);
                                                                                                                                                                                                            String str9 = this.U;
                                                                                                                                                                                                            if (str9 == null) {
                                                                                                                                                                                                                uri3 = null;
                                                                                                                                                                                                            } else {
                                                                                                                                                                                                                if (StringsKt.U(str9)) {
                                                                                                                                                                                                                    str9 = null;
                                                                                                                                                                                                                }
                                                                                                                                                                                                                if (str9 != null) {
                                                                                                                                                                                                                    uri3 = Uri.parse(str9);
                                                                                                                                                                                                                } else {
                                                                                                                                                                                                                    uri3 = null;
                                                                                                                                                                                                                }
                                                                                                                                                                                                            }
                                                                                                                                                                                                            this.H = uri3;
                                                                                                                                                                                                            String str10 = this.V;
                                                                                                                                                                                                            if (str10 == null) {
                                                                                                                                                                                                                uri4 = null;
                                                                                                                                                                                                            } else {
                                                                                                                                                                                                                if (StringsKt.U(str10)) {
                                                                                                                                                                                                                    str10 = null;
                                                                                                                                                                                                                }
                                                                                                                                                                                                                if (str10 != null) {
                                                                                                                                                                                                                    uri4 = Uri.parse(str10);
                                                                                                                                                                                                                } else {
                                                                                                                                                                                                                    uri4 = null;
                                                                                                                                                                                                                }
                                                                                                                                                                                                            }
                                                                                                                                                                                                            this.I = uri4;
                                                                                                                                                                                                            String str11 = this.V;
                                                                                                                                                                                                            if (str11 == null) {
                                                                                                                                                                                                                str11 = "";
                                                                                                                                                                                                            }
                                                                                                                                                                                                            String str12 = this.U;
                                                                                                                                                                                                            E1(str11, str12 == null ? "" : str12);
                                                                                                                                                                                                            q8i0 q8i0Var = this.D;
                                                                                                                                                                                                            i2i.c(((bb90) q8i0Var.getValue()).c, null, 3).f(this, new c(new xl40(this, 1)));
                                                                                                                                                                                                            if (bundle != null && bundle.containsKey("key_screen_width_px") && bundle.getInt("key_screen_width_px") != getResources().getDisplayMetrics().widthPixels && (str = this.N) != null) {
                                                                                                                                                                                                                if (StringsKt.U(str)) {
                                                                                                                                                                                                                    str = null;
                                                                                                                                                                                                                }
                                                                                                                                                                                                                if (str != null) {
                                                                                                                                                                                                                    bb90 bb90Var = (bb90) q8i0Var.getValue();
                                                                                                                                                                                                                    ej5.c(o8i0.d(bb90Var), null, null, new ab90(bb90Var, str, getResources().getConfiguration(), null), 3);
                                                                                                                                                                                                                }
                                                                                                                                                                                                            }
                                                                                                                                                                                                        }
                                                                                                                                                                                                        A1().w = new x190(this.J, this.N, this.K, this.P, this.M, this.E, this.H, this.I, this.Q, this.a0, this.b0, this.c0, this.R, this.S, this.T);
                                                                                                                                                                                                        i2i.c(A1().v, null, 3).f(this, new c(new jp00(this, 2)));
                                                                                                                                                                                                        int i7 = 1;
                                                                                                                                                                                                        ((eja0) this.B.getValue()).w.f(this, new c(new gm40(this, i7)));
                                                                                                                                                                                                        q8i0 q8i0Var2 = this.z;
                                                                                                                                                                                                        i2i.c(((rws) q8i0Var2.getValue()).e, null, 3).f(this, new c(new x3w(this, i7)));
                                                                                                                                                                                                        i2i.c(((rws) q8i0Var2.getValue()).w, null, 3).f(this, new c(new Function1() { // from class: sz80
                                                                                                                                                                                                            @Override // kotlin.jvm.functions.Function1
                                                                                                                                                                                                            public final Object invoke(Object obj) {
                                                                                                                                                                                                                boolean z3 = ((tzs) obj) instanceof tzs.b;
                                                                                                                                                                                                                r490 r490Var43 = this.a.y;
                                                                                                                                                                                                                if (z3) {
                                                                                                                                                                                                                    if (r490Var43 == null) {
                                                                                                                                                                                                                        Intrinsics.n("binding");
                                                                                                                                                                                                                        throw null;
                                                                                                                                                                                                                    }
                                                                                                                                                                                                                    r490Var43.I.d();
                                                                                                                                                                                                                } else {
                                                                                                                                                                                                                    if (r490Var43 == null) {
                                                                                                                                                                                                                        Intrinsics.n("binding");
                                                                                                                                                                                                                        throw null;
                                                                                                                                                                                                                    }
                                                                                                                                                                                                                    r490Var43.I.a();
                                                                                                                                                                                                                }
                                                                                                                                                                                                                return Unit.a;
                                                                                                                                                                                                            }
                                                                                                                                                                                                        }));
                                                                                                                                                                                                        i2i.c(((rws) q8i0Var2.getValue()).z, null, 3).f(this, new c(new Function1() { // from class: tz80
                                                                                                                                                                                                            /* JADX WARN: Type inference fix 'apply assigned field type' failed
                                                                                                                                                                                                            java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
                                                                                                                                                                                                            	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
                                                                                                                                                                                                            	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
                                                                                                                                                                                                            	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
                                                                                                                                                                                                            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
                                                                                                                                                                                                            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
                                                                                                                                                                                                            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
                                                                                                                                                                                                            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
                                                                                                                                                                                                             */
                                                                                                                                                                                                            @Override // kotlin.jvm.functions.Function1
                                                                                                                                                                                                            public final Object invoke(Object obj) {
                                                                                                                                                                                                                UiText uiText = (UiText) obj;
                                                                                                                                                                                                                int i8 = ShareCodeActivity.j0;
                                                                                                                                                                                                                if (uiText != null) {
                                                                                                                                                                                                                    ShareCodeActivity shareCodeActivity = this.a;
                                                                                                                                                                                                                    shareCodeActivity.showDialog(shareCodeActivity, uiText.e(shareCodeActivity).toString(), new x02(0));
                                                                                                                                                                                                                }
                                                                                                                                                                                                                return Unit.a;
                                                                                                                                                                                                            }
                                                                                                                                                                                                        }));
                                                                                                                                                                                                        i2i.c(((rws) q8i0Var2.getValue()).i, null, 3).f(this, new c(new nir(this, 1)));
                                                                                                                                                                                                        B1().a(c090.a, k00.d);
                                                                                                                                                                                                        String str13 = this.P;
                                                                                                                                                                                                        if (str13 != null) {
                                                                                                                                                                                                            getFullStoryCommonManager().f(AnalyticsEvent.SHARE_BET_POPUP_VIEW, jpu.b(new Pair("source", str13)));
                                                                                                                                                                                                            return;
                                                                                                                                                                                                        }
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
                    }
                }
            }
        }
        bmy.a("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i2)));
    }

    @Override // defpackage.py1, defpackage.hrl, defpackage.fq0, androidx.fragment.app.e, android.app.Activity
    public final void onDestroy() {
        this.g0.cancel();
        z1();
        super.onDestroy();
    }

    public final void z1() {
        r490 r490Var = this.y;
        if (r490Var == null) {
            Intrinsics.n("binding");
            throw null;
        }
        r490Var.F.setImageBitmap(null);
        Bitmap bitmap = this.W;
        if (bitmap != null && !bitmap.isRecycled()) {
            bitmap.recycle();
        }
        this.W = null;
    }

    @Override // defpackage.rn8, defpackage.yn8, android.app.Activity
    public final void onSaveInstanceState(Bundle bundle) {
        bundle.getClass();
        super.onSaveInstanceState(bundle);
        bundle.putInt(llGRV.yiKEMfKSsnHK, getResources().getDisplayMetrics().widthPixels);
    }
}
