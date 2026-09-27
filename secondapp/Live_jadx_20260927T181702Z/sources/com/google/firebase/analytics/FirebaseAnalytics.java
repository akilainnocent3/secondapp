package com.google.firebase.analytics;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import androidx.annotation.Keep;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.measurement.zzdf;
import com.google.android.gms.internal.measurement.zzfb;
import com.google.android.gms.measurement.internal.zzlk;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import el.j;
import java.util.Map;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import k.a1;
import k.j0;
import k.x0;
import tj.f;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes4.dex */
public final class FirebaseAnalytics {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static volatile FirebaseAnalytics f52040c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final zzfb f52041a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ExecutorService f52042b;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public enum a {
        GRANTED,
        DENIED
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public enum b {
        AD_STORAGE,
        ANALYTICS_STORAGE,
        AD_USER_DATA,
        AD_PERSONALIZATION
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static class c {

        @NonNull
        public static final String A = "screen_view";

        @NonNull
        public static final String B = "remove_from_cart";

        @NonNull
        public static final String C = "add_shipping_info";

        @NonNull
        public static final String D = "purchase";

        @NonNull
        public static final String E = "refund";

        @NonNull
        public static final String F = "select_item";

        @NonNull
        public static final String G = "select_promotion";

        @NonNull
        public static final String H = "view_cart";

        @NonNull
        public static final String I = "view_promotion";

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NonNull
        public static final String f52051a = "ad_impression";

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NonNull
        public static final String f52052b = "add_payment_info";

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @NonNull
        public static final String f52053c = "add_to_cart";

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @NonNull
        public static final String f52054d = "add_to_wishlist";

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        @NonNull
        public static final String f52055e = "app_open";

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        @NonNull
        public static final String f52056f = "begin_checkout";

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        @NonNull
        public static final String f52057g = "campaign_details";

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        @NonNull
        public static final String f52058h = "generate_lead";

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        @NonNull
        public static final String f52059i = "join_group";

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        @NonNull
        public static final String f52060j = "level_end";

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        @NonNull
        public static final String f52061k = "level_start";

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        @NonNull
        public static final String f52062l = "level_up";

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        @NonNull
        public static final String f52063m = "login";

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        @NonNull
        public static final String f52064n = "post_score";

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        @NonNull
        public static final String f52065o = "search";

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        @NonNull
        public static final String f52066p = "select_content";

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        @NonNull
        public static final String f52067q = "share";

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        @NonNull
        public static final String f52068r = "sign_up";

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        @NonNull
        public static final String f52069s = "spend_virtual_currency";

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        @NonNull
        public static final String f52070t = "tutorial_begin";

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        @NonNull
        public static final String f52071u = "tutorial_complete";

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        @NonNull
        public static final String f52072v = "unlock_achievement";

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        @NonNull
        public static final String f52073w = "view_item";

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        @NonNull
        public static final String f52074x = "view_item_list";

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        @NonNull
        public static final String f52075y = "view_search_results";

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        @NonNull
        public static final String f52076z = "earn_virtual_currency";
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static class d {

        @NonNull
        public static final String A = "origin";

        @NonNull
        public static final String B = "price";

        @NonNull
        public static final String C = "quantity";

        @NonNull
        public static final String D = "score";

        @NonNull
        public static final String E = "shipping";

        @NonNull
        public static final String F = "transaction_id";

        @NonNull
        public static final String G = "search_term";

        @NonNull
        public static final String H = "success";

        @NonNull
        public static final String I = "tax";

        @NonNull
        public static final String J = "value";

        @NonNull
        public static final String K = "virtual_currency_name";

        @NonNull
        public static final String L = "campaign";

        @NonNull
        public static final String M = "source";

        @NonNull
        public static final String N = "medium";

        @NonNull
        public static final String O = "term";

        @NonNull
        public static final String P = "content";

        @NonNull
        public static final String Q = "aclid";

        @NonNull
        public static final String R = "cp1";

        @NonNull
        public static final String S = "campaign_id";

        @NonNull
        public static final String T = "source_platform";

        @NonNull
        public static final String U = "creative_format";

        @NonNull
        public static final String V = "marketing_tactic";

        @NonNull
        public static final String W = "item_brand";

        @NonNull
        public static final String X = "item_variant";

        @NonNull
        public static final String Y = "creative_name";

        @NonNull
        public static final String Z = "creative_slot";

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NonNull
        public static final String f52077a = "achievement_id";

        /* JADX INFO: renamed from: a0, reason: collision with root package name */
        @NonNull
        public static final String f52078a0 = "affiliation";

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NonNull
        public static final String f52079b = "ad_format";

        /* JADX INFO: renamed from: b0, reason: collision with root package name */
        @NonNull
        public static final String f52080b0 = "index";

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @NonNull
        public static final String f52081c = "ad_platform";

        /* JADX INFO: renamed from: c0, reason: collision with root package name */
        @NonNull
        public static final String f52082c0 = "discount";

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @NonNull
        public static final String f52083d = "ad_source";

        /* JADX INFO: renamed from: d0, reason: collision with root package name */
        @NonNull
        public static final String f52084d0 = "item_category2";

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        @NonNull
        public static final String f52085e = "ad_unit_name";

        /* JADX INFO: renamed from: e0, reason: collision with root package name */
        @NonNull
        public static final String f52086e0 = "item_category3";

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        @NonNull
        public static final String f52087f = "character";

        /* JADX INFO: renamed from: f0, reason: collision with root package name */
        @NonNull
        public static final String f52088f0 = "item_category4";

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        @NonNull
        public static final String f52089g = "travel_class";

        /* JADX INFO: renamed from: g0, reason: collision with root package name */
        @NonNull
        public static final String f52090g0 = "item_category5";

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        @NonNull
        public static final String f52091h = "content_type";

        /* JADX INFO: renamed from: h0, reason: collision with root package name */
        @NonNull
        public static final String f52092h0 = "item_list_id";

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        @NonNull
        public static final String f52093i = "currency";

        /* JADX INFO: renamed from: i0, reason: collision with root package name */
        @NonNull
        public static final String f52094i0 = "item_list_name";

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        @NonNull
        public static final String f52095j = "coupon";

        /* JADX INFO: renamed from: j0, reason: collision with root package name */
        @NonNull
        public static final String f52096j0 = "items";

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        @NonNull
        public static final String f52097k = "start_date";

        /* JADX INFO: renamed from: k0, reason: collision with root package name */
        @NonNull
        public static final String f52098k0 = "location_id";

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        @NonNull
        public static final String f52099l = "end_date";

        /* JADX INFO: renamed from: l0, reason: collision with root package name */
        @NonNull
        public static final String f52100l0 = "payment_type";

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        @NonNull
        public static final String f52101m = "extend_session";

        /* JADX INFO: renamed from: m0, reason: collision with root package name */
        @NonNull
        public static final String f52102m0 = "promotion_id";

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        @NonNull
        public static final String f52103n = "flight_number";

        /* JADX INFO: renamed from: n0, reason: collision with root package name */
        @NonNull
        public static final String f52104n0 = "promotion_name";

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        @NonNull
        public static final String f52105o = "group_id";

        /* JADX INFO: renamed from: o0, reason: collision with root package name */
        @NonNull
        public static final String f52106o0 = "screen_class";

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        @NonNull
        public static final String f52107p = "item_category";

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        @NonNull
        public static final String f52108p0 = "screen_name";

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        @NonNull
        public static final String f52109q = "item_id";

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        @NonNull
        public static final String f52110q0 = "shipping_tier";

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        @NonNull
        public static final String f52111r = "item_name";

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        @NonNull
        public static final String f52112s = "location";

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        @NonNull
        public static final String f52113t = "level";

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        @NonNull
        public static final String f52114u = "level_name";

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        @NonNull
        public static final String f52115v = "method";

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        @NonNull
        public static final String f52116w = "number_of_nights";

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        @NonNull
        public static final String f52117x = "number_of_passengers";

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        @NonNull
        public static final String f52118y = "number_of_rooms";

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        @NonNull
        public static final String f52119z = "destination";
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NonNull
        public static final String f52120a = "sign_up_method";

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NonNull
        public static final String f52121b = "allow_personalized_ads";
    }

    public FirebaseAnalytics(zzfb zzfbVar) {
        Preconditions.checkNotNull(zzfbVar);
        this.f52041a = zzfbVar;
    }

    @NonNull
    @x0(allOf = {"android.permission.INTERNET", com.bumptech.glide.manager.e.f31484b, "android.permission.WAKE_LOCK"})
    @Keep
    public static FirebaseAnalytics getInstance(@NonNull Context context) {
        if (f52040c == null) {
            synchronized (FirebaseAnalytics.class) {
                try {
                    if (f52040c == null) {
                        f52040c = new FirebaseAnalytics(zzfb.zza(context, null));
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return f52040c;
    }

    @Nullable
    @Keep
    public static zzlk getScionFrontendApiImplementation(Context context, @Nullable Bundle bundle) {
        zzfb zzfbVarZza = zzfb.zza(context, bundle);
        if (zzfbVarZza == null) {
            return null;
        }
        return new f(zzfbVarZza);
    }

    @NonNull
    public Task<String> a() {
        try {
            return Tasks.call(k(), new tj.d(this));
        } catch (RuntimeException e10) {
            this.f52041a.zzD(5, "Failed to schedule task for getAppInstanceId", null, null, null);
            return Tasks.forException(e10);
        }
    }

    @NonNull
    public Task<Long> b() {
        try {
            return Tasks.call(k(), new tj.e(this));
        } catch (RuntimeException e10) {
            this.f52041a.zzD(5, "Failed to schedule task for getSessionId", null, null, null);
            return Tasks.forException(e10);
        }
    }

    public void c() {
        this.f52041a.zzs();
    }

    public void d(boolean z10) {
        this.f52041a.zzq(Boolean.valueOf(z10));
    }

    public void e(@NonNull Map<b, a> map) {
        Bundle bundle = new Bundle();
        a aVar = map.get(b.AD_STORAGE);
        if (aVar != null) {
            int iOrdinal = aVar.ordinal();
            if (iOrdinal == 0) {
                bundle.putString("ad_storage", "granted");
            } else if (iOrdinal == 1) {
                bundle.putString("ad_storage", "denied");
            }
        }
        a aVar2 = map.get(b.ANALYTICS_STORAGE);
        if (aVar2 != null) {
            int iOrdinal2 = aVar2.ordinal();
            if (iOrdinal2 == 0) {
                bundle.putString("analytics_storage", "granted");
            } else if (iOrdinal2 == 1) {
                bundle.putString("analytics_storage", "denied");
            }
        }
        a aVar3 = map.get(b.AD_USER_DATA);
        if (aVar3 != null) {
            int iOrdinal3 = aVar3.ordinal();
            if (iOrdinal3 == 0) {
                bundle.putString("ad_user_data", "granted");
            } else if (iOrdinal3 == 1) {
                bundle.putString("ad_user_data", "denied");
            }
        }
        a aVar4 = map.get(b.AD_PERSONALIZATION);
        if (aVar4 != null) {
            int iOrdinal4 = aVar4.ordinal();
            if (iOrdinal4 == 0) {
                bundle.putString("ad_personalization", "granted");
            } else if (iOrdinal4 == 1) {
                bundle.putString("ad_personalization", "denied");
            }
        }
        this.f52041a.zzr(bundle);
    }

    public void f(@Nullable Bundle bundle) {
        if (bundle != null) {
            bundle = new Bundle(bundle);
        }
        this.f52041a.zzL(bundle);
    }

    public void g(long j10) {
        this.f52041a.zzt(j10);
    }

    @NonNull
    @Keep
    public String getFirebaseInstanceId() {
        try {
            return (String) Tasks.await(j.t().getId(), 30000L, TimeUnit.MILLISECONDS);
        } catch (InterruptedException e10) {
            throw new IllegalStateException(e10);
        } catch (ExecutionException e11) {
            throw new IllegalStateException(e11.getCause());
        } catch (TimeoutException unused) {
            throw new IllegalThreadStateException("Firebase Installations getId Task has timed out.");
        }
    }

    public void h(@Nullable String str) {
        this.f52041a.zzo(str);
    }

    public void i(@NonNull @a1(max = 24, min = 1) String str, @Nullable @a1(max = 36) String str2) {
        this.f52041a.zzk(null, str, str2, false);
    }

    public final /* synthetic */ zzfb j() {
        return this.f52041a;
    }

    @ux.d({"this.executor"})
    public final ExecutorService k() throws Throwable {
        FirebaseAnalytics firebaseAnalytics;
        synchronized (FirebaseAnalytics.class) {
            try {
                try {
                    if (this.f52042b == null) {
                        firebaseAnalytics = this;
                        firebaseAnalytics.f52042b = new tj.c(firebaseAnalytics, 0, 1, 30L, TimeUnit.SECONDS, new ArrayBlockingQueue(100));
                    } else {
                        firebaseAnalytics = this;
                    }
                    return firebaseAnalytics.f52042b;
                } catch (Throwable th2) {
                    th = th2;
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
                throw th;
            }
        }
    }

    public void logEvent(@NonNull @a1(max = 40, min = 1) String str, @Nullable Bundle bundle) {
        this.f52041a.zzh(str, bundle);
    }

    @Keep
    @j0
    @Deprecated
    public void setCurrentScreen(@NonNull Activity activity, @Nullable @a1(max = 36, min = 1) String str, @Nullable @a1(max = 36, min = 1) String str2) {
        this.f52041a.zzp(zzdf.zza(activity), str, str2);
    }
}
