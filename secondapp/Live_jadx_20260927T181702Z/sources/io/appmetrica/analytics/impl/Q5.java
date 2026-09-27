package io.appmetrica.analytics.impl;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Base64;
import android.util.Pair;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import io.appmetrica.analytics.coreapi.internal.event.CounterReportApi;
import io.appmetrica.analytics.coreapi.internal.permission.PermissionState;
import io.appmetrica.analytics.coreutils.internal.collection.CollectionUtils;
import io.appmetrica.analytics.coreutils.internal.time.SystemTimeProvider;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
public class Q5 implements CounterReportApi, Parcelable {
    public static final Parcelable.Creator<Q5> CREATOR = new P5();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    protected String f96364a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    protected String f96365b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f96366c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f96367d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f96368e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Pair f96369f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f96370g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public String f96371h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public long f96372i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public long f96373j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public EnumC5016ea f96374k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public EnumC5246n9 f96375l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public Bundle f96376m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public Boolean f96377n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public Integer f96378o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public Map f96379p;

    public Q5() {
        this("", 0);
    }

    public final void a(String str, String str2) {
        if (this.f96369f == null) {
            this.f96369f = new Pair(str, str2);
        }
    }

    @Nullable
    public final Pair<String, String> b() {
        return this.f96369f;
    }

    public final void c(@Nullable Bundle bundle) {
        this.f96376m = bundle;
    }

    public final long d() {
        return this.f96372i;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final long e() {
        return this.f96373j;
    }

    @Nullable
    public final String f() {
        return this.f96366c;
    }

    @NonNull
    public final EnumC5016ea g() {
        return this.f96374k;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.event.CounterReportApi
    public final int getBytesTruncated() {
        return this.f96370g;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.event.CounterReportApi
    public final int getCustomType() {
        return this.f96368e;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.event.CounterReportApi
    @NonNull
    public final Map<String, byte[]> getExtras() {
        return this.f96379p;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.event.CounterReportApi
    @Nullable
    public final String getName() {
        return this.f96364a;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.event.CounterReportApi
    public final int getType() {
        return this.f96367d;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.event.CounterReportApi
    @Nullable
    public final String getValue() {
        return this.f96365b;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.event.CounterReportApi
    @Nullable
    public final byte[] getValueBytes() {
        String str = this.f96365b;
        if (str == null) {
            return null;
        }
        return Base64.decode(str, 0);
    }

    @Nullable
    public final Integer h() {
        return this.f96378o;
    }

    @Nullable
    public final Bundle i() {
        return this.f96376m;
    }

    @Nullable
    public final String j() {
        return this.f96371h;
    }

    @Nullable
    public final EnumC5246n9 k() {
        return this.f96375l;
    }

    public final boolean l() {
        return this.f96364a == null;
    }

    public final boolean m() {
        EnumC4966cb enumC4966cb = EnumC4966cb.EVENT_TYPE_UNDEFINED;
        return -1 == this.f96367d;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.event.CounterReportApi
    public final void setBytesTruncated(int i10) {
        this.f96370g = i10;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.event.CounterReportApi
    public final void setCustomType(int i10) {
        this.f96368e = i10;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.event.CounterReportApi
    public final void setExtras(@NonNull Map<String, byte[]> map) {
        this.f96379p = map;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.event.CounterReportApi
    public void setName(@Nullable String str) {
        this.f96364a = str;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.event.CounterReportApi
    public final void setType(int i10) {
        this.f96367d = i10;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.event.CounterReportApi
    public void setValue(@Nullable String str) {
        this.f96365b = str;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.event.CounterReportApi
    public void setValueBytes(@Nullable byte[] bArr) {
        this.f96365b = bArr == null ? null : new String(Base64.encode(bArr, 0));
    }

    @NonNull
    public final String toString() {
        Locale locale = Locale.US;
        String str = this.f96364a;
        String str2 = EnumC4966cb.a(this.f96367d).f97110b;
        String strSubstring = this.f96365b;
        if (strSubstring == null) {
            strSubstring = null;
        } else if (strSubstring.length() > 500) {
            strSubstring = strSubstring.substring(0, 500);
        }
        return String.format(locale, "[event: %s, type: %s, value: %s]", str, str2, strSubstring);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        Bundle bundle = new Bundle();
        bundle.putString("CounterReport.Event", this.f96364a);
        bundle.putString("CounterReport.Value", this.f96365b);
        bundle.putInt("CounterReport.Type", this.f96367d);
        bundle.putInt("CounterReport.CustomType", this.f96368e);
        bundle.putInt("CounterReport.TRUNCATED", this.f96370g);
        bundle.putString("CounterReport.ProfileID", this.f96371h);
        bundle.putInt("CounterReport.UniquenessStatus", this.f96374k.f97272a);
        Bundle bundle2 = this.f96376m;
        if (bundle2 != null) {
            bundle.putParcelable("CounterReport.Payload", bundle2);
        }
        String str = this.f96366c;
        if (str != null) {
            bundle.putString("CounterReport.Environment", str);
        }
        Pair pair = this.f96369f;
        if (pair != null) {
            bundle.putString("CounterReport.AppEnvironmentDiffKey", (String) pair.first);
            bundle.putString("CounterReport.AppEnvironmentDiffValue", (String) pair.second);
        }
        bundle.putLong("CounterReport.CreationElapsedRealtime", this.f96372i);
        bundle.putLong("CounterReport.CreationTimestamp", this.f96373j);
        EnumC5246n9 enumC5246n9 = this.f96375l;
        if (enumC5246n9 != null) {
            bundle.putInt("CounterReport.Source", enumC5246n9.f97969a);
        }
        Boolean bool = this.f96377n;
        if (bool != null) {
            bundle.putBoolean("CounterReport.AttributionIdChanged", bool.booleanValue());
        }
        Integer num = this.f96378o;
        if (num != null) {
            bundle.putInt("CounterReport.OpenId", num.intValue());
        }
        bundle.putBundle("CounterReport.Extras", CollectionUtils.mapToBundle(this.f96379p));
        parcel.writeBundle(bundle);
    }

    public Q5(@Nullable String str, int i10) {
        this("", str, i10);
    }

    @NonNull
    public static Q5 e(@NonNull Q5 q10) {
        return a(q10, EnumC4966cb.EVENT_TYPE_APP_UPDATE);
    }

    public final void b(@Nullable String str) {
        this.f96366c = str;
    }

    public void c(@Nullable String str) {
        this.f96371h = str;
    }

    @NonNull
    public final Bundle d(Bundle bundle) {
        if (bundle == null) {
            bundle = new Bundle();
        }
        bundle.putParcelable("CounterReport.Object", this);
        return bundle;
    }

    public Q5(@Nullable String str, @Nullable String str2, int i10) {
        this(str, str2, i10, new SystemTimeProvider());
    }

    public final void a(long j10) {
        this.f96372i = j10;
    }

    public final void b(long j10) {
        this.f96373j = j10;
    }

    @Nullable
    public final Boolean c() {
        return this.f96377n;
    }

    @k.h1
    public Q5(@Nullable String str, @Nullable String str2, int i10, @NonNull SystemTimeProvider systemTimeProvider) {
        this.f96374k = EnumC5016ea.UNKNOWN;
        this.f96379p = new HashMap();
        this.f96364a = str2;
        this.f96367d = i10;
        this.f96365b = str;
        this.f96372i = systemTimeProvider.elapsedRealtime();
        this.f96373j = systemTimeProvider.currentTimeMillis();
    }

    @NonNull
    public static Q5 b(@Nullable Bundle bundle) {
        if (bundle != null) {
            try {
                Q5 q10 = (Q5) bundle.getParcelable("CounterReport.Object");
                if (q10 != null) {
                    return q10;
                }
            } catch (Throwable unused) {
                return new Q5("", 0);
            }
        }
        return new Q5("", 0);
    }

    @NonNull
    public static Q5 c(@NonNull Q5 q10) {
        return a(q10, EnumC4966cb.EVENT_TYPE_INIT);
    }

    @NonNull
    public static Q5 d(@NonNull Q5 q10) {
        Q5 q11 = new Q5("", 0);
        q11.f96373j = q10.f96373j;
        q11.f96372i = q10.f96372i;
        q11.f96369f = q10.f96369f;
        q11.f96366c = q10.f96366c;
        q11.f96376m = q10.f96376m;
        q11.f96379p = q10.f96379p;
        q11.f96371h = q10.f96371h;
        return q11;
    }

    public final void a(@NonNull EnumC5016ea enumC5016ea) {
        this.f96374k = enumC5016ea;
    }

    public final void a(@Nullable EnumC5246n9 enumC5246n9) {
        this.f96375l = enumC5246n9;
    }

    public final void a(@Nullable Boolean bool) {
        this.f96377n = bool;
    }

    public final void a(@Nullable Integer num) {
        this.f96378o = num;
    }

    public static Pair a(Bundle bundle) {
        if (bundle.containsKey("CounterReport.AppEnvironmentDiffKey") && bundle.containsKey("CounterReport.AppEnvironmentDiffValue")) {
            return new Pair(bundle.getString("CounterReport.AppEnvironmentDiffKey"), bundle.getString("CounterReport.AppEnvironmentDiffValue"));
        }
        return null;
    }

    @NonNull
    public static Q5 b(@NonNull Q5 q10) {
        return a(q10, EnumC4966cb.EVENT_TYPE_FIRST_ACTIVATION);
    }

    public static Q5 a(Q5 q10, EnumC4966cb enumC4966cb) {
        Q5 q5D = d(q10);
        q5D.f96367d = enumC4966cb.f97109a;
        return q5D;
    }

    @NonNull
    public static Q5 a(@NonNull Q5 q10) {
        return a(q10, EnumC4966cb.EVENT_TYPE_ALIVE);
    }

    @NonNull
    public static Q5 a(@NonNull Q5 q10, @NonNull N9 n10) {
        Q5 q5A = a(q10, EnumC4966cb.EVENT_TYPE_START);
        q5A.setValueBytes(MessageNano.toByteArray(new C5321q9().fromModel(new C5296p9((String) n10.f96209b.a()))));
        q5A.f96373j = q10.f96373j;
        q5A.f96372i = q10.f96372i;
        return q5A;
    }

    @NonNull
    public static Q5 a(@NonNull Q5 q10, @NonNull Collection<PermissionState> collection, @Nullable C5513y2 c5513y2, @NonNull C4983d2 c4983d2, @NonNull List<String> list) {
        String string;
        String str;
        Q5 q5D = d(q10);
        try {
            JSONArray jSONArray = new JSONArray();
            for (PermissionState permissionState : collection) {
                jSONArray.put(new JSONObject().put("name", permissionState.name).put("granted", permissionState.granted));
            }
            JSONObject jSONObject = new JSONObject();
            if (c5513y2 != null) {
                jSONObject.put("background_restricted", c5513y2.f98639b);
                EnumC5488x2 enumC5488x2 = c5513y2.f98638a;
                c4983d2.getClass();
                if (enumC5488x2 != null) {
                    int iOrdinal = enumC5488x2.ordinal();
                    if (iOrdinal == 0) {
                        str = "EXEMPTED";
                    } else if (iOrdinal == 1) {
                        str = "ACTIVE";
                    } else if (iOrdinal == 2) {
                        str = "WORKING_SET";
                    } else if (iOrdinal == 3) {
                        str = "FREQUENT";
                    } else if (iOrdinal == 4) {
                        str = "RARE";
                    } else if (iOrdinal == 5) {
                        str = "RESTRICTED";
                    }
                    jSONObject.put("app_standby_bucket", str);
                }
                str = null;
                jSONObject.put("app_standby_bucket", str);
            }
            string = new JSONObject().put("permissions", jSONArray).put("background_restrictions", jSONObject).put("available_providers", new JSONArray((Collection) list)).toString();
        } catch (Throwable unused) {
            string = "";
        }
        EnumC4966cb enumC4966cb = EnumC4966cb.EVENT_TYPE_UNDEFINED;
        q5D.f96367d = 12288;
        q5D.setValue(string);
        return q5D;
    }

    @NonNull
    public static Q5 a(@NonNull Q5 q10, @Nullable String str) {
        Q5 q5D = d(q10);
        EnumC4966cb enumC4966cb = EnumC4966cb.EVENT_TYPE_UNDEFINED;
        q5D.f96367d = 12289;
        q5D.setValue(str);
        return q5D;
    }

    @NonNull
    public static Q5 a() {
        Q5 q10 = new Q5("", 0);
        EnumC4966cb enumC4966cb = EnumC4966cb.EVENT_TYPE_UNDEFINED;
        q10.f96367d = 16384;
        return q10;
    }

    @NonNull
    public static Q5 a(@NonNull String str) {
        Q5 q10 = new Q5("", 0);
        EnumC4966cb enumC4966cb = EnumC4966cb.EVENT_TYPE_UNDEFINED;
        q10.f96367d = 12320;
        q10.f96365b = str;
        q10.f96375l = EnumC5246n9.JS;
        return q10;
    }
}
