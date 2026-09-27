package com.chartboost.sdk.impl;

import java.io.File;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public abstract class v6 {
    public static final File a(u6 u6Var, File file) {
        kotlin.jvm.internal.m0.p(u6Var, "<this>");
        return new File(file, u6Var.b());
    }

    public static final u6 a(xf.b bVar) {
        kotlin.jvm.internal.m0.p(bVar, "<this>");
        return new u6(bVar);
    }

    public static final String a(int i10) {
        if (i10 == 0) {
            return "STATE_QUEUED";
        }
        if (i10 == 1) {
            return "STATE_STOPPED";
        }
        if (i10 == 2) {
            return "STATE_DOWNLOADING";
        }
        if (i10 == 3) {
            return "STATE_COMPLETED";
        }
        if (i10 == 4) {
            return "STATE_FAILED";
        }
        if (i10 == 5) {
            return "STATE_REMOVING";
        }
        if (i10 != 7) {
            return "UNKNOWN STATE " + i10;
        }
        return "STATE_RESTARTING";
    }
}
