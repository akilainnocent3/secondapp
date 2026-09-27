package com.chartboost.sdk.impl;

import android.content.Context;
import java.io.File;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public final class d8 implements c8 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final File f38520a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final File f38521b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final File f38522c;

    public d8(Context context, File precacheDirectory, File precacheQueueDirectory, File precachingInternalDirectory) {
        kotlin.jvm.internal.m0.p(context, "context");
        kotlin.jvm.internal.m0.p(precacheDirectory, "precacheDirectory");
        kotlin.jvm.internal.m0.p(precacheQueueDirectory, "precacheQueueDirectory");
        kotlin.jvm.internal.m0.p(precachingInternalDirectory, "precachingInternalDirectory");
        this.f38520a = precacheDirectory;
        this.f38521b = precacheQueueDirectory;
        this.f38522c = precachingInternalDirectory;
    }

    @Override // com.chartboost.sdk.impl.c8
    public File a(String id2) {
        kotlin.jvm.internal.m0.p(id2, "id");
        return new File(c(), id2);
    }

    @Override // com.chartboost.sdk.impl.c8
    public File b() {
        return this.f38522c;
    }

    @Override // com.chartboost.sdk.impl.c8
    public File c() {
        return this.f38520a;
    }

    @Override // com.chartboost.sdk.impl.c8
    public File a() {
        return this.f38521b;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ d8(Context context, File file, File file2, File file3, int i10, kotlin.jvm.internal.x xVar) {
        file = (i10 & 2) != 0 ? f6.b(context) : file;
        this(context, file, (i10 & 4) != 0 ? f6.c(context) : file2, (i10 & 8) != 0 ? new File(file, "exoplayer-cache") : file3);
    }
}
