package ok;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes4.dex */
public class a implements d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f119134a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d[] f119135b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final b f119136c;

    public a(int i10, d... dVarArr) {
        this.f119134a = i10;
        this.f119135b = dVarArr;
        this.f119136c = new b(i10);
    }

    @Override // ok.d
    public StackTraceElement[] a(StackTraceElement[] stackTraceElementArr) {
        if (stackTraceElementArr.length <= this.f119134a) {
            return stackTraceElementArr;
        }
        StackTraceElement[] stackTraceElementArrA = stackTraceElementArr;
        for (d dVar : this.f119135b) {
            if (stackTraceElementArrA.length <= this.f119134a) {
                break;
            }
            stackTraceElementArrA = dVar.a(stackTraceElementArr);
        }
        return stackTraceElementArrA.length > this.f119134a ? this.f119136c.a(stackTraceElementArrA) : stackTraceElementArrA;
    }
}
