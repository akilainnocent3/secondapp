package com.google.gson;

import gm.d0;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes4.dex */
public final class g extends j implements Iterable<j> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList<j> f52395b;

    public g() {
        this.f52395b = new ArrayList<>();
    }

    public void A(Boolean bool) {
        this.f52395b.add(bool == null ? l.f52561b : new p(bool));
    }

    public void B(Character ch2) {
        this.f52395b.add(ch2 == null ? l.f52561b : new p(ch2));
    }

    public void C(Number number) {
        this.f52395b.add(number == null ? l.f52561b : new p(number));
    }

    public void D(String str) {
        this.f52395b.add(str == null ? l.f52561b : new p(str));
    }

    public void E(g gVar) {
        this.f52395b.addAll(gVar.f52395b);
    }

    public List<j> F() {
        return new d0(this.f52395b);
    }

    public boolean G(j jVar) {
        return this.f52395b.contains(jVar);
    }

    @Override // com.google.gson.j
    /* JADX INFO: renamed from: H, reason: merged with bridge method [inline-methods] */
    public g d() {
        if (this.f52395b.isEmpty()) {
            return new g();
        }
        g gVar = new g(this.f52395b.size());
        Iterator<j> it = this.f52395b.iterator();
        while (it.hasNext()) {
            gVar.z(it.next().d());
        }
        return gVar;
    }

    public j J(int i10) {
        return this.f52395b.get(i10);
    }

    public final j K() {
        int size = this.f52395b.size();
        if (size == 1) {
            return this.f52395b.get(0);
        }
        throw new IllegalStateException("Array must have size 1, but has size " + size);
    }

    @qj.a
    public j L(int i10) {
        return this.f52395b.remove(i10);
    }

    @qj.a
    public boolean M(j jVar) {
        return this.f52395b.remove(jVar);
    }

    @qj.a
    public j N(int i10, j jVar) {
        ArrayList<j> arrayList = this.f52395b;
        if (jVar == null) {
            jVar = l.f52561b;
        }
        return arrayList.set(i10, jVar);
    }

    @Override // com.google.gson.j
    public BigDecimal e() {
        return K().e();
    }

    public boolean equals(Object obj) {
        if (obj != this) {
            return (obj instanceof g) && ((g) obj).f52395b.equals(this.f52395b);
        }
        return true;
    }

    @Override // com.google.gson.j
    public BigInteger f() {
        return K().f();
    }

    @Override // com.google.gson.j
    public boolean g() {
        return K().g();
    }

    @Override // com.google.gson.j
    public byte h() {
        return K().h();
    }

    public int hashCode() {
        return this.f52395b.hashCode();
    }

    @Override // com.google.gson.j
    @Deprecated
    public char i() {
        return K().i();
    }

    public boolean isEmpty() {
        return this.f52395b.isEmpty();
    }

    @Override // java.lang.Iterable
    public Iterator<j> iterator() {
        return this.f52395b.iterator();
    }

    @Override // com.google.gson.j
    public double j() {
        return K().j();
    }

    @Override // com.google.gson.j
    public float l() {
        return K().l();
    }

    @Override // com.google.gson.j
    public int m() {
        return K().m();
    }

    @Override // com.google.gson.j
    public long r() {
        return K().r();
    }

    @Override // com.google.gson.j
    public Number s() {
        return K().s();
    }

    public int size() {
        return this.f52395b.size();
    }

    @Override // com.google.gson.j
    public short t() {
        return K().t();
    }

    @Override // com.google.gson.j
    public String u() {
        return K().u();
    }

    public void z(j jVar) {
        if (jVar == null) {
            jVar = l.f52561b;
        }
        this.f52395b.add(jVar);
    }

    public g(int i10) {
        this.f52395b = new ArrayList<>(i10);
    }
}
