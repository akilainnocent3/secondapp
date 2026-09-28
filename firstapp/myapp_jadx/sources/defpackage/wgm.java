package defpackage;

import android.net.Uri;
import android.os.Bundle;
import com.sportybet.android.router.Sender;
import com.sportybet.tech.uibus.UIRouter;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.text.c;

/* JADX INFO: loaded from: classes6.dex */
public class wgm implements UIRouter {
    public final v7b a;
    public final m730<fbh0> b;
    public final bnh0 c;

    public wgm(v7b v7bVar, m730<fbh0> m730Var, bnh0 bnh0Var) {
        m730Var.getClass();
        bnh0Var.getClass();
        this.a = v7bVar;
        this.b = m730Var;
        this.c = bnh0Var;
    }

    @Override // com.sportybet.tech.uibus.UIRouter
    public boolean isGenericUri() {
        return true;
    }

    @Override // com.sportybet.tech.uibus.UIRouter
    public boolean openUri(Uri uri, String str, String str2, Bundle bundle, Sender sender) {
        uri.getClass();
        str.getClass();
        str2.getClass();
        sender.getClass();
        this.b.get().e(o7d.a(wae.HOME));
        return true;
    }

    @Override // com.sportybet.tech.uibus.UIRouter
    public int priority() {
        return 60;
    }

    @Override // com.sportybet.tech.uibus.UIRouter
    public boolean verifyUri(Uri uri, String str, String str2) {
        List<String> pathSegments;
        String str3;
        uri.getClass();
        str.getClass();
        str2.getClass();
        if (c.u(str, "http", true) && this.c.i(str2) && (pathSegments = uri.getPathSegments()) != null && !pathSegments.isEmpty() && pathSegments.size() <= 2) {
            String str4 = pathSegments.get(0);
            str4.getClass();
            if (this.a.a(str4) && ((str3 = (String) CollectionsKt.V(1, pathSegments)) == null || str3.equals("m"))) {
                return true;
            }
        }
        return false;
    }
}
