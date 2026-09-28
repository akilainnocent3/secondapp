package defpackage;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import com.sportybet.android.router.Sender;
import com.sportybet.android.social.presentation.SocialActivity;
import com.sportybet.tech.uibus.UIRouter;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.c;

/* JADX INFO: loaded from: classes6.dex */
public final class kaa0 implements UIRouter {
    public final Context a;
    public final bnh0 b;

    public kaa0(Context context, bnh0 bnh0Var) {
        bnh0Var.getClass();
        this.a = context;
        this.b = bnh0Var;
    }

    public static boolean a(Uri uri) {
        int size;
        uri.getClass();
        List<String> pathSegments = uri.getPathSegments();
        if (pathSegments != null && !pathSegments.isEmpty() && 2 <= (size = pathSegments.size()) && size < 5 && pathSegments.size() != 3) {
            String str = pathSegments.get(0);
            wae.a aVar = wae.b;
            if (Intrinsics.g(str, "player")) {
                String str2 = pathSegments.get(1);
                str2.getClass();
                if (str2.length() != 0) {
                    if (pathSegments.size() == 4) {
                        if (Intrinsics.g(pathSegments.get(2), "bookingcode")) {
                            String str3 = pathSegments.get(3);
                            str3.getClass();
                            if (str3.length() == 0) {
                            }
                        }
                    }
                    return true;
                }
            }
        }
        return false;
    }

    @Override // com.sportybet.tech.uibus.UIRouter
    public final boolean isGenericUri() {
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.sportybet.tech.uibus.UIRouter
    public final boolean openUri(Uri uri, String str, String str2, Bundle bundle, Sender sender) {
        Object bVar;
        Pair pair;
        Object bVar2;
        uri.getClass();
        str.getClass();
        str2.getClass();
        sender.getClass();
        if (a(uri)) {
            List<String> pathSegments = uri.getPathSegments();
            try {
                zi50.a aVar = zi50.b;
                bVar = new Pair(pathSegments.get(1), pathSegments.size() > 3 ? pathSegments.get(3) : "");
            } catch (Throwable th) {
                zi50.a aVar2 = zi50.b;
                bVar = new zi50.b(th);
            }
            if (zi50.a(bVar) != null) {
                bVar = new Pair("", "");
            }
            pair = (Pair) bVar;
        } else {
            pair = new Pair("", "");
        }
        String str3 = (String) pair.a;
        String str4 = (String) pair.b;
        if (str3.length() == 0) {
            return false;
        }
        int i = SocialActivity.b;
        boolean z = str4.length() > 0;
        Context context = this.a;
        Intent intentA = SocialActivity.a.a(context, str3, false, str4, false, z, null);
        try {
            zi50.a aVar3 = zi50.b;
            yrh0.s(context, intentA, true);
            bVar2 = Boolean.TRUE;
        } catch (Throwable th2) {
            zi50.a aVar4 = zi50.b;
            bVar2 = new zi50.b(th2);
        }
        if (zi50.a(bVar2) != null) {
            bVar2 = Boolean.FALSE;
        }
        return ((Boolean) bVar2).booleanValue();
    }

    @Override // com.sportybet.tech.uibus.UIRouter
    public final int priority() {
        return 30;
    }

    @Override // com.sportybet.tech.uibus.UIRouter
    public final boolean verifyUri(Uri uri, String str, String str2) {
        uri.getClass();
        str.getClass();
        str2.getClass();
        if (c.u(str, "http", true) && this.b.i(str2)) {
            return a(uri);
        }
        return false;
    }
}
