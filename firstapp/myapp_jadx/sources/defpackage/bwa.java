package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class bwa {
    public static final /* synthetic */ ohp<Object>[] j;
    public final Object a;
    public final im5 b;
    public final gxa d;
    public final hwa e;
    public final gxa f;
    public final hwa g;
    public final cwa c = new cwa("parent");
    public final a h = new a(new gqe("wrap"));
    public final a i = new a(new gqe("wrap"));

    public final class a extends az1 {
        public a(gqe gqeVar) {
            this.b = gqeVar;
        }
    }

    static {
        otw otwVar = new otw(0, bwa.class, "width", "getWidth()Landroidx/constraintlayout/compose/Dimension;");
        jq40.a.getClass();
        j = new ohp[]{otwVar, new otw(0, bwa.class, "height", "getHeight()Landroidx/constraintlayout/compose/Dimension;"), new otw(0, bwa.class, "visibility", "getVisibility()Landroidx/constraintlayout/compose/Visibility;"), new otw(0, bwa.class, "scaleX", "getScaleX()F"), new otw(0, bwa.class, "scaleY", "getScaleY()F"), new otw(0, bwa.class, "rotationX", "getRotationX()F"), new otw(0, bwa.class, "rotationY", "getRotationY()F"), new otw(0, bwa.class, "rotationZ", "getRotationZ()F"), new otw(0, bwa.class, "translationX", "getTranslationX-D9Ej5fM()F"), new otw(0, bwa.class, "translationY", "getTranslationY-D9Ej5fM()F"), new otw(0, bwa.class, "translationZ", "getTranslationZ-D9Ej5fM()F"), new otw(0, bwa.class, "pivotX", "getPivotX()F"), new otw(0, bwa.class, "pivotY", "getPivotY()F"), new otw(0, bwa.class, "horizontalChainWeight", "getHorizontalChainWeight()F"), new otw(0, bwa.class, "verticalChainWeight", "getVerticalChainWeight()F")};
    }

    public bwa(Object obj, im5 im5Var) {
        this.a = obj;
        this.b = im5Var;
        this.d = new gxa(im5Var, -2);
        this.e = new hwa(im5Var, 0);
        this.f = new gxa(im5Var, -1);
        this.g = new hwa(im5Var, 1);
    }

    public static void a(bwa bwaVar, cwa cwaVar) {
        bwaVar.getClass();
        iwa.b bVar = cwaVar.d;
        iwa.b bVar2 = cwaVar.f;
        bwaVar.d.b(bVar, 0.0f);
        bwaVar.f.b(bVar2, 0.0f);
        bwaVar.b.v(0.5f, "hRtlBias");
    }

    public static void c(bwa bwaVar, cwa cwaVar) {
        iwa.a aVar = cwaVar.e;
        iwa.a aVar2 = cwaVar.g;
        bwaVar.e.b(aVar, 0.0f);
        bwaVar.g.b(aVar2, 0.0f);
        bwaVar.b.v(0.5f, "vBias");
    }

    public static void d(bwa bwaVar, iwa.b bVar, iwa.a aVar, iwa.b bVar2, iwa.a aVar2, int i) {
        im5 im5Var = bwaVar.b;
        float f = (i & 4096) != 0 ? 0.5f : 0.0f;
        bwaVar.d.b(bVar, 0.0f);
        bwaVar.f.b(bVar2, 0.0f);
        im5Var.v(f, "hRtlBias");
        bwaVar.e.b(aVar, 0.0f);
        bwaVar.g.b(aVar2, 0.0f);
        im5Var.v(0.5f, "vBias");
    }

    public final void b(cwa cwaVar) {
        d(this, cwaVar.d, cwaVar.e, cwaVar.f, cwaVar.g, 16368);
    }

    public final void e(gqe gqeVar) {
        this.i.e(this, j[1], gqeVar);
    }

    public final void f(float f) {
        if (Float.isNaN(f)) {
            return;
        }
        this.b.v(f, "hBias");
    }

    public final void g(float f) {
        if (Float.isNaN(f)) {
            return;
        }
        this.b.v(f, "vBias");
    }

    public final void h(gqe gqeVar) {
        this.h.e(this, j[0], gqeVar);
    }
}
