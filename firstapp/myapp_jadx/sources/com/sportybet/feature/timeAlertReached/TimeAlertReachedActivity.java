package com.sportybet.feature.timeAlertReached;

import android.os.Bundle;
import androidx.compose.runtime.a;
import androidx.compose.ui.platform.ComposeView;
import com.sportybet.android.gp.tz.R;
import com.sportybet.feature.timeAlertReached.TimeAlertReachedActivity;
import defpackage.bb40;
import defpackage.d5m;
import defpackage.duf0;
import defpackage.op8;
import defpackage.u6i0;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/sportybet/feature/timeAlertReached/TimeAlertReachedActivity;", "Lty1;", "Lbb40;", "<init>", "()V", "africa-bet-android"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class TimeAlertReachedActivity extends d5m implements bb40 {
    public static final /* synthetic */ int b = 0;

    @Override // defpackage.py1, defpackage.r1k, defpackage.hrl, androidx.fragment.app.e, defpackage.rn8, defpackage.yn8, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_reached);
        ComposeView composeView = (ComposeView) findViewById(R.id.compose_view);
        if (composeView != null) {
            composeView.setViewCompositionStrategy(u6i0.c.a);
            composeView.setContent(new op8(-1576397925, new Function2() { // from class: buf0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    a aVar = (a) obj;
                    int iIntValue = ((Integer) obj2).intValue();
                    int i = TimeAlertReachedActivity.b;
                    if (aVar.q(iIntValue & 1, (iIntValue & 3) != 2)) {
                        final TimeAlertReachedActivity timeAlertReachedActivity = this.a;
                        or0.a(null, false, false, null, pp8.b(-1610861084, new Function2() { // from class: cuf0
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj3, Object obj4) {
                                a aVar2 = (a) obj3;
                                int iIntValue2 = ((Integer) obj4).intValue();
                                int i2 = TimeAlertReachedActivity.b;
                                int i3 = 1;
                                if (aVar2.q(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                                    TimeAlertReachedActivity timeAlertReachedActivity2 = timeAlertReachedActivity;
                                    boolean zA = aVar2.A(timeAlertReachedActivity2);
                                    Object objY = aVar2.y();
                                    a.C0041a.C0042a c0042a = a.C0041a.a;
                                    if (zA || objY == c0042a) {
                                        euf0 euf0Var = new euf0(0, timeAlertReachedActivity2, TimeAlertReachedActivity.class, "finish", "finish()V", 0);
                                        aVar2.r(euf0Var);
                                        objY = euf0Var;
                                    }
                                    Function0 function0 = (Function0) ((chp) objY);
                                    boolean zA2 = aVar2.A(timeAlertReachedActivity2);
                                    Object objY2 = aVar2.y();
                                    if (zA2 || objY2 == c0042a) {
                                        objY2 = new kz7(timeAlertReachedActivity2, i3);
                                        aVar2.r(objY2);
                                    }
                                    quf0.f(null, function0, (Function0) objY2, aVar2, 0);
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
        getOnBackPressedDispatcher().a(this, new duf0(true));
    }
}
