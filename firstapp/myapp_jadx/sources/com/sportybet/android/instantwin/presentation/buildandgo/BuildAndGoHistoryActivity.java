package com.sportybet.android.instantwin.presentation.buildandgo;

import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.TransitionDrawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.Space;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentContainerView;
import androidx.fragment.app.FragmentManager;
import com.sportybet.android.gp.tz.R;
import com.sportybet.android.instantwin.presentation.buildandgo.BuildAndGoHistoryActivity;
import com.sportybet.android.instantwin.router.bethistory.BuildAndGoHistoryInput;
import com.sportybet.android.instantwin.router.bethistory2.InstantWinBetHistoryInput;
import com.sportybet.android.instantwin.router.ticketdetail.InstantWinTicketDetailInput;
import defpackage.a5o;
import defpackage.af5;
import defpackage.azm;
import defpackage.bb40;
import defpackage.bmy;
import defpackage.bqe;
import defpackage.dd;
import defpackage.g9i0;
import defpackage.gc5;
import defpackage.h5e;
import defpackage.k00;
import defpackage.mnl;
import defpackage.n8j0;
import defpackage.nc5;
import defpackage.oke;
import defpackage.qoa0;
import defpackage.r6i0;
import defpackage.rdd0;
import defpackage.rj5;
import defpackage.rlf;
import defpackage.tlf;
import defpackage.uxo;
import defpackage.vj5;
import defpackage.wh5;
import java.util.Arrays;
import java.util.WeakHashMap;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004B\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/sportybet/android/instantwin/presentation/buildandgo/BuildAndGoHistoryActivity;", "Lpy1;", "Lrlf;", "Lbb40;", "Lnc5;", "<init>", "()V", "instantWin"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class BuildAndGoHistoryActivity extends mnl implements rlf, bb40, nc5 {
    public static final /* synthetic */ int i = 0;
    public dd b;
    public final String c = "sr:sport:1-1";
    public azm d;
    public rdd0 e;
    public boolean f;

    public final void A1() {
        Fragment fragmentG = getSupportFragmentManager().G(R.id.fragment_container);
        boolean z = fragmentG instanceof gc5;
        dd ddVar = this.b;
        if (z) {
            if (ddVar == null) {
                Intrinsics.n("binding");
                throw null;
            }
            ddVar.b.setVisibility(8);
            ddVar.i.setText(getCMSString(R.string.common_functions__bet_history, new Object[0]));
            ImageView imageView = ddVar.f;
            ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
            if (layoutParams == null) {
                bmy.a("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                return;
            }
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            marginLayoutParams.setMargins(bqe.a(12.0f), 0, 0, 0);
            imageView.setLayoutParams(marginLayoutParams);
            ddVar.w.setBackgroundResource(R.drawable.bg_bng_history_list);
            return;
        }
        if (!(fragmentG instanceof wh5)) {
            if (ddVar == null) {
                Intrinsics.n("binding");
                throw null;
            }
            ddVar.b.setVisibility(8);
            Unit unit = Unit.a;
            return;
        }
        if (ddVar == null) {
            Intrinsics.n("binding");
            throw null;
        }
        ddVar.b.setVisibility(0);
        ddVar.i.setText(getCMSString(R.string.component_betslip__sim_ticket_details, new Object[0]));
        ImageView imageView2 = ddVar.f;
        ViewGroup.LayoutParams layoutParams2 = imageView2.getLayoutParams();
        if (layoutParams2 == null) {
            bmy.a("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            return;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams2;
        marginLayoutParams2.setMargins(0, 0, 0, 0);
        imageView2.setLayoutParams(marginLayoutParams2);
        ddVar.w.setBackgroundResource(R.drawable.bg_bng_history_details);
    }

    @Override // defpackage.nc5
    public final void P0(String str) {
        z1(str, false);
    }

    @Override // defpackage.py1, defpackage.r1k, defpackage.hrl, androidx.fragment.app.e, defpackage.rn8, defpackage.yn8, android.app.Activity
    public final void onCreate(Bundle bundle) {
        String str;
        n8j0.g cVar;
        super.onCreate(bundle);
        boolean z = false;
        View viewInflate = getLayoutInflater().inflate(R.layout.activity_iwqk_build_and_go, (ViewGroup) null, false);
        int i2 = R.id.back;
        ImageView imageView = (ImageView) h5e.a(R.id.back, viewInflate);
        if (imageView != null) {
            i2 = R.id.close;
            ImageView imageView2 = (ImageView) h5e.a(R.id.close, viewInflate);
            if (imageView2 != null) {
                i2 = R.id.drag_handler;
                View viewA = h5e.a(R.id.drag_handler, viewInflate);
                if (viewA != null) {
                    i2 = R.id.fragment_container;
                    if (((FragmentContainerView) h5e.a(R.id.fragment_container, viewInflate)) != null) {
                        FrameLayout frameLayout = (FrameLayout) viewInflate;
                        int i3 = R.id.logo;
                        ImageView imageView3 = (ImageView) h5e.a(R.id.logo, viewInflate);
                        if (imageView3 != null) {
                            i3 = R.id.title;
                            TextView textView = (TextView) h5e.a(R.id.title, viewInflate);
                            if (textView != null) {
                                i3 = R.id.translucent_background;
                                View viewA2 = h5e.a(R.id.translucent_background, viewInflate);
                                if (viewA2 != null) {
                                    i3 = R.id.view_header;
                                    View viewA3 = h5e.a(R.id.view_header, viewInflate);
                                    if (viewA3 != null) {
                                        i3 = R.id.view_top_empty_area;
                                        if (((Space) h5e.a(R.id.view_top_empty_area, viewInflate)) != null) {
                                            this.b = new dd(frameLayout, imageView, imageView2, viewA, frameLayout, imageView3, textView, viewA2, viewA3);
                                            setContentView(frameLayout);
                                            getOnBackPressedDispatcher().a(this, new af5(this));
                                            if (bundle != null) {
                                                this.f = bundle.getBoolean("ARG_ROOT_IS_TICKET_DETAIL", false);
                                                if (!bundle.containsKey("ARG_ROOT_IS_TICKET_DETAIL")) {
                                                    this.f = (getSupportFragmentManager().G(R.id.fragment_container) instanceof wh5) && getSupportFragmentManager().L() == 0;
                                                }
                                            }
                                            dd ddVar = this.b;
                                            if (ddVar == null) {
                                                Intrinsics.n("binding");
                                                throw null;
                                            }
                                            ddVar.e.setSystemUiVisibility(1280);
                                            if (Build.VERSION.SDK_INT >= 35) {
                                                Window window = getWindow();
                                                qoa0 qoa0Var = new qoa0(window.getDecorView());
                                                int i4 = Build.VERSION.SDK_INT;
                                                if (i4 >= 35) {
                                                    cVar = new n8j0.f(window, qoa0Var);
                                                } else if (i4 >= 30) {
                                                    cVar = new n8j0.d(window, qoa0Var);
                                                } else {
                                                    cVar = i4 >= 26 ? new n8j0.c(window, qoa0Var) : new n8j0.b(window, qoa0Var);
                                                }
                                                cVar.d(false);
                                                cVar.c(false);
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
                                            dd ddVar2 = this.b;
                                            if (ddVar2 == null) {
                                                Intrinsics.n("binding");
                                                throw null;
                                            }
                                            Drawable background = ddVar2.v.getBackground();
                                            TransitionDrawable transitionDrawable = background instanceof TransitionDrawable ? (TransitionDrawable) background : null;
                                            if (transitionDrawable != null) {
                                                transitionDrawable.startTransition(300);
                                            }
                                            dd ddVar3 = this.b;
                                            if (ddVar3 == null) {
                                                Intrinsics.n("binding");
                                                throw null;
                                            }
                                            ImageView imageView4 = ddVar3.b;
                                            imageView4.setVisibility(8);
                                            imageView4.setOnClickListener(new View.OnClickListener() { // from class: ye5
                                                @Override // android.view.View.OnClickListener
                                                public final void onClick(View view) {
                                                    int i5 = BuildAndGoHistoryActivity.i;
                                                    BuildAndGoHistoryActivity buildAndGoHistoryActivity = this.a;
                                                    if (buildAndGoHistoryActivity.getSupportFragmentManager().L() > 0) {
                                                        buildAndGoHistoryActivity.getSupportFragmentManager().Y();
                                                        return;
                                                    }
                                                    azm azmVar = buildAndGoHistoryActivity.d;
                                                    if (azmVar != null) {
                                                        azmVar.d(wae.INSTANT_WIN_BUILD_AND_GO);
                                                    } else {
                                                        Intrinsics.n("router");
                                                        throw null;
                                                    }
                                                }
                                            });
                                            ddVar3.c.setOnClickListener(new View.OnClickListener() { // from class: ze5
                                                @Override // android.view.View.OnClickListener
                                                public final void onClick(View view) {
                                                    int i5 = BuildAndGoHistoryActivity.i;
                                                    BuildAndGoHistoryActivity buildAndGoHistoryActivity = this.a;
                                                    if (!buildAndGoHistoryActivity.f) {
                                                        buildAndGoHistoryActivity.finish();
                                                        return;
                                                    }
                                                    azm azmVar = buildAndGoHistoryActivity.d;
                                                    if (azmVar != null) {
                                                        azmVar.d(wae.INSTANT_WIN_BUILD_AND_GO);
                                                    } else {
                                                        Intrinsics.n("router");
                                                        throw null;
                                                    }
                                                }
                                            });
                                            View view = ddVar3.d;
                                            view.getBackground().setTint(view.getContext().getColor(R.color.border_secondary));
                                            rdd0 rdd0Var = this.e;
                                            if (rdd0Var == null) {
                                                Intrinsics.n("sportyTrackingUseCase");
                                                throw null;
                                            }
                                            String str2 = this.c;
                                            rdd0Var.a(new a5o.h(str2), k00.d);
                                            if (bundle == null) {
                                                Intent intent = getIntent();
                                                intent.getClass();
                                                BuildAndGoHistoryInput buildAndGoHistoryInput = (BuildAndGoHistoryInput) ((Parcelable) uxo.a(intent, "ARG_INPUT", BuildAndGoHistoryInput.class));
                                                if (buildAndGoHistoryInput == null || (str = buildAndGoHistoryInput.a) == null) {
                                                    Fragment fragmentH = getSupportFragmentManager().H("FRAGMENT_TAG_BET_HISTORY");
                                                    if (fragmentH != null) {
                                                        FragmentManager supportFragmentManager = getSupportFragmentManager();
                                                        supportFragmentManager.getClass();
                                                        androidx.fragment.app.a aVar = new androidx.fragment.app.a(supportFragmentManager);
                                                        aVar.s(fragmentH);
                                                        aVar.l();
                                                    } else {
                                                        InstantWinBetHistoryInput instantWinBetHistoryInput = new InstantWinBetHistoryInput(str2);
                                                        gc5 gc5Var = new gc5();
                                                        gc5Var.setArguments(vj5.a(new Pair("ARG_INPUT", instantWinBetHistoryInput)));
                                                        FragmentManager supportFragmentManager2 = getSupportFragmentManager();
                                                        supportFragmentManager2.getClass();
                                                        androidx.fragment.app.a aVar2 = new androidx.fragment.app.a(supportFragmentManager2);
                                                        aVar2.e(R.id.fragment_container, gc5Var, "FRAGMENT_TAG_BET_HISTORY", 1);
                                                        aVar2.l();
                                                    }
                                                    A1();
                                                    this.f = false;
                                                } else {
                                                    z1(str, true);
                                                    this.f = true;
                                                }
                                            } else {
                                                A1();
                                            }
                                            getSupportFragmentManager().o.add(new FragmentManager.n() { // from class: te5
                                                @Override // androidx.fragment.app.FragmentManager.n
                                                public final void onBackStackChanged() {
                                                    int i5 = BuildAndGoHistoryActivity.i;
                                                    this.a.A1();
                                                }
                                            });
                                            dd ddVar4 = this.b;
                                            if (ddVar4 != null) {
                                                ddVar4.a.post(new Runnable() { // from class: ue5
                                                    @Override // java.lang.Runnable
                                                    public final void run() {
                                                        int i5 = BuildAndGoHistoryActivity.i;
                                                        this.a.A1();
                                                    }
                                                });
                                                return;
                                            } else {
                                                Intrinsics.n("binding");
                                                throw null;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                        i2 = i3;
                    }
                }
            }
        }
        bmy.a("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i2)));
    }

    @Override // defpackage.rn8, android.app.Activity
    public final void onNewIntent(Intent intent) {
        String str;
        intent.getClass();
        super.onNewIntent(intent);
        BuildAndGoHistoryInput buildAndGoHistoryInput = (BuildAndGoHistoryInput) ((Parcelable) uxo.a(intent, "ARG_INPUT", BuildAndGoHistoryInput.class));
        if (buildAndGoHistoryInput == null || (str = buildAndGoHistoryInput.a) == null) {
            return;
        }
        z1(str, this.f && getSupportFragmentManager().L() == 0);
    }

    @Override // defpackage.rn8, defpackage.yn8, android.app.Activity
    public final void onSaveInstanceState(Bundle bundle) {
        bundle.getClass();
        bundle.putBoolean("ARG_ROOT_IS_TICKET_DETAIL", this.f);
        super.onSaveInstanceState(bundle);
    }

    public final void z1(String str, boolean z) {
        Fragment fragmentG = getSupportFragmentManager().G(R.id.fragment_container);
        if (fragmentG instanceof wh5) {
            Bundle arguments = ((wh5) fragmentG).getArguments();
            InstantWinTicketDetailInput instantWinTicketDetailInput = arguments != null ? (InstantWinTicketDetailInput) ((Parcelable) rj5.a(arguments, "ARG_INPUT", InstantWinTicketDetailInput.class)) : null;
            if (Intrinsics.g(instantWinTicketDetailInput != null ? instantWinTicketDetailInput.b : null, str) && !z) {
                dd ddVar = this.b;
                if (ddVar != null) {
                    ddVar.a.post(new Runnable() { // from class: ve5
                        @Override // java.lang.Runnable
                        public final void run() {
                            int i2 = BuildAndGoHistoryActivity.i;
                            this.a.A1();
                        }
                    });
                    return;
                } else {
                    Intrinsics.n("binding");
                    throw null;
                }
            }
        }
        String str2 = String.format("FRAGMENT_TAG_TICKET_DETAIL_%s", Arrays.copyOf(new Object[]{str}, 1));
        InstantWinTicketDetailInput.b bVar = InstantWinTicketDetailInput.b.a;
        String str3 = this.c;
        InstantWinTicketDetailInput instantWinTicketDetailInput2 = new InstantWinTicketDetailInput(str3, str, bVar);
        wh5 wh5Var = new wh5();
        wh5Var.setArguments(vj5.a(new Pair("ARG_INPUT", instantWinTicketDetailInput2)));
        if (z) {
            this.f = true;
            FragmentManager supportFragmentManager = getSupportFragmentManager();
            supportFragmentManager.getClass();
            androidx.fragment.app.a aVar = new androidx.fragment.app.a(supportFragmentManager);
            aVar.f(R.id.fragment_container, wh5Var, str2);
            aVar.d();
            dd ddVar2 = this.b;
            if (ddVar2 != null) {
                ddVar2.a.post(new Runnable() { // from class: we5
                    @Override // java.lang.Runnable
                    public final void run() {
                        int i2 = BuildAndGoHistoryActivity.i;
                        this.a.A1();
                    }
                });
                return;
            } else {
                Intrinsics.n("binding");
                throw null;
            }
        }
        Fragment fragmentH = getSupportFragmentManager().H("FRAGMENT_TAG_BET_HISTORY");
        if (fragmentH == null) {
            InstantWinBetHistoryInput instantWinBetHistoryInput = new InstantWinBetHistoryInput(str3);
            gc5 gc5Var = new gc5();
            gc5Var.setArguments(vj5.a(new Pair("ARG_INPUT", instantWinBetHistoryInput)));
            FragmentManager supportFragmentManager2 = getSupportFragmentManager();
            supportFragmentManager2.getClass();
            androidx.fragment.app.a aVar2 = new androidx.fragment.app.a(supportFragmentManager2);
            aVar2.e(R.id.fragment_container, gc5Var, "FRAGMENT_TAG_BET_HISTORY", 1);
            aVar2.o(gc5Var);
            aVar2.l();
            fragmentH = gc5Var;
        }
        FragmentManager supportFragmentManager3 = getSupportFragmentManager();
        androidx.fragment.app.a aVarA = oke.a(supportFragmentManager3, supportFragmentManager3);
        if (fragmentH.isAdded() && !fragmentH.isHidden()) {
            aVarA.o(fragmentH);
        }
        aVarA.e(R.id.fragment_container, wh5Var, "details_".concat(str), 1);
        aVarA.c("details_".concat(str));
        aVarA.d();
        dd ddVar3 = this.b;
        if (ddVar3 != null) {
            ddVar3.a.post(new Runnable() { // from class: xe5
                @Override // java.lang.Runnable
                public final void run() {
                    int i2 = BuildAndGoHistoryActivity.i;
                    this.a.A1();
                }
            });
        } else {
            Intrinsics.n("binding");
            throw null;
        }
    }
}
