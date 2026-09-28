package defpackage;

import androidx.compose.runtime.m;
import com.sportygames.wheelanddeal.model.dX.vZBMKENANSz;

/* JADX INFO: loaded from: classes.dex */
public final class byr implements j610, j610.a, fyr.a {
    public final Object a;
    public final fyr b;
    public int d;
    public j610.a e;
    public boolean f;
    public int c = -1;
    public final ytw g = m.b(null);

    public byr(Object obj, fyr fyrVar) {
        this.a = obj;
        this.b = fyrVar;
    }

    @Override // defpackage.j610
    public final byr a() {
        if (this.f) {
            zkn.c("Pin should not be called on an already disposed item ");
        }
        if (this.d == 0) {
            this.b.a.add(this);
            j610 j610Var = (j610) ((x5a0) this.g).getValue();
            this.e = j610Var != null ? j610Var.a() : null;
        }
        this.d++;
        return this;
    }

    @Override // fyr.a
    public final int getIndex() {
        return this.c;
    }

    @Override // fyr.a
    public final Object getKey() {
        return this.a;
    }

    @Override // j610.a
    public final void release() {
        if (this.f) {
            return;
        }
        if (this.d <= 0) {
            zkn.c(vZBMKENANSz.GYqmsTLy);
        }
        int i = this.d - 1;
        this.d = i;
        if (i == 0) {
            this.b.a.remove(this);
            j610.a aVar = this.e;
            if (aVar != null) {
                aVar.release();
            }
            this.e = null;
        }
    }
}
