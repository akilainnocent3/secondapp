package yads;

import android.text.Layout;
import android.text.SpannableStringBuilder;
import java.util.Comparator;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class jt {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Comparator f151239c = new Comparator() { // from class: yads.c34
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return Integer.compare(((jt) obj2).f151241b, ((jt) obj).f151241b);
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final o20 f151240a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f151241b;

    public jt(SpannableStringBuilder spannableStringBuilder, Layout.Alignment alignment, float f10, int i10, float f11, int i11, boolean z10, int i12, int i13) {
        n20 n20VarB = new n20().a(spannableStringBuilder).a(alignment).a(f10).a(i10).b(f11).b(i11).b();
        if (z10) {
            n20VarB.c(i12);
        }
        this.f151240a = n20VarB.a();
        this.f151241b = i13;
    }
}
