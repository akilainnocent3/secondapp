package com.sportybet.feature.payment.impl.security.nameupdate.presentation.activity;

import android.content.Intent;
import android.os.Bundle;
import androidx.compose.runtime.a;
import com.sportybet.feature.payment.impl.security.nameupdate.presentation.activity.NameUpdateResultPopupActivity;
import defpackage.cyb;
import defpackage.jq40;
import defpackage.k9j;
import defpackage.op8;
import defpackage.pwx;
import defpackage.py1;
import defpackage.q8i0;
import defpackage.qlr;
import defpackage.r8i0;
import defpackage.rlf;
import defpackage.v8i0;
import defpackage.vdx;
import defpackage.wwd0;
import defpackage.zn8;
import defpackage.zux;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u0005:\u0001\bB\u0007¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\u000b²\u0006\f\u0010\n\u001a\u00020\t8\nX\u008a\u0084\u0002"}, d2 = {"Lcom/sportybet/feature/payment/impl/security/nameupdate/presentation/activity/NameUpdateResultPopupActivity;", "Lpy1;", "Lzux;", "Lpwx;", "Lk9j;", "Lrlf;", "<init>", "()V", "a", "", "msg", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class NameUpdateResultPopupActivity extends py1 implements zux, pwx, k9j, rlf {
    public static final a b = new a();
    public final q8i0 a = new q8i0(jq40.a(vdx.class), new c(), new b(), new d());

    public static final class a {
    }

    public static final class b extends qlr implements Function0<r8i0.c> {
        public b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final r8i0.c invoke() {
            return NameUpdateResultPopupActivity.this.getDefaultViewModelProviderFactory();
        }
    }

    public static final class c extends qlr implements Function0<v8i0> {
        public c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final v8i0 invoke() {
            return NameUpdateResultPopupActivity.this.getViewModelStore();
        }
    }

    public static final class d extends qlr implements Function0<cyb> {
        public d() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final cyb invoke() {
            return NameUpdateResultPopupActivity.this.getDefaultViewModelCreationExtras();
        }
    }

    @Override // defpackage.py1, defpackage.r1k, defpackage.hrl, androidx.fragment.app.e, defpackage.rn8, defpackage.yn8, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Intent intent = getIntent();
        if (intent != null) {
            vdx vdxVar = (vdx) this.a.getValue();
            String stringExtra = intent.getStringExtra("key - message");
            if (stringExtra == null) {
                stringExtra = "";
            }
            wwd0 wwd0Var = vdxVar.b;
            wwd0Var.getClass();
            wwd0Var.k(null, stringExtra);
        }
        zn8.a(this, new op8(958499530, new Function2() { // from class: qdx
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                a aVar = (a) obj;
                int iIntValue = ((Integer) obj2).intValue();
                NameUpdateResultPopupActivity.a aVar2 = NameUpdateResultPopupActivity.b;
                if (aVar.q(iIntValue & 1, (iIntValue & 3) != 2)) {
                    final NameUpdateResultPopupActivity nameUpdateResultPopupActivity = this.a;
                    or0.a(null, false, false, null, pp8.b(-916953631, new Function2() { // from class: rdx
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj3, Object obj4) {
                            a aVar3 = (a) obj3;
                            int iIntValue2 = ((Integer) obj4).intValue();
                            NameUpdateResultPopupActivity.a aVar4 = NameUpdateResultPopupActivity.b;
                            int i = 1;
                            if (aVar3.q(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                                ihe0.a(null, null, 0L, 0L, 0.0f, 0.0f, null, pp8.b(234601660, new e2j(nameUpdateResultPopupActivity, i), aVar3), aVar3, 12582912, 127);
                            } else {
                                aVar3.G();
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
        setFinishOnTouchOutside(true);
    }

    @Override // defpackage.rn8, android.app.Activity
    public final void onNewIntent(Intent intent) {
        intent.getClass();
        super.onNewIntent(intent);
        vdx vdxVar = (vdx) this.a.getValue();
        String stringExtra = intent.getStringExtra("key - message");
        if (stringExtra == null) {
            stringExtra = "";
        }
        wwd0 wwd0Var = vdxVar.b;
        wwd0Var.getClass();
        wwd0Var.k(null, stringExtra);
    }
}
