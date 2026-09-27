package com.bytedance.sdk.openadsdk.multipro.sd;

import android.content.ContentValues;
import android.database.Cursor;
import android.net.Uri;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.bytedance.sdk.component.hu.hww.hu;
import com.bytedance.sdk.openadsdk.core.bs;
import com.bytedance.sdk.openadsdk.multipro.vy;
import java.util.Objects;
import to.c;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public class hww implements com.bytedance.sdk.openadsdk.multipro.hww {
    private static String hv() {
        return vy.f37509tq + "/t_frequent/";
    }

    public static String sd() {
        if (bs.hww() == null) {
            return null;
        }
        try {
            hu huVarVy = vy();
            if (huVarVy != null) {
                return huVarVy.hww(Uri.parse(hv() + "maxRit"));
            }
        } catch (Throwable unused) {
        }
        return null;
    }

    public static boolean tq() {
        if (bs.hww() == null) {
            return false;
        }
        try {
            hu huVarVy = vy();
            if (huVarVy != null) {
                return "true".equals(huVarVy.hww(Uri.parse(hv() + "isSilent")));
            }
        } catch (Throwable unused) {
        }
        return false;
    }

    private static hu vy() {
        try {
            if (bs.hww() != null) {
                return com.bytedance.sdk.openadsdk.multipro.hww.hww.hww(bs.hww());
            }
            return null;
        } catch (Throwable unused) {
            return null;
        }
    }

    @Override // com.bytedance.sdk.openadsdk.multipro.hww
    public int hww(@NonNull Uri uri, @Nullable ContentValues contentValues, @Nullable String str, @Nullable String[] strArr) {
        return 0;
    }

    @Override // com.bytedance.sdk.openadsdk.multipro.hww
    public int hww(@NonNull Uri uri, @Nullable String str, @Nullable String[] strArr) {
        return 0;
    }

    @Override // com.bytedance.sdk.openadsdk.multipro.hww
    public Cursor hww(@NonNull Uri uri, @Nullable String[] strArr, @Nullable String str, @Nullable String[] strArr2, @Nullable String str2) {
        return null;
    }

    @Override // com.bytedance.sdk.openadsdk.multipro.hww
    public Uri hww(@NonNull Uri uri, @Nullable ContentValues contentValues) {
        return null;
    }

    public static boolean hww(String str) {
        if (bs.hww() == null) {
            return false;
        }
        try {
            hu huVarVy = vy();
            if (huVarVy != null) {
                return "true".equals(huVarVy.hww(Uri.parse(hv() + "checkFrequency?rit=" + str)));
            }
        } catch (Throwable unused) {
        }
        return false;
    }

    @Override // com.bytedance.sdk.openadsdk.multipro.hww
    @NonNull
    public String hww() {
        return "t_frequent";
    }

    @Override // com.bytedance.sdk.openadsdk.multipro.hww
    public String hww(@NonNull Uri uri) {
        Objects.toString(uri);
        String str = uri.getPath().split(c.userBaseDel)[2];
        if ("checkFrequency".equals(str)) {
            return com.bytedance.sdk.openadsdk.core.ok.hww.hww().hww(uri.getQueryParameter("rit")) ? "true" : "false";
        }
        if ("isSilent".equals(str)) {
            return com.bytedance.sdk.openadsdk.core.ok.hww.hww().tq() ? "true" : "false";
        }
        if ("maxRit".equals(str)) {
            return com.bytedance.sdk.openadsdk.core.ok.hww.hww().sd();
        }
        return null;
    }
}
