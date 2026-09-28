package defpackage;

import com.sportygames.commons.SportyGamesManager;
import com.sportygames.crazyrider.remote.api.CrazyRiderInterface;
import com.sportygames.galaxygo.remote.api.GalaxyGoInterface;
import com.sportygames.multilevel.sportycar.remote.api.SportyCarInterface;
import com.sportygames.sportyherocompose.remote.api.SportyHeroInterface;
import com.sportygames.sportyjet.remote.api.SportyJetInterface;
import com.sportygames.sportykick.remote.api.SportyKickInterface;
import com.sportygames.sportyskills.remote.api.SportySkillsInterface;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;
import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;

/* JADX INFO: loaded from: classes7.dex */
public final class on0 {
    public static final mpe0 a;
    public static final mpe0 b;
    public static final mpe0 c;
    public static final mpe0 g;
    public static final mpe0 j;
    public static final mpe0 m;
    public static final mpe0 n;
    public static final mpe0 o;
    public static final mpe0 p;
    public static final mpe0 q;
    public static final mpe0 r;
    public static final mpe0 s;
    public static final mpe0 t;
    public static final mpe0 u;
    public static final mpe0 v;
    public static final mpe0 w;
    public static final mpe0 x;
    public static final mpe0 d = hwr.b(new ym0());
    public static final mpe0 e = hwr.b(new zm0());
    public static final mpe0 f = hwr.b(new bn0());
    public static final mpe0 h = hwr.b(new dn0());
    public static final mpe0 i = hwr.b(new en0());
    public static final mpe0 k = hwr.b(new an0());
    public static final mpe0 l = hwr.b(new gn0());

    static {
        int i2 = 0;
        a = hwr.b(new pm0(i2));
        b = hwr.b(new rm0(i2));
        c = hwr.b(new xm0(i2));
        g = hwr.b(new cn0(i2));
        j = hwr.b(new fn0(i2));
        hwr.b(new hn0());
        m = hwr.b(new in0());
        n = hwr.b(new jn0());
        o = hwr.b(new kn0());
        p = hwr.b(new ln0(i2));
        q = hwr.b(new mn0(i2));
        r = hwr.b(new nn0());
        s = hwr.b(new qm0());
        t = hwr.b(new sm0());
        u = hwr.b(new tm0(i2));
        v = hwr.b(new um0());
        w = hwr.b(new vm0());
        x = hwr.b(new wm0(i2));
    }

    public static on50 a() {
        t();
        return s(j(), false);
    }

    public static on50 b() {
        t();
        OkHttpClient.Builder builder = new OkHttpClient.Builder();
        builder.addInterceptor(new xhl());
        builder.addInterceptor(new mzf0());
        TimeUnit timeUnit = TimeUnit.SECONDS;
        OkHttpClient okHttpClientBuild = builder.connectTimeout(30L, timeUnit).readTimeout(30L, timeUnit).retryOnConnectionFailure(false).build();
        on50.b bVar = new on50.b();
        bVar.a(SportyGamesManager.getInstance().getBasePrefixUrl());
        bVar.c(okHttpClientBuild);
        fal falVarC = fal.c();
        ArrayList arrayList = bVar.c;
        arrayList.add(falVarC);
        arrayList.add(i5w.c());
        arrayList.add(new uy60());
        return bVar.b();
    }

    public static p c() {
        Object value = v.getValue();
        value.getClass();
        return (p) value;
    }

    public static ka7 d() {
        Object value = k.getValue();
        value.getClass();
        return (ka7) value;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static dpb e() {
        String gameName = SportyGamesManager.getGameName();
        if (gameName != null) {
            switch (gameName.hashCode()) {
                case -1901779396:
                    if (gameName.equals("sporty_skills")) {
                        Object objA = a().a(SportySkillsInterface.class);
                        objA.getClass();
                        return (dpb) objA;
                    }
                    break;
                case -1245115060:
                    if (gameName.equals("crazy_rider")) {
                        Object objA2 = a().a(CrazyRiderInterface.class);
                        objA2.getClass();
                        return (dpb) objA2;
                    }
                    break;
                case 105113:
                    if (gameName.equals("jet")) {
                        Object objA3 = a().a(SportyJetInterface.class);
                        objA3.getClass();
                        return (dpb) objA3;
                    }
                    break;
                case 22361207:
                    if (gameName.equals("galaxy_go")) {
                        Object objA4 = a().a(GalaxyGoInterface.class);
                        objA4.getClass();
                        return (dpb) objA4;
                    }
                    break;
                case 453400473:
                    if (gameName.equals("sporty_cars")) {
                        Object objA5 = a().a(SportyCarInterface.class);
                        objA5.getClass();
                        return (dpb) objA5;
                    }
                    break;
                case 453553268:
                    if (gameName.equals("sporty_hero")) {
                        Object objA6 = a().a(SportyHeroInterface.class);
                        objA6.getClass();
                        return (dpb) objA6;
                    }
                    break;
                case 453646016:
                    if (gameName.equals("sporty_kick")) {
                        Object objA7 = a().a(SportyKickInterface.class);
                        objA7.getClass();
                        return (dpb) objA7;
                    }
                    break;
            }
        }
        Object objA8 = a().a(dpb.class);
        objA8.getClass();
        return (dpb) objA8;
    }

    public static wgg f() {
        Object value = e.getValue();
        value.getClass();
        return (wgg) value;
    }

    public static i5h g() {
        Object value = q.getValue();
        value.getClass();
        return (i5h) value;
    }

    public static cxi0 h() {
        Object value = a.getValue();
        value.getClass();
        return (cxi0) value;
    }

    public static g2t i() {
        Object value = b.getValue();
        value.getClass();
        return (g2t) value;
    }

    public static OkHttpClient j() {
        OkHttpClient.Builder builder = new OkHttpClient.Builder();
        builder.addInterceptor(new yhl());
        builder.addInterceptor(new mzf0());
        TimeUnit timeUnit = TimeUnit.SECONDS;
        return builder.connectTimeout(30L, timeUnit).readTimeout(30L, timeUnit).retryOnConnectionFailure(false).build();
    }

    public static q510 k() {
        Object value = w.getValue();
        value.getClass();
        return (q510) value;
    }

    public static zn40 l() {
        Object value = d.getValue();
        value.getClass();
        return (zn40) value;
    }

    public static au50 m() {
        Object value = u.getValue();
        value.getClass();
        return (au50) value;
    }

    public static j660 n() {
        Object value = m.getValue();
        value.getClass();
        return (j660) value;
    }

    public static s1b0 o() {
        Object value = n.getValue();
        value.getClass();
        return (s1b0) value;
    }

    public static abb0 p() {
        Object value = o.getValue();
        value.getClass();
        return (abb0) value;
    }

    public static s5b0 q() {
        Object value = f.getValue();
        value.getClass();
        return (s5b0) value;
    }

    public static x3c0 r() {
        Object value = g.getValue();
        value.getClass();
        return (x3c0) value;
    }

    public static on50 s(OkHttpClient okHttpClient, boolean z) {
        String baseUrl;
        if (z) {
            String baseUrl2 = SportyGamesManager.getInstance().getBaseUrl();
            baseUrl2.getClass();
            baseUrl = wue.e(baseUrl2, "/games");
        } else {
            baseUrl = SportyGamesManager.getInstance().getBaseUrl();
            baseUrl.getClass();
        }
        on50.b bVar = new on50.b();
        bVar.a(baseUrl);
        bVar.c(okHttpClient);
        fal falVarC = fal.c();
        ArrayList arrayList = bVar.c;
        arrayList.add(falVarC);
        arrayList.add(i5w.c());
        arrayList.add(new uy60());
        return bVar.b();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static HttpLoggingInterceptor t() {
        HttpLoggingInterceptor httpLoggingInterceptor = new HttpLoggingInterceptor(null, 1, 0 == true ? 1 : 0);
        httpLoggingInterceptor.level(HttpLoggingInterceptor.Level.BODY);
        return httpLoggingInterceptor;
    }
}
