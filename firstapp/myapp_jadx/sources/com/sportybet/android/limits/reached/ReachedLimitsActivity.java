package com.sportybet.android.limits.reached;

import android.os.Bundle;
import androidx.compose.runtime.a;
import androidx.compose.ui.platform.ComposeView;
import com.sportybet.android.gp.tz.R;
import com.sportybet.android.limits.reached.ReachedLimitsActivity;
import defpackage.d1m;
import defpackage.g140;
import defpackage.op8;
import defpackage.u6i0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.text.StringsKt__StringsKt;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/sportybet/android/limits/reached/ReachedLimitsActivity;", "Le22;", "<init>", "()V", "africa-bet-android"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class ReachedLimitsActivity extends d1m {
    public static final /* synthetic */ int i = 0;

    @Override // defpackage.py1, defpackage.r1k, defpackage.hrl, androidx.fragment.app.e, defpackage.rn8, defpackage.yn8, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_reached_limits);
        ComposeView composeView = (ComposeView) findViewById(R.id.compose_view);
        if (composeView != null) {
            composeView.setViewCompositionStrategy(u6i0.c.a);
            composeView.setContent(new op8(-126005695, new Function2() { // from class: d140
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    a aVar = (a) obj;
                    int iIntValue = ((Integer) obj2).intValue();
                    int i2 = ReachedLimitsActivity.i;
                    if (aVar.q(iIntValue & 1, (iIntValue & 3) != 2)) {
                        final ReachedLimitsActivity reachedLimitsActivity = this.a;
                        or0.a(null, false, false, null, pp8.b(-157890166, new Function2() { // from class: e140
                            /* JADX WARN: Multi-variable type inference failed */
                            /* JADX WARN: Type inference failed for: r1v1, types: [java.util.List] */
                            /* JADX WARN: Type inference failed for: r8v11, types: [java.util.ArrayList] */
                            /* JADX WARN: Type inference failed for: r8v7, types: [m2g] */
                            /* JADX WARN: Type inference failed for: r8v8 */
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj3, Object obj4) {
                                ?? arrayList;
                                c140 c140VarValueOf;
                                a aVar2 = (a) obj3;
                                int iIntValue2 = ((Integer) obj4).intValue();
                                int i3 = ReachedLimitsActivity.i;
                                int i4 = 0;
                                if (aVar2.q(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                                    ReachedLimitsActivity reachedLimitsActivity2 = reachedLimitsActivity;
                                    String stringExtra = reachedLimitsActivity2.getIntent().getStringExtra("reached_limits_key");
                                    if (stringExtra != null) {
                                        List listSplit$default = StringsKt__StringsKt.split$default(stringExtra, new String[]{","}, false, 0, 6, null);
                                        arrayList = new ArrayList();
                                        Iterator it = listSplit$default.iterator();
                                        while (it.hasNext()) {
                                            try {
                                                c140VarValueOf = c140.valueOf((String) it.next());
                                            } catch (IllegalArgumentException unused) {
                                                c140VarValueOf = null;
                                            }
                                            if (c140VarValueOf != null) {
                                                arrayList.add(c140VarValueOf);
                                            }
                                        }
                                    } else {
                                        arrayList = m2g.a;
                                    }
                                    boolean zA = aVar2.A(reachedLimitsActivity2);
                                    Object objY = aVar2.y();
                                    a.C0041a.C0042a c0042a = a.C0041a.a;
                                    if (zA || objY == c0042a) {
                                        objY = new xj3(reachedLimitsActivity2);
                                        aVar2.r(objY);
                                    }
                                    Function0 function0 = (Function0) ((chp) objY);
                                    boolean zA2 = aVar2.A(reachedLimitsActivity2);
                                    Object objY2 = aVar2.y();
                                    if (zA2 || objY2 == c0042a) {
                                        objY2 = new f140(reachedLimitsActivity2, i4);
                                        aVar2.r(objY2);
                                    }
                                    w140.g(null, arrayList, function0, (Function1) objY2, aVar2, 0);
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
        getOnBackPressedDispatcher().a(this, new g140(true));
    }
}
