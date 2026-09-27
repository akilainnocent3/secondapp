package ks;

import java.io.Serializable;
import java.util.Random;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.x;
import oy.l;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
public final class d extends ks.a implements Serializable {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @l
    public static final a f102877e = new a(null);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final long f102878f = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @l
    public final Random f102879d;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class a {
        public /* synthetic */ a(x xVar) {
            this();
        }

        public a() {
        }
    }

    public d(@l Random impl) {
        m0.p(impl, "impl");
        this.f102879d = impl;
    }

    @Override // ks.a
    @l
    public Random v() {
        return this.f102879d;
    }
}
