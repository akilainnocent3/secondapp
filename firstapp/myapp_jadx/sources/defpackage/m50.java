package defpackage;

import android.view.View;
import android.view.translation.ViewTranslationCallback;
import androidx.compose.ui.platform.AndroidComposeView;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class m50 implements ViewTranslationCallback {
    public static final m50 a = new m50();

    public final boolean onClearTranslation(View view) {
        c6 c6Var;
        Function0 function0;
        view.getClass();
        e60 contentCaptureManager = ((AndroidComposeView) view).getContentCaptureManager();
        contentCaptureManager.getClass();
        contentCaptureManager.e = e60.a.a;
        gwo<eb80> gwoVarD = contentCaptureManager.d();
        Object[] objArr = gwoVarD.c;
        long[] jArr = gwoVarD.a;
        int length = jArr.length - 2;
        if (length < 0) {
            return true;
        }
        int i = 0;
        while (true) {
            long j = jArr[i];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i2 = 8 - ((~(i - length)) >>> 31);
                for (int i3 = 0; i3 < i2; i3++) {
                    if ((255 & j) < 128) {
                        sa80 sa80Var = ((eb80) objArr[(i << 3) + i3]).a.d;
                        if (ta80.a(sa80Var, hb80.C) != null && (c6Var = (c6) ta80.a(sa80Var, ra80.m)) != null && (function0 = (Function0) c6Var.b) != null) {
                        }
                    }
                    j >>= 8;
                }
                if (i2 != 8) {
                    return true;
                }
            }
            if (i == length) {
                return true;
            }
            i++;
        }
    }

    public final boolean onHideTranslation(View view) {
        c6 c6Var;
        Function1 function1;
        view.getClass();
        e60 contentCaptureManager = ((AndroidComposeView) view).getContentCaptureManager();
        contentCaptureManager.getClass();
        contentCaptureManager.e = e60.a.a;
        gwo<eb80> gwoVarD = contentCaptureManager.d();
        Object[] objArr = gwoVarD.c;
        long[] jArr = gwoVarD.a;
        int length = jArr.length - 2;
        if (length < 0) {
            return true;
        }
        int i = 0;
        while (true) {
            long j = jArr[i];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i2 = 8 - ((~(i - length)) >>> 31);
                for (int i3 = 0; i3 < i2; i3++) {
                    if ((255 & j) < 128) {
                        sa80 sa80Var = ((eb80) objArr[(i << 3) + i3]).a.d;
                        if (Intrinsics.g(ta80.a(sa80Var, hb80.C), Boolean.TRUE) && (c6Var = (c6) ta80.a(sa80Var, ra80.l)) != null && (function1 = (Function1) c6Var.b) != null) {
                        }
                    }
                    j >>= 8;
                }
                if (i2 != 8) {
                    return true;
                }
            }
            if (i == length) {
                return true;
            }
            i++;
        }
    }

    public final boolean onShowTranslation(View view) {
        c6 c6Var;
        Function1 function1;
        view.getClass();
        e60 contentCaptureManager = ((AndroidComposeView) view).getContentCaptureManager();
        contentCaptureManager.getClass();
        contentCaptureManager.e = e60.a.b;
        gwo<eb80> gwoVarD = contentCaptureManager.d();
        Object[] objArr = gwoVarD.c;
        long[] jArr = gwoVarD.a;
        int length = jArr.length - 2;
        if (length < 0) {
            return true;
        }
        int i = 0;
        while (true) {
            long j = jArr[i];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i2 = 8 - ((~(i - length)) >>> 31);
                for (int i3 = 0; i3 < i2; i3++) {
                    if ((255 & j) < 128) {
                        sa80 sa80Var = ((eb80) objArr[(i << 3) + i3]).a.d;
                        if (Intrinsics.g(ta80.a(sa80Var, hb80.C), Boolean.FALSE) && (c6Var = (c6) ta80.a(sa80Var, ra80.l)) != null && (function1 = (Function1) c6Var.b) != null) {
                        }
                    }
                    j >>= 8;
                }
                if (i2 != 8) {
                    return true;
                }
            }
            if (i == length) {
                return true;
            }
            i++;
        }
    }
}
