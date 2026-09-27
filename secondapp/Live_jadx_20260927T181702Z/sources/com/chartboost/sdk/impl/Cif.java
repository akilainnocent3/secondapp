package com.chartboost.sdk.impl;

import java.io.FileDescriptor;
import java.io.IOException;
import java.io.RandomAccessFile;

/* JADX INFO: renamed from: com.chartboost.sdk.impl.if, reason: invalid class name */
/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public final class Cif {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final RandomAccessFile f39360a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final FileDescriptor f39361b;

    public Cif(RandomAccessFile randomAccessFile) throws IOException {
        kotlin.jvm.internal.m0.p(randomAccessFile, "randomAccessFile");
        this.f39360a = randomAccessFile;
        FileDescriptor fd2 = randomAccessFile.getFD();
        kotlin.jvm.internal.m0.o(fd2, "getFD(...)");
        this.f39361b = fd2;
    }

    public final void a() throws IOException {
        this.f39360a.close();
    }

    public final FileDescriptor b() {
        return this.f39361b;
    }

    public final long c() {
        return this.f39360a.length();
    }
}
