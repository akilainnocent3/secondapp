package com.google.firebase.messaging;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.ShowFirstParty;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.Map;
import k.e0;
import ql.t0;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes4.dex */
@SafeParcelable.Class(creator = "RemoteMessageCreator")
@SafeParcelable.Reserved({1})
public final class RemoteMessage extends AbstractSafeParcelable {
    public static final Parcelable.Creator<RemoteMessage> CREATOR = new t0();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f52173e = 0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f52174f = 1;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int f52175g = 2;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @SafeParcelable.Field(id = 2)
    public Bundle f52176b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Map<String, String> f52177c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public d f52178d;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Bundle f52179a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Map<String, String> f52180b;

        public b(@NonNull String str) {
            Bundle bundle = new Bundle();
            this.f52179a = bundle;
            this.f52180b = new f0.a();
            if (!TextUtils.isEmpty(str)) {
                bundle.putString(com.google.firebase.messaging.b.d.f52266g, str);
                return;
            }
            throw new IllegalArgumentException("Invalid to: " + str);
        }

        @NonNull
        public b a(@NonNull String str, @Nullable String str2) {
            this.f52180b.put(str, str2);
            return this;
        }

        @NonNull
        public RemoteMessage b() {
            Bundle bundle = new Bundle();
            for (Map.Entry<String, String> entry : this.f52180b.entrySet()) {
                bundle.putString(entry.getKey(), entry.getValue());
            }
            bundle.putAll(this.f52179a);
            this.f52179a.remove("from");
            return new RemoteMessage(bundle);
        }

        @NonNull
        public b c() {
            this.f52180b.clear();
            return this;
        }

        @Nullable
        public String d() {
            return this.f52179a.getString(com.google.firebase.messaging.b.d.f52263d);
        }

        @NonNull
        public Map<String, String> e() {
            return this.f52180b;
        }

        @NonNull
        public String f() {
            return this.f52179a.getString(com.google.firebase.messaging.b.d.f52267h, "");
        }

        @Nullable
        public String g() {
            return this.f52179a.getString(com.google.firebase.messaging.b.d.f52263d);
        }

        @e0(from = 0, to = 86400)
        public int h() {
            return Integer.parseInt(this.f52179a.getString(com.google.firebase.messaging.b.d.f52263d, "0"));
        }

        @NonNull
        public b i(@Nullable String str) {
            this.f52179a.putString(com.google.firebase.messaging.b.d.f52264e, str);
            return this;
        }

        @NonNull
        public b j(@NonNull Map<String, String> map) {
            this.f52180b.clear();
            this.f52180b.putAll(map);
            return this;
        }

        @NonNull
        public b k(@NonNull String str) {
            this.f52179a.putString(com.google.firebase.messaging.b.d.f52267h, str);
            return this;
        }

        @NonNull
        public b l(@Nullable String str) {
            this.f52179a.putString(com.google.firebase.messaging.b.d.f52263d, str);
            return this;
        }

        @NonNull
        @ShowFirstParty
        public b m(byte[] bArr) {
            this.f52179a.putByteArray("rawData", bArr);
            return this;
        }

        @NonNull
        public b n(@e0(from = 0, to = 86400) int i10) {
            this.f52179a.putString(com.google.firebase.messaging.b.d.f52268i, String.valueOf(i10));
            return this;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    @Retention(RetentionPolicy.SOURCE)
    public @interface c {
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f52181a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f52182b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String[] f52183c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final String f52184d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final String f52185e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final String[] f52186f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final String f52187g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final String f52188h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final String f52189i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final String f52190j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public final String f52191k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public final String f52192l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public final String f52193m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public final Uri f52194n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public final String f52195o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public final Integer f52196p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public final Integer f52197q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public final Integer f52198r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public final int[] f52199s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public final Long f52200t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public final boolean f52201u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public final boolean f52202v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public final boolean f52203w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        public final boolean f52204x;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        public final boolean f52205y;

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        public final long[] f52206z;

        public static String[] p(g gVar, String str) {
            Object[] objArrG = gVar.g(str);
            if (objArrG == null) {
                return null;
            }
            String[] strArr = new String[objArrG.length];
            for (int i10 = 0; i10 < objArrG.length; i10++) {
                strArr[i10] = String.valueOf(objArrG[i10]);
            }
            return strArr;
        }

        @Nullable
        public Integer A() {
            return this.f52197q;
        }

        @Nullable
        public String a() {
            return this.f52184d;
        }

        @Nullable
        public String[] b() {
            return this.f52186f;
        }

        @Nullable
        public String c() {
            return this.f52185e;
        }

        @Nullable
        public String d() {
            return this.f52193m;
        }

        @Nullable
        public String e() {
            return this.f52192l;
        }

        @Nullable
        public String f() {
            return this.f52191k;
        }

        public boolean g() {
            return this.f52205y;
        }

        public boolean h() {
            return this.f52203w;
        }

        public boolean i() {
            return this.f52204x;
        }

        @Nullable
        public Long j() {
            return this.f52200t;
        }

        @Nullable
        public String k() {
            return this.f52187g;
        }

        @Nullable
        public Uri l() {
            String str = this.f52188h;
            if (str != null) {
                return Uri.parse(str);
            }
            return null;
        }

        @Nullable
        public int[] m() {
            return this.f52199s;
        }

        @Nullable
        public Uri n() {
            return this.f52194n;
        }

        public boolean o() {
            return this.f52202v;
        }

        @Nullable
        public Integer q() {
            return this.f52198r;
        }

        @Nullable
        public Integer r() {
            return this.f52196p;
        }

        @Nullable
        public String s() {
            return this.f52189i;
        }

        public boolean t() {
            return this.f52201u;
        }

        @Nullable
        public String u() {
            return this.f52190j;
        }

        @Nullable
        public String v() {
            return this.f52195o;
        }

        @Nullable
        public String w() {
            return this.f52181a;
        }

        @Nullable
        public String[] x() {
            return this.f52183c;
        }

        @Nullable
        public String y() {
            return this.f52182b;
        }

        @Nullable
        public long[] z() {
            return this.f52206z;
        }

        public d(g gVar) {
            this.f52181a = gVar.p(com.google.firebase.messaging.b.c.f52240g);
            this.f52182b = gVar.h(com.google.firebase.messaging.b.c.f52240g);
            this.f52183c = p(gVar, com.google.firebase.messaging.b.c.f52240g);
            this.f52184d = gVar.p(com.google.firebase.messaging.b.c.f52241h);
            this.f52185e = gVar.h(com.google.firebase.messaging.b.c.f52241h);
            this.f52186f = p(gVar, com.google.firebase.messaging.b.c.f52241h);
            this.f52187g = gVar.p(com.google.firebase.messaging.b.c.f52242i);
            this.f52189i = gVar.o();
            this.f52190j = gVar.p(com.google.firebase.messaging.b.c.f52244k);
            this.f52191k = gVar.p(com.google.firebase.messaging.b.c.f52245l);
            this.f52192l = gVar.p(com.google.firebase.messaging.b.c.A);
            this.f52193m = gVar.p(com.google.firebase.messaging.b.c.D);
            this.f52194n = gVar.f();
            this.f52188h = gVar.p(com.google.firebase.messaging.b.c.f52243j);
            this.f52195o = gVar.p(com.google.firebase.messaging.b.c.f52246m);
            this.f52196p = gVar.b(com.google.firebase.messaging.b.c.f52249p);
            this.f52197q = gVar.b(com.google.firebase.messaging.b.c.f52254u);
            this.f52198r = gVar.b(com.google.firebase.messaging.b.c.f52253t);
            this.f52201u = gVar.a(com.google.firebase.messaging.b.c.f52248o);
            this.f52202v = gVar.a(com.google.firebase.messaging.b.c.f52247n);
            this.f52203w = gVar.a(com.google.firebase.messaging.b.c.f52250q);
            this.f52204x = gVar.a(com.google.firebase.messaging.b.c.f52251r);
            this.f52205y = gVar.a(com.google.firebase.messaging.b.c.f52252s);
            this.f52200t = gVar.j(com.google.firebase.messaging.b.c.f52257x);
            this.f52199s = gVar.e();
            this.f52206z = gVar.q();
        }
    }

    @SafeParcelable.Constructor
    public RemoteMessage(@SafeParcelable.Param(id = 2) Bundle bundle) {
        this.f52176b = bundle;
    }

    public final int b(String str) {
        if ("high".equals(str)) {
            return 1;
        }
        return "normal".equals(str) ? 2 : 0;
    }

    @Nullable
    public d d() {
        if (this.f52178d == null && g.v(this.f52176b)) {
            this.f52178d = new d(new g(this.f52176b));
        }
        return this.f52178d;
    }

    @Nullable
    public String getCollapseKey() {
        return this.f52176b.getString(com.google.firebase.messaging.b.d.f52264e);
    }

    @NonNull
    public Map<String, String> getData() {
        if (this.f52177c == null) {
            this.f52177c = com.google.firebase.messaging.b.d.a(this.f52176b);
        }
        return this.f52177c;
    }

    @Nullable
    public String getFrom() {
        return this.f52176b.getString("from");
    }

    @Nullable
    public String getMessageId() {
        String string = this.f52176b.getString(com.google.firebase.messaging.b.d.f52267h);
        return string == null ? this.f52176b.getString(com.google.firebase.messaging.b.d.f52265f) : string;
    }

    @Nullable
    public String getMessageType() {
        return this.f52176b.getString(com.google.firebase.messaging.b.d.f52263d);
    }

    public int getOriginalPriority() {
        String string = this.f52176b.getString(com.google.firebase.messaging.b.d.f52270k);
        if (string == null) {
            string = this.f52176b.getString(com.google.firebase.messaging.b.d.f52272m);
        }
        return b(string);
    }

    public int getPriority() {
        String string = this.f52176b.getString(com.google.firebase.messaging.b.d.f52271l);
        if (string == null) {
            if ("1".equals(this.f52176b.getString(com.google.firebase.messaging.b.d.f52273n))) {
                return 2;
            }
            string = this.f52176b.getString(com.google.firebase.messaging.b.d.f52272m);
        }
        return b(string);
    }

    @Nullable
    @ShowFirstParty
    public byte[] getRawData() {
        return this.f52176b.getByteArray("rawData");
    }

    @Nullable
    public String getSenderId() {
        return this.f52176b.getString(com.google.firebase.messaging.b.d.f52276q);
    }

    public long getSentTime() {
        Object obj = this.f52176b.get(com.google.firebase.messaging.b.d.f52269j);
        if (obj instanceof Long) {
            return ((Long) obj).longValue();
        }
        if (!(obj instanceof String)) {
            return 0L;
        }
        try {
            return Long.parseLong((String) obj);
        } catch (NumberFormatException unused) {
            Log.w("FirebaseMessaging", "Invalid sent time: " + obj);
            return 0L;
        }
    }

    @Nullable
    public String getTo() {
        return this.f52176b.getString(com.google.firebase.messaging.b.d.f52266g);
    }

    public int getTtl() {
        Object obj = this.f52176b.get(com.google.firebase.messaging.b.d.f52268i);
        if (obj instanceof Integer) {
            return ((Integer) obj).intValue();
        }
        if (!(obj instanceof String)) {
            return 0;
        }
        try {
            return Integer.parseInt((String) obj);
        } catch (NumberFormatException unused) {
            Log.w("FirebaseMessaging", "Invalid TTL: " + obj);
            return 0;
        }
    }

    public void h(Intent intent) {
        intent.putExtras(this.f52176b);
    }

    @KeepForSdk
    public Intent l() {
        Intent intent = new Intent();
        intent.putExtras(this.f52176b);
        return intent;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NonNull Parcel parcel, int i10) {
        t0.c(this, parcel, i10);
    }
}
