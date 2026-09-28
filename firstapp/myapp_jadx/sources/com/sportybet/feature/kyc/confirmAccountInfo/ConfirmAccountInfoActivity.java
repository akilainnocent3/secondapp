package com.sportybet.feature.kyc.confirmAccountInfo;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.sporty.android.core.model.patron.UserCertConstants;
import com.sportybet.feature.kyc.nin.NINVerificationDialogActivity;
import defpackage.aqg0;
import defpackage.cyb;
import defpackage.fpl;
import defpackage.fsa;
import defpackage.jq40;
import defpackage.kqa;
import defpackage.lqa;
import defpackage.mny;
import defpackage.o7d;
import defpackage.op8;
import defpackage.pcx;
import defpackage.q8i0;
import defpackage.qlr;
import defpackage.r8i0;
import defpackage.saj;
import defpackage.sh8;
import defpackage.v8i0;
import defpackage.vd;
import defpackage.wae;
import defpackage.yt40;
import defpackage.zn8;
import defpackage.zt40;
import defpackage.zux;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/sportybet/feature/kyc/confirmAccountInfo/ConfirmAccountInfoActivity;", "Lpy1;", "Lzux;", "<init>", "()V", "africa-bet-android"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class ConfirmAccountInfoActivity extends fpl implements zux {
    public static final a d = new a();
    public String b;
    public final q8i0 c = new q8i0(jq40.a(com.sportybet.feature.kyc.confirmAccountInfo.f.class), new f(), new e(), new g());

    public static final class a extends vd<yt40, zt40> {
        @Override // defpackage.vd
        public final Intent a(Object obj, Context context) {
            ((yt40) obj).getClass();
            return new Intent(context, (Class<?>) ConfirmAccountInfoActivity.class);
        }

        @Override // defpackage.vd
        public final Object c(Intent intent, int i) {
            return i == 5002 ? zt40.b.a : zt40.a.a;
        }
    }

    public static final /* synthetic */ class b extends saj implements Function0<Unit> {
        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            ConfirmAccountInfoActivity confirmAccountInfoActivity = (ConfirmAccountInfoActivity) this.receiver;
            a aVar = ConfirmAccountInfoActivity.d;
            confirmAccountInfoActivity.getClass();
            sh8.c().e(o7d.a(wae.HOME));
            confirmAccountInfoActivity.setResult(5002);
            confirmAccountInfoActivity.finish();
            return Unit.a;
        }
    }

    public static final /* synthetic */ class c extends saj implements Function0<Unit> {
        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            ConfirmAccountInfoActivity confirmAccountInfoActivity = (ConfirmAccountInfoActivity) this.receiver;
            a aVar = ConfirmAccountInfoActivity.d;
            confirmAccountInfoActivity.getClass();
            Bundle bundle = new Bundle();
            bundle.putInt("key_param_tx_category", aqg0.e.c.a);
            sh8.c().c(o7d.a(wae.ME_TRANSACTIONS), bundle);
            confirmAccountInfoActivity.setResult(5002);
            confirmAccountInfoActivity.finish();
            return Unit.a;
        }
    }

    public static final /* synthetic */ class d extends saj implements Function1<fsa, Unit> {
        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(fsa fsaVar) {
            fsa fsaVar2 = fsaVar;
            fsaVar2.getClass();
            ConfirmAccountInfoActivity confirmAccountInfoActivity = (ConfirmAccountInfoActivity) this.receiver;
            a aVar = ConfirmAccountInfoActivity.d;
            confirmAccountInfoActivity.getClass();
            if (fsaVar2.d) {
                Intent intent = new Intent(confirmAccountInfoActivity, (Class<?>) NINVerificationDialogActivity.class);
                intent.putExtra("first_name", fsaVar2.b);
                intent.putExtra("last_name", fsaVar2.c);
                intent.putExtra("isNameUpdateOn", fsaVar2.e);
                confirmAccountInfoActivity.startActivity(intent);
                confirmAccountInfoActivity.setResult(5001);
                confirmAccountInfoActivity.finish();
            } else {
                confirmAccountInfoActivity.setResult(5002);
                confirmAccountInfoActivity.finish();
            }
            confirmAccountInfoActivity.getConfirmNameDialogLauncher().a();
            return Unit.a;
        }
    }

    public static final class e extends qlr implements Function0<r8i0.c> {
        public e() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final r8i0.c invoke() {
            return ConfirmAccountInfoActivity.this.getDefaultViewModelProviderFactory();
        }
    }

    public static final class f extends qlr implements Function0<v8i0> {
        public f() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final v8i0 invoke() {
            return ConfirmAccountInfoActivity.this.getViewModelStore();
        }
    }

    public static final class g extends qlr implements Function0<cyb> {
        public g() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final cyb invoke() {
            return ConfirmAccountInfoActivity.this.getDefaultViewModelCreationExtras();
        }
    }

    @Override // defpackage.py1, defpackage.r1k, defpackage.hrl, androidx.fragment.app.e, defpackage.rn8, defpackage.yn8, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (getIntent() != null && getIntent().hasExtra(UserCertConstants.EXTRA_SOURCE)) {
            getIntent().getIntExtra(UserCertConstants.EXTRA_SOURCE, 2000);
        }
        Intent intent = getIntent();
        this.b = intent != null ? intent.getStringExtra(UserCertConstants.EXTRA_TRIGGER) : null;
        int i = 0;
        zn8.a(this, new op8(-782105401, new kqa(this, i), true));
        com.sportybet.feature.kyc.confirmAccountInfo.f fVar = (com.sportybet.feature.kyc.confirmAccountInfo.f) this.c.getValue();
        String str = this.b;
        pcx.b.getClass();
        fVar.e = pcx.a.a(str);
        mny.a(getOnBackPressedDispatcher(), null, new lqa(this, i), 3);
    }
}
