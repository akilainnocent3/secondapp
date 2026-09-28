package defpackage;

import android.net.Uri;
import com.sporty.android.core.model.MyLog;
import com.sportybet.android.luckynumber.LuckyNumberWebView;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;

/* JADX INFO: loaded from: classes.dex */
@c0d(c = "com.sportybet.android.luckynumber.LuckyNumberWebView$shareImageFromWeb$1", f = "LuckyNumberWebView.kt", l = {247}, m = "invokeSuspend", v = 2)
public final class k8u extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public int a;
    public /* synthetic */ Object b;
    public final /* synthetic */ LuckyNumberWebView c;
    public final /* synthetic */ String d;
    public final /* synthetic */ String e;
    public final /* synthetic */ String f;

    @c0d(c = "com.sportybet.android.luckynumber.LuckyNumberWebView$shareImageFromWeb$1$1$1", f = "LuckyNumberWebView.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class a extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public final /* synthetic */ LuckyNumberWebView a;
        public final /* synthetic */ Uri b;
        public final /* synthetic */ String c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(LuckyNumberWebView luckyNumberWebView, Uri uri, String str, v1b<? super a> v1bVar) {
            super(2, v1bVar);
            this.a = luckyNumberWebView;
            this.b = uri;
            this.c = str;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            return new a(this.a, this.b, this.c, v1bVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
            return ((a) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            y5b y5bVar = y5b.a;
            uj50.b(obj);
            Regex regex = LuckyNumberWebView.w;
            LuckyNumberWebView luckyNumberWebView = this.a;
            if (luckyNumberWebView.e == null) {
                Intrinsics.n("socialShareLauncher");
                throw null;
            }
            wha0.e(luckyNumberWebView, new dha0.c("", this.b, e190.d, null, this.c, null));
            return Unit.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k8u(LuckyNumberWebView luckyNumberWebView, String str, String str2, String str3, v1b<? super k8u> v1bVar) {
        super(2, v1bVar);
        this.c = luckyNumberWebView;
        this.d = str;
        this.e = str2;
        this.f = str3;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        k8u k8uVar = new k8u(this.c, this.d, this.e, this.f, v1bVar);
        k8uVar.b = obj;
        return k8uVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((k8u) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        Object bVar;
        y5b y5bVar = y5b.a;
        int i = this.a;
        try {
            if (i == 0) {
                uj50.b(obj);
                LuckyNumberWebView luckyNumberWebView = this.c;
                String str = this.d;
                String str2 = this.e;
                String str3 = this.f;
                zi50.a aVar = zi50.b;
                Regex regex = LuckyNumberWebView.w;
                Uri uriG1 = luckyNumberWebView.G1(str, str2);
                k5b k5bVar = luckyNumberWebView.c;
                if (k5bVar == null) {
                    Intrinsics.n("mainDispatcher");
                    throw null;
                }
                a aVar2 = new a(luckyNumberWebView, uriG1, str3, null);
                this.b = null;
                this.a = 1;
                if (ej5.d(k5bVar, aVar2, this) == y5bVar) {
                    return y5bVar;
                }
            } else {
                if (i != 1) {
                    ib5.a("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                uj50.b(obj);
            }
            bVar = Unit.a;
            zi50.a aVar3 = zi50.b;
        } catch (Throwable th) {
            zi50.a aVar4 = zi50.b;
            bVar = new zi50.b(th);
        }
        Throwable thA = zi50.a(bVar);
        if (thA != null) {
            itf0.a aVar5 = itf0.a;
            aVar5.a(e40.a(aVar5, MyLog.TAG_WEB, "shareImageFromWeb failed ", thA), new Object[0]);
        }
        return Unit.a;
    }
}
