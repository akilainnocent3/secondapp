package com.ironsource;

import android.content.Context;
import com.ironsource.mediationsdk.utils.IronSourceUtils;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.ironsource.i9, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
public class C4330i9 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @oy.l
    public static final a f62016a = new a(null);

    /* JADX INFO: renamed from: com.ironsource.i9$a */
    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    @kotlin.jvm.internal.s1({"SMAP\nInitServerResponse.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InitServerResponse.kt\ncom/ironsource/mediationsdk/InitServerResponse$Companion\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,56:1\n1#2:57\n*E\n"})
    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.x xVar) {
            this();
        }

        private final JSONObject a(Context context) {
            try {
                return new JSONObject(IronSourceUtils.e(context));
            } catch (JSONException unused) {
                return new JSONObject();
            }
        }

        @cs.o
        public final boolean b(@oy.l Context context) {
            kotlin.jvm.internal.m0.p(context, "context");
            E3 e3D = d(context);
            return e3D.d().length() > 0 && e3D.e().length() > 0;
        }

        @cs.o
        @oy.m
        public final Ne c(@oy.l Context context) {
            kotlin.jvm.internal.m0.p(context, "context");
            E3 e3D = d(context);
            if (e3D.d().length() <= 0 || e3D.e().length() <= 0) {
                e3D = null;
            }
            if (e3D == null) {
                return null;
            }
            Ne ne2 = new Ne(context, e3D.d(), e3D.f(), e3D.e());
            ne2.a(Ne.a.CACHE);
            return ne2;
        }

        @oy.l
        @cs.o
        public final E3 d(@oy.l Context context) {
            kotlin.jvm.internal.m0.p(context, "context");
            JSONObject jSONObjectA = a(context);
            String cachedAppKey = jSONObjectA.optString("appKey");
            String cachedUserId = jSONObjectA.optString("userId");
            String cachedSettings = jSONObjectA.optString(Ne.f59595n);
            kotlin.jvm.internal.m0.o(cachedAppKey, "cachedAppKey");
            kotlin.jvm.internal.m0.o(cachedUserId, "cachedUserId");
            kotlin.jvm.internal.m0.o(cachedSettings, "cachedSettings");
            return new E3(cachedAppKey, cachedUserId, cachedSettings);
        }

        private a() {
        }
    }

    @cs.o
    public static final boolean a(@oy.l Context context) {
        return f62016a.b(context);
    }

    @cs.o
    @oy.m
    public static final Ne b(@oy.l Context context) {
        return f62016a.c(context);
    }

    @oy.l
    @cs.o
    public static final E3 c(@oy.l Context context) {
        return f62016a.d(context);
    }
}
