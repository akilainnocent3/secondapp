package defpackage;

import android.content.ContentProviderClient;
import android.content.ContentResolver;
import android.database.Cursor;
import android.database.sqlite.SQLiteException;
import android.net.Uri;
import android.os.Binder;
import android.os.RemoteException;
import android.os.StrictMode;
import android.util.Log;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.function.Function;

/* JADX INFO: loaded from: classes4.dex */
public final class ubl0 {
    public static final ConcurrentHashMap i = new ConcurrentHashMap();
    public static final String[] j = {"key", "value"};
    public final ContentResolver a;
    public final Uri b;
    public final Runnable c;
    public volatile Map g;
    public pbl0 d = null;
    public volatile boolean e = true;
    public final Object f = new Object();
    public final ArrayList h = new ArrayList();

    public ubl0(ContentResolver contentResolver, Uri uri, Runnable runnable) {
        contentResolver.getClass();
        uri.getClass();
        this.a = contentResolver;
        this.b = uri;
        this.c = runnable;
    }

    public static ubl0 a(final ContentResolver contentResolver, final Uri uri, final Runnable runnable) {
        ubl0 ubl0Var = (ubl0) i.computeIfAbsent(uri, new Function() { // from class: sbl0
            @Override // java.util.function.Function
            public final /* synthetic */ Object apply(Object obj) {
                return new ubl0(contentResolver, uri, runnable);
            }
        });
        try {
            if (!ubl0Var.e) {
                return ubl0Var;
            }
            synchronized (ubl0Var) {
                try {
                    if (ubl0Var.e) {
                        pbl0 pbl0Var = new pbl0(ubl0Var);
                        ubl0Var.a.registerContentObserver(ubl0Var.b, false, pbl0Var);
                        ubl0Var.d = pbl0Var;
                        ubl0Var.e = false;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            return ubl0Var;
        } catch (SecurityException unused) {
            return null;
        }
    }

    public static void c() {
        Iterator it = i.values().iterator();
        while (it.hasNext()) {
            ubl0 ubl0Var = (ubl0) it.next();
            synchronized (ubl0Var) {
                try {
                    if (ubl0Var.e) {
                        ubl0Var.e = false;
                    } else {
                        pbl0 pbl0Var = ubl0Var.d;
                        if (pbl0Var != null) {
                            ubl0Var.a.unregisterContentObserver(pbl0Var);
                            ubl0Var.d = null;
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            it.remove();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r0v2, types: [android.os.StrictMode$ThreadPolicy, java.util.Map] */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v7 */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference failed for: r2v6, types: [qbl0] */
    public final Map b() {
        Map map;
        ?? r0;
        Object objA;
        Map map2 = this.g;
        ?? r1 = map2;
        if (map2 == null) {
            synchronized (this.f) {
                ?? r2 = this.g;
                r0 = r2;
                if (r2 == 0) {
                    try {
                        StrictMode.ThreadPolicy threadPolicyAllowThreadDiskReads = StrictMode.allowThreadDiskReads();
                        try {
                            try {
                                ?? r3 = new Object() { // from class: qbl0
                                    public final Object a() {
                                        ubl0 ubl0Var = this.a;
                                        ContentResolver contentResolver = ubl0Var.a;
                                        Uri uri = ubl0Var.b;
                                        ContentProviderClient contentProviderClientAcquireUnstableContentProviderClient = contentResolver.acquireUnstableContentProviderClient(uri);
                                        try {
                                            if (contentProviderClientAcquireUnstableContentProviderClient == null) {
                                                Log.w("ConfigurationContentLdr", "Unable to acquire ContentProviderClient, using default values");
                                                return Collections.EMPTY_MAP;
                                            }
                                            try {
                                                Cursor cursorQuery = contentProviderClientAcquireUnstableContentProviderClient.query(uri, ubl0.j, null, null, null);
                                                try {
                                                    if (cursorQuery == null) {
                                                        Log.w("ConfigurationContentLdr", "ContentProvider query returned null cursor, using default values");
                                                        Map map3 = Collections.EMPTY_MAP;
                                                        contentProviderClientAcquireUnstableContentProviderClient.release();
                                                        return map3;
                                                    }
                                                    int count = cursorQuery.getCount();
                                                    if (count == 0) {
                                                        Map map4 = Collections.EMPTY_MAP;
                                                        cursorQuery.close();
                                                        contentProviderClientAcquireUnstableContentProviderClient.release();
                                                        return map4;
                                                    }
                                                    Map ox0Var = count <= 256 ? new ox0(count) : new HashMap(count, 1.0f);
                                                    while (cursorQuery.moveToNext()) {
                                                        ox0Var.put(cursorQuery.getString(0), cursorQuery.getString(1));
                                                    }
                                                    if (cursorQuery.isAfterLast()) {
                                                        cursorQuery.close();
                                                        contentProviderClientAcquireUnstableContentProviderClient.release();
                                                        return ox0Var;
                                                    }
                                                    Log.w("ConfigurationContentLdr", "Cursor read incomplete (ContentProvider dead?), using default values");
                                                    Map map5 = Collections.EMPTY_MAP;
                                                    cursorQuery.close();
                                                    contentProviderClientAcquireUnstableContentProviderClient.release();
                                                    return map5;
                                                } catch (Throwable th) {
                                                    if (cursorQuery == null) {
                                                        throw th;
                                                    }
                                                    try {
                                                        cursorQuery.close();
                                                        throw th;
                                                    } catch (Throwable th2) {
                                                        th.addSuppressed(th2);
                                                        throw th;
                                                    }
                                                }
                                            } catch (RemoteException e) {
                                                Log.w("ConfigurationContentLdr", "ContentProvider query failed, using default values", e);
                                                Map map6 = Collections.EMPTY_MAP;
                                                contentProviderClientAcquireUnstableContentProviderClient.release();
                                                return map6;
                                            }
                                        } catch (Throwable th3) {
                                            contentProviderClientAcquireUnstableContentProviderClient.release();
                                            throw th3;
                                        }
                                    }
                                };
                                try {
                                    objA = r3.a();
                                } catch (SecurityException unused) {
                                    long jClearCallingIdentity = Binder.clearCallingIdentity();
                                    try {
                                        objA = r3.a();
                                        Binder.restoreCallingIdentity(jClearCallingIdentity);
                                    } catch (Throwable th) {
                                        Binder.restoreCallingIdentity(jClearCallingIdentity);
                                        throw th;
                                    }
                                }
                                map = (Map) objA;
                            } catch (SecurityException e) {
                                e = e;
                                Log.w("ConfigurationContentLdr", "Unable to query ContentProvider, using default values", e);
                                map = Collections.EMPTY_MAP;
                            }
                        } catch (SQLiteException e2) {
                            e = e2;
                            Log.w("ConfigurationContentLdr", "Unable to query ContentProvider, using default values", e);
                            map = Collections.EMPTY_MAP;
                        } catch (IllegalStateException e3) {
                            e = e3;
                            Log.w("ConfigurationContentLdr", "Unable to query ContentProvider, using default values", e);
                            map = Collections.EMPTY_MAP;
                        }
                        StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
                        this.g = map;
                        r0 = map;
                    } catch (Throwable th2) {
                        StrictMode.setThreadPolicy(r2);
                        throw th2;
                    }
                }
            }
            r1 = r0;
        }
        return r1 != 0 ? r1 : Collections.EMPTY_MAP;
    }
}
