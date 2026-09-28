package com.sportybet.android.user.kyc;

import android.webkit.WebView;
import defpackage.c0d;
import defpackage.c0n;
import defpackage.ib5;
import defpackage.tje0;
import defpackage.uj50;
import defpackage.v1b;
import defpackage.v5b;
import defpackage.y5b;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.android.user.kyc.KYCActivity$setupWebView$1$1", f = "KYCActivity.kt", l = {}, m = "invokeSuspend", v = 2)
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lv5b;", "", "<anonymous>", "(Lv5b;)V"}, k = 3, mv = {2, 4, 0})
final class KYCActivity$setupWebView$1$1 extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    final /* synthetic */ String $srcUrlWithTheme;
    final /* synthetic */ WebView $this_with;
    int label;
    final /* synthetic */ KYCActivity this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public KYCActivity$setupWebView$1$1(WebView webView, String str, KYCActivity kYCActivity, v1b<? super KYCActivity$setupWebView$1$1> v1bVar) {
        super(2, v1bVar);
        this.$this_with = webView;
        this.$srcUrlWithTheme = str;
        this.this$0 = kYCActivity;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new KYCActivity$setupWebView$1$1(this.$this_with, this.$srcUrlWithTheme, this.this$0, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((KYCActivity$setupWebView$1$1) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        y5b y5bVar = y5b.a;
        if (this.label != 0) {
            ib5.a("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        uj50.b(obj);
        WebView webView = this.$this_with;
        String str = this.$srcUrlWithTheme;
        c0n c0nVar = this.this$0.D;
        if (c0nVar != null) {
            webView.loadUrl(str, c0nVar.b());
            return Unit.a;
        }
        Intrinsics.n("urlTool");
        throw null;
    }
}
