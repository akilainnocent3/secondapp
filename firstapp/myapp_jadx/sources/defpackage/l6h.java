package defpackage;

import com.sportybet.feature.facialrecognition.presentation.FacialRecognitionActivity;
import com.sportybet.plugin.webcontainer.activities.BaseWebViewActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.feature.facialrecognition.presentation.FacialRecognitionActivity$launchFacialRecognitionSdk$1", f = "FacialRecognitionActivity.kt", l = {157}, m = "invokeSuspend", v = 2)
public final class l6h extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public int a;
    public final /* synthetic */ FacialRecognitionActivity b;
    public final /* synthetic */ o7h.c c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l6h(FacialRecognitionActivity facialRecognitionActivity, o7h.c cVar, v1b<? super l6h> v1bVar) {
        super(2, v1bVar);
        this.b = facialRecognitionActivity;
        this.c = cVar;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new l6h(this.b, this.c, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((l6h) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        y5b y5bVar = y5b.a;
        int i = this.a;
        FacialRecognitionActivity facialRecognitionActivity = this.b;
        if (i == 0) {
            uj50.b(obj);
            ((BaseWebViewActivity) facialRecognitionActivity).webView.loadUrl(facialRecognitionActivity.I1().i.a("https", new String[]{"/br/m/wv/facial-recognition"}));
            this.a = 1;
            if (facialRecognitionActivity.M1(10, this) == y5bVar) {
                return y5bVar;
            }
        } else {
            if (i != 1) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            uj50.b(obj);
        }
        ((BaseWebViewActivity) facialRecognitionActivity).webView.evaluateJavascript(this.c.a, null);
        return Unit.a;
    }
}
