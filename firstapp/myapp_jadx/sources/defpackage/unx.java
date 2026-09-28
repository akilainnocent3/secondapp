package defpackage;

import android.net.NetworkRequest;
import android.util.Log;

/* JADX INFO: loaded from: classes.dex */
public final class unx {
    public static ynx a(int[] iArr, int[] iArr2) {
        NetworkRequest.Builder builder = new NetworkRequest.Builder();
        for (int i : iArr) {
            try {
                builder.addCapability(i);
            } catch (IllegalArgumentException e) {
                jgt jgtVarE = jgt.e();
                String str = ynx.b;
                String str2 = ynx.b;
                String str3 = "Ignoring adding capability '" + i + '\'';
                if (((jgt.a) jgtVarE).c <= 5) {
                    Log.w(str2, str3, e);
                }
            }
        }
        for (int i2 = 0; i2 < 3; i2++) {
            int i3 = znx.a[i2];
            if (ay0.E(iArr, i3) < 0) {
                try {
                    builder.removeCapability(i3);
                } catch (IllegalArgumentException e2) {
                    jgt jgtVarE2 = jgt.e();
                    String str4 = ynx.b;
                    String str5 = ynx.b;
                    String str6 = "Ignoring removing default capability '" + i3 + '\'';
                    if (((jgt.a) jgtVarE2).c <= 5) {
                        Log.w(str5, str6, e2);
                    }
                }
            }
        }
        for (int i4 : iArr2) {
            builder.addTransportType(i4);
        }
        NetworkRequest networkRequestBuild = builder.build();
        networkRequestBuild.getClass();
        return new ynx(networkRequestBuild);
    }

    public static boolean b(NetworkRequest networkRequest, int i) {
        networkRequest.getClass();
        return networkRequest.hasCapability(i);
    }

    public static boolean c(NetworkRequest networkRequest, int i) {
        networkRequest.getClass();
        return networkRequest.hasTransport(i);
    }
}
