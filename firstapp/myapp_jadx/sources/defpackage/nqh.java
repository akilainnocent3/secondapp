package defpackage;

import android.content.Context;
import android.content.res.Resources;
import java.net.URI;

/* JADX INFO: loaded from: classes4.dex */
public final class nqh extends pd00 {
    public static final p80 d = p80.d();
    public final cox b;
    public final Context c;

    public nqh(cox coxVar, Context context) {
        this.c = context;
        this.b = coxVar;
    }

    @Override // defpackage.pd00
    public final boolean a() {
        URI uriCreate;
        cox coxVar = this.b;
        String strT = coxVar.t();
        boolean zIsEmpty = strT == null ? true : strT.trim().isEmpty();
        p80 p80Var = d;
        if (zIsEmpty) {
            p80Var.f("URL is missing:" + coxVar.t());
            return false;
        }
        String strT2 = coxVar.t();
        if (strT2 == null) {
            uriCreate = null;
        } else {
            try {
                uriCreate = URI.create(strT2);
            } catch (IllegalArgumentException | IllegalStateException e) {
                p80Var.g("getResultUrl throws exception %s", e.getMessage());
                uriCreate = null;
            }
        }
        if (uriCreate == null) {
            p80Var.f("URL cannot be parsed");
            return false;
        }
        Context context = this.c;
        Resources resources = context.getResources();
        int identifier = resources.getIdentifier("firebase_performance_whitelisted_domains", "array", context.getPackageName());
        if (identifier != 0) {
            p80.d().a("Detected domain allowlist, only allowlisted domains will be measured.");
            if (ze9.c == null) {
                ze9.c = resources.getStringArray(identifier);
            }
            String host = uriCreate.getHost();
            if (host != null) {
                String[] strArr = ze9.c;
                int length = strArr.length;
                int i = 0;
                while (true) {
                    if (i >= length) {
                        p80Var.f("URL fails allowlist rule: " + uriCreate);
                        return false;
                    }
                    if (host.contains(strArr[i])) {
                        break;
                    }
                    i++;
                }
            }
        }
        String host2 = uriCreate.getHost();
        if (host2 == null || host2.trim().isEmpty() || host2.length() > 255) {
            p80Var.f("URL host is null or invalid");
            return false;
        }
        String scheme = uriCreate.getScheme();
        if (scheme == null || (!"http".equalsIgnoreCase(scheme) && !"https".equalsIgnoreCase(scheme))) {
            p80Var.f("URL scheme is null or invalid");
            return false;
        }
        if (uriCreate.getUserInfo() != null) {
            p80Var.f("URL user info is null");
            return false;
        }
        int port = uriCreate.getPort();
        if (port != -1 && port <= 0) {
            p80Var.f("URL port is less than or equal to 0");
            return false;
        }
        cox.d dVarL = coxVar.v() ? coxVar.l() : null;
        if (dVarL == null || dVarL == cox.d.HTTP_METHOD_UNKNOWN) {
            p80Var.f("HTTP Method is null or invalid: " + coxVar.l());
            return false;
        }
        if (coxVar.w() && coxVar.m() <= 0) {
            p80Var.f("HTTP ResponseCode is a negative value:" + coxVar.m());
            return false;
        }
        if (coxVar.x() && coxVar.o() < 0) {
            p80Var.f("Request Payload is a negative value:" + coxVar.o());
            return false;
        }
        if (coxVar.y() && coxVar.p() < 0) {
            p80Var.f("Response Payload is a negative value:" + coxVar.p());
            return false;
        }
        if (!coxVar.u() || coxVar.j() <= 0) {
            p80Var.f("Start time of the request is null, or zero, or a negative value:" + coxVar.j());
            return false;
        }
        if (coxVar.z() && coxVar.q() < 0) {
            p80Var.f("Time to complete the request is a negative value:" + coxVar.q());
            return false;
        }
        if (coxVar.B() && coxVar.s() < 0) {
            p80Var.f("Time from the start of the request to the start of the response is null or a negative value:" + coxVar.s());
            return false;
        }
        if (!coxVar.A() || coxVar.r() <= 0) {
            p80Var.f("Time from the start of the request to the end of the response is null, negative or zero:" + coxVar.r());
            return false;
        }
        if (coxVar.w()) {
            return true;
        }
        p80Var.f("Did not receive a HTTP Response Code");
        return false;
    }
}
