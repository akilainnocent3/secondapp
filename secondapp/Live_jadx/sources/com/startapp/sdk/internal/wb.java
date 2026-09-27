package com.startapp.sdk.internal;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.Uri;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
public final class wb {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final Object f75785f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static wb f75786g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f75787a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final HashMap f75788b = new HashMap();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final HashMap f75789c = new HashMap();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ArrayList f75790d = new ArrayList();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final tb f75791e;

    static {
        int i10 = p0.f75355a;
        "startapp.".concat(wb.class.getSimpleName());
        f75785f = new Object();
    }

    public wb(Context context) {
        this.f75787a = context;
        this.f75791e = new tb(this, context.getMainLooper());
    }

    public static wb a(Context context) {
        wb wbVar;
        synchronized (f75785f) {
            try {
                if (f75786g == null) {
                    Context contextA = w0.a(context);
                    if (contextA != null) {
                        context = contextA;
                    }
                    f75786g = new wb(context);
                }
                wbVar = f75786g;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return wbVar;
    }

    public final void a(BroadcastReceiver broadcastReceiver, IntentFilter intentFilter) {
        synchronized (this.f75788b) {
            try {
                vb vbVar = new vb(broadcastReceiver, intentFilter);
                ArrayList arrayList = (ArrayList) this.f75788b.get(broadcastReceiver);
                if (arrayList == null) {
                    arrayList = new ArrayList(1);
                    this.f75788b.put(broadcastReceiver, arrayList);
                }
                arrayList.add(intentFilter);
                for (int i10 = 0; i10 < intentFilter.countActions(); i10++) {
                    String action = intentFilter.getAction(i10);
                    ArrayList arrayList2 = (ArrayList) this.f75789c.get(action);
                    if (arrayList2 == null) {
                        arrayList2 = new ArrayList(1);
                        this.f75789c.put(action, arrayList2);
                    }
                    arrayList2.add(vbVar);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void a(BroadcastReceiver broadcastReceiver) {
        synchronized (this.f75788b) {
            try {
                ArrayList arrayList = (ArrayList) this.f75788b.remove(broadcastReceiver);
                if (arrayList == null) {
                    return;
                }
                for (int i10 = 0; i10 < arrayList.size(); i10++) {
                    IntentFilter intentFilter = (IntentFilter) arrayList.get(i10);
                    for (int i11 = 0; i11 < intentFilter.countActions(); i11++) {
                        String action = intentFilter.getAction(i11);
                        ArrayList arrayList2 = (ArrayList) this.f75789c.get(action);
                        if (arrayList2 != null) {
                            int i12 = 0;
                            while (i12 < arrayList2.size()) {
                                if (((vb) arrayList2.get(i12)).f75700b == broadcastReceiver) {
                                    arrayList2.remove(i12);
                                    i12--;
                                }
                                i12++;
                            }
                            if (arrayList2.size() <= 0) {
                                this.f75789c.remove(action);
                            }
                        }
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void a(Intent intent) {
        synchronized (this.f75788b) {
            try {
                String action = intent.getAction();
                String strResolveTypeIfNeeded = intent.resolveTypeIfNeeded(this.f75787a.getContentResolver());
                Uri data = intent.getData();
                String scheme = intent.getScheme();
                Set<String> categories = intent.getCategories();
                ArrayList arrayList = (ArrayList) this.f75789c.get(intent.getAction());
                if (arrayList != null) {
                    ArrayList arrayList2 = null;
                    for (int i10 = 0; i10 < arrayList.size(); i10++) {
                        vb vbVar = (vb) arrayList.get(i10);
                        if (!vbVar.f75701c && vbVar.f75699a.match(action, strResolveTypeIfNeeded, scheme, data, categories, "LocalBroadcastManager") >= 0) {
                            if (arrayList2 == null) {
                                arrayList2 = new ArrayList();
                            }
                            arrayList2.add(vbVar);
                            vbVar.f75701c = true;
                        }
                    }
                    if (arrayList2 != null) {
                        for (int i11 = 0; i11 < arrayList2.size(); i11++) {
                            ((vb) arrayList2.get(i11)).f75701c = false;
                        }
                        this.f75790d.add(new ub(intent, arrayList2));
                        if (!this.f75791e.hasMessages(1)) {
                            this.f75791e.sendEmptyMessage(1);
                        }
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
