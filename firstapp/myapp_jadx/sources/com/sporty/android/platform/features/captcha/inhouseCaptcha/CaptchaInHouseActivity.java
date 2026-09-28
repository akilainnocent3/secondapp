package com.sporty.android.platform.features.captcha.inhouseCaptcha;

import android.content.Intent;
import android.os.Bundle;
import androidx.compose.runtime.a;
import com.sporty.android.platform.features.captcha.inhouseCaptcha.CaptchaInHouseActivity;
import defpackage.bb40;
import defpackage.bd6;
import defpackage.cyb;
import defpackage.haj;
import defpackage.jq40;
import defpackage.jvd0;
import defpackage.k9j;
import defpackage.lfy;
import defpackage.op8;
import defpackage.paj;
import defpackage.pdn;
import defpackage.pwx;
import defpackage.py1;
import defpackage.q8i0;
import defpackage.qlr;
import defpackage.r8i0;
import defpackage.rlf;
import defpackage.v8i0;
import defpackage.yc6;
import defpackage.zn8;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u0005B\u0007¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/sporty/android/platform/features/captcha/inhouseCaptcha/CaptchaInHouseActivity;", "Lpy1;", "Lk9j;", "Lpwx;", "Lbb40;", "Lrlf;", "<init>", "()V", "sportyplatform"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class CaptchaInHouseActivity extends py1 implements k9j, pwx, bb40, rlf {
    public static final /* synthetic */ int b = 0;
    public final q8i0 a = new q8i0(jq40.a(bd6.class), new c(), new b(), new d());

    public static final class a implements lfy, paj {
        public final /* synthetic */ yc6 a;

        public a(yc6 yc6Var) {
            this.a = yc6Var;
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
            return CaptchaInHouseActivity.this.getDefaultViewModelProviderFactory();
        }
    }

    public static final class c extends qlr implements Function0<v8i0> {
        public c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final v8i0 invoke() {
            return CaptchaInHouseActivity.this.getViewModelStore();
        }
    }

    public static final class d extends qlr implements Function0<cyb> {
        public d() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final cyb invoke() {
            return CaptchaInHouseActivity.this.getDefaultViewModelCreationExtras();
        }
    }

    @Override // defpackage.py1, defpackage.r1k, defpackage.hrl, androidx.fragment.app.e, defpackage.rn8, defpackage.yn8, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        zn8.a(this, new op8(144320484, new Function2() { // from class: xc6
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                a aVar = (a) obj;
                int iIntValue = ((Integer) obj2).intValue();
                int i = CaptchaInHouseActivity.b;
                if (aVar.q(iIntValue & 1, (iIntValue & 3) != 2)) {
                    final CaptchaInHouseActivity captchaInHouseActivity = this.a;
                    or0.a(null, false, false, null, pp8.b(-1689775187, new Function2() { // from class: zc6
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj3, Object obj4) {
                            a aVar2 = (a) obj3;
                            int iIntValue2 = ((Integer) obj4).intValue();
                            int i2 = CaptchaInHouseActivity.b;
                            if (aVar2.q(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                                final CaptchaInHouseActivity captchaInHouseActivity2 = captchaInHouseActivity;
                                ihe0.a(null, null, 0L, 0L, 0.0f, 0.0f, null, pp8.b(1264249906, new Function2() { // from class: ad6
                                    @Override // kotlin.jvm.functions.Function2
                                    public final Object invoke(Object obj5, Object obj6) {
                                        a aVar3 = (a) obj5;
                                        int iIntValue3 = ((Integer) obj6).intValue();
                                        int i3 = CaptchaInHouseActivity.b;
                                        if (aVar3.q(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                                            men.d(null, (bd6) captchaInHouseActivity2.a.getValue(), aVar3, bd6.y << 3);
                                        } else {
                                            aVar3.G();
                                        }
                                        return Unit.a;
                                    }
                                }, aVar2), aVar2, 12582912, 127);
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
        Intent intent = getIntent();
        if (intent != null) {
            z1(intent);
        }
        setFinishOnTouchOutside(true);
        ((bd6) this.a.getValue()).c.f(this, new a(new yc6(this, 0)));
    }

    @Override // defpackage.rn8, android.app.Activity
    public final void onNewIntent(Intent intent) {
        intent.getClass();
        super.onNewIntent(intent);
        z1(intent);
    }

    public final void z1(Intent intent) {
        int intExtra = intent.getIntExtra("key - id", -1);
        String stringExtra = intent.getStringExtra("key - site key");
        if (stringExtra == null) {
            stringExtra = "";
        }
        bd6 bd6Var = (bd6) this.a.getValue();
        jvd0 jvd0Var = bd6Var.v;
        if (jvd0Var != null) {
            jvd0Var.cancel((CancellationException) null);
        }
        bd6Var.f = intExtra;
        bd6Var.i = stringExtra;
        bd6Var.a.a(new pdn.a.c(intExtra));
        bd6Var.A1(true);
    }
}
