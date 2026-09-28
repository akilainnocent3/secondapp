package defpackage;

import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final class hb80 {
    public static final ob80<List<String>> a = new ob80<>("ContentDescription", true, b.a);
    public static final ob80<String> b = new ob80<>("StateDescription", 0);
    public static final ob80<m230> c = new ob80<>("ProgressBarRangeInfo", 0);
    public static final ob80<String> d = new ob80<>("PaneTitle", true, i.a);
    public static final ob80<Unit> e = new ob80<>("SelectableGroup", 0);
    public static final ob80<u38> f = new ob80<>("CollectionInfo", 0);
    public static final ob80<x38> g = new ob80<>("CollectionItemInfo", 0);
    public static final ob80<Unit> h = new ob80<>("Heading", 0);
    public static final ob80<Unit> i = new ob80<>("Disabled", 0);
    public static final ob80<wrs> j = new ob80<>("LiveRegion", 0);
    public static final ob80<Boolean> k = new ob80<>("Focused", 0);
    public static final ob80<Boolean> l = new ob80<>("IsContainer", 0);
    public static final ob80<Boolean> m = new ob80<>("IsTraversalGroup");
    public static final ob80<Boolean> n = new ob80<>("IsSensitiveData");
    public static final ob80<Unit> o = new ob80<>("InvisibleToUser", e.a);
    public static final ob80<Unit> p = new ob80<>("HideFromAccessibility", d.a);
    public static final ob80<g0b> q = new ob80<>("ContentType", c.a);
    public static final ob80<kza> r = new ob80<>("ContentDataType", a.a);
    public static final ob80<Float> s = new ob80<>("TraversalIndex", n.a);
    public static final ob80<vo70> t = new ob80<>("HorizontalScrollAxisRange", 0);
    public static final ob80<vo70> u = new ob80<>("VerticalScrollAxisRange", 0);
    public static final ob80<Unit> v = new ob80<>("IsPopup", true, g.a);
    public static final ob80<Unit> w = new ob80<>("IsDialog", true, f.a);
    public static final ob80<su50> x = new ob80<>("Role", true, j.a);
    public static final ob80<String> y = new ob80<>("TestTag", false, l.a);
    public static final ob80<Unit> z = new ob80<>("LinkTestMarker", false, h.a);
    public static final ob80<List<nk0>> A = new ob80<>("Text", true, m.a);
    public static final ob80<nk0> B = new ob80<>("TextSubstitution");
    public static final ob80<Boolean> C = new ob80<>("IsShowingTextSubstitution");
    public static final ob80<nk0> D = new ob80<>("InputText", 0);
    public static final ob80<nk0> E = new ob80<>("EditableText", 0);
    public static final ob80<ulf0> F = new ob80<>("TextSelectionRange", 0);
    public static final ob80<acn> G = new ob80<>("ImeAction", 0);
    public static final ob80<Boolean> H = new ob80<>("Selected", 0);
    public static final ob80<kzf0> I = new ob80<>("ToggleableState", 0);
    public static final ob80<Unit> J = new ob80<>("Password", 0);
    public static final ob80<String> K = new ob80<>("Error", 0);
    public static final ob80<Function1<Object, Integer>> L = new ob80<>("IndexForKey");
    public static final ob80<Boolean> M = new ob80<>("IsEditable");
    public static final ob80<Integer> N = new ob80<>("MaxTextLength");
    public static final ob80<qx80> O = new ob80<>("Shape", false, k.a);

    public static final class a extends qlr implements Function2<kza, kza, kza> {
        public static final a a = new a(2);

        @Override // kotlin.jvm.functions.Function2
        public final kza invoke(kza kzaVar, kza kzaVar2) {
            return kzaVar;
        }
    }

    public static final class b extends qlr implements Function2<List<? extends String>, List<? extends String>, List<? extends String>> {
        public static final b a = new b(2);

        @Override // kotlin.jvm.functions.Function2
        public final List<? extends String> invoke(List<? extends String> list, List<? extends String> list2) {
            List<? extends String> list3 = list;
            List<? extends String> list4 = list2;
            if (list3 == null) {
                return list4;
            }
            ArrayList arrayList = new ArrayList(list3);
            arrayList.addAll(list4);
            return arrayList;
        }
    }

    public static final class c extends qlr implements Function2<g0b, g0b, g0b> {
        public static final c a = new c(2);

        @Override // kotlin.jvm.functions.Function2
        public final g0b invoke(g0b g0bVar, g0b g0bVar2) {
            return g0bVar;
        }
    }

    public static final class d extends qlr implements Function2<Unit, Unit, Unit> {
        public static final d a = new d(2);

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Unit unit, Unit unit2) {
            return unit;
        }
    }

    public static final class e extends qlr implements Function2<Unit, Unit, Unit> {
        public static final e a = new e(2);

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Unit unit, Unit unit2) {
            return unit;
        }
    }

    public static final class f extends qlr implements Function2<Unit, Unit, Unit> {
        public static final f a = new f(2);

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Unit unit, Unit unit2) {
            throw new IllegalStateException("merge function called on unmergeable property IsDialog. A dialog should not be a child of a clickable/focusable node.");
        }
    }

    public static final class g extends qlr implements Function2<Unit, Unit, Unit> {
        public static final g a = new g(2);

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Unit unit, Unit unit2) {
            throw new IllegalStateException("merge function called on unmergeable property IsPopup. A popup should not be a child of a clickable/focusable node.");
        }
    }

    public static final class h extends qlr implements Function2<Unit, Unit, Unit> {
        public static final h a = new h(2);

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Unit unit, Unit unit2) {
            return unit;
        }
    }

    public static final class i extends qlr implements Function2<String, String, String> {
        public static final i a = new i(2);

        @Override // kotlin.jvm.functions.Function2
        public final String invoke(String str, String str2) {
            throw new IllegalStateException("merge function called on unmergeable property PaneTitle.");
        }
    }

    public static final class j extends qlr implements Function2<su50, su50, su50> {
        public static final j a = new j(2);

        @Override // kotlin.jvm.functions.Function2
        public final su50 invoke(su50 su50Var, su50 su50Var2) {
            su50 su50Var3 = su50Var;
            int i = su50Var2.a;
            return su50Var3;
        }
    }

    public static final class k extends qlr implements Function2<qx80, qx80, qx80> {
        public static final k a = new k(2);

        @Override // kotlin.jvm.functions.Function2
        public final qx80 invoke(qx80 qx80Var, qx80 qx80Var2) {
            return qx80Var;
        }
    }

    public static final class l extends qlr implements Function2<String, String, String> {
        public static final l a = new l(2);

        @Override // kotlin.jvm.functions.Function2
        public final String invoke(String str, String str2) {
            return str;
        }
    }

    public static final class m extends qlr implements Function2<List<? extends nk0>, List<? extends nk0>, List<? extends nk0>> {
        public static final m a = new m(2);

        @Override // kotlin.jvm.functions.Function2
        public final List<? extends nk0> invoke(List<? extends nk0> list, List<? extends nk0> list2) {
            List<? extends nk0> list3 = list;
            List<? extends nk0> list4 = list2;
            if (list3 == null) {
                return list4;
            }
            ArrayList arrayList = new ArrayList(list3);
            arrayList.addAll(list4);
            return arrayList;
        }
    }

    public static final class n extends qlr implements Function2<Float, Float, Float> {
        public static final n a = new n(2);

        @Override // kotlin.jvm.functions.Function2
        public final Float invoke(Float f, Float f2) {
            Float f3 = f;
            f2.floatValue();
            return f3;
        }
    }
}
