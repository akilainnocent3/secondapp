package com.sportygames.commons.models;

import android.os.Looper;
import defpackage.ssw;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0010\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\b\u001a\u0004\u0018\u00010\u0000¢\u0006\u0004\b\b\u0010\tJ\r\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\u0003J\u0015\u0010\r\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u0005¢\u0006\u0004\b\r\u0010\u000eR$\u0010\u0014\u001a\u0004\u0018\u00010\u00008\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\t\"\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0019\u0010\u0017\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0017\u0010\u0019¨\u0006\u001a"}, d2 = {"Lcom/sportygames/commons/models/NetworkStateManager;", "", "<init>", "()V", "Lssw;", "", "observeNetworkState", "()Lssw;", "getInstance", "()Lcom/sportygames/commons/models/NetworkStateManager;", "", "resetInstance", "connectivityStatus", "setNetworkConnectivityStatus", "(Z)V", "INSTANCE$1", "Lcom/sportygames/commons/models/NetworkStateManager;", "getINSTANCE", "setINSTANCE", "(Lcom/sportygames/commons/models/NetworkStateManager;)V", "INSTANCE", "activeNetworkStatusMLD", "Lssw;", "isConnected", "Ljava/lang/Boolean;", "()Ljava/lang/Boolean;", "SGLibrary_sportybetRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class NetworkStateManager {
    public static final int $stable;
    public static final NetworkStateManager INSTANCE = new NetworkStateManager();

    /* JADX INFO: renamed from: INSTANCE$1, reason: from kotlin metadata */
    private static NetworkStateManager INSTANCE;
    private static final ssw<Boolean> activeNetworkStatusMLD;
    private static final Boolean isConnected;

    static {
        ssw<Boolean> sswVar = new ssw<>();
        activeNetworkStatusMLD = sswVar;
        isConnected = sswVar.d();
        $stable = 8;
    }

    private NetworkStateManager() {
    }

    public final NetworkStateManager getINSTANCE() {
        return INSTANCE;
    }

    public final NetworkStateManager getInstance() {
        NetworkStateManager networkStateManager = INSTANCE;
        if (networkStateManager != null) {
            return networkStateManager;
        }
        NetworkStateManager networkStateManager2 = INSTANCE;
        INSTANCE = networkStateManager2;
        return networkStateManager2;
    }

    public final Boolean isConnected() {
        return isConnected;
    }

    public final ssw<Boolean> observeNetworkState() {
        return activeNetworkStatusMLD;
    }

    public final void resetInstance() {
        INSTANCE = null;
    }

    public final void setINSTANCE(NetworkStateManager networkStateManager) {
        INSTANCE = networkStateManager;
    }

    public final void setNetworkConnectivityStatus(boolean connectivityStatus) {
        if (Intrinsics.g(Looper.myLooper(), Looper.getMainLooper())) {
            activeNetworkStatusMLD.m(Boolean.valueOf(connectivityStatus));
        } else {
            activeNetworkStatusMLD.j(Boolean.valueOf(connectivityStatus));
        }
    }
}
