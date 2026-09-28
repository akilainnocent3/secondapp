package defpackage;

import com.sportygames.commons.views.NavigationActivity;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class rx5 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ rx5(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                final qx5.e.a aVar = (qx5.e.a) obj;
                if (!aVar.b.getAndSet(true)) {
                    qx5.this.c.execute(new Runnable() { // from class: sx5
                        @Override // java.lang.Runnable
                        public final void run() {
                            qx5.e.a aVar2 = aVar;
                            qx5.f fVar = qx5.this.e;
                            qx5.f fVar2 = qx5.f.w;
                            qx5.e eVar = qx5.e.this;
                            if (fVar == fVar2) {
                                qx5.this.v("Camera onError timeout, reopen it.", null);
                                qx5.this.F(qx5.f.v);
                                qx5.this.w.b();
                            } else {
                                qx5.this.v("Camera skip reopen at state: " + qx5.this.e, null);
                            }
                        }
                    });
                    break;
                }
                break;
            default:
                int i2 = NavigationActivity.y;
                gd gdVar = (gd) ((NavigationActivity) obj).a;
                if (gdVar != null) {
                    gdVar.b.n(8388613);
                }
                break;
        }
    }
}
