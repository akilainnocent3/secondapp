package com.ironsource;

import android.util.Log;
import android.util.Pair;
import java.security.InvalidParameterException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
public class O5 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final String f59681e = "EventsTracker";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private InterfaceC4472q7 f59682a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private I5 f59683b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private J7 f59684c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private ExecutorService f59685d;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f59686a;

        public a(String str) {
            this.f59686a = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                Gd gd2 = new Gd();
                ArrayList<Pair<String, String>> arrayListD = O5.this.f59683b.d();
                if ("POST".equals(O5.this.f59683b.e())) {
                    gd2 = C4293g8.b(O5.this.f59683b.b(), this.f59686a, arrayListD);
                } else if ("GET".equals(O5.this.f59683b.e())) {
                    gd2 = C4293g8.a(O5.this.f59683b.b(), this.f59686a, arrayListD);
                }
                O5.this.a("response status code: " + gd2.f59114a);
            } catch (Exception e10) {
                C4485r4.d().a(e10);
            }
        }
    }

    public O5(I5 i10, InterfaceC4472q7 interfaceC4472q7) {
        if (i10 == null) {
            throw new InvalidParameterException("Null configuration not supported ");
        }
        if (i10.c() == null) {
            throw new InvalidParameterException("Null formatter not supported ");
        }
        this.f59683b = i10;
        this.f59682a = interfaceC4472q7;
        this.f59684c = i10.c();
        this.f59685d = Executors.newSingleThreadExecutor();
    }

    private void b(String str) {
        this.f59685d.submit(new a(str));
    }

    public void a(String str, Map<String, Object> map) {
        a(String.format(Locale.ENGLISH, "%s %s", str, map.toString()));
        if (this.f59683b.a() && !str.isEmpty()) {
            HashMap map2 = new HashMap();
            map2.put("eventname", str);
            a(map2, this.f59682a.a());
            a(map2, map);
            b(this.f59684c.a(map2));
        }
    }

    private void a(Map<String, Object> map, Map<String, Object> map2) {
        try {
            map.putAll(map2);
        } catch (Exception e10) {
            C4485r4.d().a(e10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(String str) {
        if (this.f59683b.f()) {
            Log.d(f59681e, str);
        }
    }
}
