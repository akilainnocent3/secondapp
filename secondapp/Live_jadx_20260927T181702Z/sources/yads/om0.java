package yads;

import android.content.Context;
import android.location.Location;
import android.os.Build;
import com.ironsource.Q6;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import java.util.List;
import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class om0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final lw2 f153558a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ox2 f153559b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final jg0 f153560c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final bh1 f153561d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final sd f153562e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final pm0 f153563f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final rd f153564g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final jm0 f153565h;

    public /* synthetic */ om0(Context context, d4 d4Var) {
        lw2 lw2Var = new lw2();
        ox2 ox2Var = new ox2();
        jg0 jg0Var = new jg0();
        Object obj = bh1.f147187f;
        this(d4Var, lw2Var, ox2Var, jg0Var, ah1.a(context), new sd(), new qm0());
    }

    public final void a(Context context, ds.p pVar) {
        Location locationA;
        pVar.invoke("app_id", context.getPackageName());
        pVar.invoke("app_version_code", og.a(context));
        pVar.invoke(CommonUrlParts.APP_VERSION, og.b(context));
        pVar.invoke("vast-integration-type", "inapp_sdk");
        pVar.invoke("sdk_version", this.f153558a.a("%d.%d%d"));
        pVar.invoke("sdk_version_name", this.f153558a.a("%d.%d.%d"));
        pVar.invoke("sdk_vendor", "yandex");
        pVar.invoke(((qm0) this.f153563f).b(), this.f153560c.a(context));
        yg1 yg1Var = this.f153560c.f151094b;
        yg1Var.getClass();
        Locale locale = context.getResources().getConfiguration().locale;
        yg1Var.f158301a.getClass();
        pVar.invoke("locale", wg1.a(locale));
        pVar.invoke("content_language", this.f153560c.f151094b.a(context));
        List listB = this.f153560c.f151094b.b(context);
        pVar.invoke("device_languages", listB != null ? fr.r0.r3(listB, ",", null, null, 0, null, null, 62, null) : null);
        String strC = ((qm0) this.f153563f).c();
        this.f153560c.getClass();
        pVar.invoke(strC, jg0.a());
        String strD = ((qm0) this.f153563f).d();
        this.f153560c.getClass();
        pVar.invoke(strD, Build.MODEL);
        String strE = ((qm0) this.f153563f).e();
        this.f153560c.getClass();
        pVar.invoke(strE, "android");
        String strF = ((qm0) this.f153563f).f();
        this.f153560c.getClass();
        pVar.invoke(strF, Build.VERSION.RELEASE);
        Boolean boolC = yc2.c(context);
        if (boolC != null) {
            pVar.invoke("vpn_enabled", boolC.booleanValue() ? "1" : "0");
        }
        if (!this.f153559b.b(context) && (locationA = this.f153561d.a()) != null) {
            pVar.invoke("location_timestamp", String.valueOf(locationA.getTime()));
            pVar.invoke(Q6.f59905s, String.valueOf(locationA.getLatitude()));
            pVar.invoke("lon", String.valueOf(locationA.getLongitude()));
            pVar.invoke("precision", String.valueOf(Math.round(locationA.getAccuracy())));
        }
        if (!this.f153559b.b(context)) {
            pVar.invoke(((qm0) this.f153563f).a(), this.f153565h.f151153a);
            pVar.invoke(CommonUrlParts.APP_SET_ID, this.f153564g.f154883d);
            td tdVar = this.f153564g.f154880a;
            boolean z10 = false;
            if (tdVar != null) {
                boolean z11 = tdVar.f155824b;
                String str = tdVar.f155823a;
                this.f153562e.getClass();
                boolean z12 = (str == null || str.length() == 0 || kotlin.jvm.internal.m0.g("00000000-0000-0000-0000-000000000000", str)) ? false : true;
                if (!z11 && z12) {
                    pVar.invoke("google_aid", str);
                }
            }
            td tdVar2 = this.f153564g.f154881b;
            if (tdVar2 != null) {
                boolean z13 = tdVar2.f155824b;
                String str2 = tdVar2.f155823a;
                this.f153562e.getClass();
                if (str2 != null && str2.length() != 0 && !kotlin.jvm.internal.m0.g("00000000-0000-0000-0000-000000000000", str2)) {
                    z10 = true;
                }
                if (!z13 && z10) {
                    pVar.invoke("huawei_oaid", str2);
                }
            }
        }
        pVar.invoke(CommonUrlParts.SCREEN_WIDTH, String.valueOf(kl3.d(context)));
        pVar.invoke(CommonUrlParts.SCREEN_HEIGHT, String.valueOf(kl3.b(context)));
        pVar.invoke(CommonUrlParts.SCALE_FACTOR, String.valueOf(context.getResources().getDisplayMetrics().density));
        pVar.invoke(CommonUrlParts.SCREEN_DPI, String.valueOf(kl3.a(context)));
    }

    public om0(d4 d4Var, lw2 lw2Var, ox2 ox2Var, jg0 jg0Var, bh1 bh1Var, sd sdVar, pm0 pm0Var) {
        this.f153558a = lw2Var;
        this.f153559b = ox2Var;
        this.f153560c = jg0Var;
        this.f153561d = bh1Var;
        this.f153562e = sdVar;
        this.f153563f = pm0Var;
        this.f153564g = d4Var.b();
        this.f153565h = d4Var.c();
    }
}
