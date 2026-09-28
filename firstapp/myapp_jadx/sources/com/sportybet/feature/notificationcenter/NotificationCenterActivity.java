package com.sportybet.feature.notificationcenter;

import android.os.Bundle;
import androidx.compose.runtime.a;
import com.sportybet.feature.notificationcenter.NotificationCenterActivity;
import defpackage.ayl;
import defpackage.azm;
import defpackage.bb40;
import defpackage.cyb;
import defpackage.e4x;
import defpackage.f4x;
import defpackage.jq40;
import defpackage.k9j;
import defpackage.op8;
import defpackage.q8i0;
import defpackage.qlr;
import defpackage.r8i0;
import defpackage.saj;
import defpackage.v8i0;
import defpackage.yi5;
import defpackage.zn8;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\b²\u0006\f\u0010\u0007\u001a\u00020\u00068\nX\u008a\u0084\u0002"}, d2 = {"Lcom/sportybet/feature/notificationcenter/NotificationCenterActivity;", "Lpy1;", "Lk9j;", "Lbb40;", "<init>", "()V", "Lw3x;", "state", "africa-bet-android"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class NotificationCenterActivity extends ayl implements k9j, bb40 {
    public static final /* synthetic */ int e = 0;
    public azm b;
    public yi5 c;
    public final q8i0 d = new q8i0(jq40.a(e4x.class), new c(), new b(), new d());

    public static final /* synthetic */ class a extends saj implements Function1<f4x, Unit> {
        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(f4x f4xVar) {
            f4x f4xVar2 = f4xVar;
            f4xVar2.getClass();
            e4x e4xVar = (e4x) this.receiver;
            e4xVar.getClass();
            e4xVar.c = false;
            e4xVar.b.a(f4xVar2);
            return Unit.a;
        }
    }

    public static final class b extends qlr implements Function0<r8i0.c> {
        public b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final r8i0.c invoke() {
            return NotificationCenterActivity.this.getDefaultViewModelProviderFactory();
        }
    }

    public static final class c extends qlr implements Function0<v8i0> {
        public c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final v8i0 invoke() {
            return NotificationCenterActivity.this.getViewModelStore();
        }
    }

    public static final class d extends qlr implements Function0<cyb> {
        public d() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final cyb invoke() {
            return NotificationCenterActivity.this.getDefaultViewModelCreationExtras();
        }
    }

    @Override // defpackage.py1, defpackage.r1k, defpackage.hrl, androidx.fragment.app.e, defpackage.rn8, defpackage.yn8, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        zn8.a(this, new op8(224816027, new Function2() { // from class: m0y
            /* JADX WARN: Multi-variable type inference failed */
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                NotificationCenterActivity notificationCenterActivity = this.a;
                q8i0 q8i0Var = notificationCenterActivity.d;
                a aVar = (a) obj;
                int iIntValue = ((Integer) obj2).intValue();
                int i = NotificationCenterActivity.e;
                int i2 = 0;
                int i3 = 1;
                if (aVar.q(iIntValue & 1, (iIntValue & 3) != 2)) {
                    w3x w3xVar = (w3x) wyh.c(((e4x) q8i0Var.getValue()).f, aVar, 0, 7).getValue();
                    e4x e4xVar = (e4x) q8i0Var.getValue();
                    boolean zA = aVar.A(e4xVar);
                    Object objY = aVar.y();
                    a.C0041a.C0042a c0042a = a.C0041a.a;
                    if (zA || objY == c0042a) {
                        NotificationCenterActivity.a aVar2 = new NotificationCenterActivity.a(1, e4xVar, e4x.class, "onTabSelected", "onTabSelected(Lcom/sportybet/feature/notificationcenter/NCType;)V", 0);
                        aVar.r(aVar2);
                        objY = aVar2;
                    }
                    chp chpVar = (chp) objY;
                    boolean zA2 = aVar.A(notificationCenterActivity);
                    Object objY2 = aVar.y();
                    if (zA2 || objY2 == c0042a) {
                        objY2 = new n0y(notificationCenterActivity, i2);
                        aVar.r(objY2);
                    }
                    Function0 function0 = (Function0) objY2;
                    boolean zA3 = aVar.A(notificationCenterActivity);
                    Object objY3 = aVar.y();
                    if (zA3 || objY3 == c0042a) {
                        objY3 = new l51(notificationCenterActivity, i3);
                        aVar.r(objY3);
                    }
                    Function0 function1 = (Function0) objY3;
                    boolean zA4 = aVar.A(notificationCenterActivity);
                    Object objY4 = aVar.y();
                    if (zA4 || objY4 == c0042a) {
                        objY4 = new unj(notificationCenterActivity, i3);
                        aVar.r(objY4);
                    }
                    Function1 function2 = (Function1) objY4;
                    boolean zA5 = aVar.A(notificationCenterActivity);
                    Object objY5 = aVar.y();
                    if (zA5 || objY5 == c0042a) {
                        objY5 = new m51(notificationCenterActivity, i3);
                        aVar.r(objY5);
                    }
                    c1y.a(w3xVar, function0, function1, function2, (Function1) objY5, (Function1) chpVar, aVar, 0);
                } else {
                    aVar.G();
                }
                return Unit.a;
            }
        }, true));
    }
}
