package defpackage;

import android.webkit.ValueCallback;
import android.webkit.WebView;
import com.sportybet.feature.facialrecognition.presentation.FacialRecognitionActivity;
import com.sportybet.plugin.webcontainer.activities.BaseWebViewActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.feature.facialrecognition.presentation.FacialRecognitionActivity$waitForFacialRecognitionSdk$2", f = "FacialRecognitionActivity.kt", l = {251}, m = "invokeSuspend", v = 2)
public final class p6h extends tje0 implements Function2<ez20<? super Boolean>, v1b<? super Unit>, Object> {
    public int a;
    public /* synthetic */ Object b;
    public final /* synthetic */ FacialRecognitionActivity c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p6h(v1b v1bVar, FacialRecognitionActivity facialRecognitionActivity) {
        super(2, v1bVar);
        this.c = facialRecognitionActivity;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        p6h p6hVar = new p6h(v1bVar, this.c);
        p6hVar.b = obj;
        return p6hVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(ez20<? super Boolean> ez20Var, v1b<? super Unit> v1bVar) {
        return ((p6h) create(ez20Var, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        final ez20 ez20Var = (ez20) this.b;
        y5b y5bVar = y5b.a;
        int i = this.a;
        if (i == 0) {
            uj50.b(obj);
            WebView webView = ((BaseWebViewActivity) this.c).webView;
            if (webView != null) {
                webView.evaluateJavascript("\n            (function() { return String(window.facialRecognition !== undefined); })();\n        ", new ValueCallback() { // from class: o6h
                    @Override // android.webkit.ValueCallback
                    public final void onReceiveValue(Object obj2) {
                        String str = (String) obj2;
                        str.getClass();
                        ez20Var.c(Boolean.valueOf(StringsKt.M(str, "true", true)));
                    }
                });
            }
            this.b = null;
            this.a = 1;
            if (az20.a(ez20Var, new zy20(), this) == y5bVar) {
                return y5bVar;
            }
        } else {
            if (i != 1) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            uj50.b(obj);
        }
        return Unit.a;
    }
}
