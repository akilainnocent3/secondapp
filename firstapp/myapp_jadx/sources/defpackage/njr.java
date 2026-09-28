package defpackage;

import android.webkit.CookieManager;
import android.webkit.WebView;
import com.sportybet.android.share.presentation.activity.ShareCodeActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class njr implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ njr(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.a;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                WebView webView = (WebView) obj;
                webView.getClass();
                gjr gjrVar = (gjr) ((ytw) obj2).getValue();
                if (gjrVar != null) {
                    String str = gjrVar.b;
                    String str2 = gjrVar.c;
                    CookieManager cookieManagerA = h0j0.a();
                    if (cookieManagerA != null) {
                        cookieManagerA.setAcceptThirdPartyCookies(webView, true);
                        String strB = h0j0.b(str);
                        String strA = inm.a("locale=", str2);
                        if (!StringsKt.U(strB) && !StringsKt.U(strA)) {
                            cookieManagerA.setCookie(strB, strA);
                        }
                        String strA2 = inm.a("sb_country=", str2);
                        if (!StringsKt.U(str) && !StringsKt.U(strA2)) {
                            cookieManagerA.setCookie(str, strA2);
                        }
                        String strA3 = inm.a("download-source=", gjrVar.e);
                        if (!StringsKt.U(str) && !StringsKt.U(strA3)) {
                            cookieManagerA.setCookie(str, strA3);
                        }
                    }
                    gjrVar.f.c(webView, str);
                }
                return Unit.a;
            default:
                h190 h190Var = (h190) obj;
                h190Var.getClass();
                ShareCodeActivity shareCodeActivity = ShareCodeActivity.this;
                int i2 = ShareCodeActivity.j0;
                String str3 = h190Var.a;
                i190 i190Var = h190Var.d;
                if (i190Var == i190.b) {
                    shareCodeActivity.B1().a(new v190(0), k00.d);
                } else {
                    shareCodeActivity.B1().a(new w190(0), k00.d);
                }
                f190 f190Var = shareCodeActivity.e;
                if (f190Var != null) {
                    f190Var.a(str3, i190Var);
                    return Unit.a;
                }
                Intrinsics.n("shareNavigator");
                throw null;
        }
    }
}
