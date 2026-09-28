package defpackage;

import android.content.ContentProviderClient;
import android.content.ContentResolver;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.os.Binder;
import android.os.Process;
import android.os.RemoteException;
import android.os.UserManager;
import android.util.Log;
import com.sporty.android.permission.location.KN.qUnCRF;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes4.dex */
public final class gcl0 {
    public static gcl0 d;
    public final Context a;
    public final ccl0 b;
    public boolean c;

    public gcl0(Context context) {
        this.c = false;
        this.a = context;
        this.b = new ccl0(null);
    }

    public static gcl0 a(Context context) {
        gcl0 gcl0Var;
        synchronized (gcl0.class) {
            try {
                gcl0 gcl0Var2 = d;
                if (gcl0Var2 == null) {
                    gcl0Var2 = be00.a(context, "com.google.android.providers.gsf.permission.READ_GSERVICES") == 0 ? new gcl0(context) : new gcl0();
                    d = gcl0Var2;
                }
                if (gcl0Var2.b != null && !gcl0Var2.c) {
                    try {
                        context.getContentResolver().registerContentObserver(abl0.a, true, d.b);
                        gcl0 gcl0Var3 = d;
                        gcl0Var3.getClass();
                        gcl0Var3.c = true;
                    } catch (SecurityException e) {
                        Log.e("GservicesLoader", "Unable to register Gservices content observer", e);
                    }
                }
                gcl0Var = d;
                gcl0Var.getClass();
            } catch (Throwable th) {
                throw th;
            }
        }
        return gcl0Var;
    }

    /* JADX WARN: Code duplicated, block: B:33:0x0054 A[Catch: all -> 0x0014, TryCatch #2 {all -> 0x0014, blocks: (B:9:0x000e, B:11:0x0012, B:18:0x001c, B:20:0x0020, B:33:0x0054, B:34:0x0056, B:23:0x002e, B:25:0x0034, B:29:0x0041, B:31:0x0050), top: B:63:0x000e, inners: #3 }] */
    /* JADX WARN: Type inference failed for: r0v3, types: [ecl0] */
    public final String b(final String str) {
        Object objA;
        Context context = this.a;
        if (context != null) {
            boolean z = true;
            if (!mbl0.b) {
                synchronized (mbl0.class) {
                    try {
                        if (!mbl0.b) {
                            int i = 1;
                            while (true) {
                                boolean z2 = false;
                                if (i <= 2) {
                                    UserManager userManager = mbl0.a;
                                    if (userManager == null) {
                                        userManager = (UserManager) context.getSystemService(UserManager.class);
                                        mbl0.a = userManager;
                                    }
                                    if (userManager == null) {
                                        z2 = true;
                                    } else {
                                        try {
                                            if (userManager.isUserUnlocked() || !userManager.isUserRunning(Process.myUserHandle())) {
                                                z2 = true;
                                            }
                                        } catch (NullPointerException e) {
                                            Log.w("DirectBootUtils", qUnCRF.rTWAaPtbXsFP, e);
                                            mbl0.a = null;
                                            i++;
                                        }
                                    }
                                    if (z2) {
                                        mbl0.b = true;
                                    }
                                    z = z2;
                                }
                                if (z2) {
                                    mbl0.a = null;
                                }
                                if (z2) {
                                    mbl0.b = true;
                                }
                                z = z2;
                            }
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
            if (z) {
                try {
                    try {
                        ?? r0 = new Object() { // from class: ecl0
                            public final Object a() {
                                String string;
                                gcl0 gcl0Var = this.a;
                                String str2 = str;
                                Context context2 = gcl0Var.a;
                                context2.getClass();
                                ContentResolver contentResolver = context2.getContentResolver();
                                kbl0 kbl0Var = (kbl0) yal0.a;
                                String str3 = null;
                                if (contentResolver == null) {
                                    kbl0Var.getClass();
                                    ib5.a("ContentResolver needed with GservicesDelegateSupplier.init()");
                                    return null;
                                }
                                synchronized (kbl0Var) {
                                    try {
                                        HashMap map = kbl0Var.b;
                                        AtomicBoolean atomicBoolean = kbl0Var.a;
                                        if (map == null) {
                                            atomicBoolean.set(false);
                                            kbl0Var.b = new HashMap(16, 1.0f);
                                            kbl0Var.g = new Object();
                                            contentResolver.registerContentObserver(abl0.a, true, new gbl0(kbl0Var));
                                        } else if (atomicBoolean.getAndSet(false)) {
                                            kbl0Var.b.clear();
                                            kbl0Var.c.clear();
                                            kbl0Var.d.clear();
                                            kbl0Var.e.clear();
                                            kbl0Var.f.clear();
                                            kbl0Var.g = new Object();
                                        }
                                        Object obj = kbl0Var.g;
                                        if (kbl0Var.b.containsKey(str2)) {
                                            String str4 = (String) kbl0Var.b.get(str2);
                                            if (str4 != null) {
                                                str3 = str4;
                                            }
                                            return str3;
                                        }
                                        try {
                                            Uri uri = abl0.a;
                                            ContentProviderClient contentProviderClientAcquireUnstableContentProviderClient = contentResolver.acquireUnstableContentProviderClient(uri);
                                            try {
                                                if (contentProviderClientAcquireUnstableContentProviderClient == null) {
                                                    throw new ibl0("Unable to acquire ContentProviderClient");
                                                }
                                                try {
                                                    Cursor cursorQuery = contentProviderClientAcquireUnstableContentProviderClient.query(uri, null, null, new String[]{str2}, null);
                                                    try {
                                                        if (cursorQuery == null) {
                                                            throw new ibl0("ContentProvider query returned null cursor");
                                                        }
                                                        if (cursorQuery.moveToFirst()) {
                                                            string = cursorQuery.getString(1);
                                                            cursorQuery.close();
                                                            contentProviderClientAcquireUnstableContentProviderClient.release();
                                                        } else {
                                                            cursorQuery.close();
                                                            contentProviderClientAcquireUnstableContentProviderClient.release();
                                                            string = null;
                                                        }
                                                        if (string != null && string.equals(null)) {
                                                            string = null;
                                                        }
                                                        synchronized (kbl0Var) {
                                                            try {
                                                                if (obj == kbl0Var.g) {
                                                                    kbl0Var.b.put(str2, string);
                                                                }
                                                            } catch (Throwable th2) {
                                                                throw th2;
                                                            }
                                                        }
                                                        if (string != null) {
                                                            return string;
                                                        }
                                                        return null;
                                                    } catch (Throwable th3) {
                                                        if (cursorQuery == null) {
                                                            throw th3;
                                                        }
                                                        try {
                                                            cursorQuery.close();
                                                            throw th3;
                                                        } catch (Throwable th4) {
                                                            th3.addSuppressed(th4);
                                                            throw th3;
                                                        }
                                                    }
                                                } catch (RemoteException e2) {
                                                    throw new ibl0("ContentProvider query failed", e2);
                                                }
                                            } catch (Throwable th5) {
                                                contentProviderClientAcquireUnstableContentProviderClient.release();
                                                throw th5;
                                            }
                                        } catch (ibl0 unused) {
                                        }
                                    } catch (Throwable th6) {
                                        throw th6;
                                    }
                                }
                            }
                        };
                        try {
                            objA = r0.a();
                        } catch (SecurityException unused) {
                            long jClearCallingIdentity = Binder.clearCallingIdentity();
                            try {
                                objA = r0.a();
                            } finally {
                                Binder.restoreCallingIdentity(jClearCallingIdentity);
                            }
                        }
                        return (String) objA;
                    } catch (SecurityException e2) {
                        e = e2;
                        Log.e("GservicesLoader", "Unable to read GServices for: ".concat(str), e);
                        return null;
                    }
                } catch (IllegalStateException e3) {
                    e = e3;
                    Log.e("GservicesLoader", "Unable to read GServices for: ".concat(str), e);
                    return null;
                } catch (NullPointerException e4) {
                    e = e4;
                    Log.e("GservicesLoader", "Unable to read GServices for: ".concat(str), e);
                    return null;
                }
            }
        }
        return null;
    }

    public gcl0() {
        this.c = false;
        this.a = null;
        this.b = null;
    }
}
