package defpackage;

import android.graphics.PointF;

/* JADX INFO: loaded from: classes.dex */
public final class ekf0 extends cpt<kye> {
    public final /* synthetic */ oot c;
    public final /* synthetic */ cpt d;
    public final /* synthetic */ kye e;

    public ekf0(oot ootVar, cpt cptVar, kye kyeVar) {
        this.c = ootVar;
        this.d = cptVar;
        this.e = kyeVar;
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [T, java.lang.String] */
    /* JADX WARN: Type inference failed for: r3v2, types: [T, java.lang.String] */
    @Override // defpackage.cpt
    public final kye a(oot<kye> ootVar) {
        float f = ootVar.a;
        float f2 = ootVar.b;
        ?? r2 = ootVar.c.a;
        ?? r3 = ootVar.d.a;
        float f3 = ootVar.e;
        float f4 = ootVar.f;
        float f5 = ootVar.g;
        oot ootVar2 = this.c;
        ootVar2.a = f;
        ootVar2.b = f2;
        ootVar2.c = r2;
        ootVar2.d = r3;
        ootVar2.e = f3;
        ootVar2.f = f4;
        ootVar2.g = f5;
        String str = (String) this.d.b;
        kye kyeVar = ootVar.f == 1.0f ? ootVar.d : ootVar.c;
        String str2 = kyeVar.b;
        float f6 = kyeVar.c;
        kye.a aVar = kyeVar.d;
        int i = kyeVar.e;
        float f7 = kyeVar.f;
        float f8 = kyeVar.g;
        int i2 = kyeVar.h;
        int i3 = kyeVar.i;
        float f9 = kyeVar.j;
        boolean z = kyeVar.k;
        PointF pointF = kyeVar.l;
        PointF pointF2 = kyeVar.m;
        kye kyeVar2 = this.e;
        kyeVar2.a = str;
        kyeVar2.b = str2;
        kyeVar2.c = f6;
        kyeVar2.d = aVar;
        kyeVar2.e = i;
        kyeVar2.f = f7;
        kyeVar2.g = f8;
        kyeVar2.h = i2;
        kyeVar2.i = i3;
        kyeVar2.j = f9;
        kyeVar2.k = z;
        kyeVar2.l = pointF;
        kyeVar2.m = pointF2;
        return kyeVar2;
    }
}
