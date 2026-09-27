package com.bykv.vk.openvk.preload.geckox.a.a;

import android.annotation.SuppressLint;
import java.io.File;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes2.dex */
@SuppressLint({"CI_StaticFieldLeak"})
public abstract class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final b f31710a = new d();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final b f31711b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected a f31712c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    protected File f31713d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    protected List<String> f31714e;

    static {
        new f();
        f31711b = new e();
    }

    public abstract void a();

    public void a(a aVar, File file, List<String> list) {
        this.f31712c = aVar;
        this.f31713d = file;
        this.f31714e = list;
    }
}
