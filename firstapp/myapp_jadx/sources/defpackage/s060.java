package defpackage;

import android.os.Bundle;
import java.util.LinkedHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class s060 extends b3 {
    public final kni0 c;
    public int d;
    public String e;
    public final zd80 f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s060(vu60 vu60Var, LinkedHashMap linkedHashMap) {
        super(0);
        vu60Var.getClass();
        this.d = -1;
        this.e = "";
        this.f = ve80.a;
        this.c = new wu60(vu60Var, linkedHashMap);
    }

    @Override // defpackage.b3, defpackage.b5d
    public final boolean D() {
        return this.c.h(this.e) != null;
    }

    @Override // defpackage.b3
    public final Object J() {
        return Y();
    }

    public final <T> T X(tae<? extends T> taeVar) {
        return (T) super.z(taeVar);
    }

    public final Object Y() {
        Object objH = this.c.h(this.e);
        if (objH != null) {
            return objH;
        }
        dmy.a(this.e, "Unexpected null value for non-nullable argument ");
        return null;
    }

    @Override // defpackage.dma
    public final y3l d() {
        return this.f;
    }

    @Override // defpackage.b3, defpackage.b5d
    public final b5d l(pd80 pd80Var) {
        pd80Var.getClass();
        if (w060.e(pd80Var)) {
            this.e = pd80Var.e(0);
            this.d = 0;
        }
        return this;
    }

    @Override // defpackage.dma
    public final int v(pd80 pd80Var) {
        String strE;
        pd80Var.getClass();
        int i = this.d;
        do {
            i++;
            if (i >= pd80Var.d()) {
                return -1;
            }
            strE = pd80Var.e(i);
        } while (!this.c.f(strE));
        this.d = i;
        this.e = strE;
        return i;
    }

    @Override // defpackage.b5d
    public final <T> T z(tae<? extends T> taeVar) {
        taeVar.getClass();
        return (T) Y();
    }

    public s060(Bundle bundle, LinkedHashMap linkedHashMap) {
        super(0);
        this.d = -1;
        this.e = "";
        this.f = ve80.a;
        this.c = new uu60(bundle, linkedHashMap);
    }
}
