package com.google.android.material.circularreveal;

import android.animation.TypeEvaluator;
import android.graphics.drawable.Drawable;
import android.util.Property;
import defpackage.bdv;

/* JADX INFO: loaded from: classes4.dex */
public interface c extends com.google.android.material.circularreveal.b.a {

    public static class a implements TypeEvaluator<d> {
        public static final a b = new a();
        public final d a = new d();

        @Override // android.animation.TypeEvaluator
        public final d evaluate(float f, d dVar, d dVar2) {
            d dVar3 = dVar;
            d dVar4 = dVar2;
            float fC = bdv.c(dVar3.a, dVar4.a, f);
            float fC2 = bdv.c(dVar3.b, dVar4.b, f);
            float fC3 = bdv.c(dVar3.c, dVar4.c, f);
            d dVar5 = this.a;
            dVar5.a = fC;
            dVar5.b = fC2;
            dVar5.c = fC3;
            return dVar5;
        }
    }

    public static class b extends Property<c, d> {
        public static final b a = new b(d.class, "circularReveal");

        @Override // android.util.Property
        public final d get(c cVar) {
            return cVar.getRevealInfo();
        }

        @Override // android.util.Property
        public final void set(c cVar, d dVar) {
            cVar.setRevealInfo(dVar);
        }
    }

    /* JADX INFO: renamed from: com.google.android.material.circularreveal.c$c, reason: collision with other inner class name */
    public static class C0194c extends Property<c, Integer> {
        public static final C0194c a = new C0194c(Integer.class, "circularRevealScrimColor");

        @Override // android.util.Property
        public final Integer get(c cVar) {
            return Integer.valueOf(cVar.getCircularRevealScrimColor());
        }

        @Override // android.util.Property
        public final void set(c cVar, Integer num) {
            cVar.setCircularRevealScrimColor(num.intValue());
        }
    }

    void a();

    void b();

    int getCircularRevealScrimColor();

    d getRevealInfo();

    void setCircularRevealOverlayDrawable(Drawable drawable);

    void setCircularRevealScrimColor(int i);

    void setRevealInfo(d dVar);

    public static class d {
        public float a;
        public float b;
        public float c;

        public d(float f, float f2, float f3) {
            this.a = f;
            this.b = f2;
            this.c = f3;
        }

        public d() {
        }

        public d(d dVar) {
            this(dVar.a, dVar.b, dVar.c);
        }
    }
}
