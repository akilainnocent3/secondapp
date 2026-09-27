package sc;

import android.content.res.AssetManager;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Typeface;
import android.util.Log;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.Charset;
import java.util.HashSet;
import java.util.Set;
import u4.l1;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public class q extends m {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String f130296b = "SimpleAssetResolver";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Set<String> f130297c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public AssetManager f130298a;

    static {
        HashSet hashSet = new HashSet(8);
        f130297c = hashSet;
        hashSet.add("image/svg+xml");
        hashSet.add("image/jpeg");
        hashSet.add("image/png");
        hashSet.add("image/pjpeg");
        hashSet.add("image/gif");
        hashSet.add(l1.f138662g1);
        hashSet.add("image/x-windows-bmp");
        hashSet.add("image/webp");
    }

    public q(AssetManager assetManager) {
        this.f130298a = assetManager;
    }

    @Override // sc.m
    public boolean a(String str) {
        return f130297c.contains(str);
    }

    @Override // sc.m
    public String b(String str) {
        Log.i(f130296b, "resolveCSSStyleSheet(" + str + gi.j.f86771d);
        return e(str);
    }

    @Override // sc.m
    public Typeface c(String str, int i10, String str2) {
        Log.i(f130296b, "resolveFont(" + str + "," + i10 + "," + str2 + gi.j.f86771d);
        try {
            try {
                return Typeface.createFromAsset(this.f130298a, str + ".ttf");
            } catch (RuntimeException unused) {
                return Typeface.createFromAsset(this.f130298a, str + ".otf");
            }
        } catch (RuntimeException unused2) {
            return null;
        }
    }

    @Override // sc.m
    public Bitmap d(String str) {
        Log.i(f130296b, "resolveImage(" + str + gi.j.f86771d);
        try {
            return BitmapFactory.decodeStream(this.f130298a.open(str));
        } catch (IOException unused) {
            return null;
        }
    }

    public final String e(String str) throws Throwable {
        Throwable th2;
        InputStream inputStreamOpen;
        try {
            inputStreamOpen = this.f130298a.open(str);
            try {
                InputStreamReader inputStreamReader = new InputStreamReader(inputStreamOpen, Charset.forName("UTF-8"));
                char[] cArr = new char[4096];
                StringBuilder sb2 = new StringBuilder();
                for (int i10 = inputStreamReader.read(cArr); i10 > 0; i10 = inputStreamReader.read(cArr)) {
                    sb2.append(cArr, 0, i10);
                }
                String string = sb2.toString();
                if (inputStreamOpen != null) {
                    try {
                        inputStreamOpen.close();
                    } catch (IOException unused) {
                    }
                }
                return string;
            } catch (IOException unused2) {
                if (inputStreamOpen != null) {
                    try {
                        inputStreamOpen.close();
                    } catch (IOException unused3) {
                    }
                }
                return null;
            } catch (Throwable th3) {
                th2 = th3;
                if (inputStreamOpen != null) {
                    try {
                        inputStreamOpen.close();
                    } catch (IOException unused4) {
                    }
                }
                throw th2;
            }
        } catch (IOException unused5) {
            inputStreamOpen = null;
        } catch (Throwable th4) {
            th2 = th4;
            inputStreamOpen = null;
        }
    }
}
