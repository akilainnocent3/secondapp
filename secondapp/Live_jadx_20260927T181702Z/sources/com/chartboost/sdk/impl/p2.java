package com.chartboost.sdk.impl;

import android.content.Context;
import java.util.concurrent.atomic.AtomicReference;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public abstract class p2 {
    public static boolean a(AtomicReference atomicReference, JSONObject jSONObject) {
        try {
            atomicReference.set(new mg(jSONObject));
            return true;
        } catch (Exception e10) {
            sb.b("updateConfig: " + e10, null);
            return false;
        }
    }

    public static boolean a(Context context) {
        try {
            if (context != null) {
                int iCheckSelfPermission = context.checkSelfPermission(com.bumptech.glide.manager.e.f31484b);
                boolean z10 = context.checkSelfPermission("android.permission.INTERNET") != 0;
                boolean z11 = iCheckSelfPermission != 0;
                if (z10) {
                    throw new RuntimeException("Please add the permission : android.permission.INTERNET in your android manifest.xml");
                }
                if (z11) {
                    throw new RuntimeException("Please add the permission : android.permission.ACCESS_NETWORK_STATE in your android manifest.xml");
                }
                return true;
            }
            throw new RuntimeException("Invalid activity context passed during intitalization");
        } catch (Exception e10) {
            e10.printStackTrace();
            return false;
        }
    }
}
