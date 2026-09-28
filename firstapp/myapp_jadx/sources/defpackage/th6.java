package defpackage;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class th6 implements Runnable {
    public final /* synthetic */ gi6 a;
    public final /* synthetic */ int b;
    public final /* synthetic */ xh6 c;

    public /* synthetic */ th6(gi6 gi6Var, int i, xh6 xh6Var) {
        this.a = gi6Var;
        this.b = i;
        this.c = xh6Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int bindingAdapterPosition = this.a.getBindingAdapterPosition();
        int i = this.b;
        if (bindingAdapterPosition == i) {
            xh6 xh6Var = this.c;
            if (i < xh6Var.getItemCount()) {
                xh6Var.notifyItemChanged(i);
            }
        }
    }
}
