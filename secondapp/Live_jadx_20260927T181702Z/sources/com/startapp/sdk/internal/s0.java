package com.startapp.sdk.internal;

import android.content.Context;
import android.net.Uri;
import com.startapp.sdk.adsbase.apppresence.AppPresenceDetails;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
public final class s0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f75481a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f75482b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final r0 f75483c = new r0(this);

    public s0(Context context, ArrayList arrayList) {
        this.f75482b = arrayList;
        this.f75481a = context;
    }

    public static ArrayList a(ArrayList arrayList) {
        String strC;
        String queryParameter;
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            AppPresenceDetails appPresenceDetails = (AppPresenceDetails) it.next();
            if (!appPresenceDetails.e() && (strC = appPresenceDetails.c()) != null) {
                try {
                    queryParameter = Uri.parse(strC).getQueryParameter("d");
                } catch (Throwable th2) {
                    d9.a(th2);
                    queryParameter = null;
                }
                if (queryParameter != null) {
                    if (appPresenceDetails.d()) {
                        arrayList3.add("d=".concat(queryParameter));
                    } else {
                        arrayList4.add("d=".concat(queryParameter));
                    }
                }
            }
        }
        if (!arrayList3.isEmpty()) {
            arrayList2.addAll(g0.a(arrayList3, "true"));
        }
        if (!arrayList4.isEmpty()) {
            arrayList2.addAll(g0.a(arrayList4, "false"));
        }
        return arrayList2;
    }
}
