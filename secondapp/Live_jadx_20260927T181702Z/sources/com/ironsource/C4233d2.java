package com.ironsource;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: com.ironsource.d2, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
public final class C4233d2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @oy.m
    private List<String> f61250a = new ArrayList();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @oy.m
    private List<String> f61251b = new ArrayList();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @oy.m
    private List<String> f61252c = new ArrayList();

    @oy.m
    public final List<String> a() {
        return this.f61252c;
    }

    @oy.m
    public final List<String> b() {
        return this.f61251b;
    }

    @oy.m
    public final List<String> c() {
        return this.f61250a;
    }

    public final void a(@oy.m List<String> list) {
        this.f61252c = list;
    }

    public final void b(@oy.m List<String> list) {
        this.f61251b = list;
    }

    public final void c(@oy.m List<String> list) {
        this.f61250a = list;
    }
}
