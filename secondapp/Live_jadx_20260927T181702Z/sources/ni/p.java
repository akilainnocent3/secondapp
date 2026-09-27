package ni;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import androidx.annotation.NonNull;
import k.c1;
import k.y0;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes5.dex */
public class p {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final e f116786m = new n(0.5f);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public f f116787a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public f f116788b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public f f116789c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public f f116790d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public e f116791e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public e f116792f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public e f116793g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public e f116794h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public h f116795i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public h f116796j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public h f116797k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public h f116798l;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    @y0({y0.a.LIBRARY_GROUP})
    public interface c {
        @NonNull
        e a(@NonNull e eVar);
    }

    @NonNull
    public static b a() {
        return new b();
    }

    @NonNull
    public static b b(Context context, @c1 int i10, @c1 int i11) {
        return c(context, i10, i11, 0);
    }

    @NonNull
    public static b c(Context context, @c1 int i10, @c1 int i11, int i12) {
        return d(context, i10, i11, new ni.a(i12));
    }

    @NonNull
    public static b d(Context context, @c1 int i10, @c1 int i11, @NonNull e eVar) {
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(context, i10);
        if (i11 != 0) {
            contextThemeWrapper = new ContextThemeWrapper(contextThemeWrapper, i11);
        }
        TypedArray typedArrayObtainStyledAttributes = contextThemeWrapper.obtainStyledAttributes(ih.a.o.f93587kt);
        try {
            int i12 = typedArrayObtainStyledAttributes.getInt(ih.a.o.f93623lt, 0);
            int i13 = typedArrayObtainStyledAttributes.getInt(ih.a.o.f93731ot, i12);
            int i14 = typedArrayObtainStyledAttributes.getInt(ih.a.o.f93767pt, i12);
            int i15 = typedArrayObtainStyledAttributes.getInt(ih.a.o.f93695nt, i12);
            int i16 = typedArrayObtainStyledAttributes.getInt(ih.a.o.f93659mt, i12);
            e eVarM = m(typedArrayObtainStyledAttributes, ih.a.o.f93803qt, eVar);
            e eVarM2 = m(typedArrayObtainStyledAttributes, ih.a.o.f93911tt, eVarM);
            e eVarM3 = m(typedArrayObtainStyledAttributes, ih.a.o.f93947ut, eVarM);
            e eVarM4 = m(typedArrayObtainStyledAttributes, ih.a.o.f93875st, eVarM);
            return new b().I(i13, eVarM2).N(i14, eVarM3).A(i15, eVarM4).v(i16, m(typedArrayObtainStyledAttributes, ih.a.o.f93839rt, eVarM));
        } finally {
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    @NonNull
    public static b e(@NonNull Context context, AttributeSet attributeSet, @k.f int i10, @c1 int i11) {
        return f(context, attributeSet, i10, i11, 0);
    }

    @NonNull
    public static b f(@NonNull Context context, AttributeSet attributeSet, @k.f int i10, @c1 int i11, int i12) {
        return g(context, attributeSet, i10, i11, new ni.a(i12));
    }

    @NonNull
    public static b g(@NonNull Context context, AttributeSet attributeSet, @k.f int i10, @c1 int i11, @NonNull e eVar) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, ih.a.o.Qn, i10, i11);
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(ih.a.o.Rn, 0);
        int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(ih.a.o.Sn, 0);
        typedArrayObtainStyledAttributes.recycle();
        return d(context, resourceId, resourceId2, eVar);
    }

    @NonNull
    public static e m(TypedArray typedArray, int i10, @NonNull e eVar) {
        TypedValue typedValuePeekValue = typedArray.peekValue(i10);
        if (typedValuePeekValue != null) {
            int i11 = typedValuePeekValue.type;
            if (i11 == 5) {
                return new ni.a(TypedValue.complexToDimensionPixelSize(typedValuePeekValue.data, typedArray.getResources().getDisplayMetrics()));
            }
            if (i11 == 6) {
                return new n(typedValuePeekValue.getFraction(1.0f, 1.0f));
            }
        }
        return eVar;
    }

    @NonNull
    public h h() {
        return this.f116797k;
    }

    @NonNull
    public f i() {
        return this.f116790d;
    }

    @NonNull
    public e j() {
        return this.f116794h;
    }

    @NonNull
    public f k() {
        return this.f116789c;
    }

    @NonNull
    public e l() {
        return this.f116793g;
    }

    @NonNull
    public h n() {
        return this.f116798l;
    }

    @NonNull
    public h o() {
        return this.f116796j;
    }

    @NonNull
    public h p() {
        return this.f116795i;
    }

    @NonNull
    public f q() {
        return this.f116787a;
    }

    @NonNull
    public e r() {
        return this.f116791e;
    }

    @NonNull
    public f s() {
        return this.f116788b;
    }

    @NonNull
    public e t() {
        return this.f116792f;
    }

    @y0({y0.a.LIBRARY_GROUP})
    public boolean u(@NonNull RectF rectF) {
        boolean z10 = this.f116798l.getClass().equals(h.class) && this.f116796j.getClass().equals(h.class) && this.f116795i.getClass().equals(h.class) && this.f116797k.getClass().equals(h.class);
        float fA = this.f116791e.a(rectF);
        return z10 && ((this.f116792f.a(rectF) > fA ? 1 : (this.f116792f.a(rectF) == fA ? 0 : -1)) == 0 && (this.f116794h.a(rectF) > fA ? 1 : (this.f116794h.a(rectF) == fA ? 0 : -1)) == 0 && (this.f116793g.a(rectF) > fA ? 1 : (this.f116793g.a(rectF) == fA ? 0 : -1)) == 0) && ((this.f116788b instanceof o) && (this.f116787a instanceof o) && (this.f116789c instanceof o) && (this.f116790d instanceof o));
    }

    @NonNull
    public b v() {
        return new b(this);
    }

    @NonNull
    public p w(float f10) {
        return v().o(f10).m();
    }

    @NonNull
    public p x(@NonNull e eVar) {
        return v().p(eVar).m();
    }

    @NonNull
    @y0({y0.a.LIBRARY_GROUP})
    public p y(@NonNull c cVar) {
        return v().L(cVar.a(r())).Q(cVar.a(t())).y(cVar.a(j())).D(cVar.a(l())).m();
    }

    public p(@NonNull b bVar) {
        this.f116787a = bVar.f116799a;
        this.f116788b = bVar.f116800b;
        this.f116789c = bVar.f116801c;
        this.f116790d = bVar.f116802d;
        this.f116791e = bVar.f116803e;
        this.f116792f = bVar.f116804f;
        this.f116793g = bVar.f116805g;
        this.f116794h = bVar.f116806h;
        this.f116795i = bVar.f116807i;
        this.f116796j = bVar.f116808j;
        this.f116797k = bVar.f116809k;
        this.f116798l = bVar.f116810l;
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NonNull
        public f f116799a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NonNull
        public f f116800b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @NonNull
        public f f116801c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @NonNull
        public f f116802d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        @NonNull
        public e f116803e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        @NonNull
        public e f116804f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        @NonNull
        public e f116805g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        @NonNull
        public e f116806h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        @NonNull
        public h f116807i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        @NonNull
        public h f116808j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        @NonNull
        public h f116809k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        @NonNull
        public h f116810l;

        public b() {
            this.f116799a = l.b();
            this.f116800b = l.b();
            this.f116801c = l.b();
            this.f116802d = l.b();
            this.f116803e = new ni.a(0.0f);
            this.f116804f = new ni.a(0.0f);
            this.f116805g = new ni.a(0.0f);
            this.f116806h = new ni.a(0.0f);
            this.f116807i = l.c();
            this.f116808j = l.c();
            this.f116809k = l.c();
            this.f116810l = l.c();
        }

        public static float n(f fVar) {
            if (fVar instanceof o) {
                return ((o) fVar).f116785a;
            }
            if (fVar instanceof g) {
                return ((g) fVar).f116723a;
            }
            return -1.0f;
        }

        @NonNull
        @qj.a
        public b A(int i10, @NonNull e eVar) {
            return B(l.a(i10)).D(eVar);
        }

        @NonNull
        @qj.a
        public b B(@NonNull f fVar) {
            this.f116801c = fVar;
            float fN = n(fVar);
            if (fN != -1.0f) {
                C(fN);
            }
            return this;
        }

        @NonNull
        @qj.a
        public b C(@k.q float f10) {
            this.f116805g = new ni.a(f10);
            return this;
        }

        @NonNull
        @qj.a
        public b D(@NonNull e eVar) {
            this.f116805g = eVar;
            return this;
        }

        @NonNull
        @qj.a
        public b E(@NonNull h hVar) {
            this.f116810l = hVar;
            return this;
        }

        @NonNull
        @qj.a
        public b F(@NonNull h hVar) {
            this.f116808j = hVar;
            return this;
        }

        @NonNull
        @qj.a
        public b G(@NonNull h hVar) {
            this.f116807i = hVar;
            return this;
        }

        @NonNull
        @qj.a
        public b H(int i10, @k.q float f10) {
            return J(l.a(i10)).K(f10);
        }

        @NonNull
        @qj.a
        public b I(int i10, @NonNull e eVar) {
            return J(l.a(i10)).L(eVar);
        }

        @NonNull
        @qj.a
        public b J(@NonNull f fVar) {
            this.f116799a = fVar;
            float fN = n(fVar);
            if (fN != -1.0f) {
                K(fN);
            }
            return this;
        }

        @NonNull
        @qj.a
        public b K(@k.q float f10) {
            this.f116803e = new ni.a(f10);
            return this;
        }

        @NonNull
        @qj.a
        public b L(@NonNull e eVar) {
            this.f116803e = eVar;
            return this;
        }

        @NonNull
        @qj.a
        public b M(int i10, @k.q float f10) {
            return O(l.a(i10)).P(f10);
        }

        @NonNull
        @qj.a
        public b N(int i10, @NonNull e eVar) {
            return O(l.a(i10)).Q(eVar);
        }

        @NonNull
        @qj.a
        public b O(@NonNull f fVar) {
            this.f116800b = fVar;
            float fN = n(fVar);
            if (fN != -1.0f) {
                P(fN);
            }
            return this;
        }

        @NonNull
        @qj.a
        public b P(@k.q float f10) {
            this.f116804f = new ni.a(f10);
            return this;
        }

        @NonNull
        @qj.a
        public b Q(@NonNull e eVar) {
            this.f116804f = eVar;
            return this;
        }

        @NonNull
        public p m() {
            return new p(this);
        }

        @NonNull
        @qj.a
        public b o(@k.q float f10) {
            return K(f10).P(f10).C(f10).x(f10);
        }

        @NonNull
        @qj.a
        public b p(@NonNull e eVar) {
            return L(eVar).Q(eVar).D(eVar).y(eVar);
        }

        @NonNull
        @qj.a
        public b q(int i10, @k.q float f10) {
            return r(l.a(i10)).o(f10);
        }

        @NonNull
        @qj.a
        public b r(@NonNull f fVar) {
            return J(fVar).O(fVar).B(fVar).w(fVar);
        }

        @NonNull
        @qj.a
        public b s(@NonNull h hVar) {
            return E(hVar).G(hVar).F(hVar).t(hVar);
        }

        @NonNull
        @qj.a
        public b t(@NonNull h hVar) {
            this.f116809k = hVar;
            return this;
        }

        @NonNull
        @qj.a
        public b u(int i10, @k.q float f10) {
            return w(l.a(i10)).x(f10);
        }

        @NonNull
        @qj.a
        public b v(int i10, @NonNull e eVar) {
            return w(l.a(i10)).y(eVar);
        }

        @NonNull
        @qj.a
        public b w(@NonNull f fVar) {
            this.f116802d = fVar;
            float fN = n(fVar);
            if (fN != -1.0f) {
                x(fN);
            }
            return this;
        }

        @NonNull
        @qj.a
        public b x(@k.q float f10) {
            this.f116806h = new ni.a(f10);
            return this;
        }

        @NonNull
        @qj.a
        public b y(@NonNull e eVar) {
            this.f116806h = eVar;
            return this;
        }

        @NonNull
        @qj.a
        public b z(int i10, @k.q float f10) {
            return B(l.a(i10)).C(f10);
        }

        public b(@NonNull p pVar) {
            this.f116799a = l.b();
            this.f116800b = l.b();
            this.f116801c = l.b();
            this.f116802d = l.b();
            this.f116803e = new ni.a(0.0f);
            this.f116804f = new ni.a(0.0f);
            this.f116805g = new ni.a(0.0f);
            this.f116806h = new ni.a(0.0f);
            this.f116807i = l.c();
            this.f116808j = l.c();
            this.f116809k = l.c();
            this.f116810l = l.c();
            this.f116799a = pVar.f116787a;
            this.f116800b = pVar.f116788b;
            this.f116801c = pVar.f116789c;
            this.f116802d = pVar.f116790d;
            this.f116803e = pVar.f116791e;
            this.f116804f = pVar.f116792f;
            this.f116805g = pVar.f116793g;
            this.f116806h = pVar.f116794h;
            this.f116807i = pVar.f116795i;
            this.f116808j = pVar.f116796j;
            this.f116809k = pVar.f116797k;
            this.f116810l = pVar.f116798l;
        }
    }

    public p() {
        this.f116787a = l.b();
        this.f116788b = l.b();
        this.f116789c = l.b();
        this.f116790d = l.b();
        this.f116791e = new ni.a(0.0f);
        this.f116792f = new ni.a(0.0f);
        this.f116793g = new ni.a(0.0f);
        this.f116794h = new ni.a(0.0f);
        this.f116795i = l.c();
        this.f116796j = l.c();
        this.f116797k = l.c();
        this.f116798l = l.c();
    }
}
