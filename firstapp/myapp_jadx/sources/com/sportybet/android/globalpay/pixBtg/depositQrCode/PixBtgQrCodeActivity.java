package com.sportybet.android.globalpay.pixBtg.depositQrCode;

import android.os.Bundle;
import androidx.compose.runtime.a;
import com.sportybet.android.globalpay.pixBtg.depositQrCode.PixBtgQrCodeActivity;
import com.sportybet.android.globalpay.pixBtg.depositQrCode.d;
import defpackage.bb40;
import defpackage.cyb;
import defpackage.ej5;
import defpackage.fbh0;
import defpackage.jq40;
import defpackage.o8i0;
import defpackage.op8;
import defpackage.pzl;
import defpackage.q8i0;
import defpackage.qlr;
import defpackage.r8i0;
import defpackage.saj;
import defpackage.v8i0;
import defpackage.wwd0;
import defpackage.zn8;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/sportybet/android/globalpay/pixBtg/depositQrCode/PixBtgQrCodeActivity;", "Lpy1;", "Lbb40;", "<init>", "()V", "africa-bet-android"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class PixBtgQrCodeActivity extends pzl implements bb40 {
    public static final /* synthetic */ int d = 0;
    public fbh0 b;
    public final q8i0 c = new q8i0(jq40.a(com.sportybet.android.globalpay.pixBtg.depositQrCode.d.class), new c(), new b(), new d());

    public static final /* synthetic */ class a extends saj implements Function0<Unit> {
        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            ((PixBtgQrCodeActivity) this.receiver).finish();
            return Unit.a;
        }
    }

    public static final class b extends qlr implements Function0<r8i0.c> {
        public b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final r8i0.c invoke() {
            return PixBtgQrCodeActivity.this.getDefaultViewModelProviderFactory();
        }
    }

    public static final class c extends qlr implements Function0<v8i0> {
        public c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final v8i0 invoke() {
            return PixBtgQrCodeActivity.this.getViewModelStore();
        }
    }

    public static final class d extends qlr implements Function0<cyb> {
        public d() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final cyb invoke() {
            return PixBtgQrCodeActivity.this.getDefaultViewModelCreationExtras();
        }
    }

    @Override // defpackage.py1, defpackage.r1k, defpackage.hrl, androidx.fragment.app.e, defpackage.rn8, defpackage.yn8, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        zn8.a(this, new op8(625258583, new Function2() { // from class: w910
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                a aVar = (a) obj;
                int iIntValue = ((Integer) obj2).intValue();
                int i = PixBtgQrCodeActivity.d;
                if (aVar.q(iIntValue & 1, (iIntValue & 3) != 2)) {
                    final PixBtgQrCodeActivity pixBtgQrCodeActivity = this.a;
                    or0.a(null, false, false, null, pp8.b(-571193298, new Function2() { // from class: x910
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj3, Object obj4) {
                            a aVar2 = (a) obj3;
                            int iIntValue2 = ((Integer) obj4).intValue();
                            int i2 = PixBtgQrCodeActivity.d;
                            int i3 = 0;
                            if (aVar2.q(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                                final PixBtgQrCodeActivity pixBtgQrCodeActivity2 = pixBtgQrCodeActivity;
                                d dVar = (d) pixBtgQrCodeActivity2.c.getValue();
                                boolean zA = aVar2.A(pixBtgQrCodeActivity2);
                                Object objY = aVar2.y();
                                a.C0041a.C0042a c0042a = a.C0041a.a;
                                if (zA || objY == c0042a) {
                                    PixBtgQrCodeActivity.a aVar3 = new PixBtgQrCodeActivity.a(0, pixBtgQrCodeActivity2, PixBtgQrCodeActivity.class, "finish", "finish()V", 0);
                                    aVar2.r(aVar3);
                                    objY = aVar3;
                                }
                                Function0 function0 = (Function0) ((chp) objY);
                                boolean zA2 = aVar2.A(pixBtgQrCodeActivity2);
                                Object objY2 = aVar2.y();
                                if (zA2 || objY2 == c0042a) {
                                    objY2 = new Function0() { // from class: y910
                                        @Override // kotlin.jvm.functions.Function0
                                        public final Object invoke() {
                                            int i4 = PixBtgQrCodeActivity.d;
                                            fbh0 fbh0Var = pixBtgQrCodeActivity2.b;
                                            if (fbh0Var != null) {
                                                fbh0Var.e(o7d.a(wae.ME_TRANSACTIONS));
                                                return Unit.a;
                                            }
                                            Intrinsics.n("uiRouterManager");
                                            throw null;
                                        }
                                    };
                                    aVar2.r(objY2);
                                }
                                Function0 function1 = (Function0) objY2;
                                boolean zA3 = aVar2.A(pixBtgQrCodeActivity2);
                                Object objY3 = aVar2.y();
                                if (zA3 || objY3 == c0042a) {
                                    objY3 = new z910(pixBtgQrCodeActivity2, i3);
                                    aVar2.r(objY3);
                                }
                                oa10.f(dVar, function0, function1, (Function1) objY3, aVar2, 8);
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

    @Override // defpackage.py1, androidx.fragment.app.e, android.app.Activity
    public final void onPause() {
        super.onPause();
        getWindow().setFlags(8192, 8192);
    }

    @Override // defpackage.py1, androidx.fragment.app.e, android.app.Activity
    public final void onResume() {
        Object value;
        Object objB;
        Object value2;
        Object objB2;
        super.onResume();
        getWindow().clearFlags(8192);
        com.sportybet.android.globalpay.pixBtg.depositQrCode.d dVar = (com.sportybet.android.globalpay.pixBtg.depositQrCode.d) this.c.getValue();
        wwd0 wwd0Var = dVar.a;
        if (dVar.E && (wwd0Var.getValue() instanceof com.sportybet.android.globalpay.pixBtg.depositQrCode.c.C0238c)) {
            AtomicBoolean atomicBoolean = dVar.G;
            if (atomicBoolean.get()) {
                return;
            }
            atomicBoolean.set(true);
            wwd0Var.getClass();
            do {
                value = wwd0Var.getValue();
                objB = (com.sportybet.android.globalpay.pixBtg.depositQrCode.c) value;
                if (objB instanceof com.sportybet.android.globalpay.pixBtg.depositQrCode.c.C0238c) {
                    com.sportybet.android.globalpay.pixBtg.depositQrCode.c.C0238c c0238c = (com.sportybet.android.globalpay.pixBtg.depositQrCode.c.C0238c) objB;
                    c0238c.e.getClass();
                    objB = com.sportybet.android.globalpay.pixBtg.depositQrCode.c.C0238c.b(c0238c, null, new com.sportybet.android.globalpay.pixBtg.depositQrCode.c.a(123), 15);
                }
            } while (!wwd0Var.g(value, objB));
            do {
                value2 = wwd0Var.getValue();
                objB2 = (com.sportybet.android.globalpay.pixBtg.depositQrCode.c) value2;
                if (objB2 instanceof com.sportybet.android.globalpay.pixBtg.depositQrCode.c.C0238c) {
                    objB2 = com.sportybet.android.globalpay.pixBtg.depositQrCode.c.C0238c.b((com.sportybet.android.globalpay.pixBtg.depositQrCode.c.C0238c) objB2, null, null, 23);
                }
            } while (!wwd0Var.g(value2, objB2));
            ej5.c(o8i0.d(dVar), null, null, new f(dVar, null), 3);
        }
    }
}
