package com.fyber.inneractive.sdk.util;

import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import com.fyber.inneractive.sdk.config.IAConfigManager;
import com.ironsource.Z3;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public enum z0 {
    UNKNOWN(""),
    ETHERNET(Z3.f60405a),
    WIFI(Z3.f60406b),
    MOBILE_3G(Z3.f60405a),
    MOBILE_4G("4g"),
    MOBILE_5G("5g"),
    CELLULAR("Cellular");

    final String key;

    z0(String str) {
        this.key = str;
    }

    /* JADX WARN: Code duplicated, block: B:46:0x006e  */
    public static z0 a() {
        int type;
        z0 z0Var;
        NetworkInfo activeNetworkInfo;
        try {
            type = (!o.a(com.bumptech.glide.manager.e.f31484b) || (activeNetworkInfo = ((ConnectivityManager) o.f47884a.getSystemService("connectivity")).getActiveNetworkInfo()) == null) ? 8 : activeNetworkInfo.getType();
        } catch (Exception unused) {
        }
        if (type == 9) {
            return ETHERNET;
        }
        if (type != 0) {
            if (type == 1) {
                return WIFI;
            }
            if (type != 2 && type != 3 && type != 4 && type != 5) {
                return UNKNOWN;
            }
        }
        com.fyber.inneractive.sdk.config.cellular.a aVar = IAConfigManager.O.N;
        if (aVar == null || aVar.f44323a == null) {
            int iK = k.k();
            if (iK == 0) {
                z0Var = UNKNOWN;
            } else if (iK == 3) {
                z0Var = MOBILE_3G;
            } else if (iK == 18) {
                z0Var = WIFI;
            } else if (iK == 20) {
                z0Var = MOBILE_5G;
            } else if (iK != 5 && iK != 6) {
                switch (iK) {
                    default:
                        switch (iK) {
                            case 12:
                            case 14:
                            case 15:
                                break;
                            case 13:
                                z0Var = MOBILE_4G;
                                break;
                            default:
                                z0Var = CELLULAR;
                                break;
                        }
                    case 8:
                    case 9:
                    case 10:
                        z0Var = MOBILE_3G;
                        break;
                }
            } else {
                z0Var = MOBILE_3G;
            }
        } else {
            z0Var = aVar.f44324b;
        }
        if (z0Var == UNKNOWN) {
            return k.k() == 13 ? MOBILE_4G : MOBILE_3G;
        }
        return z0Var;
    }

    public final String b() {
        return this.key;
    }
}
