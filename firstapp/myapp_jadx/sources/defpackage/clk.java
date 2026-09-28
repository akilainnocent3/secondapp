package defpackage;

/* JADX INFO: loaded from: classes4.dex */
public abstract class clk {
    public final s9s a;
    public boolean b;
    public boolean c;
    public final a d;

    public static final class a implements rdd {
        public a() {
        }

        @Override // defpackage.rdd
        public final void onStart(ibs ibsVar) {
            clk clkVar = clk.this;
            if (clkVar.b || !clkVar.c) {
                return;
            }
            clkVar.c = false;
            clkVar.a();
        }

        @Override // defpackage.rdd
        public final void onStop(ibs ibsVar) {
            clk clkVar = clk.this;
            if (clkVar.b) {
                return;
            }
            clkVar.c = true;
            clkVar.b();
        }
    }

    public clk(s9s s9sVar) {
        s9sVar.getClass();
        this.a = s9sVar;
        this.c = true;
        this.d = new a();
    }

    public abstract void a();

    public abstract void b();
}
