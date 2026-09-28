package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.a;
import androidx.compose.ui.platform.ComposeView;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.e;
import com.sporty.android.core.model.social.ShareIntentType;
import com.sporty.android.core.model.tracking.AnalyticsEvent;
import com.sporty.android.core.model.tracking.AnalyticsParam;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class vp00 {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lvp00$a;", "Lcom/google/android/material/bottomsheet/c;", "<init>", "()V", "africa-bet-android"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final class a extends kzl {
        public uqm f;
        public iym i;
        public bnh0 v;

        /* JADX INFO: renamed from: vp00$a$a, reason: collision with other inner class name */
        public static final /* synthetic */ class C1220a {
            public static final /* synthetic */ int[] a;

            static {
                int[] iArr = new int[ShareIntentType.values().length];
                try {
                    iArr[ShareIntentType.TWITTER.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[ShareIntentType.FACEBOOK.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[ShareIntentType.WHATSAPP.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[ShareIntentType.TELEGRAM.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                a = iArr;
            }
        }

        public final void m0(String str, ShareIntentType shareIntentType, boolean z) {
            String str2;
            if (z) {
                iym iymVar = this.i;
                if (iymVar == null) {
                    Intrinsics.n("openTelemetryLogger");
                    throw null;
                }
                xnu xnuVar = new xnu();
                xnuVar.put(AnalyticsParam.SOCIAL_ACTION_TYPE, str);
                if (shareIntentType != null) {
                    int i = C1220a.a[shareIntentType.ordinal()];
                    if (i == 1) {
                        str2 = AnalyticsParam.EVENT_PARAM_SHARING_TYPE_X;
                    } else if (i == 2) {
                        str2 = AnalyticsParam.EVENT_PARAM_SHARING_TYPE_TELEGRAM;
                    } else if (i == 3) {
                        str2 = AnalyticsParam.EVENT_PARAM_SHARING_TYPE_WHATSAPP;
                    } else {
                        if (i != 4) {
                            uhc.a();
                            return;
                        }
                        str2 = AnalyticsParam.EVENT_PARAM_SHARING_TYPE_FACEBOOK;
                    }
                    xnuVar.put(AnalyticsParam.SOCIAL_MEDIA_TYPE, str2);
                }
                Unit unit = Unit.a;
                iymVar.e(AnalyticsEvent.SOCIAL_SHARE_PROFILE_CLICK, xnuVar.c());
            }
        }

        /* JADX WARN: Type inference failed for: r2v1, types: [up00] */
        @Override // androidx.fragment.app.Fragment
        public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
            final String string;
            Object bVar;
            layoutInflater.getClass();
            Context contextRequireContext = requireContext();
            contextRequireContext.getClass();
            boolean zEquals = false;
            ComposeView composeView = new ComposeView(contextRequireContext, null, 6, 0);
            Bundle arguments = getArguments();
            final String strA = "";
            if (arguments == null || (string = arguments.getString("social_share_username")) == null) {
                string = "";
            }
            if (string.length() > 0) {
                bnh0 bnh0Var = this.v;
                if (bnh0Var == null) {
                    Intrinsics.n("urlCreator");
                    throw null;
                }
                strA = bnh0Var.a("https", new String[]{"/player/".concat(string)});
            }
            try {
                zi50.a aVar = zi50.b;
                uqm uqmVar = this.f;
                if (uqmVar == null) {
                    Intrinsics.n("accountHelper");
                    throw null;
                }
                if (uqmVar.isLogin()) {
                    uqm uqmVar2 = this.f;
                    if (uqmVar2 == null) {
                        Intrinsics.n("accountHelper");
                        throw null;
                    }
                    zEquals = uqmVar2.getLastNickName().equals(string);
                }
                bVar = Boolean.valueOf(zEquals);
                if (zi50.a(bVar) != null) {
                    bVar = Boolean.FALSE;
                }
                final boolean zBooleanValue = ((Boolean) bVar).booleanValue();
                final tp00 tp00Var = new tp00(this, strA, zBooleanValue);
                final ?? r2 = new Function0(this) { // from class: up00
                    public final /* synthetic */ vp00.a b;

                    {
                        this.b = this;
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        yrh0.e(strA);
                        Unit unit = Unit.a;
                        this.b.m0(AnalyticsParam.SOCIAL_ACTION_TYPE_COPY, null, zBooleanValue);
                        return Unit.a;
                    }
                };
                composeView.setContent(new op8(-1425820976, new Function2() { // from class: yp00
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        a aVar2 = (a) obj;
                        int iIntValue = ((Integer) obj2).intValue();
                        if (aVar2.q(iIntValue & 1, (iIntValue & 3) != 2)) {
                            scv.b(null, null, null, pp8.b(-1860047964, new uir(string, zBooleanValue, tp00Var, r2), aVar2), aVar2, 3072, 7);
                        } else {
                            aVar2.G();
                        }
                        return Unit.a;
                    }
                }, true));
                return composeView;
            } catch (Throwable th) {
                zi50.a aVar2 = zi50.b;
                bVar = new zi50.b(th);
            }
        }
    }

    public static void a(Context context, String str) {
        context.getClass();
        str.getClass();
        FragmentManager supportFragmentManager = null;
        try {
            Context contextB = dvi.b(context);
            contextB.getClass();
            supportFragmentManager = ((e) contextB).getSupportFragmentManager();
            if (supportFragmentManager.H("PersonalSocialShareDialog") != null) {
                itf0.a aVar = itf0.a;
                aVar.q("PersonalSocialShareDialog");
                aVar.a("a dialog is already on the screen", new Object[0]);
                return;
            }
        } catch (ClassCastException unused) {
            itf0.a aVar2 = itf0.a;
            aVar2.q("PersonalSocialShareDialog");
            aVar2.a("Can't get fragment manager", new Object[0]);
        }
        if (supportFragmentManager == null || supportFragmentManager.K) {
            return;
        }
        Bundle bundleA = mll0.a("social_share_username", str);
        a aVar3 = new a();
        aVar3.setArguments(bundleA);
        aVar3.setCancelable(true);
        aVar3.show(supportFragmentManager, "PersonalSocialShareDialog");
    }
}
