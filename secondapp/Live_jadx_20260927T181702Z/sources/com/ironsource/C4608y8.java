package com.ironsource;

import android.content.Context;
import android.text.TextUtils;
import com.ironsource.sdk.utils.SDKUtils;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: com.ironsource.y8, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
public class C4608y8 implements InterfaceC4472q7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static Map<String, Object> f64485a = new HashMap();

    /* JADX INFO: renamed from: com.ironsource.y8$a */
    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        String f64486a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        String f64487b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        String f64488c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Context f64489d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        String f64490e;

        public a a(String str) {
            this.f64487b = str;
            return this;
        }

        public a b(String str) {
            this.f64488c = str;
            return this;
        }

        public a c(String str) {
            this.f64486a = str;
            return this;
        }

        public a d(String str) {
            this.f64490e = str;
            return this;
        }

        public a a(Context context) {
            this.f64489d = context;
            return this;
        }

        public C4608y8 a() {
            return new C4608y8(this);
        }
    }

    private void a(Context context) {
        f64485a.put(G5.f59033e, C4181a4.b(context));
        f64485a.put(G5.f59034f, C4181a4.d(context));
    }

    public static void b(String str) {
        f64485a.put(G5.f59034f, SDKUtils.encodeString(str));
    }

    private C4608y8(a aVar) {
        a(aVar);
        a(aVar.f64489d);
    }

    private void a(a aVar) {
        Context context = aVar.f64489d;
        C4218c5 c4218c5B = C4218c5.b(context);
        f64485a.put(G5.f59038j, SDKUtils.encodeString(c4218c5B.e()));
        f64485a.put(G5.f59039k, SDKUtils.encodeString(c4218c5B.f()));
        f64485a.put(G5.f59040l, Integer.valueOf(c4218c5B.a()));
        f64485a.put(G5.f59041m, SDKUtils.encodeString(c4218c5B.d()));
        f64485a.put(G5.f59042n, SDKUtils.encodeString(c4218c5B.c()));
        f64485a.put(G5.f59032d, SDKUtils.encodeString(context.getPackageName()));
        f64485a.put(G5.f59035g, SDKUtils.encodeString(aVar.f64487b));
        f64485a.put("sessionid", SDKUtils.encodeString(aVar.f64486a));
        f64485a.put(G5.f59030b, SDKUtils.encodeString(SDKUtils.getSDKVersion()));
        f64485a.put(G5.f59043o, G5.f59048t);
        f64485a.put("origin", G5.f59045q);
        if (TextUtils.isEmpty(aVar.f64490e)) {
            return;
        }
        f64485a.put(G5.f59037i, SDKUtils.encodeString(aVar.f64490e));
    }

    @Override // com.ironsource.InterfaceC4472q7
    public Map<String, Object> a() {
        return f64485a;
    }

    public static void a(String str) {
        f64485a.put(G5.f59033e, SDKUtils.encodeString(str));
    }
}
