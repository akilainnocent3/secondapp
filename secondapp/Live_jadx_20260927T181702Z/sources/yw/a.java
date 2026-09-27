package yw;

import android.content.Context;
import android.content.res.AssetManager;
import fx.d1;
import fx.n0;
import java.io.IOException;
import java.io.InputStream;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.x;
import okhttp3.internal.platform.e;
import oy.l;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
public final class a extends b {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @l
    public static final C1565a f160048g = new C1565a(null);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @l
    public static final String f160049h = "PublicSuffixDatabase.list";

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @l
    public final String f160050f;

    /* JADX INFO: renamed from: yw.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class C1565a {
        public /* synthetic */ C1565a(x xVar) {
            this();
        }

        @l
        public final String a() {
            return a.f160049h;
        }

        public C1565a() {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public a() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    @Override // yw.b
    @l
    public d1 d() throws IOException {
        AssetManager assets;
        Context contextB = e.f119162a.b();
        if (contextB == null || (assets = contextB.getAssets()) == null) {
            throw new IOException("Platform applicationContext not initialized");
        }
        InputStream inputStreamOpen = assets.open(c());
        m0.o(inputStreamOpen, "open(...)");
        return n0.v(inputStreamOpen);
    }

    @Override // yw.b
    @l
    /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
    public String c() {
        return this.f160050f;
    }

    public /* synthetic */ a(String str, int i10, x xVar) {
        this((i10 & 1) != 0 ? f160049h : str);
    }

    public a(@l String path) {
        m0.p(path, "path");
        this.f160050f = path;
    }
}
