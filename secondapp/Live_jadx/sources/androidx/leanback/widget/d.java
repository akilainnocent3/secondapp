package androidx.leanback.widget;

import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes.dex */
public class d {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final long f12365f = -1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f12366a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Drawable f12367b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public CharSequence f12368c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public CharSequence f12369d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public ArrayList<Integer> f12370e;

    public d(long j10) {
        this(j10, "");
    }

    public final void a(int i10) {
        this.f12370e.add(Integer.valueOf(i10));
    }

    public final Drawable b() {
        return this.f12367b;
    }

    public final long c() {
        return this.f12366a;
    }

    public final CharSequence d() {
        return this.f12368c;
    }

    public final CharSequence e() {
        return this.f12369d;
    }

    public final void f(int i10) {
        this.f12370e.remove(i10);
    }

    public final boolean g(int i10) {
        return this.f12370e.contains(Integer.valueOf(i10));
    }

    public final void h(Drawable drawable) {
        this.f12367b = drawable;
    }

    public final void i(long j10) {
        this.f12366a = j10;
    }

    public final void j(CharSequence charSequence) {
        this.f12368c = charSequence;
    }

    public final void k(CharSequence charSequence) {
        this.f12369d = charSequence;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        if (!TextUtils.isEmpty(this.f12368c)) {
            sb2.append(this.f12368c);
        }
        if (!TextUtils.isEmpty(this.f12369d)) {
            if (!TextUtils.isEmpty(this.f12368c)) {
                sb2.append(" ");
            }
            sb2.append(this.f12369d);
        }
        if (this.f12367b != null && sb2.length() == 0) {
            sb2.append("(action icon)");
        }
        return sb2.toString();
    }

    public d(long j10, CharSequence charSequence) {
        this(j10, charSequence, null);
    }

    public d(long j10, CharSequence charSequence, CharSequence charSequence2) {
        this(j10, charSequence, charSequence2, null);
    }

    public d(long j10, CharSequence charSequence, CharSequence charSequence2, Drawable drawable) {
        this.f12366a = -1L;
        this.f12370e = new ArrayList<>();
        i(j10);
        j(charSequence);
        k(charSequence2);
        h(drawable);
    }
}
