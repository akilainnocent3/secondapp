package defpackage;

import android.webkit.WebView;
import android.webkit.WebViewClient;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
public final class g8f0 extends WebViewClient {
    public final /* synthetic */ v5b a;
    public final /* synthetic */ h8f0 b;

    @c0d(c = "com.sportybet.feature.dedicatedteampage.shared.ui.TeamPagesWebViewKt$rememberTeamPagesWebView$state$1$1$1$onPageFinished$1", f = "TeamPagesWebView.kt", l = {51}, m = "invokeSuspend", v = 2)
    public static final class a extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ h8f0 b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(h8f0 h8f0Var, v1b<? super a> v1bVar) {
            super(2, v1bVar);
            this.b = h8f0Var;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            return new a(this.b, v1bVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
            return ((a) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            y5b y5bVar = y5b.a;
            int i = this.a;
            if (i == 0) {
                uj50.b(obj);
                this.a = 1;
                if (hkd.b(1200L, this) == y5bVar) {
                    return y5bVar;
                }
            } else {
                if (i != 1) {
                    ib5.a("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                uj50.b(obj);
            }
            ((x5a0) this.b.b).setValue(Boolean.FALSE);
            return Unit.a;
        }
    }

    public g8f0(v5b v5bVar, h8f0 h8f0Var) {
        this.a = v5bVar;
        this.b = h8f0Var;
    }

    @Override // android.webkit.WebViewClient
    public final void onPageFinished(WebView webView, String str) {
        ej5.c(this.a, null, null, new a(this.b, null), 3);
    }
}
