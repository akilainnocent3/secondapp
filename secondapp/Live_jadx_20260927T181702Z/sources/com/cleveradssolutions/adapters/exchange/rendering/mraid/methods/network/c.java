package com.cleveradssolutions.adapters.exchange.rendering.mraid.methods.network;

import android.text.TextUtils;
import com.cleveradssolutions.adapters.exchange.rendering.utils.helpers.j;
import java.net.URLConnection;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public class c extends com.cleveradssolutions.adapters.exchange.rendering.networking.c {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public String f42348f;

    public c(com.cleveradssolutions.adapters.exchange.rendering.networking.b bVar) {
        super(bVar);
        this.f42401a = new com.cleveradssolutions.adapters.exchange.rendering.networking.c.a();
    }

    public static boolean p(int i10) {
        return Arrays.binarySearch(new int[]{301, 302, 303, 307, 308}, i10) >= 0;
    }

    @Override // com.cleveradssolutions.adapters.exchange.rendering.networking.c
    public com.cleveradssolutions.adapters.exchange.rendering.networking.c.a g(int i10, URLConnection uRLConnection) {
        String[] strArr = new String[3];
        if (p(i10)) {
            String headerField = uRLConnection.getHeaderField("Location");
            if (headerField == null) {
                headerField = uRLConnection.getRequestProperty("Location");
            }
            if (TextUtils.isEmpty(headerField)) {
                headerField = this.f42348f;
            }
            strArr[0] = headerField;
        } else {
            strArr[0] = this.f42348f;
            strArr[2] = "quit";
        }
        String headerField2 = uRLConnection.getHeaderField("Content-Type");
        strArr[1] = headerField2;
        if (headerField2 == null) {
            strArr[1] = uRLConnection.getRequestProperty("Content-Type");
        }
        com.cleveradssolutions.adapters.exchange.rendering.networking.c.a aVar = this.f42401a;
        aVar.f42410g = strArr;
        return aVar;
    }

    @Override // com.cleveradssolutions.adapters.exchange.rendering.networking.c, android.os.AsyncTask
    /* JADX INFO: renamed from: i */
    public com.cleveradssolutions.adapters.exchange.rendering.networking.c.a doInBackground(com.cleveradssolutions.adapters.exchange.rendering.networking.c.b... bVarArr) {
        return r(bVarArr);
    }

    public final String[] q(com.cleveradssolutions.adapters.exchange.rendering.networking.c.b bVar) {
        String str = bVar.f42411a;
        this.f42348f = str;
        if (j.k(str) || TextUtils.isEmpty(bVar.f42411a)) {
            return new String[]{bVar.f42411a, null, null};
        }
        com.cleveradssolutions.adapters.exchange.rendering.networking.c.a aVarDoInBackground = super.doInBackground(bVar);
        this.f42401a = aVarDoInBackground;
        return aVarDoInBackground.f42410g;
    }

    public final com.cleveradssolutions.adapters.exchange.rendering.networking.c.a r(com.cleveradssolutions.adapters.exchange.rendering.networking.c.b... bVarArr) {
        if (isCancelled() || !e(bVarArr)) {
            return this.f42401a;
        }
        com.cleveradssolutions.adapters.exchange.rendering.networking.c.b bVar = bVarArr[0];
        this.f42401a.f42408e = bVar != null ? bVar.f42411a : null;
        s(bVar);
        return this.f42401a;
    }

    public final void s(com.cleveradssolutions.adapters.exchange.rendering.networking.c.b bVar) {
        String[] strArrQ;
        for (int i10 = 0; i10 < 3 && (strArrQ = q(bVar)) != null; i10++) {
            if (TextUtils.isEmpty(strArrQ[0])) {
                if (TextUtils.isEmpty(this.f42401a.f42409f)) {
                    this.f42401a.f42409f = strArrQ[1];
                    return;
                }
                return;
            } else {
                com.cleveradssolutions.adapters.exchange.rendering.networking.c.a aVar = this.f42401a;
                aVar.f42408e = strArrQ[0];
                aVar.f42409f = strArrQ[1];
                if (strArrQ[2] == "quit") {
                    return;
                }
            }
        }
    }
}
