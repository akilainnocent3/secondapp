package com.bykv.vk.openvk.preload.a;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes2.dex */
public abstract class j<IN, OUT> extends l<IN, OUT> {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private String f31673d;

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.bykv.vk.openvk.preload.a.d
    public final Object a(b<OUT> bVar, IN in2) throws Throwable {
        new m(bVar);
        this.f31673d = a(in2);
        l.a aVar = a().get(this.f31673d);
        while (aVar != null) {
            List<h> list = aVar.f31676a;
            try {
                Object objA = c.a(list, bVar.f31669a, this).a(in2);
                return !l.a(list) ? objA : bVar.a(objA);
            } catch (i.a e10) {
                Throwable cause = e10.getCause();
                new m(bVar);
                this.f31673d = a(in2, cause, this.f31673d);
                aVar = a().get(this.f31673d);
            } catch (Throwable th2) {
                new m(bVar);
                this.f31673d = a(in2, th2, this.f31673d);
                aVar = a().get(this.f31673d);
            }
        }
        throw new IllegalArgumentException("can not found branch，branch name is：" + this.f31673d);
    }

    public abstract String a(IN in2);

    public abstract String a(IN in2, Throwable th2, String str);
}
