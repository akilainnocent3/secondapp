package androidx.room;

import a9.e0;
import a9.h1;
import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.os.RemoteCallbackList;
import android.os.RemoteException;
import android.util.Log;
import dr.w2;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.m0;
import oy.l;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes2.dex */
@e0
public final class MultiInstanceInvalidationService extends Service {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f19110b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @l
    public final Map<Integer, String> f19111c = new LinkedHashMap();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @l
    public final RemoteCallbackList<androidx.room.a> f19112d = new b();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @l
    public final androidx.room.b.AbstractBinderC0156b f19113e = new a();

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class a extends androidx.room.b.AbstractBinderC0156b {
        public a() {
        }

        @Override // androidx.room.b
        public void J2(androidx.room.a callback, int i10) {
            m0.p(callback, "callback");
            RemoteCallbackList<androidx.room.a> remoteCallbackListA = MultiInstanceInvalidationService.this.a();
            MultiInstanceInvalidationService multiInstanceInvalidationService = MultiInstanceInvalidationService.this;
            synchronized (remoteCallbackListA) {
                multiInstanceInvalidationService.a().unregister(callback);
                multiInstanceInvalidationService.b().remove(Integer.valueOf(i10));
            }
        }

        @Override // androidx.room.b
        public void M1(int i10, String[] tables) {
            m0.p(tables, "tables");
            RemoteCallbackList<androidx.room.a> remoteCallbackListA = MultiInstanceInvalidationService.this.a();
            MultiInstanceInvalidationService multiInstanceInvalidationService = MultiInstanceInvalidationService.this;
            synchronized (remoteCallbackListA) {
                try {
                    String str = multiInstanceInvalidationService.b().get(Integer.valueOf(i10));
                    if (str == null) {
                        Log.w(h1.f4135b, "Remote invalidation client ID not registered");
                        return;
                    }
                    int iBeginBroadcast = multiInstanceInvalidationService.a().beginBroadcast();
                    for (int i11 = 0; i11 < iBeginBroadcast; i11++) {
                        try {
                            Object broadcastCookie = multiInstanceInvalidationService.a().getBroadcastCookie(i11);
                            m0.n(broadcastCookie, "null cannot be cast to non-null type kotlin.Int");
                            Integer num = (Integer) broadcastCookie;
                            int iIntValue = num.intValue();
                            String str2 = multiInstanceInvalidationService.b().get(num);
                            if (i10 != iIntValue && m0.g(str, str2)) {
                                try {
                                    ((androidx.room.a) multiInstanceInvalidationService.a().getBroadcastItem(i11)).G(tables);
                                    w2 w2Var = w2.f79517a;
                                } catch (RemoteException e10) {
                                    Log.w(h1.f4135b, "Error invoking a remote callback", e10);
                                }
                            }
                        } catch (Throwable th2) {
                            multiInstanceInvalidationService.a().finishBroadcast();
                            throw th2;
                        }
                    }
                    multiInstanceInvalidationService.a().finishBroadcast();
                    w2 w2Var2 = w2.f79517a;
                } catch (Throwable th3) {
                    throw th3;
                }
            }
        }

        @Override // androidx.room.b
        public int e2(androidx.room.a callback, String str) {
            m0.p(callback, "callback");
            int i10 = 0;
            if (str == null) {
                return 0;
            }
            RemoteCallbackList<androidx.room.a> remoteCallbackListA = MultiInstanceInvalidationService.this.a();
            MultiInstanceInvalidationService multiInstanceInvalidationService = MultiInstanceInvalidationService.this;
            synchronized (remoteCallbackListA) {
                try {
                    multiInstanceInvalidationService.d(multiInstanceInvalidationService.c() + 1);
                    int iC = multiInstanceInvalidationService.c();
                    if (multiInstanceInvalidationService.a().register(callback, Integer.valueOf(iC))) {
                        multiInstanceInvalidationService.b().put(Integer.valueOf(iC), str);
                        i10 = iC;
                    } else {
                        multiInstanceInvalidationService.d(multiInstanceInvalidationService.c() - 1);
                        multiInstanceInvalidationService.c();
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return i10;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class b extends RemoteCallbackList<androidx.room.a> {
        public b() {
        }

        @Override // android.os.RemoteCallbackList
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onCallbackDied(androidx.room.a callback, Object cookie) {
            m0.p(callback, "callback");
            m0.p(cookie, "cookie");
            MultiInstanceInvalidationService.this.b().remove((Integer) cookie);
        }
    }

    @l
    public final RemoteCallbackList<androidx.room.a> a() {
        return this.f19112d;
    }

    @l
    public final Map<Integer, String> b() {
        return this.f19111c;
    }

    public final int c() {
        return this.f19110b;
    }

    public final void d(int i10) {
        this.f19110b = i10;
    }

    @Override // android.app.Service
    @l
    public IBinder onBind(@l Intent intent) {
        m0.p(intent, "intent");
        return this.f19113e;
    }
}
