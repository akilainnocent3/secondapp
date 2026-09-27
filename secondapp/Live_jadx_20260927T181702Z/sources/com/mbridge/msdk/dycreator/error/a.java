package com.mbridge.msdk.dycreator.error;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f66545a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f66546b;

    public a(b bVar) {
        if (bVar != null) {
            this.f66545a = bVar.g();
            this.f66546b = bVar.h();
        }
    }

    public String toString() {
        return "DyError{errorCode=" + this.f66545a + fw.b.f85383j;
    }

    public a(int i10, String str) {
        this.f66545a = i10;
        this.f66546b = str;
    }
}
