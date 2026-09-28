package com.sportybet.android.user.verifiedinfo;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import androidx.recyclerview.widget.RecyclerView;
import com.sporty.android.common_ui.widgets.CommonTitleBar;
import com.sportybet.android.gp.tz.R;
import com.sportybet.android.user.verifiedinfo.VerifiedInfoActivity;
import com.sportybet.android.widget.LoadingView;
import defpackage.bmy;
import defpackage.c3x;
import defpackage.cyb;
import defpackage.h5e;
import defpackage.haj;
import defpackage.jq40;
import defpackage.lfy;
import defpackage.oxh0;
import defpackage.paj;
import defpackage.q8i0;
import defpackage.qlr;
import defpackage.qxh0;
import defpackage.r8i0;
import defpackage.sxh0;
import defpackage.tsd;
import defpackage.u6m;
import defpackage.v8i0;
import defpackage.xxh0;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/sportybet/android/user/verifiedinfo/VerifiedInfoActivity;", "Lpy1;", "<init>", "()V", "africa-bet-android"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class VerifiedInfoActivity extends u6m {
    public static final /* synthetic */ int d = 0;
    public final q8i0 b = new q8i0(jq40.a(xxh0.class), new c(), new b(), new d());
    public qxh0 c;

    public static final class a implements lfy, paj {
        public final /* synthetic */ c3x a;

        public a(c3x c3xVar) {
            this.a = c3xVar;
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

    public static final class b extends qlr implements Function0<r8i0.c> {
        public b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final r8i0.c invoke() {
            return VerifiedInfoActivity.this.getDefaultViewModelProviderFactory();
        }
    }

    public static final class c extends qlr implements Function0<v8i0> {
        public c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final v8i0 invoke() {
            return VerifiedInfoActivity.this.getViewModelStore();
        }
    }

    public static final class d extends qlr implements Function0<cyb> {
        public d() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final cyb invoke() {
            return VerifiedInfoActivity.this.getDefaultViewModelCreationExtras();
        }
    }

    @Override // defpackage.py1, defpackage.r1k, defpackage.hrl, androidx.fragment.app.e, defpackage.rn8, defpackage.yn8, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        View viewInflate = getLayoutInflater().inflate(R.layout.verified_info_activity, (ViewGroup) null, false);
        int i = R.id.common_title_bar;
        CommonTitleBar commonTitleBar = (CommonTitleBar) h5e.a(R.id.common_title_bar, viewInflate);
        if (commonTitleBar != null) {
            i = R.id.empty_hint;
            TextView textView = (TextView) h5e.a(R.id.empty_hint, viewInflate);
            if (textView != null) {
                i = R.id.group_no_verified_yet;
                Group group = (Group) h5e.a(R.id.group_no_verified_yet, viewInflate);
                if (group != null) {
                    i = R.id.home;
                    ImageView imageView = (ImageView) h5e.a(R.id.home, viewInflate);
                    if (imageView != null) {
                        i = R.id.icon_no_verified_yet;
                        if (((ImageView) h5e.a(R.id.icon_no_verified_yet, viewInflate)) != null) {
                            i = R.id.loading;
                            LoadingView loadingView = (LoadingView) h5e.a(R.id.loading, viewInflate);
                            if (loadingView != null) {
                                i = R.id.msg_no_verified_yet;
                                if (((TextView) h5e.a(R.id.msg_no_verified_yet, viewInflate)) != null) {
                                    i = R.id.recycler;
                                    RecyclerView recyclerView = (RecyclerView) h5e.a(R.id.recycler, viewInflate);
                                    if (recyclerView != null) {
                                        i = R.id.title_no_verified_yet;
                                        if (((TextView) h5e.a(R.id.title_no_verified_yet, viewInflate)) != null) {
                                            ConstraintLayout constraintLayout = (ConstraintLayout) viewInflate;
                                            this.c = new qxh0(constraintLayout, commonTitleBar, textView, group, imageView, loadingView, recyclerView);
                                            setContentView(constraintLayout);
                                            qxh0 qxh0Var = this.c;
                                            if (qxh0Var == null) {
                                                Intrinsics.n("binding");
                                                throw null;
                                            }
                                            int i2 = 1;
                                            qxh0Var.b.getBackBtn().setOnClickListener(new tsd(this, i2));
                                            qxh0Var.e.setOnClickListener(new oxh0());
                                            String stringExtra = getIntent().getStringExtra("EXTRA_VERIFY_TOKEN");
                                            if (stringExtra == null) {
                                                stringExtra = "";
                                            }
                                            boolean zU = StringsKt.U(stringExtra);
                                            if (zU) {
                                                qxh0 qxh0Var2 = this.c;
                                                if (qxh0Var2 == null) {
                                                    Intrinsics.n("binding");
                                                    throw null;
                                                }
                                                qxh0Var2.f.E();
                                                qxh0 qxh0Var3 = this.c;
                                                if (qxh0Var3 == null) {
                                                    Intrinsics.n("binding");
                                                    throw null;
                                                }
                                                qxh0Var3.d.setVisibility(0);
                                            }
                                            if (zU) {
                                                return;
                                            }
                                            final qxh0 qxh0Var4 = this.c;
                                            if (qxh0Var4 == null) {
                                                Intrinsics.n("binding");
                                                throw null;
                                            }
                                            qxh0Var4.f.setOnClickListener(new View.OnClickListener() { // from class: pxh0
                                                @Override // android.view.View.OnClickListener
                                                public final void onClick(View view) {
                                                    int i3 = VerifiedInfoActivity.d;
                                                    qxh0Var4.f.K();
                                                    VerifiedInfoActivity verifiedInfoActivity = this;
                                                    xxh0 xxh0Var = (xxh0) verifiedInfoActivity.b.getValue();
                                                    String stringExtra2 = verifiedInfoActivity.getIntent().getStringExtra("EXTRA_VERIFY_TOKEN");
                                                    if (stringExtra2 == null) {
                                                        stringExtra2 = "";
                                                    }
                                                    xxh0Var.x1(stringExtra2);
                                                }
                                            });
                                            qxh0Var4.i.setAdapter(new sxh0(new sxh0.a()));
                                            qxh0 qxh0Var5 = this.c;
                                            if (qxh0Var5 == null) {
                                                Intrinsics.n("binding");
                                                throw null;
                                            }
                                            q8i0 q8i0Var = this.b;
                                            ((xxh0) q8i0Var.getValue()).e.f(this, new a(new c3x(qxh0Var5, i2)));
                                            xxh0 xxh0Var = (xxh0) q8i0Var.getValue();
                                            String stringExtra2 = getIntent().getStringExtra("EXTRA_VERIFY_TOKEN");
                                            xxh0Var.x1(stringExtra2 != null ? stringExtra2 : "");
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
        bmy.a("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
    }
}
