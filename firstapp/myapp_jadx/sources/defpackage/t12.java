package defpackage;

import java.util.ArrayDeque;

/* JADX INFO: loaded from: classes.dex */
public abstract class t12 {
    public Object b;

    public t12(int i) {
        switch (i) {
            case 2:
                break;
            default:
                this.b = new ArrayDeque(20);
                break;
        }
    }

    public void a(s120 s120Var) {
        ArrayDeque arrayDeque = (ArrayDeque) this.b;
        if (arrayDeque.size() < 20) {
            arrayDeque.offer(s120Var);
        }
    }

    public abstract tx90 d(ckh ckhVar);
}
