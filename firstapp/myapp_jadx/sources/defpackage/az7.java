package defpackage;

import android.content.Context;
import android.text.Editable;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.slider.RangeSlider;
import com.sportybet.android.gp.tz.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.b;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes5.dex */
public final class az7 {
    public final View a;
    public final veb0 b;
    public final hy7 c;
    public final List<Pair<String, iy7>> d;
    public final iy7 e;
    public final List<Integer> f;
    public final oy7 g;
    public final oy7 h;
    public final oy7 i;
    public final gaj<iy7, Boolean, Boolean, Unit> j;
    public final Function1<Boolean, Unit> k;
    public final kaj<String, iy7, Boolean, Boolean, Boolean, Function2<? super iy7, ? super Boolean, Unit>, Pair<iy7, Function1<Boolean, Unit>>> l;
    public final Function1<Boolean, Unit> m;
    public final Function1<Boolean, Unit> n;
    public final ez7 o;
    public final ArrayList p;
    public iy7 q;
    public oy7 r;
    public oy7 s;
    public cz7 t;
    public cz7 u;
    public a v;
    public oy7 w;
    public final mpe0 x;
    public final mpe0 y;
    public bz7 z;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class a {
        public static final a a;
        public static final a b;
        public static final a c;
        public static final /* synthetic */ a[] d;

        static {
            a aVar = new a("NONE", 0);
            a = aVar;
            a aVar2 = new a("BEGIN", 1);
            b = aVar2;
            a aVar3 = new a("END", 2);
            c = aVar3;
            d = new a[]{aVar, aVar2, aVar3};
        }

        public a() {
            throw null;
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) d.clone();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public az7(View view, veb0 veb0Var, hy7 hy7Var, List<? extends Pair<String, ? extends iy7>> list, iy7 iy7Var, List<Integer> list2, oy7 oy7Var, oy7 oy7Var2, oy7 oy7Var3, gaj<? super iy7, ? super Boolean, ? super Boolean, Unit> gajVar, Function1<? super Boolean, Unit> function1, kaj<? super String, ? super iy7, ? super Boolean, ? super Boolean, ? super Boolean, ? super Function2<? super iy7, ? super Boolean, Unit>, ? extends Pair<? extends iy7, ? extends Function1<? super Boolean, Unit>>> kajVar, Function1<? super Boolean, Unit> function2, Function1<? super Boolean, Unit> function3) {
        view.getClass();
        list.getClass();
        iy7Var.getClass();
        list2.getClass();
        this.a = view;
        this.b = veb0Var;
        this.c = hy7Var;
        this.d = list;
        this.e = iy7Var;
        this.f = list2;
        this.g = oy7Var;
        this.h = oy7Var2;
        this.i = oy7Var3;
        this.j = gajVar;
        this.k = function1;
        this.l = kajVar;
        this.m = function2;
        this.n = function3;
        this.o = new ez7(veb0Var.f.d, list2);
        this.p = new ArrayList();
        this.q = iy7Var;
        this.r = oy7Var;
        this.s = oy7Var3;
        cz7 cz7Var = cz7.a;
        this.t = cz7Var;
        this.u = cz7Var;
        this.v = a.a;
        this.w = new oy7(0, 0);
        this.x = hwr.b(new Function0() { // from class: py7
            /* JADX WARN: Multi-variable type inference failed */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                az7 az7Var = this.a;
                hy7 hy7Var2 = az7Var.c;
                List<Pair<String, iy7>> list3 = az7Var.d;
                int iOrdinal = hy7Var2.ordinal();
                if (iOrdinal == 2) {
                    ArrayList arrayList = new ArrayList(l48.r(list3, 10));
                    Iterator<T> it = list3.iterator();
                    while (it.hasNext()) {
                        Pair pair = (Pair) it.next();
                        A a2 = pair.a;
                        B b = pair.b;
                        b.getClass();
                        arrayList.add(new Pair(a2, (iy7.b) b));
                    }
                    return arrayList;
                }
                if (iOrdinal != 3) {
                    hb5.a("Unsupported for custom range filter.");
                    return null;
                }
                ArrayList arrayList2 = new ArrayList(l48.r(list3, 10));
                Iterator<T> it2 = list3.iterator();
                while (it2.hasNext()) {
                    Pair pair2 = (Pair) it2.next();
                    A a3 = pair2.a;
                    B b2 = pair2.b;
                    b2.getClass();
                    arrayList2.add(new Pair(a3, (iy7.c) b2));
                }
                return arrayList2;
            }
        });
        this.y = hwr.b(new Function0() { // from class: ry7
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return new yop(this.a.a);
            }
        });
    }

    public static int i(Editable editable) {
        Object bVar;
        try {
            zi50.a aVar = zi50.b;
            bVar = Integer.valueOf(Integer.parseInt(editable.toString()));
        } catch (Throwable th) {
            zi50.a aVar2 = zi50.b;
            bVar = new zi50.b(th);
        }
        if (zi50.a(bVar) != null) {
            bVar = 0;
        }
        return ((Number) bVar).intValue();
    }

    public final void a(boolean z, boolean z2) {
        int color;
        veb0 veb0Var = this.b;
        ConstraintLayout constraintLayout = veb0Var.a;
        if (z) {
            color = constraintLayout.getContext().getColor(R.color.brand_quaternary);
        } else {
            if (z) {
                uhc.a();
                return;
            }
            color = constraintLayout.getContext().getColor(R.color.text_type1_primary);
        }
        int color2 = constraintLayout.getContext().getColor(R.color.text_disable_type1_primary);
        this.o.a(z);
        TextView textView = veb0Var.f.f;
        if (z2) {
            color = color2;
        }
        textView.setTextColor(color);
    }

    public final void b(boolean z) {
        int color;
        veb0 veb0Var = this.b;
        ConstraintLayout constraintLayout = veb0Var.a;
        xeb0 xeb0Var = veb0Var.f;
        if (z) {
            color = constraintLayout.getContext().getColor(R.color.brand_quaternary);
        } else {
            if (z) {
                uhc.a();
                return;
            }
            color = constraintLayout.getContext().getColor(R.color.text_type1_primary);
        }
        xeb0Var.e.setTextColor(color);
        xeb0Var.c.b.setTextColor(color);
        xeb0Var.c.c.setTextColor(color);
    }

    public final void c(a aVar) {
        Integer intOrNull;
        oy7 oy7Var = this.h;
        int i = oy7Var.a;
        int i2 = oy7Var.b;
        xeb0 xeb0Var = this.b.f;
        Editable text = xeb0Var.c.b.getText();
        text.getClass();
        int i3 = i(text);
        Editable text2 = xeb0Var.c.c.getText();
        text2.getClass();
        int i4 = i(text2);
        int iIntValue = (this.c != hy7.d || (intOrNull = StringsKt.toIntOrNull(gky.a.b(10.0d, true))) == null) ? 10 : intOrNull.intValue();
        int iOrdinal = aVar.ordinal();
        if (iOrdinal == 1) {
            if (i3 < i) {
                xeb0Var.c.b.setText(String.valueOf(i));
                return;
            } else {
                if (i3 > i2 || i3 >= i4) {
                    int i5 = i4 - iIntValue;
                    xeb0Var.c.b.setText(i5 < i ? String.valueOf(i) : String.valueOf(i5));
                    return;
                }
                return;
            }
        }
        if (iOrdinal != 2) {
            return;
        }
        if (i4 > i2) {
            xeb0Var.c.c.setText(String.valueOf(i2));
        } else if (i4 < i || i3 >= i4) {
            int i6 = i3 + iIntValue;
            xeb0Var.c.c.setText(i6 > i2 ? String.valueOf(i2) : String.valueOf(i6));
        }
    }

    public final void d() {
        this.p.clear();
        xeb0 xeb0Var = this.b.f;
        xeb0Var.c.b.removeTextChangedListener(this.z);
        xeb0Var.c.c.removeTextChangedListener(this.z);
        ez7 ez7Var = this.o;
        ez7Var.h = null;
        ez7Var.i = null;
        yop yopVar = (yop) this.y.getValue();
        yopVar.a.getViewTreeObserver().removeOnGlobalLayoutListener((ViewTreeObserver.OnGlobalLayoutListener) yopVar.d.getValue());
        yopVar.c = null;
        this.k.invoke(Boolean.FALSE);
        b(false);
        a(false, false);
    }

    public final void e() {
        ConstraintLayout constraintLayout = this.b.a;
        lop.b(constraintLayout, Boolean.FALSE);
        constraintLayout.setVisibility(8);
        d();
    }

    public final void f() {
        iy7 bVar;
        oy7 oy7Var = this.w;
        int i = oy7Var.a;
        int i2 = oy7Var.b;
        iy7 iy7Var = this.e;
        gaj<iy7, Boolean, Boolean, Unit> gajVar = this.j;
        if (i >= i2) {
            this.r = this.g;
            this.s = this.i;
            this.t = cz7.a;
            Boolean bool = Boolean.FALSE;
            gajVar.invoke(iy7Var, bool, bool);
            e();
            return;
        }
        int iOrdinal = this.u.ordinal();
        if (iOrdinal == 1) {
            oy7 oy7Var2 = this.w;
            this.r = new oy7(oy7Var2.a, oy7Var2.b);
        } else if (iOrdinal == 2) {
            oy7 oy7Var3 = this.w;
            this.s = new oy7(oy7Var3.a, oy7Var3.b);
        }
        int iOrdinal2 = this.c.ordinal();
        if (iOrdinal2 == 2) {
            oy7 oy7Var4 = this.w;
            bVar = new iy7.b(oy7Var4.a, oy7Var4.b);
        } else {
            if (iOrdinal2 != 3) {
                hb5.a("Unsupported for custom range filter.");
                return;
            }
            oy7 oy7Var5 = this.w;
            double dC = oy7Var5.a;
            double dC2 = oy7Var5.b;
            if (this.u == cz7.b) {
                dC = gky.a.c(dC);
                dC2 = gky.a.c(dC2);
            }
            bVar = new iy7.c(dC, dC2);
        }
        this.t = this.u;
        oy7 oy7Var6 = this.w;
        gajVar.invoke(bVar, Boolean.valueOf(jy7.a(iy7Var, oy7Var6.a, oy7Var6.b)), Boolean.FALSE);
        e();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void g() {
        Object obj;
        Function1 function1;
        xeb0 xeb0Var = this.b.f;
        Editable text = xeb0Var.c.b.getText();
        text.getClass();
        int i = i(text);
        Editable text2 = xeb0Var.c.c.getText();
        text2.getClass();
        int i2 = i(text2);
        this.u = cz7.b;
        this.w.getClass();
        this.w = new oy7(i, i2);
        this.r.getClass();
        this.r = new oy7(i, i2);
        boolean z = i == i2;
        ArrayList arrayList = this.p;
        int size = arrayList.size();
        int i3 = 0;
        do {
            if (i3 >= size) {
                obj = null;
                break;
            } else {
                obj = arrayList.get(i3);
                i3++;
            }
        } while (!jy7.b((iy7) ((Pair) obj).a, this.q));
        Pair pair = (Pair) obj;
        if (pair != null && (function1 = (Function1) pair.b) != null) {
            function1.invoke(Boolean.FALSE);
        }
        b(true);
        a(false, false);
        this.m.invoke(Boolean.valueOf(!z));
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0059  */
    /* JADX WARN: Code duplicated, block: B:56:0x01e3  */
    /* JADX WARN: Code duplicated, block: B:7:0x0034  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final void h(iy7 iy7Var) {
        int i;
        int i2;
        Object next;
        boolean z;
        int iOrdinal;
        veb0 veb0Var = this.b;
        LinearLayout linearLayout = veb0Var.d;
        linearLayout.setVisibility(4);
        xeb0 xeb0Var = veb0Var.f;
        xeb0Var.a.setVisibility(4);
        d();
        this.q = iy7Var;
        EditText editText = xeb0Var.c.b;
        hy7 hy7Var = hy7.d;
        hy7 hy7Var2 = this.c;
        if (hy7Var2 == hy7Var) {
            Context context = editText.getContext();
            context.getClass();
            if (gky.c(context)) {
                i = 4098;
            } else {
                i = 2;
            }
        } else {
            i = 2;
        }
        editText.setInputType(i);
        String strValueOf = String.valueOf(this.r.a);
        TextView.BufferType bufferType = TextView.BufferType.EDITABLE;
        editText.setText(strValueOf, bufferType);
        EditText editText2 = xeb0Var.c.c;
        if (hy7Var2 == hy7Var) {
            Context context2 = editText2.getContext();
            context2.getClass();
            i2 = gky.c(context2) ? 4098 : 2;
        }
        editText2.setInputType(i2);
        editText2.setText(String.valueOf(this.r.b), bufferType);
        bz7 bz7Var = new bz7(this);
        this.z = bz7Var;
        ty7 ty7Var = new ty7();
        View.OnFocusChangeListener onFocusChangeListener = new View.OnFocusChangeListener() { // from class: uy7
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view, boolean z2) {
                az7.a aVar;
                view.getClass();
                int id = view.getId();
                az7 az7Var = this.a;
                web0 web0Var = az7Var.b.f.c;
                if (id != web0Var.b.getId() && view.getId() != web0Var.c.getId()) {
                    az7Var.v = az7.a.a;
                    return;
                }
                if (!z2) {
                    az7Var.c(az7Var.v);
                    az7Var.v = az7.a.a;
                    return;
                }
                int id2 = view.getId();
                if (id2 == web0Var.b.getId()) {
                    aVar = az7.a.b;
                } else {
                    aVar = id2 == web0Var.c.getId() ? az7.a.c : az7.a.a;
                }
                az7Var.v = aVar;
                az7Var.g();
            }
        };
        web0 web0Var = xeb0Var.c;
        xeb0Var.c.b.addTextChangedListener(bz7Var);
        web0Var.c.addTextChangedListener(this.z);
        web0Var.b.setOnEditorActionListener(ty7Var);
        web0Var.c.setOnEditorActionListener(ty7Var);
        web0Var.b.setOnFocusChangeListener(onFocusChangeListener);
        web0Var.c.setOnFocusChangeListener(onFocusChangeListener);
        int i3 = 0;
        xeb0Var.e.setOnClickListener(new vy7(this, 0));
        wy7 wy7Var = new wy7(this, i3);
        ez7 ez7Var = this.o;
        ez7Var.getClass();
        ez7Var.h = wy7Var;
        ez7Var.i = new xy7(this, 0);
        veb0Var.c.setOnClickListener(new yy7(this, i3));
        veb0Var.b.setOnClickListener(new View.OnClickListener() { // from class: zy7
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                az7.a aVar;
                az7 az7Var = this.a;
                if (az7Var.u == cz7.b && (aVar = az7Var.v) != az7.a.a) {
                    az7Var.c(aVar);
                    az7Var.g();
                }
                az7Var.f();
            }
        });
        yop yopVar = (yop) this.y.getValue();
        qy7 qy7Var = new qy7(this, i3);
        yopVar.getClass();
        yopVar.a.getViewTreeObserver().addOnGlobalLayoutListener((ViewTreeObserver.OnGlobalLayoutListener) yopVar.d.getValue());
        yopVar.c = qy7Var;
        Integer numValueOf = Integer.valueOf(this.s.a);
        List<Integer> list = this.f;
        int iIndexOf = list.indexOf(numValueOf);
        if (iIndexOf < 0) {
            iIndexOf = 0;
        }
        int iIndexOf2 = list.indexOf(Integer.valueOf(this.s.b));
        if (iIndexOf2 < 0) {
            iIndexOf2 = list.size() - 1;
        }
        ez7Var.b = list;
        RangeSlider rangeSlider = ez7Var.a;
        rangeSlider.T();
        rangeSlider.S();
        rangeSlider.R(ez7Var.f);
        dz7 dz7Var = ez7Var.g;
        rangeSlider.Q(dz7Var);
        if (iIndexOf >= 0 && iIndexOf <= b.j(ez7Var.b) && iIndexOf2 >= 0 && iIndexOf2 <= b.j(ez7Var.b) && iIndexOf <= iIndexOf2) {
            List<Float> listK = b.k(Float.valueOf(Math.min((ez7Var.d() * iIndexOf) + 0.0f, 100.0f)), Float.valueOf(Math.min((ez7Var.d() * iIndexOf2) + 0.0f, 100.0f)));
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
        Iterator<T> it2 = this.d.iterator();
        do {
            if (!it2.hasNext()) {
                next = null;
                break;
            }
            next = it2.next();
        } while (!Intrinsics.g(((Pair) next).b, this.q));
        boolean z2 = ((Pair) next) == null || this.t != cz7.a;
        iy7 iy7Var2 = this.q;
        iy7 iy7Var3 = this.e;
        Intrinsics.g(iy7Var2, iy7Var3);
        boolean zEquals = this.i.equals(this.s);
        iy7 iy7Var4 = this.q;
        iy7Var4.getClass();
        if (iy7Var4 instanceof iy7.b) {
            iy7.b bVar = (iy7.b) iy7Var4;
            if (bVar.a == bVar.b) {
            }
        } else {
            if (iy7Var4 instanceof iy7.c) {
                iy7.c cVar = (iy7.c) iy7Var4;
                z = cVar.a == cVar.b;
            }
        }
        for (Pair pair : (List) this.x.getValue()) {
            this.p.add(this.l.f(pair.a, pair.b, Boolean.valueOf((z2 && Intrinsics.g(pair.b, iy7Var3) && Intrinsics.g(pair.b, this.q)) ? false : Intrinsics.g(pair.b, this.q)), Boolean.FALSE, Boolean.TRUE, new Function2() { // from class: sy7
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    iy7 iy7Var5 = (iy7) obj;
                    ((Boolean) obj2).getClass();
                    iy7Var5.getClass();
                    cz7 cz7Var = cz7.a;
                    az7 az7Var = this.a;
                    az7Var.u = cz7Var;
                    az7Var.t = cz7Var;
                    gaj<iy7, Boolean, Boolean, Unit> gajVar = az7Var.j;
                    Boolean bool = Boolean.FALSE;
                    gajVar.invoke(iy7Var5, bool, bool);
                    az7Var.e();
                    return Unit.a;
                }
            }));
        }
        Function1<Boolean, Unit> function1 = this.m;
        if (!z2 || (iOrdinal = this.t.ordinal()) == 0) {
            b(false);
            a(false, zEquals);
            function1.invoke(Boolean.FALSE);
        } else if (iOrdinal == 1) {
            b(true);
            a(false, zEquals);
            function1.invoke(Boolean.valueOf(!z));
        } else {
            if (iOrdinal != 2) {
                uhc.a();
                return;
            }
            oy7 oy7Var = this.s;
            boolean zA = jy7.a(iy7Var3, oy7Var.a, oy7Var.b);
            b(false);
            a(true, zEquals && !zA);
            function1.invoke(Boolean.valueOf(!z));
        }
        this.n.invoke(Boolean.TRUE);
        linearLayout.setVisibility(0);
        xeb0Var.a.setVisibility(0);
    }
}
