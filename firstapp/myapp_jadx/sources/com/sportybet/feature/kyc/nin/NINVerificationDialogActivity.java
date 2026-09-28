package com.sportybet.feature.kyc.nin;

import android.content.Intent;
import android.os.Bundle;
import defpackage.cyb;
import defpackage.d900;
import defpackage.jq40;
import defpackage.k9j;
import defpackage.op8;
import defpackage.p1o;
import defpackage.pwx;
import defpackage.pxl;
import defpackage.q8i0;
import defpackage.qlr;
import defpackage.r8i0;
import defpackage.rlf;
import defpackage.s6x;
import defpackage.v8i0;
import defpackage.zn8;
import defpackage.zux;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u0005B\u0007¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/sportybet/feature/kyc/nin/NINVerificationDialogActivity;", "Lty1;", "Lzux;", "Lpwx;", "Lk9j;", "Lrlf;", "<init>", "()V", "africa-bet-android"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class NINVerificationDialogActivity extends pxl implements zux, pwx, k9j, rlf {
    public static final /* synthetic */ int d = 0;
    public d900 b;
    public final q8i0 c = new q8i0(jq40.a(s6x.class), new b(), new a(), new c());

    public static final class a extends qlr implements Function0<r8i0.c> {
        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final r8i0.c invoke() {
            return NINVerificationDialogActivity.this.getDefaultViewModelProviderFactory();
        }
    }

    public static final class b extends qlr implements Function0<v8i0> {
        public b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final v8i0 invoke() {
            return NINVerificationDialogActivity.this.getViewModelStore();
        }
    }

    public static final class c extends qlr implements Function0<cyb> {
        public c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final cyb invoke() {
            return NINVerificationDialogActivity.this.getDefaultViewModelCreationExtras();
        }
    }

    @Override // defpackage.py1, defpackage.r1k, defpackage.hrl, androidx.fragment.app.e, defpackage.rn8, defpackage.yn8, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Intent intent = getIntent();
        if (intent != null) {
            boolean booleanExtra = intent.getBooleanExtra("isNameUpdateOn", false);
            String stringExtra = intent.getStringExtra("first_name");
            if (stringExtra == null) {
                stringExtra = "";
            }
            String stringExtra2 = intent.getStringExtra("last_name");
            ((s6x) this.c.getValue()).x1(stringExtra, stringExtra2 != null ? stringExtra2 : "", booleanExtra);
        }
        zn8.a(this, new op8(-93697249, new p1o(this), true));
    }
}
