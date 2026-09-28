package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Typeface;
import android.util.Base64;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.zip.GZIPInputStream;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;
import y740.a;

/* JADX INFO: loaded from: classes.dex */
public final class lnt {
    public static final HashMap a = new HashMap();
    public static final HashSet b = new HashSet();
    public static final byte[] c = {80, 75, 3, 4};
    public static final byte[] d = {31, -117, 8};

    public static yot<xmt> a(final String str, Callable<wot<xmt>> callable, Runnable runnable) {
        xmt xmtVarA = str == null ? null : ymt.b.a(str);
        yot<xmt> yotVar = xmtVarA != null ? new yot<>(xmtVarA) : null;
        HashMap map = a;
        if (str != null && map.containsKey(str)) {
            yotVar = (yot) map.get(str);
        }
        if (yotVar != null) {
            if (runnable != null) {
                runnable.run();
            }
            return yotVar;
        }
        yot<xmt> yotVar2 = new yot<>(callable, false);
        if (str != null) {
            final AtomicBoolean atomicBoolean = new AtomicBoolean(false);
            yotVar2.b(new qot() { // from class: gnt
                @Override // defpackage.qot
                public final void onResult(Object obj) {
                    HashMap map2 = lnt.a;
                    map2.remove(str);
                    atomicBoolean.set(true);
                    if (map2.size() == 0) {
                        lnt.m(true);
                    }
                }
            });
            yotVar2.a(new qot() { // from class: hnt
                @Override // defpackage.qot
                public final void onResult(Object obj) {
                    HashMap map2 = lnt.a;
                    map2.remove(str);
                    atomicBoolean.set(true);
                    if (map2.size() == 0) {
                        lnt.m(true);
                    }
                }
            });
            if (!atomicBoolean.get()) {
                map.put(str, yotVar2);
                if (map.size() == 1) {
                    m(false);
                }
            }
        }
        return yotVar2;
    }

    public static yot<xmt> b(Context context, String str) {
        String strA = inm.a("asset_", str);
        return a(strA, new fnt(context.getApplicationContext(), str, strA), null);
    }

    public static wot<xmt> c(Context context, String str, String str2) {
        xmt xmtVarA = str2 == null ? null : ymt.b.a(str2);
        if (xmtVarA != null) {
            return new wot<>(xmtVarA);
        }
        try {
            return d(context, context.getAssets().open(str), str2);
        } catch (IOException e) {
            return new wot<>(e);
        }
    }

    public static wot<xmt> d(Context context, InputStream inputStream, String str) {
        xmt xmtVarA = str == null ? null : ymt.b.a(str);
        if (xmtVarA != null) {
            return new wot<>(xmtVarA);
        }
        try {
            y740 y740Var = new y740(tmy.c(inputStream));
            if (l(y740Var, c).booleanValue()) {
                return j(context, new ZipInputStream(y740Var.new a()), str);
            }
            if (l(y740Var, d).booleanValue()) {
                return f(tmy.c(new GZIPInputStream(y740Var.new a())), str);
            }
            String[] strArr = hep.e;
            return e(new hfp(y740Var), str, true);
        } catch (IOException e) {
            return new wot<>(e);
        }
    }

    public static wot e(hfp hfpVar, String str, boolean z) {
        try {
            xmt xmtVarA = str == null ? null : ymt.b.a(str);
            if (xmtVarA != null) {
                return new wot(xmtVarA);
            }
            xmt xmtVarA2 = mnt.a(hfpVar);
            if (str != null) {
                ymt.b.a.c(str, xmtVarA2);
            }
            return new wot(xmtVarA2);
        } catch (Exception e) {
            return new wot(e);
        } finally {
            if (z) {
                srh0.b(hfpVar);
            }
        }
    }

    public static wot f(nmn nmnVar, String str) {
        y740 y740Var = new y740(nmnVar);
        String[] strArr = hep.e;
        return e(new hfp(y740Var), str, true);
    }

    public static yot g(final int i, Context context, final String str) {
        final WeakReference weakReference = new WeakReference(context);
        final Context applicationContext = context.getApplicationContext();
        return a(str, new Callable() { // from class: jnt
            @Override // java.util.concurrent.Callable
            public final Object call() {
                Context context2 = (Context) weakReference.get();
                if (context2 == null) {
                    context2 = applicationContext;
                }
                return lnt.h(i, context2, str);
            }
        }, null);
    }

    public static wot h(int i, Context context, String str) {
        xmt xmtVarA = str == null ? null : ymt.b.a(str);
        if (xmtVarA != null) {
            return new wot(xmtVarA);
        }
        try {
            y740 y740Var = new y740(tmy.c(context.getResources().openRawResource(i)));
            if (l(y740Var, c).booleanValue()) {
                return j(context, new ZipInputStream(y740Var.new a()), str);
            }
            if (!l(y740Var, d).booleanValue()) {
                String[] strArr = hep.e;
                return e(new hfp(y740Var), str, true);
            }
            try {
                return f(tmy.c(new GZIPInputStream(y740Var.new a())), str);
            } catch (IOException e) {
                return new wot(e);
            }
        } catch (Resources.NotFoundException e2) {
            return new wot(e2);
        }
    }

    public static yot<xmt> i(Context context, String str) {
        String strA = inm.a("url_", str);
        return a(strA, new zmt(context, str, strA), null);
    }

    public static wot<xmt> j(Context context, ZipInputStream zipInputStream, String str) {
        try {
            return k(context, zipInputStream, str);
        } finally {
            srh0.b(zipInputStream);
        }
    }

    public static wot<xmt> k(Context context, ZipInputStream zipInputStream, String str) {
        xmt xmtVarA;
        pot potVar;
        HashMap map = new HashMap();
        HashMap map2 = new HashMap();
        if (str == null) {
            xmtVarA = null;
        } else {
            try {
                xmtVarA = ymt.b.a(str);
            } catch (IOException e) {
                return new wot<>(e);
            }
        }
        if (xmtVarA != null) {
            return new wot<>(xmtVarA);
        }
        ZipEntry nextEntry = zipInputStream.getNextEntry();
        xmt xmtVar = null;
        while (nextEntry != null) {
            String name = nextEntry.getName();
            if (name.contains("__MACOSX")) {
                zipInputStream.closeEntry();
            } else if (nextEntry.getName().equalsIgnoreCase("manifest.json")) {
                zipInputStream.closeEntry();
            } else if (nextEntry.getName().contains(".json")) {
                y740 y740Var = new y740(tmy.c(zipInputStream));
                String[] strArr = hep.e;
                xmtVar = e(new hfp(y740Var), null, false).a;
            } else if (name.contains(".png") || name.contains(".webp") || name.contains(".jpg") || name.contains(".jpeg")) {
                String[] strArrSplit = name.split("/");
                map.put(strArrSplit[strArrSplit.length - 1], BitmapFactory.decodeStream(zipInputStream));
            } else if (name.contains(".ttf") || name.contains(".otf")) {
                String[] strArrSplit2 = name.split("/");
                String str2 = strArrSplit2[strArrSplit2.length - 1];
                String str3 = str2.split("\\.")[0];
                if (context == null) {
                    return new wot<>(new IllegalStateException("Unable to extract font " + str3 + " please pass a non-null Context parameter"));
                }
                File file = new File(context.getCacheDir(), str2);
                try {
                    FileOutputStream fileOutputStream = new FileOutputStream(file);
                    try {
                        FileOutputStream fileOutputStream2 = new FileOutputStream(file);
                        try {
                            byte[] bArr = new byte[4096];
                            while (true) {
                                int i = zipInputStream.read(bArr);
                                if (i == -1) {
                                    break;
                                }
                                fileOutputStream2.write(bArr, 0, i);
                            }
                            fileOutputStream2.flush();
                            fileOutputStream2.close();
                            fileOutputStream.close();
                        } catch (Throwable th) {
                            try {
                                fileOutputStream2.close();
                            } catch (Throwable th2) {
                                th.addSuppressed(th2);
                            }
                            throw th;
                        }
                    } catch (Throwable th3) {
                        try {
                            fileOutputStream.close();
                        } catch (Throwable th4) {
                            th3.addSuppressed(th4);
                        }
                        throw th3;
                    }
                } catch (Throwable th5) {
                    lgt.c("Unable to save font " + str3 + " to the temporary file: " + str2 + ". ", th5);
                }
                Typeface typefaceCreateFromFile = Typeface.createFromFile(file);
                if (!file.delete()) {
                    lgt.b("Failed to delete temp font file " + file.getAbsolutePath() + ".");
                }
                map2.put(str3, typefaceCreateFromFile);
            } else {
                zipInputStream.closeEntry();
            }
            nextEntry = zipInputStream.getNextEntry();
        }
        if (xmtVar == null) {
            return new wot<>(new IllegalArgumentException("Unable to parse composition"));
        }
        for (Map.Entry entry : map.entrySet()) {
            String str4 = (String) entry.getKey();
            Iterator it = ((HashMap) xmtVar.c()).values().iterator();
            do {
                if (!it.hasNext()) {
                    potVar = null;
                    break;
                }
                potVar = (pot) it.next();
            } while (!potVar.d.equals(str4));
            if (potVar != null) {
                potVar.f = srh0.d((Bitmap) entry.getValue(), potVar.a, potVar.b);
            }
        }
        for (Map.Entry entry2 : map2.entrySet()) {
            boolean z = false;
            for (a8i a8iVar : xmtVar.f.values()) {
                if (a8iVar.a.equals(entry2.getKey())) {
                    a8iVar.d = (Typeface) entry2.getValue();
                    z = true;
                }
            }
            if (!z) {
                lgt.b("Parsed font for " + ((String) entry2.getKey()) + " however it was not found in the animation.");
            }
        }
        if (map.isEmpty()) {
            Iterator it2 = ((HashMap) xmtVar.c()).entrySet().iterator();
            while (it2.hasNext()) {
                pot potVar2 = (pot) ((Map.Entry) it2.next()).getValue();
                if (potVar2 == null) {
                    return null;
                }
                String str5 = potVar2.d;
                BitmapFactory.Options options = new BitmapFactory.Options();
                options.inScaled = true;
                options.inDensity = 160;
                if (str5.startsWith("data:") && str5.indexOf("base64,") > 0) {
                    try {
                        byte[] bArrDecode = Base64.decode(str5.substring(str5.indexOf(44) + 1), 0);
                        Bitmap bitmapDecodeByteArray = BitmapFactory.decodeByteArray(bArrDecode, 0, bArrDecode.length, options);
                        if (bitmapDecodeByteArray != null) {
                            potVar2.f = srh0.d(bitmapDecodeByteArray, potVar2.a, potVar2.b);
                        }
                    } catch (IllegalArgumentException e2) {
                        lgt.c("data URL did not have correct base64 format.", e2);
                        return null;
                    }
                }
            }
        }
        if (str != null) {
            ymt.b.a.c(str, xmtVar);
        }
        return new wot<>(xmtVar);
    }

    public static Boolean l(y740 y740Var, byte[] bArr) {
        try {
            y740 y740VarPeek = y740Var.peek();
            for (byte b2 : bArr) {
                if (y740VarPeek.readByte() != b2) {
                    return Boolean.FALSE;
                }
            }
            y740VarPeek.close();
            return Boolean.TRUE;
        } catch (Exception unused) {
            lgt.a.getClass();
            return Boolean.FALSE;
        } catch (NoSuchMethodError unused2) {
            return Boolean.FALSE;
        }
    }

    public static void m(boolean z) {
        ArrayList arrayList = new ArrayList(b);
        for (int i = 0; i < arrayList.size(); i++) {
            ((zot) arrayList.get(i)).a();
        }
    }

    public static String n(Context context, int i) {
        return t7l.b(i, (context.getResources().getConfiguration().uiMode & 48) == 32 ? "_night_" : "_day_", new StringBuilder("rawRes"));
    }
}
