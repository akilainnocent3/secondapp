package sj;

import android.content.Context;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.StringResourceValueReader;
import com.google.android.gms.common.util.Strings;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes4.dex */
public final class s {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final String f135404h = "google_api_key";

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final String f135405i = "google_app_id";

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final String f135406j = "firebase_database_url";

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final String f135407k = "ga_trackingId";

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final String f135408l = "gcm_defaultSenderId";

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final String f135409m = "google_storage_bucket";

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final String f135410n = "project_id";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f135411a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f135412b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f135413c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f135414d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f135415e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f135416f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f135417g;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public String f135418a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public String f135419b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public String f135420c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public String f135421d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public String f135422e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public String f135423f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public String f135424g;

        public b() {
        }

        @NonNull
        public s a() {
            return new s(this.f135419b, this.f135418a, this.f135420c, this.f135421d, this.f135422e, this.f135423f, this.f135424g);
        }

        @NonNull
        public b b(@NonNull String str) {
            this.f135418a = Preconditions.checkNotEmpty(str, "ApiKey must be set.");
            return this;
        }

        @NonNull
        public b c(@NonNull String str) {
            this.f135419b = Preconditions.checkNotEmpty(str, "ApplicationId must be set.");
            return this;
        }

        @NonNull
        public b d(@Nullable String str) {
            this.f135420c = str;
            return this;
        }

        @NonNull
        @KeepForSdk
        public b e(@Nullable String str) {
            this.f135421d = str;
            return this;
        }

        @NonNull
        public b f(@Nullable String str) {
            this.f135422e = str;
            return this;
        }

        @NonNull
        public b g(@Nullable String str) {
            this.f135424g = str;
            return this;
        }

        @NonNull
        public b h(@Nullable String str) {
            this.f135423f = str;
            return this;
        }

        public b(@NonNull s sVar) {
            this.f135419b = sVar.f135412b;
            this.f135418a = sVar.f135411a;
            this.f135420c = sVar.f135413c;
            this.f135421d = sVar.f135414d;
            this.f135422e = sVar.f135415e;
            this.f135423f = sVar.f135416f;
            this.f135424g = sVar.f135417g;
        }
    }

    @Nullable
    public static s h(@NonNull Context context) {
        StringResourceValueReader stringResourceValueReader = new StringResourceValueReader(context);
        String string = stringResourceValueReader.getString(f135405i);
        if (TextUtils.isEmpty(string)) {
            return null;
        }
        return new s(string, stringResourceValueReader.getString(f135404h), stringResourceValueReader.getString(f135406j), stringResourceValueReader.getString(f135407k), stringResourceValueReader.getString(f135408l), stringResourceValueReader.getString(f135409m), stringResourceValueReader.getString(f135410n));
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof s)) {
            return false;
        }
        s sVar = (s) obj;
        return Objects.equal(this.f135412b, sVar.f135412b) && Objects.equal(this.f135411a, sVar.f135411a) && Objects.equal(this.f135413c, sVar.f135413c) && Objects.equal(this.f135414d, sVar.f135414d) && Objects.equal(this.f135415e, sVar.f135415e) && Objects.equal(this.f135416f, sVar.f135416f) && Objects.equal(this.f135417g, sVar.f135417g);
    }

    public int hashCode() {
        return Objects.hashCode(this.f135412b, this.f135411a, this.f135413c, this.f135414d, this.f135415e, this.f135416f, this.f135417g);
    }

    @NonNull
    public String i() {
        return this.f135411a;
    }

    @NonNull
    public String j() {
        return this.f135412b;
    }

    @Nullable
    public String k() {
        return this.f135413c;
    }

    @Nullable
    @KeepForSdk
    public String l() {
        return this.f135414d;
    }

    @Nullable
    public String m() {
        return this.f135415e;
    }

    @Nullable
    public String n() {
        return this.f135417g;
    }

    @Nullable
    public String o() {
        return this.f135416f;
    }

    public String toString() {
        return Objects.toStringHelper(this).add("applicationId", this.f135412b).add("apiKey", this.f135411a).add("databaseUrl", this.f135413c).add("gcmSenderId", this.f135415e).add("storageBucket", this.f135416f).add("projectId", this.f135417g).toString();
    }

    public s(@NonNull String str, @NonNull String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable String str6, @Nullable String str7) {
        Preconditions.checkState(!Strings.isEmptyOrWhitespace(str), "ApplicationId must be set.");
        this.f135412b = str;
        this.f135411a = str2;
        this.f135413c = str3;
        this.f135414d = str4;
        this.f135415e = str5;
        this.f135416f = str6;
        this.f135417g = str7;
    }
}
