package yads;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class w31 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final r31 f157182a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final mi2 f157183b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final k41 f157184c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final dk0 f157185d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Resources f157186e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f157187f;

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ w31(Context context, r31 r31Var, mi2 mi2Var) {
        s82 s82Var = w82.f157240d;
        d03 d03VarB = s82Var.a(context).b();
        dk0 dk0VarA = s82Var.a(context).a();
        Object obj = dw2.f148384j;
        this(context, r31Var, mi2Var, d03VarB, dk0VarA, cw2.a());
    }

    public final void a(u41 u41Var, t31 t31Var) {
        mi2 mi2Var = this.f157183b;
        mi2Var.getClass();
        String str = u41Var.f156272g;
        li2 li2Var = str != null ? new li2(str, new yz2(u41Var.f156266a, u41Var.f156267b)) : null;
        Bitmap bitmap = li2Var != null ? (Bitmap) mi2Var.f152462c.get(li2Var) : null;
        t31Var.a(bitmap != null ? new BitmapDrawable(this.f157186e, bitmap) : null);
        if (this.f157187f) {
            this.f157185d.a(u41Var.f156268c, new v31(t31Var));
        } else {
            b(u41Var, t31Var);
        }
    }

    public final void b(u41 u41Var, final t31 t31Var) {
        s31 s31Var = new s31() { // from class: yads.yc4
            @Override // yads.s31
            public final void a(Bitmap bitmap) {
                w31.a(t31Var, this, bitmap);
            }
        };
        Bitmap bitmapA = this.f157183b.a(u41Var);
        if (bitmapA != null) {
            s31Var.a(bitmapA);
            return;
        }
        mi2 mi2Var = this.f157183b;
        mi2Var.getClass();
        String str = u41Var.f156272g;
        li2 li2Var = str != null ? new li2(str, new yz2(u41Var.f156266a, u41Var.f156267b)) : null;
        s31Var.a(li2Var != null ? (Bitmap) mi2Var.f152462c.get(li2Var) : null);
        if (this.f157182a.a()) {
            String str2 = u41Var.f156268c;
            this.f157184c.a(str2, new u31(this, str2, s31Var), u41Var.f156266a, u41Var.f156267b);
        }
    }

    /* JADX WARN: Code duplicated, block: B:9:0x0025  */
    public w31(Context context, r31 r31Var, mi2 mi2Var, k41 k41Var, dk0 dk0Var, dw2 dw2Var) {
        boolean z10;
        nt2 nt2VarA;
        this.f157182a = r31Var;
        this.f157183b = mi2Var;
        this.f157184c = k41Var;
        this.f157185d = dk0Var;
        this.f157186e = context.getResources();
        if (r31Var.a() && (nt2VarA = dw2Var.a(context)) != null) {
            z10 = nt2VarA.d();
        }
        this.f157187f = z10;
    }

    public static final void a(t31 t31Var, w31 w31Var, Bitmap bitmap) {
        t31Var.a(bitmap != null ? new BitmapDrawable(w31Var.f157186e, bitmap) : null);
    }
}
