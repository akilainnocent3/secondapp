package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.net.Uri;
import android.util.Log;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class l9h0 extends q9h0 {
    public static final Class<?> a;
    public static final Constructor<?> b;
    public static final Method c;
    public static final Method d;

    static {
        Class<?> cls;
        Method method;
        Method method2;
        Constructor<?> constructor = null;
        try {
            cls = Class.forName("android.graphics.FontFamily");
            Constructor<?> constructor2 = cls.getConstructor(null);
            Class cls2 = Integer.TYPE;
            method2 = cls.getMethod("addFontWeightStyle", ByteBuffer.class, cls2, List.class, cls2, Boolean.TYPE);
            method = Typeface.class.getMethod("createFromFamiliesWithDefault", Array.newInstance(cls, 1).getClass());
            constructor = constructor2;
        } catch (ClassNotFoundException | NoSuchMethodException e) {
            Log.e("TypefaceCompatApi24Impl", e.getClass().getName(), e);
            cls = null;
            method = null;
            method2 = null;
        }
        b = constructor;
        a = cls;
        c = method2;
        d = method;
    }

    public static boolean f(Object obj, ByteBuffer byteBuffer, int i, int i2, boolean z) {
        try {
            return ((Boolean) c.invoke(obj, byteBuffer, Integer.valueOf(i), null, Integer.valueOf(i2), Boolean.valueOf(z))).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    public static Typeface g(Object obj) {
        try {
            Object objNewInstance = Array.newInstance(a, 1);
            Array.set(objNewInstance, 0, obj);
            return (Typeface) d.invoke(null, objNewInstance);
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return null;
        }
    }

    @Override // defpackage.q9h0
    public final Typeface a(Context context, e9i.b bVar, Resources resources, int i) throws IllegalAccessException, InstantiationException, InvocationTargetException {
        Object objNewInstance;
        MappedByteBuffer map;
        try {
            objNewInstance = b.newInstance(null);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
            objNewInstance = null;
        }
        if (objNewInstance != null) {
            for (e9i.c cVar : bVar.a) {
                int i2 = cVar.f;
                File fileC = r9h0.c(context);
                if (fileC != null) {
                    try {
                        if (r9h0.a(fileC, resources, i2)) {
                            try {
                                FileInputStream fileInputStream = new FileInputStream(fileC);
                                try {
                                    FileChannel channel = fileInputStream.getChannel();
                                    map = channel.map(FileChannel.MapMode.READ_ONLY, 0L, channel.size());
                                    fileInputStream.close();
                                    fileC.delete();
                                } catch (Throwable th) {
                                    try {
                                        fileInputStream.close();
                                    } catch (Throwable th2) {
                                        th.addSuppressed(th2);
                                    }
                                    throw th;
                                }
                            } catch (IOException unused2) {
                                map = null;
                            }
                        } else {
                            fileC.delete();
                        }
                        if (map != null && f(objNewInstance, map, cVar.e, cVar.b, cVar.c)) {
                        }
                    } catch (Throwable th3) {
                        fileC.delete();
                        throw th3;
                    }
                }
                map = null;
                if (map != null) {
                }
            }
            return g(objNewInstance);
        }
        return null;
    }

    @Override // defpackage.q9h0
    public final Typeface b(Context context, v9i.b[] bVarArr, int i) {
        Object objNewInstance;
        try {
            objNewInstance = b.newInstance(null);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
            objNewInstance = null;
        }
        if (objNewInstance != null) {
            nj90 nj90Var = new nj90();
            for (v9i.b bVar : bVarArr) {
                Uri uri = bVar.a;
                ByteBuffer byteBufferD = (ByteBuffer) nj90Var.get(uri);
                if (byteBufferD == null) {
                    byteBufferD = r9h0.d(context, uri);
                    nj90Var.put(uri, byteBufferD);
                }
                if (byteBufferD != null && f(objNewInstance, byteBufferD, bVar.b, bVar.c, bVar.d)) {
                }
            }
            Typeface typefaceG = g(objNewInstance);
            if (typefaceG != null) {
                return Typeface.create(typefaceG, i);
            }
        }
        return null;
    }
}
