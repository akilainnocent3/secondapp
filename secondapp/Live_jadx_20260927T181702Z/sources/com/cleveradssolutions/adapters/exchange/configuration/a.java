package com.cleveradssolutions.adapters.exchange.configuration;

import android.util.Size;
import com.cleveradssolutions.adapters.exchange.rendering.utils.helpers.j;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f42071a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f42072b = false;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f42073c = true;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f42074d = -1;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f42075e = j.l();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public float f42076f = 1.0f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f42077g = 120;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public Size f42078h = null;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public com.cleveradssolutions.adapters.exchange.api.data.a f42079i = null;

    public int a() {
        return this.f42075e;
    }

    public void b(com.cleveradssolutions.adapters.exchange.api.data.a aVar) {
        this.f42079i = aVar;
    }

    public void c(boolean z10) {
        this.f42071a = z10;
    }

    public Integer d() {
        return Integer.valueOf(this.f42077g);
    }

    public float e() {
        return this.f42076f;
    }

    public int f() {
        return this.f42074d;
    }

    public boolean g() {
        return this.f42072b;
    }

    public boolean h() {
        return this.f42071a;
    }

    public com.cleveradssolutions.adapters.exchange.api.data.a i() {
        return this.f42079i;
    }

    public void j(float f10) {
        this.f42076f = f10;
    }

    public void k(boolean z10) {
        this.f42072b = z10;
    }

    public boolean l(com.cleveradssolutions.adapters.exchange.api.data.a aVar) {
        return this.f42079i == aVar;
    }
}
