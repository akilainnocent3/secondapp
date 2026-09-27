package cv;

import dr.l1;
import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
public class z {
    @oy.l
    public static final <T extends Appendable> T a(@oy.l T t10, @oy.l CharSequence... value) throws IOException {
        kotlin.jvm.internal.m0.p(t10, "<this>");
        kotlin.jvm.internal.m0.p(value, "value");
        for (CharSequence charSequence : value) {
            t10.append(charSequence);
        }
        return t10;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static <T> void b(@oy.l Appendable appendable, T t10, @oy.m ds.l<? super T, ? extends CharSequence> lVar) {
        kotlin.jvm.internal.m0.p(appendable, "<this>");
        if (lVar != null) {
            appendable.append(lVar.invoke(t10));
            return;
        }
        if (t10 == 0 ? true : t10 instanceof CharSequence) {
            appendable.append((CharSequence) t10);
        } else if (t10 instanceof Character) {
            appendable.append(((Character) t10).charValue());
        } else {
            appendable.append(t10.toString());
        }
    }

    @l1(version = sc.k.f129877g)
    @ur.f
    public static final Appendable c(Appendable appendable) {
        kotlin.jvm.internal.m0.p(appendable, "<this>");
        return appendable.append('\n');
    }

    @l1(version = sc.k.f129877g)
    @ur.f
    public static final Appendable d(Appendable appendable, char c10) {
        kotlin.jvm.internal.m0.p(appendable, "<this>");
        return appendable.append(c10).append('\n');
    }

    @l1(version = sc.k.f129877g)
    @ur.f
    public static final Appendable e(Appendable appendable, CharSequence charSequence) {
        kotlin.jvm.internal.m0.p(appendable, "<this>");
        return appendable.append(charSequence).append('\n');
    }

    @oy.l
    @l1(version = sc.k.f129877g)
    public static final <T extends Appendable> T f(@oy.l T t10, @oy.l CharSequence value, int i10, int i11) {
        kotlin.jvm.internal.m0.p(t10, "<this>");
        kotlin.jvm.internal.m0.p(value, "value");
        T t11 = (T) t10.append(value, i10, i11);
        kotlin.jvm.internal.m0.n(t11, "null cannot be cast to non-null type T of kotlin.text.StringsKt__AppendableKt.appendRange");
        return t11;
    }
}
