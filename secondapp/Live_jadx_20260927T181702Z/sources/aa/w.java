package aa;

import android.content.Context;
import android.content.res.Resources;
import android.net.Uri;
import android.util.Log;
import android.webkit.WebResourceResponse;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import ba.d1;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import k.h1;
import k.i1;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes2.dex */
public final class w {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String f4592b = "WebViewAssetLoader";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String f4593c = "appassets.androidplatform.net";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List<e> f4594a;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public boolean f4596a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public String f4597b = w.f4593c;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @NonNull
        public final List<e2.t<String, d>> f4598c = new ArrayList();

        @NonNull
        public b a(@NonNull String str, @NonNull d dVar) {
            this.f4598c.add(e2.t.a(str, dVar));
            return this;
        }

        @NonNull
        public w b() {
            ArrayList arrayList = new ArrayList();
            for (e2.t<String, d> tVar : this.f4598c) {
                arrayList.add(new e(this.f4597b, tVar.f79831a, this.f4596a, tVar.f79832b));
            }
            return new w(arrayList);
        }

        @NonNull
        public b c(@NonNull String str) {
            this.f4597b = str;
            return this;
        }

        @NonNull
        public b d(boolean z10) {
            this.f4596a = z10;
            return this;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class c implements d {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final String[] f4599b = {"app_webview/", "databases/", "lib/", "shared_prefs/", "code_cache/"};

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NonNull
        public final File f4600a;

        public c(@NonNull Context context, @NonNull File file) {
            try {
                this.f4600a = new File(d1.a(file));
                if (b(context)) {
                    return;
                }
                throw new IllegalArgumentException("The given directory \"" + file + "\" doesn't exist under an allowed app internal storage directory");
            } catch (IOException e10) {
                throw new IllegalArgumentException("Failed to resolve the canonical path for the given directory: " + file.getPath(), e10);
            }
        }

        @Override // aa.w.d
        @NonNull
        @i1
        public WebResourceResponse a(@NonNull String str) {
            try {
                File fileB = d1.b(this.f4600a, str);
                if (fileB != null) {
                    return new WebResourceResponse(d1.f(str), null, d1.i(fileB));
                }
                Log.e(w.f4592b, String.format("The requested file: %s is outside the mounted directory: %s", str, this.f4600a));
                return new WebResourceResponse(null, null, null);
            } catch (IOException e10) {
                Log.e(w.f4592b, "Error opening the requested path: " + str, e10);
            }
        }

        public final boolean b(@NonNull Context context) throws IOException {
            String strA = d1.a(this.f4600a);
            String strA2 = d1.a(context.getCacheDir());
            String strA3 = d1.a(d1.c(context));
            if ((!strA.startsWith(strA2) && !strA.startsWith(strA3)) || strA.equals(strA2) || strA.equals(strA3)) {
                return false;
            }
            for (String str : f4599b) {
                if (strA.startsWith(strA3 + str)) {
                    return false;
                }
            }
            return true;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public interface d {
        @Nullable
        @i1
        WebResourceResponse a(@NonNull String str);
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    @h1
    public static class e {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final String f4601e = "http";

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final String f4602f = "https";

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final boolean f4603a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NonNull
        public final String f4604b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @NonNull
        public final String f4605c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @NonNull
        public final d f4606d;

        public e(@NonNull String str, @NonNull String str2, boolean z10, @NonNull d dVar) {
            if (str2.isEmpty() || str2.charAt(0) != '/') {
                throw new IllegalArgumentException("Path should start with a slash '/'.");
            }
            if (!str2.endsWith(to.c.userBaseDel)) {
                throw new IllegalArgumentException("Path should end with a slash '/'");
            }
            this.f4604b = str;
            this.f4605c = str2;
            this.f4603a = z10;
            this.f4606d = dVar;
        }

        @NonNull
        @i1
        public String a(@NonNull String str) {
            return str.replaceFirst(this.f4605c, "");
        }

        @Nullable
        @i1
        public d b(@NonNull Uri uri) {
            if (uri.getScheme().equals("http") && !this.f4603a) {
                return null;
            }
            if ((uri.getScheme().equals("http") || uri.getScheme().equals("https")) && uri.getAuthority().equals(this.f4604b) && uri.getPath().startsWith(this.f4605c)) {
                return this.f4606d;
            }
            return null;
        }
    }

    public w(@NonNull List<e> list) {
        this.f4594a = list;
    }

    @Nullable
    @i1
    public WebResourceResponse a(@NonNull Uri uri) {
        WebResourceResponse webResourceResponseA;
        for (e eVar : this.f4594a) {
            d dVarB = eVar.b(uri);
            if (dVarB != null && (webResourceResponseA = dVarB.a(eVar.a(uri.getPath()))) != null) {
                return webResourceResponseA;
            }
        }
        return null;
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class a implements d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final d1 f4595a;

        public a(@NonNull Context context) {
            this.f4595a = new d1(context);
        }

        @Override // aa.w.d
        @Nullable
        @i1
        public WebResourceResponse a(@NonNull String str) {
            try {
                return new WebResourceResponse(d1.f(str), null, this.f4595a.h(str));
            } catch (IOException e10) {
                Log.e(w.f4592b, "Error opening asset path: " + str, e10);
                return new WebResourceResponse(null, null, null);
            }
        }

        @h1
        public a(@NonNull d1 d1Var) {
            this.f4595a = d1Var;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class f implements d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final d1 f4607a;

        public f(@NonNull Context context) {
            this.f4607a = new d1(context);
        }

        @Override // aa.w.d
        @Nullable
        @i1
        public WebResourceResponse a(@NonNull String str) {
            try {
                return new WebResourceResponse(d1.f(str), null, this.f4607a.j(str));
            } catch (Resources.NotFoundException e10) {
                Log.e(w.f4592b, "Resource not found from the path: " + str, e10);
                return new WebResourceResponse(null, null, null);
            } catch (IOException e11) {
                Log.e(w.f4592b, "Error opening resource from the path: " + str, e11);
                return new WebResourceResponse(null, null, null);
            }
        }

        @h1
        public f(@NonNull d1 d1Var) {
            this.f4607a = d1Var;
        }
    }
}
