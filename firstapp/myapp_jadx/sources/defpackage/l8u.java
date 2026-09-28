package defpackage;

import com.sportybet.android.luckynumber.LuckyNumberWebView;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;

/* JADX INFO: loaded from: classes.dex */
@c0d(c = "com.sportybet.android.luckynumber.LuckyNumberWebView$shareTextFromWeb$1", f = "LuckyNumberWebView.kt", l = {}, m = "invokeSuspend", v = 2)
public final class l8u extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public final /* synthetic */ LuckyNumberWebView a;
    public final /* synthetic */ String b;
    public final /* synthetic */ String c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l8u(LuckyNumberWebView luckyNumberWebView, String str, String str2, v1b<? super l8u> v1bVar) {
        super(2, v1bVar);
        this.a = luckyNumberWebView;
        this.b = str;
        this.c = str2;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new l8u(this.a, this.b, this.c, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((l8u) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        String str = this.b;
        if (str == null) {
            str = "";
        }
        String str2 = str;
        Regex regex = LuckyNumberWebView.w;
        LuckyNumberWebView luckyNumberWebView = this.a;
        if (luckyNumberWebView.e != null) {
            wha0.e(luckyNumberWebView, new dha0.c(str2, null, e190.d, null, this.c, null));
            return Unit.a;
        }
        Intrinsics.n("socialShareLauncher");
        throw null;
    }
}
