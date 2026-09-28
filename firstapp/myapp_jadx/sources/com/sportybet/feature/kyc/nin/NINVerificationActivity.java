package com.sportybet.feature.kyc.nin;

import android.content.Intent;
import android.os.Bundle;
import androidx.compose.runtime.a;
import com.sportybet.android.gp.tz.R;
import com.sportybet.android.payment.security.nameupdate.presentation.activity.NameUpdateWebViewActivity;
import com.sportybet.feature.kyc.nin.NINVerificationActivity;
import defpackage.cyb;
import defpackage.jq40;
import defpackage.k9j;
import defpackage.nxl;
import defpackage.op8;
import defpackage.q8i0;
import defpackage.qlr;
import defpackage.r8i0;
import defpackage.s6x;
import defpackage.v8i0;
import defpackage.zn8;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/sportybet/feature/kyc/nin/NINVerificationActivity;", "Lpy1;", "Lk9j;", "<init>", "()V", "africa-bet-android"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class NINVerificationActivity extends nxl implements k9j {
    public static final /* synthetic */ int c = 0;
    public final q8i0 b = new q8i0(jq40.a(s6x.class), new b(), new a(), new c());

    public static final class a extends qlr implements Function0<r8i0.c> {
        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final r8i0.c invoke() {
            return NINVerificationActivity.this.getDefaultViewModelProviderFactory();
        }
    }

    public static final class b extends qlr implements Function0<v8i0> {
        public b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final v8i0 invoke() {
            return NINVerificationActivity.this.getViewModelStore();
        }
    }

    public static final class c extends qlr implements Function0<cyb> {
        public c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final cyb invoke() {
            return NINVerificationActivity.this.getDefaultViewModelCreationExtras();
        }
    }

    @Override // defpackage.py1, defpackage.r1k, defpackage.hrl, androidx.fragment.app.e, defpackage.rn8, defpackage.yn8, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        String stringExtra = getIntent().getStringExtra("first_name");
        if (stringExtra == null) {
            stringExtra = "";
        }
        String stringExtra2 = getIntent().getStringExtra("last_name");
        ((s6x) this.b.getValue()).x1(stringExtra, stringExtra2 != null ? stringExtra2 : "", getIntent().getBooleanExtra("is_name_update_on", false));
        zn8.a(this, new op8(-1235920353, new Function2() { // from class: c5x
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                a aVar = (a) obj;
                int iIntValue = ((Integer) obj2).intValue();
                int i = NINVerificationActivity.c;
                if (aVar.q(iIntValue & 1, (iIntValue & 3) != 2)) {
                    final NINVerificationActivity nINVerificationActivity = this.a;
                    s6x s6xVar = (s6x) nINVerificationActivity.b.getValue();
                    boolean zA = aVar.A(nINVerificationActivity);
                    Object objY = aVar.y();
                    a.C0041a.C0042a c0042a = a.C0041a.a;
                    if (zA || objY == c0042a) {
                        objY = new d5x();
                        aVar.r(objY);
                    }
                    Function0 function0 = (Function0) objY;
                    boolean zA2 = aVar.A(nINVerificationActivity);
                    Object objY2 = aVar.y();
                    if (zA2 || objY2 == c0042a) {
                        objY2 = new Function0() { // from class: e5x
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                int i2 = NINVerificationActivity.c;
                                nINVerificationActivity.finish();
                                return Unit.a;
                            }
                        };
                        aVar.r(objY2);
                    }
                    Function0 function1 = (Function0) objY2;
                    Object objY3 = aVar.y();
                    if (objY3 == c0042a) {
                        objY3 = new f5x();
                        aVar.r(objY3);
                    }
                    Function0 function2 = (Function0) objY3;
                    boolean zA3 = aVar.A(nINVerificationActivity);
                    Object objY4 = aVar.y();
                    if (zA3 || objY4 == c0042a) {
                        objY4 = new Function0() { // from class: g5x
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                int i2 = NINVerificationActivity.c;
                                String strS = bjb0.S("/m/wv/mismatch-name-upload");
                                NINVerificationActivity nINVerificationActivity2 = nINVerificationActivity;
                                Intent intent = new Intent(nINVerificationActivity2, (Class<?>) NameUpdateWebViewActivity.class);
                                intent.setFlags(268435456);
                                Bundle bundle2 = new Bundle();
                                syi0.b(strS, bundle2);
                                intent.putExtras(bundle2);
                                intent.putExtra("title", sn5.b(nINVerificationActivity2, R.string.common_functions__identity_verification, new Object[0]));
                                nINVerificationActivity2.startActivity(intent);
                                return Unit.a;
                            }
                        };
                        aVar.r(objY4);
                    }
                    o6x.b(s6xVar, function0, function1, function2, (Function0) objY4, aVar, 3080);
                } else {
                    aVar.G();
                }
                return Unit.a;
            }
        }, true));
    }
}
