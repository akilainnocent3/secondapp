package defpackage;

import android.content.Context;
import android.content.IntentFilter;
import android.webkit.URLUtil;
import com.google.firebase.perf.network.FirebasePerfOkHttpClient;
import com.sporty.android.core.model.MyLog;
import com.sporty.android.core.model.appupdate.AppDownloadAction;
import com.sporty.android.core.model.config.VersionData;
import com.sportybet.android.fileprovider.MyFileProvider;
import com.sportybet.android.gp.tz.R;
import java.io.File;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.text.StringsKt;
import okhttp3.Call;
import okhttp3.Request;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.android.update.SportyAppUpdateManager$downloadInBackground$2", f = "SportyAppUpdateManager.kt", l = {236}, m = "invokeSuspend", v = 2)
public final class ygb0 extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public int a;
    public final /* synthetic */ fhb0 b;
    public final /* synthetic */ VersionData c;

    public static final class a implements hob0 {
        public final /* synthetic */ fhb0 a;

        public a(fhb0 fhb0Var) {
            this.a = fhb0Var;
        }

        @Override // defpackage.hob0
        public final void a(fob0.b bVar) {
            fob0.b bVar2 = fob0.b.a;
            wwd0 wwd0Var = this.a.n;
            if (bVar == bVar2) {
                wwd0Var.setValue(AppDownloadAction.ApkDownloadSuccess.INSTANCE);
            } else {
                wwd0Var.setValue(AppDownloadAction.ApkDownloadFailure.INSTANCE);
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ygb0(fhb0 fhb0Var, VersionData versionData, v1b<? super ygb0> v1bVar) {
        super(2, v1bVar);
        this.b = fhb0Var;
        this.c = versionData;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new ygb0(this.b, this.c, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((ygb0) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        File file;
        String str;
        String str2;
        y5b y5bVar = y5b.a;
        int i = this.a;
        if (i == 0) {
            uj50.b(obj);
            if (this.b.j.b().f() || (this.b.n.getValue() instanceof AppDownloadAction.ApkDownloading) || this.c.getUrl() == null) {
                return Unit.a;
            }
            int i2 = fob0.j;
            Context context = this.b.a;
            VersionData versionData = this.c;
            fob0.c cVar = fob0.c.a;
            fob0 fob0Var = new fob0(context, versionData != null ? versionData.getUrl() : null, versionData != null ? versionData.getMd5() : null);
            fob0Var.g = new a(this.b);
            if (StringsKt.U("SportyBet_temp.apk")) {
                file = null;
            } else {
                int i3 = MyFileProvider.v;
                File file2 = new File(hp0.A.getFilesDir(), "download_files");
                file2.mkdirs();
                file = new File(file2, "SportyBet_temp.apk");
            }
            itf0.a aVar = itf0.a;
            aVar.q(MyLog.TAG_DOWNLOAD);
            aVar.a("download " + cVar + " from " + fob0Var.b + " to " + file + ", md5: " + fob0Var.c, new Object[0]);
            if (file == null || (str = fob0Var.b) == null || !URLUtil.isNetworkUrl(str) || (str2 = fob0Var.c) == null || StringsKt.U(str2)) {
                fob0Var.b(fob0.b.d, null);
            } else {
                Call call = fob0Var.d;
                if (call != null) {
                    call.cancel();
                }
                fob0Var.d = null;
                ((q6f) fob0Var.e.getValue()).a.f(fob0Var.a);
                Context context2 = fob0Var.a;
                ((q6f) fob0Var.e.getValue()).a.b(context2, sn5.b(context2, R.string.app_common__notification_progress_bar, ""));
                fob0Var.h = 0;
                fob0Var.i = false;
                a aVar2 = fob0Var.g;
                if (aVar2 != null) {
                    aVar2.a.n.setValue(AppDownloadAction.ApkDownloadStarted.INSTANCE);
                }
                o0b.d(fob0Var.a, fob0Var, new IntentFilter("com.sportybet.android.DOWNLOAD_BTN_CLICKED"));
                Call callNewCall = pn50.a(null, null, null, null, null, null, 895).newCall(new Request.Builder().url(fob0Var.b).build());
                FirebasePerfOkHttpClient.enqueue(callNewCall, new gob0(fob0Var, file));
                fob0Var.d = callNewCall;
            }
            if (!this.c.hasNewVersionRequired(this.b.j.b().a())) {
                du0 du0Var = this.b.f;
                wm20 wm20VarA = du0Var.b.a(du0Var, du0.e[0]);
                Long l = new Long(System.currentTimeMillis());
                this.a = 1;
                if (wm20VarA.g(this, l) == y5bVar) {
                    return y5bVar;
                }
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
