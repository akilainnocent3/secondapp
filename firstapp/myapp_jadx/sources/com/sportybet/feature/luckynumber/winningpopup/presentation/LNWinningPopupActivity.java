package com.sportybet.feature.luckynumber.winningpopup.presentation;

import android.os.Build;
import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;
import androidx.compose.runtime.a;
import com.sportybet.android.router.Sender;
import com.sportybet.feature.luckynumber.winningpopup.presentation.LNWinningPopupActivity;
import defpackage.azm;
import defpackage.bb40;
import defpackage.c0d;
import defpackage.cyb;
import defpackage.gaj;
import defpackage.hul;
import defpackage.jq40;
import defpackage.k9j;
import defpackage.n5u;
import defpackage.op8;
import defpackage.phx;
import defpackage.q8i0;
import defpackage.qlr;
import defpackage.r8i0;
import defpackage.rlf;
import defpackage.tje0;
import defpackage.uhc;
import defpackage.uj50;
import defpackage.v1b;
import defpackage.v5b;
import defpackage.v8i0;
import defpackage.wae;
import defpackage.y5b;
import defpackage.yfx;
import defpackage.z7j0;
import defpackage.zn8;
import defpackage.zux;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u0005B\u0007¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\n²\u0006\f\u0010\t\u001a\u00020\b8\nX\u008a\u0084\u0002"}, d2 = {"Lcom/sportybet/feature/luckynumber/winningpopup/presentation/LNWinningPopupActivity;", "Lpy1;", "Lrlf;", "Lbb40;", "Lzux;", "Lk9j;", "<init>", "()V", "Lclr;", "state", "luckynumber"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class LNWinningPopupActivity extends hul implements rlf, bb40, zux, k9j {
    public static final /* synthetic */ int d = 0;
    public azm b;
    public final q8i0 c = new q8i0(jq40.a(com.sportybet.feature.luckynumber.winningpopup.presentation.c.class), new c(), new b(), new d());

    @c0d(c = "com.sportybet.feature.luckynumber.winningpopup.presentation.LNWinningPopupActivity$onCreate$1$1$1$1$5$1$1", f = "LNWinningPopupActivity.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class a extends tje0 implements gaj<v5b, com.sportybet.feature.luckynumber.winningpopup.presentation.b, v1b<? super Unit>, Object> {
        public /* synthetic */ com.sportybet.feature.luckynumber.winningpopup.presentation.b a;
        public final /* synthetic */ phx b;
        public final /* synthetic */ LNWinningPopupActivity c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(phx phxVar, LNWinningPopupActivity lNWinningPopupActivity, v1b<? super a> v1bVar) {
            super(3, v1bVar);
            this.b = phxVar;
            this.c = lNWinningPopupActivity;
        }

        @Override // defpackage.gaj
        public final Object invoke(v5b v5bVar, com.sportybet.feature.luckynumber.winningpopup.presentation.b bVar, v1b<? super Unit> v1bVar) {
            a aVar = new a(this.b, this.c, v1bVar);
            aVar.a = bVar;
            return aVar.invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            com.sportybet.feature.luckynumber.winningpopup.presentation.b bVar = this.a;
            y5b y5bVar = y5b.a;
            uj50.b(obj);
            boolean z = bVar instanceof com.sportybet.feature.luckynumber.winningpopup.presentation.b.C0412b;
            phx phxVar = this.b;
            if (z) {
                yfx.h(phxVar, ((com.sportybet.feature.luckynumber.winningpopup.presentation.b.C0412b) bVar).a, null, 6);
            } else if (Intrinsics.g(bVar, com.sportybet.feature.luckynumber.winningpopup.presentation.b.c.a)) {
                phxVar.k();
            } else {
                if (!(bVar instanceof com.sportybet.feature.luckynumber.winningpopup.presentation.b.a)) {
                    uhc.a();
                    return null;
                }
                LNWinningPopupActivity lNWinningPopupActivity = this.c;
                azm azmVar = lNWinningPopupActivity.b;
                if (azmVar == null) {
                    Intrinsics.n("iRouter");
                    throw null;
                }
                azmVar.i(wae.LUCKY_NUMBER, n5u.c(((com.sportybet.feature.luckynumber.winningpopup.presentation.b.a) bVar).a), null, Sender.LUCKY_NUMBER_WINNING_POPUP);
                lNWinningPopupActivity.finish();
            }
            return Unit.a;
        }
    }

    public static final class b extends qlr implements Function0<r8i0.c> {
        public b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final r8i0.c invoke() {
            return LNWinningPopupActivity.this.getDefaultViewModelProviderFactory();
        }
    }

    public static final class c extends qlr implements Function0<v8i0> {
        public c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final v8i0 invoke() {
            return LNWinningPopupActivity.this.getViewModelStore();
        }
    }

    public static final class d extends qlr implements Function0<cyb> {
        public d() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final cyb invoke() {
            return LNWinningPopupActivity.this.getDefaultViewModelCreationExtras();
        }
    }

    @Override // defpackage.py1, defpackage.r1k, defpackage.hrl, androidx.fragment.app.e, defpackage.rn8, defpackage.yn8, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        z7j0.a(getWindow(), false);
        getWindow().addFlags(Integer.MIN_VALUE);
        getWindow().clearFlags(201326592);
        getWindow().setStatusBarColor(0);
        getWindow().setNavigationBarColor(0);
        int i = Build.VERSION.SDK_INT;
        if (i >= 28) {
            Window window = getWindow();
            WindowManager.LayoutParams attributes = getWindow().getAttributes();
            attributes.layoutInDisplayCutoutMode = 1;
            window.setAttributes(attributes);
        }
        if (i >= 29) {
            getWindow().setStatusBarContrastEnforced(false);
            getWindow().setNavigationBarContrastEnforced(false);
        }
        zn8.a(this, new op8(-103117754, new Function2() { // from class: ujr
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                a aVar = (a) obj;
                int iIntValue = ((Integer) obj2).intValue();
                int i2 = LNWinningPopupActivity.d;
                if (aVar.q(iIntValue & 1, (iIntValue & 3) != 2)) {
                    u7u.b(48, 1, pp8.b(1606123584, new zjr(this.a), aVar), aVar, false);
                } else {
                    aVar.G();
                }
                return Unit.a;
            }
        }, true));
    }

    public final com.sportybet.feature.luckynumber.winningpopup.presentation.c z1() {
        return (com.sportybet.feature.luckynumber.winningpopup.presentation.c) this.c.getValue();
    }
}
