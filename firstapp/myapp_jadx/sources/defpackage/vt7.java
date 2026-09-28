package defpackage;

import com.google.firebase.perf.network.FirebasePerfUrlConnection;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.ranges.IntRange;

/* JADX INFO: loaded from: classes4.dex */
@c0d(c = "com.sporty.android.common.cloudflare.CloudflareViewModel$monitorCloudflareWebViewConnection$1", f = "CloudflareViewModel.kt", l = {75}, m = "invokeSuspend", v = 2)
public final class vt7 extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public int a;
    public final /* synthetic */ String b;
    public final /* synthetic */ au7 c;

    @c0d(c = "com.sporty.android.common.cloudflare.CloudflareViewModel$monitorCloudflareWebViewConnection$1$responseCode$1", f = "CloudflareViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class a extends tje0 implements Function2<v5b, v1b<? super Integer>, Object> {
        public final /* synthetic */ HttpURLConnection a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(HttpURLConnection httpURLConnection, v1b<? super a> v1bVar) {
            super(2, v1bVar);
            this.a = httpURLConnection;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            return new a(this.a, v1bVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(v5b v5bVar, v1b<? super Integer> v1bVar) {
            return ((a) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            y5b y5bVar = y5b.a;
            uj50.b(obj);
            return new Integer(this.a.getResponseCode());
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vt7(String str, au7 au7Var, v1b<? super vt7> v1bVar) {
        super(2, v1bVar);
        this.b = str;
        this.c = au7Var;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new vt7(this.b, this.c, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((vt7) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        y5b y5bVar = y5b.a;
        int i = this.a;
        au7 au7Var = this.c;
        String str = this.b;
        try {
            if (i == 0) {
                uj50.b(obj);
                URLConnection uRLConnection = (URLConnection) FirebasePerfUrlConnection.instrument(new URL(str).openConnection());
                uRLConnection.getClass();
                HttpURLConnection httpURLConnection = (HttpURLConnection) uRLConnection;
                httpURLConnection.setRequestMethod("HEAD");
                a aVar = new a(httpURLConnection, null);
                this.a = 1;
                obj = vxf0.c(5000L, aVar, this);
                if (obj == y5bVar) {
                    return y5bVar;
                }
            } else {
                if (i != 1) {
                    ib5.a("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                uj50.b(obj);
            }
            Integer num = (Integer) obj;
            if (str != null) {
                IntRange intRange = new IntRange(400, 600, 1);
                if ((num != null && intRange.e(num.intValue())) || num == null) {
                    au7Var.y1(qt7.b);
                }
            }
        } catch (Exception e) {
            itf0.a.d("Error monitoring cloudflare webView connection: " + e, new Object[0]);
            au7Var.y1(qt7.b);
        }
        return Unit.a;
    }
}
