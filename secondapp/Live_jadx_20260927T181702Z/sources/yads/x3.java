package yads;

import android.content.Context;
import android.view.View;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class x3 implements y3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final lu2 f157642a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final v9 f157643b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final d4 f157644c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final uz1 f157645d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final p53 f157646e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final za f157647f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final zy1 f157648g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final j83 f157649h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final s5 f157650i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final v3 f157651j;

    public /* synthetic */ x3(Context context, lu2 lu2Var, v9 v9Var, d4 d4Var, uz1 uz1Var, p53 p53Var) {
        za zaVar = new za(context, lu2Var, d4Var);
        this(lu2Var, v9Var, d4Var, uz1Var, p53Var, zaVar, new zy1(context, d4Var, lu2Var, v9Var), new j83(zaVar), new s5(uz1Var), new v3());
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(View view, if1 if1Var, v0 v0Var, k42 k42Var, or.f fVar) {
        w3 w3Var;
        x3 x3Var;
        oa2 oa2Var;
        yu uuVar;
        if (fVar instanceof w3) {
            w3Var = (w3) fVar;
            int i10 = w3Var.f157181g;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                w3Var.f157181g = i10 - Integer.MIN_VALUE;
            } else {
                w3Var = new w3(this, fVar);
            }
        } else {
            w3Var = new w3(this, fVar);
        }
        Object objA = w3Var.f157179e;
        Object objL = qr.d.l();
        int i11 = w3Var.f157181g;
        if (i11 == 0) {
            dr.j1.n(objA);
            List list = if1Var.f150589a;
            w3Var.f157176b = this;
            w3Var.f157177c = if1Var;
            w3Var.f157178d = k42Var;
            w3Var.f157181g = 1;
            objA = v0Var.a(view, list, w3Var);
            if (objA == objL) {
                return objL;
            }
            x3Var = this;
            oa2Var = k42Var;
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oa2 oa2Var2 = w3Var.f157178d;
            if1Var = w3Var.f157177c;
            x3Var = w3Var.f157176b;
            dr.j1.n(objA);
            oa2Var = oa2Var2;
        }
        o01 o01Var = (o01) objA;
        String str = if1Var.f150592d;
        if (str == null || str.length() <= 0) {
            str = null;
        }
        v3 v3Var = x3Var.f157651j;
        sg2 sg2Var = o01Var.f153288b;
        v3Var.getClass();
        if (str != null && sg2Var != null) {
            uuVar = xu.f157993a;
        } else if (str != null) {
            uuVar = vu.f157089a;
        } else {
            uuVar = sg2Var != null ? new uu(sg2Var) : wu.f157509a;
        }
        x3Var.f157649h.a(if1Var.f150591c, uuVar);
        if (str != null) {
            oa2Var.a(str);
        }
        return o01Var;
    }

    public x3(lu2 lu2Var, v9 v9Var, d4 d4Var, uz1 uz1Var, p53 p53Var, za zaVar, zy1 zy1Var, j83 j83Var, s5 s5Var, v3 v3Var) {
        this.f157642a = lu2Var;
        this.f157643b = v9Var;
        this.f157644c = d4Var;
        this.f157645d = uz1Var;
        this.f157646e = p53Var;
        this.f157647f = zaVar;
        this.f157648g = zy1Var;
        this.f157649h = j83Var;
        this.f157650i = s5Var;
        this.f157651j = v3Var;
    }
}
