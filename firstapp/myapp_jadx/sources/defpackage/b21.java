package defpackage;

/* JADX INFO: loaded from: classes8.dex */
public abstract class b21 {
    public final /* synthetic */ int a = 1;
    public Object b;

    public b21(String str) {
        if (str != null) {
            this.b = str;
        } else {
            hb5.a("name cannot be null.");
            throw null;
        }
    }

    public abstract void e(v6s v6sVar, String str);

    public void f(v6s v6sVar, String str) {
        if (((v6s) this.b).compareTo(v6sVar) <= 0) {
            e(v6sVar, str);
        }
    }

    public String toString() {
        switch (this.a) {
            case 0:
                return (String) this.b;
            default:
                return super.toString();
        }
    }

    public /* synthetic */ b21() {
    }
}
