package com.unity3d.services.core.device;

import com.unity3d.services.core.log.DeviceLog;
import com.unity3d.services.core.misc.JsonStorage;
import com.unity3d.services.core.misc.Utilities;
import com.unity3d.services.core.webview.WebViewApp;
import com.unity3d.services.core.webview.WebViewEventCategory;
import cv.g;
import dr.w2;
import fr.h0;
import fr.r0;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.s1;
import kotlin.jvm.internal.x;
import nv.b1;
import nv.k0;
import org.json.JSONObject;
import oy.l;
import oy.m;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
@s1({"SMAP\nStorage.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Storage.kt\ncom/unity3d/services/core/device/Storage\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,98:1\n1855#2,2:99\n*S KotlinDebug\n*F\n+ 1 Storage.kt\ncom/unity3d/services/core/device/Storage\n*L\n76#1:99,2\n*E\n"})
public class Storage extends JsonStorage {

    @l
    public static final Companion Companion = new Companion(null);

    @l
    private static final k0<List<ds.l<StorageEventInfo, w2>>> onStorageEventCallbacks = b1.a(h0.J());

    @l
    private final String _targetFileName;

    @l
    private final StorageManager.StorageType type;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    @s1({"SMAP\nStorage.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Storage.kt\ncom/unity3d/services/core/device/Storage$Companion\n+ 2 StateFlow.kt\nkotlinx/coroutines/flow/StateFlowKt\n*L\n1#1,98:1\n230#2,5:99\n230#2,5:104\n*S KotlinDebug\n*F\n+ 1 Storage.kt\ncom/unity3d/services/core/device/Storage$Companion\n*L\n94#1:99,5\n95#1:104,5\n*E\n"})
    public static final class Companion {
        public /* synthetic */ Companion(x xVar) {
            this();
        }

        public final void addStorageEventCallback(@l ds.l<? super StorageEventInfo, w2> callback) {
            Object value;
            m0.p(callback, "callback");
            k0 k0Var = Storage.onStorageEventCallbacks;
            do {
                value = k0Var.getValue();
            } while (!k0Var.d(value, r0.J4((List) value, callback)));
        }

        public final void removeStorageEventCallback(@l ds.l<? super StorageEventInfo, w2> callback) {
            Object value;
            m0.p(callback, "callback");
            k0 k0Var = Storage.onStorageEventCallbacks;
            do {
                value = k0Var.getValue();
            } while (!k0Var.d(value, r0.v4((List) value, callback)));
        }

        private Companion() {
        }
    }

    public Storage(@l String _targetFileName, @l StorageManager.StorageType type) {
        m0.p(_targetFileName, "_targetFileName");
        m0.p(type, "type");
        this._targetFileName = _targetFileName;
        this.type = type;
    }

    public synchronized boolean clearStorage() {
        clearData();
        return new File(this._targetFileName).delete();
    }

    @l
    public final StorageManager.StorageType getType() {
        return this.type;
    }

    public final synchronized boolean initStorage() {
        readStorage();
        super.initData();
        return true;
    }

    public synchronized boolean readStorage() {
        boolean z10 = true;
        try {
            try {
                byte[] fileBytes = Utilities.readFileBytes(new File(this._targetFileName));
                if (fileBytes == null) {
                    return false;
                }
                setData(new JSONObject(new String(fileBytes, g.f77202b)));
            } catch (FileNotFoundException e10) {
                DeviceLog.debug("Storage JSON file not found in local cache:", e10);
                z10 = false;
            }
        } catch (Exception e11) {
            DeviceLog.debug("Failed to read storage JSON file:", e11);
            z10 = false;
        }
        return z10;
    }

    public final synchronized void sendEvent(@m StorageEvent storageEvent, @m Object obj) {
        List<ds.l<StorageEventInfo, w2>> value = onStorageEventCallbacks.getValue();
        if (value.isEmpty()) {
            if (!(WebViewApp.getCurrentApp() != null ? WebViewApp.getCurrentApp().sendEvent(WebViewEventCategory.STORAGE, storageEvent, this.type.name(), obj) : false)) {
                DeviceLog.debug("Couldn't send storage event to WebApp");
            }
            return;
        }
        m0.m(storageEvent);
        StorageEventInfo storageEventInfo = new StorageEventInfo(storageEvent, this.type, obj);
        Iterator<T> it = value.iterator();
        while (it.hasNext()) {
            ((ds.l) it.next()).invoke(storageEventInfo);
        }
    }

    public final synchronized boolean storageFileExists() {
        return new File(this._targetFileName).exists();
    }

    public synchronized boolean writeStorage() {
        File file = new File(this._targetFileName);
        if (getData() == null) {
            return false;
        }
        return Utilities.writeFile(file, getData().toString());
    }
}
