package com.google.android.gms.dynamite;

import android.content.ContentProviderClient;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.ProviderInfo;
import android.database.Cursor;
import android.database.MatrixCursor;
import android.net.Uri;
import android.os.Build;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import android.os.SystemClock;
import android.util.Log;
import defpackage.bhl0;
import defpackage.cvk0;
import defpackage.erk0;
import defpackage.eym;
import defpackage.hm20;
import defpackage.kuk0;
import defpackage.lpl0;
import defpackage.mhf;
import defpackage.nhf;
import defpackage.pnl0;
import defpackage.rcy;
import defpackage.scy;
import defpackage.swk0;
import defpackage.w4l;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;

/* JADX INFO: loaded from: classes4.dex */
public final class DynamiteModule {
    public static Boolean e = null;
    public static String f = null;
    public static boolean g = false;
    public static int h = -1;
    public static Boolean i;
    public static pnl0 m;
    public static lpl0 n;
    public final Context a;
    public static final ThreadLocal j = new ThreadLocal();
    public static final swk0 k = new swk0();
    public static final com.google.android.gms.dynamite.a l = new com.google.android.gms.dynamite.a();
    public static final com.google.android.gms.dynamite.b b = new com.google.android.gms.dynamite.b();
    public static final c c = new c();
    public static final d d = new d();

    public static class DynamiteLoaderClassLoader {
        public static ClassLoader sClassLoader;
    }

    public static class a extends Exception {
    }

    public interface b {

        public interface a {
            int a(Context context, String str, boolean z);

            int b(Context context, String str);
        }

        /* JADX INFO: renamed from: com.google.android.gms.dynamite.DynamiteModule$b$b, reason: collision with other inner class name */
        public static class C0190b {
            public int a = 0;
            public int b = 0;
            public int c = 0;
        }

        C0190b a(Context context, String str, a aVar);
    }

    public DynamiteModule(Context context) {
        this.a = context;
    }

    public static int a(Context context, String str) {
        try {
            Class<?> clsLoadClass = context.getApplicationContext().getClassLoader().loadClass("com.google.android.gms.dynamite.descriptors." + str + ".ModuleDescriptor");
            Field declaredField = clsLoadClass.getDeclaredField("MODULE_ID");
            Field declaredField2 = clsLoadClass.getDeclaredField("MODULE_VERSION");
            if (scy.a(declaredField.get(null), str)) {
                return declaredField2.getInt(null);
            }
            Log.e("DynamiteModule", "Module descriptor id '" + String.valueOf(declaredField.get(null)) + "' didn't match expected id '" + str + "'");
            return 0;
        } catch (ClassNotFoundException unused) {
            Log.w("DynamiteModule", "Local module descriptor class for " + str + " not found.");
            return 0;
        } catch (Exception e2) {
            Log.e("DynamiteModule", "Failed to load module descriptor class: ".concat(String.valueOf(e2.getMessage())));
            return 0;
        }
    }

    /* JADX WARN: Code duplicated, block: B:116:0x025c  */
    /* JADX WARN: Code duplicated, block: B:117:0x0262  */
    /* JADX WARN: Code duplicated, block: B:120:0x026b  */
    /* JADX WARN: Code duplicated, block: B:125:0x027c A[Catch: all -> 0x0085, TryCatch #2 {all -> 0x0085, blocks: (B:7:0x004b, B:11:0x007f, B:18:0x008b, B:21:0x0091, B:24:0x00a5, B:102:0x0209, B:103:0x0210, B:106:0x0213, B:107:0x0214, B:108:0x021b, B:125:0x027c, B:126:0x028d, B:109:0x021c, B:111:0x023a, B:113:0x0248, B:123:0x0274, B:124:0x027b, B:127:0x028e, B:128:0x02ba), top: B:142:0x004b, inners: #4 }] */
    /* JADX WARN: Code duplicated, block: B:145:0x00a5 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:148:0x00d6 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:150:0x00aa A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:21:0x0091 A[Catch: all -> 0x0085, TRY_LEAVE, TryCatch #2 {all -> 0x0085, blocks: (B:7:0x004b, B:11:0x007f, B:18:0x008b, B:21:0x0091, B:24:0x00a5, B:102:0x0209, B:103:0x0210, B:106:0x0213, B:107:0x0214, B:108:0x021b, B:125:0x027c, B:126:0x028d, B:109:0x021c, B:111:0x023a, B:113:0x0248, B:123:0x0274, B:124:0x027b, B:127:0x028e, B:128:0x02ba), top: B:142:0x004b, inners: #4 }] */
    /* JADX WARN: Code duplicated, block: B:23:0x00a3 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:29:0x00b0 A[Catch: all -> 0x01fd, TryCatch #8 {, blocks: (B:27:0x00aa, B:29:0x00b0, B:30:0x00b2, B:98:0x01ff, B:99:0x0206), top: B:150:0x00aa }] */
    /* JADX WARN: Code duplicated, block: B:32:0x00b5 A[Catch: all -> 0x0114, a -> 0x0117, RemoteException -> 0x011a, TRY_ENTER, TryCatch #8 {RemoteException -> 0x011a, a -> 0x0117, all -> 0x0114, blocks: (B:26:0x00a9, B:32:0x00b5, B:34:0x00bc, B:35:0x00d5, B:39:0x00db, B:41:0x00e3, B:43:0x00e7, B:44:0x00f3, B:51:0x00fe, B:59:0x0132, B:61:0x013a, B:63:0x0142, B:64:0x0149, B:58:0x011d, B:67:0x014c, B:68:0x014d, B:69:0x0154, B:70:0x0155, B:71:0x015c, B:74:0x015f, B:75:0x0160, B:77:0x017f, B:79:0x0192, B:81:0x019a, B:87:0x01d6, B:89:0x01dc, B:90:0x01e5, B:91:0x01ec, B:82:0x01ab, B:83:0x01b2, B:85:0x01b5, B:86:0x01c6, B:92:0x01ed, B:93:0x01f4, B:94:0x01f5, B:95:0x01fc, B:101:0x0208), top: B:151:0x00a9 }] */
    /* JADX WARN: Code duplicated, block: B:34:0x00bc A[Catch: all -> 0x0114, a -> 0x0117, RemoteException -> 0x011a, TryCatch #8 {RemoteException -> 0x011a, a -> 0x0117, all -> 0x0114, blocks: (B:26:0x00a9, B:32:0x00b5, B:34:0x00bc, B:35:0x00d5, B:39:0x00db, B:41:0x00e3, B:43:0x00e7, B:44:0x00f3, B:51:0x00fe, B:59:0x0132, B:61:0x013a, B:63:0x0142, B:64:0x0149, B:58:0x011d, B:67:0x014c, B:68:0x014d, B:69:0x0154, B:70:0x0155, B:71:0x015c, B:74:0x015f, B:75:0x0160, B:77:0x017f, B:79:0x0192, B:81:0x019a, B:87:0x01d6, B:89:0x01dc, B:90:0x01e5, B:91:0x01ec, B:82:0x01ab, B:83:0x01b2, B:85:0x01b5, B:86:0x01c6, B:92:0x01ed, B:93:0x01f4, B:94:0x01f5, B:95:0x01fc, B:101:0x0208), top: B:151:0x00a9 }] */
    /* JADX WARN: Code duplicated, block: B:39:0x00db A[Catch: all -> 0x0114, a -> 0x0117, RemoteException -> 0x011a, TRY_ENTER, TryCatch #8 {RemoteException -> 0x011a, a -> 0x0117, all -> 0x0114, blocks: (B:26:0x00a9, B:32:0x00b5, B:34:0x00bc, B:35:0x00d5, B:39:0x00db, B:41:0x00e3, B:43:0x00e7, B:44:0x00f3, B:51:0x00fe, B:59:0x0132, B:61:0x013a, B:63:0x0142, B:64:0x0149, B:58:0x011d, B:67:0x014c, B:68:0x014d, B:69:0x0154, B:70:0x0155, B:71:0x015c, B:74:0x015f, B:75:0x0160, B:77:0x017f, B:79:0x0192, B:81:0x019a, B:87:0x01d6, B:89:0x01dc, B:90:0x01e5, B:91:0x01ec, B:82:0x01ab, B:83:0x01b2, B:85:0x01b5, B:86:0x01c6, B:92:0x01ed, B:93:0x01f4, B:94:0x01f5, B:95:0x01fc, B:101:0x0208), top: B:151:0x00a9 }] */
    /* JADX WARN: Code duplicated, block: B:70:0x0155 A[Catch: all -> 0x0114, a -> 0x0117, RemoteException -> 0x011a, TryCatch #8 {RemoteException -> 0x011a, a -> 0x0117, all -> 0x0114, blocks: (B:26:0x00a9, B:32:0x00b5, B:34:0x00bc, B:35:0x00d5, B:39:0x00db, B:41:0x00e3, B:43:0x00e7, B:44:0x00f3, B:51:0x00fe, B:59:0x0132, B:61:0x013a, B:63:0x0142, B:64:0x0149, B:58:0x011d, B:67:0x014c, B:68:0x014d, B:69:0x0154, B:70:0x0155, B:71:0x015c, B:74:0x015f, B:75:0x0160, B:77:0x017f, B:79:0x0192, B:81:0x019a, B:87:0x01d6, B:89:0x01dc, B:90:0x01e5, B:91:0x01ec, B:82:0x01ab, B:83:0x01b2, B:85:0x01b5, B:86:0x01c6, B:92:0x01ed, B:93:0x01f4, B:94:0x01f5, B:95:0x01fc, B:101:0x0208), top: B:151:0x00a9 }] */
    /* JADX WARN: Code duplicated, block: B:75:0x0160 A[Catch: all -> 0x0114, a -> 0x0117, RemoteException -> 0x011a, TryCatch #8 {RemoteException -> 0x011a, a -> 0x0117, all -> 0x0114, blocks: (B:26:0x00a9, B:32:0x00b5, B:34:0x00bc, B:35:0x00d5, B:39:0x00db, B:41:0x00e3, B:43:0x00e7, B:44:0x00f3, B:51:0x00fe, B:59:0x0132, B:61:0x013a, B:63:0x0142, B:64:0x0149, B:58:0x011d, B:67:0x014c, B:68:0x014d, B:69:0x0154, B:70:0x0155, B:71:0x015c, B:74:0x015f, B:75:0x0160, B:77:0x017f, B:79:0x0192, B:81:0x019a, B:87:0x01d6, B:89:0x01dc, B:90:0x01e5, B:91:0x01ec, B:82:0x01ab, B:83:0x01b2, B:85:0x01b5, B:86:0x01c6, B:92:0x01ed, B:93:0x01f4, B:94:0x01f5, B:95:0x01fc, B:101:0x0208), top: B:151:0x00a9 }] */
    /* JADX WARN: Code duplicated, block: B:77:0x017f A[Catch: all -> 0x0114, a -> 0x0117, RemoteException -> 0x011a, TryCatch #8 {RemoteException -> 0x011a, a -> 0x0117, all -> 0x0114, blocks: (B:26:0x00a9, B:32:0x00b5, B:34:0x00bc, B:35:0x00d5, B:39:0x00db, B:41:0x00e3, B:43:0x00e7, B:44:0x00f3, B:51:0x00fe, B:59:0x0132, B:61:0x013a, B:63:0x0142, B:64:0x0149, B:58:0x011d, B:67:0x014c, B:68:0x014d, B:69:0x0154, B:70:0x0155, B:71:0x015c, B:74:0x015f, B:75:0x0160, B:77:0x017f, B:79:0x0192, B:81:0x019a, B:87:0x01d6, B:89:0x01dc, B:90:0x01e5, B:91:0x01ec, B:82:0x01ab, B:83:0x01b2, B:85:0x01b5, B:86:0x01c6, B:92:0x01ed, B:93:0x01f4, B:94:0x01f5, B:95:0x01fc, B:101:0x0208), top: B:151:0x00a9 }] */
    /* JADX WARN: Code duplicated, block: B:79:0x0192 A[Catch: all -> 0x0114, a -> 0x0117, RemoteException -> 0x011a, TryCatch #8 {RemoteException -> 0x011a, a -> 0x0117, all -> 0x0114, blocks: (B:26:0x00a9, B:32:0x00b5, B:34:0x00bc, B:35:0x00d5, B:39:0x00db, B:41:0x00e3, B:43:0x00e7, B:44:0x00f3, B:51:0x00fe, B:59:0x0132, B:61:0x013a, B:63:0x0142, B:64:0x0149, B:58:0x011d, B:67:0x014c, B:68:0x014d, B:69:0x0154, B:70:0x0155, B:71:0x015c, B:74:0x015f, B:75:0x0160, B:77:0x017f, B:79:0x0192, B:81:0x019a, B:87:0x01d6, B:89:0x01dc, B:90:0x01e5, B:91:0x01ec, B:82:0x01ab, B:83:0x01b2, B:85:0x01b5, B:86:0x01c6, B:92:0x01ed, B:93:0x01f4, B:94:0x01f5, B:95:0x01fc, B:101:0x0208), top: B:151:0x00a9 }] */
    /* JADX WARN: Code duplicated, block: B:81:0x019a A[Catch: all -> 0x0114, a -> 0x0117, RemoteException -> 0x011a, TryCatch #8 {RemoteException -> 0x011a, a -> 0x0117, all -> 0x0114, blocks: (B:26:0x00a9, B:32:0x00b5, B:34:0x00bc, B:35:0x00d5, B:39:0x00db, B:41:0x00e3, B:43:0x00e7, B:44:0x00f3, B:51:0x00fe, B:59:0x0132, B:61:0x013a, B:63:0x0142, B:64:0x0149, B:58:0x011d, B:67:0x014c, B:68:0x014d, B:69:0x0154, B:70:0x0155, B:71:0x015c, B:74:0x015f, B:75:0x0160, B:77:0x017f, B:79:0x0192, B:81:0x019a, B:87:0x01d6, B:89:0x01dc, B:90:0x01e5, B:91:0x01ec, B:82:0x01ab, B:83:0x01b2, B:85:0x01b5, B:86:0x01c6, B:92:0x01ed, B:93:0x01f4, B:94:0x01f5, B:95:0x01fc, B:101:0x0208), top: B:151:0x00a9 }] */
    /* JADX WARN: Code duplicated, block: B:82:0x01ab A[Catch: all -> 0x0114, a -> 0x0117, RemoteException -> 0x011a, TryCatch #8 {RemoteException -> 0x011a, a -> 0x0117, all -> 0x0114, blocks: (B:26:0x00a9, B:32:0x00b5, B:34:0x00bc, B:35:0x00d5, B:39:0x00db, B:41:0x00e3, B:43:0x00e7, B:44:0x00f3, B:51:0x00fe, B:59:0x0132, B:61:0x013a, B:63:0x0142, B:64:0x0149, B:58:0x011d, B:67:0x014c, B:68:0x014d, B:69:0x0154, B:70:0x0155, B:71:0x015c, B:74:0x015f, B:75:0x0160, B:77:0x017f, B:79:0x0192, B:81:0x019a, B:87:0x01d6, B:89:0x01dc, B:90:0x01e5, B:91:0x01ec, B:82:0x01ab, B:83:0x01b2, B:85:0x01b5, B:86:0x01c6, B:92:0x01ed, B:93:0x01f4, B:94:0x01f5, B:95:0x01fc, B:101:0x0208), top: B:151:0x00a9 }] */
    /* JADX WARN: Code duplicated, block: B:84:0x01b3 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:85:0x01b5 A[Catch: all -> 0x0114, a -> 0x0117, RemoteException -> 0x011a, TryCatch #8 {RemoteException -> 0x011a, a -> 0x0117, all -> 0x0114, blocks: (B:26:0x00a9, B:32:0x00b5, B:34:0x00bc, B:35:0x00d5, B:39:0x00db, B:41:0x00e3, B:43:0x00e7, B:44:0x00f3, B:51:0x00fe, B:59:0x0132, B:61:0x013a, B:63:0x0142, B:64:0x0149, B:58:0x011d, B:67:0x014c, B:68:0x014d, B:69:0x0154, B:70:0x0155, B:71:0x015c, B:74:0x015f, B:75:0x0160, B:77:0x017f, B:79:0x0192, B:81:0x019a, B:87:0x01d6, B:89:0x01dc, B:90:0x01e5, B:91:0x01ec, B:82:0x01ab, B:83:0x01b2, B:85:0x01b5, B:86:0x01c6, B:92:0x01ed, B:93:0x01f4, B:94:0x01f5, B:95:0x01fc, B:101:0x0208), top: B:151:0x00a9 }] */
    /* JADX WARN: Code duplicated, block: B:86:0x01c6 A[Catch: all -> 0x0114, a -> 0x0117, RemoteException -> 0x011a, TryCatch #8 {RemoteException -> 0x011a, a -> 0x0117, all -> 0x0114, blocks: (B:26:0x00a9, B:32:0x00b5, B:34:0x00bc, B:35:0x00d5, B:39:0x00db, B:41:0x00e3, B:43:0x00e7, B:44:0x00f3, B:51:0x00fe, B:59:0x0132, B:61:0x013a, B:63:0x0142, B:64:0x0149, B:58:0x011d, B:67:0x014c, B:68:0x014d, B:69:0x0154, B:70:0x0155, B:71:0x015c, B:74:0x015f, B:75:0x0160, B:77:0x017f, B:79:0x0192, B:81:0x019a, B:87:0x01d6, B:89:0x01dc, B:90:0x01e5, B:91:0x01ec, B:82:0x01ab, B:83:0x01b2, B:85:0x01b5, B:86:0x01c6, B:92:0x01ed, B:93:0x01f4, B:94:0x01f5, B:95:0x01fc, B:101:0x0208), top: B:151:0x00a9 }] */
    /* JADX WARN: Code duplicated, block: B:89:0x01dc A[Catch: all -> 0x0114, a -> 0x0117, RemoteException -> 0x011a, TryCatch #8 {RemoteException -> 0x011a, a -> 0x0117, all -> 0x0114, blocks: (B:26:0x00a9, B:32:0x00b5, B:34:0x00bc, B:35:0x00d5, B:39:0x00db, B:41:0x00e3, B:43:0x00e7, B:44:0x00f3, B:51:0x00fe, B:59:0x0132, B:61:0x013a, B:63:0x0142, B:64:0x0149, B:58:0x011d, B:67:0x014c, B:68:0x014d, B:69:0x0154, B:70:0x0155, B:71:0x015c, B:74:0x015f, B:75:0x0160, B:77:0x017f, B:79:0x0192, B:81:0x019a, B:87:0x01d6, B:89:0x01dc, B:90:0x01e5, B:91:0x01ec, B:82:0x01ab, B:83:0x01b2, B:85:0x01b5, B:86:0x01c6, B:92:0x01ed, B:93:0x01f4, B:94:0x01f5, B:95:0x01fc, B:101:0x0208), top: B:151:0x00a9 }] */
    /* JADX WARN: Code duplicated, block: B:90:0x01e5 A[Catch: all -> 0x0114, a -> 0x0117, RemoteException -> 0x011a, TryCatch #8 {RemoteException -> 0x011a, a -> 0x0117, all -> 0x0114, blocks: (B:26:0x00a9, B:32:0x00b5, B:34:0x00bc, B:35:0x00d5, B:39:0x00db, B:41:0x00e3, B:43:0x00e7, B:44:0x00f3, B:51:0x00fe, B:59:0x0132, B:61:0x013a, B:63:0x0142, B:64:0x0149, B:58:0x011d, B:67:0x014c, B:68:0x014d, B:69:0x0154, B:70:0x0155, B:71:0x015c, B:74:0x015f, B:75:0x0160, B:77:0x017f, B:79:0x0192, B:81:0x019a, B:87:0x01d6, B:89:0x01dc, B:90:0x01e5, B:91:0x01ec, B:82:0x01ab, B:83:0x01b2, B:85:0x01b5, B:86:0x01c6, B:92:0x01ed, B:93:0x01f4, B:94:0x01f5, B:95:0x01fc, B:101:0x0208), top: B:151:0x00a9 }] */
    /* JADX WARN: Code duplicated, block: B:92:0x01ed A[Catch: all -> 0x0114, a -> 0x0117, RemoteException -> 0x011a, TryCatch #8 {RemoteException -> 0x011a, a -> 0x0117, all -> 0x0114, blocks: (B:26:0x00a9, B:32:0x00b5, B:34:0x00bc, B:35:0x00d5, B:39:0x00db, B:41:0x00e3, B:43:0x00e7, B:44:0x00f3, B:51:0x00fe, B:59:0x0132, B:61:0x013a, B:63:0x0142, B:64:0x0149, B:58:0x011d, B:67:0x014c, B:68:0x014d, B:69:0x0154, B:70:0x0155, B:71:0x015c, B:74:0x015f, B:75:0x0160, B:77:0x017f, B:79:0x0192, B:81:0x019a, B:87:0x01d6, B:89:0x01dc, B:90:0x01e5, B:91:0x01ec, B:82:0x01ab, B:83:0x01b2, B:85:0x01b5, B:86:0x01c6, B:92:0x01ed, B:93:0x01f4, B:94:0x01f5, B:95:0x01fc, B:101:0x0208), top: B:151:0x00a9 }] */
    /* JADX WARN: Code duplicated, block: B:94:0x01f5 A[Catch: all -> 0x0114, a -> 0x0117, RemoteException -> 0x011a, TryCatch #8 {RemoteException -> 0x011a, a -> 0x0117, all -> 0x0114, blocks: (B:26:0x00a9, B:32:0x00b5, B:34:0x00bc, B:35:0x00d5, B:39:0x00db, B:41:0x00e3, B:43:0x00e7, B:44:0x00f3, B:51:0x00fe, B:59:0x0132, B:61:0x013a, B:63:0x0142, B:64:0x0149, B:58:0x011d, B:67:0x014c, B:68:0x014d, B:69:0x0154, B:70:0x0155, B:71:0x015c, B:74:0x015f, B:75:0x0160, B:77:0x017f, B:79:0x0192, B:81:0x019a, B:87:0x01d6, B:89:0x01dc, B:90:0x01e5, B:91:0x01ec, B:82:0x01ab, B:83:0x01b2, B:85:0x01b5, B:86:0x01c6, B:92:0x01ed, B:93:0x01f4, B:94:0x01f5, B:95:0x01fc, B:101:0x0208), top: B:151:0x00a9 }] */
    /* JADX WARN: Code duplicated, block: B:98:0x01ff A[Catch: all -> 0x01fd, TRY_ENTER, TryCatch #8 {, blocks: (B:27:0x00aa, B:29:0x00b0, B:30:0x00b2, B:98:0x01ff, B:99:0x0206), top: B:150:0x00aa }] */
    /* JADX WARN: Instruction removed from duplicated block: B:125:0x027c, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:34:0x00bc, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:75:0x0160, please report this as an issue */
    public static DynamiteModule c(Context context, b bVar, String str) throws Throwable {
        long j2;
        DynamiteModule dynamiteModule;
        int i2;
        Boolean bool;
        pnl0 pnl0VarH;
        int i3;
        eym eymVarD;
        Object objD;
        DynamiteModule dynamiteModule2;
        bhl0 bhl0Var;
        lpl0 lpl0Var;
        bhl0 bhl0Var2;
        boolean z;
        eym eymVarD2;
        Cursor cursor;
        Context applicationContext = context.getApplicationContext();
        if (applicationContext == null) {
            throw new a("null application Context");
        }
        ThreadLocal threadLocal = j;
        bhl0 bhl0Var3 = (bhl0) threadLocal.get();
        bhl0 bhl0Var4 = new bhl0();
        threadLocal.set(bhl0Var4);
        swk0 swk0Var = k;
        Long l2 = (Long) swk0Var.get();
        long jLongValue = l2.longValue();
        try {
            swk0Var.set(Long.valueOf(SystemClock.uptimeMillis()));
            b.C0190b c0190bA = bVar.a(context, str, l);
            j2 = jLongValue;
            try {
                Log.i("DynamiteModule", "Considering local module " + str + ":" + c0190bA.a + " and remote module " + str + ":" + c0190bA.b);
                int i4 = c0190bA.c;
                if (i4 != 0) {
                    if (i4 != -1) {
                        if (i4 == 1 || c0190bA.b != 0) {
                            if (i4 == -1) {
                                Log.i("DynamiteModule", "Selected local version of ".concat(str));
                                dynamiteModule = new DynamiteModule(applicationContext);
                            } else {
                                if (i4 == 1) {
                                    throw new a("VersionPolicy returned invalid code:" + i4);
                                }
                                try {
                                    i2 = c0190bA.b;
                                    try {
                                        synchronized (DynamiteModule.class) {
                                            if (g(context)) {
                                                throw new a("Remote loading disabled");
                                            }
                                            bool = e;
                                        }
                                        if (bool != null) {
                                            throw new a("Failed to determine which loading route to use.");
                                        }
                                        if (bool.booleanValue()) {
                                            Log.i("DynamiteModule", "Selected remote version of " + str + ", version >= " + i2);
                                            synchronized (DynamiteModule.class) {
                                                lpl0Var = n;
                                            }
                                            if (lpl0Var != null) {
                                                throw new a("DynamiteLoaderV2 was not cached.");
                                            }
                                            bhl0Var2 = (bhl0) threadLocal.get();
                                            if (bhl0Var2 != null || bhl0Var2.a == null) {
                                                throw new a("No result cursor");
                                            }
                                            Context applicationContext2 = context.getApplicationContext();
                                            Cursor cursor2 = bhl0Var2.a;
                                            new rcy(null);
                                            synchronized (DynamiteModule.class) {
                                                z = h >= 2;
                                            }
                                            if (z) {
                                                Log.v("DynamiteModule", "Dynamite loader version >= 2, using loadModule2NoCrashUtils");
                                                eymVarD2 = lpl0Var.Z(new rcy(applicationContext2), str, i2, new rcy(cursor2));
                                            } else {
                                                Log.w("DynamiteModule", "Dynamite loader version < 2, falling back to loadModule2");
                                                eymVarD2 = lpl0Var.d(new rcy(applicationContext2), str, i2, new rcy(cursor2));
                                            }
                                            Context context2 = (Context) rcy.d(eymVarD2);
                                            if (context2 == null) {
                                                throw new a("Failed to get module context");
                                            }
                                            dynamiteModule2 = new DynamiteModule(context2);
                                        } else {
                                            Log.i("DynamiteModule", "Selected remote version of " + str + ", version >= " + i2);
                                            pnl0VarH = h(context);
                                            if (pnl0VarH != null) {
                                                throw new a("Failed to create IDynamiteLoader.");
                                            }
                                            Parcel parcelA = pnl0VarH.a(pnl0VarH.b(), 6);
                                            i3 = parcelA.readInt();
                                            parcelA.recycle();
                                            if (i3 >= 3) {
                                                bhl0Var = (bhl0) threadLocal.get();
                                                if (bhl0Var != null) {
                                                    throw new a("No cached result cursor holder");
                                                }
                                                eymVarD = pnl0VarH.Z(new rcy(context), str, i2, new rcy(bhl0Var.a));
                                            } else if (i3 == 2) {
                                                Log.w("DynamiteModule", "IDynamite loader version = 2");
                                                eymVarD = pnl0VarH.a0(new rcy(context), str, i2);
                                            } else {
                                                Log.w("DynamiteModule", "Dynamite loader version < 2, falling back to createModuleContext");
                                                eymVarD = pnl0VarH.d(new rcy(context), str, i2);
                                            }
                                            objD = rcy.d(eymVarD);
                                            if (objD != null) {
                                                throw new a("Failed to load remote module.");
                                            }
                                            dynamiteModule2 = new DynamiteModule((Context) objD);
                                        }
                                        dynamiteModule = dynamiteModule2;
                                    } catch (RemoteException e2) {
                                        throw new a("Failed to load remote module.", e2);
                                    } catch (a e3) {
                                        throw e3;
                                    } catch (Throwable th) {
                                        throw new a("Failed to load remote module.", th);
                                    }
                                } catch (a e4) {
                                    Log.w("DynamiteModule", "Failed to load remote module: " + e4.getMessage());
                                    int i5 = c0190bA.a;
                                    if (i5 == 0 || bVar.a(context, str, new e(i5)).c != -1) {
                                        throw new a("Remote load failed. No local fallback found.", e4);
                                    }
                                    Log.i("DynamiteModule", "Selected local version of ".concat(str));
                                    dynamiteModule = new DynamiteModule(applicationContext);
                                }
                            }
                            if (j2 == 0) {
                                k.remove();
                            } else {
                                k.set(l2);
                            }
                            cursor = bhl0Var4.a;
                            if (cursor != null) {
                                cursor.close();
                            }
                            j.set(bhl0Var3);
                            return dynamiteModule;
                        }
                    } else if (c0190bA.a != 0) {
                        i4 = -1;
                        if (i4 == 1) {
                        }
                        if (i4 == -1) {
                            Log.i("DynamiteModule", "Selected local version of ".concat(str));
                            dynamiteModule = new DynamiteModule(applicationContext);
                        } else {
                            if (i4 == 1) {
                                throw new a("VersionPolicy returned invalid code:" + i4);
                            }
                            i2 = c0190bA.b;
                            synchronized (DynamiteModule.class) {
                                if (g(context)) {
                                    throw new a("Remote loading disabled");
                                }
                                bool = e;
                                if (bool != null) {
                                    throw new a("Failed to determine which loading route to use.");
                                }
                                if (bool.booleanValue()) {
                                    Log.i("DynamiteModule", "Selected remote version of " + str + ", version >= " + i2);
                                    synchronized (DynamiteModule.class) {
                                        lpl0Var = n;
                                        if (lpl0Var != null) {
                                            throw new a("DynamiteLoaderV2 was not cached.");
                                        }
                                        bhl0Var2 = (bhl0) threadLocal.get();
                                        if (bhl0Var2 != null) {
                                        }
                                        throw new a("No result cursor");
                                    }
                                }
                                Log.i("DynamiteModule", "Selected remote version of " + str + ", version >= " + i2);
                                pnl0VarH = h(context);
                                if (pnl0VarH != null) {
                                    throw new a("Failed to create IDynamiteLoader.");
                                }
                                Parcel parcelA2 = pnl0VarH.a(pnl0VarH.b(), 6);
                                i3 = parcelA2.readInt();
                                parcelA2.recycle();
                                if (i3 >= 3) {
                                    bhl0Var = (bhl0) threadLocal.get();
                                    if (bhl0Var != null) {
                                        throw new a("No cached result cursor holder");
                                    }
                                    eymVarD = pnl0VarH.Z(new rcy(context), str, i2, new rcy(bhl0Var.a));
                                } else if (i3 == 2) {
                                    Log.w("DynamiteModule", "IDynamite loader version = 2");
                                    eymVarD = pnl0VarH.a0(new rcy(context), str, i2);
                                } else {
                                    Log.w("DynamiteModule", "Dynamite loader version < 2, falling back to createModuleContext");
                                    eymVarD = pnl0VarH.d(new rcy(context), str, i2);
                                }
                                objD = rcy.d(eymVarD);
                                if (objD != null) {
                                    throw new a("Failed to load remote module.");
                                }
                                dynamiteModule2 = new DynamiteModule((Context) objD);
                                dynamiteModule = dynamiteModule2;
                            }
                        }
                        if (j2 == 0) {
                            k.remove();
                        } else {
                            k.set(l2);
                        }
                        cursor = bhl0Var4.a;
                        if (cursor != null) {
                            cursor.close();
                        }
                        j.set(bhl0Var3);
                        return dynamiteModule;
                    }
                }
                throw new a("No acceptable module " + str + " found. Local version is " + c0190bA.a + " and remote version is " + c0190bA.b + ".");
            } catch (Throwable th2) {
                th = th2;
                if (j2 == 0) {
                    k.remove();
                } else {
                    k.set(l2);
                }
                Cursor cursor3 = bhl0Var4.a;
                if (cursor3 != null) {
                    cursor3.close();
                }
                j.set(bhl0Var3);
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            j2 = jLongValue;
        }
    }

    /* JADX WARN: Code duplicated, block: B:101:0x017f  */
    /* JADX WARN: Code duplicated, block: B:50:0x00b0 A[Catch: all -> 0x0037, TryCatch #11 {all -> 0x0037, blocks: (B:9:0x0027, B:11:0x0033, B:51:0x00b9, B:16:0x003c, B:18:0x0043, B:20:0x0049, B:25:0x0050, B:27:0x0054, B:30:0x005d, B:32:0x0065, B:35:0x006c, B:42:0x0098, B:43:0x00a0, B:38:0x0073, B:40:0x0079, B:41:0x008a, B:46:0x00a3, B:49:0x00a6, B:50:0x00b0, B:17:0x003f), top: B:147:0x0027, inners: #2 }] */
    public static int d(Context context, String str, boolean z) {
        Throwable th;
        RemoteException remoteException;
        int i2;
        Cursor cursor;
        try {
            synchronized (DynamiteModule.class) {
                Boolean bool = e;
                boolean z2 = true;
                Cursor cursor2 = null;
                if (bool == null) {
                    try {
                        Field declaredField = context.getApplicationContext().getClassLoader().loadClass(DynamiteLoaderClassLoader.class.getName()).getDeclaredField("sClassLoader");
                        synchronized (declaredField.getDeclaringClass()) {
                            try {
                                ClassLoader classLoader = (ClassLoader) declaredField.get(null);
                                if (classLoader == ClassLoader.getSystemClassLoader()) {
                                    bool = Boolean.FALSE;
                                } else if (classLoader != null) {
                                    try {
                                        f(classLoader);
                                    } catch (a unused) {
                                    }
                                    bool = Boolean.TRUE;
                                } else {
                                    if (!g(context)) {
                                        return 0;
                                    }
                                    if (g) {
                                        declaredField.set(null, ClassLoader.getSystemClassLoader());
                                        bool = Boolean.FALSE;
                                    } else {
                                        Boolean bool2 = Boolean.TRUE;
                                        if (bool2.equals(null)) {
                                            declaredField.set(null, ClassLoader.getSystemClassLoader());
                                            bool = Boolean.FALSE;
                                        } else {
                                            try {
                                                int iE = e(context, str, z, true);
                                                String str2 = f;
                                                if (str2 != null && !str2.isEmpty()) {
                                                    ClassLoader classLoaderA = erk0.a();
                                                    if (classLoaderA == null) {
                                                        if (Build.VERSION.SDK_INT >= 29) {
                                                            nhf.a();
                                                            String str3 = f;
                                                            hm20.h(str3);
                                                            classLoaderA = mhf.a(ClassLoader.getSystemClassLoader(), str3);
                                                        } else {
                                                            String str4 = f;
                                                            hm20.h(str4);
                                                            classLoaderA = new cvk0(str4, ClassLoader.getSystemClassLoader());
                                                        }
                                                    }
                                                    f(classLoaderA);
                                                    declaredField.set(null, classLoaderA);
                                                    e = bool2;
                                                    return iE;
                                                }
                                                return iE;
                                            } catch (a unused2) {
                                                declaredField.set(null, ClassLoader.getSystemClassLoader());
                                                bool = Boolean.FALSE;
                                            }
                                        }
                                    }
                                }
                                e = bool;
                            } catch (Throwable th2) {
                                throw th2;
                            }
                        }
                    } catch (ClassNotFoundException | IllegalAccessException | NoSuchFieldException e2) {
                        Log.w("DynamiteModule", "Failed to load module via V2: " + e2.toString());
                        bool = Boolean.FALSE;
                    }
                }
                if (bool.booleanValue()) {
                    try {
                        return e(context, str, z, false);
                    } catch (a e3) {
                        Log.w("DynamiteModule", "Failed to retrieve remote module version: " + e3.getMessage());
                        return 0;
                    }
                }
                pnl0 pnl0VarH = h(context);
                try {
                    if (pnl0VarH == null) {
                        return 0;
                    }
                    try {
                        Parcel parcelA = pnl0VarH.a(pnl0VarH.b(), 6);
                        int i3 = parcelA.readInt();
                        parcelA.recycle();
                        if (i3 >= 3) {
                            ThreadLocal threadLocal = j;
                            bhl0 bhl0Var = (bhl0) threadLocal.get();
                            if (bhl0Var != null && (cursor = bhl0Var.a) != null) {
                                return cursor.getInt(0);
                            }
                            Cursor cursor3 = (Cursor) rcy.d(pnl0VarH.b0(new rcy(context), str, z, ((Long) k.get()).longValue()));
                            if (cursor3 != null) {
                                try {
                                    if (cursor3.moveToFirst()) {
                                        i2 = cursor3.getInt(0);
                                        if (i2 > 0) {
                                            bhl0 bhl0Var2 = (bhl0) threadLocal.get();
                                            if (bhl0Var2 == null || bhl0Var2.a != null) {
                                                z2 = false;
                                            } else {
                                                bhl0Var2.a = cursor3;
                                            }
                                            cursor2 = z2 ? null : cursor3;
                                        }
                                        if (cursor2 != null) {
                                            cursor2.close();
                                        }
                                    }
                                } catch (RemoteException e4) {
                                    remoteException = e4;
                                    cursor2 = cursor3;
                                    Log.w("DynamiteModule", "Failed to retrieve remote module version: " + remoteException.getMessage());
                                    if (cursor2 == null) {
                                        return 0;
                                    }
                                    cursor2.close();
                                    return 0;
                                } catch (Throwable th3) {
                                    th = th3;
                                    cursor2 = cursor3;
                                    if (cursor2 == null) {
                                        throw th;
                                    }
                                    cursor2.close();
                                    throw th;
                                }
                            }
                            Log.w("DynamiteModule", "Failed to retrieve remote module version.");
                            if (cursor3 == null) {
                                return 0;
                            }
                            cursor3.close();
                            return 0;
                        }
                        if (i3 == 2) {
                            Log.w("DynamiteModule", "IDynamite loader version = 2, no high precision latency measurement.");
                            rcy rcyVar = new rcy(context);
                            Parcel parcelB = pnl0VarH.b();
                            kuk0.c(parcelB, rcyVar);
                            parcelB.writeString(str);
                            parcelB.writeInt(z ? 1 : 0);
                            Parcel parcelA2 = pnl0VarH.a(parcelB, 5);
                            i2 = parcelA2.readInt();
                            parcelA2.recycle();
                        } else {
                            Log.w("DynamiteModule", "IDynamite loader version < 2, falling back to getModuleVersion2");
                            rcy rcyVar2 = new rcy(context);
                            Parcel parcelB2 = pnl0VarH.b();
                            kuk0.c(parcelB2, rcyVar2);
                            parcelB2.writeString(str);
                            parcelB2.writeInt(z ? 1 : 0);
                            Parcel parcelA3 = pnl0VarH.a(parcelB2, 3);
                            i2 = parcelA3.readInt();
                            parcelA3.recycle();
                        }
                        return i2;
                    } catch (RemoteException e5) {
                        remoteException = e5;
                    }
                } catch (Throwable th4) {
                    th = th4;
                }
            }
        } catch (Throwable th5) {
            try {
                hm20.h(context);
                throw th5;
            } catch (Exception e6) {
                Log.e("CrashUtils", "Error adding exception to DropBox!", e6);
                throw th5;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:86:0x0137 A[PHI: r13
      0x0137: PHI (r13v6 boolean) = (r13v5 boolean), (r13v9 boolean) binds: [B:59:0x00ee, B:84:0x0134] A[DONT_GENERATE, DONT_INLINE]] */
    public static int e(Context context, String str, boolean z, boolean z2) throws Throwable {
        Exception exc;
        Throwable th;
        MatrixCursor matrixCursor;
        boolean z3;
        MatrixCursor matrixCursor2 = null;
        try {
            try {
                boolean z4 = true;
                Uri uriBuild = new Uri.Builder().scheme("content").authority("com.google.android.gms.chimera").path(true != z ? "api" : "api_force_staging").appendPath(str).appendQueryParameter("requestStartUptime", String.valueOf(((Long) k.get()).longValue())).build();
                ContentProviderClient contentProviderClientAcquireUnstableContentProviderClient = context.getContentResolver().acquireUnstableContentProviderClient(uriBuild);
                boolean z5 = false;
                if (contentProviderClientAcquireUnstableContentProviderClient == null) {
                    matrixCursor = null;
                } else {
                    try {
                        Cursor cursorQuery = contentProviderClientAcquireUnstableContentProviderClient.query(uriBuild, null, null, null, null);
                        if (cursorQuery == null) {
                            contentProviderClientAcquireUnstableContentProviderClient.release();
                            matrixCursor = null;
                        } else {
                            try {
                                int count = cursorQuery.getCount();
                                int columnCount = cursorQuery.getColumnCount();
                                matrixCursor = new MatrixCursor(cursorQuery.getColumnNames(), count);
                                for (int i2 = 0; i2 < count; i2++) {
                                    if (!cursorQuery.moveToPosition(i2)) {
                                        throw new RemoteException("Cursor read incomplete (ContentProvider dead?)");
                                    }
                                    Object[] objArr = new Object[columnCount];
                                    for (int i3 = 0; i3 < columnCount; i3++) {
                                        int type = cursorQuery.getType(i3);
                                        if (type == 0) {
                                            objArr[i3] = null;
                                        } else if (type == 1) {
                                            objArr[i3] = Long.valueOf(cursorQuery.getLong(i3));
                                        } else if (type == 2) {
                                            objArr[i3] = Double.valueOf(cursorQuery.getDouble(i3));
                                        } else if (type == 3) {
                                            objArr[i3] = cursorQuery.getString(i3);
                                        } else {
                                            if (type != 4) {
                                                throw new RemoteException("Unknown column type");
                                            }
                                            objArr[i3] = cursorQuery.getBlob(i3);
                                        }
                                    }
                                    matrixCursor.addRow(objArr);
                                }
                                cursorQuery.close();
                                contentProviderClientAcquireUnstableContentProviderClient.release();
                            } catch (Throwable th2) {
                                try {
                                    cursorQuery.close();
                                    throw th2;
                                } catch (Throwable th3) {
                                    th2.addSuppressed(th3);
                                    throw th2;
                                }
                            }
                        }
                    } catch (RemoteException unused) {
                    } catch (Throwable th4) {
                        contentProviderClientAcquireUnstableContentProviderClient.release();
                        throw th4;
                    }
                }
                if (matrixCursor != null) {
                    try {
                        if (matrixCursor.moveToFirst()) {
                            int i4 = matrixCursor.getInt(0);
                            if (i4 > 0) {
                                synchronized (DynamiteModule.class) {
                                    try {
                                        f = matrixCursor.getString(2);
                                        int columnIndex = matrixCursor.getColumnIndex("loaderVersion");
                                        if (columnIndex >= 0) {
                                            h = matrixCursor.getInt(columnIndex);
                                        }
                                        int columnIndex2 = matrixCursor.getColumnIndex("disableStandaloneDynamiteLoader2");
                                        if (columnIndex2 >= 0) {
                                            z3 = matrixCursor.getInt(columnIndex2) != 0;
                                            g = z3;
                                        } else {
                                            z3 = false;
                                        }
                                    } catch (Throwable th5) {
                                        throw th5;
                                    }
                                }
                                bhl0 bhl0Var = (bhl0) j.get();
                                if (bhl0Var == null || bhl0Var.a != null) {
                                    z4 = false;
                                } else {
                                    bhl0Var.a = matrixCursor;
                                }
                                z5 = z3;
                                matrixCursor2 = z4 ? null : matrixCursor;
                            }
                            if (z2 && z5) {
                                throw new a("forcing fallback to container DynamiteLoader impl");
                            }
                            if (matrixCursor2 != null) {
                                matrixCursor2.close();
                            }
                            return i4;
                        }
                    } catch (Exception e2) {
                        exc = e2;
                        if (exc instanceof a) {
                            throw exc;
                        }
                        throw new a("V2 version check failed: " + exc.getMessage(), exc);
                    } catch (Throwable th6) {
                        th = th6;
                        matrixCursor2 = matrixCursor;
                        if (matrixCursor2 == null) {
                            throw th;
                        }
                        matrixCursor2.close();
                        throw th;
                    }
                }
                Log.w("DynamiteModule", "Failed to retrieve remote module version.");
                throw new a("Failed to connect to dynamite module ContentResolver.");
            } catch (Throwable th7) {
                th = th7;
            }
        } catch (Exception e3) {
            exc = e3;
        }
    }

    public static void f(ClassLoader classLoader) throws a {
        try {
            lpl0 lpl0Var = null;
            IBinder iBinder = (IBinder) classLoader.loadClass("com.google.android.gms.dynamiteloader.DynamiteLoaderV2").getConstructor(null).newInstance(null);
            if (iBinder != null) {
                IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.dynamite.IDynamiteLoaderV2");
                lpl0Var = iInterfaceQueryLocalInterface instanceof lpl0 ? (lpl0) iInterfaceQueryLocalInterface : new lpl0(iBinder, "com.google.android.gms.dynamite.IDynamiteLoaderV2");
            }
            n = lpl0Var;
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException | NoSuchMethodException | InvocationTargetException e2) {
            throw new a("Failed to instantiate dynamite loader", e2);
        }
    }

    public static boolean g(Context context) {
        ApplicationInfo applicationInfo;
        Boolean bool = Boolean.TRUE;
        if (bool.equals(null) || bool.equals(i)) {
            return true;
        }
        boolean z = false;
        if (i == null) {
            ProviderInfo providerInfoResolveContentProvider = context.getPackageManager().resolveContentProvider("com.google.android.gms.chimera", Build.VERSION.SDK_INT >= 29 ? 268435456 : 0);
            if (w4l.b.c(context, 10000000) == 0 && providerInfoResolveContentProvider != null && "com.google.android.gms".equals(providerInfoResolveContentProvider.packageName)) {
                z = true;
            }
            i = Boolean.valueOf(z);
            if (z && (applicationInfo = providerInfoResolveContentProvider.applicationInfo) != null && (applicationInfo.flags & 129) == 0) {
                Log.i("DynamiteModule", "Non-system-image GmsCore APK, forcing V1");
                g = true;
            }
        }
        if (!z) {
            Log.e("DynamiteModule", "Invalid GmsCore APK, remote loading disabled.");
        }
        return z;
    }

    public static pnl0 h(Context context) {
        pnl0 pnl0Var;
        synchronized (DynamiteModule.class) {
            pnl0 pnl0Var2 = m;
            if (pnl0Var2 != null) {
                return pnl0Var2;
            }
            try {
                IBinder iBinder = (IBinder) context.createPackageContext("com.google.android.gms", 3).getClassLoader().loadClass("com.google.android.gms.chimera.container.DynamiteLoaderImpl").newInstance();
                if (iBinder == null) {
                    pnl0Var = null;
                } else {
                    IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.dynamite.IDynamiteLoader");
                    pnl0Var = iInterfaceQueryLocalInterface instanceof pnl0 ? (pnl0) iInterfaceQueryLocalInterface : new pnl0(iBinder, "com.google.android.gms.dynamite.IDynamiteLoader");
                }
                if (pnl0Var != null) {
                    m = pnl0Var;
                    return pnl0Var;
                }
            } catch (Exception e2) {
                Log.e("DynamiteModule", "Failed to load IDynamiteLoader from GmsCore: " + e2.getMessage());
            }
            return null;
        }
    }

    public final IBinder b(String str) throws a {
        try {
            return (IBinder) this.a.getClassLoader().loadClass(str).newInstance();
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException e2) {
            throw new a("Failed to instantiate module class: ".concat(str), e2);
        }
    }
}
