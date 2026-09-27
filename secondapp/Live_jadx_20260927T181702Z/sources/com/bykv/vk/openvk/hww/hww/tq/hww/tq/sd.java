package com.bykv.vk.openvk.hww.hww.tq.hww.tq;

import android.content.Context;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes2.dex */
public class sd {
    public static final ConcurrentHashMap<String, tq> hww = new ConcurrentHashMap<>();

    public static synchronized void hww(Context context, com.bykv.vk.openvk.hww.hww.hww.sd.sd sdVar, com.bykv.vk.openvk.hww.hww.hww.hv.hww.InterfaceC0289hww interfaceC0289hww) {
        if (sdVar == null) {
            return;
        }
        try {
            ConcurrentHashMap<String, tq> concurrentHashMap = hww;
            tq tqVar = concurrentHashMap.get(sdVar.bs());
            if (tqVar == null) {
                tqVar = new tq(context, sdVar);
                concurrentHashMap.put(sdVar.bs(), tqVar);
                sdVar.hu();
                sdVar.bs();
            }
            tqVar.hww(interfaceC0289hww);
            sdVar.hu();
            sdVar.bs();
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public static synchronized void hww(com.bykv.vk.openvk.hww.hww.hww.sd.sd sdVar) {
        try {
            tq tqVarRemove = hww.remove(sdVar.bs());
            if (tqVarRemove != null) {
                tqVarRemove.hww(true);
            }
            sdVar.hu();
            sdVar.bs();
        } catch (Throwable th2) {
            throw th2;
        }
    }
}
