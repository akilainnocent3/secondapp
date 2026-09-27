package ql;

import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.Objects;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes4.dex */
public final class a1 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @k.h1
    public static final String f122330d = "!";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final String f122331e = "/topics/";

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final String f122332f = "[a-zA-Z0-9-_.~%]{1,900}";

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final Pattern f122333g = Pattern.compile(f122332f);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f122334a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f122335b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f122336c;

    public a1(String str, String str2) {
        this.f122334a = d(str2, str);
        this.f122335b = str;
        this.f122336c = str + f122330d + str2;
    }

    @Nullable
    public static a1 a(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        String[] strArrSplit = str.split(f122330d, -1);
        if (strArrSplit.length != 2) {
            return null;
        }
        return new a1(strArrSplit[0], strArrSplit[1]);
    }

    @NonNull
    public static String d(String str, String str2) {
        if (str != null && str.startsWith("/topics/")) {
            Log.w("FirebaseMessaging", String.format("Format /topics/topic-name is deprecated. Only 'topic-name' should be used in %s.", str2));
            str = str.substring(8);
        }
        if (str == null || !f122333g.matcher(str).matches()) {
            throw new IllegalArgumentException(String.format("Invalid topic name: %s does not match the allowed format %s.", str, f122332f));
        }
        return str;
    }

    public static a1 f(@NonNull String str) {
        return new a1(l3.a.R4, str);
    }

    public static a1 g(@NonNull String str) {
        return new a1("U", str);
    }

    public String b() {
        return this.f122335b;
    }

    public String c() {
        return this.f122334a;
    }

    public String e() {
        return this.f122336c;
    }

    public boolean equals(@Nullable Object obj) {
        if (!(obj instanceof a1)) {
            return false;
        }
        a1 a1Var = (a1) obj;
        return this.f122334a.equals(a1Var.f122334a) && this.f122335b.equals(a1Var.f122335b);
    }

    public int hashCode() {
        return Objects.hashCode(this.f122335b, this.f122334a);
    }
}
