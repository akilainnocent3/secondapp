package com.bumptech.glide.manager;

import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.WeakHashMap;
import k.h1;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes2.dex */
public class q {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final String f31505d = "RequestTracker";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Set<lc.e> f31506a = Collections.newSetFromMap(new WeakHashMap());

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Set<lc.e> f31507b = new HashSet();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f31508c;

    @h1
    public void a(lc.e eVar) {
        this.f31506a.add(eVar);
    }

    public boolean b(@Nullable lc.e eVar) {
        boolean z10 = true;
        if (eVar == null) {
            return true;
        }
        boolean zRemove = this.f31506a.remove(eVar);
        if (!this.f31507b.remove(eVar) && !zRemove) {
            z10 = false;
        }
        if (z10) {
            eVar.clear();
        }
        return z10;
    }

    public void c() {
        Iterator it = pc.o.l(this.f31506a).iterator();
        while (it.hasNext()) {
            b((lc.e) it.next());
        }
        this.f31507b.clear();
    }

    public boolean d() {
        return this.f31508c;
    }

    public void e() {
        this.f31508c = true;
        for (lc.e eVar : pc.o.l(this.f31506a)) {
            if (eVar.isRunning() || eVar.f()) {
                eVar.clear();
                this.f31507b.add(eVar);
            }
        }
    }

    public void f() {
        this.f31508c = true;
        for (lc.e eVar : pc.o.l(this.f31506a)) {
            if (eVar.isRunning()) {
                eVar.pause();
                this.f31507b.add(eVar);
            }
        }
    }

    public void g() {
        for (lc.e eVar : pc.o.l(this.f31506a)) {
            if (!eVar.f() && !eVar.e()) {
                eVar.clear();
                if (this.f31508c) {
                    this.f31507b.add(eVar);
                } else {
                    eVar.j();
                }
            }
        }
    }

    public void h() {
        this.f31508c = false;
        for (lc.e eVar : pc.o.l(this.f31506a)) {
            if (!eVar.f() && !eVar.isRunning()) {
                eVar.j();
            }
        }
        this.f31507b.clear();
    }

    public void i(@NonNull lc.e eVar) {
        this.f31506a.add(eVar);
        if (!this.f31508c) {
            eVar.j();
            return;
        }
        eVar.clear();
        if (Log.isLoggable(f31505d, 2)) {
            Log.v(f31505d, "Paused, delaying request");
        }
        this.f31507b.add(eVar);
    }

    public String toString() {
        return super.toString() + "{numRequests=" + this.f31506a.size() + ", isPaused=" + this.f31508c + "}";
    }
}
