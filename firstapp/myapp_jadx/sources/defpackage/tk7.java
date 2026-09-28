package defpackage;

import androidx.compose.runtime.a;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final class tk7 implements Function2<a, Integer, Unit> {
    public final /* synthetic */ d780 a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ op8 d;
    public final /* synthetic */ imf0 e;
    public final /* synthetic */ float f;
    public final /* synthetic */ tmz i;

    public tk7(d780 d780Var, boolean z, boolean z2, op8 op8Var, imf0 imf0Var, float f, tmz tmzVar) {
        this.a = d780Var;
        this.b = z;
        this.c = z2;
        this.d = op8Var;
        this.e = imf0Var;
        this.f = f;
        this.i = tmzVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(a aVar, Integer num) {
        long j;
        long j2;
        long j3;
        a aVar2 = aVar;
        int iIntValue = num.intValue();
        if (aVar2.q(iIntValue & 1, (iIntValue & 3) != 2)) {
            d780 d780Var = this.a;
            boolean z = this.b;
            boolean z2 = this.c;
            if (z) {
                j = !z2 ? d780Var.b : d780Var.k;
            } else {
                j = d780Var.f;
            }
            long j4 = j;
            if (z) {
                j2 = !z2 ? d780Var.c : d780Var.l;
            } else {
                j2 = d780Var.g;
            }
            if (z) {
                j3 = !z2 ? d780Var.d : d780Var.m;
            } else {
                j3 = d780Var.h;
            }
            uk7.a(this.d, this.e, j4, j2, j3, this.f, this.i, aVar2, 0);
        } else {
            aVar2.G();
        }
        return Unit.a;
    }
}
