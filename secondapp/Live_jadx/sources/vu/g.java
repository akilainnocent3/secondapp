package vu;

import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.x;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
public abstract class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f141602a;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class a extends g {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @oy.l
        public static final a f141603b = new a();

        public a() {
            super(false, null);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class b extends g {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @oy.l
        public final String f141604b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(@oy.l String error) {
            super(false, null);
            m0.p(error, "error");
            this.f141604b = error;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class c extends g {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @oy.l
        public static final c f141605b = new c();

        public c() {
            super(true, null);
        }
    }

    public /* synthetic */ g(boolean z10, x xVar) {
        this(z10);
    }

    public final boolean a() {
        return this.f141602a;
    }

    public g(boolean z10) {
        this.f141602a = z10;
    }
}
