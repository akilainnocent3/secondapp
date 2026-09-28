package com.sporty.android.platform.features.account.addemailprompt;

import android.os.Bundle;
import defpackage.bb40;
import defpackage.cyb;
import defpackage.eg;
import defpackage.jq40;
import defpackage.op8;
import defpackage.pwx;
import defpackage.q8i0;
import defpackage.qll;
import defpackage.qlr;
import defpackage.r8i0;
import defpackage.rlf;
import defpackage.v8i0;
import defpackage.zn8;
import defpackage.zux;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u0005B\u0007¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\n²\u0006\f\u0010\t\u001a\u00020\b8\nX\u008a\u0084\u0002"}, d2 = {"Lcom/sporty/android/platform/features/account/addemailprompt/AddEmailPromptBottomSheetActivity;", "Lpy1;", "Lrlf;", "Lbb40;", "Lzux;", "Lpwx;", "<init>", "()V", "Lcom/sporty/android/platform/features/account/addemailprompt/c;", "state", "sportyplatform"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class AddEmailPromptBottomSheetActivity extends qll implements rlf, bb40, zux, pwx {
    public static final /* synthetic */ int c = 0;
    public final q8i0 b = new q8i0(jq40.a(e.class), new b(), new a(), new c());

    public static final class a extends qlr implements Function0<r8i0.c> {
        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final r8i0.c invoke() {
            return AddEmailPromptBottomSheetActivity.this.getDefaultViewModelProviderFactory();
        }
    }

    public static final class b extends qlr implements Function0<v8i0> {
        public b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final v8i0 invoke() {
            return AddEmailPromptBottomSheetActivity.this.getViewModelStore();
        }
    }

    public static final class c extends qlr implements Function0<cyb> {
        public c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final cyb invoke() {
            return AddEmailPromptBottomSheetActivity.this.getDefaultViewModelCreationExtras();
        }
    }

    @Override // defpackage.py1, defpackage.r1k, defpackage.hrl, androidx.fragment.app.e, defpackage.rn8, defpackage.yn8, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        zn8.a(this, new op8(1370461117, new eg(this, 0), true));
    }
}
