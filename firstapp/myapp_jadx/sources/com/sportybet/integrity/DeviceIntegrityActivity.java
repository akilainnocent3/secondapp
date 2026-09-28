package com.sportybet.integrity;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.compose.foundation.layout.HorizontalAlignElement;
import androidx.compose.foundation.layout.h;
import androidx.compose.runtime.a;
import androidx.compose.ui.c;
import androidx.compose.ui.d;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.platform.ComposeView;
import com.sporty.android.common_ui.uitext.StringUiText;
import com.sporty.android.common_ui.uitext.UiText;
import com.sportybet.android.gp.tz.R;
import com.sportybet.integrity.DeviceIntegrityActivity;
import defpackage.bb40;
import defpackage.ede;
import defpackage.gde;
import defpackage.hwr;
import defpackage.mpe0;
import defpackage.op8;
import defpackage.py1;
import defpackage.u6i0;
import defpackage.vxo;
import defpackage.yrh0;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/sportybet/integrity/DeviceIntegrityActivity;", "Lpy1;", "Lbb40;", "<init>", "()V", "a", "africa-bet-android"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class DeviceIntegrityActivity extends py1 implements bb40 {
    public static final /* synthetic */ int b = 0;
    public final mpe0 a = hwr.b(new ede(this, 0));

    public static final class a {
        public static void a(Context context, UiText uiText) {
            context.getClass();
            Intent flags = new Intent().setClass(context, DeviceIntegrityActivity.class).putExtra("msg", uiText).setFlags(537001984);
            flags.getClass();
            yrh0.s(context, flags, true);
        }
    }

    public static final class b implements Application.ActivityLifecycleCallbacks {
        public b() {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityCreated(Activity activity, Bundle bundle) {
            activity.getClass();
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityDestroyed(Activity activity) {
            activity.getClass();
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityPaused(Activity activity) {
            activity.getClass();
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityResumed(Activity activity) {
            activity.getClass();
            DeviceIntegrityActivity deviceIntegrityActivity = DeviceIntegrityActivity.this;
            if (activity.equals(deviceIntegrityActivity) || deviceIntegrityActivity.isFinishing()) {
                return;
            }
            int i = DeviceIntegrityActivity.b;
            Intent intent = deviceIntegrityActivity.getIntent();
            intent.getClass();
            UiText stringUiText = (UiText) vxo.a(intent, "msg", UiText.class);
            if (stringUiText == null) {
                stringUiText = new StringUiText("");
            }
            a.a(activity, stringUiText);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
            activity.getClass();
            bundle.getClass();
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityStarted(Activity activity) {
            activity.getClass();
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityStopped(Activity activity) {
            activity.getClass();
        }
    }

    @Override // defpackage.py1, defpackage.r1k, defpackage.hrl, androidx.fragment.app.e, defpackage.rn8, defpackage.yn8, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_base_compose);
        ComposeView composeView = (ComposeView) findViewById(R.id.compose_view);
        if (composeView != null) {
            composeView.setViewCompositionStrategy(u6i0.c.a);
            composeView.setContent(new op8(146941127, new Function2() { // from class: dde
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    a aVar = (a) obj;
                    int iIntValue = ((Integer) obj2).intValue();
                    int i = DeviceIntegrityActivity.b;
                    if (aVar.q(iIntValue & 1, (iIntValue & 3) != 2)) {
                        final DeviceIntegrityActivity deviceIntegrityActivity = this.a;
                        or0.a(null, false, false, null, pp8.b(668476254, new Function2() { // from class: fde
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj3, Object obj4) {
                                a aVar2 = (a) obj3;
                                int iIntValue2 = ((Integer) obj4).intValue();
                                int i2 = DeviceIntegrityActivity.b;
                                if (aVar2.q(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                                    d dVarF = h.f(androidx.compose.foundation.a.b(d.a.b, c68.a(R.color.background_type1_quaternary, aVar2), zk40.a), 24.0f);
                                    i78 i78VarA = g78.a(new kw0.i(12.0f, true, new hw0()), ht.a.m, aVar2, 6);
                                    int iHashCode = Long.hashCode(aVar2.m());
                                    ne00 ne00VarO = aVar2.o();
                                    d dVarC = c.c(aVar2, dVarF);
                                    yka.k.getClass();
                                    tsr.a aVar3 = yka.a.b;
                                    if (aVar2.k() == null) {
                                        l2a.b();
                                        throw null;
                                    }
                                    aVar2.D();
                                    if (aVar2.g()) {
                                        aVar2.F(aVar3);
                                    } else {
                                        aVar2.p();
                                    }
                                    hlh0.a(aVar2, i78VarA, yka.a.f);
                                    hlh0.a(aVar2, ne00VarO, yka.a.e);
                                    yka.a.C1350a c1350a = yka.a.g;
                                    if (aVar2.g() || !Intrinsics.g(aVar2.y(), Integer.valueOf(iHashCode))) {
                                        j3c.a(iHashCode, aVar2, iHashCode, c1350a);
                                    }
                                    hlh0.a(aVar2, dVarC, yka.a.d);
                                    Intent intent = deviceIntegrityActivity.getIntent();
                                    intent.getClass();
                                    UiText stringUiText = (UiText) vxo.a(intent, "msg", UiText.class);
                                    if (stringUiText == null) {
                                        stringUiText = new StringUiText("");
                                    }
                                    lkf0.d(stringUiText.g((Context) aVar2.O(AndroidCompositionLocals_androidKt.b)), null, c68.a(R.color.text_type1_primary, aVar2), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, aVar2, 0, 0, 262138);
                                    HorizontalAlignElement horizontalAlignElement = new HorizontalAlignElement(ht.a.o);
                                    String strA = cb40.a(R.string.common_functions__ok, new Object[0], aVar2);
                                    Object objY = aVar2.y();
                                    if (objY == a.C0041a.a) {
                                        objY = new s4a(1);
                                        aVar2.r(objY);
                                    }
                                    xya.a(horizontalAlignElement, false, strA, null, null, null, null, null, null, (Function0) objY, aVar2, 805306368, 506);
                                    aVar2.s();
                                } else {
                                    aVar2.G();
                                }
                                return Unit.a;
                            }
                        }, aVar), aVar, 24576);
                    } else {
                        aVar.G();
                    }
                    return Unit.a;
                }
            }, true));
        }
        getOnBackPressedDispatcher().a(this, new gde(true));
    }

    @Override // defpackage.r1k, defpackage.fq0, androidx.fragment.app.e, android.app.Activity
    public final void onStart() {
        super.onStart();
        getApplication().registerActivityLifecycleCallbacks((b) this.a.getValue());
    }

    @Override // defpackage.fq0, androidx.fragment.app.e, android.app.Activity
    public final void onStop() {
        super.onStop();
        getApplication().unregisterActivityLifecycleCallbacks((b) this.a.getValue());
    }
}
