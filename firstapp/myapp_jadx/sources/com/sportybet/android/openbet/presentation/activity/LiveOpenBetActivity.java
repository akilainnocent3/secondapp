package com.sportybet.android.openbet.presentation.activity;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.a;
import com.sporty.android.core.model.tracking.AnalyticsParam;
import com.sportybet.android.cashoutphase3.b;
import com.sportybet.android.gp.tz.R;
import com.sportybet.android.openbet.domain.model.OpenBetEntranceData;
import com.sportybet.android.openbet.presentation.activity.LiveOpenBetActivity;
import com.sportybet.android.openbet.presentation.activity.OpenBetActivity;
import com.sportybet.plugin.realsports.live.livepage.LivePageActivity;
import com.sportygames.goldmine.data.dto.oBji.dLRYz;
import defpackage.arr;
import defpackage.b1z;
import defpackage.bb40;
import defpackage.bgd0;
import defpackage.bmy;
import defpackage.dps;
import defpackage.ebs;
import defpackage.g1i;
import defpackage.g9i0;
import defpackage.gq6;
import defpackage.gym;
import defpackage.h5e;
import defpackage.iym;
import defpackage.n8j0;
import defpackage.oke;
import defpackage.oyy;
import defpackage.qoa0;
import defpackage.qxi;
import defpackage.r6i0;
import defpackage.rlf;
import defpackage.s9s;
import defpackage.tlf;
import defpackage.u420;
import defpackage.uul;
import defpackage.v420;
import defpackage.vj5;
import defpackage.xos;
import defpackage.zch0;
import java.util.WeakHashMap;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004B\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/sportybet/android/openbet/presentation/activity/LiveOpenBetActivity;", "Lpy1;", "Lrlf;", "Lbb40;", "Lv420;", "<init>", "()V", "africa-bet-android"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class LiveOpenBetActivity extends uul implements rlf, bb40, v420 {
    public static final /* synthetic */ int v = 0;
    public bgd0 b;
    public iym d;
    public gq6 e;
    public b1z f;
    public String c = "";
    public boolean i = true;

    public final void A1(int i) {
        String cMSString = getCMSString(R.string.live__open_bets_on_match, new Object[0]);
        bgd0 bgd0Var = this.b;
        if (bgd0Var == null) {
            Intrinsics.n("binding");
            throw null;
        }
        TextView textView = bgd0Var.w;
        if (i > 0) {
            cMSString = cMSString + dLRYz.QrElHPVZAbgU + i + ")";
        }
        textView.setText(cMSString);
    }

    @Override // defpackage.v420
    public final u420 E() {
        return u420.h.a;
    }

    @Override // android.app.Activity
    public final void finish() {
        super.finish();
        overridePendingTransition(R.anim.activity_slide_exit_bottom_without_change, R.anim.activity_slide_exit_bottom);
    }

    @Override // defpackage.py1, defpackage.r1k, defpackage.hrl, androidx.fragment.app.e, defpackage.rn8, defpackage.yn8, android.app.Activity
    public final void onCreate(Bundle bundle) {
        n8j0.g cVar;
        super.onCreate(bundle);
        int intExtra = getIntent().getIntExtra("EXTRA_LIVE_OPENBET_COUNT", 0);
        String stringExtra = getIntent().getStringExtra("EXTRA_LIVE_EVENT_ID");
        if (stringExtra == null) {
            stringExtra = "";
        }
        this.c = stringExtra;
        if (TextUtils.isEmpty(stringExtra)) {
            finish();
            return;
        }
        View viewInflate = getLayoutInflater().inflate(R.layout.spr_activity_live_open_bets, (ViewGroup) null, false);
        int i = R.id.btn_close;
        ImageView imageView = (ImageView) h5e.a(R.id.btn_close, viewInflate);
        if (imageView != null) {
            i = R.id.btn_view_all;
            TextView textView = (TextView) h5e.a(R.id.btn_view_all, viewInflate);
            if (textView != null) {
                i = R.id.divider;
                View viewA = h5e.a(R.id.divider, viewInflate);
                if (viewA != null) {
                    i = R.id.empty_container;
                    View viewA2 = h5e.a(R.id.empty_container, viewInflate);
                    if (viewA2 != null) {
                        i = R.id.empty_icon;
                        if (((ImageView) h5e.a(R.id.empty_icon, viewInflate)) != null) {
                            i = R.id.empty_text;
                            if (((TextView) h5e.a(R.id.empty_text, viewInflate)) != null) {
                                i = R.id.empty_view;
                                Group group = (Group) h5e.a(R.id.empty_view, viewInflate);
                                if (group != null) {
                                    i = R.id.frame;
                                    FrameLayout frameLayout = (FrameLayout) h5e.a(R.id.frame, viewInflate);
                                    if (frameLayout != null) {
                                        ConstraintLayout constraintLayout = (ConstraintLayout) viewInflate;
                                        int i2 = R.id.live_open_bet_title;
                                        TextView textView2 = (TextView) h5e.a(R.id.live_open_bet_title, viewInflate);
                                        if (textView2 != null) {
                                            i2 = R.id.tv_cashout_desc;
                                            TextView textView3 = (TextView) h5e.a(R.id.tv_cashout_desc, viewInflate);
                                            if (textView3 != null) {
                                                this.b = new bgd0(constraintLayout, imageView, textView, viewA, viewA2, group, frameLayout, constraintLayout, textView2, textView3);
                                                setContentView(constraintLayout);
                                                boolean z = true;
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
                                                bgd0 bgd0Var = this.b;
                                                if (bgd0Var == null) {
                                                    Intrinsics.n("binding");
                                                    throw null;
                                                }
                                                FrameLayout frameLayout2 = bgd0Var.i;
                                                bgd0Var.v.setOnClickListener(new View.OnClickListener() { // from class: wos
                                                    @Override // android.view.View.OnClickListener
                                                    public final void onClick(View view) {
                                                        int i4 = LiveOpenBetActivity.v;
                                                        this.a.finish();
                                                    }
                                                });
                                                ViewGroup.LayoutParams layoutParams = frameLayout2.getLayoutParams();
                                                layoutParams.height = zch0.b(getResources(), intExtra > 1 ? 352 : 290);
                                                frameLayout2.setLayoutParams(layoutParams);
                                                frameLayout2.requestLayout();
                                                bgd0Var.e.setOnClickListener(new xos());
                                                bgd0Var.y.setOnClickListener(new View.OnClickListener() { // from class: yos
                                                    @Override // android.view.View.OnClickListener
                                                    public final void onClick(View view) {
                                                        int i4 = LiveOpenBetActivity.v;
                                                        LiveOpenBetActivity liveOpenBetActivity = this.a;
                                                        liveOpenBetActivity.startActivity(new Intent(liveOpenBetActivity, (Class<?>) LivePageActivity.class).putExtra("key_sport_id", "sr:sport:1"));
                                                    }
                                                });
                                                bgd0Var.b.setOnClickListener(new View.OnClickListener() { // from class: zos
                                                    @Override // android.view.View.OnClickListener
                                                    public final void onClick(View view) {
                                                        int i4 = LiveOpenBetActivity.v;
                                                        this.a.finish();
                                                    }
                                                });
                                                bgd0Var.c.setOnClickListener(new View.OnClickListener() { // from class: aps
                                                    @Override // android.view.View.OnClickListener
                                                    public final void onClick(View view) {
                                                        int i4 = LiveOpenBetActivity.v;
                                                        LiveOpenBetActivity liveOpenBetActivity = this.a;
                                                        b1z b1zVar = liveOpenBetActivity.f;
                                                        if (b1zVar == null) {
                                                            Intrinsics.n("openBetsEventTrackingManager");
                                                            throw null;
                                                        }
                                                        b1zVar.n(b1z.b.LiveEventPage);
                                                        b1z b1zVar2 = liveOpenBetActivity.f;
                                                        if (b1zVar2 == null) {
                                                            Intrinsics.n("openBetsEventTrackingManager");
                                                            throw null;
                                                        }
                                                        b1zVar2.k();
                                                        liveOpenBetActivity.startActivity(new Intent(liveOpenBetActivity.getBaseContext(), (Class<?>) OpenBetActivity.class).putExtra("EXTRA_TO_OPENBET", true));
                                                        liveOpenBetActivity.finish();
                                                    }
                                                });
                                                bgd0Var.w.setOnClickListener(new View.OnClickListener() { // from class: bps
                                                    @Override // android.view.View.OnClickListener
                                                    public final void onClick(View view) {
                                                        int i4 = LiveOpenBetActivity.v;
                                                        this.a.finish();
                                                    }
                                                });
                                                A1(intExtra);
                                                getSupportFragmentManager().n0("EXTRA_OPEN_BET_ENTRANCE", this, new qxi() { // from class: cps
                                                    @Override // defpackage.qxi
                                                    public final void a(String str, Bundle bundle2) {
                                                        int i4 = LiveOpenBetActivity.v;
                                                        bundle2.getClass();
                                                        int i5 = bundle2.getInt("EXTRA_OPEN_BET_CASHABLE_COUNT", 0);
                                                        OpenBetEntranceData openBetEntranceData = new OpenBetEntranceData(i5, bundle2.getInt("EXTRA_OPEN_BET_COUNT", 0));
                                                        Intent intent = new Intent("com.sportybet.OPEN_BETS_COUNT_UPDATE");
                                                        intent.putExtra("EXTRA_OPEN_BET_DATA", openBetEntranceData);
                                                        LiveOpenBetActivity liveOpenBetActivity = this.a;
                                                        fdt.a(liveOpenBetActivity).c(intent);
                                                        if (i5 != 0) {
                                                            liveOpenBetActivity.A1(i5);
                                                            return;
                                                        }
                                                        bgd0 bgd0Var2 = liveOpenBetActivity.b;
                                                        if (bgd0Var2 == null) {
                                                            Intrinsics.n("binding");
                                                            throw null;
                                                        }
                                                        bgd0Var2.w.setText(liveOpenBetActivity.getCMSString(R.string.live__open_bets_on_match, new Object[0]));
                                                        liveOpenBetActivity.z1();
                                                    }
                                                });
                                                if (intExtra <= 0) {
                                                    z1();
                                                } else if (bundle == null) {
                                                    FragmentManager supportFragmentManager = getSupportFragmentManager();
                                                    a aVarA = oke.a(supportFragmentManager, supportFragmentManager);
                                                    b bVar = new b();
                                                    bVar.setArguments(vj5.a(new Pair(AnalyticsParam.EVENT_PARAM_PAGE_VIEW_EVENT_ID, this.c)));
                                                    Unit unit = Unit.a;
                                                    aVarA.e(R.id.frame, bVar, null, 1);
                                                    aVarA.d();
                                                }
                                                iym iymVar = this.d;
                                                if (iymVar == null) {
                                                    Intrinsics.n("openTelemetryLogger");
                                                    throw null;
                                                }
                                                gym.a(iymVar, new oyy(0));
                                                gq6 gq6Var = this.e;
                                                if (gq6Var == null) {
                                                    Intrinsics.n("cashoutOpenBetsCountManager");
                                                    throw null;
                                                }
                                                g1i g1iVar = new g1i(gq6Var.c(this.c), new dps(this, null));
                                                s9s lifecycle = getLifecycle();
                                                lifecycle.getClass();
                                                arr.a(g1iVar, lifecycle, s9s.b.d);
                                                return;
                                            }
                                        }
                                        i = i2;
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

    @Override // defpackage.py1, androidx.fragment.app.e, android.app.Activity
    public final void onResume() {
        super.onResume();
        if (!this.i) {
            gq6 gq6Var = this.e;
            if (gq6Var == null) {
                Intrinsics.n("cashoutOpenBetsCountManager");
                throw null;
            }
            gq6Var.b(this.c, ebs.a(getLifecycle()), true, null);
        }
        this.i = false;
    }

    public final void z1() {
        bgd0 bgd0Var = this.b;
        if (bgd0Var == null) {
            Intrinsics.n("binding");
            throw null;
        }
        bgd0Var.i.setVisibility(8);
        bgd0 bgd0Var2 = this.b;
        if (bgd0Var2 != null) {
            bgd0Var2.f.setVisibility(0);
        } else {
            Intrinsics.n("binding");
            throw null;
        }
    }
}
