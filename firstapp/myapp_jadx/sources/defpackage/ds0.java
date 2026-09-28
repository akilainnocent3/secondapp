package defpackage;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import com.sporty.android.core.model.MyLog;
import com.sportybet.android.router.Sender;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.text.c;

/* JADX INFO: loaded from: classes6.dex */
public final class ds0 extends h8d {
    public final v7b u;
    public final bnh0 v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ds0(yi5 yi5Var, v7b v7bVar, m0d m0dVar, cbg cbgVar, lch lchVar, uqm uqmVar, nsm nsmVar, psm psmVar, d0n d0nVar, str strVar, u2u u2uVar, avz avzVar, xxz xxzVar, j800 j800Var, bnh0 bnh0Var, a3k0 a3k0Var, Context context) {
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

    /* JADX WARN: Code duplicated, block: B:18:0x005b  */
    public final Uri h(Uri uri, String str, String str2) {
        wae waeVarA;
        List<String> pathSegments = uri.getPathSegments();
        pathSegments.getClass();
        if (pathSegments.size() == 3) {
            if (this.u.a(pathSegments.get(0)) && "applink".equalsIgnoreCase(pathSegments.get(1))) {
                wae.a aVar = wae.b;
                String str3 = pathSegments.get(2);
                str3.getClass();
                String strSubstring = str3;
                int length = strSubstring.length();
                int i = 0;
                while (true) {
                    if (i >= length) {
                        i = -1;
                        break;
                    }
                    if (strSubstring.charAt(i) == '?') {
                        break;
                    }
                    i++;
                }
                if (i > 0) {
                    strSubstring = strSubstring.substring(0, i);
                }
                aVar.getClass();
                waeVarA = wae.a.a(strSubstring);
            } else {
                waeVarA = null;
            }
        } else {
            waeVarA = null;
        }
        if ((!c.l(str, "http", true) && !c.l(str, "https", true)) || !this.v.i(str2) || waeVarA == null) {
            return null;
        }
        Set<String> queryParameterNames = uri.getQueryParameterNames();
        queryParameterNames.getClass();
        ArrayList arrayListR = CollectionsKt.R(queryParameterNames);
        ArrayList arrayList = new ArrayList(l48.r(arrayListR, 10));
        int size = arrayListR.size();
        int i2 = 0;
        while (i2 < size) {
            Object obj = arrayListR.get(i2);
            i2++;
            String str4 = (String) obj;
            String queryParameter = uri.getQueryParameter(str4);
            if (queryParameter == null) {
                queryParameter = "";
            }
            arrayList.add(new Pair(str4, queryParameter));
        }
        Uri uriB = o7d.b(waeVarA, (Pair[]) arrayList.toArray(new Pair[0]));
        itf0.a aVar2 = itf0.a;
        aVar2.q(MyLog.TAG_UI_ROUTER);
        aVar2.a("convert " + uri + " to " + uriB, new Object[0]);
        return uriB;
    }

    @Override // defpackage.h8d, com.sportybet.tech.uibus.UIRouter
    public final boolean openUri(Uri uri, String str, String str2, Bundle bundle, Sender sender) {
        uri.getClass();
        str.getClass();
        str2.getClass();
        sender.getClass();
        Uri uriH = h(uri, str, str2);
        if (uriH == null) {
            return false;
        }
        String scheme = uriH.getScheme();
        if (scheme == null) {
            scheme = "";
        }
        String host = uriH.getHost();
        return super.openUri(uriH, scheme, host != null ? host : "", bundle, sender);
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
        Uri uriH = h(uri, str, str2);
        if (uriH == null) {
            return false;
        }
        String scheme = uriH.getScheme();
        if (scheme == null) {
            scheme = "";
        }
        String host = uriH.getHost();
        return super.verifyUri(uriH, scheme, host != null ? host : "");
    }
}
