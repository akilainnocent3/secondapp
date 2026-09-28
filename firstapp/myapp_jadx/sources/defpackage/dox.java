package defpackage;

import com.google.firebase.perf.session.PerfSession;
import com.google.firebase.perf.session.SessionManager;
import com.google.firebase.perf.session.gauges.GaugeManager;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.regex.Pattern;
import okhttp3.HttpUrl;

/* JADX INFO: loaded from: classes4.dex */
public final class dox extends ut0 implements hf80 {
    public static final p80 v = p80.d();
    public final List<PerfSession> a;
    public final GaugeManager b;
    public final avg0 c;
    public final cox.b d;
    public final WeakReference<hf80> e;
    public String f;
    public boolean i;

    /* JADX WARN: Illegal instructions before constructor call */
    public dox(avg0 avg0Var) {
        tt0 tt0VarA = tt0.a();
        GaugeManager gaugeManager = GaugeManager.getInstance();
        super(tt0VarA);
        this.d = cox.C();
        this.e = new WeakReference<>(this);
        this.c = avg0Var;
        this.b = gaugeManager;
        this.a = Collections.synchronizedList(new ArrayList());
        registerForAppState();
    }

    @Override // defpackage.hf80
    public final void a(PerfSession perfSession) {
        if (perfSession == null) {
            v.f("Unable to add new SessionId to the Network Trace. Continuing without it.");
            return;
        }
        cox.b bVar = this.d;
        if (!bVar.j() || bVar.l()) {
            return;
        }
        this.a.add(perfSession);
    }

    public final void e() {
        List listUnmodifiableList;
        SessionManager.getInstance().unregisterForSessionUpdates(this.e);
        unregisterForAppState();
        synchronized (this.a) {
            try {
                ArrayList arrayList = new ArrayList();
                for (PerfSession perfSession : this.a) {
                    if (perfSession != null) {
                        arrayList.add(perfSession);
                    }
                }
                listUnmodifiableList = Collections.unmodifiableList(arrayList);
            } catch (Throwable th) {
                throw th;
            }
        }
        qd00[] qd00VarArrE = PerfSession.e(listUnmodifiableList);
        if (qd00VarArrE != null) {
            this.d.g(Arrays.asList(qd00VarArrE));
        }
        final cox coxVarBuild = this.d.build();
        String str = this.f;
        if (str == null) {
            Pattern pattern = eox.a;
        } else if (eox.a.matcher(str).matches()) {
            v.a("Dropping network request from a 'User-Agent' that is not allowed");
            return;
        }
        if (this.i) {
            return;
        }
        final avg0 avg0Var = this.c;
        final zu0 appState = getAppState();
        avg0Var.w.execute(new Runnable() { // from class: wug0
            @Override // java.lang.Runnable
            public final void run() {
                avg0 avg0Var2 = avg0Var;
                avg0Var2.getClass();
                nd00.b bVarJ = nd00.j();
                bVarJ.i(coxVarBuild);
                avg0Var2.d(bVarJ, appState);
            }
        });
        this.i = true;
    }

    public final void g(String str) {
        cox.d dVar;
        if (str != null) {
            String upperCase = str.toUpperCase();
            upperCase.getClass();
            switch (upperCase) {
                case "OPTIONS":
                    dVar = cox.d.OPTIONS;
                    break;
                case "GET":
                    dVar = cox.d.GET;
                    break;
                case "PUT":
                    dVar = cox.d.PUT;
                    break;
                case "HEAD":
                    dVar = cox.d.HEAD;
                    break;
                case "POST":
                    dVar = cox.d.POST;
                    break;
                case "PATCH":
                    dVar = cox.d.PATCH;
                    break;
                case "TRACE":
                    dVar = cox.d.TRACE;
                    break;
                case "CONNECT":
                    dVar = cox.d.CONNECT;
                    break;
                case "DELETE":
                    dVar = cox.d.DELETE;
                    break;
                default:
                    dVar = cox.d.HTTP_METHOD_UNKNOWN;
                    break;
            }
            this.d.n(dVar);
        }
    }

    public final void h(int i) {
        this.d.o(i);
    }

    public final void i(long j) {
        this.d.q(j);
    }

    public final void j(long j) {
        PerfSession perfSession = SessionManager.getInstance().perfSession();
        SessionManager.getInstance().registerForSessionUpdates(this.e);
        this.d.m(j);
        a(perfSession);
        if (perfSession.c) {
            this.b.collectGaugeMetricOnce(perfSession.b);
        }
    }

    public final void k(String str) {
        cox.b bVar = this.d;
        if (str == null) {
            bVar.h();
            return;
        }
        if (str.length() <= 128) {
            for (int i = 0; i < str.length(); i++) {
                char cCharAt = str.charAt(i);
                if (cCharAt > 31 && cCharAt <= 127) {
                }
            }
            bVar.r(str);
            return;
        }
        v.f("The content type of the response is not a valid content-type:".concat(str));
    }

    public final void n(long j) {
        this.d.s(j);
    }

    public final void p(long j) {
        this.d.u(j);
        if (SessionManager.getInstance().perfSession().c) {
            this.b.collectGaugeMetricOnce(SessionManager.getInstance().perfSession().b);
        }
    }

    public final void q(String str) {
        HttpUrl httpUrl;
        int iLastIndexOf;
        if (str != null) {
            HttpUrl httpUrl2 = HttpUrl.parse(str);
            if (httpUrl2 != null) {
                str = httpUrl2.newBuilder().username("").password("").query(null).fragment(null).toString();
            }
            if (str.length() > 2000) {
                str = (str.charAt(2000) != '/' && (httpUrl = HttpUrl.parse(str)) != null && httpUrl.encodedPath().lastIndexOf(47) >= 0 && (iLastIndexOf = str.lastIndexOf(47, 1999)) >= 0) ? str.substring(0, iLastIndexOf) : str.substring(0, 2000);
            }
            this.d.w(str);
        }
    }
}
