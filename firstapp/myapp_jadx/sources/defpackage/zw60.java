package defpackage;

import kotlin.collections.b;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class zw60 implements Function2 {
    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        al0 al0Var;
        Object objA;
        wv60 wv60Var = (wv60) obj;
        nk0.d dVar = (nk0.d) obj2;
        T t = dVar.a;
        if (t instanceof qrz) {
            al0Var = al0.a;
        } else if (t instanceof ora0) {
            al0Var = al0.b;
        } else if (t instanceof nxh0) {
            al0Var = al0.c;
        } else if (t instanceof rmh0) {
            al0Var = al0.d;
        } else if (t instanceof rfs.b) {
            al0Var = al0.e;
        } else if (t instanceof rfs.a) {
            al0Var = al0.f;
        } else {
            if (!(t instanceof e9e0)) {
                bl0.a();
                return null;
            }
            al0Var = al0.i;
        }
        switch (al0Var.ordinal()) {
            case 0:
                t.getClass();
                objA = kx60.a((qrz) t, kx60.h, wv60Var);
                break;
            case 1:
                t.getClass();
                objA = kx60.a((ora0) t, kx60.i, wv60Var);
                break;
            case 2:
                t.getClass();
                objA = kx60.a((nxh0) t, kx60.d, wv60Var);
                break;
            case 3:
                t.getClass();
                objA = kx60.a((rmh0) t, kx60.e, wv60Var);
                break;
            case 4:
                t.getClass();
                objA = kx60.a((rfs.b) t, kx60.f, wv60Var);
                break;
            case 5:
                t.getClass();
                objA = kx60.a((rfs.a) t, kx60.g, wv60Var);
                break;
            case 6:
                t.getClass();
                objA = ((e9e0) t).a;
                break;
            default:
                uhc.a();
                return null;
        }
        return b.f(al0Var, objA, Integer.valueOf(dVar.b), Integer.valueOf(dVar.c), dVar.d);
    }
}
