package defpackage;

import android.graphics.Bitmap;
import android.graphics.ColorSpace;
import android.os.Build;
import android.util.DisplayMetrics;
import java.util.function.DoubleUnaryOperator;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class tl0 {
    public static final Bitmap a(int i, int i2, int i3, h68 h68Var) {
        ColorSpace rgb;
        ColorSpace colorSpaceA;
        ColorSpace colorSpace;
        Bitmap.Config configB = w70.b(i3);
        if (Intrinsics.g(h68Var, x68.e)) {
            colorSpace = ColorSpace.get(ColorSpace.Named.SRGB);
        } else if (Intrinsics.g(h68Var, x68.q)) {
            colorSpace = ColorSpace.get(ColorSpace.Named.ACES);
        } else if (Intrinsics.g(h68Var, x68.r)) {
            colorSpace = ColorSpace.get(ColorSpace.Named.ACESCG);
        } else if (Intrinsics.g(h68Var, x68.o)) {
            colorSpace = ColorSpace.get(ColorSpace.Named.ADOBE_RGB);
        } else if (Intrinsics.g(h68Var, x68.j)) {
            colorSpace = ColorSpace.get(ColorSpace.Named.BT2020);
        } else if (Intrinsics.g(h68Var, x68.i)) {
            colorSpace = ColorSpace.get(ColorSpace.Named.BT709);
        } else if (Intrinsics.g(h68Var, x68.t)) {
            colorSpace = ColorSpace.get(ColorSpace.Named.CIE_LAB);
        } else if (Intrinsics.g(h68Var, x68.s)) {
            colorSpace = ColorSpace.get(ColorSpace.Named.CIE_XYZ);
        } else if (Intrinsics.g(h68Var, x68.k)) {
            colorSpace = ColorSpace.get(ColorSpace.Named.DCI_P3);
        } else if (Intrinsics.g(h68Var, x68.l)) {
            colorSpace = ColorSpace.get(ColorSpace.Named.DISPLAY_P3);
        } else if (Intrinsics.g(h68Var, x68.g)) {
            colorSpace = ColorSpace.get(ColorSpace.Named.EXTENDED_SRGB);
        } else if (Intrinsics.g(h68Var, x68.h)) {
            colorSpace = ColorSpace.get(ColorSpace.Named.LINEAR_EXTENDED_SRGB);
        } else if (Intrinsics.g(h68Var, x68.f)) {
            colorSpace = ColorSpace.get(ColorSpace.Named.LINEAR_SRGB);
        } else if (Intrinsics.g(h68Var, x68.m)) {
            colorSpace = ColorSpace.get(ColorSpace.Named.NTSC_1953);
        } else {
            if (!Intrinsics.g(h68Var, x68.p)) {
                if (Intrinsics.g(h68Var, x68.n)) {
                    colorSpace = ColorSpace.get(ColorSpace.Named.SMPTE_C);
                } else if (Build.VERSION.SDK_INT >= 34 && (colorSpaceA = q68.a(h68Var)) != null) {
                    rgb = colorSpaceA;
                    configB = configB;
                } else if (h68Var instanceof ws50) {
                    String str = h68Var.a;
                    ws50 ws50Var = (ws50) h68Var;
                    float[] fArrA = ws50Var.d.a();
                    prg0 prg0Var = ws50Var.g;
                    ColorSpace.Rgb.TransferParameters transferParameters = prg0Var != null ? new ColorSpace.Rgb.TransferParameters(prg0Var.b, prg0Var.c, prg0Var.d, prg0Var.e, prg0Var.f, prg0Var.g, prg0Var.a) : null;
                    if (transferParameters != null) {
                        l68.a();
                        rgb = new ColorSpace.Rgb(str, ws50Var.h, fArrA, transferParameters);
                    } else {
                        l68.a();
                        float[] fArr = ws50Var.h;
                        final ws50.c cVar = ws50Var.l;
                        DoubleUnaryOperator doubleUnaryOperator = new DoubleUnaryOperator() { // from class: m68
                            @Override // java.util.function.DoubleUnaryOperator
                            public final double applyAsDouble(double d) {
                                return ((Number) cVar.invoke(Double.valueOf(d))).doubleValue();
                            }
                        };
                        final ws50.b bVar = ws50Var.o;
                        rgb = new ColorSpace.Rgb(str, fArr, fArrA, doubleUnaryOperator, new DoubleUnaryOperator() { // from class: n68
                            @Override // java.util.function.DoubleUnaryOperator
                            public final double applyAsDouble(double d) {
                                return ((Number) bVar.invoke(Double.valueOf(d))).doubleValue();
                            }
                        }, ws50Var.e, ws50Var.f);
                    }
                } else {
                    configB = configB;
                    rgb = ColorSpace.get(ColorSpace.Named.SRGB);
                }
                return Bitmap.createBitmap((DisplayMetrics) null, i, i2, configB, true, rgb);
            }
            colorSpace = ColorSpace.get(ColorSpace.Named.PRO_PHOTO_RGB);
        }
        rgb = colorSpace;
        configB = configB;
        return Bitmap.createBitmap((DisplayMetrics) null, i, i2, configB, true, rgb);
    }
}
