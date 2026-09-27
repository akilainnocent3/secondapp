package com.chartboost.sdk.impl;

import java.io.File;
import java.io.RandomAccessFile;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public abstract class wj {
    public static final Cif b(tj tjVar, kh khVar, q8 q8Var) {
        File fileA;
        RandomAccessFile randomAccessFileA;
        if (q8Var != null) {
            try {
                fileA = q8Var.a(q8Var.b(), tjVar.d());
            } catch (Exception e10) {
                sb.b(e10.toString(), (Throwable) null, 2, (Object) null);
            }
        } else {
            fileA = null;
        }
        if (fileA == null || !fileA.exists()) {
            File fileA2 = khVar.a(tjVar.b(), tjVar.d());
            randomAccessFileA = fileA2 != null ? khVar.a(fileA2) : null;
        } else {
            randomAccessFileA = khVar.a(fileA);
        }
        if (randomAccessFileA != null) {
            return new Cif(randomAccessFileA);
        }
        return null;
    }
}
