package d1;

import android.app.RemoteInput;
import android.content.ClipData;
import android.content.ClipDescription;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import k.y0;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes.dex */
public final class t0 {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final String f77640h = "android.remoteinput.results";

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final String f77641i = "android.remoteinput.resultsData";

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final String f77642j = "android.remoteinput.dataTypeResultsData";

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final String f77643k = "android.remoteinput.resultsSource";

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final int f77644l = 0;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final int f77645m = 1;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final int f77646n = 0;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final int f77647o = 1;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final int f77648p = 2;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f77649a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final CharSequence f77650b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final CharSequence[] f77651c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f77652d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f77653e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Bundle f77654f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Set<String> f77655g;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    @k.t0(20)
    public static class a {
        @k.t
        public static void a(Object obj, Intent intent, Bundle bundle) {
            RemoteInput.addResultsToIntent((RemoteInput[]) obj, intent, bundle);
        }

        public static RemoteInput b(t0 t0Var) {
            Set<String> setG;
            RemoteInput.Builder builderAddExtras = new RemoteInput.Builder(t0Var.o()).setLabel(t0Var.n()).setChoices(t0Var.h()).setAllowFreeFormInput(t0Var.f()).addExtras(t0Var.m());
            if (Build.VERSION.SDK_INT >= 26 && (setG = t0Var.g()) != null) {
                Iterator<String> it = setG.iterator();
                while (it.hasNext()) {
                    b.d(builderAddExtras, it.next(), true);
                }
            }
            if (Build.VERSION.SDK_INT >= 29) {
                d.b(builderAddExtras, t0Var.k());
            }
            return builderAddExtras.build();
        }

        public static t0 c(Object obj) {
            Set<String> setB;
            RemoteInput remoteInput = (RemoteInput) obj;
            e eVarA = new e(remoteInput.getResultKey()).h(remoteInput.getLabel()).f(remoteInput.getChoices()).e(remoteInput.getAllowFreeFormInput()).a(remoteInput.getExtras());
            if (Build.VERSION.SDK_INT >= 26 && (setB = b.b(remoteInput)) != null) {
                Iterator<String> it = setB.iterator();
                while (it.hasNext()) {
                    eVarA.d(it.next(), true);
                }
            }
            if (Build.VERSION.SDK_INT >= 29) {
                eVarA.g(d.a(remoteInput));
            }
            return eVarA.b();
        }

        @k.t
        public static Bundle d(Intent intent) {
            return RemoteInput.getResultsFromIntent(intent);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    @k.t0(26)
    public static class b {
        @k.t
        public static void a(t0 t0Var, Intent intent, Map<String, Uri> map) {
            RemoteInput.addDataResultToIntent(t0.c(t0Var), intent, map);
        }

        @k.t
        public static Set<String> b(Object obj) {
            return ((RemoteInput) obj).getAllowedDataTypes();
        }

        @k.t
        public static Map<String, Uri> c(Intent intent, String str) {
            return RemoteInput.getDataResultsFromIntent(intent, str);
        }

        @k.t
        public static RemoteInput.Builder d(RemoteInput.Builder builder, String str, boolean z10) {
            return builder.setAllowDataType(str, z10);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    @k.t0(28)
    public static class c {
        @k.t
        public static int a(Intent intent) {
            return RemoteInput.getResultsSource(intent);
        }

        @k.t
        public static void b(Intent intent, int i10) {
            RemoteInput.setResultsSource(intent, i10);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    @k.t0(29)
    public static class d {
        @k.t
        public static int a(Object obj) {
            return ((RemoteInput) obj).getEditChoicesBeforeSending();
        }

        @k.t
        public static RemoteInput.Builder b(RemoteInput.Builder builder, int i10) {
            return builder.setEditChoicesBeforeSending(i10);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f77656a;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public CharSequence f77659d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public CharSequence[] f77660e;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Set<String> f77657b = new HashSet();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Bundle f77658c = new Bundle();

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public boolean f77661f = true;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public int f77662g = 0;

        public e(@NonNull String str) {
            if (str == null) {
                throw new IllegalArgumentException("Result key can't be null");
            }
            this.f77656a = str;
        }

        @NonNull
        public e a(@NonNull Bundle bundle) {
            if (bundle != null) {
                this.f77658c.putAll(bundle);
            }
            return this;
        }

        @NonNull
        public t0 b() {
            return new t0(this.f77656a, this.f77659d, this.f77660e, this.f77661f, this.f77662g, this.f77658c, this.f77657b);
        }

        @NonNull
        public Bundle c() {
            return this.f77658c;
        }

        @NonNull
        public e d(@NonNull String str, boolean z10) {
            if (z10) {
                this.f77657b.add(str);
                return this;
            }
            this.f77657b.remove(str);
            return this;
        }

        @NonNull
        public e e(boolean z10) {
            this.f77661f = z10;
            return this;
        }

        @NonNull
        public e f(@Nullable CharSequence[] charSequenceArr) {
            this.f77660e = charSequenceArr;
            return this;
        }

        @NonNull
        public e g(int i10) {
            this.f77662g = i10;
            return this;
        }

        @NonNull
        public e h(@Nullable CharSequence charSequence) {
            this.f77659d = charSequence;
            return this;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    @Retention(RetentionPolicy.SOURCE)
    @y0({y0.a.LIBRARY_GROUP_PREFIX})
    public @interface f {
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    @Retention(RetentionPolicy.SOURCE)
    @y0({y0.a.LIBRARY_GROUP_PREFIX})
    public @interface g {
    }

    public t0(String str, CharSequence charSequence, CharSequence[] charSequenceArr, boolean z10, int i10, Bundle bundle, Set<String> set) {
        this.f77649a = str;
        this.f77650b = charSequence;
        this.f77651c = charSequenceArr;
        this.f77652d = z10;
        this.f77653e = i10;
        this.f77654f = bundle;
        this.f77655g = set;
        if (k() == 2 && !f()) {
            throw new IllegalArgumentException("setEditChoicesBeforeSending requires setAllowFreeFormInput");
        }
    }

    public static void a(@NonNull t0 t0Var, @NonNull Intent intent, @NonNull Map<String, Uri> map) {
        if (Build.VERSION.SDK_INT >= 26) {
            b.a(t0Var, intent, map);
            return;
        }
        Intent intentI = i(intent);
        if (intentI == null) {
            intentI = new Intent();
        }
        for (Map.Entry<String, Uri> entry : map.entrySet()) {
            String key = entry.getKey();
            Uri value = entry.getValue();
            if (key != null) {
                Bundle bundleExtra = intentI.getBundleExtra(l(key));
                if (bundleExtra == null) {
                    bundleExtra = new Bundle();
                }
                bundleExtra.putString(t0Var.o(), value.toString());
                intentI.putExtra(l(key), bundleExtra);
            }
        }
        intent.setClipData(ClipData.newIntent(f77640h, intentI));
    }

    public static void b(@NonNull t0[] t0VarArr, @NonNull Intent intent, @NonNull Bundle bundle) {
        if (Build.VERSION.SDK_INT >= 26) {
            a.a(d(t0VarArr), intent, bundle);
            return;
        }
        Bundle bundleP = p(intent);
        int iQ = q(intent);
        if (bundleP != null) {
            bundleP.putAll(bundle);
            bundle = bundleP;
        }
        for (t0 t0Var : t0VarArr) {
            Map<String, Uri> mapJ = j(intent, t0Var.o());
            a.a(d(new t0[]{t0Var}), intent, bundle);
            if (mapJ != null) {
                a(t0Var, intent, mapJ);
            }
        }
        s(intent, iQ);
    }

    @k.t0(20)
    public static RemoteInput c(t0 t0Var) {
        return a.b(t0Var);
    }

    @k.t0(20)
    public static RemoteInput[] d(t0[] t0VarArr) {
        if (t0VarArr == null) {
            return null;
        }
        RemoteInput[] remoteInputArr = new RemoteInput[t0VarArr.length];
        for (int i10 = 0; i10 < t0VarArr.length; i10++) {
            remoteInputArr[i10] = c(t0VarArr[i10]);
        }
        return remoteInputArr;
    }

    @k.t0(20)
    public static t0 e(RemoteInput remoteInput) {
        return a.c(remoteInput);
    }

    public static Intent i(Intent intent) {
        ClipData clipData = intent.getClipData();
        if (clipData == null) {
            return null;
        }
        ClipDescription description = clipData.getDescription();
        if (description.hasMimeType("text/vnd.android.intent") && description.getLabel().toString().contentEquals(f77640h)) {
            return clipData.getItemAt(0).getIntent();
        }
        return null;
    }

    @Nullable
    public static Map<String, Uri> j(@NonNull Intent intent, @NonNull String str) {
        String string;
        if (Build.VERSION.SDK_INT >= 26) {
            return b.c(intent, str);
        }
        Intent intentI = i(intent);
        if (intentI == null) {
            return null;
        }
        HashMap map = new HashMap();
        for (String str2 : intentI.getExtras().keySet()) {
            if (str2.startsWith(f77642j)) {
                String strSubstring = str2.substring(39);
                if (!strSubstring.isEmpty() && (string = intentI.getBundleExtra(str2).getString(str)) != null && !string.isEmpty()) {
                    map.put(strSubstring, Uri.parse(string));
                }
            }
        }
        if (map.isEmpty()) {
            return null;
        }
        return map;
    }

    public static String l(String str) {
        return f77642j + str;
    }

    @Nullable
    public static Bundle p(@NonNull Intent intent) {
        return a.d(intent);
    }

    public static int q(@NonNull Intent intent) {
        if (Build.VERSION.SDK_INT >= 28) {
            return c.a(intent);
        }
        Intent intentI = i(intent);
        if (intentI == null) {
            return 0;
        }
        return intentI.getExtras().getInt(f77643k, 0);
    }

    public static void s(@NonNull Intent intent, int i10) {
        if (Build.VERSION.SDK_INT >= 28) {
            c.b(intent, i10);
            return;
        }
        Intent intentI = i(intent);
        if (intentI == null) {
            intentI = new Intent();
        }
        intentI.putExtra(f77643k, i10);
        intent.setClipData(ClipData.newIntent(f77640h, intentI));
    }

    public boolean f() {
        return this.f77652d;
    }

    @Nullable
    public Set<String> g() {
        return this.f77655g;
    }

    @Nullable
    public CharSequence[] h() {
        return this.f77651c;
    }

    public int k() {
        return this.f77653e;
    }

    @NonNull
    public Bundle m() {
        return this.f77654f;
    }

    @Nullable
    public CharSequence n() {
        return this.f77650b;
    }

    @NonNull
    public String o() {
        return this.f77649a;
    }

    public boolean r() {
        if (f()) {
            return false;
        }
        return ((h() != null && h().length != 0) || g() == null || g().isEmpty()) ? false : true;
    }
}
