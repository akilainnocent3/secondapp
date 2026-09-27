package com.bykv.vk.openvk.preload.a;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes2.dex */
final class i implements b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected e f31669a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f31670b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private List<h> f31671c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private d f31672d;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class a extends Exception {
        public a(Throwable th2) {
            super(th2);
        }
    }

    public i(List<h> list, int i10, e eVar, d dVar) {
        this.f31671c = list;
        this.f31670b = i10;
        this.f31669a = eVar;
        this.f31672d = dVar;
    }

    private d c(Class cls) {
        d dVar = this.f31672d;
        while (dVar != null && dVar.getClass() != cls) {
            dVar = dVar.f31651a;
        }
        return dVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.bykv.vk.openvk.preload.a.b
    public final Object a(Object obj) throws Exception {
        d dVar = this.f31672d;
        if (dVar != null) {
            dVar.f31653c = obj;
            dVar.e();
        }
        if (this.f31670b >= this.f31671c.size()) {
            return obj;
        }
        h hVar = this.f31671c.get(this.f31670b);
        Class<? extends d> cls = hVar.f31663a;
        d dVar2 = (d) this.f31669a.a(cls);
        if (dVar2 == null) {
            throw new IllegalArgumentException("interceptor == null , index = " + obj + " , class: " + cls);
        }
        com.bykv.vk.openvk.preload.a.b.a aVarA = hVar.a();
        i iVar = new i(this.f31671c, this.f31670b + 1, this.f31669a, dVar2);
        dVar2.a(iVar, this.f31672d, obj, aVarA, hVar.b());
        dVar2.c();
        try {
            Object objA = dVar2.a(iVar, obj);
            dVar2.d();
            return objA;
        } catch (a e10) {
            dVar2.c(e10.getCause());
            throw e10;
        } catch (Throwable th2) {
            dVar2.b(th2);
            throw new a(th2);
        }
    }

    @Override // com.bykv.vk.openvk.preload.a.b
    public final Object b(Class cls) {
        d dVarC = c(cls);
        if (dVarC != null) {
            return dVarC.f31653c;
        }
        throw new IllegalArgumentException("can not find pre Interceptor , class:".concat(String.valueOf(cls)));
    }

    @Override // com.bykv.vk.openvk.preload.a.b
    public final Object a(Class cls) {
        d dVarC = c(cls);
        if (dVarC != null) {
            return dVarC.f31652b;
        }
        throw new IllegalArgumentException("can not find pre Interceptor , class:".concat(String.valueOf(cls)));
    }
}
