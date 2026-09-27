package com.google.gson;

import gm.c0;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes4.dex */
public final class m extends j {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c0<String, j> f52562b = new c0<>(false);

    public void A(String str, Boolean bool) {
        z(str, bool == null ? l.f52561b : new p(bool));
    }

    public void B(String str, Character ch2) {
        z(str, ch2 == null ? l.f52561b : new p(ch2));
    }

    public void C(String str, Number number) {
        z(str, number == null ? l.f52561b : new p(number));
    }

    public void D(String str, String str2) {
        z(str, str2 == null ? l.f52561b : new p(str2));
    }

    public Map<String, j> E() {
        return this.f52562b;
    }

    @Override // com.google.gson.j
    /* JADX INFO: renamed from: F, reason: merged with bridge method [inline-methods] */
    public m d() {
        m mVar = new m();
        for (Map.Entry<String, j> entry : this.f52562b.entrySet()) {
            mVar.z(entry.getKey(), entry.getValue().d());
        }
        return mVar;
    }

    public j G(String str) {
        return this.f52562b.get(str);
    }

    public g H(String str) {
        return (g) this.f52562b.get(str);
    }

    public m J(String str) {
        return (m) this.f52562b.get(str);
    }

    public p K(String str) {
        return (p) this.f52562b.get(str);
    }

    public boolean L(String str) {
        return this.f52562b.containsKey(str);
    }

    public Set<String> M() {
        return this.f52562b.keySet();
    }

    @qj.a
    public j N(String str) {
        return this.f52562b.remove(str);
    }

    public Set<Map.Entry<String, j>> entrySet() {
        return this.f52562b.entrySet();
    }

    public boolean equals(Object obj) {
        if (obj != this) {
            return (obj instanceof m) && ((m) obj).f52562b.equals(this.f52562b);
        }
        return true;
    }

    public int hashCode() {
        return this.f52562b.hashCode();
    }

    public boolean isEmpty() {
        return this.f52562b.isEmpty();
    }

    public int size() {
        return this.f52562b.size();
    }

    public void z(String str, j jVar) {
        c0<String, j> c0Var = this.f52562b;
        if (jVar == null) {
            jVar = l.f52561b;
        }
        c0Var.put(str, jVar);
    }
}
