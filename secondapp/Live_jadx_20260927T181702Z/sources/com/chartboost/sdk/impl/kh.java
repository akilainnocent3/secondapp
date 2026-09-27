package com.chartboost.sdk.impl;

import java.io.File;
import java.io.RandomAccessFile;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public final class kh {
    public final RandomAccessFile a(File file) {
        if (file != null) {
            return new RandomAccessFile(file, "rwd");
        }
        return null;
    }

    public final boolean b(File file, String str) {
        if (file != null && str != null) {
            try {
                File fileA = a(file, str);
                if (fileA != null) {
                    return fileA.exists();
                }
                return false;
            } catch (Exception e10) {
                sb.a(e10.toString(), (Throwable) null, 2, (Object) null);
            }
        }
        return false;
    }

    public final File a(File file, String str) {
        if (file == null || str == null) {
            return null;
        }
        return new File(file, str + ".tmp");
    }
}
