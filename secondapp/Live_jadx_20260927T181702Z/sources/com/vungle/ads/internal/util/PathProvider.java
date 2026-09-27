package com.vungle.ads.internal.util;

import android.content.Context;
import android.os.StatFs;
import fr.h0;
import java.io.File;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.x;
import oy.l;
import oy.m;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
public final class PathProvider {

    @l
    private static final String CLEVER_CACHE_FOLDER = "clever_cache";

    @l
    public static final Companion Companion = new Companion(null);
    private static final long UNKNOWN_SIZE = -1;

    @l
    private static final String VM_FOLDER = "adAssets";

    @l
    private static final String VUNGLE_FOLDER = "vungle_cache";

    @l
    private final File cleverCacheDir;

    @l
    private final Context context;

    @l
    private final File vmDir;

    @l
    private final File vungleDir;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class Companion {
        public /* synthetic */ Companion(x xVar) {
            this();
        }

        private Companion() {
        }
    }

    public PathProvider(@l Context context) {
        m0.p(context, "context");
        this.context = context;
        File file = new File(context.getNoBackupFilesDir(), VUNGLE_FOLDER);
        this.vungleDir = file;
        File file2 = new File(file, VM_FOLDER);
        this.vmDir = file2;
        File file3 = new File(file, CLEVER_CACHE_FOLDER);
        this.cleverCacheDir = file3;
        for (File file4 : h0.Q(file, file2, file3)) {
            if (!file4.exists()) {
                file4.mkdirs();
            }
        }
    }

    public final long getAvailableBytes(@l String path) {
        m0.p(path, "path");
        try {
            return new StatFs(path).getAvailableBytes();
        } catch (IllegalArgumentException e10) {
            Logger.Companion.w("PathProvider", "Failed to get available bytes " + e10.getMessage());
            return -1L;
        }
    }

    @l
    public final File getCleverCacheDir() {
        if (!this.cleverCacheDir.exists()) {
            this.cleverCacheDir.mkdirs();
        }
        return this.cleverCacheDir;
    }

    @l
    public final Context getContext() {
        return this.context;
    }

    @m
    public final File getDownloadsDirForAd(@m String str) {
        if (str == null || str.length() == 0) {
            return null;
        }
        File file = new File(getVmDir(), str);
        if (!file.exists()) {
            file.mkdirs();
        }
        return file;
    }

    @l
    public final File getSharedPrefsDir() {
        File noBackupFilesDir = this.context.getNoBackupFilesDir();
        m0.o(noBackupFilesDir, "context.noBackupFilesDir");
        return noBackupFilesDir;
    }

    @l
    public final File getUnclosedAdFile(@l String name) {
        m0.p(name, "name");
        return new File(getSharedPrefsDir(), name);
    }

    @l
    public final File getVmDir() {
        if (!this.vmDir.exists()) {
            this.vmDir.mkdirs();
        }
        return this.vmDir;
    }

    @l
    public final File getVungleDir() {
        if (!this.vungleDir.exists()) {
            this.vungleDir.mkdirs();
        }
        return this.vungleDir;
    }
}
