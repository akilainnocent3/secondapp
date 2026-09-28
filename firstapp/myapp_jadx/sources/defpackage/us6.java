package defpackage;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import com.sporty.android.core.model.MyLog;
import com.sportybet.android.router.Sender;
import java.util.List;
import kotlin.Pair;
import kotlin.text.c;

/* JADX INFO: loaded from: classes6.dex */
public final class us6 extends h8d {
    public final v7b u;
    public final bnh0 v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public us6(yi5 yi5Var, v7b v7bVar, m0d m0dVar, cbg cbgVar, lch lchVar, uqm uqmVar, nsm nsmVar, psm psmVar, d0n d0nVar, str strVar, u2u u2uVar, avz avzVar, xxz xxzVar, j800 j800Var, bnh0 bnh0Var, a3k0 a3k0Var, Context context) {
        super(context, psmVar, d0nVar, u2uVar, uqmVar, m0dVar, j800Var, strVar, yi5Var, xxzVar, bnh0Var, lchVar, cbgVar, nsmVar, a3k0Var, avzVar);
        psmVar.getClass();
        d0nVar.getClass();
        uqmVar.getClass();
        m0dVar.getClass();
        strVar.getClass();
        yi5Var.getClass();
        xxzVar.getClass();
        bnh0Var.getClass();
        cbgVar.getClass();
        nsmVar.getClass();
        a3k0Var.getClass();
        this.u = v7bVar;
        this.v = bnh0Var;
    }

    @Override // defpackage.h8d, com.sportybet.tech.uibus.UIRouter
    public final boolean openUri(Uri uri, String str, String str2, Bundle bundle, Sender sender) {
        Uri uriB;
        uri.getClass();
        str.getClass();
        str2.getClass();
        sender.getClass();
        List<String> pathSegments = uri.getPathSegments();
        if ((str.equalsIgnoreCase("http") || str.equalsIgnoreCase("https")) && this.v.i(str2)) {
            wae waeVar = wae.GAMES_LOBBY;
            pathSegments.getClass();
            uriB = o7d.b(waeVar, pathSegments.size() >= 4 ? new Pair[]{new Pair("game", pathSegments.get(3))} : new Pair[0]);
            itf0.a aVar = itf0.a;
            aVar.q(MyLog.TAG_UI_ROUTER);
            aVar.a("convert " + uri + " to " + uriB, new Object[0]);
        } else {
            uriB = null;
        }
        Uri uri2 = uriB;
        if (uri2 == null) {
            return false;
        }
        String scheme = uri2.getScheme();
        String str3 = scheme == null ? "" : scheme;
        String host = uri2.getHost();
        return super.openUri(uri2, str3, host == null ? "" : host, bundle, sender);
    }

    @Override // defpackage.h8d, com.sportybet.tech.uibus.UIRouter
    public final int priority() {
        return 10;
    }

    @Override // defpackage.h8d, com.sportybet.tech.uibus.UIRouter
    public final boolean verifyUri(Uri uri, String str, String str2) {
        uri.getClass();
        str.getClass();
        str2.getClass();
        if (c.u(str, "http", true) && !this.v.i(str2)) {
            List<String> pathSegments = uri.getPathSegments();
            if (pathSegments.size() == 4) {
                String str3 = pathSegments.get(0);
                str3.getClass();
                if (this.u.a(str3) && "games".equalsIgnoreCase(pathSegments.get(2))) {
                    return true;
                }
            }
        }
        return false;
    }
}
