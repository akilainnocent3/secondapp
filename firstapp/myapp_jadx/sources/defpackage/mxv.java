package defpackage;

import android.net.Uri;
import android.os.Bundle;
import com.sportybet.android.router.Sender;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.c;

/* JADX INFO: loaded from: classes6.dex */
public final class mxv extends wgm {
    public final v7b d;
    public final m730<fbh0> e;
    public final bnh0 f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mxv(v7b v7bVar, skd skdVar, bnh0 bnh0Var) {
        super(v7bVar, skdVar, bnh0Var);
        skdVar.getClass();
        bnh0Var.getClass();
        this.d = v7bVar;
        this.e = skdVar;
        this.f = bnh0Var;
    }

    @Override // defpackage.wgm, com.sportybet.tech.uibus.UIRouter
    public final boolean isGenericUri() {
        return true;
    }

    @Override // defpackage.wgm, com.sportybet.tech.uibus.UIRouter
    public final boolean openUri(Uri uri, String str, String str2, Bundle bundle, Sender sender) {
        uri.getClass();
        str.getClass();
        str2.getClass();
        sender.getClass();
        this.e.get().e(o7d.a(wae.CONTACT_US));
        return true;
    }

    @Override // defpackage.wgm, com.sportybet.tech.uibus.UIRouter
    public final int priority() {
        return 60;
    }

    @Override // defpackage.wgm, com.sportybet.tech.uibus.UIRouter
    public final boolean verifyUri(Uri uri, String str, String str2) {
        uri.getClass();
        str.getClass();
        str2.getClass();
        if (c.u(str, "http", true) && this.f.i(str2)) {
            List<String> pathSegments = uri.getPathSegments();
            if (pathSegments.size() == 3) {
                String str3 = pathSegments.get(0);
                String str4 = pathSegments.get(1);
                String str5 = pathSegments.get(2);
                str3.getClass();
                if (this.d.a(str3) && Intrinsics.g(str4, "m") && Intrinsics.g(str5, "support")) {
                    return true;
                }
            }
        }
        return false;
    }
}
