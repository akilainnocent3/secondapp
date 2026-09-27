package b0;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import k.y0;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @SuppressLint({"IntentName"})
    public static final String f20450e = "androidx.browser.trusted.sharing.KEY_ACTION";

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final String f20451f = "androidx.browser.trusted.sharing.KEY_METHOD";

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final String f20452g = "androidx.browser.trusted.sharing.KEY_ENCTYPE";

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final String f20453h = "androidx.browser.trusted.sharing.KEY_PARAMS";

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final String f20454i = "GET";

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final String f20455j = "POST";

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final String f20456k = "application/x-www-form-urlencoded";

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final String f20457l = "multipart/form-data";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    public final String f20458a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public final String f20459b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public final String f20460c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NonNull
    public final c f20461d;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    @Retention(RetentionPolicy.SOURCE)
    @y0({y0.a.LIBRARY})
    public @interface a {
    }

    /* JADX INFO: renamed from: b0.b$b, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class C0186b {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final String f20462c = "androidx.browser.trusted.sharing.KEY_FILE_NAME";

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final String f20463d = "androidx.browser.trusted.sharing.KEY_ACCEPTED_TYPES";

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NonNull
        public final String f20464a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NonNull
        public final List<String> f20465b;

        public C0186b(@NonNull String str, @NonNull List<String> list) {
            this.f20464a = str;
            this.f20465b = Collections.unmodifiableList(list);
        }

        @Nullable
        public static C0186b a(@Nullable Bundle bundle) {
            if (bundle == null) {
                return null;
            }
            String string = bundle.getString(f20462c);
            ArrayList<String> stringArrayList = bundle.getStringArrayList(f20463d);
            if (string == null || stringArrayList == null) {
                return null;
            }
            return new C0186b(string, stringArrayList);
        }

        @NonNull
        public Bundle b() {
            Bundle bundle = new Bundle();
            bundle.putString(f20462c, this.f20464a);
            bundle.putStringArrayList(f20463d, new ArrayList<>(this.f20465b));
            return bundle;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static class c {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final String f20466d = "androidx.browser.trusted.sharing.KEY_TITLE";

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final String f20467e = "androidx.browser.trusted.sharing.KEY_TEXT";

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final String f20468f = "androidx.browser.trusted.sharing.KEY_FILES";

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @Nullable
        public final String f20469a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @Nullable
        public final String f20470b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @Nullable
        public final List<C0186b> f20471c;

        public c(@Nullable String str, @Nullable String str2, @Nullable List<C0186b> list) {
            this.f20469a = str;
            this.f20470b = str2;
            this.f20471c = list;
        }

        @Nullable
        public static c a(@Nullable Bundle bundle) {
            ArrayList arrayList = null;
            if (bundle == null) {
                return null;
            }
            ArrayList parcelableArrayList = bundle.getParcelableArrayList(f20468f);
            if (parcelableArrayList != null) {
                arrayList = new ArrayList();
                Iterator it = parcelableArrayList.iterator();
                while (it.hasNext()) {
                    arrayList.add(C0186b.a((Bundle) it.next()));
                }
            }
            return new c(bundle.getString("androidx.browser.trusted.sharing.KEY_TITLE"), bundle.getString("androidx.browser.trusted.sharing.KEY_TEXT"), arrayList);
        }

        @NonNull
        public Bundle b() {
            Bundle bundle = new Bundle();
            bundle.putString("androidx.browser.trusted.sharing.KEY_TITLE", this.f20469a);
            bundle.putString("androidx.browser.trusted.sharing.KEY_TEXT", this.f20470b);
            if (this.f20471c != null) {
                ArrayList<? extends Parcelable> arrayList = new ArrayList<>();
                Iterator<C0186b> it = this.f20471c.iterator();
                while (it.hasNext()) {
                    arrayList.add(it.next().b());
                }
                bundle.putParcelableArrayList(f20468f, arrayList);
            }
            return bundle;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    @Retention(RetentionPolicy.SOURCE)
    @y0({y0.a.LIBRARY})
    public @interface d {
    }

    public b(@NonNull String str, @Nullable String str2, @Nullable String str3, @NonNull c cVar) {
        this.f20458a = str;
        this.f20459b = str2;
        this.f20460c = str3;
        this.f20461d = cVar;
    }

    @Nullable
    public static b a(@NonNull Bundle bundle) {
        String string = bundle.getString(f20450e);
        String string2 = bundle.getString(f20451f);
        String string3 = bundle.getString(f20452g);
        c cVarA = c.a(bundle.getBundle(f20453h));
        if (string == null || cVarA == null) {
            return null;
        }
        return new b(string, string2, string3, cVarA);
    }

    @NonNull
    public Bundle b() {
        Bundle bundle = new Bundle();
        bundle.putString(f20450e, this.f20458a);
        bundle.putString(f20451f, this.f20459b);
        bundle.putString(f20452g, this.f20460c);
        bundle.putBundle(f20453h, this.f20461d.b());
        return bundle;
    }
}
