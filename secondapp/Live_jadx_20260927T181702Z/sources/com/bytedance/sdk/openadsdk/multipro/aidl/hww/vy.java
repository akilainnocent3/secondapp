package com.bytedance.sdk.openadsdk.multipro.aidl.hww;

import android.os.RemoteCallbackList;
import android.os.RemoteException;
import android.text.TextUtils;
import com.bytedance.sdk.component.utils.omn;
import com.bytedance.sdk.openadsdk.IDislikeClosedListener;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public class vy extends hww {
    public static ConcurrentHashMap<String, RemoteCallbackList<IDislikeClosedListener>> hww = new ConcurrentHashMap<>();

    /* JADX INFO: renamed from: tq, reason: collision with root package name */
    private static volatile vy f37488tq;

    public static vy hww() {
        if (f37488tq == null) {
            synchronized (vy.class) {
                try {
                    if (f37488tq == null) {
                        f37488tq = new vy();
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return f37488tq;
    }

    @Override // com.bytedance.sdk.openadsdk.multipro.aidl.hww.hww, com.bytedance.sdk.openadsdk.IListenerManager
    public void executeDisLikeClosedCallback(String str, String str2) throws RemoteException {
        hww(str, str2);
    }

    @Override // com.bytedance.sdk.openadsdk.multipro.aidl.hww.hww, com.bytedance.sdk.openadsdk.IListenerManager
    public synchronized void registerDisLikeClosedListener(String str, IDislikeClosedListener iDislikeClosedListener) throws RemoteException {
        RemoteCallbackList<IDislikeClosedListener> remoteCallbackList = new RemoteCallbackList<>();
        remoteCallbackList.register(iDislikeClosedListener);
        hww.put(str, remoteCallbackList);
    }

    @Override // com.bytedance.sdk.openadsdk.multipro.aidl.hww.hww, com.bytedance.sdk.openadsdk.IListenerManager
    public void unregisterDisLikeClosedListener(String str) throws RemoteException {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        hww.remove(str);
    }

    private synchronized void hww(String str, String str2) {
        RemoteCallbackList<IDislikeClosedListener> remoteCallbackList;
        try {
            ConcurrentHashMap<String, RemoteCallbackList<IDislikeClosedListener>> concurrentHashMap = hww;
            if (concurrentHashMap != null && (remoteCallbackList = concurrentHashMap.get(str)) != null) {
                int iBeginBroadcast = remoteCallbackList.beginBroadcast();
                for (int i10 = 0; i10 < iBeginBroadcast; i10++) {
                    try {
                        IDislikeClosedListener iDislikeClosedListener = (IDislikeClosedListener) remoteCallbackList.getBroadcastItem(i10);
                        if (iDislikeClosedListener != null && "onItemClickClosed".equals(str2)) {
                            iDislikeClosedListener.onItemClickClosed();
                        }
                    } catch (Throwable th2) {
                        omn.hww("MultiProcess", "dislike '" + str2 + "'  throws Exception :", th2);
                    }
                }
                remoteCallbackList.finishBroadcast();
            }
        } catch (Throwable th3) {
            omn.hww("MultiProcess", "dislike '" + str2 + "'  throws Exception :", th3);
        }
    }
}
