package defpackage;

import android.content.Context;
import com.google.android.material.slider.RangeSlider;
import com.sportybet.android.gp.tz.R;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.collections.b;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class ez7 {
    public final RangeSlider a;
    public List<Integer> b;
    public float c;
    public float d;
    public boolean e;
    public final a f;
    public final dz7 g;
    public wy7 h;
    public xy7 i;

    public static final class a implements f42 {
        public a() {
        }

        @Override // defpackage.f42
        public final void a(Object obj) {
            ez7.this.a(true);
        }

        @Override // defpackage.f42
        public final void b(Object obj) {
            ez7 ez7Var = ez7.this;
            wy7 wy7Var = ez7Var.h;
            if (wy7Var != null) {
                wy7Var.invoke(Integer.valueOf(ez7.b(ez7Var)), Integer.valueOf(ez7.c(ez7Var)));
            }
        }
    }

    public ez7(RangeSlider rangeSlider, List<Integer> list) {
        list.getClass();
        this.a = rangeSlider;
        this.b = list;
        this.d = 100.0f;
        a aVar = new a();
        this.f = aVar;
        dz7 dz7Var = new dz7(this);
        this.g = dz7Var;
        rangeSlider.setValueFrom(0.0f);
        rangeSlider.setValueTo(100.0f);
        List<Integer> list2 = this.b;
        int iJ = b.j(list2);
        this.b = list2;
        rangeSlider.T();
        rangeSlider.S();
        rangeSlider.R(aVar);
        rangeSlider.Q(dz7Var);
        if (b.j(this.b) >= 0 && iJ >= 0 && iJ <= b.j(this.b) && iJ >= 0) {
            List<Float> listK = b.k(Float.valueOf(Math.min((d() * 0.0f) + 0.0f, 100.0f)), Float.valueOf(Math.min((d() * iJ) + 0.0f, 100.0f)));
            if (Intrinsics.g(rangeSlider.getValues(), listK)) {
                Iterator<Float> it = rangeSlider.getValues().iterator();
                while (it.hasNext()) {
                    it.next().floatValue();
                    dz7Var.b(rangeSlider);
                }
            } else {
                rangeSlider.setValues(listK);
            }
        }
        a(true);
    }

    public static int b(ez7 ez7Var) {
        int iMax = Math.max(Math.min(b.j(ez7Var.b), (int) (ez7Var.c / ez7Var.d())), 0);
        List<Integer> list = ez7Var.b;
        return ((iMax < 0 || iMax >= list.size()) ? Integer.valueOf(((Number) CollectionsKt.T(ez7Var.b)).intValue()) : list.get(iMax)).intValue();
    }

    public static int c(ez7 ez7Var) {
        int iMax = Math.max(Math.min(b.j(ez7Var.b), (int) (ez7Var.d / ez7Var.d())), 0);
        List<Integer> list = ez7Var.b;
        return ((iMax < 0 || iMax >= list.size()) ? Integer.valueOf(((Number) CollectionsKt.b0(ez7Var.b)).intValue()) : list.get(iMax)).intValue();
    }

    public final void a(boolean z) {
        if (this.e == z) {
            return;
        }
        this.e = z;
        RangeSlider rangeSlider = this.a;
        Context context = rangeSlider.getContext();
        context.getClass();
        int i = R.color.brand_quaternary;
        rangeSlider.setTrackActiveTintList(th50.a(z ? R.color.brand_quaternary : R.color.line_type1_secondary, context.getTheme(), context.getResources()));
        Context context2 = rangeSlider.getContext();
        context2.getClass();
        rangeSlider.setTrackInactiveTintList(th50.a(R.color.background_type1_tertiary, context2.getTheme(), context2.getResources()));
        Context context3 = rangeSlider.getContext();
        context3.getClass();
        if (!z) {
            i = R.color.brand_tertiary;
        }
        rangeSlider.setThumbTintList(th50.a(i, context3.getTheme(), context3.getResources()));
    }

    public final float d() {
        Object bVar;
        try {
            zi50.a aVar = zi50.b;
            bVar = Float.valueOf(100.0f / b.j(this.b));
        } catch (Throwable th) {
            zi50.a aVar2 = zi50.b;
            bVar = new zi50.b(th);
        }
        if (zi50.a(bVar) != null) {
            bVar = Float.valueOf(100.0f);
        }
        return ((Number) bVar).floatValue();
    }
}
