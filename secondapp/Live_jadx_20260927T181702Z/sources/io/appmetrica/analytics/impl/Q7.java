package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.coreapi.internal.data.ProtobufStateStorage;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
public abstract class Q7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f96380a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ProtobufStateStorage f96381b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final S7 f96382c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final InterfaceC4979co f96383d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Jm f96384e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Vi f96385f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Ti f96386g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final A6 f96387h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public R7 f96388i;

    public Q7(Context context, ProtobufStateStorage protobufStateStorage, S7 s10, InterfaceC4979co interfaceC4979co, Jm jm2, Vi vi2, Ti ti2, A6 a10, R7 r10) {
        this.f96380a = context;
        this.f96381b = protobufStateStorage;
        this.f96382c = s10;
        this.f96383d = interfaceC4979co;
        this.f96384e = jm2;
        this.f96385f = vi2;
        this.f96386g = ti2;
        this.f96387h = a10;
        this.f96388i = r10;
    }

    @oy.l
    public final synchronized R7 a() {
        return this.f96388i;
    }

    public final synchronized boolean b(@oy.l U7 u10) {
        boolean z10;
        try {
            if (u10.a() == T7.f96501b) {
                return false;
            }
            if (kotlin.jvm.internal.m0.g(u10, this.f96388i.b())) {
                return false;
            }
            List listA = (List) this.f96383d.invoke(this.f96388i.a(), u10);
            boolean z11 = listA != null;
            if (listA == null) {
                listA = this.f96388i.a();
            }
            if (this.f96382c.a(u10, this.f96388i.b())) {
                z10 = true;
            } else {
                u10 = (U7) this.f96388i.b();
                z10 = false;
            }
            if (z10 || z11) {
                R7 r10 = this.f96388i;
                R7 r11 = (R7) this.f96384e.invoke(u10, listA);
                this.f96388i = r11;
                this.f96381b.save(r11);
                AbstractC5077gj.a("Update distribution data: %s -> %s", r10, this.f96388i);
            }
            return z10;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final synchronized U7 c() {
        try {
            if (!this.f96386g.a()) {
                U7 u10 = (U7) this.f96385f.invoke();
                this.f96386g.b();
                if (u10 != null) {
                    b(u10);
                }
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return (U7) this.f96388i.b();
    }

    @oy.l
    public final U7 a(@oy.l U7 u10) {
        U7 u7C;
        this.f96387h.a(this.f96380a);
        synchronized (this) {
            b(u10);
            u7C = c();
        }
        return u7C;
    }

    @oy.l
    public final U7 b() {
        this.f96387h.a(this.f96380a);
        return c();
    }
}
