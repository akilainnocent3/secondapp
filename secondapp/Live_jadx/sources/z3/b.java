package z3;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes.dex */
public class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f160293a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f160294b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f160295c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public CharSequence[] f160296d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f160297e;

    public int a() {
        return (this.f160295c - this.f160294b) + 1;
    }

    public int b() {
        return this.f160293a;
    }

    public CharSequence c(int i10) {
        CharSequence[] charSequenceArr = this.f160296d;
        return charSequenceArr == null ? String.format(this.f160297e, Integer.valueOf(i10)) : charSequenceArr[i10];
    }

    public String d() {
        return this.f160297e;
    }

    public int e() {
        return this.f160295c;
    }

    public int f() {
        return this.f160294b;
    }

    public CharSequence[] g() {
        return this.f160296d;
    }

    public void h(int i10) {
        this.f160293a = i10;
    }

    public void i(String str) {
        this.f160297e = str;
    }

    public void j(int i10) {
        this.f160295c = i10;
    }

    public void k(int i10) {
        this.f160294b = i10;
    }

    public void l(CharSequence[] charSequenceArr) {
        this.f160296d = charSequenceArr;
    }
}
